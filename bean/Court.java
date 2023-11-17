package bean;

import java.io.Serializable;

public class Court implements Serializable {

	private String CourtId;
	private String CourtName;
	private String EquiId;
	private String CourtNote;
	private int UseSta;
	public String getCourtId() {
		return CourtId;
	}
	public void setCourtId(String courtId) {
		CourtId = courtId;
	}
	public String getCourtName() {
		return CourtName;
	}
	public void setCourtName(String courtName) {
		CourtName = courtName;
	}
	public String getEquiId() {
		return EquiId;
	}
	public void setEquiId(String equiId) {
		EquiId = equiId;
	}
	public String getCourtNote() {
		return CourtNote;
	}
	public void setCourtNote(String courtNote) {
		CourtNote = courtNote;
	}
	public int getUseSta() {
		return UseSta;
	}
	public void setUseSta(int useSta) {
		UseSta = useSta;
	}
}