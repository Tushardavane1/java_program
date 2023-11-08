class college1 {
    int id;
    String cname;
    String addcr;

    college1(int id, String cname, String addcr) {
        this.id = id;
        this.cname = cname;
        this.addcr = addcr;
    }
}

class department extends college1 {
    int dno;
    String dname;

    department(int id, String cname, String addcr, int dno, String dname) {
        super(id, cname, addcr);
        this.dno = dno;
        this.dname = dname;

    }

    void display() {
        System.out.println("***************************");
        System.out.println("College id is ::" + id);
        System.out.println("College name is ::" + cname);
        System.out.println("The cadder is the ::" + addcr);
        System.out.println("***************************");

    }
    void display1()
    {
        System.out.println("Department is number ::"+dno);
        System.out.println("Department name is ::"+dname);
        System.out.println("###################################");
    }
}
class college{
    public static void main(String[] args) {
        department obj = new department(38, "Dada patil college", "Karajat,414402", 1, "Computer Science");
        obj.display();
        obj.display1();
    }
}
