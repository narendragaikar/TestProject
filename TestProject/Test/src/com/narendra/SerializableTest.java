package com.narendra;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableTest {
	
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.firstName="Narendra";
		emp.name="Narayan";
		emp.id="12";
		emp.address="Mumbai";
		
		try{
			FileOutputStream file=new FileOutputStream("E://employee.txt");
			ObjectOutputStream out=new ObjectOutputStream(file);
			out.writeObject(emp);
			file.close();
			System.out.println("Serialized data is stored inside employee.txt file");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try{
			FileInputStream file=new FileInputStream("E://employee.txt");
			ObjectInputStream in=new ObjectInputStream(file);
			Employee e=(Employee)in.readObject();
			file.close();
			
			System.out.println("name:"+e.name+" address:"+e.address+" id:"+e.id+" firstName:"+e.firstName);
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}


class Employee extends SuperEmployee{
	String firstName;
	static String address;
}

class SuperEmployee implements Serializable{
	String id;
	transient String name;
	
}
