import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        int n1, n2,gcd = 1,hcf=1,tmp1,tmp2;
        
       //Reading the input numbers
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter first number:");
       n1 = (int)scanner.nextInt();
       
       
       System.out.print("Enter second number:");
       n2 = (int)scanner.nextInt();
       

      /* for(int i = 1; i < n1 && i < n2; i++)
       {
           // Checks if i is factor of both integers
           if(n1 % i==0 && n2 % i==0)
           {
               
               gcd = i;
               System.out.println("gcd "+i);
           }
       }

       System.out.printf("G.C.D of %d and %d is %d", n1, n2, gcd);*/
       


       tmp1 = n1;
       tmp2 = n2;
       for(int i=2; i<= tmp1 && i<= tmp2; ++i){
           while(tmp1 % i== 0 && tmp2 % i == 0){
               hcf=i;
               tmp1 /= hcf;
               tmp2 /= hcf;
           }
       }
      // printf("gcd of %d and %d is %d", num1, num2, hcf);
       System.out.printf("G.C.D of %d and %d is %d", n1, n2, hcf);
      // return 0;
   }  
        
}