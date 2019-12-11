package com.eomcs.basic.ex03;

//# 부동소수점 리터럴 - 유효자릿수
//- 정수처럼 메모리 크기(4바이트 또는 8바이트)에 따라 표현할 수 있는 부동소수점의 범위가 다르다.
//- 단 IEEE 754 명세에 따라 2진수로 변환되기 때문에 
//  정확하게 '소수점 이상 얼마까지 소수점 이하 얼마까지' 식으로 정의할 수 없다.  
//  대신 '유효자릿수'라는 방식으로 대략적으로 값의 범위를 표현한다. 
//
public class Exam34 {
  public static void main(String[] args) {
    
    //## 4byte(float) 부동소수점의 유효자릿수
    //소수점을 뺀 후 7자리 숫자까지는 거의 정상적으로 저장된다.
    System.out.println(999.9999f);
    System.out.println(999999.9f);
    System.out.println(9.999999f);
    System.out.println("----------------------------");
    
    //유효자릿수가 7자리를 넘어가는 경우 값이 잘려서 저장될 수 있다.
    System.out.println(987654321.1234567f);
    System.out.println(9.876543211234567f);
    System.out.println(987654321123456.7f);
    System.out.println("----------------------------");
    
    //## 8byte(double) 부동소수점의 유효자릿수
    //소수점을 뺀 후 16자리 숫자까지는 거의 정상적으로 저장된다.
    System.out.println(987654321.1234567);
    System.out.println(9.876543211234567);
    System.out.println(987654321123456.7);
    System.out.println("----------------------------");
    
    //유효자릿수가 16자리를 넘어가는 경우 값이 잘려서 저장될 수 있다.
    System.out.println(987654321.12345678);
    System.out.println(9.8765432112345678);
    System.out.println(987654321123456.78);
    System.out.println("----------------------------");

    //## 부동소수점을 저장할 때 정확하게 저장되지 않는 예
    System.out.println(7 * 0.1); //결과: 0.7000000000000001
    //- 이유
    //  - IEEE-754 규격에 따라 부동소수점을 2진수로 바꾸다보면
    //    정확하게 2진수로 딱 떨어지지 않는 경우가 있다.
    //    CPU, OS, 컴파일러, JVM의 문제가 아니다.
    //  - IEEE-754의 방법에 내재되어 있는 문제다.
    //- 해결책
    //  - 시스템에서 필요한 만큼 소수점 이하 자리수를 적절히 짤라 사용하라!
  }
}

//## 결론!
//- 32비트(float) 메모리에 부동소수점을 저장할 때는 유효자릿수 7자리까지는 거의 가능하다. 
//- 64비트(double) 메모리에 부동소수점을 저장할 때는 유효자릿수 16자리까지는 거의 가능하다.
//- 그래서 32비트 float을 단정도(single-precision)라 부르고,
//  64비트는 두 배 정밀하게 값을 저장한다고 해서 배정도(double-precision)이라 부른다.
//
//## 메모리 비트와 2진수
//- 메모리의 각 비트는 전기의 on/off 상태를 나타낸다.
//- 비트의 on 상태를 1, off 상태를 0으로 표현한다.
//- 그래서 메모리의 비트 상태를 표현할 때는 2진수로 나타낸다.
//
//## 메모리에 값을 저장하기
//- 메모리는 비트로 되어 있기 때문에 어떤 유형의 값이든 2진수로 변환할 수 있다면 메모리에 저장할 수 있다.
//- 예) 빛을 저장하기
//  - 카메라 렌즈로 들어온 빛을 메모리에 저장하려면 2진수로 변환해야 한다.
//  - 이런 역할을 하는 것이 이미지 센서이다.
//- 예) 소리를 저장하기
//  - 소리도 마찬가지이다. 메모리에 저장하려면 2진수로 변환해야 한다.
//  - 마이크로 들어온 음파를 ADC를 통해 디지털 신호, 즉 2진수로 변환한다.
//
//## 부동소수점이 메모리에 저장되는 원리
//- 부동소수점도 메모리에 저장하려면 2진수로 표현할 수 있어야 한다.
//- 부동소수점을 2진수로 변환하는 것을 "정규화(nomalized)"라 부른다.
//- 이런 정규화 규칙을 정의한 문서가 "IEEE-754"이다.
//- 부동소수점을 2진수로 바꿀 때, 가수부와 지수부로 분리하여 변환한다. 
//- 가수부는 'Sign-Magnitude 방식'으로 변환하고, 지수부는 'Excess-K 방식'으로 변환한다. 
//
// ### IEEE-754
// - 부동소수점을 32비트와 64비트로 표현하는 방법에 대해 정의하고 있다.
// - 32비트로 표현하는 방법을 "single-precision(정밀도 1; 단정도)"이라 한다.
// - 64비트로 표현하는 방법은 32비트에 대비해 두 배 가량 더 정밀하게 표현할 수 있다고 해서 "double-precision(정밀도가 두 배; 배정도)"이라 한다.
// 
// ### 부동소수점을 2진수로 표현하는 방법
// - 자바에서 부동소수점의 정규화는 "IEEE 754-1985" 명세에 따른다.
// - 메모리 크기와 비트의 구성
//   => 32비트 float 타입(32-bit single-precision; 단정도)
//     [부호비트(1)][지수부(8)][가수부(23)]
//   => 64비트 double 타입(64-bit double-precision; 배정도)
//     [부호비트(1)][지수부(11)][가수부(52)]
// - 부호비트(sign bit)
//   음수는 1, 양수는 0.
// - 지수(exponent)
//   127 bias를 사용한다. 즉 2의 지수 값에 127을 더한 결과 값을 사용한다.
// - 가수(fraction/mantissa)
//   sign-magnitude 방식으로 저장한다.
//   1.xxxx 값에서 소수점 왼쪽에 있는 1을 제외한 나머지 수를 사용한다.
//   가수부에 남는 비트가 있다면 0으로 채운다.

