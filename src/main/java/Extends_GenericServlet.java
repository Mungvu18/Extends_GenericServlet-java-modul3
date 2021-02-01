import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Extends_GenericServlet extends GenericServlet{
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html");
        PrintWriter out = servletResponse.getWriter();
        out.println("");
        out.println("hello generic servlet");
        out.println("");
    }
}
