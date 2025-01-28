public class Employee
{
    int validAccessCode = 1234567;

    void verifyID(int accessCode)
    {
        if (accessCode == validAccessCode)
        {
            System.out.println("Access Granted.");
        }
        else
        {
            System.out.println("Access Denied. Code is Incorrect!");
        }
    }
}
