/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author nahuel
 */
public class Calculadora {
    private int[] arregloInt;
    
    public void crearArreglo(int[] arreglo){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arreglo.length; i++){
            System.out.println("Ingrese valor pos: " + i);
            arreglo[i] = scanner.nextInt();
        }
        visualizarArreglo(arreglo);
    }
    
    public void visualizarArreglo(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++){
            System.out.println("posicion: " + i + " valor: "+ arreglo[i]);
        }
    }
    
    public void calcularMayor(int[] arreglo){
        int resultado = 0;
        for(int i = 0; i < arreglo.length; i++){ 
            if(arreglo[i] > resultado){
            resultado = arreglo[i];
            }
        }
        System.out.println("El mayor es: " + resultado);
    }
    
    public void promediarArreglo(int[] arreglo){
        double sumador = 0.0;
        double promedio;
        for (int i = 0; i < arreglo.length; i++){
            sumador = sumador + arreglo[i];
        }
        promedio = ((double)sumador) / arreglo.length;
        System.out.println("El promedio es: " + promedio);
    }
    
    public void resolverProductoriaB(int n){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);//reconoce .(punto) como decimal sin oblegar a ingreasr la coma
        double resultado = 1.0;
        double x = 0.0;
        double y = 0.0;
        System.out.println("Ingrese x: ");
        x = scanner.nextDouble();
        System.out.println("Ingrese y: ");
        y = scanner.nextDouble();
        for (int i = 1;i <= n; i++){
            resultado = resultado * ((Math.pow(x, i) + y) / i);
        }
        System.out.println("La productoria es: " + resultado);
    }
    
    public void ordenarArreglo(int[] arreglo){
        int aux;
        for (int i = 0; i < arreglo.length -1 ; i++){
            for(int j = i + 1; j < arreglo.length; j++){
                if(arreglo[j] < arreglo[i]){ // Si el elemento j es menor que el menor:
                    aux = arreglo[i]; // Se intercambian los elementos
                    arreglo[i] = arreglo[j]; // de las posiciones i y menor
                    arreglo[j] = aux; // usando una variable auxiliar. 
                }   
            }
        }
        visualizarArreglo(arreglo);
    }
    
    public void administrarOpciones(){
        int opcion;
        do{
            System.out.println("********Menu Calculadora**********");
            System.out.println("Seleccione el Calculo que desee realizar: ");
            System.out.println("1) Mayor");
            System.out.println("2) Promedio");
            System.out.println("3) Calcular productoria");
            System.out.println("4) Eliminar arreglo");
            System.out.println("5) Visualizar arreglo");
            System.out.println("6) Ordenar arreglo");
            System.out.println("0) Salir de Calculadora.....");
            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextInt();
            if ((opcion == 1 || opcion == 2) && arregloInt == null){
                System.out.println("Cantidad de numeros a analizar:");
                int tamaño = scanner.nextInt();
                arregloInt = new int[tamaño];
                crearArreglo(arregloInt);                           
            }
            switch (opcion){
                case 1:{
                    calcularMayor(arregloInt);
                }break;
                case 2:{
                    promediarArreglo(arregloInt);
                }break;
                case 3:{
                    System.out.println("ingrese valor n");
                    int hasta = scanner.nextInt();
                    resolverProductoriaB(hasta);
                }break;
                case 4:{
                    arregloInt = null;
                }break;
                case 5:{
                    if (arregloInt != null){
                        visualizarArreglo(arregloInt);
                    }
                    if (arregloInt == null){
                        System.out.println("Debe cargar un arreglo");
                    }                    
                }break;
                case 6:{
                    if (arregloInt != null){
                        ordenarArreglo(arregloInt);
                    }
                    if (arregloInt == null){
                        System.out.println("Debe crear un arreglo");
                    }
                }break;
                case 10:{//arreglo1 test
                    arregloInt = new int[5];
                    arregloInt[0] = 2;
                    arregloInt[1] = 3;
                    arregloInt[2] = 7;
                    arregloInt[3] = 17;
                    arregloInt[4] = 23;
                }break;
                case 11:{//arreglo2 test
                    arregloInt = new int [3];
                    arregloInt[0] = 1;
                    arregloInt[1] = 3;
                    arregloInt[2] = 7;
                }break;
                default:{
                    System.out.println("Saliendo de la aplicacion.....");
                }
            }
        }while (opcion != 0);
    }
    
    public int[] getArregloInt() {
        return arregloInt;
    }

    public void setArregloInt(int[] arregloInt) {
        this.arregloInt = arregloInt;
    }
}
