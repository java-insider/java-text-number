package regex;

public class ExValidateCPF {

    public static void main(String[] args) {
        System.out.println(validateCPF("456.678.999-10"));
        System.out.println(validateCPF("45667899910"));
        System.out.println(validateCPF("456 678 999 10"));
        System.out.println(validateCPF("456 678 999.10"));
        System.out.println(validateCPF("456-678-999-10"));
    }

    private static boolean validateCPF(String cpf) {
        return cpf.matches("\\d{3}([.\\s])?\\d{3}([.\\s])?\\d{3}([-\\s])?\\d{2}");
    }
}
