package com.filehandling.pll;

import java.io.File;

import com.filehandling.bll.Car;
import com.filehandling.bll.CarList;



public class CarTest {

		public static void main(String[] args) {
			try {
			Car car1 = new Car("Hyundai Grand i10 Nios",2022,0,500000.42);
			Car car2 = new Car("Maruti Grand Vitara",2022,0,1000000.45);
			Car car3 = new Car("Tata Nexon",2022,0,700000.59);
			Car car4 = new Car("Toyota Fortuner",2022,0,3200000.58);
			
			Car[] cars=new Car[ ] {car1,car2,car3,car4};//cars list
			
			File f= new File("Car.txt");//create file
			f.delete();
			
			CarList carList= new CarList("Car.txt");

			for(Car c:cars) {
				carList.addCar(c);
				
			}
			System.out.println("New Cars :" +carList.countNewCars());
			
			System.out.println("More expensive Car -" +carList.mostExpensiveCar());		
			
			carList.removeCar(car4);
			System.out.println("After Removing car");
			
			System.out.println("New Cars :" +carList.countNewCars());
			
			
			}
			catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
			
		}

	}


