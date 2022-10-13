package ppl;

public class Kecheng {
	private int number;
	private String name;
	private String place;
	private String time;
	private String teacher;
	public Kecheng (int n,String namee,String p,String t,String tt) {
		number=n;
		name=namee;
		place=p;
		time=t;
		teacher=tt;
	}
	public int getnumber() {
		return number;
	}
	public String getname() {
		return name;
	}
	public String getplace() {
		return place;
	}
	public String gettime() {
		return time;
	}
//	public String setteacher() {
//		
//	}
	public String getteacher() {
		return teacher;
	}
}