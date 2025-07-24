package 오민수;

public class Member {
	//필드
	public int memberId;
	public String name;
	public String gender;
	public String phone;
	public String registration;
	public String subscribe;
    
    //생성자
    public Member(int memberId, String name, String gender, String phone, String registration, String subscribe) {
        this.memberId = memberId;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.registration = registration;
        this.subscribe = subscribe;
    }
    
    //메소드
}
