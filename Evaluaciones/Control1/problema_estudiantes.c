#include<stdio.h>

typedef struct ddmmaaaa{
    int dia;
    int mes;
    int anho;
}fecha;

typedef struct alumno{
    char nombre[20];
    fecha nacimiento;
    char carrera[20];
    int ingreso;
}estudiante;

typedef struct curso{
    char nombre[20];
    fecha inicio_clases;
    estudiante inscrito;
}asignatura;

void ingresar_datos_fecha(fecha *f){
    printf("Ingresar dia (1-31): ");
    scanf("%d", &f->dia);
    printf("Ingresar mes (1-12): ");
    scanf("%d", &f->mes);
    printf("Ingresar anho (1900 - 2022): ");
    scanf("%d", &f->anho);
}

void mostrar_datos_fecha(fecha f){
    printf("[%d/%d/%d]", f.dia, f.mes, f.anho);
}

void ingresar_datos_estudiante(estudiante *e){
    printf("Ingresar el nombre del estudiante: ");
    scanf("%s", e->nombre);
    ingresar_datos_fecha(&e->nacimiento);
    printf("Ingresar la carrera: ");
    scanf("%s", e->carrera);
    printf("Ingresar el anho ingreso: ");
    scanf("%d", &e->ingreso);
}

void mostrar_datos_estudiante(estudiante e){
    printf("Estudiante: %s nacido el: ", e.nombre);
    mostrar_datos_fecha(e.nacimiento);
    printf(" Carrera: %s [%d]", e.carrera, e.ingreso);
}

void ingresar_datos_asignatura(asignatura *a){
    printf("Ingresar nombre de la asignatura: ");
    scanf("%s", a->nombre);
    ingresar_datos_fecha(&a->inicio_clases);
    ingresar_datos_estudiante(&a->inscrito);
}

void mostrar_datos_asignatura(asignatura a){
    printf("\nNombre de la Asignatura: %s \nFecha de Nacimiento: ", a.nombre);
    mostrar_datos_fecha(a.inicio_clases);
    printf("\nInscrito: ");
    mostrar_datos_estudiante(a.inscrito);
    printf("\n\n");
}

int main(){
    asignatura ramo;
    ingresar_datos_asignatura(&ramo);
    mostrar_datos_asignatura(ramo);
}