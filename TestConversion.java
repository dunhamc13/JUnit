/* Notes About File
 * @File: TestConversion.java
 * @Name: Christian Dunham
 * @Number: 1978955
 * @Date: 13May2020
 * @Program Name:  TestConversion
 *
 * Program Purpose:
 *    This is a black box testing class for the binary Conversion.  Conversion
 *    contains a function ConvertToWord(int).  This program attempts to test the
 *    logical partiions for that function based upon the design specificaitons
 *    that have been articulated.
 *
 * Design Rational:  Wrong data format tests were commented out.  They were kept
 * in order to utilize them in the future to ensure the function handles errors.
 * However, in order to demonstrate the other tests, these tests had to be 
 * commented out to allow JUnit to exercise the more expected partitions that
 * would be expected.
 *
 *******************************************************************************
 *******************************************************************************
 *
 *                        Special Cases Identified
 *
 * * None at this time : 
 * 
 *******************************************************************************
 *
 *******************************************************************************
 *Product BackLog :
 *                 1) Await for Instructor Comments
 *
 *******************************************************************************
 *
 *******************************************************************************
 * Code Outline :
 *
 *                TestConversion    : test(-1000000)
 *                                  : test(-100)
 *                                  : test(-1)
 *                                  : test(0)
 *                                  : test(1)
 *                                  : test(25)
 *                                  : test(100)
 *                                  : test(956792)
 *                                  : test(double)
 *                                  : test(string)
 *                                  : test(char)
 *                                  : test(int, int)
 *
 *******************************************************************************
 *
 *                        Included Libraries
 *
 *******************************************************************************
 *******************************************************************************
*/

import junit.framework.TestCase;  //allows mulitple tests
import org.junit.Test;  //allows Tests
import static org.junit.Assert.assertEquals; //for assertEquals function

/* TestConversion
 * @Description: Class conducts unit testing on Conversion binary
 *
 * This class has 3 main operations.  
 * Operation 1 tests expected value inputs including checking boundaries
 * Operation 2 tests negative integers
 * Operation 3 tests invalid inputs
 *
 * All tests assume lower case strings or non-case sensitive
 * All tests assume invalid inputs output string "error"
 *
 * @Pre: Conversion binary and ConvertToWords function exist and are compiled
 * @Post: ConvertToWords Partitions tested for errors
 */
public class TestConversion extends TestCase {
    
//_____________________________________________________________________________
// Operation 1 : Partion and Bounds Checking of Expected Inputs

    //Test boudary 0
    @Test
    public void testZero() {
       Conversion conversion = new Conversion();  //make obj
       int num = 0;  
       String numStr = "zero";
       String convStr = conversion.ConvertToWords(num);  //use function
       assertEquals(numStr, convStr);  //test function
    }//end 0

    //Test partition 1-9
    @Test
    public void testFive() {
       Conversion conversion = new Conversion();
       int num = 5;
       String numStr = "five";
       String convStr = conversion.ConvertToWords(num);
       assertEquals(numStr, convStr);
    }//end 1
    
    //Test partition 1-9
    @Test
    public void testNine() {
       Conversion conversion = new Conversion();
       int num = 9;
       String numStr = "nine";
       String convStr = conversion.ConvertToWords(num);
       assertEquals(numStr, convStr);
    }//end 1
   
    //test Partition 10-99
    @Test
    public void testTen() {
       Conversion conversion = new Conversion();
       int num = 10;
       String numStr = "ten";
       String convStr = conversion.ConvertToWords(num);
       assertEquals(numStr, convStr);
    }//end 25
    
    //test Partition 10-99
    @Test
    public void testTwentyFive() {
       Conversion conversion = new Conversion();
       int num = 25;
       String numStr = "twenty five";
       String convStr = conversion.ConvertToWords(num);
       assertEquals(numStr, convStr);
    }//end 25
    
    //test Partition 10-99
    @Test
    public void testNinetyNine() {
       Conversion conversion = new Conversion();
       int num = 99;
       String numStr = "ninety nine";
       String convStr = conversion.ConvertToWords(num);
       assertEquals(numStr, convStr);
    }//end 99
    
    //test Boundary 100
    @Test
    public void testOneHundred() {
       Conversion conversion = new Conversion();
       int num = 100;
       String numStr = "one hundred";
       String convStr = conversion.ConvertToWords(num);
       assertEquals(numStr, convStr);
    }//end 100
    
    //Test something really big
    @Test
    public void testBigNum() {
       Conversion conversion = new Conversion();
       int num = 956792;
       String numStr = "nine hundred five hundred six thousand and seven hundred ninety two";
       String convStr = conversion.ConvertToWords(num);
       assertEquals(numStr, convStr);
    }//end 956792
   
//_____________________________________________________________________________
// Operation 2 : Negative Inputs

    //Test something really really small
    @Test
    public void testNegLarg() {
       Conversion conversion = new Conversion();
       int num = -1000000;
       String numStr = "negative one million";
       String convStr = conversion.ConvertToWords(num);
       assertEquals(numStr, convStr);
    }//end -1000000
    
    //Test something really really small
    @Test
    public void testNegOneHund() {
       Conversion conversion = new Conversion();
       int num = -100;
       String numStr = "negative one hundred";
       String convStr = conversion.ConvertToWords(num);
       assertEquals(numStr, convStr);
    }//end -100
   
    //test boundary -1
    @Test
    public void testNegSmallOne() {
       Conversion conversion = new Conversion();
       int num = -1;
       String numStr = "negative one";
       String convStr = conversion.ConvertToWords(num);
       assertEquals(numStr, convStr);
    }//end -1
    
    //test -1- -9
    @Test
    public void testNegFive() {
       Conversion conversion = new Conversion();
       int num = -5;
       String numStr = "negative five";
       String convStr = conversion.ConvertToWords(num);
       assertEquals(numStr, convStr);
    }//end -5
    
    //test -1- -9
    @Test
    public void testNegNine() {
       Conversion conversion = new Conversion();
       int num = -9;
       String numStr = "negative 9";
       String convStr = conversion.ConvertToWords(num);
       assertEquals(numStr, convStr);
    }//end -9

    
//_____________________________________________________________________________
// Operation 3 : Invalid Inputs

    /* ************************* Invalid Inputsl
    //Test Decimals
    @Test
    public void testDecimal() {
       Conversion conversion = new Conversion();
       double num = 326.8;
       String numStr = "error";
       String convStr = conversion.ConvertToWords(num);
       assertEquals(numStr, convStr);
    }//end test1
    
    //Test strings
    @Test
    public void testString() {
       Conversion conversion = new Conversion();
       String num = "Twenty";
       String numStr = "error";
       String convStr = conversion.ConvertToWords(num);
       assertEquals(numStr, convStr);
    }//end test1
    
    //Test chars
    @Test
    public void testChars() {
       Conversion conversion = new Conversion();
       char num = 1;
       String numStr = "error";
       String convStr = conversion.ConvertToWords(num);
       assertEquals(numStr, convStr);
    }//end test1
    
    //Test multiple valid inputs
    @Test
    public void testMultiples() {
       Conversion conversion = new Conversion();
       int num = 1;
       int num2 = 2;
       String numStr = "error";
       String convStr = conversion.ConvertToWords(num, num2);
       assertEquals(numStr, convStr);
    }//end test1

    *********************  Invalid inputs comment out end   *******        */
}// end TestConversion
