import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        System.out.print("შეიყვანეთ ტექსტი: ");
        String text = Obj.nextLine();

        String name = (text.length()%2==0)? "ლუწია" : "კენტია";
        System.out.println(name);
    }
}

