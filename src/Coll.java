import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Coll {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        String[] names = {"Anna", "Bob", "Carol", "David", "Edna"};
        list.addAll(Arrays.asList(names));
        System.out.println(list);
        System.out.println();

        list.add("Fred");
        list.addAll(Arrays.asList("George", "Gary", "Grace"));
        System.out.println(list);

        System.out.println("Is Gary in the list? " + list.contains("Gary"));
        System.out.println();

        list.removeIf(s -> s.charAt(0) == 'G');
        System.out.println(list);
        System.out.println("Is Gary in the list? " + list.contains("Gary"));

        list.sort(String::compareTo);
        System.out.println("Sorted list: " + list);
    }
}
