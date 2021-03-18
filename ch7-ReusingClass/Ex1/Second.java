public class Second {
    Simple simple;
    String s;

    public Second(String si) {
        s = si; // 'simple' not initialized
    }

    public void check() {
        if(simple == null)
            System.out.println("not initialized");
        else
            System.out.println("initialized");
    }

    private Simple lazy() {
        if(simple == null) {
            System.out.println("Creating Simple");
            simple = new Simple(s);
        }
        return simple;
    }

    public Simple getSimple() { return lazy(); }

    public String toString() {
        return lazy().toString();
    }

    public void setSimple(String sNew) {
        lazy().setString(sNew);
    }
}
