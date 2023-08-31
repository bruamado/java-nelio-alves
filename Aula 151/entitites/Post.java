package entitites;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment = new Date();
	private String title;
	private String content;
	private Integer likes;
	private List<Comment> comments = new ArrayList<>();
	
	public Post() {
	}
	
	public Post(String title, String content, Integer likes) {
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	
	public Date getMoment() {
		return moment;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setLikes(int likes) {
		this.likes = likes;
	}
	
	public int getLikes() {
		return this.likes == null ? 0 : this.likes;
	}
	
	public List<Comment> getComments(){
		return comments;
	}
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes + " Likes - ");
		sb.append(formatter.format(moment) + "\n");
		sb.append("Comments:\n");
		for (Comment c : comments) {
			sb.append(c.get() + "\n");
		}
		
		return sb.toString();
	}
}
