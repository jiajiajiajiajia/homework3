package test;

import Vehicle.Vehicle;

public class v {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Vehicle a=new Vehicle();
		a.setBrand("benc");
		a.getBrand();
		a.setColor("black");
		a.getColor();
		a.run();
		Vehicle b=new Vehicle("benz","white",0);
		b.run();

	}

}

