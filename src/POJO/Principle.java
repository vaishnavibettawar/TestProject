package POJO;

public class Principle {
	
	private int pid;
	private String pname;
	private String college;
	private Teacher teacher;
	
	public Principle() {
		// TODO Auto-generated constructor stub
	}
//		          					 
	public Principle(int pid, String pname, String college, Teacher teacher) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.college = college;
		this.teacher = teacher;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Principle [pid=" + pid + ", pname=" + pname + ", college=" + college + ", teacher=" + teacher + "]";
	}
	
	

}