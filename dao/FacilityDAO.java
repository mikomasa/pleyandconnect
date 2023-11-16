package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Facility;

public class FacilityDAO extends DAO {
	public List<Facility> selectAll() throws Exception{

		List<Facility> list = new ArrayList<>();
		Connection con = getConnection();
		PreparedStatement st = con.prepareStatement("SELECT * FROM FACILITY");
		ResultSet rs = st.executeQuery();

		while(rs.next()){
			Facility fac = new Facility();
			fac.setFacId(rs.getString("fac_id"));
			fac.setFacName(rs.getString("fac_name"));
			fac.setFacAddress(rs.getString("fac_addres"));
			fac.setAccess(rs.getDate("access"));
			fac.setSportKind(rs.getString("sport_kind"));
			fac.setEqui(rs.getString("equi"));
			fac.setFacOpen(rs.getTime("fac_open"));
			fac.setFacEnd(rs.getTime("fac_end"));
			fac.setHoli(rs.getDate("holi"));
			fac.setTerm(rs.getString("term"));
			fac.setBookMeth(rs.getString("book_meth"));
			fac.setRentalEqu(rs.getString("rental_equ"));
			fac.setDeadDay(rs.getTimestamp("dead_day"));
			fac.setLotDay(rs.getTimestamp("lot_day"));
			fac.setFacNote(rs.getString("fac_note"));
			fac.setNameAd(rs.getString("name_ad"));
			fac.setMailAd(rs.getString("mail_ad"));
			fac.setPhoneAd(rs.getString("phone_id"));
			fac.setPasswordAd(rs.getString("password_ad"));
			fac.setSecretQuesAd(rs.getInt("seacret_ques_ad"));
			fac.setSecretAnsAd(rs.getString("seacret_ans_ad"));
			fac.setBaseball(rs.getInt("baseball"));
			fac.setBasketball(rs.getInt("basketball"));
			fac.setValley(rs.getInt("valley"));
			fac.setBadminton(rs.getInt("badminton"));
			fac.setTabletennis(rs.getInt("tabletennis"));
			fac.setKendo(rs.getInt("kendo"));
			fac.setJudo(rs.getInt("judo"));
			fac.setKyudo(rs.getInt("kyudo"));
			fac.setSwimming(rs.getInt("swimming"));
			fac.setAthletics(rs.getInt("athletics"));
			fac.setSkate(rs.getInt("skate"));
			fac.setBoxing(rs.getInt("boxing"));
			fac.setTennis(rs.getInt("tennis"));
			list.add(fac);
		}
		st.close();
		con.close();
		return list;
	}
}