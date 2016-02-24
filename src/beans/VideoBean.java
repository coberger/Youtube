package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import youtubeBis.Categorie;
import youtubeBis.Video;

@ManagedBean
@SessionScoped
public class VideoBean implements Serializable{

	private List<Video> videos;
	
	@PostConstruct
	public void init() {
		videos = new ArrayList<Video>();
		videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));videos.add(new Video("Video 1", new Categorie("Musique"), "https://www.youtube.com/watch?v=rYEDA3JcQqw"));
		videos.add(new Video("Video 2", new Categorie("Musique"), "My url 2"));
		videos.add(new Video("Video 3", new Categorie("Musique"), "My url 3"));
    }

    public List<Video> getVideos() {
        return videos;
    }
	
}
