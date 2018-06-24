import java.util.ArrayList;

public class FeedbackCollection
{
	ArrayList<Feedback> feedbacks;

	public FeedbackCollection() {
		feedbacks = new ArrayList<Feedback>();
	}

	public void addComment(Feedback feedback) {
		feedbacks.add(feedback);
	}

	public void removeComment(Feedback feedback) {
		feedbacks.remove(feedback);
	}

	public ArrayList<Feedback> getAllComments() {
		return(feedbacks);
	}

	public Feedback getCommentByIndex(int n ) {
		return(feedbacks.get(n));
	}

	public int getCommentCount() {
		return(feedbacks.size());
	}
}
