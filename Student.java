package shiyan2;

import ppl.Kecheng;
import ppl.People;

public class Student extends People {
	String major; //רҵ
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
	
	//ѧ��ѡ��
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
	//ѧ���˿�
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
	//��ӡѧ����ѡ�Ŀγ�
	public void displayCourse(){
		System.out.println("ѧ��"+this.name+"��ѡ�γ��У�");
		for(Kecheng c:kecheng){
			if(c!=null){
				System.out.print("\n "+c.getname()+" "+c.getnumber()+" "
						+c.getplace()+" "+c.gettime()+" "+c.getteacher());
			}
		}
		System.out.println();
	}
}

