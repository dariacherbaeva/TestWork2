package task1;

public class Group {
    public static final Group GROUP_5 = new Group ("5");
    String number;

    public Group(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "task1.Group{" +
                "number='" + number + '\'' +
                '}';
    }
}
