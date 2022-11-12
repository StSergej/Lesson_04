package handler;

public class TXTHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("Документ открыт.");
    }
    @Override
    void create() {
        System.out.println("Документ создан.");
    }
    @Override
    void change() {
        System.out.println("Документ отредактирован.");
    }
    @Override
    void save() {
        System.out.println("Документ сохранен.");
    }
}
