
/**
 * Write a program that plays a word game with the user. The program should ask the user to enter the following:
His or her name
His or her age
The name of a city
The name of a college
A profession
A type of animal
A pet's name
 * @author (Peter Tran)
 * @version (7.0.3)
 */
import java.util.Scanner;
public class WordGame
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter a name: ");
        String name = in.next();
        System.out.print("How old is this person?: ");
        int age = in.nextInt();
        System.out.print("Please enter a city name: ");
        String city = in.next();
        System.out.print("What college do they attend?: ");
        String college = in.next();
        System.out.print("Please name a job: ");
        String job = in.next();
        System.out.print("Name an animal: ");
        String animal = in.next();
        System.out.print("Please enter the name of the pet: ");
        String petName = in.next();
        System.out.print("\n");
        
        System.out.println("There was once a person named " + name + " who lived in " + city + ". ");
        System.out.println("At the age of " + age + ", " + name + " went to college at " + college + ". ");
        System.out.println(name + " graduated and went to work as a " + job + ". Then, " + name);
        System.out.println("adopted a(n) " + animal + " named " + petName + ". They both lived happily ever after! ");
        
    }
}
