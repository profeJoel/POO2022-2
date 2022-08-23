#include<stdio.h>

typedef struct ddmmaaaa{
    int dia;
    int mes;
    int anho;
}fecha;

typedef struct animal{
    char nombre[20];
    char especie[20];
    char raza[20];
    fecha nacimiento;
}mascota;

typedef struct amo{
    char nombre[20];
    fecha nacimiento;
    char ciudad[20];
    mascota mi_mascota;
}duenho;

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

void ingresar_datos_mascota(mascota *m){
    printf("Ingresar el nombre de la mascota: ");
    scanf("%s", m->nombre);
    printf("Ingresar la especie: ");
    scanf("%s", m->especie);
    printf("Ingresar la raza: ");
    scanf("%s", m->raza);
    ingresar_datos_fecha(&m->nacimiento);
}

void mostrar_datos_mascota(mascota m){
    printf("Mascota: %s de especie %s y raza %s, nacido el: ", m.nombre, m.especie, m.raza);
    mostrar_datos_fecha(m.nacimiento);
}

void ingresar_datos_duenho(duenho *d){
    printf("Ingresar nombre del duenho: ");
    scanf("%s", d->nombre);
    ingresar_datos_fecha(&d->nacimiento);
    printf("Ingresar ciudad: ");
    scanf("%s", d->ciudad);
    ingresar_datos_mascota(&d->mi_mascota);
}

void mostrar_datos_duenho(duenho d){
    printf("\nNombre del Duenho: %s \nFecha de Nacimiento: ", d.nombre);
    mostrar_datos_fecha(d.nacimiento);
    printf("\nCiudad: %s \nMascota: ", d.ciudad);
    mostrar_datos_mascota(d.mi_mascota);
    printf("\n\n");
}

int main(){
    duenho persona1;
    ingresar_datos_duenho(&persona1);
    mostrar_datos_duenho(persona1);
}