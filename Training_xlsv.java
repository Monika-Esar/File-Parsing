import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Training_xlsv {

  public static void main(String args[]) throws IOException{
    FileInputStream file=new FileInputStream(new File("C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\KIIT\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\BAN27237.xls"));
    XSSFWorkbook workbook=new XSSFWorkbook(file);
    XSSFSheet workSheet=workbook.getSheetAt(0);  //Sheet no.
    for(int i = 0;i <=workSheet.getLastRowNum();i++){
      //HEADER LEVEL DATA
      XSSFRow row = workSheet.getRow(i);
      if(i<=12) {
        for(int j = 0;j<=workSheet.getRow(i).getLastCellNum();j++){
                if(row.getCell(j)!=null)
                {  
                  System.out.print(row.getCell(j) +"\t");
                }
            }
            System.out.println();
      }
      //ITEM LEVEL DATA
      else if(i>12 && i<=workSheet.getLastRowNum()) {
        for(int j = 0;j<=workSheet.getRow(i).getLastCellNum();j++){
                if(row.getCell(j)!=null && (!(String.valueOf(row.getCell(j)).isEmpty())))
                {  
                  System.out.print(row.getCell(j) +"\t");
                }
            }
            System.out.println();
      }
      }
    
    workbook.close();
  }
}

