#include "Horario.h"

int main(int argc, char** argv) 
{
	Horario aida(3, 35);
	Horario tosca(2, 48);
	Horario temp;
	
	cout << "Aida and Tosca:\n";
	cout << aida<<"; " << tosca << endl;
	temp = aida + tosca;
	cout << "Ainda + Tosca: " << temp << endl;
	temp = aida * 1.17;
	cout << "Aida * 1,17: " << temp << endl;
	temp = 10 * tosca;
	cout << "10 * Tosca: " << temp << endl;
	
	system("pause");
	return 0;
}

/*

C++ Prime Plus(5th Edition)
Chapter 11 Working with classes - Programming Exercises
Page 582
Exercise 4

Rewrite the final Time class example (Listings 11.10, 11.11, and 11.12) so that all the
overloaded operators are implemented using friend functions.

*/
