import java.util.ArrayList;

public class ItemCollection
{
	private ArrayList<Item> items;

	public ItemCollection() {
		items = new ArrayList<Item>();
	}

	public void addItem(Item item) {
		items.add(item);
	}

	public void removeItem(Item item) {
		items.remove(item);
	}

	public ArrayList<Item> getAllItems() {
		return(items);
	}

	public Item getItemByIndex(int n) {
		return(items.get(n));
	}

	public int getItemCount() {
		return(items.size());
	}

	public ArrayList<Item> search(String s) {
		Item item = null;
		ArrayList<Item> itemlist = new ArrayList<Item>();
		String str = s.toLowerCase();
		for(int i = 0; i < getItemCount(); i++) {
			item = getItemByIndex(i);
			if(matches(item, str)) {
				itemlist.add(item);
			}
		}
		return(itemlist);
	}

	public boolean matches(Item item, String str) {
		String brandName = item.getBrandName().toLowerCase();
		String modelName = item.getModelName().toLowerCase();
		String description = item.getDescription().toLowerCase();
		String itemCondition = item.getItemCondition().toLowerCase();
		int price = item.getPrice();
		String ab = Integer.toString(price);
		if(ab.contains(str) || brandName.contains(str) || modelName.contains(str) || description.contains(str) || itemCondition.contains(str)) {
			return(true);
		}
		return(false);
	}
}