package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.AnswerStudent;
import edu.javacourse.studentorder.domain.StudentOrder;

public class StudentValidator
{
    public AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Student check is running");
        return new AnswerStudent();
    }
}
