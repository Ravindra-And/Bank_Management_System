import java.util.*;
public class Addition {
    public static void main(String[] args) 
        {
            Scanner sc= new Scanner(System.in);
            
           int a,b;

            System.out.print("Enter value of a:-");
            a=sc.nextInt();

            System.out.print("Enter value of b:-");
            b=sc.nextInt();
            int sum=a+b;
            System.out.println("sum is:-"+sum);
           sc.close();
        }
    }
    

