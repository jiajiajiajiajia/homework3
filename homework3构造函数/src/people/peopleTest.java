package people;

public class peopleTest {
	public static void main(String[] args) {
		people a=new people("zhangsan",180,70);
		a.sayHello();
		people b=new people("lisi",188,75);
		b.sayHello();
		b.basics();
	}
}
