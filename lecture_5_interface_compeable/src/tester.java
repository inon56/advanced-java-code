public class tester {
    public static void main(String[] args)
    {
        Student s = new BAStudent("david","cs"); // here we have up casting
        System.out.println(s instanceof BAStudent); //true
        System.out.println(s instanceof MAStudent); //false
        System.out.println(s instanceof Student); //true
        System.out.println(s instanceof Object); //true
        Univesity u = new Univesity();
        BAStudent b = new BAStudent("joey","cs");
        u.addStudent(b);
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(max(s1,s2)); // up casting
        String x = "aaa",y = "bbb";
        System.out.println(max(x,y));
        // max(s1,x) - will get an run time error when we get into the func compareTo
        // in class Student, because of the casting -  (Student)c , but x not related to Student



    }
    // method return the max object
    public static Comparable max(Comparable a,Comparable b)
    {
        if(a.compareTo(b) > 0)
            return a;
        return b;
    }

}
