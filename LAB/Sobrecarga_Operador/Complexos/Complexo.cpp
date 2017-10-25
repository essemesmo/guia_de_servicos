#include "Complexo.h"

Complexo::Complexo(double real, double imaginario)
	: real(real), imaginario(imaginario) { }
	
Complexo::Complexo() : real(0.0), imaginario(0.0) { }
	
Complexo Complexo::operator+(Complexo c)
{
	return Complexo(this->real + c.real, this->imaginario + c.imaginario);
}

Complexo Complexo::operator-(Complexo c)
{
	return Complexo(this->real - c.real, this->imaginario - c.imaginario);
}

Complexo Complexo::operator*(Complexo c)
{
	double r = this->real * c.real - this->imaginario * c.imaginario;
	double i = this->real * c.imaginario + this->imaginario * c.real;
	
	return Complexo(r, i);
}

Complexo Complexo::operator*(double d)
{
	return Complexo(this->real * d, this->imaginario * d);
}

Complexo Complexo::operator~()
{
	return Complexo(this->real, - this->imaginario);
}

ostream& operator<<(ostream& os, Complexo c)
{
	if (c.imaginario >= 0)
		os << c.real << " + " << c.imaginario << "i";
	else
		os << c.real << " " << c.imaginario << "i";
	return os;
}

istream& operator>>(istream& is, Complexo& c)
{
	is>> c.real>> c.imaginario;
	return is;
}

bool Complexo::operator==(Complexo c)
{
	if (this->real == c.real && this->imaginario == c.imaginario)
		return true;
	
	else return false;
}

bool Complexo::operator!=(Complexo c)
{
	if (this->real != c.real || this->imaginario != c.imaginario)
		return true;
	
	else return false;
}





