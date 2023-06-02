class madhavi{
public void singingsong1(){
System.out.println("singingsong1 called from class madhavi");
}
public void singingsong2(){
System.out.println("singingsong2 called from class madhavi");
}
}
class pavani
{
public static void main(String args[]){
madhavi ob=new madhavi();
ob.singingsong1();
ob.singingsong2();
}
}
