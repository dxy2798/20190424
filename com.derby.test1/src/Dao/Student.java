package Dao;

public class Student {
	private int flowid;
	private int type;
	private String idCard;
	private String examCard;
	private String studentName;
	private String location;
	private int grade;
	
	
	
	public Student(int flowid,int type, String idCard, String examCard, String studentName, String location, int grade) {
		super();
		this.flowid = flowid;
		this.type = type;
		this.idCard = idCard;
		this.examCard = examCard;
		this.studentName = studentName;
		this.location = location;
		this.grade = grade;
	}
	
	public int getFlowid() {
		return flowid;
	}

	public void setFlowid(int flowid) {
		this.flowid = flowid;
	}

	public Student() {

	}

	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getExamCard() {
		return examCard;
	}
	public void setExamCard(String examCard) {
		this.examCard = examCard;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [flowid=" + flowid + ", type=" + type + ", idCard=" + idCard + ", examCard=" + examCard
				+ ", studentName=" + studentName + ", location=" + location + ", grade=" + grade + "]";
	}

	

	

}
