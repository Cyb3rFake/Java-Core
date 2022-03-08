package More_on_Classes.Practice;

public class CarClasses_44_2 {
    public static void main(String[] args) {

    Vehicle vehicle = new Vehicle();
    ElectricVehicle electric = new ElectricVehicle();
    HybridVehicle hybrid = new HybridVehicle();
    //calls
       vehicle.start();
       vehicle.resource();
       electric.start();
       electric.resource();
       hybrid.start();
       hybrid.resource();
    }
}

class Vehicle{

    public void start(){
        System.out.println("Starting");
    }
    public void resource(){
        System.out.println("I use petrol");
    }
}

class ElectricVehicle extends Vehicle{
    @Override
    public void resource() {                           //Переопределяем метод resource наследуемого от класса Vehicle для класса ElectroVehicle
        System.out.println("I use electricity");
    }
}

class HybridVehicle extends Vehicle{
    @Override
    public void resource() {                            //Переопределяем метод resource наследуемого от класса Vehicle для класса Hybrid
        System.out.println("I use both petrol and electricity");
    }
}
