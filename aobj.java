class Students
{
    String name;
    int rollno;
    int marks;
}
public class aobj
{
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "Keerthana";
        s1.rollno = 105;
        s1.marks = 98;
        Students s2 = new Students();
        s2.name = "Navin";
        s2.rollno = 103;
        s2.marks = 87;
        Students s3 = new Students();
        s3.name = "Krish";
        s3.rollno = 102;
        s3.marks = 64;
        Students students[] = new Students[3];
        students[0] = s1;
        students[1] = s2; 
        students[2] = s3; 
        for(Students s : students) 
        {
            System.out.println(s.name+" : "+s.rollno+" : "+s.marks);// also to format the text we can use the printf("%-12s %-10d %-5d\n")this makes the alingment
        }

    }
}