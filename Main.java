import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        ArrayList<Info> personal_info = new ArrayList<Info>();
        Scanner input = new Scanner(System.in);

        boolean new_user = true;
        while (new_user) 
        {
            try
            {
                System.out.println("Enter your name: ");
                String name = Validator.validateName(input.nextLine());

                System.out.println("Enter your age: ");
                int age = Validator.validateAge(Integer.parseInt(input.nextLine()));

                System.out.println("Enter your email: ");
                String email = Validator.validateEmail(input.nextLine());

                System.out.println("Enter your phone number: ");
                String phone = Validator.validatePhone(input.nextLine());

                personal_info.add(new Info(name, age, email, phone));
                System.out.println("User information added successfully!");

                System.out.println("Do you want to add another user? (yes/no)");
                String response = input.nextLine().trim().toLowerCase();
                if (response.equalsIgnoreCase("yes"))
                {
                    new_user = true;
                }
                else if (response.equalsIgnoreCase("no"))
                {
                    new_user = false;
                }
                else
                {
                    System.out.println("Invalid response. Exiting the program.");
                    new_user = false;
                }
            } 
            catch (InvalidInputException e) 
            {
                System.out.println("Validation error: " + e.getMessage());
                System.out.println("Please try again.");
            }
        }
    }
}