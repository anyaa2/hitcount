package servlet;
import ejb.CountServletHitsBean;
import java.io.*;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet(name = "ServletClient", urlPatterns = {"/ServletClient"})
public class ServletClient extends HttpServlet {
@EJB CountServletHitsBean obj;
@Override
protected void service (HttpServletRequest req, HttpServletResponse res) throws ServletException,
IOException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.print("<b>Number of times this Servlet is accessed </b>: "+obj.getCount());
}
}