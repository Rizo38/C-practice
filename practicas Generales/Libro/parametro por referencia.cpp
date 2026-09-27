/*
Un parametro por referencia es cuando se pasa una referencia o puntero de la varible original
a una funcion, en lugar de pasar una copia del valor. Esto significa que cualquier cambio realizado en la variable dentro de la funcion se reflejara en la variable original
que se encuentra fuera de la funcion. El valor originalque se envia es modificado por los cambios que se realicen en el 
por parte de la funcion o metodo de la clase. Cuando se envian valores por referencia o metdos de la clase, no se pasa una copia de estos si no que se crea
una ferencia que tiene la misma direccioin en memoria del elemento original. La variable que se trabajara en la funcion o el metodo de la  clase sera por definicion un sinonimo
de la variable original, compartiendo la misma direccion de memoria y cotenido, por lo que un cambio sera reflejado
en ambos (la variable enviada y el parametro recibido)
*/

#include <iostream>
using namespace std;

int duplicado (int &numero)
{
    numero*=2;
    return numero;
}

int main() {
    int numero;
    cout << "Introduzca un numero real: ";
    cin >> numero;
    int resultado = duplicado(numero);
    cout << "Ahora numero vale: " << numero << endl;
    cout << "El resultado es: " << resultado << endl;
    return 0;
}
    