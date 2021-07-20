import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ex01 {
    public static void main(String[] args_) {

        String[] args = { "add", "20", "1", "87", "7" };
        System.out.println("Iniciado");
        if (Objects.nonNull(args) && args.length > 0) {
            
            if ("soma".equals(args[0])) {
                soma(args);
            } else if ("add".equals(args[0])) {
                add(args);            
            } else {
                item(args);               
            }
            explicacao(args);
        } else {
            System.out.println("Em args tem menos que 1");
        }
    }

    private static void soma(String[] args) {
        Integer soma = 0;
        for (int i = 1; i < args.length; i++) {
            soma += Integer.valueOf(args[i]);
        }
        System.out.println("O resultado da soma e: " + soma);
    }

    private static void add(String[] args) {
        List<String> compras = new ArrayList<>();
                Integer i = 1;
                while (i < args.length) {
                    compras.add(args[i]);
                    ++i;
                }
                System.out.println(Arrays.toString(compras.toArray()));
    }

    private static void item(String[] args) {
        for (String item : args) {
            System.out.println("voce informou: " + item);
        }
    }

    private static void explicacao(String[] args) {
        Integer x = 5, y = 5;
        System.out.println("++x: " + ++x);
        System.out.println("x: " + x);

        System.out.println("y++: " + y++);
        System.out.println("y: " + y);
    }
}