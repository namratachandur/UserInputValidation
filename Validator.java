public class Validator
{
    public static String validateName(String input) throws InvalidInputException
    
    {
        // Check if the input is null or empty
        if (input == null || input.trim().isEmpty())
        {
            throw new InvalidInputException("Name cannot be empty.");
        }

        // Check if the input contains digits
        for (char c : input.toCharArray())
        {
            if (Character.isDigit(c))
            {
                throw new InvalidInputException("Name cannot contain numbers.");
            }
        }

        return input.trim();
    }

    public static int validateAge(int age) throws InvalidInputException
    {
        try 
        {
            // Check if the age is negative
            if (age < 0) 
            {
                throw new InvalidInputException("Age must be a positive integer");
            }
            return age;
        } 
        catch (NumberFormatException e) 
        {
            throw new InvalidInputException("Age must be a valid number");
        }
    }

    public static String validateEmail(String email) throws InvalidInputException
    {
        // Check if the email is null or empty
        if (email == null || email.trim().isEmpty()) 
        {
            throw new InvalidInputException("Email cannot be empty.");
        }
    
        // Check if the email contains '@' and ends with either .com or .edu
        if (!email.contains("@") || (!email.endsWith(".com") && !email.endsWith(".edu"))) 
        {
            throw new InvalidInputException("Please enter a valid email address.");
        }

        return email.trim();
    }

    public static String validatePhone(String phoneNumber) throws InvalidInputException
    {
        // Check if the phone number is null or empty
        if (phoneNumber == null || phoneNumber.trim().isEmpty())
        {
            throw new InvalidInputException("Phone number cannot be empty.");
        }

        // Check if the phone number is 10 digits long
        if (phoneNumber.length() != 10)
        {
            throw new InvalidInputException("Phone number must be 10 digits long.");
        }

        // Check if the phone number contains only digits
        for (char c : phoneNumber.toCharArray())
        {
            if (!Character.isDigit(c))
            {
                throw new InvalidInputException("Phone number must only contain digits.");
            }
            break;
        }

        return phoneNumber.trim();
    }
}