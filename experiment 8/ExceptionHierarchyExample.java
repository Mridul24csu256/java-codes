
class BaseException extends Exception {
    public BaseException(String msg) {
        super(msg);
    }
}

class MidLevelException extends BaseException {
    public MidLevelException(String msg) {
        super(msg);
    }
}

class TopLevelException extends MidLevelException {
    public TopLevelException(String msg) {
        super(msg);
    }
}

class A {
    void display() throws BaseException {
        throw new BaseException("Base Exception from class A");
    }
}


class B extends A {
    @Override
    void display() throws MidLevelException {
        throw new MidLevelException("Mid Level Exception from class B");
    }
}


class C extends B {
    @Override
    void display() throws TopLevelException {
        throw new TopLevelException("Top Level Exception from class C");
    }
}


public class ExceptionHierarchyExample {
    public static void main(String[] args) {
        A obj = new C(); // Upcasting
        try {
            obj.display();
        } catch (BaseException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after exception handling.");
        }
    }
}
