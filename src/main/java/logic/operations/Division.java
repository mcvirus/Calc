package logic.operations;

import logic.OutFormat;
import org.apache.log4j.Logger;


public class Division implements Operation {

    private static final Logger LOG = Logger.getLogger(Division.class);

    @Override
    public String calc(double firstValue, double secondValue) {

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
