// 흐름 제어문 - for 반복문과 배열
package com.eomcs.basic.ex06x;

import java.io.*;

class MaxMinSeek //main클래스
{   
   public static void main(String[] args) throws IOException{  
    int sum_value = 0, inputnum;
    int min = 0, max = 0;
    maxminselect select = new maxminselect(); //maxminselect상속
                   
    for (int i = 1; i<=5; i++){
        System.out.print(i + "번째 값을 입력하시오");
        //문자 입력부분
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        inputnum = Integer.parseInt(br.readLine());
        //최대, 최소값 처리 부분
        sum_value = sum_value + inputnum;   //합계 저장 부분
        max = select.maxselect(inputnum, max);//최대값 결정하여  max에 저장하여 재귀호출
        min = select.minselect(inputnum, min);//최소값 결정하여 min에 저장하여 재귀호출       
    }
    //출력부분
    System.out.print("최대값" + max+"입니다.");
    System.out.print("최소값" + min+"입니다.");
    System.out.print("합계" + sum_value + "입니다.");
        }           
}               
   
 class maxminselect  //최대,최소값구하는 클래스
{   
    //최고값을 결정하고 max에 저장하여 리턴한다   
    public int maxselect(int num, int max_value){
    int max = 0;   
   
        if (num >= max_value)
        {
            max_value = num;
        }
        return max = max_value;
    }   
   
    //최소값을 결정하고 min에 저장하여 리턴한다       
    public int minselect(int num, int min_value){
    int min = 0;
        if (num <= min_value || min_value == 0 )
        {
            min_value = num;
        }
        return min = min_value;       
     }
}
