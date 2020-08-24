public class JvmExample2 {
    public static void main(String[] args) {
        Person person = new Person();

        while (true){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(person);
        }
    }
}
