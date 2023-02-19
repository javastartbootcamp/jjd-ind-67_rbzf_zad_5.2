package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Room room = new Room(12, 23.5, 20, true);
        System.out.println(room.getInfo());
        System.out.println(room.decreaseTemp());
        System.out.println(room.decreaseTemp());
        System.out.println(room.decreaseTemp());
        System.out.println("po zmianie:");
        System.out.println(room.getInfo());

    }
}
