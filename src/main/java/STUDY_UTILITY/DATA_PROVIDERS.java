package STUDY_UTILITY;



import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;




public class DATA_PROVIDERS {

	
	
	/**
	 * this method will read all the data present in sheet and return 2 dimensional object array
	 * which can be fed to data provider
	 * @param sheet
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
/*public Object[][] readMultipleDataFromExcel(String sheet) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(".//src//test/resources//SAI_BOOK.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);
		int lastRow = sh.getLastRowNum();
		int lastCell = sh.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[lastRow][lastCell];
		
		for(int i=0;i<lastRow;i++)
		{
			for(int j=0;j<lastCell;j++)
			{
				data[i][j] = sh.getRow(i+1).getCell(j).getStringCellValue();
			 
			}
		}
		
		return data;
	}*/
	
	
	
	public String[][] readMultipleDataFromExcel(String sheet) throws IOException
	{
		String path=".//src//test/resources//SAI_BOOK9.xlsx";//taking xl file from testData
	
		
		ExcelUtil xlutil=new ExcelUtil(path);//creating an object for XLUtility
		
		int totalrows=xlutil.getRowCount(sheet);	
		int totalcols=xlutil.getCellCount(sheet,1);
				
		String logindata[][]=new String[totalrows][totalcols];//created for two dimension array which can store the data user and password
		
		for(int i=1;i<=totalrows;i++)  //1   //read the data from xl storing in two deminsional array
		{		
			for(int j=0;j<totalcols;j++)  //0    i is rows j is col
			{
				logindata[i-1][j]= xlutil.getCellData(sheet,i, j);  //1,0
			}
		}
	return logindata;//returning two dimension array
				
	}
	}


