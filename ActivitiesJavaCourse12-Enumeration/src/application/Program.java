package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment comments1 = new Comment("Have a nice trip!");
		Comment comments2 = new Comment("Wow that´s awesome");
		
		Post post1 = new Post(formatter.parse("21/06/2018 12:05:44"),
				"Traveling to new Zeeland",
				"I´m going to visit this wonderful country",
				12);
		
		post1.addComment(comments1);
		post1.addComment(comments2);
		
		Comment comments3 = new Comment("Good night");
		Comment comments4 = new Comment("May the force be with you");
		
		Post post2 = new Post(formatter.parse("28/07/2018 23:14:19"),
				"Good night guys",
				"See you tomorrow",
				5);
		
		post2.addComment(comments3);
		post2.addComment(comments4);
		
		System.out.println(post1);
		System.out.println(post2);
		
	}

}
