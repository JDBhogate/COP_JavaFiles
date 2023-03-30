package Assignment1;
import java.util.Scanner;

/*WAP to ask name ,age and salary of an employee and print on console.*/

public class c_elseif{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      String name;
      System.out.print("Enter name: ");
      name = sc.nextLine();

      int age;
      System.out.print("Enter age: ");
      age = sc.nextInt();

      double salary;
      System.out.print("Enter salary: ");
      salary = sc.nextDouble();

      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Salary: " + salary);
   }
}
