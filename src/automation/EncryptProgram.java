package automation;

import java.util.Base64;
public class EncryptProgram { 
	
	public static void main(String []args) {  
		// String to Encrypt 
		String str="aruna"; 
		// Convert the string to byte array because encode method which is shown /
		//below will accept only byte array
		 byte[] bytes=str.getBytes(); 
		// pass this converted byte array to the encode method 
		// The return type of encode method is byte array
		 byte[]encodedBytes= Base64.getEncoder().encode(bytes); 
		// convert this byte array to the string to get the encoded string
		String encodedString=new String(encodedBytes); 
		System.out.println(encodedString); 
		
	}
}
