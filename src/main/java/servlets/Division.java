package servlets;

/**
 * Created with IntelliJ IDEA.
 * User: vortax
 * Date: 16.09.13
 * Time: 23:53
 */
class Division extends OutFormat {

    public static String calc(double firstValue, double secondValue) {

        log.info("Division started");

        double result;
        try {
            result = firstValue / secondValue;
        } catch (ArithmeticException e) {
            log.error("Division by zero", e);
            return "Division by zero";
        }

        return OutFormat.format(firstValue) + " / " + format(secondValue) + " = " + format(result);
    }
}
