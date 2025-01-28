package Firm;
//  Represents the personnel staff of a particular business.
public class Staff
{
    // List of 6 Objects. Type = StaffMember
    private StaffMember[] staffList =  new StaffMember[6];;



    // Constructor: Sets up the list of staff members.
    // Personal is added automatically once the constructor is called.
    public Staff ()
    {
        staffList[0] = new Executive("Tony", "123 Main Line",
                "555-0469", "123-45-6789", 2423.07);

        staffList[1] = new Employee("Paulie", "456 Off Line",
                "555-0101", "987-65-4321", 1246.15);

        staffList[2] = new Employee("Vito", "789 Off Rocker",
                "555-0000", "010-20-3040", 1169.23);

        staffList[3] = new Hourly("Michael", "678 Fifth Ave.",
                "555-0690", "958-47-3625", 10.55);

        staffList[4] = new Volunteer("Adrianna", "987 Babe Blvd.",
                "555-8374");

        staffList[5] = new Volunteer("Benny", "321 Dud Lane",
                "555-7282");

        // Type coercion so we can use the methods of that class.
        ((Executive)staffList[0]).awardBonus(500.00);
        ((Hourly)staffList[3]).addHours(40);
    }



    //  Method: Pays all staff members.
    public void payday()
    {
        double amount;


        // loops once for every staff member.
        for (int count=0; count < staffList.length; count++)
        {
            // Prints out all the attribute of the object
            System.out.println (staffList[count]);

            // polymorphic
            // Inheritance: Print out the pay method which in Staff Member/Employee/Hourly class
            // pay refer to the bonus.
            amount = staffList[count].pay();

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            staffList[count].vacationDays();

            System.out.println("-----------------------------------");
        }
    }
}
