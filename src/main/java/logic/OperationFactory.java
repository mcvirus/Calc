package logic;

import logic.operations.*;
import org.apache.log4j.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: vortax
 * Date: 15.09.13
 * Time: 11:41
 */


public class OperationFactory {

    private static final Logger LOG = Logger.getLogger(OperationFactory.class);

    public static Operation create(String operator) {

        LOG.info("Start calculating");

        if (operator.equals("ADDITION")) {
            return new Addition();
        }
        if (operator.equals("SUBSTRACTION")) {
            return new Substraction();
        }
        if (operator.equals("MULTIPLICATION")) {
            return new Multiplication();
        }
        if (operator.equals("DIVISION")) {
            return new Division();
        }
        if (operator.equals("SQUARE_ROOT")) {
            return new SquareRoot();
        }
        return null;
    }
}