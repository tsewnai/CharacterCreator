import java.util.Scanner;

public class CharacterCreatorUI {

    Scanner myScanner = new Scanner(System.in);

    public int printMenu() {

        System.out.println("*****************CHARACTER CREATOR V1.0*************** IW");

        //list menu options






        String answer = myScanner.nextLine();
        return Integer.parseInt(answer);
    }






}
