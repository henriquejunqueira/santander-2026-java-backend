public record PersonRecord(String name, int age) {

//    private static String name;
//    public String name(){
//        return "name";
//    }

    public PersonRecord{
//        System.out.println(name);
//        System.out.println(age);
    }

    public PersonRecord(String name){
        this(name, 1);
    }

    public String getInfo(){
        return "Name: " + name + " age: " + age;
    }

}
