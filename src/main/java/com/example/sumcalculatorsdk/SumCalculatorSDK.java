package com.example.sumcalculatorsdk;

public class SumCalculatorSDK {
    public static int calculateSum(int num1, int num2) {
        return SumCalculator.calculateSum(num1, num2);
    }


    private static class SumCalculator {
        private static int calculateSum(int num1, int num2) {
            // Actual implementation logic
            return num1 + num2;
        }
    }
}