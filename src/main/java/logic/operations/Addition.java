package logic.operations;


import logic.OutFormat;

/**
 * Created with IntelliJ IDEA.
 * User: vortax
 * Date: 16.09.13
 * Time: 23:32
 */
public class Addition {

    public static String calc(double firstValue, double secondValue) {

        OutFormat.log.info("Addition started");

        double result = firstValue + secondValue;
        return OutFormat.format(firstValue) + " + " +OutFormat.format(secondValue) + " = " + OutFormat.format(result);
    }
}
