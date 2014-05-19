

# JDKBINDIR="C:\Program Files (x86)\Java\jdk1.7.0_07\bin"
# JC=$(JDKBINDIR)\javac
# JAVA=$(JDKBINDIR)\java
JC=javac
JAVA=java

OBJECTS=Principal.class Interface.class Conta.class

%.class: %.java
	$(JC) $<

all: $(OBJECTS)

run: all
	$(JAVA) Principal

clean: 
	rm *.class