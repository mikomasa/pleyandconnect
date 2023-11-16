package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.FacPhoto;

public class FacPhotoDAO extends DAO {

    public List<FacPhoto> selectAll() throws Exception {
        List<FacPhoto> list = new ArrayList<>();
        Connection con = getConnection();
        PreparedStatement st = con.prepareStatement("SELECT * FROM FACPHOTO");
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            FacPhoto fp = new FacPhoto();
            fp.setFacImg(rs.getString("fac_img"));
            fp.setFacId(rs.getString("fac_id"));
            fp.setFacPass(rs.getString("fac_pass"));
            list.add(fp);
        }
        return list;
    }

    public void insert(FacPhoto facPhoto) throws Exception {

        Connection con = getConnection();
        PreparedStatement st = con.prepareStatement("INSERT INTO FACPHOTO (fac_img, fac_id, fac_pass) VALUES (?, ?, ?)");
        st.setString(1, facPhoto.getFacImg());
        st.setString(2, facPhoto.getFacId());
        st.setString(3, facPhoto.getFacPass());
        st.executeUpdate();
    }

    public void update(FacPhoto facPhoto) throws Exception {
    	Connection con = getConnection();
    	PreparedStatement st = con.prepareStatement("UPDATE FACPHOTO SET fac_img=?, fac_pass=? WHERE fac_id=?");
        st.setString(1, facPhoto.getFacImg());
        st.setString(2, facPhoto.getFacPass());
        st.setString(3, facPhoto.getFacId());
        st.executeUpdate();

    }
}
