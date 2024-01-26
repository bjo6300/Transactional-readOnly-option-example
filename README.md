# transactional-example
## @Transactional 옵션에 따른 JPA save 예제

1. 서비스에 @Transactional이 적용된 경우에 쓰기 연산 동작 과정
2. 서비스에 @Transactional(readOnly = true)이 적용된 경우에 쓰기 연산 동작 과정
3. 서비스에 트랜잭션을 선언하지 않은 경우 쓰기 연산 동작 과정

3가지 상황에 대한 예시입니다.

서버 실행 후 [swagger](http://localhost:8080/swagger-ui/index.html) 또는 테스트 코드를 통해 결과를 확인할 수 있습니다.

자세한 내용은 [블로그](https://velog.io/@bjo6300/%EC%84%9C%EB%B9%84%EC%8A%A4%EC%97%90-Transactional-vs-%EC%84%9C%EB%B9%84%EC%8A%A4%EC%97%90-TransactionalreadOnly-true-vs-%EB%A9%94%EC%84%9C%EB%93%9C%EC%97%90-%ED%8A%B8%EB%9E%9C%EC%9E%AD%EC%85%98%EC%9D%84-%EC%84%A0%EC%96%B8%ED%95%98%EC%A7%80-%EC%95%8A%EC%9D%80-%EA%B2%BD%EC%9A%B0%EC%97%90-JPA-save-%EB%8F%99%EC%9E%91-%EA%B3%BC%EC%A0%95)를 참고하시면 좋습니다.
