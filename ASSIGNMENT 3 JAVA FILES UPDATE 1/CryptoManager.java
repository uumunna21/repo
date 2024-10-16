package package1;

public class CryptoManager {

    private static final char LOWER_RANGE = ' ';
    private static final char UPPER_RANGE = '_';
    private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

    /**
     * This method determines if a string is within the allowable bounds of ASCII codes 
     * according to the LOWER_RANGE and UPPER_RANGE characters
     * @param plainText a string to be encrypted, if it is within the allowable bounds
     * @return true if all characters are within the allowable bounds, false if any character is outside
     */
    public static boolean isStringInBounds(String plainText) {
        for (int i = 0; i < plainText.length(); i++) {
            if (plainText.charAt(i) < LOWER_RANGE || plainText.charAt(i) > UPPER_RANGE) {
                return false;
            }
        }
        return true;
    }

    /**
     * Encrypts a string according to the Caesar Cipher. The integer key specifies an offset
     * and each character in plainText is replaced by the character "offset" away from it 
     * @param plainText an uppercase string to be encrypted.
     * @param key an integer that specifies the offset of each character
     * @return the encrypted string or error message if the string is out of bounds
     */
    public static String caesarEncryption(String plainText, int key) {
        if (!isStringInBounds(plainText)) {
            return "The selected string is not in bounds, Try again.";
        }
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            char encryptedChar = (char) ((plainText.charAt(i) + key - LOWER_RANGE) % RANGE + LOWER_RANGE);
            encryptedText.append(encryptedChar);
        }
        return encryptedText.toString();
    }

    /**
     * Encrypts a string according to the Bellaso Cipher. Each character in plainText is offset 
     * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
     * to correspond to the length of plainText
     * @param plainText an uppercase string to be encrypted.
     * @param bellasoStr an uppercase string that specifies the offsets, character by character.
     * @return the encrypted string
     */
    public static String bellasoEncryption(String plainText, String bellasoStr) {
        if (!isStringInBounds(plainText)) {
            return "The selected string is not in bounds, Try again.";
        }
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            int key = bellasoStr.charAt(i % bellasoStr.length());
            char encryptedChar = (char) ((plainText.charAt(i) + key - LOWER_RANGE) % RANGE + LOWER_RANGE);
            encryptedText.append(encryptedChar);
        }
        return encryptedText.toString();
    }

    /**
     * Decrypts a string according to the Caesar Cipher. The integer key specifies an offset
     * and each character in encryptedText is replaced by the character "offset" characters before it.
     * This is the inverse of the caesarEncryption method.
     * @param encryptedText an encrypted string to be decrypted.
     * @param key an integer that specifies the offset of each character
     * @return the plain text string
     */
    public static String caesarDecryption(String encryptedText, int key) {
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < encryptedText.length(); i++) {
            char decryptedChar = (char) ((encryptedText.charAt(i) - key - LOWER_RANGE + RANGE) % RANGE + LOWER_RANGE);
            decryptedText.append(decryptedChar);
        }
        return decryptedText.toString();
    }

    /**
     * Decrypts a string according the Bellaso Cipher. Each character in encryptedText is replaced by
     * the character corresponding to the character in bellasoStr, which is repeated
     * to correspond to the length of plainText. This is the inverse of the bellasoEncryption method.
     * @param encryptedText an uppercase string to be decrypted.
     * @param bellasoStr an uppercase string that specifies the offsets, character by character.
     * @return the decrypted string
     */
    public static String bellasoDecryption(String encryptedText, String bellasoStr) {
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < encryptedText.length(); i++) {
            int key = bellasoStr.charAt(i % bellasoStr.length());
            char decryptedChar = (char) ((encryptedText.charAt(i) - key - LOWER_RANGE + RANGE) % RANGE + LOWER_RANGE);
            decryptedText.append(decryptedChar);
        }
        return decryptedText.toString();
    }

    public static void main(String[] args) {
        // Test cases to demonstrate the functionality

        String plainText = "MERRY CHRISTMAS";
        int caesarKey = 5;
        String bellasoStr = "HELLO";

        String caesarEncrypted = caesarEncryption(plainText, caesarKey);
        System.out.println("Caesar Encrypted: " + caesarEncrypted);
        System.out.println("Caesar Decrypted: " + caesarDecryption(caesarEncrypted, caesarKey));

        String bellasoEncrypted = bellasoEncryption(plainText, bellasoStr);
        System.out.println("Bellaso Encrypted: " + bellasoEncrypted);
        System.out.println("Bellaso Decrypted: " + bellasoDecryption(bellasoEncrypted, bellasoStr));
    }
}
