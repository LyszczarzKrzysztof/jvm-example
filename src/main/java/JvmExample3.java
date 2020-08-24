public class JvmExample3 {
    public static void main(String[] args) {

        final Person person = new Person();

        final Thread thread = new Thread(new Runnable() {
            public void run() {
                while (true){
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(person);
                }
            }
        });
        thread.setName(ThreadNames.JVM_EXAMPLE);
        thread.start();
    }
}
