package ex_1;

public class Old_1 {
    public static void main(String[] args) {


        Operationable1 op = new Operationable1() {

            public int calculate(int x, int y) {

                return x + y;
            }
        };
        int z = op.calculate(20, 10);
        System.out.println(z); // 30
    }
}

interface Operationable1 {
    int calculate(int x, int y);
}

