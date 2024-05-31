public class Student {

   private String name;
   private String surname;
   private Field field;

    public Student(String name, String surname, Field field) {
        this.name = name;
        this.surname = surname;
        this.field = field;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }
}
