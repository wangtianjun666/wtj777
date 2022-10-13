package shiyan2;

import ppl.Kecheng;

public class Test {
	public static void main(String[] args) {
		  Student stu0 = new Student("陈c","女",2020310598,"computer");
		  Student stu1 = new Student("馨a","女",2020310608,"computer");
		  Student stu2 = new Student("艾a","女",2020310777,"math201");
		  Student stu3 = new Student("何h","女",2020310666,"dizhi203");
		  Kecheng cour0 = new Kecheng(1001,"视听说","教学楼101","08:00~9:40","王老师");
		  Kecheng cour1 = new Kecheng(1002,"大物实验","综合楼901","10:00~11:40","庄老师");
		  Kecheng cour2 = new Kecheng(1003,"读写译","教学楼101","13:30~15:00","李老师");
		  Teacher t0=new Teacher("王老师","女",1001);
		  Teacher t1=new Teacher("庄老师","男",1002);
		  Teacher t2=new Teacher("李老师","女",1003);
		  t0.kecheng[0]=cour0;
		  t1.kecheng[0]=cour1;
		  t2.kecheng[0]=cour2;
		  stu0.choseKecheng(cour0);
		  stu0.choseKecheng(cour1);
		  stu0.choseKecheng(cour2);
		  stu1.choseKecheng(cour2);
		  stu1.choseKecheng(cour0);
		  stu2.choseKecheng(cour1);
		  stu3.choseKecheng(cour0);
		  stu3.choseKecheng(cour1);
		  stu1.removeKecheng(cour2);
		  stu0.displayCourse();
		  t0.displayCourse();
		  t1.displayCourse();
		  Kecheng cour3=new Kecheng(1004,"线代","教学楼203","8:00~10:00","庄老师");
		  t1.addKecheng(cour3);
		  t1.displayCourse();
		 }

}

