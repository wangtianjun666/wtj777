package shiyan2;

import ppl.Kecheng;
import ppl.People;

public class Teacher extends People {
	public Teacher(String namee,String ssex,int num){
		name=namee;
		sex=ssex;
		number=num;
		kecheng=new Kecheng[3];
	}

public String getname(){
	return name;
}
public String getsex(){
	return sex;
}
public int getnumber(){
	return number;
}


//教师开课
public void addKecheng(Kecheng course) {
	for(int i=0;i<this.kecheng.length;i++){
		if(kecheng[i]==null){
			kecheng[i]=course;
			System.out.print("开课成功");
			break;
		}
	
	}
}
//教师所教课程打印
public void displayCourse(){
	System.out.println("\n "+this.name+"所教课程有：");
	for(Kecheng c:kecheng){
		if(c!=null){
			System.out.print("\n "+c.getname()+" "+c.getnumber()+" "
					+c.getplace()+" "+c.gettime());
		}
	}
	System.out.println();
}
}