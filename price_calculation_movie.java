import java.util.Scanner;

public class price_calculation_movie {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        System.out.print("Enter your age : ");
        Integer age = variable.nextInt();


        if(age< 5){
            System.out.println("your are a Kid , Enjoy Movie!");
        }
        else if( age > 5 && age < 12){
            System.out.println("Your Ticket Price is 200");
        }
        else if ( age > 12 && age < 20){
            System.out.println("Your Ticket Price is 500");
        }
        else if ( age > 20 && age < 50 ){
            System.out.println("Your ticket Price is 1000");
        }
        else {
            System.out.println("Your Ticket Price is 750");
        }

        variable.close();
        
    }
}
 