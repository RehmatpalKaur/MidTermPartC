/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author rehma
 */
import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to UserProfile creation!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Choose your favorite genre:");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Drama");
        System.out.println("4. Sci-Fi");
        System.out.println("5. Horror");
        System.out.print("Enter the number corresponding to your favorite genre: ");

        // Read the genre as a string
        String genre = scanner.nextLine();

        // Convert the genre to lowercase for case-insensitive comparison
        genre = genre.toLowerCase();

        // Map the genre to the corresponding number
        int choice;
        switch (genre) {
            case "action":
                choice = 1;
                break;
            case "comedy":
                choice = 2;
                break;
            case "drama":
                choice = 3;
                break;
            case "sci-fi":
                choice = 4;
                break;
            case "horror":
                choice = 5;
                break;
            default:
                choice = 0; // Unknown genre
        }

        if (choice == 0) {
            System.out.println("Unknown genre entered. Your userProfile was created with an unknown genre.");
        } else {
            System.out.println("Your userProfile was created!");
            System.out.println("Name: " + name);
            System.out.println("Favorite Genre: " + genre);
        }
    }
}
