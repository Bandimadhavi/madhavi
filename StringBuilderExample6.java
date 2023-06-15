class StringBuilderExample6{
public static void main(String args[]){
StringBuilder sb=new StringBuilder();
sb.append("Hello");
System.out.println(sb.capacity());
sb.append("Java is my favourite language");
System.out.println(sb.capacity());
}
}
