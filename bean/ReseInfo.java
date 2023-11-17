package bean;

import java.io.Serializable;
import java.sql.Time;

public class ReseInfo implements Serializable {

	private String EquiId;
	private String EquiName;
	private int EquiFee;
	private Time MaxUse;
	private Time MinUse;
	private String FacId;
	private String EquiNote;
	private int BookMeth;
	public String getEquiId() {
		return EquiId;
	}
	public void setEquiId(String equiId) {
		EquiId = equiId;
	}
	public String getEquiName() {
		return EquiName;
	}
	public void setEquiName(String equiName) {
		EquiName = equiName;
	}
	public int getEquiFee() {
		return EquiFee;
	}
	public void setEquiFee(int equiFee) {
		EquiFee = equiFee;
	}
	public Time getMaxUse() {
		return MaxUse;
	}
	public void setMaxUse(Time maxUse) {
		MaxUse = maxUse;
	}
	public Time getMinUse() {
		return MinUse;
	}
	public void setMinUse(Time minUse) {
		MinUse = minUse;
	}
	public String getFacId() {
		return FacId;
	}
	public void setFacId(String facId) {
		FacId = facId;
	}
	public String getEquiNote() {
		return EquiNote;
	}
	public void setEquiNote(String equiNote) {
		EquiNote = equiNote;
	}
	public int getBookMeth() {
		return BookMeth;
	}
	public void setBookMeth(int bookMeth) {
		BookMeth = bookMeth;
	}
}