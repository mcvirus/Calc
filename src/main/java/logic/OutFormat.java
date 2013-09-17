package logic;

import java.text.NumberFormat;

/**
 * Created with IntelliJ IDEA.
 * User: vortax
 * Date: 16.09.13
 * Time: 23:40
 */
 public class OutFormat {
   public static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger("OperationFactory.class");

    public static final String format(double value) {
        return NumberFormat.getInstance().format(value);
    }


}
