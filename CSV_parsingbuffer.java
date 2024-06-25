import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSV_parsingbuffer {
	public static void main(String[] args) {
		training1_csv();
		
		training2_csv();
		//training3_csv();
		
	}
	
	private static void training1_csv() {
		List<String> list = new ArrayList<String>();
		String csvFile = "C:\\\\Users\\\\KIIT\\\\Downloads\\\\Training(CSV)1.csv";
		String[] header,nextRow;
		String line;
	    
	    try(BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {
	        while((line = reader.readLine()) != null) {
	        	if(line.contains("Vendor_ID")){
	        		header =line.split(",");
	        		   for (String headercell:header) {
	       	        	list.add(headercell.replace(" ", "").toUpperCase());
	       	        	
	       	        }
	       	        System.out.println(list);
	        	}else {
	        	nextRow = line.split(",");
	        
	        	System.out.print(nextRow[list.indexOf("VENDOR_ID")]+"\t");
	        	System.out.print(nextRow[list.indexOf("COMPANY_NAME")]+"\t");
	        	System.out.print(nextRow[list.indexOf("INVOICE_NUMBER")]+"\t");
	        	System.out.print(nextRow[list.indexOf("INVOICE_DATE")]+"\t");
	        	System.out.print(nextRow[list.indexOf("GROSS_AMOUNT")]+"\t");
	        	System.out.print(nextRow[list.indexOf("COMPANYCODE")]+"\t");
	        	System.out.print(nextRow[list.indexOf("CAPPROJPO")]+"\t");
	        	System.out.print(nextRow[list.indexOf("WHSEPO")]+"\t");
	        	System.out.print(nextRow[list.indexOf("CURRENCY_CODE")]+"\t");
	        	System.out.print(nextRow[list.indexOf("RECORD_STATUS")]+"\t");
	        	System.out.print(nextRow[list.indexOf("DUE_DATE")]+"\t");
	        	System.out.print(nextRow[list.indexOf("DESCRIPTIVE")]+"\t");
	        	System.out.print(nextRow[list.indexOf("VOUCHER")]+"\t");
	        	System.out.print(nextRow[list.indexOf("DISCOUNT_AMOUNT")]+"\t");
	        	System.out.print(nextRow[list.indexOf("PAYMENT_TYPE")]+"\t");
	        	System.out.print(nextRow[list.indexOf("SUFFIX")]+"\t");
	        	System.out.print(nextRow[list.indexOf("MISC1")]+"\t");
	        	System.out.print(nextRow[list.indexOf("NET_INVOICE_AMOUNT")]+"\t");
	        	System.out.print(nextRow[list.indexOf("PAYMENT_NUMBER")]+"\t");
	        	System.out.print(nextRow[list.indexOf("PAYEE_NAME1")]+"\t");
	        	System.out.print(nextRow[list.indexOf("PAYMENT_DATE")]+"\t");
	        	System.out.print(nextRow[list.indexOf("PAYMENT_AMOUNT")]+"\t");
	        	System.out.print(nextRow[list.indexOf("PAYMENT_CURRENCY_CODE")]+"\t");
	        	
	        }
	        System.out.println();
	    }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	private static void training2_csv() {
		List<String> list = new ArrayList<String>();
		String csvFile = "C:\\\\Users\\\\KIIT\\\\Downloads\\\\Training(CSV)2.csv";
		String[] header,nextRow;
		String line;
	    
	    try(BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {
	    	while((line = reader.readLine()) != null) {
	        	if(line.contains("Vendor Number")){
	        		header =line.split(",");
	         
		        for (String headercell:header) {
		        	list.add(headercell.replace(" ", "").toUpperCase());
		        	
		        }
		        System.out.println(list);
	        }
	        	else{
	        		
	        	nextRow = line.split(",",-1);
	        	System.out.print(nextRow[list.indexOf("VENDORNUMBER")]+"\t");
	        	System.out.print(nextRow[list.indexOf("CHECKNUMBER")]+"\t");
	        	System.out.print(nextRow[list.indexOf("PONUMBER")]+"\t");
	        	System.out.print(nextRow[list.indexOf("INVOICENUMBER")]+"\t");
	        	System.out.print(nextRow[list.indexOf("INVOICEDATE")]+"\t");
	        	System.out.print(nextRow[list.indexOf("CHECKDATE")]+"\t");
	        	System.out.print(nextRow[list.indexOf("GROSSAMOUNT")]+"\t");
	        	System.out.print(nextRow[list.indexOf("DISCOUNT")]+"\t");
	        	System.out.print(nextRow[list.indexOf("NETAMOUNT")]+"\t");
	        	System.out.print(nextRow[list.indexOf("COMMENTS")]+"\t");
	        	
	        }
	        	System.out.println();
	    	}
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	private static void training3_csv() {
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\\\\\\\Users\\\\\\\\KIIT\\\\\\\\Downloads\\\\\\\\Training(CSV)3.csv"));) {
            String line;
            String[] attributesHeader;
            int c=0;
            int count=0;
            List<String> list=new ArrayList<String>();
                while ((line = br.readLine()) != null) { 
                    if(line.contains("Ad Group")) {
                        attributesHeader = line.split(",");
                        for(String header:attributesHeader) {
                            list.add(header.replace(" ", "").toUpperCase());
                        }
                        count++;
                    }
                    else if(line.contains("TOTALS"))
                        {
                            count--;
                            continue;
                        }
                    else if(count>=1) {
                        String[] attributes= line.split(",");
                        System.out.print(attributes[list.indexOf("ADGROUP")]+"\t");
                        System.out.print(attributes[list.indexOf("DEAL#")]+"\t");
                        System.out.print(attributes[list.indexOf("ITEM#")]+"\t");
                        System.out.print(attributes[list.indexOf("UPC")]+"\t");
                        System.out.print(attributes[list.indexOf("ALLOW.TYPE")]+"\t");
                        System.out.print(attributes[list.indexOf("VENDORXREF")]+"\t");
                        System.out.print(attributes[list.indexOf("DESC")]+"\t");
                        System.out.print(attributes[list.indexOf("PACK")]+"\t");
                        System.out.print(attributes[list.indexOf("SIZE")]+"\t");
                        System.out.print(attributes[list.indexOf("DEAL#")]+"\t");
                        System.out.print(attributes[list.indexOf("STORE#")]+"\t");
                        System.out.print(attributes[list.indexOf("STARTDATE")]+"\t");
                        System.out.print(attributes[list.indexOf("ENDDATE")]+"\t");
                        System.out.print(attributes[list.indexOf("DEALAMT")]+"\t");
                        System.out.print(attributes[list.indexOf("MOVEMENT")]+"\t");
                        System.out.print(attributes[list.indexOf("EXTENDEDDEALAMOUNT")]+"\t");
                        System.out.print(attributes[list.indexOf("EXTENDEDCONTRACTFEE")]+"\t");
                        System.out.print(attributes[list.indexOf("TOTALOFEXTENDED")]+"\t");
                  
                        System.out.println("\n");
                        c++;
                    }
                    
                }
                
                System.out.println("total item level data:"+c);
            } catch (IOException e) {
           e.printStackTrace();
       }
	}

}
