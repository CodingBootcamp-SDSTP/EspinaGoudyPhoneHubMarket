public class Message 
{
	private int messageID;
	private int postID;
	private int userID;
	private String messageBody;
	private String dateMessage;

	public Message(int messageID, int postID, int userID, String messageBody, String dateMessage) {
		this.messageID = messageID;
		this.postID = postID;
		this.userID = userID;
		this.messageBody = messageBody;
		this.dateMessage = dateMessage;
	}

	public int getMessageID() {
		return(messageID);
	}

	public void setMessageID(int messageID) {
		this.messageID = messageID;
	}

	public int getPostID() {
		return(postID);
	}

	public void setPostID(int postID) {
		this.postID = postID;
	}

	public int getUserID() {
		return(userID);
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getMessageBody() {
		return(messageBody);
	}

	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}

	public String getDateMessage() {
		return(dateMessage);
	}

	public void setDateMessage(String dateMessage) {
		this.dateMessage = dateMessage;
	}
}
