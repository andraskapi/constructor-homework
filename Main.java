public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2022);
        System.out.println(myCar.getBrand()); // Output: Toyota

        Car defaultCar = new Car();
        System.out.println(defaultCar.getModel()); // Output: Unknown


        BankAccount accountOne = new BankAccount();
        BankAccount accountTwo = new BankAccount("6547897","Short Top", 84779.14);
        System.out.println();
//        accountOne.setAccountNumber("639325821471");
//        accountTwo.setAccountNumber("147125883699");
//        accountOne.setAccountHolder("Végh Béla");
//        accountTwo.setAccountHolder("Zöldes Barna");
//        accountOne.setBalance(52136.89);
//        accountTwo.setBalance(74581.98);
////
//        System.out.println("Account holder name : " + accountOne.getAccountHolder() +
//                " Account number: " + accountOne.getAccountNumber()
//        + " Balance: " + accountOne.getBalance());
//        System.out.println("Account holder name : " + accountTwo.getAccountHolder() +
//                " Account number: " + accountTwo.getAccountNumber()
//                + " Balance: " + accountTwo.getBalance());
        System.out.println("Account number: " + accountOne.getAccountNumber() +
                " Name : " + accountOne.getAccountHolder()
                + " Balance : " + accountOne.getBalance());
        System.out.println("Account number: " + accountTwo.getAccountNumber() +
                " Name : " + accountTwo.getAccountHolder()
                + " Balance : " + accountTwo.getBalance());

    }
}
