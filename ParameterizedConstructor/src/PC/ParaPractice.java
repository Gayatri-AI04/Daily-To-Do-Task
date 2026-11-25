package PC;

public class ParaPractice {

	int rollNo;
	String clgName;
	String stream;
	float cgpa;
	
	public ParaPractice() {
		System.out.println("----Default Constructor-----");
	}
	
	ParaPractice(int rollNo1, String clgName1, String stream1, float cgpa1 )
	{
		rollNo=rollNo1;
		clgName=clgName1;
		stream= stream1;
		cgpa=cgpa1;
		
	}
	
	ParaPractice(int rollNo2, String clgName2) {
		
		rollNo=rollNo2;
		clgName=clgName2;
	}
		
	public void disply()
	{
		System.out.println("my rollno is = "+rollNo);
		System.out.println(clgName);
		System.out.println(stream);
		System.out.println(cgpa);
		
	}
	
	public void dis1()
	{
		System.out.println(rollNo);
		System.out.println(clgName);
	}
	public static void main(String[] args) {
		
		ParaPractice p = new ParaPractice(23,"DYP","science",6.9f);
		
		p.disply();
		
		System.out.println("-------------------------");
		
		ParaPractice p2 = new ParaPractice(36,"pvdp");
		
		p2.dis1();
	}

}
