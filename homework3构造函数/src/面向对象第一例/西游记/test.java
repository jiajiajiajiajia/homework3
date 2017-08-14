package 面向对象第一例.西游记;

public class test {
	public static void main(String[] args) {
		shenxian tangseng=new shenxian();
		tangseng.name="唐僧";
		tangseng.age=30;
		tangseng.wuqi="法杖";
		tangseng.wulizhi=1;
		tangseng.rennaizhi=10;
		
		shenxian wukong=new shenxian();
		wukong.name="孙悟空";
		wukong.age=600;
		wukong.wuqi="金箍棒";
		wukong.wulizhi=10;
		wukong.rennaizhi=10;
		
		shenxian shaseng=new shenxian();
		shaseng.name="沙和尚";
		shaseng.age=930;
		shaseng.wuqi="月牙铲";
		shaseng.wulizhi=4;
		shaseng.rennaizhi=10;
		
		shenxian bajie=new shenxian();
		bajie.name="八戒";
		bajie.age=730;
		bajie.wuqi="法杖";
		bajie.wulizhi=6;
		bajie.rennaizhi=1;
		
		shaseng.mubiao();
		bajie.quedian("我好吃懒做还怕事。。。");
		shaseng.koutouchan("大师兄    师傅被妖怪抓走了。。。");
	}

}
