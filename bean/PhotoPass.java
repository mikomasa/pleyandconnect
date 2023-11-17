package bean;

import java.io.Serializable;

public class PhotoPass implements Serializable {

	private String BoardImg;
	private String BoardId;
	private String BoardPass;
	public String getBoardImg() {
		return BoardImg;
	}
	public void setBoardImg(String boardImg) {
		BoardImg = boardImg;
	}
	public String getBoardId() {
		return BoardId;
	}
	public void setBoardId(String boardId) {
		BoardId = boardId;
	}
	public String getBoardPass() {
		return BoardPass;
	}
	public void setBoardPass(String boardPass) {
		BoardPass = boardPass;
	}

}
