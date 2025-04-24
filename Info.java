
public class Info
{
    private String name;
    private int age;
    private String email;
    private String phone;

    public Info(String name, int age, String email, String phone) 
    {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    public String getName() 
    {
        return name;
    }

    public int getAge() 
    {
        return age;
    }

    public String getEmail() 
    {
        return email;
    }

    public String getPhone() 
    {
        return phone;
    }
}