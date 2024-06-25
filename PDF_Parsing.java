import java.util.regex.*; 
import java.io.*;

public class PDF_Parsing {
	public static String readFile(String file) throws Exception{
		
		 BufferedReader br = new BufferedReader(new FileReader(file));
		 try {
			 StringBuilder sb = new StringBuilder();
			 String line = null;
			 while((line = br.readLine()) != null) {
				 sb.append(line);
				
			 }
			 sb.deleteCharAt(sb.length()-1);
			 return sb.toString();
		 }finally {
			 br.close();
		 }
		 }
		
		
		
		public static void header(String line) {
			
			String pattern ="Fecha\\s*[^>]*>[^>]*>[^>]*>([^<]*)<[^V]*Validado\\s*por\\s*:[^>]*></td>[^>]*>([^<]*).*?Importe</b>\\s*:\\s*[^>]*>([^<]*)</b>.*?Cta.\\s*Abono\\s*:\\s*</b>\\s*</td>[^>]*>([^<]*)</td>.*?Autorizacion\\s*:\\s*</b></td>[^>]*>([^<]*)</td>.*?Proveedor\\s*:\\s*</b>\\s*</td>[^>]*>([^>]*)</td>.*?Referencia\\s*:\\s*</b>\\s*</td>[^>]*>([^<]*)</td>";
			Pattern r=Pattern.compile(pattern);
			Matcher m=r.matcher(line);
			boolean found = false; 
			
			System.out.println("######Headerlevel_Data:#########\n");
			while(m.find()) {
				int n=1;
				while(n<8) {
				System.out.println("Header Value:"+m.group(n).trim());
				n=n+1;
				}
				found = true; 
			}
			if(!found){
				System.out.println("No");
			}
		}
		
		public static void itemlevel(String line) {
			
			 String pattern = "<td\\s*align=[^\"]*\"[^\"]*\"\\s*[^>]*><font\\s*size=\\s*[^\"]*\"[^\"]*\">([^<]*)<[^<]*";
				Pattern r=Pattern.compile(pattern);
				Matcher m=r.matcher(line);
				boolean found = false; 
				
				System.out.println("\n######Itemlevel_Data:#########\n");
				while(m.find()) {
					
				System.out.println("Item level Value:"+m.group(1));
				 found = true; 
				}
				if(!found){
					System.out.println("No");
				}
			
		}

		public static void main(String[] args)throws Exception
		  {
			 String line = readFile("C:\\\\\\\\Users\\\\\\\\KIIT\\\\\\\\Downloads\\\\\\\\trainingpdf.txt");
			 header(line);
			 itemlevel(line);
			}
}
