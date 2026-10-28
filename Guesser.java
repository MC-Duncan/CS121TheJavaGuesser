import java.util.*;

public class Guesser {
  public static void main(String[] args){
    new Guesser();
  } // end main

  public Guesser(){
    Scanner input = new Scanner(System.in);
    boolean keepGoing = true;
    while(keepGoing){
      String response = menu();

      if (response.equals("0")){
        keepGoing = false;
      } else if (response.equals("1")){
        humanGuesser();
      } else if (response.equals("2")){
        computerGuesser();
      } else{
        System.out.println("Please input a valid value.");
      } // end if
    } // end while
  } // end constructor
  
  public String menu(){
    System.out.println("Select an option.");
    System.out.println("0: Exit");
    System.out.println("1: Human Guesser");
    System.out.println("2: Computer Guesser");
    String response = input.nextLine();
    return response;
  } // end menu

  public void humanGuesser(){
    System.out.println("Human Guesser");
  } // end humanGuesser

  public void computerGuesser(){
    System.out.println("Computer Guesser");
  }  // end computerGuesser

} // end Guesser
