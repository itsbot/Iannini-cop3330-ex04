/*
 *  UCF COP3330 Fall 2021 Exercise 4 Solution
 *  Copyright 2021 Patrick Iannini
 */
package Exercise04;
import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        System.out.println("Enter a noun: ");
        Scanner sc = new Scanner(System.in);
        String noun = sc.nextLine();

        System.out.println("Enter a verb: ");
        Scanner sc1 = new Scanner(System.in);
        String verb = sc1.nextLine();

        System.out.println("Enter an adjective: ");
        Scanner sc2 = new Scanner(System.in);
        String adjective = sc2.nextLine();

        System.out.println("Enter an adverb");
        Scanner sc3 = new Scanner(System.in);
        String adverb = sc3.nextLine();

        System.out.println("I feel "+adjective+" today so I think I'll "+verb+" a "+noun+" "+adverb+".");

    }
}
