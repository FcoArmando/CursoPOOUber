
public class UberVan extends Car {
    //private Integer passenger;

    public UberVan(String license, Account driver){
        super(license, driver);
    }

    public void setPassenger(Integer passenger){
        if(passenger!=null){
            if(passenger == 6){
                this.passenger = passenger;
            }
            else{
                System.out.println("Necesitas asignar 6 pasajeros");
            }
        }
    }


}
