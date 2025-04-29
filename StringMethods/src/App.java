import com.humanbooster.string.TextProcessor;

public class App {
    public static void main(String[] args) throws Exception {
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
}
