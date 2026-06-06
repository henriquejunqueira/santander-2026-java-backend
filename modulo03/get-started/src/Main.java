// import java.util.Scanner;
// import java.util.*; // pega tudo que tem dentro do pacote, exceto dentro de outro pacote (não recomendado)

import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Scanner;

public class Main {

    // private final String welcomeMessage = "Olá, informe o seu nome: ";
    // private final static String WELCOME_MESSAGE = "Olá, informe o seu nome: ";

    public static void main(String[] args){

        // Aula 01 - Padrões de desenvolvimento e conceitos
        // meu comentário e uma linha
        /*
        * comentário
        * de
        * múltiplas
        * linhas
        * */
        // Scanner scanner = new Scanner(System.in);
        // var scanner = new Scanner(System.in);
        // System.out.println("Olá, informe o seu nome: ");
        // System.out.println(WELCOME_MESSAGE);
        // String name = scanner.next();
        // var name = scanner.next();
        // System.out.println("Olá, informe a sua idade: ");
        // int age = scanner.nextInt();
        // var age = scanner.nextInt();
        // System.out.println("Olá " + name + " sua idade é " + age);
        // System.out.printf("Olá %s, sua idade é %s \n", name, age);

        // Aula 02 - Keywords e tipos primitivos
        // byte number1 = 1;
        // short number2 = 1;
        // int number3 = 1;
        // long number4 = 1L;
        // var number5 = 1L;

        // float number6 = 1.0f;
        // var number7 = 1.0f;
        // double number8 = 1.0d;
        // var number9 = 1.0d;

        // char character1 = 'a';
        // var character2 = 'a';

        // boolean verify1 = true;
        // var verify2 = true;

        // Aula 03 - Trabalhando com operadores parte 1
        // var scanner = new Scanner(System.in);
        // System.out.println("Quanto é 2 + 2?");
        // var result = scanner.nextInt();
        // var isRight = result == 4;
        // var isWrong = result != 4;
        // System.out.printf("O resultado é 4, você acertou? (%s)", isRight);
        // System.out.printf("O resultado é 4, você errou? (%s)", isWrong);
        // System.out.printf("O resultado é 4, você acertou? (%s)", !isWrong);

        // System.out.println("Quantos anos você tem?");
        // var age = scanner.nextInt();
        // var canDrive = age > 17;
        // var canDrive = age >= 18;
        // var canNotDrive = age < 18;
        // var canNotDrive = !(age < 18);
        // System.out.println("Você é emancipado?");
        // var isEmancipated = scanner.nextBoolean();
        // var canNotDrive = age <= 17;
        // var canDrive = age >= 18 || (isEmancipated && age >= 16);
        // System.out.printf("Você pode dirigir? (%s) \n", canDrive);
        // System.out.printf("Você não pode dirigir? (%s) \n", canNotDrive);
        // System.out.printf("Você pode dirigir? (%s) \n", !canNotDrive);
        // System.out.printf("Você pode dirigir? (%s) \n", canDrive);

        // System.out.printf("true && true = %s \n", true && true);
        // System.out.printf("false && false = %s \n", false && false);
        // System.out.printf("true && false = %s \n", true && false);
        // System.out.printf("false && true = %s \n", false && true);
        // System.out.println("=====================================");
        // System.out.printf("true || true = %s \n", true || true);
        // System.out.printf("false || false = %s \n", false || false);
        // System.out.printf("true || false = %s \n", true || false);
        // System.out.printf("false || true = %s \n", false || true);
        // System.out.println("=====================================");
        // System.out.printf("!true = %s \n", !true);
        // System.out.printf("!false = %s \n", !false);

        // Aula 04 - Trabalhando com operadores parte 2
        // var scanner = new Scanner(System.in);
        // System.out.println("Informe o primeiro número: ");
        // var value1 = scanner.nextInt();
        // var value1 = scanner.nextFloat();
        // System.out.println("Informe o segundo número: ");
        // var value2 = scanner.nextInt();
        // var value2 = scanner.nextFloat();
        // System.out.println(value1 + " + " + value2 + " = " + (value1 + value2));
        // System.out.printf("%s + %s = %s\n", value1, value2, value1 + value2);
        // System.out.printf("%s - %s = %s\n", value1, value2, value1 - value2);
        // System.out.printf("%s / %s = %s\n", value1, value2, value1 / value2);
        // System.out.printf("%s %% %s = %s\n", value1, value2, value1 % value2);
        // System.out.printf("%s * %s = %s\n", value1, value2, value1 * value2);

        // var value = 5 + 9 * 10 - 5 / 2;
        // var value = (5 + 9) * (10 - 5) / 2;
        // var value = 5;
        // value = value + 12;
        // value += 12;
        // value -= 12;
        // value /= 12;
        // value *= 12;
        // System.out.println(value);

        // var scanner = new Scanner(System.in);
        // System.out.println("Informe o primeiro número: ");
        // var value1 = scanner.nextInt();
        // System.out.printf(" a raiz quadrada de %s é %s\n", value1, Math.sqrt(value1));
        // System.out.printf(" a potência de %s é %s\n", value1, Math.pow(value1, 2));
        // System.out.printf(" a potência de %s é %s\n", value1, Math.pow(value1, 3));

        // var value = 50;
        // System.out.println(++value);
        // System.out.println(--value);
        // System.out.println(value);

        // Aula 05 - Trabalhando com operadores Bitwise (Bit-a-Bit)
        //var value1 = 6;
        // var value1 = -9;
        // var value1 = -789;
        // var value1 = 9;
        // var binary1 = Integer.toBinaryString(value1);
        // System.out.printf("Primeiro número da operação %s (representação binária %s)\n", value1, binary1);
        // var value2 = 5;
        // var value2 = 2;
        // var binary2 = Integer.toBinaryString(value2);
        // System.out.printf("Segundo número da operação %s (representação binária %s)\n", value2, binary2);
        // var result = value1 | value2;
        // var binaryResult = Integer.toBinaryString(result);
        // System.out.printf(" %s | %s = %s (representação binária %s)\n", value1, value2 , result, binaryResult);
        // var result = value1 & value2;
        // var result = value1 ^ value2;
        // var result = value1 << value2;
        // var binaryResult = Integer.toBinaryString(result);
        // System.out.printf(" %s & %s = %s (representação binária %s)\n", value1, value2 , result, binaryResult);
        // System.out.printf(" %s ^ %s = %s (representação binária %s)\n", value1, value2 , result, binaryResult);
        // System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));

        //var result = ~value1;
        //var binaryResult = Integer.toBinaryString(result);
        //System.out.printf(" ~%s = %s (representação binária %s)\n", value1, result, binaryResult);

        // var value1 = 9;
        // var value1 = -8;
        // var value1 = 8;
        // var value1 = 12;
        // var value1 = -12;
        // var binary1 = Integer.toBinaryString(value1);
        // System.out.printf("Primeiro número da operação %s (representação binária %s)\n", value1, binary1);
        // var value2 = 2;
        // var value2 = 8;
        // System.out.printf("Segundo número da operação %s\n", value2);
        // var result = value1 << value2;
        // var result = value1 >> value2;
        // var result = value1 >>> value2;
        // var binaryResult = Integer.toBinaryString(result);
        // System.out.printf(" %s << %s = %s (representação binária %s)\n", value1, value2 , result, binaryResult);
        // System.out.printf(" %s >> %s = %s (representação binária %s)\n", value1, value2 , result, binaryResult);
        // System.out.printf(" %s >>> %s = %s (representação binária %s)\n", value1, value2 , result, binaryResult);
        // System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));

        // Exercicios
         var scanner = new Scanner(System.in);

        // 01 - Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
        // System.out.println("Digite o nome: ");
        // var nome = scanner.next();
        // System.out.println("Digite o ano de nascimento");
        // var ano_nascimento = scanner.nextInt();
        // var ano_atual = 2026;
        // var ano_atual = OffsetDateTime.now().getYear();
        // System.out.printf("Olá %s, você tem %s anos", nome, ano_atual - ano_nascimento);

        // 02 - Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela. fórmula: área=lado X lado
        // System.out.println("Digite o lado do quadrado: ");
        // var lado_quadrado = scanner.nextDouble();
        // var area = lado_quadrado * lado_quadrado;
        // System.out.printf("Um quadrado com lado %s x %s, tem %s de área", lado_quadrado, lado_quadrado, area);

        // 03 - Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela. fórmula: área=base X altura
        // System.out.println("Base do retângulo: ");
        // var base = scanner.nextDouble();
        // System.out.println("Altura do retângulo: ");
        // var altura = scanner.nextDouble();
        // var area = base * altura;
        // System.out.printf("Um retângulo com %s de base e %s de altura, tem %s de área", base, altura, area);

        // 04 - Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
        System.out.println("Digite o nome da primeira pessoa: ");
        var nome1 = scanner.next();
        System.out.println("Digite a idade da primeira pessoa: ");
        var idade1 = scanner.nextInt();
        System.out.println("Digite o nome da segunda pessoa: ");
        var nome2 = scanner.next();
        System.out.println("Digite a idade da segunda pessoa: ");
        var idade2 = scanner.nextInt();
        var diferenca_idade = idade2 - idade1;
        System.out.printf("A diferença de idade das duas pessoas é de %s ano(s)", diferenca_idade);

    }

}
