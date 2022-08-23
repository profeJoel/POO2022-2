#include<stdio.h>

void mostrar_vector(int v[], int n){
  int i;
  printf("[ ");
  for(i=0; i<n; i++)
    printf("%d, ", v[i]);
  printf("]\n");
}

void invertir_orden_vector(int v[], int n){
  int i, f, aux;
  for(i=0, f=n-1; i<=f; i++, f--){
    aux = v[i];
    v[i] = v[f];
    v[f] = aux;
  }
}

void invertir_orden_vector_recursivo(int v[], int i, int f){
  if(i<=f){
    int aux;
    aux = v[i];
    v[i] = v[f];
    v[f] = aux;
    invertir_orden_vector_recursivo(v, i+1, f-1);
  }
}


int main(){
  int n, i, f;

  printf("Ingrese el tamaño del vector: ");
  scanf("%d", &n);

  int v[n];
  for(i=0; i<n; i++){
    printf("Ingrese el valor de la posicion [%d]: ", i);
    scanf("%d", &v[i]);
  }

  mostrar_vector(v, n);
  //invertir_orden_vector(v, n);
  invertir_orden_vector_recursivo(v, 0, n-1);

  mostrar_vector(v, n);
}