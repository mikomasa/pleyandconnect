package bean;

import java.io.Serializable;

public class IdPhoto implements Serializable {

	private String UserImg;
	private String UserId;
	private String UserPass;
	public String getUserImg() {
		return UserImg;
	}
	public void setUserImg(String userImg) {
		UserImg = userImg;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getUserPass() {
		return UserPass;
	}
	public void setUserPass(String userPass) {
		UserPass = userPass;
	}

}
