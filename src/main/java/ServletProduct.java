import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletProduct", value = "/ServletProduct")
public class ServletProduct extends HttpServlet {
    @Override

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String action = request.getParameter("action");
if (action!= null && action.equals("result")){
    float discount = Float.parseFloat(request.getParameter("discount"));
    request.setAttribute("discount",discount);
    request.getRequestDispatcher("view/displayResult.jsp").forward(request,response);
} else {
    request.getRequestDispatcher("view/displayProduct.jsp");

}

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
float price = Float.parseFloat(request.getParameter("price"));
int percent = Integer.parseInt(request.getParameter("percent"));
float discount = price * percent;
request.setAttribute("discount",discount);
request.getRequestDispatcher("view/displayProduct.jsp").forward(request,response);
    }
}
