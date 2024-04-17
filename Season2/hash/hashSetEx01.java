package hash;

import java.util.HashSet;
import java.util.Scanner;

public class hashSetEx01 {
    public static void main(String[] args) {

        solution(3,7);


    }
//    static boolean solution(int arr, int target) {
//        Scanner sc = new Scanner(System.in);
//        int targets = sc.nextInt();
//        int arrs[] = new int[arr];
//        int na = 0;
//
//        for (int i = 0; i < arr; i++) {
//            arrs[i] = sc.nextInt();
//            na = targets - arrs[i];
//            if (na + arrs[i] == targets)
//                return true;
//            na = 0;
//        }
//            return false;
//
//    }

    public static boolean solution(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int i : arr) {
            if (set.contains(target-i))
                return true;
            set.add(i);
        }
        return false;
    }
}




/*
hashset
set 인터페이스에서 지원하는 구현 클래스이다
순서대로 입력 x 일정하게 유지 x
null 요소도 허용이됨
중복허용 x (매력적인 부분)

중복을 걸러내는 과정 :
객체를 저장하기전에 먼저 객체의 hashcode() 메소드를 호출해서 해시코드를 얻은다음
저장되어있는 객체들이 해시코드와 비교한 뒤 같은 해시코드가 있다면 다시 equals()로 두객체를
비교후 true 가 나오면 동일한 객체로 판단후 중복저장 x
선언 방법
HashSet<Integer> set = new HashSet<>();
주요사용 메서드
add(value) : 값 추가
remove(value) : 값 제거
clear() : 모든값 제거
size() : HashSet 크기 알려줌
contains(value) : 현재 밸류 값이 있는지 알려줌

출력
해시셋 단점
전체 출력
System.out.println(set); 전체출력
get 메소드 존재 x 그래서 하나의 객체를 가지고 올수가 없다
하나의 객체를 가져오기 위해서는 Iterator를 사용해야 한다
Iterator는 전체 객체를 대상으로 한번씩 반복해서 가져오는 기능이다
Iterator() 메소드를 호출해서 얻을수있다
Iterator에서 하나의 객체를 가져올때는 next() 메소드 사용
먼저 가져올 객체가 있는지 확인하기 위해 hasNext()  사용후 확인하는것이 좋다
hasNext()는 있으면 true 없으면 false 반환 한다

Iterator iter = set.Iterator();

while(iter,hasNext()) {
	System.out.println(iter.next())
}

* */