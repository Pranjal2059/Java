class temp
{
public static void main(String...s)
{
    //getChars()
String str="Pranjal Sharma";
char ch[]=new char[4];
str.getChars(1,5,ch,0);
System.out.println(ch);

//getBytes()
String s1 ="Hello";
byte b[]=s1.getBytes();
System.out.println(s1);

//toCharArray()
String s2="Hello Pranjal";
char c[]=s2.toCharArray();
System.out.println(c);

}
}
