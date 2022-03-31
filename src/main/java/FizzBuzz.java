public class FizzBuzz {

    public static void main(String[] args) {

        FizzBuzz fb = new FizzBuzz();

    }

    public int recorreNumeros() {
        return 100;
    }

    public String printFizz(int n) {
        String fizz = "";
        if (n == 3){
            fizz = "Fizz";
        }
        return fizz;
    }

    public String printBuzz(int n) {
        String buzz = "";
        if (n == 5){
            buzz = "Buzz";
        }
        return buzz;
    }

}
