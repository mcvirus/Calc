package servlets;




import java.text.NumberFormat;
import org.apache.log4j.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: vortax
 * Date: 15.09.13
 * Time: 11:41

 */



public class Calc {

    public static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger("Calc.class");

    private static String format(double value) {
        return NumberFormat.getInstance().format(value);
    }

    public static String calculation(double firstValue, String operator, double secondValue) {

        log.debug("Start calculating");

        double result;

        if (operator.equals("ADDITION")){
           result = (firstValue + secondValue);
          return format(firstValue) + " + " + format(secondValue) + " = " + format(result);
      }
        if (operator.equals("SUBSTRACTION")){
             result = (firstValue - secondValue);
            return format(firstValue) + " - " + format(secondValue) + " = " + format(result);
        }
        if (operator.equals("MULTIPLICATION")){
             result = (firstValue * secondValue);
            return format(firstValue) + " + " + format(secondValue) + " = " + format(result);
        }
         try{
        if (operator.equals("DIVISION")){
             result = (firstValue / secondValue);
            return format(firstValue) + " / " + format(secondValue) + " = " + format(result);
        }
         } catch (ArithmeticException e){
             log.error("Division by zero", e);
             return "Division by zero";
         }
        if (operator.equals("SQUARE_ROOT")){
            if (firstValue >= 0){
             result = Math.sqrt(firstValue);
             return "The square root of " + format(firstValue) + " is " + format(result);
            } else {
                return "Calculation error "+ firstValue + " > 0";
            }

        }
        return null;

    }

}