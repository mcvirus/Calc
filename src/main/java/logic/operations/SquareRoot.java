package logic.operations;

import logic.OutFormat;
import org.apache.log4j.Logger;

public class SquareRoot implements Operation {

    private static final Logger LOG = Logger.getLogger(SquareRoot.class);

    @Override
    public String calc(double firstValue, double secondValue) {

        LOG.debug("Square root calculation started");

        if (firstValue >= 0) {
            double result = Math.sqrt(firstValue);
            return "The square root of " + OutFormat.format(firstValue) + " is " + OutFormat.format(result);
        } else {
            return "Calculation error: " + OutFormat.format(firstValue) + " > 0";
        }

    }
}
