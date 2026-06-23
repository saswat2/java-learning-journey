class Book{
    int bookId;
    String title ;
    String author;
    double price;

    Book(int bookId,String title, String author, double price){
        this.bookId = bookId;
        this.title = title ;
        this.author = author;
        this.price = price;

    }
    void display(){
        System.out.println("Booked ID: "+ bookId);
        System.out.println("Tittle : "+ title );
        System.out.println("Author :" + author);
        System.out.println("Price :" + price);
    }
}
public class BookDemo {
    public static void main(String[] args) {

        Book b1 =
                new Book(101, "Java Programming", "James Gosling", 599);

        b1.display();
    }
}