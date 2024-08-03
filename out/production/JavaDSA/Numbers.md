Bitwise Operators:
AND ( & ):

Usage: Performs a bitwise AND operation.
Example: a & b (Bitwise AND of a and b).
OR ( | ):

Usage: Performs a bitwise OR operation.
Example: a | b (Bitwise OR of a and b).
XOR ( ^ ):

Usage: Performs a bitwise XOR (exclusive OR) operation.
Example: a ^ b (Bitwise XOR of a and b).
NOT ( ~ ):

Usage: Performs a bitwise NOT operation (complement).
Example: ~a (Bitwise NOT of a).
Left Shift ( << ):

Usage: Shifts bits to the left by a specified number of positions.
Example: a << n (Shift bits of a left by n positions).
Right Shift ( >> ):

Usage: Shifts bits to the right by a specified number of positions.
Example: a >> n (Shift bits of a right by n positions).

---

Number Conversions:

Decimal to Any Base:
Repeated Division Method:

Divide the decimal number by the desired base.
Take the remainder as the rightmost digit of the new base number.
Repeat the process with the quotient until the quotient is zero.
The remainders, read from bottom to top, form the converted number in the new base.
Example: Convert decimal 37 to binary (base 2).

37
÷
2
=
18
37÷2=18 remainder 1 (rightmost bit).
18
÷
2
=
9
18÷2=9 remainder 0.
9
÷
2
=
4
9÷2=4 remainder 1.
4
÷
2
=
2
4÷2=2 remainder 0.
2
÷
2
=
1
2÷2=1 remainder 0.
1
÷
2
=
0
1÷2=0 remainder 1 (leftmost bit).
Reading the remainders from bottom to top, we get
100101
100101 as the binary representation of 37.
Repeated Multiplication Method:

Multiply the decimal number by the desired base and separate the integer part and fractional part.
Repeat the process with the integer part until it becomes zero, noting down the remainders.
The remainders, read in reverse order, form the converted number in the new base.
Example: Convert decimal 27 to octal (base 8).

27
×
8
=
216
27×8=216 (integer part),
0.75
0.75 (fractional part).
216
÷
8
=
27
216÷8=27 remainder 0.
27
÷
8
=
3
27÷8=3 remainder 3.
3
÷
8
=
0
3÷8=0 remainder 3.
Reading the remainders in reverse order, we get
33
33 as the octal representation of 27.
Binary to Any Base:
Grouping Method:

Group binary digits into sets of the desired base (e.g., 3 bits for octal, 4 bits for hexadecimal).
Convert each group to its decimal equivalent.
The decimal numbers obtained represent the digits in the new base.
Example: Convert binary
110110
110110 to hexadecimal.

Grouping into sets of 4 bits:
0011

0110
0011 0110.
001
1
2
=
3
10
0011
2
​
=3
10
​
,
011
0
2
=
6
10
0110
2
​
=6
10
​
.
Therefore,
11011
0
2
=
3
6
16
110110
2
​
=36
16
​
in hexadecimal.
Direct Conversion:

Convert binary digits directly to their equivalent in the new base using a conversion table.
Example: Convert binary
1010
1010 to octal.

Binary
1010
1010 corresponds to octal
12
12 directly.
