package com.narendra;

class Person implements Cloneable{
	String name;
	Car car;
	public Person(String name, Car car) {
		this.name = name;
		this.car = car;
	}
	protected Object clone(){	
		try{
			return super.clone();
		}catch(CloneNotSupportedException e){
			System.out.println(e.getMessage());
		}
		return null;
	}	
}
class Car implements Cloneable{
	String name;
	String color;
	
	public Car(String name,String color){
		this.name=name;
		this.color=color;
	}
	protected Object clone(){
		try{
			return super.clone();
		}catch(CloneNotSupportedException e){
			System.out.println(e.getMessage());
		}
		
		return null;
	}
}
public class DeepCopyDemo {

	public static void main(String[] args) {
		
		Car c1=new Car("BMW", "Black");
		Person p1=new Person("ABC", c1);
		Person p2=null;
		
		p2=(Person)p1.clone();
		Car c2=(Car) c1.clone();
		p2.car=c2;
		
		p2.car.color="Red";
		System.out.println("Person 1:"+p1.name+" "+p1.car.color);
		System.out.println("Person 2:"+p2.name+" "+p2.car.color);
		
	}

}
