package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Board;

public class BoardDAO extends DAO {

    public List<Board> selectAll() throws Exception {
        List<Board> list = new ArrayList<>();
        Connection con = getConnection();
        PreparedStatement st = con.prepareStatement("SELECT * FROM BOARD");
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            Board boa = new Board();
            boa.setBoardId(rs.getString("board_id"));
            boa.setBoardTitle(rs.getString("board_title"));
            boa.setBoardPlace(rs.getString("board_place"));
            boa.setBoardDay(rs.getTimestamp("board_day"));
            boa.setBoardSport(rs.getString("board_sport"));
            boa.setMessage(rs.getString("message"));
            boa.setUserId(rs.getString("user_id"));

            list.add(boa);
        }
        return list;
    }

    public void insert(Board board) throws Exception {
        Connection con = getConnection();
        PreparedStatement st = con.prepareStatement("INSERT INTO BOARD (board_id, board_title, board_place, board_day, board_sport, message, user_id) VALUES (?, ?, ?, ?, ?, ?, ?)");

        st.setString(1, board.getBoardId());
        st.setString(2, board.getBoardTitle());
        st.setString(3, board.getBoardPlace());
        st.setTimestamp(4,board.getBoardDay());
        st.setString(5, board.getBoardSport());
        st.setString(6, board.getMessage());
        st.setString(7, board.getUserId());

        st.executeUpdate();
        st.close();
        con.close();
    }
}
