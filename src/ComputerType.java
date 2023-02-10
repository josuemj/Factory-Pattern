class HpComputer implements Computer{
    @Override
    public double getPrice(){
        return 500.0;
    }
}

class MacComputer implements Computer{
    @Override
    public double getPrice(){
        return 1500.0;
    }
}

class DellComputer implements Computer{
    @Override
    public double getPrice(){
        return 300.0;
    }
}