import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * this is the class for the Chatbot conversation
 */
class Conversation {

  public Conversation() {
  }
  
/**
 * runs chatbot by asking how many rounds, taking in user inputs, outputting randomized responses, changing pronouns, and storting and printing transcript
 * @param arguments 
 */
  public static void main(String[] arguments) {
    Scanner rounds = new Scanner(System.in);
    System.out.println("How many rounds? ");
    int x = rounds.nextInt();
    String[] transcript = new String[2*(x) + 2 ];
    transcript[0] = "Hi there!  What's on your mind?"; 
    System.out.println("Hi there!  What's on your mind?");
    String[] responses = new String[] { "Interesting", "Mhmm...", "That's cool.", "I agree", "Uh-huh", "Really?"};

    /**
     * replaced pronouns when necessary and otherwise produces random responses
     */
    for (int i = 0; i < x; i++){
      Scanner converse = new Scanner(System.in);
      String user = converse.nextLine();
      transcript[2*i+1] = user;
      String mirrored;
      String new_user = user.replace("I", "I");
      new_user = new_user.replace("me ","2you2 ");
      new_user = new_user.replace(" me"," 2you2");
      new_user = new_user.replace("my ","1your1 ");
      new_user = new_user.replace(" my "," 1your1");
      new_user = new_user.replace("am ","1are1 ");
      new_user = new_user.replace(" am"," 1are1");
      new_user = new_user.replace("your ","1my1 ");
      new_user = new_user.replace(" your "," 1my1");
      new_user = new_user.replace("you ","1I1 ");
      new_user = new_user.replace(" you"," 1I1");
      new_user = new_user.replace("are ","1am1 ");
      new_user = new_user.replace(" are"," 1am1");
      new_user = new_user.replace("I ", "1you1 ");
      new_user = new_user.replace(" I", " 1you1");

      
      new_user = new_user.replace("1am1","am");
      new_user = new_user.replace("1you1","you");
      new_user = new_user.replace("2you2","you");
      new_user = new_user.replace("1your1","your");
      new_user = new_user.replace("1are1","are");
      new_user = new_user.replace("1my1","my");
      new_user = new_user.replace("1I1","I");
      new_user = new_user.replace("1I2","I");

      
      if (!new_user.equals(user)) {
        mirrored = new_user;
      }
      else{
        Random random = new Random();
        mirrored = responses[random.nextInt(responses.length)];
      }
      transcript[2*i+2] = mirrored;
      System.out.println(mirrored);
            
    }
      /**
       * finishes and prints out transcript for user
       */
      transcript[2*(x) + 1] = "See ya!";
      System.out.println("See ya!");
      Arrays.stream(transcript).forEach(System.out::println);
      System.out.println(" ");
      System.out.println("TRANSCRIPT: ");
      System.out.println(Arrays.deepToString(transcript));
  }
}


