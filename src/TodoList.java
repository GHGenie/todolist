import java.util.ArrayList;
import java.util.List;

public class TodoList {
    /*
     * Add a new item to the list, given a description and priority.
     */
	List <TodoListItem> listOfItems = new ArrayList<>();
	
    public void addItem(String description, int priority) {
        // TODO
    	TodoListItem item = new TodoListItem(description, priority);
    	listOfItems.add(item);
    }
    
    /*
     * Get the item at a given index.
     */
    public TodoListItem getItem(int index) {
        return listOfItems.get(index);
    }
    /*
     * Get the number of items in the list.
     */
    public int size() {
        return listOfItems.size();
    }
    
    /*
     * Find the first item in the list which is not marked "done".
     * If all items are marked "done", this method returns null.
     */
    public TodoListItem findFirstNotDone() {
        // TODO
    	TodoListItem myitem = null;
    	for(int i = 0; i < listOfItems.size(); i++) {
    		myitem = listOfItems.get(i);
    		
    		if(myitem.isDone()) {
    			continue;
    		} else {
    			return myitem;
    		}
    	}
        return myitem;
    }
    
    /*
     * Find the highest-priority item which is not marked "done".
     * If all items are marked "done", this method returns null.
     */
    public TodoListItem findHighestPriorityNotDone() {
        // TODO
        return null;
    }
    
    /*
     * Search for items whose description contains the given text.
     * The descriptions are returned in a list.
     */
    public List<String> search(String text) {
        // TODO
        return null;
    }
}
