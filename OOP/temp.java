public class temp {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student(13, "Rakesh", 92.56f);
        student1.rno = 23;
        student1.name = "Mahesh";
        student1.percentage = 93.5f;
        System.out.println(student1.name);
        System.out.println(student2.name);
        A obj = new A("Rasdsd");
        System.out.println(obj.name);
    }
}
class A {
    int num = 12;
    String name;
    A(String name){
        this.name = name;
        this.num = 0;
    }
}
class Student{
        int rno = 12;
        String name = "Suresh";
        float percentage = 89f;
    Student()
    {
        this.rno = 0;
        this.name = "Null";
        this.percentage = 0.0f;
    }
    Student(int rno,String name,float percentage)
    {
        this.rno = rno;
        this.name = name;
        this.percentage = percentage;
    }
}

