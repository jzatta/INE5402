

JDKBINDIR="C:\Program Files (x86)\Java\jdk1.7.0_07\bin"
JC=$(JDKBINDIR)\javac
JAVA=$(JDKBINDIR)\java

Principal.class: Principal.java
	$(JC) $<

Retangulo.class: Retangulo.java
	$(JC) $<

Interface.class: Interface.java
	$(JC) $<

all: Principal.class Interface.class Retangulo.class

run: all
	$(JAVA) Principal

clean: 
	del *.class