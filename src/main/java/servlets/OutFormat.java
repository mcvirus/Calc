package servlets;

import java.text.NumberFormat;

/**
 * Created with IntelliJ IDEA.
 * User: vortax
 * Date: 16.09.13
 * Time: 23:40
 */
 class OutFormat {
    protected static String format(double value) {
        return NumberFormat.getInstance().format(value);
    }
    public static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger("OperationPool.class");

}
