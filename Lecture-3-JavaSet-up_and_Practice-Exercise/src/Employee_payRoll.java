import java.util.Scanner;

public class Employee_payRoll {
    public static void main(String[] args) {
        try(   Scanner sc = new Scanner(System.in)) {
            double basicpay, hra=0, da=0;
            System.out.println("Enter Basic pay of employee");
            basicpay = sc.nextFloat();
            if (basicpay >= 5000) {
                hra = 0.1 * basicpay;
                da = 0.2 * basicpay;
            } else {
                hra = 0.2 * basicpay;
                da = 0.3 * basicpay;
            }
            System.out.println(hra+" "+da);
            System.out.println(basicpay+hra+da);
        }
    }
}
