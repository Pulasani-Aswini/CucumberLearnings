package linkedinlearning.cucumbercourse;

import java.util.ArrayList;

public class RestaurantMenu {
	ArrayList<RestaurantMenuItem> MenuItems= new ArrayList<RestaurantMenuItem>();

	public boolean AddMenuItems(RestaurantMenuItem newMenuItem){
		// TODO Auto-generated method stub
		if(DoesItemExist(newMenuItem)) {
			System.out.println("Duplicate item found");
			throw new IllegalArgumentException("Duplicate Item");
		}
		else {
			System.out.println("No Duplicate Item found");
		}
		return MenuItems.add(newMenuItem);
		
	}

	public boolean DoesItemExist(RestaurantMenuItem newMenuItem) {
		// TODO Auto-generated method stub
		boolean Exists=false;
//		for(RestaurantMenuItem item:MenuItems) {
//			System.out.println("Current Iteration get  name"+":  "+item.getItemName());
//			System.out.println("New Item name"+": "+newMenuItem.getItemName());
//			if(item.getItemName().equalsIgnoreCase(newMenuItem.getItemName())) {		
//			       Exists=true;
//			       break;
//			}
//		}
		 if(MenuItems.contains(newMenuItem)) {
           Exists=true;
       }
		return Exists;
	}

}
