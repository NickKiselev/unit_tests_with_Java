import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorTests {
    private Calculator calculator;

    @BeforeMethod(alwaysRun = true)
    private void preconditions(){
        calculator = new Calculator();
    }

    @Parameters({"a","b","expected"})
    @Test(groups = "smoke")
    private void sumShouldWorkForLong(long a, long b, long expected){
        Assert.assertEquals(calculator.sum(a,b),expected);
    }

    @Parameters({"a","b","expected"})
    @Test(groups = "smoke")
    private void sumShouldWorkForDouble(double a, double b, double expected){
        Assert.assertEquals(calculator.sum(a,b), expected);
    }

    @Parameters({"a","b","expected"})
    @Test(groups = "smoke")
    private void subShouldWorkForLong(long a, long b, long expected){
        Assert.assertEquals(calculator.sub(a,b), expected);
    }

    @Parameters({"a","b","expected"})
    @Test(groups = "smoke")
    private void subShouldWorkForDouble(double a, double b, double expected){
        Assert.assertEquals(calculator.sub(a,b), expected);
    }

    @Parameters({"a","b","expected"})
    @Test(groups = "smoke")
    private void multShouldWorkForLong(long a, long b, long expected){
        Assert.assertEquals(calculator.mult(a,b), expected);
    }

    @Parameters({"a","b","expected"})
    @Test(groups = "smoke")
    private void multShouldWorkForDouble(double a, double b, double expected){
        Assert.assertEquals(calculator.mult(a,b), expected);
    }

    @Parameters({"a","b","expected"})
    @Test(groups = "smoke")
    private void divShouldWorkForDouble(double a, double b, double expected){
        Assert.assertEquals(calculator.div(a,b), expected);
    }

    @Parameters({"a","b","expected"})
    @Test(groups = "smoke")
    private void divShouldWorkForLong(long a, long b, long expected){
        Assert.assertEquals(calculator.div(a,b), expected);
    }

    @Parameters({"a","b"})
    @Test(groups = "smoke")
    private void divShouldNotWorkForZero(long a, long b){
        Assert.assertThrows(NumberFormatException.class, () -> {
            calculator.div(a,b);
        });
    }

    @Parameters({"a","b","expected"})
    @Test(groups = "smoke")
    private void powShouldWork(double a, double b, double expected){
        Assert.assertEquals(calculator.pow(a,b), expected);
    }

    @Parameters({"a", "expected"})
    @Test(groups = "smoke")
    private void sqrtShouldWork(double a, double expected){
        Assert.assertEquals(calculator.sqrt(a), expected);
    }

    @Parameters({"a", "expected"})
    @Test(groups = "Not_for_run")
    private void tgShouldWork(double a, double expected){
        Assert.assertEquals(Math.floor(calculator.tg(a)), expected);
    }

    @Parameters({"a", "expected"})
    @Test(groups = "Not_for_run")
    private void ctgShouldWork(double a, double expected){
        Assert.assertEquals(calculator.ctg(a), expected);
    }

    @Parameters({"a", "expected"})
    @Test(groups = "Not_for_run")
    private void cosShouldWork(double a, double expected){
        Assert.assertEquals(Math.floor(calculator.cos(a)), expected);
    }

    @Parameters({"a", "expected"})
    @Test(groups = "Not_for_run")
    private void sinShouldWork(double a, double expected){
        Assert.assertEquals(Math.ceil(calculator.sin(a)), expected);
    }

    @Parameters({"a", "b"})
    @Test(groups = "Not_for_run")
    private void positiveShouldWork(long a, long b){
        Assert.assertFalse(calculator.isPositive(a));
        Assert.assertTrue(calculator.isPositive(b));
    }

    @Parameters({"a"})
    @Test(groups = "Not_for_run")
    private void negativeShouldWork(long a){
        Assert.assertTrue(calculator.isNegative(a));

    }

}
