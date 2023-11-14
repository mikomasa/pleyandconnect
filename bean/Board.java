package bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class Board implements Serializable {

	private String BoardId;
	private String BoardTitle;
	private String BoardPlace;
	private Timestamp BoardDay;
	private String BoardSport;
	private String Message;
	private String UserId;
	public String getBoardId() {
		return BoardId;
	}
	public void setBoardId(String boardId) {
		BoardId = boardId;
	}
	public String getBoardTitle() {
		return BoardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		BoardTitle = boardTitle;
	}
	public String getBoardPlace() {
		return BoardPlace;
	}
	public void setBoardPlace(String boardPlace) {
		BoardPlace = boardPlace;
	}
	public Timestamp getBoardDay() {
		return BoardDay;
	}
	public void setBoardDay(Timestamp boardDay) {
		BoardDay = boardDay;
	}
	public String getBoardSport() {
		return BoardSport;
	}
	public void setBoardSport(String boardSport) {
		BoardSport = boardSport;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
}
