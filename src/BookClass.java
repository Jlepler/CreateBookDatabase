import java.awt.print.Book;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

/*





*/
public class BookClass {

    private String sku;                             //Declares variables to be held by instance of BookClass
    private String title;                           //
    private String author;
    private String description;
    private Double price;

    public BookClass() {
    }

    public static int numOfBooks = 0;                                                       //Declares counter variable to count the number of books

    public static ArrayList<ArrayList<String>> book = new ArrayList<ArrayList<String>>();

    public BookClass(String sku, String title, String author, String description, Double price) {
        this.sku = sku;
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;


        ArrayList<String> bookInsert = new ArrayList<>();
        bookInsert.add(0, sku);
        bookInsert.add(1, ("Title: " + title) + "\n\t");
        bookInsert.add(2, ("Author: " + author + "\n\t\t"));
        bookInsert.add(3, ("Description: " + description + "\n\t\t\t"));
        bookInsert.add(4, ("Price: " + price.toString()));

        book.add(numOfBooks, bookInsert);

        numOfBooks++;
    }

    public String skuLookUp(String sku) {
        String bookDetails = "corrupt database";

        for (int i = 0; i < numOfBooks; i++) {

            if (book.get(i).get(0).contains(sku)) {
                //(sku.equalsIgnoreCase(book.get(i).get(0))) {
                bookDetails = book.get(i).toString().substring(sku.length() + 3).replaceAll(", ", " ").replaceAll("]", "");
                break;
            } else {
                if (i == (numOfBooks - 1)) {
                    bookDetails = "Sorry. We did not find the item you are looking for";
                    break;
                }
            }

        }
        return bookDetails;
    }
}


///*************************Below getter statements not needed. Instances are created in Main without using setter

//        public String getSku () {
//            return sku;
//        }
//
//        public String getTitle () {
//            return title;
//        }
//
//        public String getAuthor () {
//            return author;
//        }
//
//        public String getDescription () {
//            return description;
//        }
//
//        public Double getPrice () {
//            return price;
//        }
//
//        public String displayInfo () {
//            return "Sku: " + sku + " Title: " + title + " Author: " + author + " Description: " + description + " Price: " + price;
//
//        }
//    }




