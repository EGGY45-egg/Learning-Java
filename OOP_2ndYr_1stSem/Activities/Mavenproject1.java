/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject1;
/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;
public class Mavenproject1 {
    public static void main(String[] args) {
        String name, course, yr_lvl, quiz_1, quiz_2, class_part,lect_exam,act_1,act_2, class_stndng, lab_exam;
        int year;
        double q1, q2, part, lect_e, a1, a2, stndng, lab_e, lecture_grade, lab_grade;
        
        name = JOptionPane.showInputDialog("Name: ");
        yr_lvl = JOptionPane.showInputDialog("Year: ");
        course = JOptionPane.showInputDialog("Course: ");
        quiz_1 = JOptionPane.showInputDialog("Quiz 1: ");
        quiz_2 = JOptionPane.showInputDialog("Quiz 2: ");
        class_part = JOptionPane.showInputDialog("Class Participation: ");
        lect_exam = JOptionPane.showInputDialog("Lecture Exam: ");
        act_1 = JOptionPane.showInputDialog("Activity 1: ");
        act_2 = JOptionPane.showInputDialog("Activity 2: ");
        class_stndng = JOptionPane.showInputDialog("Class Standing: ");
        lab_exam = JOptionPane.showInputDialog("Laboratory Exam: ");
        
        year = Integer.parseInt(yr_lvl);
        q1 = Double.parseDouble(quiz_1);
        q2 = Double.parseDouble(quiz_2);
        part = Double.parseDouble(class_part);
        lect_e = Double.parseDouble(lect_exam);
        a1 = Double.parseDouble(act_1);
        a2 = Double.parseDouble(act_2);
        stndng = Double.parseDouble(class_stndng);
        lab_e = Double.parseDouble(lab_exam);
        
        lecture_grade = (q1 *.2) + (q2 *.2)  + (part *.1) + (lect_e*.5);
        lab_grade = (a1 * .2) + (a2 * .2) + (stndng * .1) + (lab_e * .5);
//        total = //
        
        JOptionPane.showMessageDialog(null, "NAME: " + name 
                + "\nCOURSE: "+ course 
                + "\nYEAR: " + yr_lvl
                +"\n\n" + "LECTURE\n"
                +"Quiz 1: " + q1
                + "\nQuiz 2: " + q2
                + "\nClass Participation:  " + part
                + "\nLecture Exam:  " + lect_e
                + "\nLECTURE GRADE:  " + lecture_grade
                + "\n\nLABORATORY\n" 
                + "Activity 1:  " + a1
                + "\nActivity 2:  " + a2
                + "\nClass Standing:  " + stndng
                + "\nLaboratory Exam:  " + lab_e
                + "\nLABORATORY GRADE:  " + lab_grade
                ,"Message", JOptionPane.INFORMATION_MESSAGE);
    }
}
