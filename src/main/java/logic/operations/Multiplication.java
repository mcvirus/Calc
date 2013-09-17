package logic.operations;


import logic.OutFormat;
import org.apache.log4j.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: vortax
 * Date: 16.09.13
 * Time: 23:51
 */
public class Multiplication implements Operation {

    private static final Logger LOG = Logger.getLogger(Multiplication.class);

    @Override
    public String calc(double firstValue, double secondValue) {

        LOG.info("Multiplication started");

        double result = firstValue * secondValue;
        return OutFormat.format(firstValue) + " * " + OutFormat.format(secondValue) + " = " + OutFormat.format(result);
    }
}
