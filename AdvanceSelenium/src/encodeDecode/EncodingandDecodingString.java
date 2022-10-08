package encodeDecode;

import org.apache.commons.codec.binary.Base64;

public class EncodingandDecodingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Pratishkumar@77";
		
	byte[] encodeString=Base64.encodeBase64(str.getBytes());
	
	System.out.println( "encoded string:"+new String(encodeString));
	
	byte[] decodeString=Base64.decodeBase64(encodeString);
	
	System.out.println( "decoded string:"+new String(decodeString));
	
	
	
	 }

}
