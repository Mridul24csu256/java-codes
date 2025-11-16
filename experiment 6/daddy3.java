interface X {
    void methodX();
}
interface Y {
    void methodY();
}
interface Z extends X, Y {
    void methodZ();
}
class MultiInterface implements Z {
    public void methodX() {
        System.out.println("Method X");
    }
    public void methodY() {
        System.out.println("Method Y");
    }
    public void methodZ() {
        System.out.println("Method Z");
    }
}
public class daddy3 {
    public static void main(String[] args) {
        MultiInterface obj = new MultiInterface();
        obj.methodX();
        obj.methodY();
        obj.methodZ();
    }
}
