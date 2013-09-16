package servlets;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

import org.apache.log4j.Logger;


/**
 * Created with IntelliJ IDEA.
 * User: vortax
 * Date: 14.09.13
 * Time: 14:21
 */


class Main extends HttpServlet {

    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

        Logger log = (Logger)getServletContext().getAttribute("log4");
        log.info("Enter to Main.java");

        String firstValue = "Please enter the first value";
        String secondValue;
        String operator;
        double firstValueD;
        double secondValueD;
        response.setContentType("text/html");
        try {
            log.info("Conneced from IP " + request.getRemoteHost());
            log.info("Locale is " + request.getLocale());

            firstValue = request.getParameter("firstValue");
            firstValue = firstValue.replace(",", ".");
            firstValueD = Double.parseDouble(firstValue);

            operator = request.getParameter("operator");

            secondValue = request.getParameter("secondValue");
            if (secondValue.isEmpty() && (operator.equals("SQUARE_ROOT"))) {
                secondValueD = -1;
            } else {
                secondValue = secondValue.replace(",", ".");
                secondValueD = Double.parseDouble(secondValue);
            }

            String result = OperationPool.calculation(firstValueD, operator, secondValueD);

            request.setAttribute("textResult", result);
            log.info("Calculating " + result);
        } catch (NumberFormatException e) {
            request.setAttribute("textResult", "Please enter the second value");
            request.setAttribute("textFirstValue", firstValue);
            log.error("error", e);
        } finally {
            log.info("End");
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);


    }
}