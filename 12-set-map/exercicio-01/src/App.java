import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.*;

public class App {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Set<Student> courseA = new HashSet<>();
        System.out.print("How many students are in course A? ");
        int count = sc.nextInt();
        System.out.println("Enter students ID's");
        for (int i = 0; i < count; i++) {
            courseA.add(new Student(sc.nextInt()));
        }
        System.out.println();

        System.out.print("How many students are in course B? ");
        Set<Student> courseB = new HashSet<>();
        count = sc.nextInt();
        System.out.println("Enter students ID's");
        for (int i = 0; i < count; i++) {
            courseB.add(new Student(sc.nextInt()));
        }
        System.out.println();

        System.out.print("How many students are in course C? ");
        Set<Student> courseC = new HashSet<>();
        count = sc.nextInt();
        System.out.println("Enter students ID's");
        for (int i = 0; i < count; i++) {
            courseC.add(new Student(sc.nextInt()));
        }
        System.out.println();

        Set<Student> totalStudentsSet = new HashSet<>(courseA);
        totalStudentsSet.addAll(courseB);
        totalStudentsSet.addAll(courseC);
        
        System.out.println("Total Students: " + totalStudentsSet.size());


        sc.close();
    }
}
