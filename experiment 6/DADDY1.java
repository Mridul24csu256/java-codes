class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}
interface Pet {
    void play();
}
interface Wild {
    void hunt();
}
class Dog extends Animal implements Pet, Wild {
    public void play() {
        System.out.println("Dog loves to play!");
    }
    public void hunt() {
        System.out.println("Dog hunts when trained.");
    }
}
public class DADDY1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.play();
        d.hunt();
    }
}
