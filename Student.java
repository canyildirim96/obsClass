public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;

    double avarage;
    boolean isPass;
    double result;
    double result2;
    double result3;

    Student(String name, String stuNo, String classes,Course c1,Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.result = 0;
        this.result2 = 0;
        this.result3 = 0;
        this.avarage = 0.0;
        this.isPass = false;
    }
    void addBulkExamNote(int c1, int c2, int c3){
        if (this.c1.note >= 0 && this.c1.note <=100){
            this.c1.note = c1;
        }
        if (this.c2.note >= 0 && this.c2.note <=100){
        this.c2.note = c2;
        }if (this.c3.note >= 0 && this.c3.note <=100) {
            this.c3.note = c3;
        }
    }
    void performanceNote(int c1, int c2, int c3){
        if (this.c1.verbalGrade >= 0 && this.c1.verbalGrade<=100){
            this.c1.verbalGrade = c1;
        }
        if (this.c2.verbalGrade >= 0 && this.c2.verbalGrade<=100){
            this.c2.verbalGrade = c2;
        }
        if (this.c3.verbalGrade >= 0 && this.c3.verbalGrade<=100){
            this.c3.verbalGrade = c3;
        }

    }

    void calcAvarage(){
        this.result = (this.c1.verbalGrade * c1.performance1) + (this.c1.note * c1.note1);
        this.result2 = (this.c2.verbalGrade * c2.performance2) + (this.c2.note * c2.note2);
        this.result3 = (this.c3.verbalGrade * c3.performance3) + (this.c3.note * c3.note3);
        this.avarage = (result + result2  + result3)/ 3.0;
        if(this.avarage >55){
            System.out.println("Tebrikler, Dönemi Başarıyla Tamamladınız!!");
            this.isPass = true;
        }else {
            System.out.println("Daha Sıkı Çalış!!");
            this.isPass = false;
        }
        printNote();
    }
    void printNote(){
        System.out.println("=============================");
        System.out.println("Adı: " + this.name);
        System.out.println("Öğrenci Numarası: " + this.stuNo);
        System.out.println("Sınıfı: " + this.classes);
        System.out.println(this.c1.name + " Notu: " + this.c1.note);
        System.out.println(this.c2.name + " Notu: " + this.c2.note);
        System.out.println(this.c3.name + " Notu: " + this.c3.note);
        System.out.println();
        System.out.println(this.c1.name + " Sözlü Notu: " + this.c1.verbalGrade);
        System.out.println(this.c2.name + " Sözlü Notu: " + this.c2.verbalGrade);
        System.out.println(this.c3.name + " Sözlü Notu: " + this.c3.verbalGrade);
        System.out.println();
        System.out.println("Ortalamanız: " + this.avarage);
        System.out.println("===============================");
    }

}
