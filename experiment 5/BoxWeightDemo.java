class Box {
    private float width;
    private float height;
    private float depth;

    Box() {
        width = height = depth = 0;
    }

    Box(float w, float h, float d) {
        width = w;
        height = h;
        depth = d;
    }

    Box(Box b) {
        width = b.width;
        height = b.height;
        depth = b.depth;
    }

    public float getWidth() { return width; }
    public void setWidth(float w) { width = w; }
    public float getHeight() { return height; }
    public void setHeight(float h) { height = h; }
    public float getDepth() { return depth; }
    public void setDepth(float d) { depth = d; }

    public void displayVolume() {
        System.out.println("Volume: " + (width * height * depth));
    }
}

class BoxWeight extends Box {
    private float weight;

    BoxWeight() {
        super();
        weight = 0;
    }

    BoxWeight(float w, float h, float d, float m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight(BoxWeight bw) {
        super(bw);
        weight = bw.weight;
    }

    public float getWeight() { return weight; }
    public void setWeight(float m) { weight = m; }

    public void displayWeight() {
        System.out.println("Weight: " + weight);
    }
}

public class BoxWeightDemo {
    public static void main(String[] args) {
    System.out.println("Name: Mridul Sharma");
        System.out.println("Roll No: 24csu256");
        Box b1 = new Box(2, 3, 4);
        b1.displayVolume();

        BoxWeight bw1 = new BoxWeight(2, 3, 4, 10);
        bw1.displayVolume();
        bw1.displayWeight();

        BoxWeight bw2 = new BoxWeight(bw1);
        bw2.displayVolume();
        bw2.displayWeight();
    }
}
