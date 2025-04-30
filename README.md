# 🌿 스프링 핵심 원리 - 기본편

## 📘 학습한 주요 개념

### 1️⃣ 객체 지향 설계 원칙
- SOLID 원칙의 이해와 적용  
- 역할과 구현 분리  
- 관심사의 분리 (Separation of Concerns)

### 2️⃣ IoC / DI (제어의 역전 / 의존성 주입)
- 스프링 이전 순수 자바 DI 구현  
- 스프링 컨테이너를 통한 DI 구조  
- 생성자 / 필드 / Setter 주입 방식 비교  
- 자동 vs 수동 주입 전략

### 3️⃣ 스프링 컨테이너와 빈 관리
- ApplicationContext vs BeanFactory  
- `@Bean`, `@Configuration` 기반 수동 등록  
- `@ComponentScan`을 통한 자동 등록  
- 빈 조회, 중복 처리, 우선순위 설정

### 4️⃣ 싱글톤 컨테이너와 생명주기
- 싱글톤 보장 메커니즘  
- `@Configuration`의 바이트코드 조작 원리  
- 생명주기 콜백: `@PostConstruct`, `@PreDestroy`  
- 초기화/종료 인터페이스: `InitializingBean`, `DisposableBean`

### 5️⃣ 빈 스코프
- 싱글톤, 프로토타입, 웹 스코프의 차이  
- 스코프 간 의존성 문제 해결 (`ObjectProvider`, 프록시)

### 6️⃣ 의존성 주입 고급
- `@Qualifier`, `@Primary`로 빈 충돌 해결  
- 옵션 주입 처리 (`required = false`, `Optional`)  
- 다중 빈 주입 (`List`, `Map`)  
- 커스텀 애노테이션 구성

### 7️⃣ 실무 기준 DI 전략
- 생성자 주입 우선 원칙  
- 자동 vs 수동 주입의 기준  
- 실무 환경에서의 컴포넌트 스캔 운영 방식

---

## 🔗 참고
- 강의 링크: [스프링 핵심 원리 - 기본편](https://www.inflearn.com/course/스프링-핵심-원리-기본)  
- 강사: 김영한