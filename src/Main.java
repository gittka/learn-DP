import main.java.adapter.client.AudioPlayer;

public class Main {
    public static void main(String[] args) {
        System.out.println("######--------DESIGN PATTERNS--------######");

        AudioPlayer audioPlayer=new AudioPlayer();
        audioPlayer.play("mp4","Sky full of stars");
        audioPlayer.play("vlc", "Cheap Thrills");
        audioPlayer.play("mp3","Twinkle Twinkle");
        audioPlayer.play("avi", "Osho");
    }
}