

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        List<String> li = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            li.add(s.substring(i));
        }

        li.sort(null);

        for (String string : li) {
            System.out.println(string);
        }
    }
}
