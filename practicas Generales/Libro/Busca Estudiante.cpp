#include <iostream>
#include <vector>
#include <string>

using namespace std;

struct Estudiante {
    int carnet;
    string nombre;
    string apellidos;
    string carrera;
};


bool buscar(const vector<Estudiante>& lista, int carnet) {
    for (const Estudiante& estudiante : lista) {
        if (estudiante.carnet == carnet) {
            cout << "Nombre: " << estudiante.nombre << " "
                << estudiante.apellidos << '\n';
            cout << "Carrera: " << estudiante.carrera << '\n';
            return true;
        }
    }

    return false;
}

// struct no es poo solo son colecciones de datos
struct Profesor {
    int carnet;
    int seccion;
    string nombre;
    string apellidos;
    string carrera;
};

bool buscar(const vector<Profesor>& lista, int carnet, int seccion, string nombre, string apellidos, string carrera) {
    for (const Profesor& profesor : lista) {
        cout << "Nombre: " << profesor.nombre << " "
                << profesor.apellidos << '\n';
                cout << "Seccion: " << profesor.seccion << '\n';
                cout << "Carrera: " << profesor.carrera << '\n';
            if (profesor.carnet == carnet && profesor.seccion == seccion && profesor.nombre == nombre && profesor.apellidos == apellidos && profesor.carrera == carrera) {
                return true;}
    }
    return false;
}

// base para poo en c++
class Asignaturas {
private:
    int seccion; // tipo de asignatura
    int cantEstudiantes;
    int cantProfesores;
    int cantAsignaturas;
    int cupo;
    int sobreCupo;
    string nombre;
    string codigo;

public:
    Asignaturas(int seccion, int cantEstudiantes, int cantProfesores, int cantAsignaturas, int cantAsingaturas, int cupo, int sobreCupo, string nombre, string codigo) 
        : seccion(seccion), cantEstudiantes(cantEstudiantes), cantProfesores(cantProfesores), cantAsignaturas(cantAsignaturas), cupo(cupo), sobreCupo(sobreCupo), nombre(nombre), codigo(codigo) {}
    int getSeccion() const {
        return seccion;
    }
    void mostrar() const {
        cout << "Seccion " << seccion << '\n';
        cout << "Cantidad de estudiantes: " << cantEstudiantes << '\n';
        cout << "Cantidad de profesores: " << cantProfesores << '\n';
        cout << "Cantidad de asignaturas: " << cantAsignaturas << '\n';
        cout << "Cupo: " << cupo << '\n';
        cout << "Sobre Cupo: " << sobreCupo << '\n';
        cout << "Nombre: " << nombre << '\n';
        cout << "Codigo: " << codigo << '\n';
    }
};

int main() {
    vector <Estudiante> lista = {
    // Agregar estudiantes a la lista
        {1, "Juan", "perez", "Ingenieria"},
        {2, "Roberto", "Gonzales", "Quimica"},
        {3, "Maria", "Rodriguez", "Quimica"},
    };
    
    int opcion;
    do {
        std :: cout << "=============================================" << std :: endl;
        std :: cout << "Bienvenido al sistema de registro." << std :: endl;
        std :: cout << "=============================================" << std :: endl;
        std :: cout << "1. Registrar estudiante." << std :: endl;
        std :: cout << "2. Buscar estudiante." << std :: endl;
        std :: cout << "3. Actualizar estudiante." << std :: endl;
        std :: cout << "4. Eliminar estudiante." << std :: endl;
        std :: cout << "5. Mostrar todos los estudiantes." << std :: endl;
        std :: cout << "6. Generar reporte." << std :: endl;
        std :: cout << "7. Salir." << std :: endl;
    } while( opcion == 7);

    switch (opcion) {
        case 1:
            if (opcion == 1) {
                // Lógica para registrar estudiante
            }
            break;
        case 2:
            if (opcion == 2) {
                std :: cout << "Digite el ID a buscar: ";
                int id;
                cin >> id;

                if (!buscar(lista, id)) {
                    std :: cout << "Estudiante no encontrado." << std :: endl;
                }
            }
            return 0;

            break;
        case 3:
            if (opcion == 3) {
                // Lógica para actualizar estudiante
            }
            break;
        case 4:
            if (opcion == 4) {
                // Lógica para eliminar estudiante
            }
            break;
        case 5:
            if (opcion == 5) { 
                // Lógica para mostrar todos los estudiantes
            }
            break;
        case 6:
            if (opcion == 6) {
                // Lógica para generar reporte   
            }  
            break;
        case 7:
            if (opcion == 7) {
                std :: cout << "Saliendo del programa." << std :: endl;
            }
            break;
        default:
            std :: cout << "Opción inválida. Por favor, seleccione una opción válida." << std :: endl;
            break;
    }

} // main
