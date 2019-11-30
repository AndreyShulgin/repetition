package ru.job4j.condition;

public class SqMax {
    public static int max(int first, int second, int third, int forth) {
        int result = forth;

        if (third > forth) {
            result = third;
        }

        if (second > third) {
            if (second > forth) {
                result = second;
            }
        }

        if (first > second) {
            if (first > third) {
                if (first > forth) {
                    result = first;
                }
            }
        }

        return result;
    }
}