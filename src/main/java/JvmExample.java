public class JvmExample {
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println(person);

        String test1 = "test";
        String test2 = "test";
        String test3 = new String("test");

        if(test1 == test2){
            System.out.println("taki sam");
        }

        // stringi test1 i test3 znajdują się w innym obszarze pamięci dlatego nie sa równe - test 3 utworzony przez new...
        // klucze: stos, heap- sterta, String Pool, PermGen,
        if(test1 == test3){
            System.out.println("taki sam");
        }else{
            System.out.println("inny");
        }
    }
}
