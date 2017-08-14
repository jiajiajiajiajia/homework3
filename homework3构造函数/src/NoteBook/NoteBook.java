package NoteBook;

import java.awt.print.Printable;

public class NoteBook {
	public String color;
	public int cpu;
	
	public NoteBook() {
		
	}
	public NoteBook(String x,int y) {
		this.color=x;
		this.cpu=y;
	}
	public void Print() {
		System.out.println("笔记本电脑的颜色是："+color);
		System.out.println("笔记本电的CPU是："+cpu);
	}

}
