package Firm;
//  Represents a general paid employee.

public class Employee extends StaffMember
{
    // Attributes assigned to this class
    protected String socialSecurityNumber;
    protected double payRate;




    //  Constructor: Sets up this employee with the specified information.
    public Employee(String eName, String eAddress, String ePhone, String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone);

        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }




    //  Returns information about an employee as a string.
    public String toString()
    {
        String result = super.toString();

        result += "\nSocial Security Number: " + socialSecurityNumber;

        return result;
    }

    //-----------------------------------------------------------------
    //  Returns the pay rate for this employee.
    //-----------------------------------------------------------------
    public double pay()
    {
        return payRate;
    }

    public void vacationDays()
    {
        System.out.println("Vacation Days: 14");
    }
}
