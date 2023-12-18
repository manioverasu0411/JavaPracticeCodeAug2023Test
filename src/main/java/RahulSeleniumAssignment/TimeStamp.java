package RahulSeleniumAssignment;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.util.Date;

public class TimeStamp {

    public static void main(String[] args) {

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.toString().replace(":","_").replace(" ","_")+".jpg");


    }
}
