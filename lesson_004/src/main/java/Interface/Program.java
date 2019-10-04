package Interface;

public class Program {
    public static void main(String[] args) {

        Book b1 = new Book("Java. Complete Referense.", "H. Shildt");
        b1.print();

//        Printable pr = new Printable();
//        pr.print();

//        Printable printable = new Book("Java. Complete Reference", "H. Shildt");
//        printable.print();      //  Java. Complete Reference (H. Shildt)
//        printable = new Journal("Foreign Policy");
//        printable.print();      // Foreign Policy
    }
}

interface Printable {

    void print();
}

class Book implements Printable {
// Abstract !!!!
    String name;
    String author;

    Book(String name, String author) {

        this.name = name;
        this.author = author;
    }

    public void print() {

        System.out.printf("%s (%s) \n", name, author);
    }
}




class Journal implements Printable {

    private String name;

    String getName(){
        return name;
    }

    Journal(String name){

        this.name = name;
    }
    public void print() {
        System.out.println(name);
    }

    class WaterPipe implements Stateable{

        public void printState(int n){
            if(n==OPEN)
                System.out.println("Water is opened");
            else if(n==CLOSED)
                System.out.println("Water is closed");
            else
                System.out.println("State is invalid");
        }
    }
    interface Stateable{

        int OPEN = 1;
        int CLOSED = 0;

        void printState(int n);
    }
}

//abstract //class  Book1 implements Printable, Searchable{

    // реализация класса
//}
