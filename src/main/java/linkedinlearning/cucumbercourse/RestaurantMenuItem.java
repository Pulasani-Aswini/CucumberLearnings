package linkedinlearning.cucumbercourse;

import java.util.Objects;

public class RestaurantMenuItem {
	private String ItemName;
	private String Description;
	private int price;
	
	public RestaurantMenuItem(String itemName, String description, int price) {
		super();
		ItemName = itemName;
		Description = description;
		this.price = price;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getItemName() {
		return ItemName;
	}
	@Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(getClass() != obj.getClass()) {
            return false;
        }
        RestaurantMenuItem menuItem = (RestaurantMenuItem) obj;
        return ItemName==menuItem.getItemName();
    }
    @Override
    public int hashCode() {
        return Objects.hash(price);
    }

}
