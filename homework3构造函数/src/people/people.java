package people;

public class people {
	public String name ;
	public int high;
	public int wight;
	
	
	public  people(String name ,int high,int wight) {
		this.high=high;
		this.name=name;
		this.wight=wight;
	}
	public void sayHello() {
		System.out.println("hi������"+name+"���ܸ�����ʶ�㣡");
	}
	public void basics() {
		System.out.println(name+"�����ǣ�"+wight+"kg,����ǣ�"+high);
	}

}
