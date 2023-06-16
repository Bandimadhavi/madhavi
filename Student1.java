class Student1{
public int id;
public String name;
}
class Test{
public static void main(String args[]){
Student1 ob=new Student1();
System.out.println(ob.id+" "+ob.name);
ob.id=25841;
ob.name="Madhavi";
System.out.println(ob.id+" "+ob.name);
}
}
