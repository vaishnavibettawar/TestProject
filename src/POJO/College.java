package POJO;

public class College implements Cloneable {

	int cid;
	Department dept;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		College college = (College) super.clone();
		Department dept = (Department) college.dept.clone();
		college.dept=dept;
		
		return college;
	}
	
	
}
