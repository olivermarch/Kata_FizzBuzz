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

    public String printFizzWhenIsMultiply3(int i) {
        String fizz = "";
        if (i % 3 == 0){
            fizz = "Fizz";
        }
        return fizz;
    }

    public String printFizzWhenIsMultiply5(int i) {
        String buzz = "";
        if (i % 5 == 0){
            buzz = "Buzz";
        }
        return buzz;
    }
}
