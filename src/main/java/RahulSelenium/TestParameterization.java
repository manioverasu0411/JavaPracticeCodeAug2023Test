package RahulSelenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.ExcelReader;

public class TestParameterization {

    @DataProvider(name = "dp")
    public Object[][] getData() {

        ExcelReader excelReader = new ExcelReader("./src/main/resources/testdata/testdata.xlsx");
        String sheetName = "LoginTest";
        int rowNum = excelReader.getRowCount(sheetName);
        int columnNum = excelReader.getColumnCount(sheetName);

        Object[][] data = new Object[rowNum-1][columnNum];

        System.out.println(rowNum+" "+columnNum);


        data[0][0] = "test@gmail.com";
        data[0][1] = "mandasfsa";

        data[1][0] = "test1@gmail.com";
        data[1][1] = "vsdfs";

        data[2][0] = "test2@gmail.com";
        data[2][1] = "venasd";
        return data;

    }

    @Test(dataProvider = "dp")
    public void doLogin(String username, String password) {
        System.out.println(username + "---" + password);

    }
}
