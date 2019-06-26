import java.awt.print.Book;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);



        //Creates 6 instances on BookClass variable
    BookClass tool = new BookClass ("", "", "", "", 0.00);
    BookClass bookOne = new BookClass("Java1001","Head First Java","Kathy Sierra and Bert Bates","Easy to read Java workbook",47.50);
    BookClass bookTwo = new BookClass("Java1002", "Thinking in Java", "Bruce Eckel", "Details about Java under the hood", 20.00);
    BookClass bookThree = new BookClass("Orcl003", "OCP: Oracle Certified Professional Java SE", "Jeanne Boyarsky", "Everything you need to know in one place", 45.00);
    BookClass bookFour = new BookClass("Python1004", "Automate the Boring Stuff with Python", "Al Sweigart", "Fun with Python", 10.50);
    BookClass bookFive = new BookClass("Zombie1005", "The Maker's Guide to the Zombie Apocalypse", "Simon Monk", "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi",16.50);
    BookClass bookSix = new BookClass("Rasp1006", "Raspberry Pi Projects for the Evil Genius", "Donald Norris", "A dozen fiendishly fun projects for the Raspberry Pi!", 14.75);

//        System.out.println(bookOne.displayInfo());                        /* Shows all the book's details
//        System.out.println(bookTwo.displayInfo());
//        System.out.println(bookThree.displayInfo());
//        System.out.println(bookFour.displayInfo());
//        System.out.println(bookFive.displayInfo());
//        System.out.println(bookSix.displayInfo());                                    */


//        System.out.println(BookClass.numOfBooks);                         //To show number of books added to array


        String sku;                                                         //Declares String sku for user to input
        boolean searchAgain = true;                                         //Boolean created for do-while block statement
        String answer = "";
        do {
            System.out.println("Enter the sku to search for book: ");
            sku = keyboard.nextLine();
            tool.skuLookUp(sku);                                                        //Within the BookClass class, there is an array of each book instance created at the start of Main - this method searches that array
            System.out.println(tool.skuLookUp(sku));                                    //This sout prints the return String of the method skuLookUp
            System.out.println("\nWould you like to search for another book?: Y/N");
            answer = keyboard.nextLine();
            if (answer.contains("y") || answer.contains("Y")){
                searchAgain = true;
            } else {
                searchAgain = false;
            }


        } while (searchAgain);
    }

}
