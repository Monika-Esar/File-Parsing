import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
		
public class ExcelParsing {
	public static void main(String[] args) {
		HSSFSheet workSheet = null;
		HSSFWorkbook wbxlsx;
		Row row;
		HSSFCell cell;
		int rowNo,i,k=0,flag=0,RowIndex=0;
		try {
			FileInputStream fis = new FileInputStream(new File("C:\\2021_batch\\Excel\\sobeys.xls"));
			wbxlsx = new HSSFWorkbook(fis);

			if(wbxlsx != null){
				workSheet = wbxlsx.getSheetAt(0);
//--------------------------------------------------------------------FOR DYNAMIC HEADERS--------------------------------------------------------------
				rowNo=workSheet.getLastRowNum();
				while(k<rowNo)
				{
					row=workSheet.getRow(k);
					if(row!=null)
					{
						for(i=0;i< workSheet.getRow(k).getLastCellNum();i++)
						{
							cell=workSheet.getRow(k).getCell(i);
							if(cell!=null)
							{
								String s=cell.toString();
								if(s.equals("Debit type"))//Ref. Number
								{
									flag=1;
									break;
								}
							}
						}
					}
					

					if(flag==1)
					{
						RowIndex=k;
						break;
					}
					k++;
				}
//-----------------------------------------------------------------------------------------------------------------------------------------------------
				List<String> headerList = prepareXlsHeaderList(workSheet, RowIndex);
			
				for (rowNo = RowIndex+1; rowNo < workSheet.getLastRowNum(); rowNo++) {
					row = workSheet.getRow(rowNo);
					if(row!=null) {
						cell = workSheet.getRow(rowNo).getCell((short) headerList.indexOf("REF.NUMBER"));
						System.out.print(cell.toString()+"\t");
						cell = workSheet.getRow(rowNo).getCell((short) headerList.indexOf("DEBITTYPE"));
						System.out.print(cell.toString()+"\t");
						cell = workSheet.getRow(rowNo).getCell((short) headerList.indexOf("DOCUMENTDATE"));
						System.out.print(cell.toString()+"\t");
						cell = workSheet.getRow(rowNo).getCell((short) headerList.indexOf("AMOUNT"));
						System.out.print(cell.toString()+"\t");
						cell = workSheet.getRow(rowNo).getCell((short) headerList.indexOf("OTHER"));
						System.out.print(cell.toString()+"\t");
						cell = workSheet.getRow(rowNo).getCell((short) headerList.indexOf("REGION"));
						System.out.print(cell.toString()+"\t");
						cell = workSheet.getRow(rowNo).getCell((short) headerList.indexOf("CLAIMDOC"));
						System.out.print(cell.toString()+"\t");
						
					}
					System.out.println();
				}
			} 
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static List<String> prepareXlsHeaderList(HSSFSheet workSheet, int index) {
		List<String> headersList = new ArrayList<String>();
		for (int cell = 0; cell < workSheet.getRow(index).getLastCellNum(); cell++) {
			HSSFCell hcell = workSheet.getRow(index).getCell((short) cell);
			headersList.add(null!=hcell?hcell.getRichStringCellValue().toString().toUpperCase().replaceAll(" ", ""):"");
		}
		return headersList;
	}

}



