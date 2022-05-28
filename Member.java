package test;
import java.util.ArrayList;

//A  B = new A(); 하면 A클래스의 B변수명을가진 객체(복사본)생성 
class Member {
	ArrayList<Article> articles = new ArrayList<>();
	//클래스선언	
	String memberId;
	String memberPassword;
	String memberNickname;
	public Member(String data1,String data2, String data3) {
		//생성자
		memberId = data1;
		memberPassword = data2;
		memberNickname = data3;
	}
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPassword() {
		return memberPassword;
	}
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	public String getMemberNickname() {
		return memberNickname;
	}
	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}
}
