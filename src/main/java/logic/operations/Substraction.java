package logic.operations;

import logic.OutFormat;
import org.apache.log4j.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: vortax
 * Date: 16.09.13
 * Time: 23:47
 */
public class Substraction {

    private static final Logger LOG = Logger.getLogger(Substraction.class);

    public static String calc(double firstValue, double secondValue){

        LOG.info("Substraction started");

        double result = firstValue - secondValue ;
        return OutFormat.format(firstValue) + " - " + OutFormat.format(secondValue) + " = " + OutFormat.format(result);
    }
}
