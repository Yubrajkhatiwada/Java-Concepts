
/* 1.Create a String array with the names of days of the week:
(Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday)
2. Find the day with the most number of letters in it. 
3. Print days of the week backwards */

public class WeekRunner {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String dayWithMostCharacters = "";

        for(String day: daysOfWeek){
            if(day.length()>dayWithMostCharacters.length()){
                dayWithMostCharacters=day;
            }
        }
        System.out.println("Day with most character: " + dayWithMostCharacters);

        for(int i = daysOfWeek.length-1;i>=0;i--){
            System.out.println(daysOfWeek[i]);
        }
    }
}
