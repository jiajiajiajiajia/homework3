package ��������һ��.���μ�;

public class test {
	public static void main(String[] args) {
		shenxian tangseng=new shenxian();
		tangseng.name="��ɮ";
		tangseng.age=30;
		tangseng.wuqi="����";
		tangseng.wulizhi=1;
		tangseng.rennaizhi=10;
		
		shenxian wukong=new shenxian();
		wukong.name="�����";
		wukong.age=600;
		wukong.wuqi="�𹿰�";
		wukong.wulizhi=10;
		wukong.rennaizhi=10;
		
		shenxian shaseng=new shenxian();
		shaseng.name="ɳ����";
		shaseng.age=930;
		shaseng.wuqi="������";
		shaseng.wulizhi=4;
		shaseng.rennaizhi=10;
		
		shenxian bajie=new shenxian();
		bajie.name="�˽�";
		bajie.age=730;
		bajie.wuqi="����";
		bajie.wulizhi=6;
		bajie.rennaizhi=1;
		
		shaseng.mubiao();
		bajie.quedian("�Һó����������¡�����");
		shaseng.koutouchan("��ʦ��    ʦ��������ץ���ˡ�����");
	}

}
