import org.example.ATM;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;


public class TestATM {
    ATM atm;
    @BeforeEach
    void setUp() {
        atm = new ATM(Map.of(
                "Рубль", Map.of(
                        50, 2,
                        100, 3,
                        500, 4,
                        1000, 2,
                        5000, 1),
                "$", Map.of(
                        5, 2,
                        10, 3,
                        50, 4,
                        100, 2,
                        500, 1)

        ));
    }

    @Test
    void getMoneyCorrectRubles() {
        var result = atm.getMoney("Рубль", 7000);
        Assertions.assertEquals(result, Map.of(
                5000, 1,
                1000, 2));
    }

    @Test
    void getMoneyCorrectDollars() {
        var result = atm.getMoney("$", 765);
        Assertions.assertEquals(result, Map.of(
                500, 1,
                100, 2,
                50, 1,
                10, 1,
                5, 1));
    }

    @Test
    void getMoneyCorrectDollarsSeveralTimesWhenNotEnoughMoney() {
        var result = atm.getMoney("$", 765);
        Assertions.assertEquals(result, Map.of(
                500, 1,
                100, 2,
                50, 1,
                10, 1,
                5, 1));

        Assertions.assertThrows(IllegalStateException.class, () -> atm.getMoney("$", 765));
    }

    @Test
    void getMoneyCorrectDollarsSeveralTimesWhenEnoughMoney() {
        var result = atm.getMoney("$", 765);
        Assertions.assertEquals(result, Map.of(
                500, 1,
                100, 2,
                50, 1,
                10, 1,
                5, 1)); //

        result = atm.getMoney("$", 105);
        Assertions.assertEquals(result, Map.of(
                50, 2,
                5, 1));
    }

    @Test
    void getMoneyWhenNotEnoughMoney() {
        Assertions.assertThrows(IllegalStateException.class, () -> atm.getMoney("$", 700000));
    }

    @Test
    void getMoneyWhenNotNominal() {
        Assertions.assertThrows(IllegalStateException.class, () -> atm.getMoney("Рубль", 101));
    }
}
