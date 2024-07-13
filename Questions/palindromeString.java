package Questions;

public class palindromeString {
    public static void main(String[] args) {
        String str = "WoW";
        String tmpStr = str.toLowerCase();
        String revStr = "";
        for (int i = 0; i < str.length(); i++) {
            revStr = tmpStr.charAt(i) + revStr;
        }
        // tmpStr and revStr are two different string objects, even though they might
        // have the same content. When you use == to compare them, it checks if they are
        // the same object in memory, which they are not.

        if (revStr.equals(tmpStr)) {
            System.out.println(str + " is a Palindrome String.");
        } else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }
}
