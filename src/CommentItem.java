public class CommentItem
{
	private int commentID;
	private int postID;
	private int userID;
	private String messageBody;
	private String dateComment;

	public CommentItem(int commentID, int postID, int userID, String messageBody, String dateComment) {
		this.commentID = commentID;
		this.postID = postID;
		this.userID = userID;
		this.messageBody = messageBody;
		this.dateComment = dateComment;
	}

	public int getCommentID() {
		return(commentID);
	}

	public void setCommentID(int commentID) {
		this.commentID = commentID;
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

	public String getDateComment() {
		return(dateComment);
	}

	public void setDateComment(String dateComment) {
		this.dateComment = dateComment;
	}
}
