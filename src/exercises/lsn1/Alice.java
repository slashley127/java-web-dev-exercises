package exercises.lsn1;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        String aliceQuote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String lowerCaseQuote = aliceQuote.toLowerCase();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a search term: ");
        String searchTerm = input.nextLine();

        int index = lowerCaseQuote.indexOf(searchTerm);
        int searchLength = searchTerm.length();

        if(index >= 0){
            System.out.println("Your search term first appears at index " + index + " and is " + searchLength + " characters long");
        } else {
            System.out.println("This search term is not in the given quote");
        }

    }
}
