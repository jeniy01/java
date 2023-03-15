package sec1;

public class Example3 {
	public static void main(String[] args) {
		int[]arr1; //아직 주소 배정 안된 상태
		int[]arr2;
		int[]arr3;
		//데이터 개수와 실체가 파악되어 실제 주소 배정이 이루어짐 이때 배정된 주소를 포인터라 함
		arr1=new int[]{1,90,70,80};
		arr2=new int[]{1,90,70,80};
		arr3=arr2; //얕은 복제 : 실제 데이터의 주소만 전달하므로 주소가 같다.
		System.out.println("arr1 : "+arr1);
		System.out.println("arr2 : "+arr2);
		System.out.println("arr3 : "+arr3);
		for(int data : arr1){
			System.out.print(data+"\t");
		}
		System.out.println();
		for(int data : arr2){
			System.out.print(data+"\t");
		}
		System.out.println();
		for(int data : arr3){
			System.out.print(data+"\t");
		}
		System.out.println();
		System.out.println("arr1==arr2 : "+(arr1==arr2));
		System.out.println("arr2==arr3 : "+(arr2==arr3));
		System.out.println();
		System.out.println("arr1!=arr2 : "+(arr1!=arr2));
		System.out.println("arr2!=arr3 : "+(arr2!=arr3));
		}

}
