/**
 * Created by thomasgross on 2/1/17.
 */
public class Conditional extends Statement
{
    private IStatement m_ex1;

    private IStatement m_st1;

    private IStatement m_st2;

    public Conditional(IStatement ex, IStatement st1, IStatement st2)
    {
        super("if");
        this.m_ex1 = ex;
        this.m_st1 = st1;
        this.m_st2 = st2;
    }

    public void prettyPrint(int x)
    {
        int i;
        for (i = 0; i < x; i++)
        {
            System.out.println("  ");
        }

        System.out.print(this.getName() + " ");
        this.m_ex1.prettyPrint(0);
        System.out.println(" ");
        this.m_st1.prettyPrint(i + 1);

        for (i = 0; i < x; i++)
        {
            System.out.println("  ");
        }
        System.out.println("else");
        this.m_st2.prettyPrint(i + 1);

        for (i = 0; i < x; i++)
        {
            System.out.println("  ");
        }
        System.out.println("end");
    }
}
