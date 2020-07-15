package test;

import main.Calculatrice;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

public class CalculatriceTest {
    Calculatrice calc = new Calculatrice();

    @Test
    public void add(){

        int a = 2;
        int b = 2;
        int result = 4;

        Assert.assertEquals(result, calc.add(a, b));

    }

    @Test
    public void sous(){

        int a = 8;
        int b = 4;

        int result = 4;

        Assert.assertEquals(result, calc.sous(a, b));
    }

    @Test
    public void mul(){

        int a = 3;
        int b= 2;
        int result = 6;

        Assert.assertEquals(result, calc.mul(a, b));
    }

    @Test
    public void div(){

        int a= 16;
        int b=4;
        int result = 4;

        Assert.assertEquals(result, calc.div(a, b));

    }
}
