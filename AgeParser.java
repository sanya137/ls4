public class AgeParser {

    public static void main(String[] args) {

        String ageString = "2";
        int age = Integer.parseInt(ageString,10);
        if (age>0&&age<120){
            System.out.println("Age= " + age);
        }else {
            System.out.println("IllegalArgumentException");
        }
    }
}
