/**
 * Created by thomasgross on 2/1/17.
 */
public class Compound extends Statement
{
    private IStatement m_st1;

    private IStatement m_st2;

    public Compound(IStatement st1, IStatement st2)
    {
        super("Compound");
        this.m_st1 = st1;
        this.m_st2 = st2;
    }

    public void prettyPrint(int x)
    {
        int i;
        for (i = 0; i < x; i++)
        {
            System.out.print("  ");
        }

        System.out.println("begin");
        this.m_st1.prettyPrint(i + 1);
        this.m_st2.prettyPrint(i + 1);

        for (i = 0; i < x; i++)
        {
            System.out.print("  ");
        }
        System.out.println("end");
    }
}
