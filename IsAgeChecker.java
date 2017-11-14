public class IsAgeChecker {

    public static void main(String[] args) {

        boolean isAge;
        int age = 20;
        if (age>0&&age<120){
            isAge = true;
        }else {
            isAge = false;
        }

        System.out.println(isAge);

    }
}
