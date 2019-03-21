package com.itstep.streem.telsample;

import com.itsrep.streem.telsample.Calculator;
import com.itsrep.streem.telsample.Operathions;
import org.junit.Test;

public class CalculatorTest {


    Calculator calculatorTest = new Calculator ();
 Calculator calculatorAddTest= new Calculator (2,5, Operathions.ADD);
 Calculator calculatorSubTest= new Calculator (2,5, Operathions.SUB);
 Calculator calculatorMultTest= new Calculator (2,5, Operathions.MULT);
    Calculator calculatorDivTest= new Calculator (2,5, Operathions.DIV);

@Test
    public void adOperathionToFileTest(){

    calculatorAddTest.adOperathionToFile("Operation.txt");
    calculatorSubTest.adOperathionToFile("Operation.txt");
    calculatorMultTest.adOperathionToFile("Operation.txt");
    calculatorDivTest.adOperathionToFile("Operation.txt");
    }

    @Test
    public void readOperathionHistoryTest(){

        calculatorTest.readOperathionHistory("Operation.txt");



    }
}
