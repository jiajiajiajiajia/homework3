package Rectangle;

public class Rectangle {
	public int high;
	public int writh;
	public int area;
	public int perimiterr;
	public int area() {
		 return area=high*writh;
		
	}
	public int perimiterr() {
		 return perimiterr=(high+writh)*2;
		
	}
	public void showAll() {
		System.out.println("它的高是："+high);
		System.out.println("它的宽是："+writh);
		System.out.println("它的面积是："+area);
		System.out.println("它的周长是："+perimiterr);
	}


}
