import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

public class ServletDemo8 extends HttpServlet {
    // 通过读取请求, 获取到浏览器发来的 Cookie 内容

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        // 用数组获取全部 Cookie
        resp.setContentType("text/html; charset=utf-8");
        Writer writer = resp.getWriter();
        writer.write("<html>");
        for (Cookie cookie : cookies) {
            // 遍历获取到的 Cookie(键值对)
            writer.write(cookie.getName() + ":" + cookie.getValue());
            writer.write("<br/>");
        }
        writer.write("</html>");
    }
}
