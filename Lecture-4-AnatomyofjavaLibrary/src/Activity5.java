import java.util.Scanner;

public class Activity5 {
    //Assuming you are riding a bike and police officer stops you
    //police officer asking you to provide 2 details
    //your current speed
    //if it is your birthday today?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter speed : ");
        int speed=sc.nextInt();

        System.out.println("Today is your birthday : ");
        boolean isbirthday = sc.nextBoolean();

        if (isbirthday==true) {
            speed-=5;
        }
        if (speed>80) {
            System.out.println("High ticket");
        }
        else if(speed >= 60) {
            System.out.println("Mid ticket");
        }
        else
            System.out.println("No ticket");
    }

}
