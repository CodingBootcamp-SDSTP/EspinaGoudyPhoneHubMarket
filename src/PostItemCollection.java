import java.math.BigDecimal;
import java.util.ArrayList;

public class PostItemCollection
{
	ArrayList<PostItem> items;

	public PostItemCollection() {
		items = new ArrayList<PostItem>();
	}

	public void addPostItem(PostItem item) {
		items.add(item);
	}

	public void removePostItem(PostItem item) {
		items.remove(item);
	}

	public ArrayList<PostItem> getAllPostItems() {
		return(items);
	}

	public PostItem getPostItemByIndex(int n ) {
		return(items.get(n));
	}

	public int getPostItemCount() {
		return(items.size());
	}

	public ArrayList<PostItem> search(String s) {
		PostItem item = null;
		ArrayList<PostItem> pi = new ArrayList<PostItem>();
		String str = s.toLowerCase();
		for(int i = 0; i < getPostItemCount(); i++) {
			item = getPostItemByIndex(i);
			if(matches(item, str)) {
				pi.add(item);
			}
		}
		return(pi);
	}

	public boolean matches(PostItem item, String str) {
		String postType = item.getPostType();
		String itemCondition = item.getItemCondition();
		BigDecimal bd = item.getPrice();
		String price = bd.toString();
		String description = item.getDescription();
		String datePosted = item.getDatePosted();
		String userID = Integer.toString(item.getUserID());
		if(postType.contains(str) || itemCondition.contains(str) ||
				price.contains(str) || description.contains(str) ||
				datePosted.contains(str) || userID.contains(str)) {
			return(true);
		}
		return(false);
	}
}
