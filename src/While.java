/**
 * Created by thomasgross on 2/1/17.
 */
public class While extends Statement
{
    private IStatement m_ex1;

    private IStatement m_st1;

    public While(IStatement ex, IStatement st)
    {
        super("while");
        this.m_ex1 = ex;
        this.m_st1 = st;
    }

    public void prettyPrint(int x)
    {
        int i;
        for (i = 0; i < x; i++)
        {
            System.out.print("  ");
        }
        System.out.print(this.getName() + " ");
        this.m_ex1.prettyPrint(0);
        System.out.println(" do");
        this.m_st1.prettyPrint(i + 1);
    }
}
