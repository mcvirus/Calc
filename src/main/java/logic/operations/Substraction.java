package logic.operations;

import logic.OutFormat;

/**
 * Created with IntelliJ IDEA.
 * User: vortax
 * Date: 16.09.13
 * Time: 23:47
 */
public class Substraction {

    public static String calc(double firstValue, double secondValue){

        OutFormat.log.info("Substraction started");

        double result = firstValue - secondValue ;
        return OutFormat.format(firstValue) + " - " + OutFormat.format(secondValue) + " = " + OutFormat.format(result);
    }
}
