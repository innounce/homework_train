package Student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {

//        userInput();

        Student student = new Student("Hank", 80, 76);
        student.print();
        System.out.println(student.hightest());
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter student's name:");
        String name = scanner.next();
        System.out.print("Please enter student's math:");
        int math = scanner.nextInt();
        System.out.print("Please enter student's english:");
        int english = scanner.nextInt();

        Student student = new Student(name, math, english);

        student.print();
        System.out.println(student.hightest());
    }
}
