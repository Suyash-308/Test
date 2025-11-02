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

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    StudentService studentService = new StudentService();

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String name=req.getParameter("name");
    String email=req.getParameter("email");
    String course=req.getParameter("course");

    Student student=new Student();
    student.setName(name);
    student.setEmail(email);
    student.setCourse(course);

    studentService.addStudent(student);

        PrintWriter writer = resp.getWriter();
        writer.println("Successfully register student");
        writer.println(student);
    }
}
