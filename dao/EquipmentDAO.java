package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Equipment;

public class EquipmentDAO extends DAO {
	public List<Equipment> selectAll() throws Exception{

		List<Equipment> list = new ArrayList<>();
		Connection con = getConnection();
		PreparedStatement st = con.prepareStatement("SELECT * FROM EQIPMENT");
		ResultSet rs = st.executeQuery();

		while(rs.next()){
			Equipment cou = new Equipment();
			cou.setEquiId(rs.getString("eqi_id"));
			cou.setEquiName(rs.getString("eqi_name"));
			cou.setEquiFee(rs.getInt("equi_fee"));
			cou.setMaxUse(rs.getTime("max_use"));
			cou.setMinUse(rs.getTime("min_use"));
			cou.setFacId(rs.getString("fac_id"));
			cou.setEquiNote(rs.getString("equi_note"));
			cou.setReseMeth(rs.getInt("rese_meth"));
			list.add(cou);
		}
		st.close();
		con.close();
		return list;
	}
}