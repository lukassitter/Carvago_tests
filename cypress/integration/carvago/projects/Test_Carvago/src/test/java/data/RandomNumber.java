package data;

public class RandomNumber {

    // function to generate a random string of length n
    public static String getAlphaNumber(int n)
    {

        // chose a Character random from this String
        String AlphaNumber = "0123456789";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int)(AlphaNumber.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumber
                    .charAt(index));
        }

        return sb.toString();
    }
}
