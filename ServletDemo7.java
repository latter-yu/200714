import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletDemo7 extends HttpServlet {
    // 演示浏览器给服务器写回 Cookie
    // Cookies 是存储在客户端计算机上的文本文件，并保留了用户的各种跟踪信息

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 先构造 Cookie 对象, 每个 Cookie 对象就是一个键值对.
        Cookie userName = new Cookie("userName", "xz");
        Cookie age = new Cookie("age", 18 + "");
        // 整数需要进行转义：加双引号( + "")
        // 2. 把 Cookie 放到响应中
        resp.addCookie(userName);
        resp.addCookie(age);
        // 3. 创建一个响应报文
        resp.setContentType("text/html; charset=utf-8");
        resp.getWriter().write("返回成功");
    }
}
