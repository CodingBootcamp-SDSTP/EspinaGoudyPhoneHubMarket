import java.math.BigDecimal;

public class PostItem
{
	private int postID;
	private int phoneID;
	private String postType;
	private String itemCondition;
	private BigDecimal price;
	private String photo;
	private String description;
	private String datePosted;
	private int userID;

	public PostItem(int postID, int phoneID, String postType, String itemCondition, BigDecimal price, String photo, String description, String datePosted, int userID) {
		this.postID = postID;
		this.phoneID = phoneID;
		this.postType= postType;
		this.itemCondition = itemCondition;
		this.price = price;
		this.photo = photo;
		this.description = description;
		this.datePosted = datePosted;
		this.userID = userID;
	}

	public int getPostID() {
		return(postID);
	}

	public void setPostID(int postID) {
		this.postID = postID;
	}

	public int getPhoneID() {
		return(phoneID);
	}

	public void setPhoneID(int phoneID) {
		this.phoneID = phoneID;
	}

	public String getPostType() {
		return(postType);
	}

	public void setPostType(String postType) {
		this.postType = postType;
	}

	public String getItemCondition() {
		return(itemCondition);
	}

	public void setItemCondition(String itemCondition) {
		this.itemCondition = itemCondition;
	}

	public BigDecimal getPrice() {
		return(price);
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getPhoto() {
		return(photo);
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getDescription() {
		return(description);
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDatePosted() {
		return(datePosted);
	}

	public void setDatePosted(String datePosted) {
		this.datePosted = datePosted;
	}

	public int getUserID() {
		return(userID);
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}
}
