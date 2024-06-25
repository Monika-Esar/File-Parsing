
import java.util.regex.*;
import java.io.*;

public class Assignment2_PdfParsing {
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
			
			String pattern ="</span>[^>]*>[^>]*>[^>]*>([^<]*)</span>";
			Pattern r=Pattern.compile(pattern);
			Matcher m=r.matcher(line);
			boolean found = false; 
			
			System.out.println("######Headerlevel_Data:#########\n");
			while(m.find()) {
				
				System.out.println(m.group(1));
				found = true; 
			}
			if(!found){
				System.out.println("No");
			}
		}
		
		public static void itemlevel(String line) {
			
			 String pattern = "<a class[^?]*\\?po[^>]*>([^<]*)</a>.*?<!--todo add a span-->([^<]*)<[^>]*>[^>]*>.*?<!--todo add a span-->([^<]*)<[^>]*>[^>]*>.*?<a\\s*class[^>]*>([^<]*)</a>.*?<!--todo add a span-->([^<]*)<[^>]*>[^>]*>.*?<!--todo add a span-->([^<]*)<[^>]*>[^>]*>.*?<!--todo add a span-->([^<]*)<[^>]*>[^>]*>.*?<!--todo add a span-->([^<]*)<[^>]*>[^>]*>.*?<!--todo add a span-->([^<]*)<[^>]*>[^>]*>.*?<!--todo add a span-->([^<]*)<[^>]*>[^>]*>.*?<!--todo add a span-->([^<]*)<[^>]*>[^>]*>.*?<!--todo add a span-->([^<]*)<[^>]*>[^>]*>.*?<!--todo add a span-->([^<]*)<[^>]*>[^>]*>.*?<!--todo add a span-->([^<]*)<[^>]*>[^>]*>.*?<!--todo add a span-->([^<]*)<[^>]*>[^>]*>";
				Pattern r=Pattern.compile(pattern);
				Matcher m=r.matcher(line);
				boolean found = false; 
				
				System.out.println("\n######Itemlevel_Data:#########\n");
				while(m.find()) {
				
				System.out.println(m.group(1).trim()+"\t"+m.group(2).trim()+"\t"+m.group(3).trim()+"\t"+m.group(4).trim()
						+"\t"+m.group(5).trim()+"\t"+m.group(6).trim()+"\t"+m.group(7).trim()+"\t"+m.group(8).trim()+"\t"+m.group(9).trim()
						+"\t"+m.group(10).trim()+"\t"+m.group(11).trim()+"\t"+m.group(12).trim()+"\t"+m.group(13).trim()+"\t"+m.group(14).trim()
						+"\t"+m.group(15).trim());
				
				 found = true; 
				}
				if(!found){
					System.out.println("No");
				}
			
		}
		

		public static void main(String[] args)throws Exception
		  {
			 String line = readFile("C:\\\\\\\\Users\\\\\\\\KIIT\\\\\\\\Downloads\\\\\\\\Item level(HTML response).txt.html");
			 String line1 = readFile("C:\\\\\\\\Users\\\\\\\\KIIT\\\\\\\\Downloads\\\\\\\\Header(HTML response).txt.html");
			
			 header(line1);
			itemlevel(line);
			
			}



	
}


