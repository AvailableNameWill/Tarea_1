package com.example.tarea_1.clase;

public class Operaciones {
    private double valor1, valor2;
    private double sum, res, mult, div;

    public Operaciones(){

    }

    public Operaciones(Double result){
        res = result;
    }

    public double suma(double n1, double n2){
        res = n1 + n2;
        return res;
    }

    public double resta(double n1, double n2){
        if(n1 > n2){
            res = n1 - n2;
            return  res;
        }else return res=0;
    }

    public double multiplicacion(double n1, double n2){
        res = n1 * n2;
        return res;
    }

    public double division(double n1, double n2){
        if(n1 > n2){
            res = n1 / n2;
        }
        return res;
    }
}
