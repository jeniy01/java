package sec1;

public class Example2 {
	public static void main(String[] args) {
		//배열선언
		int[] i_arr;
		int i_arr2[];
		float[] f_arr;
		float f_arr2[];
		
		int[] io_arr=new int[8];
		String st_arr[]=new String[5];
		System.out.println("io_arr="+io_arr);
		System.out.println("st_arr="+st_arr);
		
		int[] arr={1,80,90,70}; //몇개의 원소가 특정되므로 주소 배정이 되고, 초기화가 됨
		int arr2[]={2,90,100,80};
		System.out.println("arr주소 : "+arr);
		System.out.println("arr2주소 : "+arr2);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		for(int data : arr2){ //추가 향상된 for문
			System.out.print(data+"\t");
		}
	}

}
