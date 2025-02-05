import java.util.Scanner;
class Employee{
       int EID;
       String name;
       String branch;
       public void getdata(){
            Scanner sc=new Scanner(System.in);
            EID=sc.nextInt();
            name=sc.next();
            branch=sc.next();
       }
       public void display(){
            System.out.println("Employee ID:"+EID);
            System.out.println("employee name:"+name);
            System.out.println("employee branch:"+branch);
       }
}
public class Faculty{
        public static void main(String[] args){
            Employee emp=new Employee();
            emp.getdata();
            emp.display();
        }
}