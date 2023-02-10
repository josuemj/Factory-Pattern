//Clase de computadora HP
class HpComputer implements Computer{
    @Override
    public double getPrice(){
        return 500.0;
    }
}

//Clase de computadora Mac
class MacComputer implements Computer{
    @Override
    public double getPrice(){
        return 1500.0;
    }
}

//Clase de computadora Dell
class DellComputer implements Computer{
    @Override
    public double getPrice(){
        return 300.0;
    }
}