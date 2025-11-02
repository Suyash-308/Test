package service;

import dao.StudentDao;

import model.Student;
import java.util.List;

public class StudentService {
    StudentDao studentDao = new StudentDao();
    public void addStudent(Student student)  {
        studentDao.addStudent(student);
    }

    public List<Student> getAllStudents(){
        return  studentDao.getAllStudents();
    }
}
