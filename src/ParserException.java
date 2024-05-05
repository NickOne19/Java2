/**
 * The type Parser exception.
 */
public class ParserException extends Exception
{
    private static final long serialVersionUID = 1L;
    private String errorString;

    /**
     * Instantiates a new Parser exception.
     *
     * @param errorString the error string
     */
    public ParserException(String errorString)
    {
        super();
        this.errorString = errorString;
    }

    public String toString()
    {
        return errorString;
    }
}