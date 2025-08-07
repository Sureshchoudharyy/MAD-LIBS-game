import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("MAD LIBS GAME!");
        Scanner sc = new Scanner(System.in);
        String noun1;
        String adjective1;
        String adjective2;
        String adjective3;
        String verb1;

        System.out.println("Today I went to a ________(description) zoo.");
        System.out.println("In an exhibit, I saw a ________(animal or person).");
        System.out.println("________(animal or person) was ________(description) and ________(action)!");
        System.out.println("I was ________(description)!");

        System.out.println("Enter an adjective1 (description) : ");
        adjective1 = sc.nextLine();
        System.out.println("Enter a noun1 (animal or person) : ");
        noun1 = sc.nextLine();
        System.out.println("Enter an adjective2 (description) : ");
        adjective2 = sc.nextLine();
        System.out.println("Enter a verb end with -ing (action) : ");
        verb1 = sc.nextLine();
        System.out.println("Enter an adjective3 (description) : ");
        adjective3 = sc.nextLine();

        System.out.println("Today I went to a "+adjective1+" zoo.");
        System.out.println("In an exhibit, I saw a "+noun1+".");
        System.out.println(noun1+" was "+adjective2+" and "+verb1+"!");
        System.out.println("I was "+adjective3+"!");
    }
}