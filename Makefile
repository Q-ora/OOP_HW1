all: computeArea

computeArea: computeArea.o
	g++ -o computeArea computeArea.o

computeArea.o: computeArea.cpp
	g++ -c computeArea.cpp

clean: computeArea
	rm -f computeArea.o computeArea