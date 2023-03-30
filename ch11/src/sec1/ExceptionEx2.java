package sec1;
//ArrayIndexOutOfBoundsException : 
public class ExceptionEx2 {
	public static void main(String[] args) {
		int[] arr = new int[3];	//arr[0]~arr[2]까지만 해당되는데
		
			for(int i=0;i<=3;i++){
				try{
					arr[i] = i;	//arr[0]~arr[3]을 요구하므로 오류 발생
					System.out.println(arr[i]);
				} catch(ArrayIndexOutOfBoundsException e){
					break;
					//e.printStackTrace();
				}
		}
	}
}
