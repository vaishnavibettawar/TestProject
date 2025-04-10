package POJO;

public class CollegeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
         Department deptObj = new Department();
         deptObj.did=111;
         
         College clg = new College();
         clg.cid = 3380;
         clg.dept=deptObj;
         
         College clg1 = (College) clg.clone();
         clg1.cid = 101;
         clg1.dept.did = 222;
         
         System.out.println("First");
         
         System.out.println(clg.cid);
         System.out.println(clg.dept.did);
         
         System.out.println("Second");
         
         System.out.println(clg1.cid);
         System.out.println(clg1.dept.did);

	}

}
