import java.time.OffsetDateTime;

public class Person {

//    private String name;
    private final String name;
    private int age;

//    private int lastYearAgeInc = OffsetDateTime.now().getYear();
    private int lastYearAgeInc = OffsetDateTime.now().getYear() - 1;

//    public Person(){
//
//    }

    public Person(String name){
        this.name = name;
        this.age = 1;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

//    private Person(){
//
//    }

    public static String teste;

    public String getName(){
        return name;
    }

//    public void setName(String name){
//        this.name = name;
//    }

    public int getAge(){
        return age;
    }

//    public void setAge(int age){
//        this.age = age;
//    }

//    public static String getTeste(){
//        return teste;
//    }
//
//    public static String setTeste(String testeParametro){
//        return teste = testeParametro;
//    }

    public void incAge(){
        if(this.lastYearAgeInc >= OffsetDateTime.now().getYear()) return;

        this.age += 1;
        this.lastYearAgeInc = OffsetDateTime.now().getYear();
    }

}
