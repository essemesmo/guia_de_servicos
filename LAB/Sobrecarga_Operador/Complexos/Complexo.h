#ifndef COMPLEXO_H
#define COMPLEXO_H

#include <iostream>
#include <string>
using namespace std;

class Complexo
{
	public:
		
		double real;
		double imaginario;
		
		Complexo(double, double);
		Complexo();
		
		Complexo operator+(Complexo);
		Complexo operator-(Complexo);
		Complexo operator~();
		Complexo operator*(Complexo);
		Complexo operator*(double);
		friend ostream& operator<<(ostream&, Complexo);
		friend istream& operator>>(istream&, Complexo& c);
		bool operator==(Complexo);
		bool operator!=(Complexo);
};

#endif

