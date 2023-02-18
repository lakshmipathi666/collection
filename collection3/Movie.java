package collection3;

public class Movie {
	public Movie(String movieName,String heroName, int movieReleasedYear, float rating,int price) {
		super();
		this.movieName=movieName;
		this.heroName = heroName;
		this.movieReleasedYear = movieReleasedYear;
		this.rating = rating;
		this.price=price;
	}
	String movieName;
	String heroName;
	int movieReleasedYear;
	float rating;
	int price;
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
	public int getMovieReleasedYear() {
		return movieReleasedYear;
	}
	public void setMovieReleasedYear(int movieReleasedYear) {
		this.movieReleasedYear = movieReleasedYear;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", heroName=" + heroName + ", movieReleasedYear=" + movieReleasedYear
				+ ", rating=" + rating + ", price=" + price + "]";
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
