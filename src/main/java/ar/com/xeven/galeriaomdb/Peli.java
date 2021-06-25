package ar.com.xeven.galeriaomdb;
import com.fasterxml.jackson.annotation.JsonProperty;
public class Peli {
    @JsonProperty("Title")
    private String title;
    @JsonProperty("Poster")
    private String poster;

    public Peli() {}
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPoster() {
        return poster;
    }
    public void setPoster(String poster) {
        this.poster = poster;
    }
}
