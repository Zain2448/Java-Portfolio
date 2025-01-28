import java.util.ArrayList;
import java.util.Arrays;

public class PunctuationMarks
{
    public static void main(String[] args)
    {

        String sentenceStr = "Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go.";
        ArrayList<String> sentenceArray = new ArrayList<>(Arrays.asList(sentenceStr.split("")));

        ArrayList<String> punctuationMarks = new ArrayList<>(Arrays.asList(".", ",","!","?"));
        ArrayList<Integer> markCount = new ArrayList<>();

        for (String mark : punctuationMarks)
        {
            int count = 0;
            for (String s : sentenceArray)
            {
                if (mark.equals(s))
                {
                    count++;
                }
            }
            markCount.add(count);
        }

        int i = 0;
        for (String mark : punctuationMarks)
        {
            System.out.println("The punctuation Mark " + mark +" appeared " + markCount.get(i));
            i++;
        }



    }
}
