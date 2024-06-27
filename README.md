# Inventory Management System

## 개요
이 프로젝트는 재고 관리 시스템입니다. 사용자는 재고를 추가, 수정, 삭제하고, 재고 내역을 조회할 수 있습니다. 
클라이언트와의 상호작용을 처리하는 GraphQL Resolver와 Input Class를 포함하고 있습니다.

## 프로젝트 구조
- /resources/static/project_structure 참고

## 주요 기능
- 재고 CRUD 기능
- 재고 검색 및 필터링 기능
- GraphQL API 제공

## 기술 스택
- **언어**: Java
- **프레임워크**: Spring Boot
- **API**: GraphQL
- **데이터베이스**: MariaDB
- **JPA**: Hibernate
- **빌드 도구**: Maven
- **버전 관리**: Git
- **CI/CD**: Jenkins, GitHub Actions
- **아티팩트 관리**: Nexus
- **배포 환경**: Docker

## 역할 및 기여도
- 전체 시스템 설계 및 아키텍처 구성
- GraphQL API 설계 및 구현
- CI/CD 파이프라인 구성 및 자동화 배포 설정

## Completed Tasks
- 기술 스택 인프라 구축 및 기본 설정 완료
    - Java
    - Spring Boot
    - GraphQL
    - MariaDB
    - Hibernate (JPA)
    - Maven
    - Git
    - Jenkins, GitHub Actions (CI/CD)
    - Nexus
- Docker를 이용한 컨테이너화

## To-Do List
- [ ] CRUD 기능 개발
- [ ] Nexus를 활용한 모듈화
- [ ] 코드 리팩토링

## URL
- [project repository (api)](https://github.com/ss5924/machine-rs-api)
- [project repository (domain)](https://github.com/ss5924/machine-rs-domain)
- [Tool (GraphiQL)](http://ss4754.iptime.org:30002/graphiql?path=/graphql)
