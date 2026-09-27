#include <iostream>
using namespace std;

    int duplicado(int numero)
    {
        numero-=2;
        return numero;
    }

int main(){
    int numero;
    cout << "Introduzca un numero real: ";
    cin >> numero;
    int resultado = duplicado(numero);
    cout << "El resultado de: " << numero << endl;
    cout << " duplicado " << numero << " es: " << resultado << endl;
}