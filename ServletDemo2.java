import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

public class ServletDemo2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
        // 处理方式与 get 相同
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 处理表单提交的数据（表单 form.html）
        // 此时无论参数是在 url 中, 还是 body 中, 都能获取到
        // 此处 GET 和 POST 的处理方式都是一样的.
        String firstName = req.getParameter("firstName");
        // 以字符串形式返回请求参数的值，或者如果参数不存在则返回 null
        String secondName = req.getParameter("secondName");
        // 构造响应页面
        resp.setContentType("text/html; charset=utf-8");
        Writer writer = resp.getWriter();
        writer.write("<html>");
        writer.write("firstName: " + firstName);
        writer.write("<br/>");
        writer.write("secondName: " + secondName);
        writer.write("</html>");


    }
}
