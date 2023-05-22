# JavaApplication
#### TDD 기반 JAVA 심화 / 응용 🌲
#### ArrayList와 HashMap의 자료구조에 대해 이해하고 직접 구현

### ArrayList
- add() 테스트케이스
- get() 테스트케이스
- add 수행 시, 데이터를 data 배열에 넣기 전에 공간이 부족하다면 배열 생성 후 기존 데이터들을 이사
- TestUt 도입하여, 정말 data배열의 크기가 적절한 타이밍에 2배로 늘어나는지 검증
- add, get 메서드에 제너릭 적용
- indexOf 간단한 스트림 코드 적용
- contains, addAt, set, remove 구현

### HashMap 
- size() 테스트케이스 추가
- put을 호출할 때 마다 size 증가
- get 메서드 추가
- Entriy 클래스 도입하여, keys value 배열을 하나로 통합
- put 기존에 이미 존재하는 데이터라면 추가가 아닌 교체처리
- remove 구현
- containsKey, containsValue 구현
- clear 구현
