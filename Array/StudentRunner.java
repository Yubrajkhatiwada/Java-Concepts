import java.math.BigDecimal;

class Student{
    private String name;
    int[] marks;

    public Student(String name, int[] marks){
        this.name=name;
        this.marks=marks;
    }

    public int getNumberOfMarks(){
        return marks.length;
    }

    public int getTotalSumOfMarks(){
        int sum=0;
        for(int mark:marks){
            sum += mark;
        }
        return sum;
    }

    public int getMaximumMark(){
        int max = Integer.MIN_VALUE;
        for(int mark:marks){
            if(mark>max){
                max=mark;
            }
        }
        return max;
    }

    public int getMinimumMark() {	
        int min = Integer.MAX_VALUE;
        for(int mark:marks) {
            if(mark < min) {
                min = mark;
            }
        }
        return min;
    }

}

public class StudentRunner{
    public static void main(String[] args) {
        int[] marks = {90, 85, 80};
        Student student = new Student("Yubraj", marks);

        int number = student.getNumberOfMarks();
        System.out.println("Number of marks:" + number);

        int sum = student.getTotalSumOfMarks();
	    System.out.println("Sum of marks : " + sum);

        int maximumMark = student.getMaximumMark();
		System.out.println("Maximum of marks : " + maximumMark);

        int minimumMark = student.getMinimumMark();
		System.out.println("Minimum of marks : " + minimumMark);
    }
}