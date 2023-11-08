interface Area {
    float pi = 3.14f;
    float calArea(float x);

}

class Circle implements Area {
    public float calArea(float x) {
        float areacir = pi * x * x;
        return areacir;
    }
}

class Squre implements Area {
    public float calArea(float x1) {
        float areasq = x1 * x1;
        return areasq;

    }
}

class interface1 {
    public static void main(String args[]) {
        // Area a;
        // a = new Circle();
        // float cir = a.calArea(1.2f);
        // System.out.println("Area is the "+cir);
        // a = new Squre();
        // float sq = a.calArea(2.5f);
        // System.out.println("Area of Squre"+sq);
        Circle obj = new Circle();
        float a = obj.calArea(1.2f);
        System.out.println("Area is the " + a);
        Squre obj1 = new Squre();
        float b = obj1.calArea(2.5f);
        System.out.println("Area is the squre" + b);
    }
}