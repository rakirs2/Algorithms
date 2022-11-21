public class FizzBuzz {
    
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        fizzBuzz.fizzBuzz(10);
    }

    public FizzBuzz() {}

    public void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);

            if (i % 15 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}

    