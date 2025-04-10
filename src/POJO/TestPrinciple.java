package POJO;

public class TestPrinciple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Teacher obj = new Teacher(101, "Swati Bettawar" , "Sub. Teacher" , 50000);
		
		Principle princ = new Principle(11 , "Lakshman Verma", "SP College" , obj);

		System.out.println(princ);
		System.out.println(princ.getTeacher().getName());
	}

}
