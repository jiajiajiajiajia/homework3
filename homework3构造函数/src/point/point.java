package point;

public class point {
	public int x;
	public int y;
	
	
	public void point() {
		
	}
	public point(int i, int j) {
		this.x=i;
		this.y=j;
	}
	
	public void movePoint(int dx,int dy) {
		this.x=x+dx;
		this.x=y+dy;
		System.out.println("�ƶ������������ǣ�("+x+","+y+")");
	}

}
