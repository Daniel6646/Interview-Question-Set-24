package javatpoint_string_programs;

public class LargestAndSmallestWordInString {

    public static void main(String[] args) {

        String str = "Hardships often prepare ordinary people for an extraordinary destiny";

        String[] words = str.split(" ");

        String smallest = words[0];
        String largest = words[0];

        for (int i = 1; i < words.length; i++) {

            if (words[i].length() < smallest.length()) {
                smallest = words[i];
            }

            if (words[i].length() > largest.length()) {
                largest = words[i];
            }
        }

        System.out.println("Smallest word: " + smallest);
        System.out.println("Largest word: " + largest);
    }
}
