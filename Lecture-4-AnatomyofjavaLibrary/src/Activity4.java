import java.util.Scanner;

public class Activity4 {
    public static void main(String[] args) {
        //Title: How log is your BURPPPP?
        //Ask the user to enter an Integer (burp Length)
        //Depending on the input Provided 'Burp' will be Produced.


        //For Example:
        //5:Burrrrrp;

        Scanner sc = new Scanner(System.in);

        System.out.println("How long is your Burp ? ");
        int burplength=sc.nextInt();
        String msg="";
        for (int i = 0; i <=burplength; i++) {
            msg=msg+"r"; //can also be written as msg+="r"
        }
        System.out.println("Bu"+msg+"p");
    }
}
//if BurpLength is 4
//r=''+r
//rr=r+r

