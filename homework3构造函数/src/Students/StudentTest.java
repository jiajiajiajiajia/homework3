package Students;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("请输入学生的数量：");
		Scanner sca = new Scanner(System.in);
		int count=sca.nextInt();
		Students[] stu= new Students [count];
		Students a=new Students();
		Students b=new Students();
		Students c=new Students();

		for(int i = 0;i <count;i++)
		{	
			System.out.println("请输入第"+(i+1)+"个学生的姓名");
			String name = sca.next();
			System.out.println("请输入第"+(i+1)+"个学生的学号");
			int sno = sca.nextInt();
			System.out.println("请输入第"+(i+1)+"个学生的成绩");
			int grade = sca.nextInt();
		    stu[i]=new Students(name,sno,grade) ;
		}
		Students.sort(stu);
	}

}
