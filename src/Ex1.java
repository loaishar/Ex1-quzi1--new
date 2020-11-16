import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        int n1, n2, hcf = 1, tmp1, tmp2;
        Scanner scanner = new Scanner(System.in);
        if (args.length == 2) {
            n1 = Integer.parseInt(args[0]);
            n2 = Integer.parseInt(args[1]);
        } else {
            System.out.print("Enter the first nember for max prime GCD:");
            n1 = (int) scanner.nextInt();
            System.out.print("Enter the second number for max prime GCD:");
            n2 = (int) scanner.nextInt();

        }
        tmp1 = n1;
        tmp2 = n2;
        for (int i = 2; i <= tmp1 && i <= tmp2; ++i) {// run from 1=2 untill ibecome qual to the min number
            while (tmp1 % i == 0 && tmp2 % i == 0) {// if the 'i' number divide both of the numbers that user enter then
                hcf = i;// the GCD prime number
                tmp1 /= hcf;// remove the prime number that divide first number
                tmp2 /= hcf;// remove the prime number that divide second number
            }
        }
        System.out.printf("Computes the GPCD(%d,%d)= %d", n1, n2, hcf);
    }
}
