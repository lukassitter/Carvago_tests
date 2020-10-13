package data;

public class RandomString {

    public static String LETTERS = "ABCDEFGHIJKLMNOPRSTUVWXYZ";
    public static String NUMBERS = "0123456789";
    public static String LETTERS_AND_NUMBERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            + "0123456789"
            + "abcdefghijklmnopqrstuvxyz";

    public static String getStringByFormat(int length, String format){
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = (int) (format.length() * Math.random());
            sb.append(format.charAt(index));
        }

        return sb.toString();
    }
}
