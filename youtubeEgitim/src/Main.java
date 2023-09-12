public class Main {
    public static void main(String[] args) {
        //classlar operasyonları tutar
        //SOLID nedir?
        //IoC Container nedir?
        CustomerManager customerManager = new CustomerManager(new Customer(),new TeacherCreditManager());
        customerManager.GiveCredit();



    }
}