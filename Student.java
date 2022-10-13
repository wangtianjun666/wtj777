package shiyan2;

import ppl.Kecheng;
import ppl.People;

public class Student extends People {
	String major; //专业
	public Student(String namee,String ssex,int num,String ma){
		name=namee;
		sex=ssex;
		number=num;
		major=ma;
		kecheng=new Kecheng[5];
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
	
	//学生选课
	public boolean choseKecheng(Kecheng course){
		boolean flag=false;
		for(int i=0;i<this.kecheng.length;i++){
			if(kecheng[i]==null){
				kecheng[i]=course;
				flag=true;
				break;
			}
		}
		return flag;
	}
	//学生退课
	public boolean removeKecheng(Kecheng course){
		boolean flag=false;
		for(int i=0;i<this.kecheng.length;i++){
			if(kecheng[i]==course){
				kecheng[i]=null;
				flag=true;
		    break;
			}
		} 
	return flag;
	}
	//打印学生所选的课程
	public void displayCourse(){
		System.out.println("学生"+this.name+"所选课程有：");
		for(Kecheng c:kecheng){
			if(c!=null){
				System.out.print("\n "+c.getname()+" "+c.getnumber()+" "
						+c.getplace()+" "+c.gettime()+" "+c.getteacher());
			}
		}
		System.out.println();
	}
}

