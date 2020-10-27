package se.lexicon.tobias;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Age: ");
        Byte age = scanner.nextByte();
        System.out.println("Your name is: " + name + " And you are: " + age);

    }
}

