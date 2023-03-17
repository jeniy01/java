package sec4;
//선택정렬(selection sort)
public class Quiz5 {
	public static void main(String[] args) {
		//int[] arr={70,50,90,80,40,60}을 오름차순으로 정렬하여 출력
		int[] arr={70,50,90,80,40,60};
		int n=arr.length; int tmp;
		System.out.print("정렬 전 : ");
		for(int i=0;i<n;i++){
			System.out.printf("%d\t", arr[i]);
		}
		System.out.println();
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]>arr[j]){
				tmp=arr[i]; arr[i]=arr[j]; arr[j]=tmp;
				}
			}
		}
		System.out.print("정렬 후 : ");
		for(int i=0;i<n;i++){
			System.out.printf("%d\t", arr[i]);
		}
	}
}