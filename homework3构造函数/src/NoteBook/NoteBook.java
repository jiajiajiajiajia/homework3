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
		System.out.println("�ʼǱ����Ե���ɫ�ǣ�"+color);
		System.out.println("�ʼǱ����CPU�ǣ�"+cpu);
	}

}
