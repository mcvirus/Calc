package servlets;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

import logic.OperationFactory;
import org.apache.log4j.Logger;

public class Main extends HttpServlet {
    private static final Logger LOG = Logger.getLogger(Main.class);

    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

        LOG.debug("Enter to Main.java");

        String firstValue = "Please enter the first value";
        String secondValue;
        String operator;
        double firstValueD;
        double secondValueD;

        try {
            LOG.debug("Conneced from IP " + request.getRemoteHost());
            LOG.debug("Locale is " + request.getLocale());

            firstValue = request.getParameter("firstValue").replace(",", ".");
            firstValueD = Double.parseDouble(firstValue);

            operator = request.getParameter("operator");

            secondValue = request.getParameter("secondValue");
            if (secondValue.isEmpty() && (operator.equals("SQUARE_ROOT"))) {
                secondValueD = -1;
            } else {
                secondValue = secondValue.replace(",", ".");
                secondValueD = Double.parseDouble(secondValue);
            }

            String result = OperationFactory.create(operator).calc(firstValueD, secondValueD);
            request.setAttribute("textResult", result);
            response.setContentType("text/html");
            LOG.debug("Calculating " + result);
        } catch (NumberFormatException e) {
            request.setAttribute("textResult", "Please enter the second value");
            request.setAttribute("textFirstValue", firstValue);
            LOG.error("error", e);
        } finally {
            LOG.debug("Exit from Main.service()");
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
    }
}