package format;

import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class ExItems {

    public static void main(String[] args) {

        Item i1 = new Item("Item #1", 240.2, "EUR");
        Item i2 = new Item("Item #2", 9.17, "USD");
        Item i3 = new Item("Item #3", 1731, "BRL");

        PrintWriter out = new PrintWriter(System.out, true, StandardCharsets.UTF_8);
        out.println(i1);
        out.println(i2);
        out.println(i3);
    }
}
