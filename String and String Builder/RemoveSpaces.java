public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "How are you doing";

        System.out.println("Original String: " + str);

        str = removeSpaces(str);

        System.out.println("String without space: " + str);

    }

    public static String removeSpaces(String str) {
        String newStr = "";
        for (String word : str.split(" ")) {
            newStr += word;
        }
        return newStr;
    }
}