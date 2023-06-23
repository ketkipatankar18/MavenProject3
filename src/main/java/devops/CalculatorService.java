public class CalculatorService {

    public boolean checkEvenNumber(int inputNumber) {
        boolean isEven = false;
        if (Math.abs(inputNumber) % 2 == 0) { 
            isEven = true;
        }
        return isEven;
    }
    
    public boolean checkOddNumber(int inputNumber) {
        boolean isOdd = false;
        if (Math.abs(inputNumber) % 2 == 1) { 
            isOdd = true;
        }
        return isOdd;
    }
   
}