package oop_in_java;

public class Car_2_54_prooo {
	String maker_name;
	int age;
	double weight;
	
	Car_2_54_prooo (String maker_name,int age,double weight){
		this.age = age;
		this.maker_name = maker_name;
		this.weight = weight;
	}
	
	void run() {
		System.out.println(this.maker_name+"running");
		
	}
	void stop() {
		System.out.println("stoping...");
		
	}
	void car_math_running() {
		System.out.println("the "+this.maker_name+" is running with a math about "+this.weight+" kg");
	}
}
