import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletDemo5 extends HttpServlet {
    // 返回一个 404 页面

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 得到一个 Tomcat 内置的错误页面.
        resp.sendError(404, "页面没找到");
    }
}
