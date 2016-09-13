
package javaapplication36;

/**
 *
 * @author sachin
 */
import java.util.*;
public class JavaApplication36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int f=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st String");
        String s1 = sc.next();
        System.out.println("Enter the 2nd String");
        String s2 = sc.next();
        int i=0,j=0;
        if(s1.length()!=s2.length()){
            System.out.println("Both Sting is not rotation");
            return;
        }
        while(i<s1.length()){
            if(s1.charAt(i)!=s2.charAt(j)){
                
                if(j>s2.length()-2){
                 System.out.println("Both Sting is not rotation");
                 return;
                }
                else
                    j++;
            }
            
           
           else{
               
               for(i=0;i<s1.length();i++){
                   f=1;
                   if(s1.charAt(i)==s2.charAt(j)){
                       j++;
                       if(j>s1.length()-1)
                           j= j-s1.length();
                       }
                   else{f=0;
                       System.out.println("Both Sting is not rotation");
                         return;
                   }
               }
                               
            }
            
        }
        if(f==1)
            System.out.println("rotation");
            
    }
    
}
