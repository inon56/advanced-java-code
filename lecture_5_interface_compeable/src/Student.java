public class Student extends Univesity implements Comparable {
    private String name;
    protected String dep;
    private double average;
    public Student()
    {
        this.name = "ben";
        this.dep = "reach";
    }

    public Student(String name,String dep)
    {
        this.name = name;
        this.dep = dep;
    }
    public String toString()
    {
        return ("name: "+name+" department "+dep);
    }
    public int compareTo(Object c)
    {
        Student s = (Student)c;
        if(average == s.average)
            return 0;
        else if(average > s.average)
            return 1;
        return -1;
    }
}
