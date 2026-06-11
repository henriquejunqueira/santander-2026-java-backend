import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Aula 01 - Estrutura condicional If else e else if
//        var scanner = new Scanner(System.in);
//        System.out.println("Informe seu nome: ");
//        var name = scanner.next();
//        System.out.println("Informe sua idade: ");
//        var age = scanner.nextInt();
//        System.out.println("Você é emancipado? (s/n)");
//        var isEmancipated = scanner.next().equalsIgnoreCase("s"); // ignora tipo de S ou s como resposta

        // if(age >= 18) System.out.printf("%s, você tem %s anos e pode dirigir\n", name, age);
//        if (age >= 18) {
              //System.out.println("Bem vindo");
//            System.out.printf("%s, você tem %s anos e pode dirigir\n", name, age);
//        }else if(age >= 16 && isEmancipated){
//            System.out.printf("%s, apesar de você ter %s anos, você é emancipado e pode dirigir\n", name, age);
//        }else{
//            System.out.printf("%s, você não pode dirigir\n", name);
//        }

        // var canDrive = (age >= 18) || (age >= 16 && isEmancipated);
        // var message = "";
        // var message = canDrive ? name + ", você pode dirigir \n" : name + ", você não pode dirigir\n";
        // if(canDrive){
            // System.out.printf("%s, você pode dirigir \n", name);
            // message = name + ", você pode dirigir \n";
        // }else{
            // System.out.printf("%s, você não pode dirigir\n", name);
            // message = name + ", você não pode dirigir\n";
        // }

//        System.out.println(message);
//        System.out.println("Fim da execução");

        // Aula 02 - Estrutura condicional Switch case
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número de 1 até 7");
        var option = scanner.nextInt();
//        var option = scanner.next();

//        switch (option){
//            case 1:
//            case 7:
//                System.out.println("Fim de semana!!!");
//                break;
//            case 2:
//                System.out.println("Segunda");
//                break;
//            case 3:
//                System.out.println("Terça");
//                break;
//            case 4:
//                System.out.println("Quarta");
//                break;
//            case 5:
//                System.out.println("Quinta");
//                break;
//            case 6:
//                System.out.println("Sexta");
//                break;
//            default:
//                System.out.println("Opção inválida");
//        }

//        switch (option){
//            case "1":
//            case "7":
//                System.out.println("Fim de semana!!!");
//                break;
//            case "2":
//                System.out.println("Segunda");
//                break;
//            case "3":
//                System.out.println("Terça");
//                break;
//            case "4":
//                System.out.println("Quarta");
//                break;
//            case "5":
//                System.out.println("Quinta");
//                break;
//            case "6":
//                System.out.println("Sexta");
//                break;
//            default:
//                System.out.println("Opção inválida");
//        }

//        switch (option){
//            case 1 -> System.out.println("Domingo");
//            case 2 -> System.out.println("Segunda");
//            case 3 -> System.out.println("Terça");
//            case 4 -> System.out.println("Quarta");
//            case 5 -> System.out.println("Quinta");
//            case 6 -> System.out.println("Sexta");
//            case 7 -> System.out.println("Sábado");
//            default -> System.out.println("Opção inválida");
//        }

//        switch (option){
//            case 1, 7 -> System.out.println("Fim de semana");
//            case 2 -> System.out.println("Segunda");
//            case 3 -> System.out.println("Terça");
//            case 4 -> System.out.println("Quarta");
//            case 5 -> System.out.println("Quinta");
//            case 6 -> System.out.println("Sexta");
//            default -> System.out.println("Opção inválida");
//        }

//        var message = switch (option){
//            case 1, 7 -> "Fim de semana";
//            case 2 -> "Segunda";
//            case 3 -> "Terça";
//            case 4 -> "Quarta";
//            case 5 -> "Quinta";
//            case 6 -> "Sexta";
//            default -> "Opção inválida";
//        };
//
//        System.out.println(message);

        var message = switch (option){
            case 1, 7 -> {
                var day = option == 1 ? "Domingo" : "Sábado";
                yield String.format("Hoje é %s, fim de semana", day); // yield retorna a String no switch
            }
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            default -> "Opção inválida";
        };

        System.out.println(message);

    }
}
