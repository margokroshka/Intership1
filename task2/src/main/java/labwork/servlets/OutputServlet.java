package labwork.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import labwork.text.TextOutput;

import java.io.IOException;

@WebServlet("/text-output")
public class OutputServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int size = Integer.parseInt(request.getParameter("size"));
        int lines = Integer.parseInt(request.getParameter("lines"));

        if (size <= 0 || lines <= 0) {
            request.setAttribute("text", "Font size and number of lines must be > 0");
        } else {
            TextOutput txt = new TextOutput();
            try {
                String text = txt.textOutput(lines);
                request.setAttribute("text", text);
            } catch (IOException e) {
                request.setAttribute("text", e.getMessage());
            }
            request.setAttribute("fsize", size);
        }

        request.setAttribute("size", size);
        request.setAttribute("lines", lines);
        request.getRequestDispatcher("text-output.jsp").forward(request, response);
    }
}
