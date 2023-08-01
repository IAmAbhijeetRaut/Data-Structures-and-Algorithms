package string.problem_1;

/**
 * Created By Abhijeet Raut on || Date : 11-03-2023 ||  Time : 11:32 am.
 */
public class StringProblem_1 {
    public static void main(String[] args) {
        //Find all the occurences of a word or occurence upto a certain limit
        String str = "This is an example string. Another example of the word example.";
        int count = 0;
        int index = -1;
        while ((index = str.indexOf("example", index + 1)) != -1 && count < 4)
        {
            System.out.println("Occurrence " + (count + 1) + " found at index: " + index);
            count++;
        }

    }

}
