
import java.util.Scanner;



class Student{
    String name;
    int age;

  void displayinfo(){
  System.out.println("name =" + this.name);
  System.out.println("age = " + this.age);
}
}


public class Main {
    public static void main(String[] args) {
      
        Student s1 = new Student();
        Student s2 = new Student();
          
          // s2.displayinfo(); 
          
          Scanner sc = new Scanner(System.in);
           s1.name = sc.next();
           s1.age = sc.nextInt();

           s2.name = sc.next();
           s2.age = sc.nextInt();
           
          s1.displayinfo();
          s2.displayinfo();

    } 
}