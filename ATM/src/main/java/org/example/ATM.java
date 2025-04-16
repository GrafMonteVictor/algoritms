package org.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Банкомат.
 * Инициализируется набором купюр и умеет выдавать купюры для заданной суммы, либо отвечать отказом.
 * При выдаче купюры списываются с баланса банкомата.
 * Допустимые номиналы: 50₽, 100₽, 500₽, 1000₽, 5000₽.
 *
 * Другие валюты и номиналы должны легко добавляться разработчиками в будущем.
 * Многопоточные сценарии могут быть добавлены позже (например резервирование).
*/
public class ATM {


    private final Map<Integer, Integer> atsmState;
    private final List<Integer> banknotes;

    public ATM(Map<Integer, Integer> atmState) {
        this.atmState = new HashMap<>(atmState);
        this.banknotes = atmState.keySet().stream()
                .sorted(Comparator.reverseOrder()).toList();
    }

    public Map<Integer, Integer> getMoney(int money) {
        if (money <= 0 ) { //if not correct amount of money
            throw new IllegalStateException("ATM didn`t send money");
        }
        Map <Integer, Integer> wallet = new HashMap<>();
        for (Integer banknote : banknotes) {
            int countBanknotes = Math.min(atmState.get(banknote), money / banknote);
            if (countBanknotes == 0) {
                continue;
            }
            wallet.put(banknote, countBanknotes);
            money -= countBanknotes * banknote;
            if (money == 0) {
                break;
            }
        }
        if (money > 0) { //if not enough money in ATM
            throw new IllegalStateException("ATM didn`t send money");
        }
        for (var entry: wallet.entrySet()) {
            atmState.put(entry.getKey(), atmState.get(entry.getKey()) - entry.getValue());
        }
        return wallet;
    }






}
