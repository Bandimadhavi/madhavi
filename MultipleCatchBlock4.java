public class MultipleCatchBlock4{
public static void main(String args[]){
try{
int a[]=new int[5];
a[5]=30/0;
}
catch(Exception e)
{System.out.println("common task completed");}
catch(ArithmeticException e)
{System.out.println("task1 is completed");}
catch(ArrayIndexBoundsOfException e)
{System.out.println("task2 is completed");}
System.out.println("rest of the code");
}
}
