package shiyan2;

import ppl.Kecheng;

public class Test {
	public static void main(String[] args) {
		  Student stu0 = new Student("��c","Ů",2020310598,"computer");
		  Student stu1 = new Student("ܰa","Ů",2020310608,"computer");
		  Student stu2 = new Student("��a","Ů",2020310777,"math201");
		  Student stu3 = new Student("��h","Ů",2020310666,"dizhi203");
		  Kecheng cour0 = new Kecheng(1001,"����˵","��ѧ¥101","08:00~9:40","����ʦ");
		  Kecheng cour1 = new Kecheng(1002,"����ʵ��","�ۺ�¥901","10:00~11:40","ׯ��ʦ");
		  Kecheng cour2 = new Kecheng(1003,"��д��","��ѧ¥101","13:30~15:00","����ʦ");
		  Teacher t0=new Teacher("����ʦ","Ů",1001);
		  Teacher t1=new Teacher("ׯ��ʦ","��",1002);
		  Teacher t2=new Teacher("����ʦ","Ů",1003);
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
		  Kecheng cour3=new Kecheng(1004,"�ߴ�","��ѧ¥203","8:00~10:00","ׯ��ʦ");
		  t1.addKecheng(cour3);
		  t1.displayCourse();
		 }

}

