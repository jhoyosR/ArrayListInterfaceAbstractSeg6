package concesionarioEj4;

import java.util.ArrayList;

public class Concessionaire extends ConcessionaireAbs{
    private String name;
    private String address;
    private int amountOfCars;
    public ArrayList<Car> cars;

    public Concessionaire(String name, String address) {
        this.name = name;
        this.address = address;
        this.amountOfCars = 0;
        this.cars = new ArrayList<>();
    }

    @Override
    public void addCar(Car car){
        cars.add(car);
    }
    @Override
    public void deleteCar(String licensePlate){
        cars.removeIf(car -> car.getLicensePlate().equals(licensePlate));
    }
    @Override
    public String getInfo(){
        return "The concessionaire " + name + "located in " + address;
    }
    @Override
    public boolean sellCar(String licensePlate){
        if (cars.removeIf(car -> car.getLicensePlate().equals(licensePlate))){
            return true;
        } else return false;
    }
    @Override
    public void showCars(){
        for (Car car : cars){
            System.out.println(car);
        }
    }

    @Override
    public String toString() {
        return "Concessionaire{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", amountOfCars=" + amountOfCars +
                ", cars=" + cars +
                '}';
    }
}