package oop_in_java;

public class Main {

	public static void main(String[] args) {
		Car_2_54_prooo my_car = new Car_2_54_prooo("mercides",2023,500);
//		System.out.println(my_car.make);
		System.out.println(my_car.weight);
		System.out.println(my_car.maker_name);
		my_car.car_math_running();
		
		Car_2_54_prooo car2 = new Car_2_54_prooo("hi end ",2000,200);
		
		
		System.out.println(car2.age);
		System.out.println(car2.maker_name);
		car2.car_math_running();
		
		
	}

}
