package Java_basics;
import java.util.*;

public class Input {
    public static void main(String[] args){
        System.out.print("Enter your name: ");
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();
            //nextInt()
            //nextfloat()
            System.out.println(name);
        }
    }
}
