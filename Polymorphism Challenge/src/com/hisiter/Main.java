package com.hisiter;



/* Polymorphism (Đa hình )
 * - 1 đối tượng có thể đóng vai thành 1 đối tượng khác 
 * - phải là CHA
 * - 
 */
class Car {
	private  boolean engine;
	private int cylinder;
	private String name;
	private int wheels;
	
	public Car(int cylinder, String name) {
		this.cylinder = cylinder;
		this.name = name;
		this.engine = true;
		this.wheels = 4;
	}
	
	public boolean isEngine() {
		return engine;
	}

	public int getCylinder() {
		return cylinder;
	}

	public String startEngine()
	{
		return "Car -> startEngine()";
	}
	
	public String accelerate()
	{
		return "Car -> accelerate()";
	}
	
	public String brake()
	{
		return "Car -> brake()";
	}
}

class Misubishi extends Car {
	public Misubishi(int cylinder, String name) {
		super(cylinder, name);
	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName()+"-> startEngine()";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return "Misubishi -> accelerate()";
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return "Misubishi - > brake()";
	}
	}

public class Main {
	public static void main(String args[])
	{
		Car car = new Car(8, "base car");
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());
		
		car = new Misubishi(6, "Outlander WRW 4WD");
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());	
		System.out.println(car.brake());
		
	}
}
