package logic.operations;

import logic.OutFormat;
import org.apache.log4j.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: vortax
 * Date: 16.09.13
 * Time: 23:53
 */
public class Division {

    private static final Logger LOG = Logger.getLogger(Division.class);

    public static String calc(double firstValue, double secondValue) {

        LOG.info("Division started");

        double result;
        try {
            result = firstValue / secondValue;
        } catch (ArithmeticException e) {
            LOG.error("Division by zero", e);
            return "Division by zero";
        }

        return OutFormat.format(firstValue) + " / " + OutFormat.format(secondValue) + " = " + OutFormat.format(result);
    }
}
