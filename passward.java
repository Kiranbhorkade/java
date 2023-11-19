package java;
import java.util.Scanner;
public class passward {


        public static void main(String[] args) {
            
            int pwd;
            System.out.print("enter passwerd :=   ");
            try (Scanner obj = new Scanner(System.in)) {
                pwd=obj.nextInt();
            }
            
            if (pwd==1234) {
                
                System.out.print("hii kiran  ");
                System.out.print("your age is 23  ");
                System.out.print("welcome   ");
                
            }
            
    
        }
    

    
}
