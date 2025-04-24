public class Info
{
    private String name;
    private int age;
    private String email;
    private String phone;

    // Constructor to initialize the Info object with user details
    public Info(String name, int age, String email, String phone) 
    {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    public String getName() // Getter for name
    {
        return name;
    }

    public int getAge() // Getter for age
    {
        return age;
    }

    public String getEmail() // Getter for email
    {
        return email;
    }

    public String getPhone() // Getter for phone number
    {
        return phone;
    }
}
