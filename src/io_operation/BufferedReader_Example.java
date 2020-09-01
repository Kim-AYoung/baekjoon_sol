package io_operation;

import java.io.*;
import java.util.*;

public class BufferedReader_Example {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception{
		//BufferedReader媛� Scanner蹂대떎 �썾�뵮 鍮좊Ⅴ�땲, 肄붾뵫�뀒�뒪�듃 �궗�씠�듃�뿉�꽌�뒗 BufferedReader瑜� �궗�슜�븯�룄濡� �븯�옄!
		//split�뒗 �젙洹쒗몴�쁽�떇�쓣 �궗�슜�빐 StringTokenizer�겢�옒�뒪蹂대떎 �뒓由щ떎. �삉�븳, split�� 援щ텇臾몄옄�궗�씠�쓽 鍮� 臾몄옄�뿴�쓣 臾댁떆�븯吏� �븡�뒗�떎.
		
		//n踰�
		//a b c
		
		int n = Integer.parseInt(br.readLine());				
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] intArr = new int[st.countTokens()];
			for(int j=0; j<intArr.length; j++) {
				intArr[j] = Integer.parseInt(st.nextToken());
			}
		}
	
		//臾댄븳 踰�
		//a b c
		String str; 
		while(( str = br.readLine() ) != null) {
			if(str.equals("")) { //鍮� 臾몄옄�뿴�� �옒 泥섎━�븯�옄!
				continue;
			}
			
			StringTokenizer st = new StringTokenizer(str);
			int[] intArr = new int[st.countTokens()];
			for(int j=0; j<intArr.length; j++) {
				intArr[j] = Integer.parseInt(st.nextToken());
			}
			
		}
		
		//column row
		//2移섏썝 array
		StringTokenizer st = new StringTokenizer(br.readLine());
		int column = Integer.parseInt(st.nextToken()); 		//�뿴 			
		int row = Integer.parseInt(st.nextToken());			//�뻾
		
		int[][] intArr = new int[row][column];
		
		for(int i = 0; i < row; i++) {						//2李⑥썝 諛곗뿴�뿉 �엯�젰媛� ���엯
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < column; j++) {
				intArr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		//n踰덉쓽 臾몄옣�씠 �삩�떎
		String[] strArr = new String[n];
		for(int i=0; i<n; i++) {
			strArr[i] = br.readLine();
		}
		
		//n踰덉쓽 �닽�옄媛� �삩�떎
		int[] intArr2 = new int[n];
		for(int i=0; i<n; i++) {
			intArr2[i] = Integer.parseInt(br.readLine());
		}
		 		 
		 
		br.close();
	}

}
