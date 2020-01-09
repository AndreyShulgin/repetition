package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class FunctionCalculation {

    List<Double> diapason(int start, int end, Function<Double, Double> func) {
        ArrayList<Double> result = new ArrayList<>();
        for (double index = start; index < end; index++) {
            result.add(func.apply(index));
        }
        return result;
    }

}
