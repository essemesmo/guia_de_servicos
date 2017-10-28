#include "Horario.h"

Horario::Horario() 
{
	horas = minutos = 0;
}

Horario::Horario(int horas, int minutos)
	: horas(horas), minutos(minutos) { }

void Horario::adHora(int h)
{
	horas += h;
}

void Horario::adMinuto(int m)
{
	minutos += m;
	horas += minutos / 60;
	minutos %= horas;
}

void Horario::resetar(int h, int m)
{
	horas = h;
	minutos = m;
}

Horario operator+(Horario h1, Horario h2)
{
	Horario soma;
	soma.minutos = h1.minutos + h2.minutos;
	soma.horas = h1.horas + h2.horas + soma.minutos / 60;
	soma.minutos %= 60;
	return soma;
}

Horario operator-(Horario h1, Horario h2)
{
	Horario diferenca;
	int total1 = h1.minutos + 60 * h1.horas;
	int total2 = h2.minutos + 60 * h2.horas;
	diferenca.minutos = (total1 - total2) % 60;
	diferenca.horas = (total1 - total2) / 60;
	return diferenca;
}

Horario operator*(Horario h, double mult)
{
	Horario resultado;
	long totalMin = h.horas * mult * 60 + h.minutos * mult;
	resultado.horas = totalMin / 60;
	resultado.minutos = totalMin % 60;
	return resultado;
}

Horario operator*(double mult, Horario h)
{
	Horario resultado;
	long totalMin = h.horas * mult * 60 + h.minutos * mult;
	resultado.horas = totalMin / 60;
	resultado.minutos = totalMin % 60;
	return resultado;
}

ostream& operator<<(ostream &os, const Horario &h)
{
	os << h.horas << " horas, " << h.minutos << " minutos";
	return os;
}












