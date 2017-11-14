public class ToyNameToIdConverter {

    public static void main(String[] args) {

        String name = "Doll";
        int id;

        switch (name){
            case "Car":
                id = 0;
                System.out.println(id);
                break;
            case "Lego":
                id = 1;
                System.out.println(id);
                break;
            case "Doll":
                id = 2;
                System.out.println(id);
                break;
            case "Puzzle":
                id = 3;
                System.out.println(id);
                break;

            default:
                name = "IllegalArgumentException";
                System.out.println(name);

        }
    }
}
