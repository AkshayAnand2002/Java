public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,34,56,67,89};
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<5;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
		//int a1=1;int a2=13;int a3=4;int a4=6;int a=89;
	}

}
