import java.util.*;
public class CheckPalindrom {
    
    public static void main(String[] args){
    
        String pal = "1221" ;

       StringBuffer p = new StringBuffer(pal);

       StringBuffer p1 = p.reverse();

       if(pal.equals(p1.toString())){
        System.out.println(pal + " is a Palindrome");
       }else{
        System.out.println(pal + " is not a Palindrome");
       }
    }
}
