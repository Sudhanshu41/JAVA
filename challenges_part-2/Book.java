public class Book {
    String title;
    String author;
    String isbn;
    static int totalBooks ;
    boolean isBorrowed ;
    static{
        totalBooks=0;
    }
    {
        totalBooks++;
    }
    Book(String title, String author, String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    Book(String isbn){
        this("Unknown","Unknown",isbn);
    }

     void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed");
        }
        else {
            this.isBorrowed=true;
            System.out.println("Enjoy "+title);
        }

    }
     void returnBook(){
        if(isBorrowed){
            this.isBorrowed=false;
            System.out.println("Hope you enjoyed the book");
        } else {
            System.out.println("The book is already in the library");
        }
    }
    static int  getTotalBooks(){
         return totalBooks;
    }

    public static void main(String[] args) {
        Book book1 = new Book("Book 1",null,"Book 2");
        book1.borrowBook();
        book1.borrowBook();
        book1.returnBook();
        book1.returnBook();
        System.out.println(book1.title);

        System.out.println(Book.getTotalBooks());
    }
}
