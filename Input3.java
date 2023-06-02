import java.util.Scanner;
class Input3{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.println("Enter a number:");
double num1;
num1=scob.nextInt();
System.out.print("Enter a number:");
double num2;
num2=scob.nextInt();
System.out.println(num1+"+"+num2+"="+(num1+num2));
}
}