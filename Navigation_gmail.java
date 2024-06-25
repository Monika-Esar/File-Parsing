import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpParams;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class Navigation_gmail {
	
	public static void main(String[] args) {
	//	github_her();
      //kiit_sap();
		//cuchd_blackboard();
		//flipkart_ko();
		amazon();
    }


	private static void amazon() {
		 HttpClient client = HttpClients.createDefault();
	        
	        HttpGet httpget = new HttpGet("https://www.amazon.com/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=samsung+a52");
	                    
	        HttpPost post = new HttpPost("https://www.amazon.com/s/query?k=samsung%20a52&page=3&qid=1620897841&ref=sr_pg_2");
	        try {
	        	//Printing the method used
	      		System.out.println("Request Type: "+httpget.getMethod());
	      		
	      		//Executing the Get request
	      		HttpResponse httpresponse = client.execute(httpget);
	      		
	      		System.out.println("get method");
	      		 // Get HttpResponse Status
	              System.out.println(httpresponse.getProtocolVersion());              // HTTP/1.1
	              System.out.println(httpresponse.getStatusLine().getStatusCode());   // 200
	              System.out.println(httpresponse.getStatusLine().getReasonPhrase()); // OK
	              System.out.println(httpresponse.getStatusLine().toString());     
	              StringBuilder sb = new StringBuilder();
	              HttpEntity entity = httpresponse.getEntity();
	              if (entity != null) {
	                  // return it as a String
	                  String result = EntityUtils.toString(entity);
	                  sb.append(result);
	                 // System.out.println(result);
	              }
	              FileWriter fstream = new FileWriter("flip.html");
	              BufferedWriter out = new BufferedWriter(fstream);
	              out.write(sb.toString());
	              out.close();
	            
	        
	          /*  List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
	            nameValuePairs.add(new BasicNameValuePair("k","samsung%20a52"));
	            nameValuePairs.add(new BasicNameValuePair("page","3"));
	            nameValuePairs.add(new BasicNameValuePair("qid","1620897841"));
	            nameValuePairs.add(new BasicNameValuePair("ref","sr_pg_2"));*/
	           /* List<NameValuePair> nameValuePairs1 = new ArrayList<NameValuePair>();
	            nameValuePairs1.add(new BasicNameValuePair("customer-action","pagination"));
	           /* URIBuilder ub = new URIBuilder(post.getURI());
	            String url = ub.addParameters(nameValuePairs).toString();
	            System.out.println(url);
	            post.setEntity(new StringEntity(url));*/
	           // String url = ub.toString();
	            
	            
	           // post.setEntity(new UrlEncodedFormEntity());
	           // post.setEntity(new StringEntity(nameValuePairs.toString()));
	         //   post.setEntity(new UrlEncodedFormEntity(nameValuePairs1));
	            
	            HttpResponse response = client.execute(post);
	            
	            System.out.println("post method");
	    		//Printing the status line
	           
	    		System.out.println(response.getProtocolVersion());              // HTTP/1.1
	            System.out.println(response.getStatusLine().getStatusCode());   // 200
	            System.out.println(response.getStatusLine().getReasonPhrase()); // OK
	            System.out.println(response.getStatusLine().toString());        // HTTP/1.1 200 OK

	           /* BufferedReader rd = new BufferedReader(new InputStreamReader(
	                    response.getEntity().getContent()));
	            String line = "";
	            while ((line = rd.readLine()) != null) {
	                System.out.println(line);
	            }*/
	          /*  Scanner sc = new Scanner(response.getEntity().getContent());
	    		while(sc.hasNext()) {
	    			System.out.println(sc.nextLine());
	    		}
	    		*/
	            StringBuilder sb1 = new StringBuilder();
	            HttpEntity entity1 = response.getEntity();
	              if (entity1 != null) {
	                  // return it as a String
	                  String result = EntityUtils.toString(entity1);
	                  sb1.append(result);
	                 // System.out.println(result);
	              }
	              FileWriter fstream1 = new FileWriter("flip1.html");
	              BufferedWriter out1 = new BufferedWriter(fstream1);
	              out1.write(sb1.toString());
	              out1.close();
	    		

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
		
	}


	private static void flipkart_ko() {
		// TODO Auto-generated method stub
		
		 HttpClient client = HttpClients.createDefault();
	        
	        HttpGet httpget = new HttpGet("https://www.flipkart.com/search?q=dress+for+women+gown&sid=clo%2Codx%2Cod7%2C0xx&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_3_9_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_3_9_na_na_na&as-pos=3&as-type=RECENT&suggestionId=dress+for+women+gown%7CWomen%27s+Gowns&requestId=3b6b2b52-bb29-4aaf-b065-7812d04e685d&as-searchtext=dress%20for");
	                    
	        HttpGet post = new HttpGet("https://rukminim1.flixcart.com/image/100/100/kmf7ki80/mobile/r/z/1/galaxy-a52-sm-a525fzkhins-samsung-original-imagfb4vgf9eez3j.jpeg?q=90");
	        try {
	        	//Printing the method used
	      		System.out.println("Request Type: "+httpget.getMethod());
	      		
	      		//Executing the Get request
	      		HttpResponse httpresponse = client.execute(httpget);
	      		
	      		System.out.println("get method");
	      		 // Get HttpResponse Status
	              System.out.println(httpresponse.getProtocolVersion());              // HTTP/1.1
	              System.out.println(httpresponse.getStatusLine().getStatusCode());   // 200
	              System.out.println(httpresponse.getStatusLine().getReasonPhrase()); // OK
	              System.out.println(httpresponse.getStatusLine().toString());     
	              StringBuilder sb = new StringBuilder();
	              HttpEntity entity = httpresponse.getEntity();
	              if (entity != null) {
	                  // return it as a String
	                  String result = EntityUtils.toString(entity);
	                  sb.append(result);
	                 // System.out.println(result);
	              }
	              FileWriter fstream = new FileWriter("flip.html");
	              BufferedWriter out = new BufferedWriter(fstream);
	              out.write(sb.toString());
	              out.close();
	           /*   
	        
	            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
	            nameValuePairs.add(new BasicNameValuePair("j_username","1805735"));
	            nameValuePairs.add(new BasicNameValuePair("j_password","7777"));
	            post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
	            // send a JSON data post.setEntity(new StringEntity(entity.toString()));*/
	            
	            HttpResponse response = client.execute(post);
	            
	            System.out.println("post method");
	    		//Printing the status line
	    		System.out.println(response.getProtocolVersion());              // HTTP/1.1
	            System.out.println(response.getStatusLine().getStatusCode());   // 200
	            System.out.println(response.getStatusLine().getReasonPhrase()); // OK
	            System.out.println(response.getStatusLine().toString());        // HTTP/1.1 200 OK

	           /* BufferedReader rd = new BufferedReader(new InputStreamReader(
	                    response.getEntity().getContent()));
	            String line = "";
	            while ((line = rd.readLine()) != null) {
	                System.out.println(line);
	            }*/
	          /*  Scanner sc = new Scanner(response.getEntity().getContent());
	    		while(sc.hasNext()) {
	    			System.out.println(sc.nextLine());
	    		}
	    		*/
	            StringBuilder sb1 = new StringBuilder();
	            HttpEntity entity1 = response.getEntity();
	              if (entity1 != null) {
	                  // return it as a String
	                  String result = EntityUtils.toString(entity1);
	                  sb1.append(result);
	                 // System.out.println(result);
	              }
	              FileWriter fstream1 = new FileWriter("flip1.html");
	              BufferedWriter out1 = new BufferedWriter(fstream1);
	              out1.write(sb1.toString());
	              out1.close();
	    		

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
	}


	private static void kiit_sap() {
		// TODO Auto-generated method stub
		 HttpClient client = HttpClients.createDefault();
	        
	        HttpGet httpget = new HttpGet("https://kiitportal.kiituniversity.net/irj/portal/");
	                    
	        HttpPost post = new HttpPost("https://kiitportal.kiituniversity.net/irj/portal/");
	        try {
	        	//Printing the method used
	      		System.out.println("Request Type: "+httpget.getMethod());
	      		
	      		//Executing the Get request
	      		HttpResponse httpresponse = client.execute(httpget);
	      		
	      		System.out.println("get method");
	      		 // Get HttpResponse Status
	              System.out.println(httpresponse.getProtocolVersion());              // HTTP/1.1
	              System.out.println(httpresponse.getStatusLine().getStatusCode());   // 200
	              System.out.println(httpresponse.getStatusLine().getReasonPhrase()); // OK
	              System.out.println(httpresponse.getStatusLine().toString());     
	              StringBuilder sb = new StringBuilder();
	              HttpEntity entity = httpresponse.getEntity();
	              if (entity != null) {
	                  // return it as a String
	                  String result = EntityUtils.toString(entity);
	                  sb.append(result);
	                 // System.out.println(result);
	              }
	              FileWriter fstream = new FileWriter("Kiit.html");
	              BufferedWriter out = new BufferedWriter(fstream);
	              out.write(sb.toString());
	              out.close();
	              
	        
	            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
	            nameValuePairs.add(new BasicNameValuePair("j_username","1805735"));
	            nameValuePairs.add(new BasicNameValuePair("j_password","7777"));
	            post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
	            // send a JSON data post.setEntity(new StringEntity(entity.toString()));
	            
	            HttpResponse response = client.execute(post);
	            
	            System.out.println("post method");
	    		//Printing the status line
	    		System.out.println(response.getProtocolVersion());              // HTTP/1.1
	            System.out.println(response.getStatusLine().getStatusCode());   // 200
	            System.out.println(response.getStatusLine().getReasonPhrase()); // OK
	            System.out.println(response.getStatusLine().toString());        // HTTP/1.1 200 OK

	           /* BufferedReader rd = new BufferedReader(new InputStreamReader(
	                    response.getEntity().getContent()));
	            String line = "";
	            while ((line = rd.readLine()) != null) {
	                System.out.println(line);
	            }*/
	          /*  Scanner sc = new Scanner(response.getEntity().getContent());
	    		while(sc.hasNext()) {
	    			System.out.println(sc.nextLine());
	    		}
	    		*/
	            StringBuilder sb1 = new StringBuilder();
	            HttpEntity entity1 = response.getEntity();
	              if (entity1 != null) {
	                  // return it as a String
	                  String result = EntityUtils.toString(entity1);
	                  sb1.append(result);
	                 // System.out.println(result);
	              }
	              FileWriter fstream1 = new FileWriter("Kiit1.html");
	              BufferedWriter out1 = new BufferedWriter(fstream1);
	              out1.write(sb1.toString());
	              out1.close();
	    		

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
	
	private static void cuchd_blackboard() {
		 HttpClient client = HttpClients.createDefault();
	        
	        HttpGet httpget = new HttpGet("https://cuchd.blackboard.com/");
	                    
	        HttpPost post = new HttpPost("https://cuchd.blackboard.com/webapps/login/");
	        try {
	        	//Printing the method used
	      		System.out.println("Request Type: "+httpget.getMethod());
	      		
	      		//Executing the Get request
	      		HttpResponse httpresponse = client.execute(httpget);
	      		
	      		System.out.println("get method");
	      		 // Get HttpResponse Status
	              System.out.println(httpresponse.getProtocolVersion());              // HTTP/1.1
	              System.out.println(httpresponse.getStatusLine().getStatusCode());   // 200
	              System.out.println(httpresponse.getStatusLine().getReasonPhrase()); // OK
	              System.out.println(httpresponse.getStatusLine().toString());     
	              
	              HttpEntity entity = httpresponse.getEntity();
	              if (entity != null) {
	                  // return it as a String
	                  String result = EntityUtils.toString(entity);
	                  System.out.println(result);
	              }
	        	
	            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
	            nameValuePairs.add(new BasicNameValuePair("user_id","20MBA7079"));
	            nameValuePairs.add(new BasicNameValuePair("password","999999"));
	            post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
	            // send a JSON data post.setEntity(new StringEntity(entity.toString()));
	            
	            HttpResponse response = client.execute(post);
	            
	            System.out.println("post method");
	    		//Printing the status line
	    		System.out.println(httpresponse.getProtocolVersion());              // HTTP/1.1
	            System.out.println(httpresponse.getStatusLine().getStatusCode());   // 200
	            System.out.println(httpresponse.getStatusLine().getReasonPhrase()); // OK
	            System.out.println(httpresponse.getStatusLine().toString());        // HTTP/1.1 200 OK

	           /* BufferedReader rd = new BufferedReader(new InputStreamReader(
	                    response.getEntity().getContent()));
	            String line = "";
	            while ((line = rd.readLine()) != null) {
	                System.out.println(line);
	            }*/
	            Scanner sc = new Scanner(response.getEntity().getContent());
	    		while(sc.hasNext()) {
	    			System.out.println(sc.nextLine());
	    		}
	    		
	    		 HttpGet httpgetlogout = new HttpGet("https://cuchd.blackboard.com/webapps/login/?action=logout");
	    		 HttpResponse httpresponse1 = client.execute(httpgetlogout);
	    		 System.out.println(httpresponse1.getProtocolVersion());              // HTTP/1.1
	              System.out.println(httpresponse1.getStatusLine().getStatusCode());   // 200
	              System.out.println(httpresponse1.getStatusLine().getReasonPhrase()); // OK
	              System.out.println(httpresponse1.getStatusLine().toString());     
	              BufferedReader rd = new BufferedReader(new InputStreamReader(
		                    httpresponse1.getEntity().getContent()));
		            String line = "";
		            while ((line = rd.readLine()) != null) {
		                System.out.println(line);
		            }
	        
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
	}
	
	private static void github_her() {
		// TODO Auto-generated method stub
		 HttpClient client = HttpClients.createDefault();
	        
	        HttpGet httpget = new HttpGet("https://github.com/login");
	                    
	        HttpPost post = new HttpPost("https://github.com/session");
	        try {
	        	//Printing the method used
	      		System.out.println("Request Type: "+httpget.getMethod());
	      		
	      		//Executing the Get request
	      		HttpResponse httpresponse = client.execute(httpget);
	      		
	      		System.out.println("get method");
	      		 // Get HttpResponse Status
	              System.out.println(httpresponse.getProtocolVersion());              // HTTP/1.1
	              System.out.println(httpresponse.getStatusLine().getStatusCode());   // 200
	              System.out.println(httpresponse.getStatusLine().getReasonPhrase()); // OK
	              System.out.println(httpresponse.getStatusLine().toString());     
	              
	              HttpEntity entity = httpresponse.getEntity();
	              if (entity != null) {
	                  // return it as a String
	                  String result = EntityUtils.toString(entity);
	                  System.out.println(result);
	              }
	        	
	            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
	            nameValuePairs.add(new BasicNameValuePair("login","esarmonika@gmail.com"));
	            nameValuePairs.add(new BasicNameValuePair("password","111111"));
	            post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
	            // send a JSON data post.setEntity(new StringEntity(entity.toString()));
	            
	            HttpResponse response = client.execute(post);
	            
	            System.out.println("post method");
	    		//Printing the status line
	    		System.out.println(httpresponse.getProtocolVersion());              // HTTP/1.1
	            System.out.println(httpresponse.getStatusLine().getStatusCode());   // 200
	            System.out.println(httpresponse.getStatusLine().getReasonPhrase()); // OK
	            System.out.println(httpresponse.getStatusLine().toString());        // HTTP/1.1 200 OK

	           /* BufferedReader rd = new BufferedReader(new InputStreamReader(
	                    response.getEntity().getContent()));
	            String line = "";
	            while ((line = rd.readLine()) != null) {
	                System.out.println(line);
	            }*/
	            Scanner sc = new Scanner(response.getEntity().getContent());
	    		while(sc.hasNext()) {
	    			System.out.println(sc.nextLine());
	    		}
	    		HttpGet httpget1 = new HttpGet("https://github.com/sessions/verified-device");
                
		        HttpPost post1 = new HttpPost("https://github.com/sessions/verified-device");
		        
		        	//Printing the method used
		      		System.out.println("Request Type: "+httpget1.getMethod());
		      		
		      		//Executing the Get request
		      		HttpResponse httpresponse1 = client.execute(httpget1);
		      		
		      		   
		              
		              HttpEntity entity1 = httpresponse1.getEntity();
		              if (entity1 != null) {
		                  // return it as a String
		                  String result = EntityUtils.toString(entity1);
		                  System.out.println(result);
		              }
		        	
		            List<NameValuePair> nameValuePairs1 = new ArrayList<NameValuePair>();
		            nameValuePairs1.add(new BasicNameValuePair("otp","502494"));
		            
		            post.setEntity(new UrlEncodedFormEntity(nameValuePairs1));
		            // send a JSON data post.setEntity(new StringEntity(entity.toString()));
		            
		            HttpResponse response1 = client.execute(post1);
		            
		            

		           /* BufferedReader rd = new BufferedReader(new InputStreamReader(
		                    response.getEntity().getContent()));
		            String line = "";
		            while ((line = rd.readLine()) != null) {
		                System.out.println(line);
		            }*/
		            Scanner sc1 = new Scanner(response1.getEntity().getContent());
		    		while(sc1.hasNext()) {
		    			System.out.println(sc1.nextLine());
		    		}
	    		
	    		
	    		

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
	}


}
