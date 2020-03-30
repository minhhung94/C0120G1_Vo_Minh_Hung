package TongQuanUngDungWeb.BaiTap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ChietKhau" ,urlPatterns = "/display-discount")
public class ChietKhau extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product = new String(request.getParameter("product"));
        float gia = Float.parseFloat(request.getParameter("gia"));
        float tyle = Float.parseFloat(request.getParameter("tyle"));

        float DM = gia*tyle;
        float DM1 = DM/100;
        PrintWriter writer = response.getWriter();
        writer.println("<h1>Product Description: " + product+ "</h1>");
        writer.println("<h1>List Price: " + gia+ "</h1>");
        writer.println("<h1>PDiscount Percent: " + tyle+ "</h1>");
        writer.println("<h1>Discount Amount: " +DM1+ "</h1>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
