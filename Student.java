import java.util.Scanner;
public class Student {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter student name:");
        String name=input.nextLine();

        System.out.print("Enter your age;");
        int age=input.nextInt();

        System.out.print("Enter your marks;");
        int marks=input.nextInt();

        System.out.print("\n----Student report----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);

        if(marks>=50){
            System.out.println("Status: PASS");
        }
        else{
            System.out.println("Status: FAIL");

        }
    }
}
