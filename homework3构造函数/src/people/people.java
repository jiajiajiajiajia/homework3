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
		System.out.println("hi，我是"+name+"，很高兴认识你！");
	}
	public void basics() {
		System.out.println(name+"体重是："+wight+"kg,身高是："+high);
	}

}
