package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;
import service.StudentService;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/get-all-student")
public class AllStudentServlet extends HttpServlet {
    StudentService studentService = new StudentService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       List<Student> students = studentService.getAllStudents();
       resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<h1>All students</h1>");

        writer.println("<table border='1'> ");
        writer.println("<tr> <th>ID</th> <th>Name</th> <th>Email</th ><th>Course</th> </tr>");

        for (Student student : students) {
            writer.println("<tr>");
            writer.println("<td>" + student.getId() + "</td>");
            writer.println("<td>" + student.getName() + "</td>");
            writer.println("<td>" + student.getEmail() + "</td>");
            writer.println("<td>" + student.getCourse() + "</td>");
            writer.println("</tr>");
        }
        writer.println("</table>");
        writer.println("<br><br>");

        writer.println("< href='register.html'>Register New Student</a>");
        writer.println("<br><br>");
        writer.println("<a href='index.jsp'>Back to Home</a>");



    }
}
