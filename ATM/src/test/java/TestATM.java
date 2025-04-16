import org.example.ATM;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class TestATM {
    public ATM atm;
    @BeforeEach
    void setUp() {
        this.atm = new ATM(Map.of(
                50, 2,
                100, 3,
                500, 4,
                1000, 2,
                5000, 1
        ));
    }
//    @Test
//    String s = mock(String.class);
    @Test
    void getMoneyCorrect() {
        var result = atm.getMoney(7000);
        Assertions.assertEquals(result, Map.of(
                5000, 1,
                1000, 2));
    }

    @Test
    void getMoneyWhenNotEnoughMoney() {
        var result = atm.getMoney(700000);
        Assertions.assertEquals(result, Map.of());
    }

    @Test
    void getMoneyWhenNotNominal() {
        var result = atm.getMoney(101);
        Assertions.assertEquals(result, Map.of());
    }
}
