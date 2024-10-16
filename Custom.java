class employee
{
    static int salary;
 static String name;
 static int id;
public void details()
{
    System.out.println(name);
    System.out.println(salary);
     System.out.println(id);
}
public void setsalary(int s)
{
   salary=s;
  

}
public void setname(String n)
{
    name=n;
}

public void setid(int i)
{
    id=i;
}
public int getid()
{
    return id;
} 


}
public class Custom{
    public static void main(String[] args)
    {
   employee obj=new employee();
  obj.setsalary(100);
  obj.setname("asim"); 
  obj.setid(5);


  obj.details();


    }
}
