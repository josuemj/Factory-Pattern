public class MainFactory {

    public static void main(String[] args) {

        System.out.println("WELCOME TO THE FACTORY");
        FactoryComputer newComputer = (FactoryComputer) FactoryComputer.getComputer("MacComputer");
        System.out.println("Computer created :)");

    }
}
