import java.util.*;

class Employee{

int eid;
 String name;
 int work_hours;

public Employee(int eid,String name,int work_hours)
 {
     this.eid=eid;
     this.name=name;
     this.work_hours=work_hours;
 }

     public int empsalary()
     {

            return work_hours*50;
     }
     public String empname()
     {

        return name;

     }
     int empid()
     {


        return eid;
     }


}


public class Salary_employee {
    public static void main(String args[] )
    {
    
        Scanner sc=new Scanner(System.in);

        int eid,workh;
        String name;

        System.out.println("Enter the employee id employee name and worked hours respectivly");
        eid=sc.nextInt();
          sc.nextLine();
        name=sc.nextLine();

        workh=sc.nextInt();

        Employee obj=new Employee(eid,name,workh);

      


        sc.close();


    }
}
