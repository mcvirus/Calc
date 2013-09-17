package logic.operations;

import logic.OutFormat;

/**
 * Created with IntelliJ IDEA.
 * User: vortax
 * Date: 16.09.13
 * Time: 23:53
 */
public class Division {

    public static String calc(double firstValue, double secondValue) {

        OutFormat.log.info("Division started");

        double result;
        try {
            result = firstValue / secondValue;
        } catch (ArithmeticException e) {
            OutFormat.log.error("Division by zero", e);
            return "Division by zero";
        }

        return OutFormat.format(firstValue) + " / " + OutFormat.format(secondValue) + " = " + OutFormat.format(result);
    }
}
