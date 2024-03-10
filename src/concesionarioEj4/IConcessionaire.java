package concesionarioEj4;

public interface IConcessionaire {
    public void addCar(Car car);
    public void deleteCar(String licensePlate);
    public String getInfo();
    public boolean sellCar(String licensePlate);
    public void showCars();
}
