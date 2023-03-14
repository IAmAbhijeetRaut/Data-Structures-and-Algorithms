package string.problem_2;

/**
 * Created By Abhijeet Raut on || Date : 11-03-2023 ||  Time : 12:19 pm.
 */
public class StringProblem_2 {
    public static void main(String[] args) {

                //Just reverse the words at their own place and print the strings
                String inputString = "Welcome to the java World";
                String[] words = inputString.split(" ");

                StringBuilder reversedStringBuilder = new StringBuilder();
                for (int i = 0; i < words.length; i++) {
                    StringBuilder wordBuilder = new StringBuilder(words[i]);
                    wordBuilder.reverse();
                    reversedStringBuilder.append(wordBuilder).append(" ");
                }
                String reversedString = reversedStringBuilder.toString().trim();

                System.out.println("Input string: " + inputString);
                System.out.println("Reversed string: " + reversedString);


                //Just reverse the words with odd numbers of letters at their own place and print the strings
                String inputString_2 = "Welcome to the java World";
                String[] words_1 = inputString_2.split(" ");

                StringBuilder reversedStringBuilder_1 = new StringBuilder();
                for (int i = 0; i < words_1.length; i++) {
                    String currentWord = words_1[i];
                    StringBuilder currentWordBuilder = new StringBuilder(currentWord);
                    if (currentWordBuilder.length() % 2 != 0) {
                        currentWordBuilder.reverse();
                    }
                    reversedStringBuilder_1.append(currentWordBuilder).append(" ");
                }
                String reversedString_1 = reversedStringBuilder_1.toString().trim();

                System.out.println("Input string: " + inputString);
                System.out.println("Reversed string: " + reversedString_1);


                //Capitalize First Letter of Each Word in the String
                String inputString4 = "welcome to the java world";
                String[] words4 = inputString4.split(" ");
                StringBuilder resultBuilder = new StringBuilder();
                for (int i = 0; i < words4.length; i++) {
                    String word = words4[i];
                    String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
                    resultBuilder.append(capitalizedWord).append(" ");
                }
                String result = resultBuilder.toString().trim();
                System.out.println("Capitalized string: " + result);

                    }
}
