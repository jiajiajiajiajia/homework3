package Students;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("������ѧ����������");
		Scanner sca = new Scanner(System.in);
		int count=sca.nextInt();
		Students[] stu= new Students [count];
		Students a=new Students();
		Students b=new Students();
		Students c=new Students();

		for(int i = 0;i <count;i++)
		{	
			System.out.println("�������"+(i+1)+"��ѧ��������");
			String name = sca.next();
			System.out.println("�������"+(i+1)+"��ѧ����ѧ��");
			int sno = sca.nextInt();
			System.out.println("�������"+(i+1)+"��ѧ���ĳɼ�");
			int grade = sca.nextInt();
		    stu[i]=new Students(name,sno,grade) ;
		}
		Students.sort(stu);
	}

}
