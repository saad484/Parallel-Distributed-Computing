package Race;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class Road extends JFrame{
	
	private List<Car> cars;

	public Road(){
		cars = new ArrayList<Car>();
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// TODO Auto-generated constructor stub
	}
	
	public void addCar(Car c) {
		cars.add(c);
	}
	
	public void displayRoad() {
		this.setLayout(new GridLayout(cars.size(),  1));
		
		for (Car c : cars) {
			RaceLine line = new RaceLine();
			line.add(c.getLabel());
			this.getContentPane().add(line);
			
		}
		setVisible(true);
		
		for (Car car : cars) {
			car.start();
		}
	}
	
	
	
}
