package vo;

public class SubjectVo {
	private int code;
	private String subject;
	private String room;

	public SubjectVo() {
	}

	public SubjectVo(int code, String subject, String room) {
		this.code = code;
		this.subject = subject;
		this.room = room;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return "SubjectVo [code=" + code + ", subject=" + subject + ", room=" + room + "]";
	}

}
