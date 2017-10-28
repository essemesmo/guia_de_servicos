#ifndef HORARIO_H
#define HORARIO_H

#include <iostream>
using namespace std;

class Horario
{		
	public:
		Horario();
		Horario(int, int minutos = 0);
		
		void adMinuto(int);
		void adHora(int);
		void resetar(int horas = 0, int minutos = 0);
		
		friend Horario operator+(Horario, Horario);
		friend Horario operator-(Horario, Horario);
		friend Horario operator*(Horario, double);
		friend Horario operator*(double, Horario);
		friend ostream& operator<<(ostream &os, const Horario&);
		
		int horas;
		int minutos;
};

#endif
