package java0709;

public class Game {
	
	private String title;
	private String genre;
	private String platForm;
	
	public Game() {}
	public Game(String title, String genre, String platForm) {
		this.title = title;
		this.genre = genre;
		this.platForm = platForm;
	}
	
	@Override
	public String toString() {
		return title + ", " + genre + ", " + platForm;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPlatForm() {
		return platForm;
	}
	public void setPlatForm(String platForm) {
		this.platForm = platForm;
	}
	
}

// 게임 제목과 장르, 플랫폼
// 장르는 액션, 롤플레잉, FPS 같은 거
// 플랫폼은 PC, PS4, switch, XBOX 같은 거