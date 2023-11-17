package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.IdPhoto;

public class IdPhotoDAO extends DAO {

    public List<IdPhoto> selectAll() throws Exception {
        List<IdPhoto> list = new ArrayList<>();
        Connection con = getConnection();
        PreparedStatement st = con.prepareStatement("SELECT * FROM IDPHOTO");
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            IdPhoto idp = new IdPhoto();
            idp.setUserImg(rs.getString("user_img"));
            idp.setUserId(rs.getString("user_id"));
            idp.setUserPass(rs.getString("user_pass"));
            list.add(idp);
        }
        return list;
    }

    public void insert(IdPhoto idPhoto) throws Exception {
        Connection con = getConnection();
        PreparedStatement st = con.prepareStatement("INSERT INTO IDPHOTO (user_img, user_id, user_pass) VALUES (?, ?, ?)");

        st.setString(1, idPhoto.getUserImg());
        st.setString(2, idPhoto.getUserId());
        st.setString(3, idPhoto.getUserPass());

        st.executeUpdate();
        st.close();
        con.close();
    }
}

