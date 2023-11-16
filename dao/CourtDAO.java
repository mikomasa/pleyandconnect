package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Court;

public class CourtDAO extends DAO {
    public List<Court> selectAll() throws Exception {
    	List<Court> list = new ArrayList<>();
        Connection con = getConnection();
        PreparedStatement st = con.prepareStatement("SELECT * FROM COURT");
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            Court cou = new Court();
            cou.setCourtId(rs.getString("court_id"));
            cou.setCourtName(rs.getString("court_name"));
            cou.setEquiId(rs.getString("equi_id"));
            cou.setCourtNote(rs.getString("court_note"));
            cou.setUseSta(rs.getInt("use_sta"));
            list.add(cou);
        }
        return list;
    }
    public void insertCourt(Court court) throws Exception {
    	Connection con = getConnection();
        PreparedStatement st = con.prepareStatement("INSERT INTO COURT (court_id, court_name, equi_id, court_note, use_sta) VALUES (?, ?, ?, ?, ?)");
        st.setString(1, court.getCourtId());
        st.setString(2, court.getCourtName());
        st.setString(3, court.getEquiId());
        st.setString(4, court.getCourtNote());
        st.setInt(5, court.getUseSta());
        st.executeUpdate();
    }
    public void updateCourt(Court court) throws Exception {
        Connection con = getConnection();
        PreparedStatement st = con.prepareStatement("UPDATE COURT SET court_name=?, equi_id=?, court_note=?, use_sta=? WHERE court_id=?");
        st.setString(1, court.getCourtName());
        st.setString(2, court.getEquiId());
        st.setString(3, court.getCourtNote());
        st.setInt(4, court.getUseSta());
        st.setString(5, court.getCourtId());
        st.executeUpdate();
    }
}
