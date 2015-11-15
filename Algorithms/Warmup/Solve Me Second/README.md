#Solve Me Second#
You saw a sample challenge in Solve Me First.

Here, we give you a full challenge with all of the components that you typically see on HackerRank. In addition, we have provided a more elaborate I/O template in your preferred language.

The given code starts by scanning two integers, separated by a single space, from STDIN in a loop over **T** lines. Then, it calls a sum function and prints out the return value to `STDOUT'.

Pseudocode:

    read T
    loop from 1 to T
        read A and B
        compute the sum
        print value in a newline
    end loop

The code has already been provided for most of the popular languages. This is primarily for you to read and inspect how the I/O is handled.

###Input Format###

The first line contains **T**, the number of test cases. The following **T** lines each contains **A** and **B** integers, separated by a space.

###Output Format###

An integer representing the sum for every test case on a new line.

###Constraints###

**1=T,A,B=1000**

###Sample Input###

    2
    2 3
    3 7

###Sample Output###

    5
    10

###Explanation###

The **2** in the first line describes how many test cases will follow. The test case integers are **2**, **3** and **3**, **7** featured on two separate lines. Your output should be the sum of those test cases: **5** and **10** printed on two separate lines. If you print extra lines or any extra characters in your output, your answer will not be accepted because the judging is done using a diff checker.