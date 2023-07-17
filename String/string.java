public class string{
    public static void main(String[]args){
      
        String s="I Write Code";
        int output=s.indexOf("Write");
        System.out.println(output);
        
        String s1="Learn to Learn";
        int op=s1.indexOf("ea",3);
        System.out.println(op);
        
        int out= s1.indexOf("a");
        System.out.println(out);
        
        Boolean resultbool = s1.equals(s1);
        System.out.println(resultbool);
        
        Boolean isEquals =s1.equalsIgnoreCase(s1);
        System.out.println(s1);
          
    }
}
