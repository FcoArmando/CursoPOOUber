class main{
 public static void main(String[] args) {
    System.out.println("Hola mundo");
    UberX uberX = new UberX("AMQ123", new Account("Andrés Herrera", "AND123"),"Chevrolet","2022");
    uberX.setPassenger(4);
    uberX.printDataCar();

    UberVan uberVan = new UberVan("TTQ789", new Account("Andres Herrera", "AND123"));
    uberVan.setPassenger(6);
    uberVan.printDataCar();

    /*Car car2 = new Car("QWE567", new Account("Andrea Herrera", "ANDA876"));
    car2.passenger = 3;
    car2.printDataCar();*/
 }
}