# 🌿 스프링 핵심 원리 - 기본편 정리

김영한님의 인프런 강의를 따라가며 실습한 코드와 내용을 정리한 레포입니다.   
객체 지향 설계부터 스프링 컨테이너, DI까지 스프링의 핵심 원리를 단계별로 학습했습니다.

---

## 📘 학습한 주요 개념

### 1️⃣ 객체 지향 설계 원칙
- SOLID 원칙의 이해와 적용  
- 역할과 구현 분리  
- 관심사의 분리 (Separation of Concerns)

### 2️⃣ IoC / DI (제어의 역전 / 의존성 주입)
- 순수 자바 기반 DI 구성  
- 스프링 컨테이너를 통한 의존성 주입  
- 생성자 / 필드 / Setter 주입 방식 비교  
- 자동 주입 vs 수동 주입  
- 실무 기준에서의 DI 전략

### 3️⃣ 스프링 컨테이너와 빈 관리
- ApplicationContext vs BeanFactory  
- `@Configuration`, `@Bean` 수동 등록  
- `@ComponentScan` 자동 등록 및 필터링  
- 빈 조회 및 중복 처리 전략

### 4️⃣ 의존관계 주입 고급 기능
- 주입 대상이 여러 개인 경우 처리 (`@Qualifier`, `@Primary`)  
- 옵션 주입 (`required = false`, `Optional`)  
- 다중 빈 주입 (`List`, `Map`)  
- 커스텀 애노테이션 구성

### 5️⃣ 싱글톤과 생명주기, 스코프
- 스프링의 싱글톤 보장 원리  
- `@Configuration`의 바이트코드 조작  
- 빈 생명주기 콜백 (`@PostConstruct`, `@PreDestroy`)  
- 프로토타입, 웹 스코프 개념과 주의점  
- 스코프 간 의존성 해결 (`ObjectProvider`, 프록시)

---

## 🔗 참고
- 강의 링크: [스프링 핵심 원리 - 기본편](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%ED%95%B5%EC%8B%AC-%EC%9B%90%EB%A6%AC-%EA%B8%B0%EB%B3%B8%ED%8E%B8?attributionToken=qgHwqQoMCPGJ4sAGEICi25ACEAEaJDY4MmNhOGRiLTAwMDAtMmQzZi1hYTY2LTNjMjg2ZDRlNWU4MiokZTM4NWU2YzQtMzhiOC00MjExLWE4M2MtNjM2ZDZmZWY5NjI5MjCY1rctxcvzF8LwnhXUsp0Vjr6dFaOAlyK2t4wtqOWqLffowzCa7sYwkPeyMJvWty06DmRlZmF1bHRfc2VhcmNoSAFYAWABaAF6AnNp)  
- 강사: 김영한
