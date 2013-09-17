package logic.operations;


import logic.OutFormat;

/**
 * Created with IntelliJ IDEA.
 * User: vortax
 * Date: 16.09.13
 * Time: 23:51
 */
public class Multiplication  {

    public static String calc(double firstValue, double secondValue) {

        OutFormat.log.info("Multiplication started");

        double result = firstValue * secondValue;
        return OutFormat.format(firstValue) + " * " + OutFormat.format(secondValue) + " = " + OutFormat.format(result);
    }
}
