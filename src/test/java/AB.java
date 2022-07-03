import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert.*;

public class AB {

    @Test(dataProvider = "data-provider", dataProviderClass = DataProviderClass.class, groups = "Add")
    public void sumMethod(int a, int b) {
        int sum = a + b;
        Assert.assertEquals(sum, 9);
    }

    @Test(dataProvider = "data-provider", dataProviderClass = DataProviderClass.class, groups = "Subtract")
    public void diffMethod(int a, int b) {
        int sum = a - b;
        Assert.assertEquals(sum, -5);
    }
    @Test(dataProvider = "data-provider", dataProviderClass = DataProviderClass.class, groups = "Multiply")
    public void prodMethod(int a, int b) {
        int sum = a * b;
        Assert.assertEquals(sum, 14);
    }

    @Test(dataProvider = "data-provider", dataProviderClass = DataProviderClass.class, groups = "Divide")
    public void quoMethod(int a, int b) {
        int sum = a / b;
        Assert.assertEquals(sum, 0);
    }

    @Test(dataProvider = "data-provider", dataProviderClass = DataProviderClass.class, groups = "Remainder")
    public void remMethod(int a, int b) {
        int sum = a % b;
        Assert.assertEquals(sum, 2);
    }
}
