import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

class Servlet extends HttpServlet {
    void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String title = "Computer Game";
        String docType = "<!DOCTYPE HTML\n";

        int num = (int) (0 + (Math.random() * 100));
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"pink\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n"+
                "<form aligne=\"center\" action=\"Servlet\" method=\"post\">" +
                "<input type=\"number\" name=\"no\"></br>" +
                "<input type=\"submit\" value=\"START\" name=\"submit\">" +
                "</form>" +
                "</body>" +
                "</html>");
        String g_no;

        if (request.getParameter("submit") != null) {
            g_no = request.getParameter("no");
            int Num= Integer.parseInt(g_no.trim());

            if (Num==num){
                out.println("You win");
            }else if (num<Num){
                out.println("Your number is too high");
            }else{
                out.println("Your number is too low");
            }

        }else{
            g_no = request.getParameter("no");
        }
        out.println("Predict "+g_no+"</br>");
        out.println("Pc no"+ num +"</br>");

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);

    }
}

