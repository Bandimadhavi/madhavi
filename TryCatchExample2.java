class TryCatchExample2{
public static void main(String args[]){
try{
int a=50/0;
}
catch(ArithmeticExcetion e)
{
System.out.println(e);
}
System.out.println("rest of the code");
}
}