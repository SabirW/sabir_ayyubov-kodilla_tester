public class SimpleArray {
    public static void main(String[] args) {
    String [] movies =  new String[5];

    movies[0] = "Gladiator";
    movies[1] = "Prestige";
    movies[2] = "Oppenheimer";
    movies[3] = "Lucy";
    movies[4] = "Joker";

    String favoriteMovie = movies[2];
    System.out.println(favoriteMovie);

    int numberOfMovies = movies.length;
    System.out.println("My array contains " + numberOfMovies + " elements");
    }
}
