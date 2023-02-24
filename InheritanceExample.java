class Vehicle{
	protected String brand = "Ford";
	public void honk() {
		System.out.println("Tuut Tuut!");
	}
	
}

public class InheritanceExample extends Vehicle {
	private String modelName = "Mustang";
	public static void main(String[] args) {
		InheritanceExample car = new InheritanceExample();
		car.honk();
		System.out.println(car.brand+" "+car.modelName);
		
		
	}

}