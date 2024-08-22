package assignment.pkg3;

import java.util.Scanner;

public class BT_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input
        System.out.print("Enter full name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter year of birth: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter sex: ");
        String sex = scanner.nextLine();
        
        System.out.print("Enter major: ");
        String major = scanner.nextLine();
        
        System.out.print("Enter GPA: ");
        float GPA = scanner.nextFloat();
        scanner.nextLine();
        
        System.out.print("Enter country: ");
        String country = scanner.nextLine();
        //Output
        System.out.println(name + "-" + age + "-" + yearOfBirth + "-" + sex + "-" + major + "-" + GPA + "-" + country);
    }
}
