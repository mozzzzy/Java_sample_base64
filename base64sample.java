import java.util.Base64;	//java8から導入

public class base64sample{

	public static void main(String args[]){

		String original = "helloWorld";
		System.out.println("Origin : \""+original+"\"");

		String encodeString = Base64.getEncoder().encodeToString(original.getBytes());
		System.out.println("Encode : \""+encodeString+"\"");

		String decodeString = new String(Base64.getDecoder().decode(encodeString));
		System.out.println("Decode : \""+decodeString+"\"");

	}
}
