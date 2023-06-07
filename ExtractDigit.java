import java.util.Scanner;
class Palindrome{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String strobj=sc.nextLine();
String rev="";
for(int i=strobj.length()-1;i>=0;i--){rev=rev+strobj.charAt(i);}
System.out.print(strobj+""+rev);
if(strobj.equals(rev))
{
System.out.println("Yes");
}
else
{
System.out.println("No");
}
}