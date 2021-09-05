package ru.netology.syndrome;

public class SyndromeService {
    public long findMax(long[] incomesInBillions) {
//        long sumIncomes = sum(incomesInBillions); ADD CODE FOR CHECK SPOTBUGS PLUG_IN
        long current_max_index = 0;
        long current_max = incomesInBillions[0];
        for (long incomesInBillion : incomesInBillions) {
            if (current_max < incomesInBillion) {
                current_max = incomesInBillion;
            }
        }
        return current_max;
    }

// ADD CODE FOR CHECK SPOTBUGS PLUG_IN
//    private long sum(long[] incomesInBillions) {
//        long sumIncomes = 0;
//        for (long incomesInBillion : incomesInBillions) {
//            sumIncomes = sumIncomes + incomesInBillion;
//        }
//        return sumIncomes;
//    }
}
