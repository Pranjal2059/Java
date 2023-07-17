public class stringCompare{
    public static void main(String[]args){
        
        String s1="abc";
        String s2="def";
        int out=s1.compareTo(s2);
        System.out.println(out);
        
        int out2= s1.compareToIgnoreCase(s2);
        System.out.println(out2);
}
