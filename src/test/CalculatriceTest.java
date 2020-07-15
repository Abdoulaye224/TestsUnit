package test;

import main.Calculatrice;
import org.junit.Assert;
import org.junit.Test;

public class CalculatriceTest {
    Calculatrice calc = new Calculatrice();

    @Test
    public void add(){

        int a = 2;
        int b = 2;
        int result = 4;

        Assert.assertEquals(result, calc.add(a, b));

        if(this.calc.add(a, b) != result){
            System.out.println("test add à revoir ");
        }else{
            System.out.println("le test d'addition est bon ");
        }

    }

    @Test
    public void sous(){

        int a = 8;
        int b = 4;

        int result = 4;

        Assert.assertEquals(result, calc.sous(a, b));

        if(this.calc.sous(a, b) != result){
            System.out.println("test sous à revoir ");
        }else{
            System.out.println("le test de soustraction est bon ");
        }
    }

    @Test
    public void mul(){

        int a = 3;
        int b= 2;
        int result = 6;

        Assert.assertEquals(result, this.calc.mul(a, b));

        if(this.calc.mul(a, b) != result){
            System.out.println("test mul à revoir ");
        }else{
            System.out.println("le test de multiplication est bon ");
        }
    }

    @Test
    public void div(){

        int a= 16;
        int b=4;
        int result = 4;

        Assert.assertEquals(result, calc.div(a, b));

        if(this.calc.div(a, b) != result){
            System.out.println("test div à revoir ");
        }else{
            System.out.println("le test de division est bon ");
        }

    }
}
