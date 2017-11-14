public class IdToToyNameConverter {

    public static void main(String[] args) {

        int id = 2;
        String getToyName;
        if (id==0) {
            getToyName = "Car";;
        }else if(id==1){
            getToyName = "Lego";
        }else if (id==2){
            getToyName = "Doll";
        }else if (id==3){
            getToyName = "Puzzle";
        }else {
            getToyName = "IllegalArgumentException";
        }
        System.out.println(getToyName);
    }
}
