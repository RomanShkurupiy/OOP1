public class Main {
    public static void main(String[] args) {
      Car car1 = new Car("Automatic", "Gasoline", 2010);
      Car car2 = new Car("Automatic", "Gasoline", 2010);
      Car car3 = new Car("Mechanical", "Gasoline", 2010);
      Car car4 = new Car("Mechanical", "Gas", 2020);
      Car car5 = new Car("Mechanical", "Disel", 2006);
      Car car6 = new Car("Automatic", "Gas", 2001);
      Car car7 = new Car();
car7.setTransmission("Automatic");
car7.setFuel("Gas");
car7.setYear(2012);

        System.out.print("Comparison with '=='. car1 and car2= ");
        System.out.println(car1==car2);
        System.out.print("Comparison with 'equals' by all parameters. car1 and car2= ");
        System.out.println(car1.equals(car2));
        System.out.print("Comparison with 'equals' by all parameters. car3 and car5= ");
        System.out.println(car3.equals(car5));
        System.out.print("Comparison with 'equals' by fuel only. car4 and car6= ");
        System.out.println(car4.equals1(car6));
        System.out.print("Comparison with 'equals' by fuel only. car4 and car5= ");
        System.out.println(car4.equals1(car5));
        System.out.println();
        System.out.println(car6);
        System.out.println("The use of method 'set'");
        System.out.println(car7);
        System.out.println("The use of method 'get'");
        System.out.println(car4.getTransmission());
    }

}