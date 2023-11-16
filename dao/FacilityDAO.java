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
	public void insertFacility(Facility fac) throws Exception {
        Connection con = null;
        con = getConnection();
        PreparedStatement st = con.prepareStatement("INSERT INTO FACILITY (fac_id, fac_name, fac_addres, access, sport_kind, equi, fac_open, fac_end, holi, term, book_meth, rental_equ, dead_day, lot_day, fac_note, name_ad, mail_ad, phone_id, password_ad, seacret_ques_ad, seacret_ans_ad, baseball, basketball, valley, badminton, tabletennis, kendo, judo, kyudo, swimming, athletics, skate, boxing, tennis) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        st.setString(1, fac.getFacId());
        st.setString(2, fac.getFacName());
        st.setString(3, fac.getFacAddress());
        st.setDate(4,fac.getAccess());
        st.setString(5, fac.getSportKind());
        st.setString(6, fac.getEqui());
        st.setTime(7, fac.getFacOpen());
        st.setTime(8, fac.getFacEnd());
        st.setDate(9,  fac.getHoli());
        st.setString(10, fac.getTerm());
        st.setString(11, fac.getBookMeth());
        st.setString(12, fac.getRentalEqu());
        st.setTimestamp(13, fac.getDeadDay());
        st.setTimestamp(14, fac.getLotDay());
        st.setString(15, fac.getFacNote());
        st.setString(16, fac.getNameAd());
        st.setString(17, fac.getMailAd());
        st.setString(18, fac.getPhoneAd());
        st.setString(19, fac.getPasswordAd());
        st.setInt(20, fac.getSecretQuesAd());
        st.setString(21, fac.getSecretAnsAd());
        st.setInt(22, fac.getBaseball());
        st.setInt(23, fac.getBasketball());
        st.setInt(24, fac.getValley());
        st.setInt(25, fac.getBadminton());
        st.setInt(26, fac.getTabletennis());
        st.setInt(27, fac.getKendo());
        st.setInt(28, fac.getJudo());
        st.setInt(29, fac.getKyudo());
        st.setInt(30, fac.getSwimming());
        st.setInt(31, fac.getAthletics());
        st.setInt(32, fac.getSkate());
        st.setInt(33, fac.getBoxing());
        st.setInt(34, fac.getTennis());
        st.executeUpdate();
}

    public void updateFacility(Facility fac) throws Exception {
        Connection con = getConnection();
        PreparedStatement st = con.prepareStatement("UPDATE FACILITY SET fac_name=?, fac_addres=?, access=?, sport_kind=?, equi=?, fac_open=?, fac_end=?, holi=?, term=?, book_meth=?, rental_equ=?, dead_day=?, lot_day=?, fac_note=?, name_ad=?, mail_ad=?, phone_id=?, password_ad=?, seacret_ques_ad=?, seacret_ans_ad=?, baseball=?, basketball=?, valley=?, badminton=?, tabletennis=?, kendo=?, judo=?, kyudo=?, swimming=?, athletics=?, skate=?, boxing=?, tennis=? WHERE fac_id=?");

        st.setString(1, fac.getFacName());
        st.setString(2, fac.getFacAddress());
        st.setDate(3, fac.getAccess());
        st.setString(4, fac.getSportKind());
        st.setString(5, fac.getEqui());
        st.setTime(6, fac.getFacOpen());
        st.setTime(7, fac.getFacEnd());
        st.setDate(8, fac.getHoli());
        st.setString(9, fac.getTerm());
        st.setString(10, fac.getBookMeth());
        st.setString(11, fac.getRentalEqu());
        st.setTimestamp(12, fac.getDeadDay());
        st.setTimestamp(13, fac.getLotDay());
        st.setString(14, fac.getFacNote());
        st.setString(15, fac.getNameAd());
        st.setString(16, fac.getMailAd());
        st.setString(17, fac.getPhoneAd());
        st.setString(18, fac.getPasswordAd());
        st.setInt(19, fac.getSecretQuesAd());
        st.setString(20, fac.getSecretAnsAd());
        st.setInt(21, fac.getBaseball());
        st.setInt(22, fac.getBasketball());
        st.setInt(23, fac.getValley());
        st.setInt(24, fac.getBadminton());
        st.setInt(25, fac.getTabletennis());
        st.setInt(26, fac.getKendo());
        st.setInt(27, fac.getJudo());
        st.setInt(28, fac.getKyudo());
        st.setInt(29, fac.getSwimming());
        st.setInt(30, fac.getAthletics());
        st.setInt(31, fac.getSkate());
        st.setInt(32, fac.getBoxing());
        st.setInt(33, fac.getTennis());
        st.setString(34, fac.getFacId());

        st.executeUpdate();
    }
}
