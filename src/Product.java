public class Product
{
    private String ID;
    private String prodName;
    private String prodDescription;
    private double cost;
    static private int IDseed = 1;

    public Product(String ID, String prodName, String prodDescription, double cost) {
        this.ID = ID;
        this.prodName = prodName;
        this.prodDescription = prodDescription;
        this.cost = cost;
    }

    public Product(String prodName, String prodDescription, double cost) {
        this.ID = this.genID();
        this.prodName = prodName;
        this.prodDescription = prodDescription;
        this.cost = cost;
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

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdDescription() {
        return prodDescription;
    }

    public void setProdDescription(String prodDescription) {
        this.prodDescription = prodDescription;
    }

    public static int getIDseed() {
        return IDseed;
    }

    public static void setIDseed(int IDSeed) {
        Product.IDseed = IDSeed;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID='" + ID + '\'' +
                ", prodName='" + prodName + '\'' +
                ", prodDescription='" + prodDescription + '\'' +
                ", cost=" + cost +
                '}';
    }

    public String toCSV()
    {
        return ID + "," + prodName + "," + prodDescription+ "," + cost;
    }

    public String toJSON()
    {
        String retString = "";
        char DQ = '\u0022';
        retString = "{" + DQ + "ID" + DQ + ":" + DQ + this.ID + DQ + ",";
        retString += "" + DQ + "prodName" + DQ + ":" + DQ + this.prodName + DQ + ",";
        retString += "" + DQ + "prodDescription" + DQ + ":" + DQ + this.prodDescription + DQ + ",";
        retString += "" + DQ + "cost" + DQ + ":" + DQ + this.cost + DQ + "}";
        return retString;
    }

    public String toXML()
    {
        String retString = "";
        retString = "<Product>";
        retString += "<ID>" + ID + "</ID>";
        retString += "<prodName>" + this.prodName + "</prodName>";
        retString += "<prodDescription>" + this.prodDescription + "</prodDescription>";
        retString += "<cost>" + this.cost + "</cost></Product>";
        return retString;
    }

}
