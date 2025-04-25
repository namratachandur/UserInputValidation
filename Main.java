import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        // Create an ArrayList to store user information
        ArrayList<Info> personal_info = new ArrayList<Info>();
        Scanner input = new Scanner(System.in);

        boolean new_user = true;
        while (new_user) 
        {
            // Prompt the user for their information
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
                    System.out.println("Exiting the program. Thank you!");
                    new_user = false;
                }
                else
                {
                    System.out.println("Invalid response. Exiting the program.");
                    new_user = false;
                }
            } 
            // Handle exceptions for invalid input
            catch (InvalidInputException e) 
            {
                System.out.println("Validation error: " + e.getMessage());
                System.out.println("Please try again.");
            }
            // Handle exceptions for invalid age input
            catch (NumberFormatException e) 
            {
                System.out.println("Invalid input. Please enter a valid number for age.");
            }
        }

        // Print the user information
        System.out.println("User Information:");
        for (Info info : personal_info) 
        {
            System.out.println("Name: " + info.getName());
            System.out.println("Age: " + info.getAge());
            System.out.println("Email: " + info.getEmail());
            System.out.println("Phone Number: " + info.getPhone());
        }
    }
}
