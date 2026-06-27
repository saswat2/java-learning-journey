public class Movie {

    String movieName;
    String hero;
    double rating;

    Movie(String movieName, String hero, double rating) {
        this.movieName = movieName;
        this.hero = hero;
        this.rating = rating;
    }

    void display() {
        System.out.println("Movie : " + movieName);
        System.out.println("Hero : " + hero);
        System.out.println("Rating : " + rating);
    }

    public static void main(String[] args) {

        Movie m = new Movie("KGF", "Yash", 9.5);

        m.display();
    }
}