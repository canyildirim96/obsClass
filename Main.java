public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Can", "MZK", "54121");
        Teacher t2 = new Teacher("Eren" , "AST", "52145");
        Teacher t3 = new Teacher("Kadir", "YAZ" , "52368");


        Course c1 = new Course("Müzik" , "101", "MZK");
        c1.addTeacher(t1);

        Course c2 = new Course("Astronomi ve Uzay Bilimleri", "101", "AST");
        c2.addTeacher(t2);


        Course c3 = new Course("Yazılım", "101", "YAZ");
        c3.addTeacher(t3);


        Student s1 = new Student("BerkeCan", "1245", "1", c1,c2,c3);
        s1.addBulkExamNote(34,100,74);
        s1.performanceNote(100,100,100);
        s1.calcAvarage();

        Student s2 = new Student("Derya Nazlı" , "4567", "2",c1,c2,c3);
        s2.addBulkExamNote(20,20,20);
        s2.performanceNote(50,50,50);
        s2.calcAvarage();

    }
}