package servlets;

/**
 * Created with IntelliJ IDEA.
 * User: vortax
 * Date: 16.09.13
 * Time: 23:32
 */
class Addition extends OutFormat {

    public static String calc(double firstValue, double secondValue) {

        log.info("Addition started");

        double result = firstValue + secondValue;
        return OutFormat.format(firstValue) + " + " + format(secondValue) + " = " + format(result);
    }
}
