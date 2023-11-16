package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Court;

public class CourtDAO extends DAO {
	public List<Court> selectAll() throws Exception{

		List<Court> list = new ArrayList<>();
		Connection con = getConnection();
		PreparedStatement st = con.prepareStatement("SELECT * FROM COURT");
		ResultSet rs = st.executeQuery();

		while(rs.next()){
			Court cou = new Court();
			cou.setCourtId(rs.getString("court_id"));
			cou.setCourtName(rs.getString("court_name"));
			cou.setEquiId(rs.getString("equi_id"));
			cou.setCourtNote(rs.getString("court_note"));
			cou.setUseSta(rs.getInt("use_sta"));
			list.add(cou);
		}
		st.close();
		con.close();
		return list;
	}
}