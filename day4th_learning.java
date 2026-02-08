import java.util.Scanner;
public class day4th_learning {
    public static void main(String[] args) {
        System.out.println("Hello Java This is my Day 4th ");
        Scanner name = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String myname = name.nextLine();
        System.out.println("Hello " + myname);
        name.close();

    }
}