/*import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class Training_xlsv {
			  public static void main(String args[]) {
			    HSSFSheet worksheet = null;
			    HSSFWorkbook workbook = null;
			    Row row;
			    HSSFCell cell;
			    int k=0,flag=0,RowIndex=0;
			    try {

			      FileInputStream fis = new FileInputStream(new File("C:\\\\Users\\\\KIIT\\\\Downloads\\\\Telegram Desktop\\\\Training2(XLS).xls"));
			      workbook = new HSSFWorkbook(fis);

			      if(workbook != null) {
			        worksheet = workbook.getSheetAt(0);

			        int rowNo=worksheet.getLastRowNum();
			        while(k<rowNo)
			        {
			          row=worksheet.getRow(k);
			          if(row!=null)
			          {
			            for(int i=0;i< worksheet.getRow(k).getLastCellNum();i++)
			            {
			              cell=worksheet.getRow(k).getCell(i);
			              if(cell!=null)
			              {
			                if(cell.toString().equals("DAT"))
			                {
			                  System.out.println("DAT: "+worksheet.getRow(k).getCell(i+1));
			                }
			                else if(cell.toString().equals("INVOICE DAT"))
			                {
			                  System.out.println("INVOICE DAT: "+worksheet.getRow(k).getCell(i+1));
			                }
			                else if(cell.toString().equals("INVOICE NUMBE"))
			                {  
			                  System.out.println("INVOICE NUMBE: "+worksheet.getRow(k).getCell(i+1));
			                }
			                if(cell.toString().equals("QTY"))
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

			        List<String> headerList = prepareXlsHeaderList(worksheet, RowIndex);

			        for (rowNo = RowIndex+1; rowNo < worksheet.getLastRowNum(); rowNo++) {
			          row = worksheet.getRow(rowNo);
			          if(row!=null) {
			            cell = worksheet.getRow(rowNo).getCell((short) headerList.indexOf("QTY"));
			            if(cell!=null) {
			              if(cell.toString()!="")
			                System.out.print(cell.toString()+"\t");
			            }  
			            cell = worksheet.getRow(rowNo).getCell((short) headerList.indexOf("PRODUCT"));
			            if(cell!=null) {
			              if(cell.toString()!="")
			                System.out.print(cell.toString()+"\t");
			            }
			            cell = worksheet.getRow(rowNo).getCell((short) headerList.indexOf("PRICE"));
			            if(cell!=null) {
			              if(cell.toString()!="")
			                System.out.print(cell.toString()+"\t");
			            }
			            cell = worksheet.getRow(rowNo).getCell((short) headerList.indexOf("CREDITREQUIRED"));
			            if(cell!=null) {
			              if(cell.toString()!="")
			                System.out.print(cell.toString()+"\n");
			            }
			          }
			        }

			      }
			    }
			    catch(Exception e)
			    {
			      e.printStackTrace();
			    }
			  }
			  private static List<String> prepareXlsHeaderList(HSSFSheet worksheet, int index) {
			    List<String> headersList = new ArrayList<String>();
			    for (int cell = 0; cell < worksheet.getRow(index).getLastCellNum(); cell++) {
			      HSSFCell hcell = worksheet.getRow(index).getCell((short) cell);
			      headersList.add(null!=hcell?hcell.getRichStringCellValue().toString().toUpperCase().replaceAll(" ", ""):"");
			    }
			    return headersList;
			  }
			*/
	/*public static void main(String[] args) {
		XSSFSheet workSheet = null;
		XSSFWorkbook wbxlsx;
		Row row;
		XSSFCell cell;
		int rowNo,i,k=0,flag=0,RowIndex=0,t=0;
		try {
			FileInputStream fis = new FileInputStream(new File("C:\\Users\\KIIT\\Downloads\\Telegram Desktop\\Training(XLSX).xlsx"));
			wbxlsx = new XSSFWorkbook(fis);

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
								if(s.equals("Vendor ID"))//Ref. Number
								{
									flag=1;
									break;
								}/*else if(s.equals("Notes:")) {
									flag=2;
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
					//t++;
				}

				List<String> headerList = prepareXlsHeaderList(workSheet, RowIndex);
				System.out.println(headerList);
				while(RowIndex<rowNo)
				{
					row=workSheet.getRow(k);
					if(row!=null)
					{
						for(i=k;i< workSheet.getRow(k).getLastCellNum();i++)
						{
							cell=workSheet.getRow(k).getCell(i);
							if(cell!=null)
							{
								String s=cell.toString();
								if(s.equals("Notes:"))//Ref. Number
								{
									flag=2;
									break;
								}/*else if(s.equals("Notes:")) {
									flag=2;
									break;
									
								}
								
							}
						}
					}
					
					
					if(flag==2)
					{
						t=k;
						break;
					}
					k++;
					//t++;
				}

				for (rowNo = RowIndex+1; rowNo < t-1; rowNo++) {
					row = workSheet.getRow(rowNo);
				
					if(row!=null) {
						
						cell = workSheet.getRow(rowNo).getCell((short) headerList.indexOf("VENDORID"));
						/*if(cell!=null) {
						System.out.print(cell.toString()+"\t");
						}
						XSSFCell cell1 = workSheet.getRow(rowNo).getCell((short) headerList.indexOf("ACCRUAL(BILLING)PERIOD"));
						XSSFCell cell2 = workSheet.getRow(rowNo).getCell((short) headerList.indexOf("PROGRAM"));
						XSSFCell cell3 = workSheet.getRow(rowNo).getCell((short) headerList.indexOf("VENDORPERCENT"));
						XSSFCell cell4 = workSheet.getRow(rowNo).getCell((short) headerList.indexOf("INVOICEAMOUNT"));
						if(cell.toString()!=" " && cell1.toString()!=" " && cell2.toString()!=" " && cell3.toString()!=" " && cell4.toString()!=" ") {
							System.out.print(cell.toString()+"\t");
							System.out.print(cell1.toString()+"\t");
							System.out.print(cell2.toString()+"\t");
							System.out.print(cell3.toString()+"\t");
							System.out.print(cell4.toString()+"\t");
							
							}
						else {
							System.out.println("sth");
							continue;
							//break;
						}
						
						/*cell = workSheet.getRow(rowNo).getCell((short) headerList.indexOf("ACCRUAL(BILLING)PERIOD"));
						System.out.print(cell.toString()+"\t");
						cell = workSheet.getRow(rowNo).getCell((short) headerList.indexOf("PROGRAM"));
						System.out.print(cell.toString()+"\t");
						cell = workSheet.getRow(rowNo).getCell((short) headerList.indexOf("VENDORPERCENT"));
						System.out.print(cell.toString()+"\t");
						cell = workSheet.getRow(rowNo).getCell((short) headerList.indexOf("INVOICEAMOUNT"));
						System.out.print(cell.toString()+"\t");
					
						
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

*/

