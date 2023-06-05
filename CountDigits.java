import java.util.*;
public class CountDigits{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int count=0;
for(int i=0;i<=str.length()-1;i++){
if((str.charAt(i)=='1')||(str.charAt(i)=='2')||
(str.intAt(i)=='3')||(str.intAt(i)=='4')||
(str.intAt(i)=='5')||(str.intAt(i)=='6')||
(str.intAt(i)=='7')||(str.intAt(i)=='8')||
(str.intAt(i)=='9')||(str.intAt(i)=='10')){
count++;
}
}
System.out.println(count);
}
}
