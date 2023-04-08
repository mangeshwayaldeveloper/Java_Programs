class Author {
    String aname;
    int age;
    String place;

    Author(String aname, int age, String place) {
        this.aname = aname;
        this.age = age;
        this.place = place;

    }
}

class Book {
    String bname;
    int price;
    Author aut;

    Book(String bname, int price, Author aut) {
        this.bname = bname;
        this.price = price;
        this.aut = aut;
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Author a = new Author("parshant", 22, "Pune");
        Book b = new Book("ek thaa prashant", 99, a);
        System.out.println(b.bname + " " + a.aname);


    }
}
