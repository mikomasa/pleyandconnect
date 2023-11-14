package bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class Payment implements Serializable {

	private String PayId;
	private String UserId;
	private int Plan;
	private Timestamp LastDay;
	private Timestamp PlanJoin;
	public String getPayId() {
		return PayId;
	}
	public void setPayId(String payId) {
		PayId = payId;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public int getPlan() {
		return Plan;
	}
	public void setPlan(int plan) {
		Plan = plan;
	}
	public Timestamp getLastDay() {
		return LastDay;
	}
	public void setLastDay(Timestamp lastDay) {
		LastDay = lastDay;
	}
	public Timestamp getPlanJoin() {
		return PlanJoin;
	}
	public void setPlanJoin(Timestamp planJoin) {
		PlanJoin = planJoin;
	}

}
