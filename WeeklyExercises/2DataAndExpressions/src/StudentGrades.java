
public class StudentGrades
{
    public static void main (String[] args)
    {
        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n" +
                           "==          Student Points          ==\n" +
                           "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////\n\n");

        String[] names = {"Joe     ", "William ", "Mary Sue", "Zain    ", "Bob     "};
        String[] labs = {"43", "50", "39", "29", "23"};
        String[] bonus = {"7", "8", "10", "10", "11"};

        System.out.println("Name            Lab     Bonus   Total\n" +
                           "----            ---     -----   -----");

        for (int i = 0; i < 5 ; i++) {
            int total = Integer.parseInt(labs[i]) + Integer.parseInt(bonus[i]);
            System.out.println(names[i] + "\t\t" + labs[i] + "\t\t" + bonus[i] + "\t\t" + total);
        }



    }
}
