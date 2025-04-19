package org.example.atm;

import java.util.*;

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


    private final Map<String, Map<Integer, Integer>> atmState;
//    private final List<Integer> banknotes;

    public ATM(Map<String, Map<Integer, Integer>> atmState) {
        this.atmState = new HashMap<>(atmState);
//        this.banknotes = atmState.keySet().stream()
//                .sorted(Comparator.reverseOrder()).toList();
        //отсортировать купюры сразу или потом? - потом
    }

    public Map<Integer, Integer> getMoney(String currency, int money) {
        if (money <= 0) { //if not correct amount of money
            throw new IllegalStateException("ATM didn`t send money");
        }
        if (!atmState.containsKey(currency)) {
            throw new IllegalStateException("ATM didn`t send money");
        }
        //выделяем валюту
        Map<Integer, Integer> wallet = new HashMap<>();
        List<Integer> banknotes = new ArrayList<>();
        Map<Integer, Integer> subStateAtm = new HashMap<>();
        for (var entry : atmState.entrySet()) {
            if (entry.getKey().equals(currency)) {
                banknotes = entry.getValue().keySet().stream().sorted(Comparator.reverseOrder()).toList(); //getListBanknotes
                subStateAtm = new HashMap<>(entry.getValue());
                break;
            }
        }
        //обновляем состояние кошеля, подсостояние банкомата
        for (Integer banknote : banknotes) {
            int countBanknotes = Math.min(subStateAtm.get(banknote), money / banknote);
            if (countBanknotes == 0) {
                continue;
            }
            wallet.put(banknote, countBanknotes);
            subStateAtm.put(banknote, subStateAtm.get(banknote) - countBanknotes);
            money -= countBanknotes * banknote;
            if (money == 0) {
                break;
            }
        }
        if (money > 0) { //if not enough money in ATM
            throw new IllegalStateException("ATM didn`t send money");
        }
        //обновляем состояние банкомата
        for (var entry : wallet.entrySet()) {
//            atmState.put(entry.getKey(), atmState.get(entry.getKey()) - entry.getValue());
            atmState.put(currency, subStateAtm); //вычесть из мапы state мапу wallet
        }
        return wallet;
    }
}
