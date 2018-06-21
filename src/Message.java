public class Message
{
	private int messageID;
	private int messageNumber;
	private String userTo;
	private String userFrom;
	private String subject;
	private String content;
	private String dateSend;
	private int postID;

	public Message(int messageID, int messageNumber, String userTo, String userFrom, String subject, String content, String dateSend, int postID) {
		this.messageID = messageID;
		this.messageNumber = messageNumber;
		this.userTo = userTo;
		this.userFrom = userFrom;
		this.subject = subject;
		this.content = content;
		this.dateSend = dateSend;
		this.postID = postID;
	}

	public void setMessageId(int messageID) {
		this.messageID = messageID;
	}

	public int getMessageId() {
		return(messageID);
	}

	public void setMessageNumber(int messageNumber) {
		this.messageNumber = messageNumber;
	}

	public int getMessageNumber() {
		return(messageNumber);
	}

	public void setUserTo(String userTo) {
		this.userTo = userTo;
	}

	public String getUserTo() {
		return(userTo);
	}

	public void setUserFrom(String userFrom) {
		this.userFrom = userFrom;
	}

	public String getUserFrom() {
		return(userFrom);
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSubject() {
		return(subject);
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return(content);
	}

	public void setDateSend(String dateSend) {
		this.dateSend = dateSend;
	}

	public String getDateSend() {
		return(dateSend);
	}

	public void setPostId(int postID) {
		this.postID = postID;
	}

	public int getPostId() {
		return(postID);
	}
}
