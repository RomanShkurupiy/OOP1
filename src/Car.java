public class Car {
    private String transmission;
    private String fuel;
    private int year;
    public Car(String transmission, String fuel, int year) {
        this.transmission = transmission;
        this.fuel = fuel;
        this.year = year;
    }
    public Car() {
    }
    public String getTransmission() {
        return transmission;
    }
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    public String getFuel() {
        return fuel;
    }
    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
    public int getYear() {
        return year;
    }
    public void setYear (int year) {
        this.year = year;
    }
    public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null) return false;
    if (!(o instanceof Car)) return false;
    Car car = (Car) o;
    return transmission.equals(car.transmission) &&
            fuel.equals(car.fuel) &&
            year == car.year;
    }
    //I used method 'equals1' to compare by only one parameter. Method 'equals' compares by all parameter
    public boolean equals1(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return  fuel.equals(car.fuel);
    }
    @Override
//    public String toString() {
//        return "Car{" +
//                "transmission='" + transmission + '\''+
//                ", fuel='" + fuel + '\'' +
//                ", year=" + year +
//                '}';
//    }
    public String toString() {
        return "Car" + '\n' +
                "transmission='" + transmission + '\''+ '\n' +
                "fuel='" + fuel + '\'' + '\n' +
                "year=" + year;
    }


}
