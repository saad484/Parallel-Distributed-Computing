package Race;

public class Race {

	public static void main(String [] args) {
		Road rd = new Road();
		
		Car c1 = new Car("Car.png");
		Car c2 = new Car("Car.png");
		Car c3 = new Car("Car.png");
		
		
		c1.setSpeed(8);
		c2.setSpeed(10);
		c3.setSpeed(5);
		
		rd.addCar(c1);
		rd.addCar(c2);
		rd.addCar(c3);
		
		rd.displayRoad();
	}
}
