package kr.co.juheon.vo;

import java.util.Objects;

public class MemberVO {
	   private String memId ; 
	   private String memPassword; 
	   private String memName; 
	   private String email; 
	   private String postCode;  
	   private String detailAddress; 
	   private String regiDate;
	   
	   
	   public MemberVO() {
	      super();
	      // TODO Auto-generated constructor stub
	   }
	   
	   
	   public MemberVO(String memId, String memPassword, String memName, String email, String postCode, String detailAddress) {
	      super();
	      this.memId = memId;
	      this.memPassword = memPassword;
	      this.memName = memName;
	      this.email = email;
	      this.postCode = postCode;
	      this.detailAddress = detailAddress;
	   }


	   public String getMemId() {
	      return memId;
	   }
	   public void setMemId(String memId) {
	      this.memId = memId;
	   }
	   public String getMemPassword() {
	      return memPassword;
	   }
	   public void setMemPassword(String memPassword) {
	      this.memPassword = memPassword;
	   }
	   public String getMemName() {
	      return memName;
	   }
	   public void setMemName(String memName) {
	      this.memName = memName;
	   }
	   public String getEmail() {
	      return email;
	   }
	   public void setEmail(String email) {
	      this.email = email;
	   }
	   public String getPostCode() {
	      return postCode;
	   }
	   public void setPostCode(String postCode) {
	      this.postCode = postCode;
	   }
	   public String getDetailAddress() {
	      return detailAddress;
	   }
	   public void setDetailAddress(String detailAddress) {
	      this.detailAddress = detailAddress;
	   }
	   public String getRegiDate() {
	      return regiDate;
	   }
	   public void setRegiDate(String regiDate) {
	      this.regiDate = regiDate;
	   }


	   @Override
	   public int hashCode() {
	      return Objects.hash(detailAddress, email, memId, memName, memPassword, postCode, regiDate);
	   }


	   @Override
	   public boolean equals(Object obj) {
	      if (this == obj)
	         return true;
	      if (obj == null)
	         return false;
	      if (getClass() != obj.getClass())
	         return false;
	      MemberVO other = (MemberVO) obj;
	      return Objects.equals(detailAddress, other.detailAddress) && Objects.equals(email, other.email)
	            && Objects.equals(memId, other.memId) && Objects.equals(memName, other.memName)
	            && Objects.equals(memPassword, other.memPassword) && Objects.equals(postCode, other.postCode)
	            && Objects.equals(regiDate, other.regiDate);
	   }


	   @Override
	   public String toString() {
	      return "MemberVO [memId=" + memId + ", memPassword=" + memPassword + ", memName=" + memName + ", email=" + email
	            + ", postCode=" + postCode + ", detailAddress=" + detailAddress + ", regiDate=" + regiDate + "]";
	   }
}
	   