package kr.co.juheon.vo;


public class MemberVo {
	private String memId;
	private String memPassword;
	private String memName;
	private String email;
	private String postCode;
	private String detailAddress;
	private String regiDate;
	
	
	public MemberVo() { }
	
		
	public MemberVo(String memId, String memPassword, String memName) {
		super();
		this.memId = memId;
		this.memPassword = memPassword;
		this.memName = memName;
	}





	public MemberVo(String memId, String memPassword, String memName, String email, String postCode,
			String detailAddress, String regiDate) {
		super();
		this.memId = memId;
		this.memPassword = memPassword;
		this.memName = memName;
		this.email = email;
		this.postCode = postCode;
		this.detailAddress = detailAddress;
		this.regiDate = regiDate;
	}



	public void setMemId(String memId) {
		this.memId = memId;
	}
	public void setMemPassword(String memPassword) {
		this.memPassword = memPassword;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}
	public void setRegiDate(String regiDate) {
		this.regiDate = regiDate;
	}


	public String getMemId() {
		return memId;
	}


	public String getMemPassword() {
		return memPassword;
	}


	public String getMemName() {
		return memName;
	}


	public String getEmail() {
		return email;
	}


	public String getPostCode() {
		return postCode;
	}


	public String getDetailAddress() {
		return detailAddress;
	}


	public String getRegiDate() {
		return regiDate;
	}



	
}
