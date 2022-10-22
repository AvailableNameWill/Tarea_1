package com.example.tarea_1.clase;

public class Operaciones {
    private double res;

    public Operaciones(){}

    public Operaciones(Double result){
        res = result;
    }

    public double suma(double n1, double n2){
        res = n1 + n2;
        return res;
    }

    public double resta(double n1, double n2){
        res = n1 - n2;
        return  res;
    }

    public double multiplicacion(double n1, double n2){
        res = n1 * n2;
        return res;
    }

    public double division(double n1, double n2){
        if(n1 >= n2){
            res = n1 / n2;
            return res;
        } else return res = -1;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }
}
