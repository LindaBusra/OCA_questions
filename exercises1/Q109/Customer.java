package Others.OCA.exercises1.Q109;

public class Customer {

    ElectricAccount acct = new ElectricAccount();

    public  void useElectricity(double kWh){
        acct.addKWh(kWh);
    }
}
