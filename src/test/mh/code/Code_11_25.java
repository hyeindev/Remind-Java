package test.mh.code;

import java.util.*;

public class Code_11_25 {
    public static void main(String[] args) {

        System.out.println("hello ");

        Code_11_25 c = new Code_11_25();
        System.out.println( c.test5("Hello"));

//        Scanner sc = new Scanner(System.in);
//
//        String str = sc.next();
//        System.out.println(str);

        // 숫자가 1보다 이상 3이하이면 로그에 aa출력 6이면 로그에 bb출력  그외에는 cc출력 (switch 만 사용)

        int n = 2;

        switch (n){
            case 1 :
            case 2 :
            case 3 :
                System.out.println("aa");
                break;
            case 6 :
                System.out.println("bb");
                break;
            default:
                System.out.println("cc");
        }

        for (int i =1; i <=10; i++){
            if (i >=1 && i <4 ||
                    i >=5 && i<10){
                System.out.println(i);
            }
        }
        // 4 & 10 제외 출력

        for (int i = 1; i<=10; i++){
            if (i == 4 || i ==10){
                continue;
            }
            System.out.println(i);
        }

//        int i = 1;
//        while (i <= 10){
//            System.out.println(i);
//            i++;
//        }

//        int j = 1;
//        do {
//            System.out.println(j);
//            j++;
//        }while (j <= 10);



    }

    public boolean test1(int a){
        if (a%2 ==0){
            return true;
        }else {
            return false;
        }
    }

    // 짝수면 2곱한값 반환/홀수면 2나눈 나머지값 반환하는 메서드
    public int test2(int a){
        if (a%2 ==0){
            return a*2;
        }else {
            return a%2;
        }
    }

    /*
        파라미터로 들어온 int형 변수가 100보다 크고,
         200보다 작으면 return true/ 반대는 false
     */

    public boolean test3(int a){
        if (a > 100 && a<200){
            return true;
        }else {
            return false;
        }
    }

    /*
        파라미터로 들어온 int형 변수가 100보다 작거나
         200보다 크면 return true/ 반대는 false
     */

    public boolean test4(int a){
        if (a < 100 || a>200){
            return true;
        }else {
            return false;
        }
    }

    /*
        파라미터로 String 변수가 들어왔을때 Hello 라는 문자열인지 판별하고
         맞으면 1, 아니면 0 반환
     */


    public int test5(String str){
        if (str.equals("Hello")){
            return 1;
        }else {
            return 0;
        }
    }

    int a = 1;
    int b = -a;

    short c = 1;
    long d = -c;



}
