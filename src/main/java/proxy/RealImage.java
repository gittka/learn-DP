package main.java.proxy;

public class RealImage implements Graphic{
    private String fileName;
    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void draw() {
        System.out.println("Displaying " + fileName);
    }
    public void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName + " from disk");
    }
}
