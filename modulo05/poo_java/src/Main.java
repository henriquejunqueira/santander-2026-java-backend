import java.util.Scanner;

public class Main {

    public static void main(String[] args){
//        final var teste = "Teste";
//        var teste = "Teste";
//        teste = "T";
//        new Person();
//        var male = new Person();
//        var male = new Person("João");
        var male = new Person("João", 2);
        male.incAge();
//        male.setName("João");
//        male.setAge(12);

//        var female = new Person();
        var female = new Person("Maria");
        female.incAge();
//        female.setName("Maria");
//        female.setAge(10);

        System.out.println("Male name: " + male.getName() + ", age: " + male.getAge());
        System.out.println("Female name: " + female.getName() + ", age: " + female.getAge());
//        Person.setTeste("teste 123");

    }

}
