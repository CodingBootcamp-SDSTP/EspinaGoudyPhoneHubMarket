import java.util.ArrayList;

public class CommentItemCollection
{
	ArrayList<CommentItem> comments;

	public CommentItemCollection() {
		comments = new ArrayList<CommentItem>();
	}

	public void addComment(CommentItem comment) {
		comments.add(comment);
	}

	public void removeComment(CommentItem comment) {
		comments.remove(comment);
	}

	public ArrayList<CommentItem> getAllComments() {
		return(comments);
	}

	public CommentItem getCommentByIndex(int n ) {
		return(comments.get(n));
	}

	public int getCommentCount() {
		return(comments.size());
	}
}
