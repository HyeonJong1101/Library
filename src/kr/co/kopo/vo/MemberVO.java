package kr.co.kopo.vo;

public class MemberVO {

	private int no; //고유번호 : 회원가입순서대로 주어짐
	private String name;
	private String ID;
	private int password;
	
	public MemberVO() {
		super();
	}
	
	public MemberVO(int no, String name, String iD, int password) {
		super();
		this.no = no;
		this.name = name;
		ID = iD;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "MemberVO [no=" + no + ", name=" + name + ", ID=" + ID + ", password=" + password + "]";
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
}
