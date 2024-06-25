import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import au.com.bytecode.opencsv.CSVReader; 

public class CSV_parsing {
	 public static void main(String[] args) {
//       Navigation a = new Navigation(); // Company reference and object
//       a.navigation();
//        newInterntest();
        csvIntern();
        csvReaderMethod();
    }
    
    private static void csvIntern() {

       try(BufferedReader br = new BufferedReader(new FileReader("C:\\\\\\\\Users\\\\\\\\KIIT\\\\\\\\Downloads\\\\\\\\Training(CSV)3.csv"));) {
            String line;
            String[] attributesHeader;
            int count=0;
            int c=0;
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
                        System.out.println(attributes[list.indexOf("ADGROUP")]);
                        System.out.println(attributes[list.indexOf("VENDORXREF")]);
                        System.out.println(attributes[list.indexOf("SIZE")]);
                        c++;
                    }
                    
                }
                System.out.println("t"+c);
            } catch (IOException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       }
   }

   public static void csvReaderMethod() {

       String csvFile = "C:\\\\\\\\Users\\\\\\\\KIIT\\\\\\\\Downloads\\\\\\\\Training(CSV)1.csv";

       CSVReader reader = null;
       try {
           reader = new CSVReader(new FileReader(csvFile));
           String[] line;
           while ((line = reader.readNext()) != null) {
               System.out.println("[Vendor_ID " + line[0] + ", Company_Name " + line[1] + " , Invoice_Number " + line[2] + "]");
           }
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
    
   public static void newInterntest() {
        try { 
                BufferedReader br = new BufferedReader(new FileReader("D:\\training(HTML).html"));
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();
                while (line != null) { sb.append(line).append("\n");
                line = br.readLine(); }
                String fileAsString = sb.toString();
                Pattern p = Pattern.compile("Fecha\\s*:[^\\n]+\\s*<td [^>]+>\\s*([^<]+)");
                Matcher m = p.matcher(fileAsString);
                if(m.find()) {
                    System.out.println("Fetcha = " +m.group(1));
                }
                String itemParent = null;
                Pattern patternItemParent = Pattern.compile("Pedido</b>\\s*</td>(.*)?Totales", Pattern.DOTALL|Pattern.MULTILINE|Pattern.CASE_INSENSITIVE);
                Matcher matcherItemParent = patternItemParent.matcher(fileAsString);
                if(matcherItemParent.find()) {
                    itemParent = matcherItemParent.group(1);
                    Pattern patternItemLevel = Pattern.compile("<tr>\\s*<td[^>]+><[^>]+>([^<]+)[^\\n]+\\s*<td[^>]+><[^>]+>([^<]+)[^\\n]+\\s*</tr>\\s*<tr>\\s*<td[^>]+><[^>]+>([^<]+)[^\\n]+\\s*<td[^>]+><[^>]+>([^<]+)[^\\n]+\\s*<td[^>]+><[^>]+>([^<]+)[^\\n]+\\s*<td[^>]+><[^>]+>([^<]+)[^\\n]+\\s*<td[^>]+><[^>]+>([^<]+)[^\\n]+\\s*<td[^>]+><[^>]+>([^<]+)[^\\n]+\\s*<td[^>]+><[^>]+>([^<]+)[^\\n]+\\s*<td[^>]+><[^>]+>([^<]+)[^\\n]+\\s*<td[^>]+><[^>]+>([^<]+)[^\\n]+\\s*<td[^>]+><[^>]+>([^<]+)[^\\n]+\\s*<td[^>]+><[^>]+>([^<]+)[^\\n]+\\s*<td[^>]+><[^>]+>([^<]+)[^\\n]+");
                    Matcher matcherItemLevel = patternItemLevel.matcher(itemParent);
                    int i =1;
                    while(matcherItemLevel.find()) {
                        System.out.println("Item Level Start : "+Integer.toString(i));
                        System.out.println("Codigo = " +matcherItemLevel.group(1).replaceAll("([\\s]{3,})", "")+' '+matcherItemLevel.group(3));
                        System.out.println("P.Lista = " +matcherItemLevel.group(4));
                        System.out.println("S/Cargo = " +matcherItemLevel.group(5));
                        System.out.println("Ds.1 = " +matcherItemLevel.group(6));
                        System.out.println("Ds.2 = " +matcherItemLevel.group(7));
                        System.out.println("Ds.3 = " +matcherItemLevel.group(8));
                        System.out.println("Ds.4 = " +matcherItemLevel.group(9));
                        System.out.println("Ds.5 = " +matcherItemLevel.group(10));
                        System.out.println("Costo = " +matcherItemLevel.group(11));
                        System.out.println("Total. = " +matcherItemLevel.group(12));
                        System.out.println("Pedido = " +matcherItemLevel.group(13));
                        System.out.println("Item Level End : "+Integer.toString(i++));
    
                    }
                }
            }
           catch (IOException e) { 
               System.out.println("exception occoured" + e); 
           } 
    }
}



