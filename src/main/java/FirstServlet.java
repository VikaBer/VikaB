import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
// Получаем параметры запроса
        String name = request.getParameter("name");
        String email = request.getParameter("email");

// Создаем экземпляр класса, который будет обрабатывать параметры запроса
        FormProcessor formProcessor = new FormProcessor();

// Обрабатываем параметры запроса и получаем результат
        String result = formProcessor.processForm(name, email);

// Отправляем ответ клиенту
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Form Submit Result:</h1>");
        out.print(result);
        out.println("</body></html>");
    }
}
