package logic;

import logic.operations.*;

/**
 * Created with IntelliJ IDEA.
 * User: vortax
 * Date: 15.09.13
 * Time: 11:41
 */


public class OperationFactory {

    static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(OperationFactory.class);

    public static String calculation(double firstValue, String operator, double secondValue) {

        log.info("Start calculating");

        if (operator.equals("ADDITION")) {
          return Addition.calc(firstValue, secondValue);
        }
        if (operator.equals("SUBSTRACTION")) {
            return Substraction.calc(firstValue, secondValue);
        }
        if (operator.equals("MULTIPLICATION")) {
            return Multiplication.calc(firstValue, secondValue);
        }
        if (operator.equals("DIVISION")) {
            return Division.calc(firstValue, secondValue);
        }
        if (operator.equals("SQUARE_ROOT")) {
            return SquareRoot.calc(firstValue, secondValue);
        }
        return null;
    }
}