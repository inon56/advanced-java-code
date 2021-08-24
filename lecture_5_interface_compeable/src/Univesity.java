public class Univesity {
    private Student[] students;
    private int num;
    private final int MAX_STUDENTS = 10000;

    public Univesity()
    {
        this.num = 0;
        students = new Student[5];
    }
    public String toString()
    {
        String res = "";
        for(int i=0;i<num;i++)
            res = res + students[i].toString() + "\n";
        return res;
    }
    // this func is an error
    public void addStudent(Student s)
    {
        students[num] = s; //up casting
        num++;
    }
    public int countBA()
    {
        int count = 0;
        for(int i=0;i<num;i++)
            if(students[i] instanceof BAStudent)
                count++;
        return count;
    }


    public void printAllThesis()
    {
        for(int i=0;i<num;i++)
            if(students[i] instanceof MAStudent)
            {
                MAStudent temp = (MAStudent)students[i]; // here we have down casting
                System.out.println(temp.getThesis());
            }

    }

}
