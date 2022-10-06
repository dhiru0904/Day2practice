package operator;
import java.util.Scanner;
public class springseas {
        public static void main (String[] args){

            Scanner in = new Scanner(System.in);
            int month;
            int day;
            String season = null;

            System.out.print("Please enter month and day: ");
            month = in.nextInt();
            day = in.nextInt();

            if(1 <= month && month <=3){
                season = "Winter";
                System.out.println(season);
            }

            else if (4 <= month && month <=6){
                season = "Spring";
                System.out.println(season);
            }

            else if (7 <=month && month <=9){
                season = "Summer";
                System.out.println(season);
            }

            else if (10 <= month && month <= 12){
                season = "Fall";
                System.out.println(season);
            }


            if ( ((month % 3 == 0) && (21 <= day))){
                if (season.equals("Winter")){

                }

                else if (season.equals("Spring")){
                    season = ("Summer");
                }

                else if (season.equals("Summer")){
                    season = "Fall";
                }

                else {
                    season = "Winter";
                }


            }
        }
    }
