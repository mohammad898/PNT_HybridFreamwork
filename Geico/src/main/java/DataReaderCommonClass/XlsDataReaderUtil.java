package DataReaderCommonClass;

import base.Xls_Reader;
import reporting.TestLogger;

import java.util.ArrayList;

import static base.CommonClass.convertToString;

public class XlsDataReaderUtil {
    static Xls_Reader reader;
    public static ArrayList<Object[]> getDataFromExcelFM(){
        TestLogger.log(XlsDataReaderUtil.class.getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ArrayList<Object[]> myData = new ArrayList<Object[]>();
        try {
            reader = new Xls_Reader("/Users/afia/IdeaProjects/GroupBlueFrameWork/Geico/data/DataFile2.xls");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        for (int rowNum =2; rowNum <= reader.getRowCount("Sheet1"); rowNum++){
            String  email = reader.getCellData("Sheet1", "email",rowNum );
            String passCode = reader.getCellData("Sheet1","passCode", rowNum);
            String message = reader.getCellData("Sheet1","message", rowNum);
            Object obj[] = {email,passCode, message};
            myData.add(obj);
        }
        return  myData;
    }
}

