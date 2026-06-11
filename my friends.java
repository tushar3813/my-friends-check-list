import java.util.Scanner;

public class my friends {
    public static void main(String[] args) {

        String[] myfriends = {
                "sneha",
                "dakash",
                "simran",
                "nishu",
                "vishakha",
                "priya"
        };

        System.out.println("Enter your name:");

        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        boolean check = false;

        for (String elements : myfriends) {
            if (name.equals(elements)) {
                check = true;
                break;
            }
        }

        if (check) {
            System.out.println("Ap Tushar ke dost ho!");
        } else {
            System.out.println("Ap Tushar ke dost nahi ho!");
        }
    }
}