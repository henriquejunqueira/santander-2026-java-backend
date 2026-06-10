import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Aula 01 - Estrutura condicional If else e else if
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        var name = scanner.next();
        System.out.println("Informe sua idade: ");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado? (s/n)");
        var isEmancipated = scanner.next().equalsIgnoreCase("s"); // ignora tipo de S ou s como resposta

        // if(age >= 18) System.out.printf("%s, você tem %s anos e pode dirigir\n", name, age);
//        if (age >= 18) {
              //System.out.println("Bem vindo");
//            System.out.printf("%s, você tem %s anos e pode dirigir\n", name, age);
//        }else if(age >= 16 && isEmancipated){
//            System.out.printf("%s, apesar de você ter %s anos, você é emancipado e pode dirigir\n", name, age);
//        }else{
//            System.out.printf("%s, você não pode dirigir\n", name);
//        }

        var canDrive = (age >= 18) || (age >= 16 && isEmancipated);
        // var message = "";
        var message = canDrive ? name + ", você pode dirigir \n" : name + ", você não pode dirigir\n";
        // if(canDrive){
            // System.out.printf("%s, você pode dirigir \n", name);
            // message = name + ", você pode dirigir \n";
        // }else{
            // System.out.printf("%s, você não pode dirigir\n", name);
            // message = name + ", você não pode dirigir\n";
        // }

        System.out.println(message);
        System.out.println("Fim da execução");

    }
}
