package regex;

public class ExRemoveElements {

    public static void main(String[] args) {
        String text = "hjg4hj3g24h3g4hj32g42";
        System.out.println(text.replaceAll("\\d", ""));
        System.out.println(text.replaceAll("\\D", ""));
        System.out.println(text.replaceAll("[^0-9]", ""));
    }
}
