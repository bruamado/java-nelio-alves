package entitites;

public class Comment {
	private String text;
	
	public Comment() {
	}
	
	public Comment(String text) {
		this.text = text;
	}
	
	public String get() {
		return text;
	}
	
	@Override
	public String toString() {
		return get();
	}
}
