/**
 * Created by thomasgross on 2/1/17.
 */
public class Assignment extends Statement
{
    private IStatement m_ex;

    public Assignment(String name, IStatement ex)
    {
        super(name);
        this.m_ex = ex;
    }

    public void prettyPrint(int x)
    {
        for (int i = 0; i < x; i++)
        {
            System.out.print("  ");
        }
        System.out.print(this.getName() + " := ");
        this.m_ex.prettyPrint(0);
        System.out.println(";");
    }
}
