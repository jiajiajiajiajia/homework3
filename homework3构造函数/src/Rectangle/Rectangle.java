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
		System.out.println("���ĸ��ǣ�"+high);
		System.out.println("���Ŀ��ǣ�"+writh);
		System.out.println("��������ǣ�"+area);
		System.out.println("�����ܳ��ǣ�"+perimiterr);
	}


}
