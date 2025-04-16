import org.example.ATM;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class TestATM {
    @Test
    void getMoneyCorrect() {
        ATM atm = new ATM(Map.of(
                50, 2,
                100, 3,
                500, 4,
                1000, 2,
                5000, 1
        ));
        var result = atm.getMoney(7000);
        Assertions.assertEquals(result, Map.of(
                5000, 1,
                1000, 2));
    }

    @Test
    void getMoneyWhenNotEnoughMoney() {
        ATM atm = new ATM(Map.of(
                50, 2,
                100, 3,
                500, 4,
                1000, 2,
                5000, 1
        ));
        Assertions.assertThrows(IllegalStateException.class, () -> atm.getMoney(700000));
    }

    @Test
    void getMoneyWhenNotNominal() {
        ATM atm = new ATM(Map.of(
                50, 2,
                100, 3,
                500, 4,
                1000, 2,
                5000, 1
        ));
        Assertions.assertThrows(IllegalStateException.class, () -> atm.getMoney(101));
    }
}
