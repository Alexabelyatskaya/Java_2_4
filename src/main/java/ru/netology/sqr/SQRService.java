package ru.netology.sqr;

public class SQRService {
    public int calculate(int lowerBound, int upperBound) {
        int counter = 0;
        for (int i = 10; i < 100; i++) {
            int squaring = i * i;
            if (squaring >= lowerBound && squaring <= upperBound) {
                counter += 1;
            }
        }
        return counter;
    }
}