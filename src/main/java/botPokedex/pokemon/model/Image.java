package botPokedex.pokemon.model;

public class Image{
    private String sprite;
    private String thumbnail;
    private String hires;

    public Image() {}

    public void setHires(String hires) {
        this.hires = hires;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    public String getSprite() {
        return sprite;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getHires() {
        return hires;
    }
}
