import java.util.ArrayList;
import java.util.Map;

public class UberBlack extends Car{
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberBlack(String license, Account driver, String brand, String model,ArrayList<String> seatsMaterial, Map<String, Map<String, Integer>> typeCarAccepted){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
}
