public class MAStudent extends Student {
    public MAStudent(String name,String dep)
    {
        super(name,dep);
    }
    public String toString()
    {
        return "MAStudent," + super.toString();
    }
    public String getThesis() //only for students in MAStudent
    {
        return "the theme of your thesis";
    }
}
