package sec4;

public class Quiz6 {
	public static void main(String[] args) {
		int[] score={90,80,70,85,75,95,80,75};
		int[] rank={1,1,1,1,1,1,1,1,};
		for(int i=0;i<score.length;i++){
			for(int j=0;j<score.length;j++){
				if(score[i]<score[j]) rank[i]++;
			}
			System.out.printf("점수 : %d, 석차 : %d\n", score[i], rank[i]);
		}
	}

}
