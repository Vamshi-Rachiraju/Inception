package utils;

import org.testng.annotations.DataProvider;

public class ExcelDataProvider {

    @DataProvider(name = "loginData")
    public static Object[][] loginData() throws Exception {
        return ExcelUtils.getTestData("C:\\Users\\VamshiRachiraju\\git\\TIC\\Inception\\TIC\\src\\test\\resources\\TIC_Test_Data.xlsx", "AV_LoginPage");
    }
}
