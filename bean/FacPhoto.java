package bean;

import java.io.Serializable;

public class FacPhoto implements Serializable {

	private String FacImg;
	private String FacId;
	private String FacPass;
	public String getFacImg() {
		return FacImg;
	}
	public void setFacImg(String facImg) {
		FacImg = facImg;
	}
	public String getFacId() {
		return FacId;
	}
	public void setFacId(String facId) {
		FacId = facId;
	}
	public String getFacPass() {
		return FacPass;
	}
	public void setFacPass(String facPass) {
		FacPass = facPass;
	}
}
