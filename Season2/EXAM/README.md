# 상속 상품
쇼핑몰의 판매 상품을 보자.
- Book, Album, Movie 이렇게 3가지 상품을 클래스로 만들자.
- 코드 중복이 없게 상속 관계를 사용하자. 부모 클래스는 Item이라는 이름을 사용하자.
- 공통 속성 : name, price
  - Book: 저자 ( author ), isbn ( isbn )
  - Album: 아티스트 ( artist )
  - Movie: 감독( director ), 배우 ( actor )

## ShopMain.java
```
package extends1.ex;

public class ShopMain {

    public static void main(String[] args) {
        Book book = new Book("JAVA", 10000, "han", "12345");
        Album album = new Album("앨범1", 15000,"seo");
        Movie movie = new Movie("영화1", 18000, "감독1", "배우1");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("상품 가격의 합: " + sum);
    }
}
```

실행 결과
이름:JAVA, 가격:10000
- 저자:han, isbn:12345 
이름:앨범1, 가격:15000
- 아티스트:seo
이름:영화1, 가격:18000
- 감독:감독1, 배우:배우1
상품 가격의 합: 43000
