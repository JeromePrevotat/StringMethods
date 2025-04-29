import com.humanbooster.string.TextFormatter;
import com.humanbooster.string.TextProcessor;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // testCountWords();
        // testAlignLeft();
        testCreateTable();

        
    }

    public static void testCountWords(){
        // Values to be tested
        String[] tests = {
            null, "", 
            " ", "\t", "\n", "\r",
            "   ", " \t\r\n ", " \t \r\n ",
            "s", "word", "hello world", "lorem ipsum je connais pas la suite",
            " s ", " word ", " hello world ", " lorem ipsum je connais pas la suite ",
            "\r\n\t s \r\n\t", "\tword\n", "\rhello world\r", " \nlorem ipsum je connais pas la suite\t",
            "lorem\nipsum\rje\tconnais   pas \n la \r suite \t !"
        };
        // Values Expected
        int[] assertValuesCountWords = {
            0, 0,
            0, 0, 0, 0,
            0, 0, 0,
            1, 1, 2, 7,
            1, 1, 2, 7,
            1, 1, 2, 7,
            8
        };

        int size = 0;
        while (size < assertValuesCountWords.length){
            System.out.print((TextProcessor.countWords(tests[size]) == assertValuesCountWords[size] ? "." : "F"));
            System.out.println(TextProcessor.countWords(tests[size]));
            size++;
        }
    }

    public static void testAlignLeft(){
        String[] expectedValues = {
            "lorem\nipsum\rje\tconnais   pas \nla \r suite \t !",
            "lorem\nipsum\rje\tconnais   pas \nla \r suite \t !",
            "lorem\n    ipsum\rje\tconnais   pas \n    la \r suite \t !"
        };

        String[] testValues = {
            TextFormatter.alignLeft("lorem\nipsum\rje\tconnais   pas \n la \r suite \t !", -1),
            TextFormatter.alignLeft("lorem\nipsum\rje\tconnais   pas \n la \r suite \t !", 0),
            TextFormatter.alignLeft("lorem\nipsum\rje\tconnais   pas \n la \r suite \t !", -4)
        };

        int i = 0;
        while (i < expectedValues.length){
            System.out.println(expectedValues[i].equals(testValues[i]) ? "." : "F");
            System.out.println(expectedValues[i]);
            System.out.println(testValues[i]);
            i++;
        }
    }

    public static void testCreateTable(){
        List <String[]> test1 = new ArrayList<>();
        List <String[]> testResults;
        String[] t11 = {"l\no\nr\ne\nm"};
        test1.add(t11);
        String[] t52 = {"lorem\n ipsu"};
        test1.add(t52);

        int[] cWidth = new int[]{1, 5};

        String[] expectedValues = {
            "l\no\nr\ne\nm",
            "lorem\n ipsu"
        };

        testResults = TextFormatter.createTable(test1, cWidth);

        for (String[] tableTestResults : testResults){
            int t = 0;
            for (String stringTestResults : tableTestResults){
                System.out.println("T: " + t);
                System.out.println((stringTestResults.equals(expectedValues[t])) ? "." : "F");
                t++;
            }
        }
    }
}
