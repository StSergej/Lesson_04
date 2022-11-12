package sound;

public class Main {
    public static void main(String[] args) {
        Player sound = new Player();
        sound.play();
        sound.record();
        sound.pause();
        sound.stop();
    }
}

class Player implements Playable, Recodable{
    @Override
    public void play() {
        System.out.println("Выполняется проигрование");
    }
    @Override
    public void record() {
        System.out.println("Выполняется запись!");
    }
    @Override
    public void pause() {
        System.out.println("Пауза");
    }
    @Override
    public void stop() {
        System.out.println("Остановка");
    }
}

