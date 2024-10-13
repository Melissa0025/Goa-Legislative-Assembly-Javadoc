package gla_java;
/**
 * class for MLA which defines the MLAs name,constituency and party
 */
public class MLA
{
    private String name;
    private String constituency;
    private String party;

    /** constructor to initialize an MLA object
     * @param name - defines the name of the MLA
     * @param constituency - defines which constituency the MLA belongs to
     * @param party - defines which party the MLA belongs to
     */

    public MLA(String name, String constituency, String party)
    {
        this.name = name;
        this.constituency = constituency;
        this.party = party;
    }

    /**
     * Gets the name of the MLA
     * 
     * @return the name of the MLA
     */
    public String getName()
    {
        return name;
    }

    /**
     * Gets the constituency of the MLA
     * 
     * @return the constituency of the MLA
     */
    public String getConstituency()
    {
        return constituency;
    }

    /**
     * Gets the party of the MLA
     * 
     * @return the party of the MLA
     */
    public String getParty()
    {
        return party;
    }

    /**
     * Displays the details of the MLA
     */
    public void displayMLADetails()
    {
        System.out.println("\nName: " + name);
        System.out.println("Constituency: " + constituency);
        System.out.println("Party: " + party);
    }
}