import java.util.Scanner;
class ReplaceAll{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String inputstr=sc.nextLine();
char ch=sc.next().charAt(0);
String res=inputstr.replaceAll(c,r);
System.out.println(res);
}
}

