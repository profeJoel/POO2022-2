#include<stdio.h>

int cantidad_letras(char cadena[]){
  int i;
  for(i=0; cadena[i]!='\0'; i++);

  return i;
}

int cantidad_letras_recursiva(char cadena[], int i){
  if(cadena[i] == '\0')
    return i;
  else
    return cantidad_letras_recursiva(cadena, i+1);
}

int main(){
  char palabra[10];
  printf("Ingrese una palabra: ");
  scanf("%s", palabra);

  //int cantidad = cantidad_letras(palabra);
  int cantidad = cantidad_letras_recursiva(palabra,0);

  printf("La cantidad de letras de <%s> es <%d>\n", palabra, cantidad);
}