public class Item
{
	private String brandName;
	private String modelName;
	private int price;
	private String description;
	private String itemCondition;

	public Item(String brandName, String modelName, int price, String description, String itemCondition) {
		this.brandName = brandName;
		this.modelName = modelName;
		this.price = price;
		this.description = description;
		this.itemCondition = itemCondition;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandName() {
		return(brandName);
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelName() {
		return(modelName);
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return(price);
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return(description);
	}

	public void setItemCondition(String itemCondition) {
		this.itemCondition = itemCondition;
	}

	public String getItemCondition() {
		return(itemCondition);
	}

	public String toString() {
		return(brandName + modelName + price + description + itemCondition);
	}
}