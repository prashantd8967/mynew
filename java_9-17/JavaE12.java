sealed class Person permits Doctor,Teacher{
    void show() {
        System.out.println("Person Sealed of A class.");
    }
}

final class Doctor extends Person{}
sealed class Teacher extends Person permits MathsTeacher{}

non-sealed class MathsTeacher extends Teacher{
    void show() {
        System.out.println("Maths Teachers are Awesome.");
    }
}
public class JavaE12 {

    public static void main(String[] args) {
        MathsTeacher mathsTeacher=new MathsTeacher();
        mathsTeacher.show();
        
    }

}

