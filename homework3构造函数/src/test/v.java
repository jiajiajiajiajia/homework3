package test;

import Vehicle.Vehicle;

public class v {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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

