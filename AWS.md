# AWS 

- 아마존 웹서비스 클라우드 컴퓨팅
- 네트워킹을 기반으로 가상 컴퓨터와 스토리지, 네트워크 인프라 등 서비스 제공
- 웹 서비스를 사용하여 확장 가능하고 정교한 애플리케이션 구축하도록 지원.

## 클라우드 컴퓨팅

- 기존의 물리적 형태의 실물 컴퓨팅 리소스를 네트워크 기반 서비스 형태로 제공하는 것.
- 사용자로 하여금 네트워크 상에서 클라우드 서비스의 자원을 사용하는 것을 의미.
- 종류 :
  - laaS(Infrastructure as a Service)
    - AWS, 네이버 플랫폼과 같은 인프라 스트럭쳐를 제공하는 서비스
    - 가상 서버 또는 스토리지, 가상 네트워크 등의 리소스를 서비스 형태로 제공.
    - 사용자는 물리적인 하드웨어를 직접 관리할 필요가 없으며 직접적으로 서비스 이용을 통해 컴퓨터 리소스를 사용 가능함.
    - 클라우드 IT의 기본 구성 요소.
  - PaaS(Platform as a Service)
    - DB 또는 Application 서버 등의 미들웨어를 제공.
    - 하드웨어/OS/미들웨어에 대한 관리는 서비스 제공자가 하며, 사용자는 제공된 미들웨어만 사용 가능
    - 기본 인프라(하드웨어 및 운영체제)를 관리할 필요 없이 애플리케이션 실행 가능.
  - SaaS(Software as a Service)
    - 소프트웨어 또는 애플리케이션의 기능만 제공, 네이브 클라오드 웹 메일, ERP 등과 같은 형태의 서비스를 사용자에게 제공.





- 장점

  - 저렴한 비용

  - 속도 및 민첩성, 융통성
  - 용량추정 불필요 및 데이터 센터 운영 및 유지관리 비용 투자 불필요
  - 몇 부만에 전 세계에 배포 가능

- 구성

  - 컴퓨팅 : EC2. 새로운 서버 인스턴스를 확보하고 부팅하는데 필요한 시간을 몇분으로 단축하며 컴퓨팅 요구사항의 변화에 따라 신속하게 컴퓨터 파워를 확장하거나 축소할 수 있다.
  - 네트워킹 : 네트워크 서비스 그룹은 DNS 서비스를 제공하고 사용자에게 AWS상의 가상 네트워킹 환경을 직접 제어할 수 있는 기능을 제공하며 마치 기존 네트워크 내에 있는 것처럼 Amazon EC2 인스턴스와 상호작용할 수 있도록 지원.
  - 스토리지 : 데이터 및 사용 유형에 따라 여러 스토리지 옵션을 제공.



- EC2

  ​	만드는 과정:

  - 인스터스 타입 : 아마존 리눅스, UBUNTU(유닉스 기반), WINDOW SERVER => 무료 (sql 서버를 안가지고 있어서 / 마이크로소프트 라이센스를 가지고 있지 않아서)
  - vcpu : vertual cpu : 가상cpu 
  - EBS : 저장장치의 일종
  - 태그 : value: 인스턴스가 어떤 역할을 하는지 누가 관리하는지 메모하는 공간.
  - 보안 : 일종의 방화벽 