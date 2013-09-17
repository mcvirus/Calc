package logic.operations;


import logic.OutFormat;
import org.apache.log4j.Logger;

public class Addition implements Operation {

    private static final Logger LOG = Logger.getLogger(Addition.class);

    @Override
    public String calc(double firstValue, double secondValue) {

        LOG.info("Addition started");
        double result = firstValue + secondValue;
        return OutFormat.format(firstValue) + " + " + OutFormat.format(secondValue) + " = " + OutFormat.format(result);

    }
}
