# Baseball Game Project

야구 게임 프로젝트 (10-01 - 내년 4월)

그래픽은 나중에 생각하고 일단은 터미널에서 할 수 있는 그래픽으로 게임 구현만 해놓은 다음 그래픽 생각한다.

게임 구성

1) 게임 시작창
1: 시작 2: 종료 정도로 간략하게 만듬

2) 팀 선택 
일단 팀은 2개로 구성 -> 두산과 넥센 정도로 생각중
거기서 첫번째 플레이어가 둘 중 하나(1 또는 2)를 엔터해서 팀을 고름
-> 중복 가능하게 하자

3) 경기 방식
 A. 인터페이스: 일단 이닝, 현재 루 상황, 점수판, 스트라이크, 볼, 아웃카운트, 타자와 투수 정보로 만듬.
 B. 타격방식: 투수가 일단 던질 지점을 고름 (1. 몸쪽, 2. 가운데, 3. 바깥쪽, 4. 볼), 그 다음 타자가 칠 지점을 고름 (번호는 마찬가지, 4는 기다리기)
 그러면 여기서 어떻게 안타가 나오는가?
   1. 같은 데 쳤을 때: 현재 타자의 타율과 투수의 피안타율의 평균값에 + 0.1
   2. 볼이 아닌데 던졌는데 다른 위치 골랐을 때: 타율과 투수의 피안타율 평균값
   3. 볼인데 쳤을때: 타율 - 0.2
   
   만약 안타를 쳤을 때 (홈런/안타)확률로 홈런 치고, 만약 안타일 시 0.8:0.15:0.05 확률로 1,2,3루타.
   
   식으로 한다.
   
 C. 투수 체력: 선발은 하나 던질 때마다 1씩 내려가고 (max는 200), 계투는 5씩 내려감 -> 체력의 영향: 투수 피안타율 = 기록 * 160/현재체력 (160 이하일 때)
 
 
 
