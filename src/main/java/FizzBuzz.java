import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class FizzBuzz {

    public static void main(String[] args) {

        FizzBuzz fb = new FizzBuzz();

        for (int i = 1; i <= 100; i++) {

            if (fb.printFizzWhenIsMultiply5And3(i) == "FizzBuzz"){
                System.out.println(fb.printFizzWhenIsMultiply5And3(i));
            }else if (fb.printFizzWhenIsMultiply3(i) == "Fizz"){
                System.out.println(fb.printFizzWhenIsMultiply3(i));
            }else if(fb.printFizzWhenIsMultiply5(i) == "Buzz"){
                System.out.println(fb.printFizzWhenIsMultiply5(i));
            }else{
                System.out.println(i);
            }
        }
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

    public String printFizzWhenIsMultiply5And3(int i) {

        String fizzBuzz = "";
        if (i % 5 == 0 && i % 3 == 0){
            fizzBuzz = "FizzBuzz";
        }
        return fizzBuzz;
    }
}
