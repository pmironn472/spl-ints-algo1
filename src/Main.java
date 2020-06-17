import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {


        ArrayList<Double> temps = new ArrayList<>();
        String[] weekDays = {"Mo", "Tu", "We", "Th", "Fr", "Sa", "Su"};
        int j = 0;
        while (j < weekDays.length) {
            System.out.printf("%9s", weekDays[j]);
            j++;
        }

        int i = 0;
        while (i < 31) {

            temps.add(ThreadLocalRandom.current().nextDouble(-25, 25));
            if (i % 7 == 0) {
                System.out.println();
            }
            System.out.printf("%9.1f", temps.get(i));
            i++;
        }


        double max=0.0,min=0.0,avg=0.0;
        for( Double t: temps ) { ;
            if(t > max){
                max =t ;
            }else if( t< min ){
                min=t;
            }
            avg= (avg + t)/31;
       }
        System.out.println();
        System.out.printf(" The max temperture is -->  " + "%2.1f\n" , max);
        System.out.printf(" The min temperture is -->  " + "%2.1f\n" , min);
        System.out.printf(" The avg temperture is -->  " + "%2.1f\n" , avg);




    }
}
