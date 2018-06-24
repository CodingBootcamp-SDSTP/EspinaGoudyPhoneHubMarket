public class Feedback
{
	private int feedbackID;
	private int userID;
	private int postID;
	private String feedbackType;
	private String messageBody;
	private String dateFeedback;

	public Feedback(int feedbackID, int userID, int postID, String feedbackType, String messageBody, String dateFeedback) {
		this.feedbackID = feedbackID;
		this.userID = userID;
		this.postID = postID;
		this.feedbackType = feedbackType;
		this.messageBody = messageBody;
		this.dateFeedback = dateFeedback;
	}

	public int getFeedbackID() {
		return(feedbackID);
	}

	public void setFeedbackID(int feedbackID) {
		this.feedbackID = feedbackID;
	}

	public int getUserID() {
		return(userID);
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public int getPostID() {
		return(postID);
	}

	public void setPostID(int postID) {
		this.postID = postID;
	}

	public String getFeedbackType() {
		return(feedbackType);
	}

	public void setFeedbackType(String feedbackType) {
		this.feedbackType = feedbackType;
	}

	public String getMessageBody() {
		return(messageBody);
	}

	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}

	public String getDateFeedback() {
		return(dateFeedback);
	}

	public void setDateFeedback(String dateFeedback) {
		this.dateFeedback = dateFeedback;
	}
}
