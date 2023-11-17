package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Payment;

public class PaymentDAO extends DAO {

    public List<Payment> selectAll() throws Exception {
        List<Payment> list = new ArrayList<>();
        Connection con = getConnection();
        PreparedStatement st = con.prepareStatement("SELECT * FROM PAYMENT");
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            Payment pay = new Payment();
            pay.setPayId(rs.getString("pay_id"));
            pay.setUserId(rs.getString("user_id"));
            pay.setPlan(rs.getInt("plan"));
            pay.setLastDay(rs.getTimestamp("last_day"));
            pay.setPlanJoin(rs.getTimestamp("plan_join"));

            list.add(pay);
        }
        return list;
    }

    public void insert(Payment payment) throws Exception {
        Connection con = getConnection();
        PreparedStatement st = con.prepareStatement("INSERT INTO PAYMENT (pay_id, user_id, plan, last_day, plan_join) VALUES (?, ?, ?, ?, ?)");

        st.setString(1, payment.getPayId());
        st.setString(2, payment.getUserId());
        st.setInt(3, payment.getPlan());
        st.setTimestamp(4,	payment.getLastDay());
        st.setTimestamp(5, payment.getPlanJoin());

        st.executeUpdate();
        st.close();
        con.close();
    }
}
