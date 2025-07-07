package LambdaExpression;

public class BeforeLambda {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Brother How Are you");
            }
        });
        thread.start();
    }
}
