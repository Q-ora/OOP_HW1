import math

#open file
fout = open("python_result.txt", "w")

questionCnt = 1
while True:
    a, b, c = input("Please input the lengths of the three sides of the triangle:\n").split()
    a = int(a)
    b = int(b)
    c = int(c)
    #輸入皆為-1
    if a==-1 and b==-1 and c==-1:
        break

    #write input to python_result.txt
    fout.write("Question {0} inputs are, a = {1}, b = {2}, c = {3}.".format(questionCnt, a, b, c) + "\n")

    #check if lengths are legal
    if (a<=0 or b<=0 or c<=0) or (a+b<=c or a+c<=b or b+c<=a):
        fout.write("The input is not legal." + "\n")
        print("The input is not legal.")
        continue
    
    #compute area
    s = (a + b + c) / 2
    area = math.sqrt( s*(s-a)*(s-b)*(s-c) )
    fout.write("The Area of this triangle is {0}.".format(round(area,4)) + "\n")
    print("The Area of this triangle is {0}.".format(round(area,4)))
    print("The answer has been output to python_result.txt")

    questionCnt += 1

fout.close()