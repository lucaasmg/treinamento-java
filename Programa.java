import java.util.Objects;

public class Programa{

    public static void main(String[] args_) {  //  => void=n]ao retorna
        String[] args = {"multiplica", "7", "2"};

        System.out.println("Iniciado");

        if(Objects.nonNull(args) && args.length > 0) {
            
            if(args[0] == "soma") {
                Integer soma = 0;
                for(int i=1; i<args.length; i++) {
                    soma += Integer.valueOf(args[i]);                  
                }
                System.out.println("A soma é " + soma.toString());

            }else if(args[0]=="multiplica") {
                Integer produto = 1;
                for(int i=1; i<args.length; i++) {
                    produto*=Integer.valueOf(args[i]);
            } 
            System.out.println("O produto é " + produto.toString());           
        } else {
            for (String item : args) {
                System.out.println("Você informou: " + item);
            }
        }
        } else {
        System.out.println("Em args tem menos que 1");
        }
    }
}