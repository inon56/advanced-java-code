public class BAStudent extends Student {
    public BAStudent(String name,String dep)
    {
        super(name,dep);
    }
    public String toString()
    {
        return "BAStudent," + super.toString();
    }
}
