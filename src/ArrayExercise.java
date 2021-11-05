
public class ArrayExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] salary = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
		double sum=0;
		for(int i=0;i<salary.length;i++) {
			sum=sum+salary[i];
		}
		double avg= sum/salary.length;
		System.out.println("Average salary of Employee is "+avg);
		int aboveavg=0;
		int belowavg=0;
		for(int i=0;i<salary.length;i++) {
			if (salary[i]>avg) {
				aboveavg+=1;
			}
			else {belowavg+=1;}
		}
		System.out.println("The number of employee having salary greater than average is "+aboveavg);
		System.out.println("The number of employee having salary lesser than average is "+belowavg);
	}
}
