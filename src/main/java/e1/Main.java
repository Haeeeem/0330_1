package e1;

public class Main {
    public static void main(String[] args) {
        // 다형성을 활용한 메서드 호출 코드를 작성하세요.
        Playable play = new MediaPlayer();
        Pauseable pause = new MediaPlayer();

        play.play();
        pause.pause();
    }
}
