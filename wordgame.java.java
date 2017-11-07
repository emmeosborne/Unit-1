import java.util.Scanner;

class WordGames {

  public static void main(String[] arg) {
    Scanner input = new Scanner(System.in);
    System.out.print("Tell me your name: ");
    String name = input.nextLine();
    String insultedName = insult(name);
    System.out.println(insultedName);

    System.out.print("Give me a first word");
     String first = input.nextLine();
     System.out.println("Give me a second word: ");
     String second = input.nextLine();
     System.out.println(makeAbba(first, second));
  }

  public static String insult(String n) {
    return n + ",you slimy weasel";
  }

  public static String makeAbba(String a, String b) {
    return a + b + b + a;
  }
}
