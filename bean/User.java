package bean;

import java.io.Serializable;
import java.sql.Date;

public class User implements Serializable {

	private String UserName;
	private String UserId;
	private String Nick;
	private Date Birthday;
	private String Address;
	private String Phone;
	private String Mail;
	private String Password;
	private int SecretQues;
	private String SecretAns;
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getNick() {
		return Nick;
	}
	public void setNick(String nick) {
		Nick = nick;
	}
	public Date getBirthday() {
		return Birthday;
	}
	public void setBirthday(Date birthday) {
		Birthday = birthday;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public int getSecretQues() {
		return SecretQues;
	}
	public void setSecretQues(int secretQues) {
		SecretQues = secretQues;
	}
	public String getSecretAns() {
		return SecretAns;
	}
	public void setSecretAns(String secretAns) {
		SecretAns = secretAns;
	}



}