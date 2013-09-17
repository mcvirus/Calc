package logic;

import org.apache.log4j.Logger;

import java.text.NumberFormat;

/**
 * Created with IntelliJ IDEA.
 * User: vortax
 * Date: 16.09.13
 * Time: 23:40
 */
public class OutFormat {
    private static final Logger LOG = Logger.getLogger(OutFormat.class);

    public static final String format(double value) {
        return NumberFormat.getInstance().format(value);
    }


}
