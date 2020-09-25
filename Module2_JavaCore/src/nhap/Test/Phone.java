package nhap.Test;

public class Phone extends Product{
    private String camera;

    public Phone(int id, String price, String url, String camera) {
        super(id, price, url);
        this.camera = camera;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public Phone() {

    }

}

