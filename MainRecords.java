public class MainRecords {

    record Student(int sid, String name, String course) {} 
    public static void main(String[] args) {
        Student s1 = new Student(1, "Archit", "Java");
        System.out.println(s1);
        System.out.println(s1.name());
        System.out.println(s1.sid());
        System.out.println(s1.course());
        System.out.println(s1);

    }

}
