Algoritmo vectores
	Definir vnombres Como Caracter;
	Definir tam, i Como Entero;
	
	tam=4;
	Dimension vnombres(tam);
	
	vnombres[0]="Juan;45";
	vnombres[1]="Pepe;89";
	vnombres[2]="Cosa;1";
	vnombres[3]="Manuel;77";
	vnombres[2]="";
	Para i=0 Hasta tam-1 Con Paso 1 Hacer
		Si vnombres[i]<>"" Entonces
			Escribir vnombres[i];
		FinSi
		
	Fin Para
	
FinAlgoritmo
