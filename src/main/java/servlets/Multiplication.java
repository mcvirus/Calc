package servlets;

/**
 * Created with IntelliJ IDEA.
 * User: vortax
 * Date: 16.09.13
 * Time: 23:51
 */
class Multiplication extends OutFormat {

    public static String calc(double firstValue, double secondValue) {

        log.info("Multiplication started");

        double result = firstValue * secondValue;
        return OutFormat.format(firstValue) + " * " + format(secondValue) + " = " + format(result);
    }
}
