/**
 * Created by thomasgross on 2/1/17.
 */
public class Statement implements IStatement
{
    private String m_name;

    protected Statement(String name)
    {
        this.m_name = name;
    }

    final protected String getName()
    {
        return this.m_name;
    }

    public void prettyPrint(int x)
    {
        for (int i = 0; i < x; i++)
        {
            System.out.print("  ");
        }
        System.out.println(this.m_name);
    }
}
