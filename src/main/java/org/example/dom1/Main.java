package org.example.dom1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    ti1
    public static void main(String[] args) {
//        System.out.println("my name : saroeun rithiudom");
//        System.out.println("age : 17 year old");
//        System.out.println("Siem Reap");
//    ti2
      Scanner sc = new Scanner(System.in);

      System.out.print("Please input name: ");
      String studentName = sc.next();

      System.out.print("Please input Age: ");
      String studentAge =sc.next();

      System.out.print("please input height: ");
      String studentHeight = sc.next();

      System.out.print("Please input Place is student: ");
      boolean placeIsStudent = sc.hasNextBoolean();

      System.out.println("Student Name = " +studentName);
      System.out.println("Student Age = " +studentAge);
      System.out.println("Student Height = " +studentHeight);
      System.out.println("Student place is = " +placeIsStudent);

    }
}