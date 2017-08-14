package Students;

public class Students {
	public   String name;
	public     int sno;
	public     int grade;
	
	public  Students(String s,int sno,int grade) {
		this.grade=grade;
		this.name=s;
		this.sno=sno;
	}
	
	public Students() {
		// TODO 自动生成的构造函数存根
	}

	public static void sort(Students[] stu) {
		Students temp;
		for(int i=0;i<stu.length;i++) {
			for (int j=0;j<stu.length-1;j++) {
				if (stu[j].grade<stu[j+1].grade) {
					temp=stu[j];
					stu[j]=stu[j+1];
					stu[j+1]=temp;
				}
			
			}
		
	}
		
		
		for (Students students : stu) {
			System.out.println(students.name+"\t"+students.sno+"\t"+students.grade);
		}

	}
	
	
	

	

}
	
