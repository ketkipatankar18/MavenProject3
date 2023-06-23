import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;
  
public class TestCalculatorService {
@Test
    public void testForEvenNumber() {
        CalculatorService calculatorService = new CalculatorService();
        assertEquals(true, calculatorService.checkEvenNumber(410000));
        assertEquals(true, calculatorService.checkEvenNumber(-221144));
          
        assertNotEquals(true, calculatorService.checkEvenNumber(410001));
        assertNotEquals(true, calculatorService.checkEvenNumber(-221149));
    }
    
    @Test
    public void testForOddNumber() {
        CalculatorService calculatorService = new CalculatorService();
        assertEquals(true, calculatorService.checkOddNumber(12345));
        assertEquals(true, calculatorService.checkOddNumber(-232323));
          
        assertNotEquals(true, calculatorService.checkOddNumber(12348));
        assertNotEquals(true, calculatorService.checkOddNumber(-232316));
    }
}
