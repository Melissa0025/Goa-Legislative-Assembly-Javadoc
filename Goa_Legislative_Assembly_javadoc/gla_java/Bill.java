package gla_java;

/**
 * class for Bill which defines the title,date and proposer of the bill
 */
public class Bill
{
    private String title;
    private String date;
    private String proposer;

    /**
     * constructor to initialize an Bill object
     * @param title - states the title of the bill
     * @param date - states the date on which the bill is inroduced
     * @param proposer - states the name of the person who introduced the bill
     */

    public Bill(String title, String date, String proposer)
    {
        this.title = title;
        this.date = date;
        this.proposer = proposer;
    }

    /**
     * Gets the title of the Bill
     * 
     * @return the title of the Bill
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Gets the date 
     * 
     * @return the date of the Bill introduced
     */
    public String getDate()
    {
        return date;
    }

    /**
     * Gets the name of the proposer
     * 
     * @return the name of the proposer
     */
    public String getProposer()
    {
        return proposer;
    }

    /**
     * Displays the details of the bill
     */
    public void displayDetails()
    {
        System.out.println("\nBill Title: " + title);
        System.out.println("Date Issued: " + date);
        System.out.println("Introduced By: " + proposer);
    }
}
