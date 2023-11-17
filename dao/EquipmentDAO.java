package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Equipment;

public class EquipmentDAO extends DAO {
    public List<Equipment> selectAll() throws Exception {
        List<Equipment> list = new ArrayList<>();
        Connection con = getConnection();
        PreparedStatement st = con.prepareStatement("SELECT * FROM EQUIPMENT");
        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            Equipment equ = new Equipment();
            equ.setEquiId(rs.getString("equi_id"));
            equ.setEquiName(rs.getString("equi_name"));
            equ.setEquiFee(rs.getInt("equi_fee"));
            equ.setMaxUse(rs.getTime("max_use"));
            equ.setMinUse(rs.getTime("min_use"));
            equ.setFacId(rs.getString("fac_id"));
            equ.setEquiNote(rs.getString("equi_note"));
            equ.setReseMeth(rs.getInt("rese_meth"));
            list.add(equ);
        }
		return list;
    }

    public void insertEquipment(Equipment equ) throws Exception {
        Connection con = getConnection();
        PreparedStatement st = con.prepareStatement("INSERT INTO EQUIPMENT (equi_id, equi_name, equi_fee, max_use, min_use, fac_id, equi_note, rese_meth) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
        st.setString(1, equ.getEquiId());
        st.setString(2, equ.getEquiName());
        st.setInt(3, equ.getEquiFee());
        st.setTime(4, equ.getMaxUse());
        st.setTime(5, equ.getMinUse());
        st.setString(6, equ.getFacId());
        st.setString(7, equ.getEquiNote());
        st.setInt(8, equ.getReseMeth());

        st.executeUpdate();
    }
}
