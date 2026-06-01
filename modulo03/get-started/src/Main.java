import java.util.Scanner;
//import java.util.*; // pega tudo que tem dentro do pacote, exceto dentro de outro pacote (não recomendado)

public class Main {

    private final String welcomeMessage = "Olá, informe o seu nome: ";
    private final static String WELCOME_MESSAGE = "Olá, informe o seu nome: ";

    public static void main(String[] args){
        // meu comentário e uma linha
        /*
        * comentário
        * de
        * múltiplas
        * linhas
        * */
        // Scanner scanner = new Scanner(System.in);
        var scanner = new Scanner(System.in);
        // System.out.println("Olá, informe o seu nome: ");
        System.out.println(WELCOME_MESSAGE);
        // String name = scanner.next();
        var name = scanner.next();
        System.out.println("Olá, informe a sua idade: ");
        // int age = scanner.nextInt();
        var age = scanner.nextInt();
        // System.out.println("Olá " + name + " sua idade é " + age);
        System.out.printf("Olá %s, sua idade é %s \n", name, age);
    }

}
