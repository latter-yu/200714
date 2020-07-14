import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.Enumeration;

public class ServletDemo3 extends HttpServlet {
    // 遍历获取到 header 所有内容(键值对)

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");

        Writer writer = resp.getWriter();
        writer.write("<html>");
        Enumeration<String> headerName = req.getHeaderNames();
        // 返回一个 String 对象的枚举，包含在该请求中包含的参数的名称。
        // 获取 header 的 key
        // 与迭代器相似
        while (headerName.hasMoreElements()) {
            String header = headerName.nextElement();
            writer.write(header + ": " + req.getHeader(header));
            writer.write("<br/>");
            writer.write("</html>");
        }
    }
}
