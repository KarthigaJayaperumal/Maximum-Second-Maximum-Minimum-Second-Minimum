package april_program;



public class Practice {

	public static void main(String[] args) {
		//To find out Maximum and Second Maximum//
	int marks[]= {56,78,14,24,10};
	int max=Integer.MIN_VALUE;
	int smax=Integer.MIN_VALUE;
	for(int i=0;i<marks.length; i++) {
	if(marks[i]>max) {
		smax=max;
		max=marks[i];
	}
	else if(marks[i]>smax) {
		smax=marks[i];
	}
	}System.out.println("Maximum Number is "+max);
	System.out.println("Second Maximum Number is "+smax);
	
	//To find out Minimum and Second Minimum//
	int marks1[]= {56,78,14,24,10};	
int min=Integer.MAX_VALUE;
int smin=Integer.MAX_VALUE;
for(int i=0;i<marks1.length; i++) {
if(marks1[i]<min) {
	smin=min;
	min=marks1[i];
}
else if(marks1[i]<smin) {
	smin=marks1[i];
}
}System.out.println("Minimum Number is "+min);
System.out.println("Second Minimum Number is "+smin);
}}
	