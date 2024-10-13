package gla_java;
/**
 * class for Council Ministers which inherits attributes from the MLA class
 */
public class Minister extends MLA
{
    private String portfolio;

    /**
     * constructor to initialize an Minister object
     * @param name - inherits from MLA class 
     * @param constituency - inherits from MLA class
     * @param party - inherits from MLA class
     * @param portfolio - defines which portfolio the Minister is assigned
     */
    
    public Minister(String name, String constituency, String party, String portfolio)
    {
        super(name, constituency, party);
        this.portfolio = portfolio;
    }

    /**
     * Gets the portfolio of the Minisster
     * 
     * @return the portfolio of the Minister
     */
    public String getPortfolio()
    {
        return portfolio;
    }

    /**
     * Displays the details of the Minister
     */
    @Override
    public void displayMLADetails()
    {
        super.displayMLADetails();
        System.out.println("Portfolio: " + portfolio);
    }
}

