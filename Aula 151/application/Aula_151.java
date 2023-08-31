package application;

//	import java.text.SimpleDateFormat;

import entitites.Comment;
import entitites.Post;

public class Aula_151 {

	public static void main(String[] args) {
		Post post1 = new Post("Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
		post1.addComment(new Comment ("Have a nice trip"));
		post1.addComment(new Comment ("Wow that's awesome!"));
		
		Post post2 = new Post("Good night guys", "See you tomorrow", 5);
		post2.addComment(new Comment ("Good night"));
		post2.addComment(new Comment ("May the force be with you"));
		
		
		System.out.println(post1);
		System.out.println(post2);
		
		/*
		 *	// OR WITHOUT USING toString():
		 *	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		 * // Post 1: System.out.println(post1.getTitle());
		 * System.out.print(post1.getLikes() + " Likes - ");
		 * System.out.println(formatter.format(post1.getMoment()));
		 * System.out.println("Comments:"); for (Comment c : post1.getComments()) {
		 * System.out.println(c.get()); }
		 * 
		 * 
		 * System.out.println();
		 * 
		 * // Post 2: System.out.println(post2.getTitle());
		 * System.out.print(post2.getLikes() + " Likes - ");
		 * System.out.println(formatter.format(post2.getMoment()));
		 * System.out.println("Comments:"); for (Comment c : post2.getComments()) {
		 * System.out.println(c.get()); }
		 */

	}
}