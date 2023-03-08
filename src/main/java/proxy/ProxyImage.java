package main.java.proxy;

public class ProxyImage implements Graphic {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void draw() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.draw();
    }
}
