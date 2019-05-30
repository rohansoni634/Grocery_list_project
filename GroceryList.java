package array_List;
import java.util.ArrayList;


public class GroceryList {

	private static ArrayList<String> groceryList=new ArrayList<String>();
	
	
	
	public static ArrayList<String> getGroceryList() {
		return groceryList;
	}
	
	public void AddItemToGroceryList(String Item) {
		groceryList.add(Item);
	}
	public void printGroceryItem() {
		System.out.println("you have "+groceryList.size()+" item in the list.");
		for(int i=0;i<groceryList.size();i++) {
			System.out.println((i+1)+" : "+groceryList.get(i));
		}
	}
	public void modifyItemInList(String currentItem,String newItem) {
		int position=searchItem(currentItem);
		if(position>=0) {
		modifyItemInList(position,newItem);
		}
	}
	private void modifyItemInList(int position,String newItem) {
		groceryList.set(position, newItem);
		//System.out.println("Grocery Item "+(position+1)+" has beeen modified.");
	}
	public void removeItem(String Itemtoremove) {
		int position=searchItem(Itemtoremove);
		if(position>=0) {
			removeItem(position);
			System.out.println(Itemtoremove+" has been removed");
		}
	}
	 void removeItem(int position) {
		groceryList.remove(position);
	}
	private int searchItem(String itemToSearch) {
		return groceryList.indexOf(itemToSearch);
	}
	public boolean inList(String searchitem) {
		int position=searchItem(searchitem);
		if (position>=0) {
			return true;
		}return false;
	}

}