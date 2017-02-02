/**
 * Created by thomasgross on 2/1/17.
 */
public class Client
{
    public static void main(String[] nothing)
    {
        System.out.println("Test Factorial: ");
        System.out.println("");
        Statement factorial = new Compound(new Assignment("fact", new Expression()), new While(new Expression(),
                new Compound(new Assignment("fact", new Expression()), new Assignment("n", new Expression()))));
        factorial.prettyPrint(0);

        System.out.println("Test Conditional: ");
        System.out.println("");

        Statement greater = new Conditional(new Expression(), new Assignment("fact", new Expression()), new Assignment(
                "n", new Expression()));
        greater.prettyPrint(0);

    }
}
