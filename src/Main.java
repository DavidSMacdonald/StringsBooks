public class Main {

    public String scroll(String s) {
        return s.substring(1) + s.substring(0,1);
    }

    public String convertName(String n) {
        int x = n.indexOf(",");
        return n.substring(x+2) + " " + n.substring(0,x);
    }

    public String negatives(String n) {

    }

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.scroll("David"));
        System.out.println(m.convertName("Macdonald, David"));
        System.out.println(m.convertName("van Arnam, Steven"));
    }
}