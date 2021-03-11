all: computeArea

computeArea: computeArea.o
	g++ -o computeArea computeArea.o

computeArea.o: computeArea.cpp
	g++ -c computeArea.cpp

clean: computeArea.o computeArea
	rm -f computeArea.o computeArea

