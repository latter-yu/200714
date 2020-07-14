import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;

public class ServletDemo4 extends HttpServlet {
    // 返回一个页面，使页面每隔一秒钟刷新一次
    // 借助 header 的 Refresh 来实现


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charse=utf-8");
        resp.setIntHeader("Refresh", 1);
        // void setIntHeader(String name, int value):
        // 设置一个带有给定的名称和整数值的响应报头。
        // 返回的页面中, 填写上当前时间.
        // 获取当前时间
        // System.currentTimeMillis();
        // new Date();
        // new Calender();
        Date date = new Date();
        // ()内没有参数：默认获取当前时间

        Writer writer = resp.getWriter();
        writer.write("<html>");
        writer.write(date.toString());
        writer.write("</html>");
    }
}
