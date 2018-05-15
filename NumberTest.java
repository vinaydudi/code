import java.util.Scanner;

public class NumberTest {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        Long num = Long.parseLong(sc.next());

        if(num>0)
            System.out.println("Positive");
        else if(num<0)
            System.out.println("Negative");
        else
            System.out.println("Zeri");

    }

}
