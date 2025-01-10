/*Harry Potter needs help identifying what each house means.

Read a string representing a house and output the following:

if it is "gryffindor", output "bravery";
if it is "hufflepuff", output "loyalty";
if it is "slytherin", output "cunning";
if it is "ravenclaw", output "intellect";
otherwise, output "not a valid house".
The problem was taken from the course Introduction to JavaScript and React by Ken McGrady and adapted for our educational platform.
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String house = scanner.nextLine();
        switch(house){
            case "gryffindor":
                System.out.println("bravery");
                break;

            case "hufflepuff":
                System.out.println("loyalty");
                break;

            case "slytherin":
                System.out.println("cunning");
                break;

            case "ravenclaw":
                System.out.println("intellect");
                break;

            default:
                System.out.println("not a valid house");
        }
    }
}
