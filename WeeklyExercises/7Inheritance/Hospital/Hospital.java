public class Hospital
{
    public static void main(String[] args)
    {
        Doctor doc1 = new Doctor();
        doc1.verifyID(1234567);
        doc1.jobDescr();
        doc1.examine();

        Nurse nur1 = new Nurse();
        nur1.verifyID(1234567);
        nur1.jobDescr();
        nur1.monitor();

        Cleaner cleaner1 = new Cleaner();
        cleaner1.verifyID(1234567);
        cleaner1.jobDescr();
        cleaner1.clean();

        Nurse nur2 = new Nurse();
        nur2.verifyID(324324);
    }
}
