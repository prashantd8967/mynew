interface Clickable {
    default void click() {
        System.out.println("click");
    }
}

interface Accessible {
    default void access() {
        System.out.println("access");
    }
}
public class Lamb5 implements Clickable, Accessible {
    public static void main(String[] args) {
        Lamb5 button = new Lamb5();
        button.click();
        button.access();
    }

}

