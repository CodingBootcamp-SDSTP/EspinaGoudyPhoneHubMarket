public class Category
{
	private int category_id;
	private String brandName;
	private String modelName;

	public void setCategoryID(int category_id) {
		this.category_id = category_id;
	}

	public int getCategoryId() {
		return(category_id);
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
}
