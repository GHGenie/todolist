
public class TodoListItem {
	private String description;
	private int priority;
	private boolean isMarked;
	public TodoListItem(String description, int priority) {
		this.description = description;
		this.priority = priority;
		this.isMarked = false;
	}

	public String getDescription() {
		return this.description;
	}

	public int getPriority() {
		return this.priority;
	}

	public boolean isDone() {
		return this.isMarked;
	}

	public void markDone() {
		isMarked = true;
	}

}
