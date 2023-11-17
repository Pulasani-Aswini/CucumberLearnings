package linkedinlearning.cucumbercourse;

import java.util.ArrayList;

public class RestaurantMenu {
	ArrayList<RestaurantMenuItem> MenuItems= new ArrayList<RestaurantMenuItem>();

	public boolean AddMenuItems(RestaurantMenuItem newMenuItem){
		// TODO Auto-generated method stub
		System.out.println(MenuItems);
		if(DoesItemExist(newMenuItem)) {
			System.out.println("Duplicate item found");
			throw new IllegalArgumentException("Duplicate Item");
		}
		MenuItems.add(newMenuItem);
		System.out.println(MenuItems);
		return true ;
	}

	public boolean DoesItemExist(RestaurantMenuItem newMenuItem) {
		// TODO Auto-generated method stub
		boolean Exists=false;
		if(MenuItems.contains(newMenuItem.getItemName())) {
			Exists=true;
		}
		return Exists;
	}

}
