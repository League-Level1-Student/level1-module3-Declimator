
public class Netflix {
public static void main(String[] args) {
	NetflixQueue x = new NetflixQueue();
	Movie m1 = new Movie("The Emoji Movie", 5);
	Movie m2 = new Movie("The Emoji Movie 2", 2);
	Movie m3 = new Movie("The Emoji Movie 3", 3);
	Movie m4 = new Movie("The Emoji Movie 4", 4);
	Movie m5 = new Movie("The Emoji Movie 5", 1);
	System.out.println(m1.getTicketPrice());
	x.addMovie(m1);
	x.addMovie(m2);
	x.addMovie(m3);
	x.addMovie(m4);
	x.addMovie(m5);
	x.printMovies();
	System.out.println("The best movie is " + x.getBestMovie());
	System.out.println("The second best movie is " + x.getMovie(1));
}
}
