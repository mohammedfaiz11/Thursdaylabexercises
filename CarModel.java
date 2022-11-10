package javaexamples;

public class CarModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enum car{dodge(1970),mustangGT(2022),Thar(2021);
		private int value;  
		private car(int value){  
		this.value=value;  
		}  
		}
		System.out.println("    Car Name\tModel Year");
		for(car c : car.values())
			System.out.println("    "+c+"\t"+c.value);
	}

}