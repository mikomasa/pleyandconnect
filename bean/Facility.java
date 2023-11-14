package bean;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

public class Facility implements Serializable {

	private String FacId;
	private String FacName;
	private String FacAddress;
	private Date Access;
	private String SportKind;
	private String Equi;
	private Time FacOpen;
	private Time FacEnd;
	private Date Holi;
	private String term;
	private String BookMeth;
	private String RentalEqu;
	private Timestamp DeadDay;
	private Timestamp LotDay;
	private String FacNote;
	private String NameAd;
	private String MailAd;
	private String PhoneAd;
	private String PasswordAd;
	private int SecretQuesAd;
	private String SecretAnsAd;
	private int Baseball;
	private int soccer;
	private int basketball;
	private int valley;
	private int Badminton;
	private int Tabletennis;
	private int kendo;
	private int Judo;
	private int Kyudo;
	private int Swimming;
	private int Athletics;
	private int Skate;
	private int Boxing;
	private int tennis;
	public String getFacId() {
		return FacId;
	}
	public void setFacId(String facId) {
		FacId = facId;
	}
	public String getFacName() {
		return FacName;
	}
	public void setFacName(String facName) {
		FacName = facName;
	}
	public String getFacAddress() {
		return FacAddress;
	}
	public void setFacAddress(String facAddress) {
		FacAddress = facAddress;
	}
	public Date getAccess() {
		return Access;
	}
	public void setAccess(Date access) {
		Access = access;
	}
	public String getSportKind() {
		return SportKind;
	}
	public void setSportKind(String sportKind) {
		SportKind = sportKind;
	}
	public String getEqui() {
		return Equi;
	}
	public void setEqui(String equi) {
		Equi = equi;
	}
	public Time getFacOpen() {
		return FacOpen;
	}
	public void setFacOpen(Time facOpen) {
		FacOpen = facOpen;
	}
	public Time getFacEnd() {
		return FacEnd;
	}
	public void setFacEnd(Time facEnd) {
		FacEnd = facEnd;
	}
	public Date getHoli() {
		return Holi;
	}
	public void setHoli(Date holi) {
		Holi = holi;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public String getBookMeth() {
		return BookMeth;
	}
	public void setBookMeth(String bookMeth) {
		BookMeth = bookMeth;
	}
	public String getRentalEqu() {
		return RentalEqu;
	}
	public void setRentalEqu(String rentalEqu) {
		RentalEqu = rentalEqu;
	}
	public Timestamp getDeadDay() {
		return DeadDay;
	}
	public void setDeadDay(Timestamp deadDay) {
		DeadDay = deadDay;
	}
	public Timestamp getLotDay() {
		return LotDay;
	}
	public void setLotDay(Timestamp lotDay) {
		LotDay = lotDay;
	}
	public String getFacNote() {
		return FacNote;
	}
	public void setFacNote(String facNote) {
		FacNote = facNote;
	}
	public String getNameAd() {
		return NameAd;
	}
	public void setNameAd(String nameAd) {
		NameAd = nameAd;
	}
	public String getMailAd() {
		return MailAd;
	}
	public void setMailAd(String mailAd) {
		MailAd = mailAd;
	}
	public String getPhoneAd() {
		return PhoneAd;
	}
	public void setPhoneAd(String phoneAd) {
		PhoneAd = phoneAd;
	}
	public String getPasswordAd() {
		return PasswordAd;
	}
	public void setPasswordAd(String passwordAd) {
		PasswordAd = passwordAd;
	}
	public int getSecretQuesAd() {
		return SecretQuesAd;
	}
	public void setSecretQuesAd(int secretQuesAd) {
		SecretQuesAd = secretQuesAd;
	}
	public String getSecretAnsAd() {
		return SecretAnsAd;
	}
	public void setSecretAnsAd(String secretAnsAd) {
		SecretAnsAd = secretAnsAd;
	}
	public int getBaseball() {
		return Baseball;
	}
	public void setBaseball(int baseball) {
		Baseball = baseball;
	}
	public int getSoccer() {
		return soccer;
	}
	public void setSoccer(int soccer) {
		this.soccer = soccer;
	}
	public int getBasketball() {
		return basketball;
	}
	public void setBasketball(int basketball) {
		this.basketball = basketball;
	}
	public int getValley() {
		return valley;
	}
	public void setValley(int valley) {
		this.valley = valley;
	}
	public int getBadminton() {
		return Badminton;
	}
	public void setBadminton(int badminton) {
		Badminton = badminton;
	}
	public int getTabletennis() {
		return Tabletennis;
	}
	public void setTabletennis(int tabletennis) {
		Tabletennis = tabletennis;
	}
	public int getKendo() {
		return kendo;
	}
	public void setKendo(int kendo) {
		this.kendo = kendo;
	}
	public int getJudo() {
		return Judo;
	}
	public void setJudo(int judo) {
		Judo = judo;
	}
	public int getKyudo() {
		return Kyudo;
	}
	public void setKyudo(int kyudo) {
		Kyudo = kyudo;
	}
	public int getSwimming() {
		return Swimming;
	}
	public void setSwimming(int swimming) {
		Swimming = swimming;
	}
	public int getAthletics() {
		return Athletics;
	}
	public void setAthletics(int athletics) {
		Athletics = athletics;
	}
	public int getSkate() {
		return Skate;
	}
	public void setSkate(int skate) {
		Skate = skate;
	}
	public int getBoxing() {
		return Boxing;
	}
	public void setBoxing(int boxing) {
		Boxing = boxing;
	}
	public int getTennis() {
		return tennis;
	}
	public void setTennis(int tennis) {
		this.tennis = tennis;
	}

}
