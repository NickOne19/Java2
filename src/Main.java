import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * The type Main.
 */
public class Main
{
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args)
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ExpressionParser parser = new ExpressionParser();

        for (;;)
        {
            try
            {
                System.out.print("Введите выражение: ");
                String expression = reader.readLine();
                if (expression.equals(""))
                {
                    break;
                }
                double result = parser.calculate(expression);

                DecimalFormatSymbols symbols = new DecimalFormatSymbols();
                symbols.setDecimalSeparator('.');
                DecimalFormat f = new DecimalFormat("#,###.00", symbols);
                System.out.printf("%s = %s%n", expression, f.format(result));
            }
            catch (ParserException error)
            {
                System.out.println(error);
            }
            catch (Exception error)
            {
                System.out.println(error);
            }
        }
    }
}