package lab.inheritance;

public class Ron extends Money{

    private String issuingCountry;
    int value; // value member variable shadows the one in Money class

    public Ron(int value, String issuingCountry) {
        super(value); // super() calls Money constructor (superclass constructor)
        this.issuingCountry = issuingCountry; // we can also initialize our other member variables afterwards !!! first use super() !!!
    }

}
