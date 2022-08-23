#include<stdio.h>


typedef struct coche{
  char marca[20];
  char modelo[20];
  int anho;
} vehiculo;

void ingresar_auto(vehiculo *a){
  printf("Ingrese Marca: ");
  scanf("%s", a->marca);
  printf("Ingrese Modelo: ");
  scanf("%s", a->modelo); 
  printf("Ingrese Año: ");
  scanf("%d", &a->anho); 
}

void mostrar_auto(vehiculo a){
  printf("El vehiculo es un %s %s del %d\n", a.marca, a.modelo, a.anho);
}

int main(int argc, char const *argv[])
{
  printf("%s\n", argv[1]);
  
  int i;
  vehiculo lista[3];

  for(i=0; i<3; i++)
    ingresar_auto(&lista[i]);

  for(i=0; i<3; i++)
    mostrar_auto(lista[i]);

  return 0;
}