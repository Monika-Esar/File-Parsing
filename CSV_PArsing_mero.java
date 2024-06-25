import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader; 

public class CSV_PArsing_mero {
	public static void main(String[] args) {
		//training1_csv();
		
		//training2_csv();
		//training3_csv();
		//training6_csv();
		//training_6csv();
		training4_csv();
	}
	
	

	private static void training1_csv() {
		List<String> list = new ArrayList<String>();
		String csvFile = "C:\\\\Users\\\\KIIT\\\\Downloads\\\\Training(CSV)1.csv";
	
	    
	    try(CSVReader reader = new CSVReader(new FileReader(csvFile))) {
	        
	        String[] header,nextRow;
	        header = reader.readNext();
	        for (String headercell:header) {
	        	list.add(headercell.replace(" ", "").toUpperCase());
	        	
	        }
	        System.out.println(list);
	        while ((nextRow = reader.readNext()) != null) {
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
	        	System.out.println();
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	private static void training2_csv() {
		List<String> list = new ArrayList<String>();
		String csvFile = "C:\\\\Users\\\\KIIT\\\\Downloads\\\\Training(CSV)2.csv";
	
	    
	    try(CSVReader reader = new CSVReader(new FileReader(csvFile))) {
	        
	        String[] header,nextRow;
	        header = reader.readNext();
	        for (String headercell:header) {
	        	list.add(headercell.replace(" ", "").toUpperCase());
	        	
	        }
	        System.out.println(list);
	        while ((nextRow = reader.readNext()) != null) {
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
                  
                        System.out.println();
                        c++;
                    }
                    
                }
                
                System.out.println("total item level data:"+c);
            } catch (IOException e) {
           e.printStackTrace();     
       }
	}

	private static void training6_csv() {
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\\\\\\\Users\\\\\\\\KIIT\\\\\\\\Downloads\\\\\\\\Training(CSV)6.csv"));) {
            String line;
            String[] attributesHeader;
            int c=0;
            int count=0;
            List<String> list=new ArrayList<String>();
                while ((line = br.readLine()) != null) { 
                    if(line.contains("PO Date")) {
                        attributesHeader = line.split(",");
                        for(String header:attributesHeader) {
                            list.add(header.replace(" ", "").toUpperCase());
                        }
                        count++;
                    }else if(line.contains("Total Amount"))
                    {
                        count--;
                        continue;
                    }
                    else if(count>=1) {
                        String[] attributes= line.split(",",-1);
                        System.out.print(attributes[list.indexOf("PODATE")]+"\t");
                        System.out.print(attributes[list.indexOf("PO#")]+"\t");
                        System.out.print(attributes[list.indexOf("VENDOR#")]+"\t");
                        System.out.print(attributes[list.indexOf("VENDORNAME")]+"\t");
                        System.out.print(attributes[list.indexOf("MATERIAL#")]+"\t");
                        System.out.print(attributes[list.indexOf("DESCRIPTION")]+"\t");
                        System.out.print(attributes[list.indexOf("MFG.PART#")]+"\t");
                        System.out.print(attributes[list.indexOf("PLANT")]+"\t");
                        System.out.print(attributes[list.indexOf("QTY")]+"\t");
                        System.out.print(attributes[list.indexOf("UOM")]+"\t");
                        System.out.print(attributes[list.indexOf("RATE")]+"\t");
                        System.out.print(attributes[list.indexOf("CURR")]+"\t");
                        System.out.print(attributes[list.indexOf("ADMFEE")]+"\t");
                        System.out.print(attributes[list.indexOf("REBATEAMT")]+"\t");
                       
                        System.out.println();
                        c++;
                    }
                    
                }
                
                System.out.println("total item level data:"+c);
            } catch (IOException e) {
           e.printStackTrace();
       }
	}
	
	private static void training_6csv() {
		try(CSVReader reader = new CSVReader(new FileReader("C:\\\\\\\\Users\\\\\\\\KIIT\\\\\\\\Downloads\\\\\\\\Training(CSV)6.csv"))) {
			List<String> list=new ArrayList<String>();
		    int count=0;
		    int c=0;
		    String[] nextRow;
		   
		       while((nextRow = reader.readNext())!=null)
		       { 
		    	   List<String> l=Arrays.asList(nextRow);
		    	   if (l.contains("PO Date"))
		    	   {
		         
		             	for(String headercell1:l ) {
		                	
		                    list.add(headercell1.replace(" ", "").toUpperCase());
		     
		                    }
		                    count++;
		                   System.out.println(list);
		            
		       }	
		    
		    	   else if(l.contains("Total Amount"))
		                {
		                    count--;
		                    continue;
		                }
		            else if(count>=1) {
		              
		            	System.out.print(nextRow[list.indexOf("PODATE")]+"\t");
                        System.out.print(nextRow[list.indexOf("PO#")]+"\t");
                        System.out.print(nextRow[list.indexOf("VENDOR#")]+"\t");
                        System.out.print(nextRow[list.indexOf("VENDORNAME")]+"\t");
                        System.out.print(nextRow[list.indexOf("MATERIAL#")]+"\t");
                        System.out.print(nextRow[list.indexOf("DESCRIPTION")]+"\t");
                        System.out.print(nextRow[list.indexOf("MFG.PART#")]+"\t");
                        System.out.print(nextRow[list.indexOf("PLANT")]+"\t");
                        System.out.print(nextRow[list.indexOf("QTY")]+"\t");
                        System.out.print(nextRow[list.indexOf("UOM")]+"\t");
                        System.out.print(nextRow[list.indexOf("RATE")]+"\t");
                        System.out.print(nextRow[list.indexOf("CURR")]+"\t");
                        System.out.print(nextRow[list.indexOf("ADMFEE")]+"\t");
                        System.out.print(nextRow[list.indexOf("REBATEAMT")]+"\t");
                  
                        System.out.println();
		                
		                
		                c++;
		            }
		            
		                
		                
		             	
		       }
		        System.out.println("total item level data:"+c);
		    } catch (IOException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		}
	}
	
	private static void training4_csv() {
		
		List<String> list = new ArrayList<String>();
		String csvFile = "C:\\\\Users\\\\KIIT\\\\Downloads\\\\Training(CSV)4.csv";
	
	    
	    try(CSVReader reader = new CSVReader(new FileReader(csvFile))) {
	        
	        String[] header,nextRow;
	        header = reader.readNext();
	        for (String headercell:header) {
	        	list.add(headercell.replace(" ", "").toUpperCase());
	        	
	        }
	        System.out.println(list);
	        while ((nextRow = reader.readNext()) != null) {
	        	System.out.print(nextRow[list.indexOf("DATE")]+"\t");
	        	System.out.print(nextRow[list.indexOf("TRX/ORDERNUMBER")]+"\t");
	        	System.out.print(nextRow[list.indexOf("VENDORNAME")]+"\t");
	        	System.out.print(nextRow[list.indexOf("VENDORNUMBER")]+"\t");
	        	System.out.print(nextRow[list.indexOf("BILLBACKDATE")]+"\t");
	        	System.out.print(nextRow[list.indexOf("APINVOICENUMBER")]+"\t");
	        	System.out.print(nextRow[list.indexOf("BILLBACKSOURCE")]+"\t");
	        	System.out.print(nextRow[list.indexOf("BILLBACKREASON")]+"\t");
	        	System.out.print(nextRow[list.indexOf("OFFERCODE")]+"\t");
	        	System.out.print(nextRow[list.indexOf("CUSTOMERNAME")]+"\t");
	        	System.out.print(nextRow[list.indexOf("ACCOUNTNUMBER")]+"\t");
	        	System.out.print(nextRow[list.indexOf("ACCOUNTNAME")]+"\t");
	        	System.out.print(nextRow[list.indexOf("UPC")]+"\t");
	        	System.out.print(nextRow[list.indexOf("ITEM#")]+"\t");
	        	System.out.print(nextRow[list.indexOf("BRAND")]+"\t");
	        	System.out.print(nextRow[list.indexOf("ITEMDESCRIPTION")]+"\t");
	        	System.out.print(nextRow[list.indexOf("PACKSIZE")]+"\t");
	        	System.out.print(nextRow[list.indexOf("UOM")]+"\t");
	        	System.out.print(nextRow[list.indexOf("QTY")]+"\t");
	        	System.out.print(nextRow[list.indexOf("LBS")]+"\t");
	        	System.out.print(nextRow[list.indexOf("CURRENCY")]+"\t");
	        	System.out.print(nextRow[list.indexOf("AMOUNT")]+"\t");
	        	System.out.println();
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
		
	}
}


