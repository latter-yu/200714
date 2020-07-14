import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

public class ServletDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");

        String encoding = req.getCharacterEncoding();
        // 返回请求主体中使用的字符编码的名称
        String contentType = req.getContentType();
        // 返回请求主体的 MIME 类型，如果不知道类型则返回 null
        String contextPath = req.getContextPath();
        // 返回指示请求上下文的请求 URI 部分
        String ua = req.getHeader("User-Agent");
        // 以字符串形式返回指定的请求头的值
        String host = req.getHeader("Host");
        String method = req.getMethod();
        // 返回请求的 HTTP 方法的名称，例如，GET、POST 或 PUT
        String protocol = req.getProtocol();
        // 返回请求协议的名称和版本
        String queryString = req.getQueryString();
        // 返回包含在路径后的请求 URL 中的查询字符串
        String url = req.getRequestURI();
        // 从协议名称直到 HTTP 请求的第一行的查询字符串中，返回该请求的 URL 的 一部分
        int contentLength = req.getContentLength();
        // 以字节为单位返回请求主体的长度，并提供输入流，或者如果长度未知则返 回 -1

        Writer writer = resp.getWriter();
        writer.write("<html>");
        writer.write("encoding: " + encoding);
        writer.write("<br/>");
        writer.write("contentType: " + contentType);
        writer.write("<br/>");
        writer.write("contextPath: " + contextPath);
        writer.write("<br/>");
        writer.write("ua: " + ua);
        writer.write("<br/>");
        writer.write("host: " + host);
        writer.write("<br/>");
        writer.write("method: " + method);
        writer.write("<br/>");
        writer.write("protocol: " + protocol);
        writer.write("<br/>");
        writer.write("queryString: " + queryString);
        writer.write("<br/>");
        writer.write("url: " + url);
        writer.write("<br/>");
        writer.write("contentLength: " + contentLength);
        writer.write("<br/>");
        writer.write("</html>");
    }
}
