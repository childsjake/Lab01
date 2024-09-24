import java.util.Calendar;

public class Person
{
    private String ID;
    private String firstName;
    private String lastName;
    private int YOB;
    private String title;
    static private int IDseed = 1;

    public static void setIDseed(int IDseed) {
        Person.IDseed = IDseed;
    }

    public static int getIDseed() {
        return IDseed;
    }

    public Person(String ID, String firstName, String lastName, int YOB, String title) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.YOB = YOB;
        this.title = title;
    }

    public Person(String firstName, String lastName, int YOB, String title) {
        this.ID = this.genID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.YOB = YOB;
        this.title = title;
    }

    public String getID() {
        return ID;
    }

    private String genID(){
        String newID = "" + IDseed;
        while(newID.length() < 8)
            newID = "0" + newID;

            IDseed++;

        return newID;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", YOB=" + YOB +
                ", title='" + title + '\'' +
                '}';
    }

    public String FullName()
    {
       String fullName = firstName + " " + lastName;
       return fullName;
    }

    public String FormalName()
    {
        String fullName = firstName + " " + lastName;
        String formalName = title + " " + fullName;
        return formalName;
    }

    public String getAge()
    {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        int age = currentYear - YOB;
        return String.valueOf(age);
    }

    public String getAge(int year)
    {
        int age = year - YOB;
        return String.valueOf(age);
    }

    public String toCSV()
    {
        return ID + "," + firstName + "," + lastName+ "," + title+ "," + YOB;
    }

    public String toJSON()
    {
        String retString = "";
        char DQ = '\u0022';
        retString = "{" + DQ + "ID" + DQ + ":" + DQ + this.ID + DQ + ",";
        retString += "" + DQ + "firstName" + DQ + ":" + DQ + this.firstName + DQ + ",";
        retString += "" + DQ + "lastName" + DQ + ":" + DQ + this.lastName + DQ + ",";
        retString += "" + DQ + "title" + DQ + ":" + DQ + this.title + DQ + ",";
        retString += "" + DQ + "YOB" + DQ + ":" + DQ + this.YOB + DQ + "}";
        return String.valueOf(retString);
    }

    public String toXML()
    {
        String retString = "";
        retString = "<Person>";
        retString += "<ID>" + ID + "</ID>";
        retString += "<firstName>" + this.firstName + "</firstName>";
        retString += "<lastName>" + this.lastName + "</lastName>";
        retString += "<title>" + this.title + "</title>";
        retString += "<YOB>" + this.YOB + "</YOB></Person>";
        return retString;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

}
