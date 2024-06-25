import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Assignment1_Parsing {
	public static void main(String[] args) {
		header_level();
		item_level();
	}
	
	private static void header_level() {
		XSSFSheet workSheet = null;
		XSSFWorkbook wbxlsx;
		Row row;
		XSSFCell cell;
		int rowNo,i,k=0,flag=0,RowIndex=0;
		try {
			FileInputStream fis = new FileInputStream(new File("C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\KIIT\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\BAN27237.xls"));
			wbxlsx = new XSSFWorkbook(fis);
			System.out.println("Header Level Data\n");

			 if(wbxlsx != null) {
			        workSheet = wbxlsx.getSheetAt(0);

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
			            	  
			                if(cell.toString().equals("SUPPLIER # : "))
			                {
			                  System.out.println("SUPPLIER # : "+workSheet.getRow(k).getCell(i+2));
			                }
			                else if(cell.toString().equals("SUPPLIER : "))
			                {
			                  System.out.println("SUPPLIER : "+workSheet.getRow(k).getCell(i+1));
			                }
			                else if(cell.toString().equals("ADDRESS : "))
			                {  
			                  System.out.println("ADDRESS : "+workSheet.getRow(k).getCell(i+1));
			                }
			                else if(cell.toString().equals("GENERAL LEDGER # : "))
			                {  
			                  System.out.println("GENERAL LEDGER # : "+workSheet.getRow(k).getCell(i+2));
			                }
			                else if(cell.toString().equals("BUYER :"))
			                {  
			                  System.out.println("BUYER :"+workSheet.getRow(k).getCell(i+1));
			                }
			      
			          
			        }
			              }
			            }
			          k++;
			          }}


			
			            }catch (IOException e) {
			e.printStackTrace();
		}
	}
		

	private static void item_level() {
		XSSFSheet workSheet = null;
		XSSFWorkbook wbxlsx;
		Row row;
		XSSFCell cell;
		int rowNo,i,k=0,flag=0,RowIndex=0;
		try {
			FileInputStream fis = new FileInputStream(new File("C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\KIIT\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\BAN27237.xls"));
			wbxlsx = new XSSFWorkbook(fis);
			System.out.println("\n####Item Level Data####\n");
			if(wbxlsx != null){
				workSheet = wbxlsx.getSheetAt(0);

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
								if(s.equals("BAN CODE"))
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

				List<String> headerList = prepareXlsHeaderList(workSheet, RowIndex);
				
				for (rowNo = RowIndex+1; rowNo < workSheet.getLastRowNum(); rowNo++) {
					row = workSheet.getRow(rowNo);
					
					if(row!=null) {
						cell = workSheet.getRow(rowNo).getCell((short) headerList.indexOf("BANCODE"));
						if(cell!=null) {
							if(cell.toString().contains("Notes:")) {
								break;
							}
							else {
						System.out.print(cell.toString()+"\t");
						}
							}
					
						cell = workSheet.getRow(rowNo).getCell((short) headerList.indexOf("BANDESCRIPTION"));
						if(cell!=null) {
						System.out.print(cell.toString()+"\t");
						}
						
					}
					System.out.println();
				}
			} 
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static List<String> prepareXlsHeaderList(XSSFSheet workSheet, int index) {
		List<String> headersList = new ArrayList<String>();
		for (int cell = 0; cell < workSheet.getRow(index).getLastCellNum(); cell++) {
			XSSFCell hcell = workSheet.getRow(index).getCell((short) cell);
			headersList.add(null!=hcell?hcell.getRichStringCellValue().toString().toUpperCase().replaceAll(" ", ""):"");
		}
		return headersList;
	}

	
}




