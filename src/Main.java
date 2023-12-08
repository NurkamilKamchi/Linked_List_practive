import java.util.Arrays;
import java.util.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String name = "Urmat";
        String name2 = "Nurkamil";
        String name3 = "Nurbek";
        LinkedList<String> getFirst = new LinkedList<>(Arrays.asList(name, name2, name3));
        LinkedList<String> student = new LinkedList<>(Arrays.asList("Urmat", "Aigul", "Tima"));
        System.out.println("First element:  " + getFirst.getFirst());
        System.out.println("*************************************************************");
        System.out.println("Last element:  " + getFirst.getLast());
        System.out.println("*************************************************************");
        System.out.println("Contains  (Urmat):  " + getFirst.contains("Urmat"));
        System.out.println("*************************************************************" + "\n\n\n");
        LinkedList<String> copied = new LinkedList<>();
        for (String string : getFirst) {
            copied.add(string);
        }
        System.out.println("old list: " + getFirst);
        System.out.println("new List" + copied);
        System.out.println("*************************************************************");
        LinkedList<String> compared = new LinkedList<>();
        for (String string : getFirst) {
            compared.add(student.contains(string) ? "Contains: " + string : "Not contain");
        }
        System.out.println(compared);
        System.out.println("*************************************************************");
        System.out.println("getFirst.isEmpty() = " + getFirst.isEmpty());
        System.out.println("*************************************************************");
        String name4 = "Arstan";
        getFirst.set(2, name4);
        System.out.println(getFirst);
        System.out.println("*************************************************************");
    }
}
