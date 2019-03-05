package FigureOOP;

public class Main {

    public static void main(String[] args) {
        //Figure circle = new Circul(1);
        Figure triangl = new StraightForwardTriangl(2,3);
        Figure rectangle = new Rectangular(3,4);
        System.out.println("triangle is: " + triangl.squre() + "\n" +
                //"circle squre is: " + circle.squre() +
                "\n rectangle squire is: " + rectangle.squre());

        StringBuilder sb = new StringBuilder();
        sb = sb.append("sss");

        System.out.println();

    }
}