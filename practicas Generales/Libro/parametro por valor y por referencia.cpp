#include <iostream>
using namespace std;

void duplicadoParamValor (int numero)
{
    numero*=2;
}
void duplicadoParamReferencia (int &numero)
{
    numero*=2;
}

int main()
{
    setlocale(LC_ALL, "spanish");
    int numero;
    cout << "INtroduzca un numero entero: ";
    cin >> numero;
    cout << "El numero: " << numero << " cambio a :";
        duplicadoParamValor(numero);
    cout << numero << endl;
    cout << "El numero: " << numero << " cambio a: ";
        duplicadoParamReferencia(numero);
    cout << numero << endl;
}