package servlets;

/**
 * Created with IntelliJ IDEA.
 * User: vortax
 * Date: 17.09.13
 * Time: 0:01
 */
class SquareRoot extends OutFormat {

    public static String calc(double firstValue, double secondValue) {

        log.info("Square root calculation started");

        if (firstValue >= 0) {
            double result = Math.sqrt(firstValue);
            return "The square root of " + format(firstValue) + " is " + format(result);
        } else {
            return "Calculation error: " + format(firstValue) + " > 0";
        }

    }
}
