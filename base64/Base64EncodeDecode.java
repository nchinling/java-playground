import java.util.Base64;

public class Base64EncodeDecode {

    public static String encodeBase64(String input) {
        return Base64.getEncoder().encodeToString(input.getBytes());
      }
    
      public static String decodeBase64(String input) {
        return new String(Base64.getDecoder().decode(input.getBytes()));
      }
    
      public static void main(String[] args) {
        String stringToBeEncoded = "This is fun";
        String encodedString = encodeBase64(stringToBeEncoded);
        String decodedString = decodeBase64(encodedString);
        System.out.println("The encoded string is: " + encodedString);
        System.out.println("The decoded string is: " + decodedString);
      }
    
}
