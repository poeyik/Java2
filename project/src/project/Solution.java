package project;

public class Solution {
    public int[] answer;
    public int temp;
    public void find(int m, int n, int k,int[][] picture) {
    	picture[m][n]=0;
		temp++;
    	if(m<picture.length-1&&picture[m+1][n]==k) {
    		find(m+1,n,k,picture);
    	}
    	if(m>0&&picture[m-1][n]==k) {
    		find(m-1,n,k,picture);
    	}
    	if(n<picture[0].length-1&&picture[m][n+1]==k) {
    		find(m,n+1,k,picture);
    	}
    	if(n>0&&picture[m][n-1]==k) {
    		find(m,n-1,k,picture);
    	}
    }
    public int[] solution(int m, int n, int[][] picture) {
        answer = new int[2];
        answer[0] = 0;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(picture[i][j]!=0){
                	temp=0;
                    find(i,j,picture[i][j],picture);
                    answer[1]=Math.max(answer[1], temp);
                    answer[0]++;
                }
            }
        }
        return answer;
    }
}