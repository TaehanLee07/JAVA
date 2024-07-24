### 예제

---

- **요구사항**
    
    ---
    
    **BookMain.java** 의 코드를 보고 해당 코드가 실행될 수 있도록 **Book.java**를 완성하시오.
    
    - **BookMain.java**
        
        ---
        
        ```java
        package construct;
        
        public class BookMain {
        
            public static void main(String[] args) {
                Book book1 = new Book();
                book1.displayinfo();
                
                Book book2 = new Book("Hello Java", "Seo");
                book2.displayinfo();
        
                Book book3 = new Book("JPA 프로그래밍", "Kim", 700);
                book3.displayinfo();
            }
        }
        
        ```
        
    
    ### 멤버 변수
    
    - title (제목)
    - author (작가)
    - page (쪽수)
    
    ---
    
    - 출력 예시
    
    ```
    제목: , 저자: , 페이지: 0
    제목: Hello Java, 저자: Seo, 페이지: 0
    제목: JPA 프로그래밍, 저자: kim, 페이지: 700
    ```

    
