package br.com.is.http.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import br.com.is.http.server.annotation.Context;
import br.com.is.http.server.annotation.GET;

@Context(acceptEncode = true, tempDirectory = "/tmp", urlPattern="/ctx.html")
class Ctx
{
  @GET
  public void get(HTTPRequest req, HTTPResponse resp) {
  }
}
public class Test {
  public static void main(String... args) throws InterruptedException, IOException {
    LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME).setLevel(Level.FINE); 

    HTTPServer server = new HTTPServer(new InetSocketAddress("localhost", 9999), 10, "/Users/leonardobispodeoliveira");//, new File("src/test/resources/testkeys"), "password");

    //server.addContext("/", new HTTPStaticContext("/Users/leonardobispodeoliveira"));
/*    
    server.addContext("/test.html", new HTTPContext() {

      @Override
      public void doGet(HTTPRequest req, HTTPResponse resp) {
        Scanner s = null;
        try {
          s = new Scanner(new File("src/test/resources/lorem.txt")).useDelimiter("\\Z");
        }
        catch (FileNotFoundException e1) {
          e1.printStackTrace();
        }
        s.close();
        //resp.sendRedirect("http://www.google.com.br");
        HTTPSession session = req.getSession();
        PrintWriter ou = resp.getWriter();

        session.setAttribute("Teste", "Test");
        ou.println("<html>");
        ou.println("<body>");
        ou.println("<img src='my_test.png' />");        
        ou.println("</body>");
        ou.println("</html>");
      }
    });
*/
    
    
    
    server.run();
  }
}
