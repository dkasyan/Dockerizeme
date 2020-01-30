FROM tomcat
MAINTAINER dkasyan

RUN yum -y install java
RUN java -version