// ### 실수 값을 정규화하는 방법 = 실수 값을 32비트 2진수로 만드는 방법
// - 예: 12.375(10진수)
//
// 1) 소수점 앞의 정수 값을 2진수로 변환한다.
//   12(10진수)
//   = 1100(2진수)  
// 
// 2) 소수점 뒤의 값을 2진수로 변환한다.
// - 변환 규칙
// - 소수점을 2로 곱하여 나온 결과에서 정수 부분만을 차례대로 표기한다.
// - 소수 부분이 0이거나 반복되면 계산을 멈춘다.
// - 예: 0.375(10진수)
//   0.375 * 2 = 0.75  --> 0
//   0.75 * 2  = 1.5   --> 1
//   0.5 * 2   = 1.0   --> 1
//   => 0.011(2진수)
//
// 3) 2진수 바꾼 최종 결과
//   12.375(10진수)
//   = 12(10진수) + 0.375(10진수)
//   = 1100(2진수) + 0.011(2진수)
//   = 1100.011(2진수)
//   = 1*2^3 + 1*2^2 + 0*2^1 + 0*2^0 + 0*2^-1 + 1*2^-2 + 1*2^-3
//   = 1*8 + 1*4 + 0*2 + 0*1 + 0*0.5 + 1*0.25 + 1*0.125
// 
// 4) 정규화 
// - 소수점의 위치를 조정하여 가수부와 지수부를 분리한다.
// - IEEE 754 명세는 다음과 같은 형식으로 가수부와 지수부를 나눈다.
//   1.x1x2x3x4...x23(2진수) * 2^e
//   => 소수점 왼쪽에 1만 남도록 소수점을 이동한다.
//   => 소수점 왼쪽은 무조건 1이기 때문에 저장하지 않고 버린다.
//   => 따라서 소수점 오른쪽 수만 가수부에 놓는다.
//      즉 x1, x2 등은 가수부 1번 비트부터 23번 비트까지를 의미한다.
//   => 23번 비트까지 채우지 못하면 나머지 비트는 0으로 채운다.
// - 예)
//   1100.011(2진수)
//   = 1.100011(2진수) * 2^3
//   가수부 => 100011(2진수)
//   지수부 => 3 + 127(bias) = 130(10진수) = 10000010(2진수)
//
// 5) 32비트로 표현하기
//   [0][10000010][10001100000000000000000]
//   => 0100_0001_0100_0110_0000_0000_0000_0000
//   => 0x41460000
//
//주의!
//- 유효 자릿수의 부동소수점이라도 정규화할 때 2진수로 딱 떨어지지 않은 경우가 있다.
//- 예) 2.127
//2 => 0010
//0.127 => 
//0.127 * 2 = 0.254 --> 0
//0.254 * 2 = 0.508 --> 0
//0.508 * 2 = 1.016 --> 1
//0.016 * 2 = 0.032 --> 0
//0.032 * 2 = 0.064 --> 0
//0.064 * 2 = 0.128 --> 0
//0.128 * 2 = 0.256 --> 0
//0.256 * 2 = 0.512 --> 0
//0.512 * 2 = 1.024 --> 1
//0.024 * 2 = 0.048 --> 0
//....
//이처럼 2진수로 완벽히 표현할 수 없는 수가 있다.
//0.00000....1 의 오차가 있다.
//그래서 부동소수점은 정수와 다르게 정확하게 메모리에 저장되지 않는다.
