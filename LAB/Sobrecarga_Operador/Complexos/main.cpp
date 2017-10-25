#include <iostream>
#include "Complexo.h"

int main(int argc, char** argv) 
{
	Complexo a(1.0,2.0);
	Complexo b(3.0, -12.0);
	
	while (cin >> a)
	{
		cout << "a eh: " << a << '\n';
		cout << "b eh: " << b << '\n';
		cout << "Conjugado de a eh: " << ~a << '\n';
		cout << "a + b eh: " << a + b << '\n';
		cout << "a - b eh: " << a - b << '\n';
		cout << "a * b eh: " << a * b << '\n';
		cout << "a * 2.0 eh: " << a * 2.0 << '\n';
		cout << "a == b ? : " << (a == b) << '\n';
		cout << "a != b ? : " << (a != b) << '\n';
	}
	
	system("pause");
	return 0;
}

/*

C++ Prime Plus(5th Edition)
Chapter 11 Working with classes - Programming Exercises
Page 582
Exercise 7

A complex number has two parts: a real part and an imaginary part. One way to write an
imaginary number is this: (3.0, 4.0). Here 3.0 is the real part and 4.0 is the imaginary
part. Suppose a = (A,Bi) and c = (C,Di). Here are some complex operations:
• Addition: a + c = (A + C, (B + D)i)
• Subtraction: a – c = (A – C, (B – D)i)
• Multiplication: a × c = (A × C – B × D, (A × D + B × C)i)
• Multiplication: (x a real number): x × c = (x × C, x × Di)
• Conjugation: ~a = (A, – Bi)

*/

