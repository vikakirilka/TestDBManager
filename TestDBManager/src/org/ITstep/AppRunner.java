package org.ITstep;

import org.ITstep.dao.StudentDAO;
import org.ITstep.model.Student;

public class AppRunner {

 public static void main(String[] args) {
  StudentDAO studentDAO = new StudentDAO();
  Student student = new Student("ALex", "Ignatenko", 12345678, 2);
  studentDAO.save(student);
 }

}
