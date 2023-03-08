package main.java.proxy;

public class Main {
    public static void main(String[] args) {
        Graphic image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.draw();
        System.out.println("");

        //image will not be loaded from disk
        image.draw();
    }
}