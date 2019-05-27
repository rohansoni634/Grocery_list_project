package array_List;
import java.util.ArrayList;


public class GroceryList {

	private static ArrayList<String> groceryList=new ArrayList<String>();
	
	public void AddItemToGroceryList(String Item) {
		groceryList.add(Item);
	}
	public void printGroceryItem() {
		System.out.println("you have "+groceryList.size()+" item in the list.");
		for(int i=0;i<groceryList.size();i++) {
			System.out.println((i+1)+" : "+groceryList.get(i));
		}
	}
	public void modifyItemInList(int position,String newItem) {
		groceryList.set(position, newItem);
		System.out.println("Grocery Item "+(position+1)+" has beeen modified.");
	}
	public void removeItem(int position) {
		String theItem=groceryList.get(position);
		groceryList.remove(position);
		System.out.println(theItem+" has been removed");
	}
	public String searchItem(String itemToSearch) {
		int position=groceryList.indexOf(itemToSearch);
		if(position>=0) {
			return groceryList.get(position);
		}return null;
	}

}