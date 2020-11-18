import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountCalculator",urlPatterns = "/display-discount")
public class ProductDiscountCalculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product = new String(request.getParameter("product"));
        float gia = Float.parseFloat(request.getParameter("gia"));
        int tyle = Integer.parseInt(request.getParameter("tyle"));

        float DM = (gia*tyle)/100;

        PrintWriter writer = response.getWriter();
        writer.println("<h1>Product Description: " + product+ "</h1>");
        writer.println("<h1>List Price: " + gia+ "</h1>");
        writer.println("<h1>PDiscount Percent: " + tyle+ "</h1>");
        writer.println("<h1>Discount Amount: " +DM+ "</h1>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
