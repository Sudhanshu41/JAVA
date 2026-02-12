package Library;

public class LibraryItem {
   private int itemID;
   private String Title;
   private String Author;
    void checkout(){
        System.out.println("Checkout");
    }
    void returnitem(){
        System.out.println("Returning the item");
    }
}
