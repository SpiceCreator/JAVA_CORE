package servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CustomServlet", urlPatterns = "/servlet")
public class ServletImpl extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String message = "Hello World. I'm a simple Servlet";
        resp.setStatus(HttpServletResponse.SC_OK);
        resp.getWriter().write(message);
        resp.getWriter().flush();
    }
}
