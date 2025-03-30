package e1;

public class MediaPlayer implements Playable, Pauseable {
    // 여기에 MediaPlayer 클래스 내용을 작성하세요.

    @Override
    public void pause() {
        System.out.println("Paused.");
    }

    @Override
    public void play() {
        System.out.println("Playing...");
    }
}
