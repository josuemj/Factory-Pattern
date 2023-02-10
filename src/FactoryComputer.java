public class FactoryComputer {
    public Computer getComputer(String type){
        switch(type){ //LOLAZO
            case "HpComputer":
                return new HpComputer();
            case "MacComputer":
                return new MacComputer();
            default: // Dell
                return new DellComputer();
        }
    }
}
