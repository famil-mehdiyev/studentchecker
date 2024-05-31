import java.util.Scanner;

public class Course {
    String name;
    static Student[] students = new Student[5];

    public static void addStudent(Student student) {
        System.out.println("Telebenin adini daxil edin");
        student.setName(new Scanner(System.in).nextLine());
        System.out.println("Telebenin soyadini daxil edin");
        student.setSurname(new Scanner(System.in).nextLine());
        int operation;
        while (true) {
            System.out.println("Fieldi daxil edin");
             operation = new Scanner(System.in).nextInt();
            if (operation == 1) {
                student.setField(Field.Proqramlasdirma);
                break;
            } else if (operation == 2) {
                student.setField(Field.Design);
                break;
            } else if (operation == 3) {
                student.setField(Field.Smm);
                break;
            } else {
                System.out.println("sehv secimdir  yeniden daxil edin :");
            }
        }
        var arr = Field.values();

        boolean check = false;
        for (int i = 0; i < arr.length ; i++) {

            if (students[i] != null && arr[i].ordinal() == operation) {
                students[i] = student;
                check = true;
                break;
            }

        }

        if (check == false) {
            Student[] newStudents = new Student[students.length * 2];
            for (int i = 0; i < students.length; i++) {
                newStudents[i] = students[i];
            }
            newStudents[students.length] = student;
            students = newStudents;
        }

        for (var fields : students) {
            if(fields!=null)
            System.out.println(fields.getName()+ " " + fields.getSurname() + " : " + fields.getField());
        }
    }

}
