package logic.operations;

import logic.OutFormat;

/**
 * Created with IntelliJ IDEA.
 * User: vortax
 * Date: 17.09.13
 * Time: 0:01
 */
public class SquareRoot {

    public static String calc(double firstValue, double secondValue) {

        OutFormat.log.info("Square root calculation started");

        if (firstValue >= 0) {
            double result = Math.sqrt(firstValue);
            return "The square root of " + OutFormat.format(firstValue) + " is " + OutFormat.format(result);
        } else {
            return "Calculation error: " + OutFormat.format(firstValue) + " > 0";
        }

    }
}
