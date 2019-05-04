package testSample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
/*
    @DataProvider(name = "XMLFileLoader")
        public static Object[][] getDataProviderXmlFile() {
            String fileName = "C:/Users/Yurii/Homework3/Path/DataProv.xml";
        return loadDataFromXmlFile(fileName);


    private static Object[][] loadDataFromXmlFile(String fileName){
            return loadDataFromXmlFile(fileName);

        }}

    private static Object[][] loadDataFromXmlFile(final String fileName, final String encoding) {

            if (fileName != null) {
                String encoding = loadDataFromXmlFile(fileName);
                String fileName = loadDataFromXmlFile(encoding);
                return loadDataFromXmlFile(fileName, encoding);
            } else {
                throw new RuntimeException("Couldn't find the annotation");
            }

    }
*/

}
    /* @DataProvider(name="data-provider")
        public Object[][]dataProviderMethod(){
        return new Object[][]{{"data one "},{"data two "}};
    }
    @Test(dataProvider = "data-provider")
        public void testMethod(String data){
        System.out.print("data is " + data);
    } */

