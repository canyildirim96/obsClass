public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalGrade;
    double performance1;

    double performance2;
    double performance3;

    double note1;
    double note2;
    double note3;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalGrade = 0;
        this.performance1 = 0.20;
        this.performance2 = 0.10;
        this.performance3 = 0.30;
        this.note1 = 0.80;
        this.note2 = 0.90;
        this.note3 = 0.70;

    }
    void addTeacher(Teacher t){
        if (this.prefix.equals(t.branch)){
            this.teacher = t;
        }else {
            System.out.println("Bu Öğretmen Bu Dersi Veremez.");
        }
    }
    void printInfo(){
        if(teacher != null){
            System.out.println(this.name + " dersinin Akademisyeni: " + teacher.name);
            System.out.println("Ders Kodu:  " + teacher.branch);
            System.out.println("Telefon Numarası: " + teacher.pho);
        }else {
            System.out.println(this.name + " dersine Akademisyen Atanamamıştır.");
        }
    }

}
