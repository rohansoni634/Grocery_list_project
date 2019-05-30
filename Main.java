package array_List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static  Scanner sc=new Scanner(System.in);
	private static  GroceryList grocerylist=new GroceryList();
	public static void main(String[] args) {
		boolean quit=false;
		int choice=0;
		printInstructions();
		while(!quit) {
			System.out.println("Enter choices : ");
			choice=sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
			case 0:
				printInstructions();
				break;
			case 1:
				additemtothelist();
				break;
			case 2:
				printItem();
				break;
			case 3:
				modifyitem();
				break;
			case 4:
				removeitem();
				break;
			case 5:
				searchitem();
				break;
			case 6:
				processArrayList();
			case 7:
				quit=true;
				break;
			}
			
	}
}
	public static void printInstructions() {
		System.out.println("press ");
		System.out.println("0 To print instructions");
		System.out.println("1 To Add an item to the Grocery list");
		System.out.println("2 To print the listed items");
		System.out.println("3 To replace an item with new item");
		System.out.println("4 To remove an from the list");
		System.out.println("5 To seach an item in the list");
	}
	public static void additemtothelist() {
		System.out.println("Enter item name to be inserted in the list : ");
		grocerylist.AddItemToGroceryList(sc.nextLine());
		
	}
	public static void printItem() {
		
		grocerylist.printGroceryItem();
	}
	public static void modifyitem() {
		System.out.println("Enter item to remove : ");
		String item=sc.nextLine();
		System.out.println("Eneter replacement item: ");
		String newitem=sc.nextLine();
		grocerylist.modifyItemInList(item,newitem);
		System.out.println("Grocery Item "+item+" has beeen modified.");
	}
	public static void removeitem() {
		System.out.println("enter item to remove : ");
		String item=sc.nextLine();
		grocerylist.removeItem(item);
	}
	public static void searchitem() {
		System.out.println("Enter item to search in the list :");
		String searchitem=sc.nextLine();
		if(grocerylist.inList(searchitem)) {
			System.out.println("found "+searchitem+" in the grocrylist");
		}else {
			System.out.println("Item not found.");
		}
	}
	public static void processArrayList() {
		ArrayList<String> newList=new ArrayList<String>();
		newList.addAll(grocerylist.getGroceryList());//method to copy entire content of array list
	}

}
