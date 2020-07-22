package com.company;

public class Medida
{
    // ATRIBUTOS
    protected int valor = 0;
    protected int conversion = 0;
    protected String[] medida;


    // CONSTUCTOR
    public  Medida(int i, String celcius){}


    // GET Y SET
    public int getValor()
    {
        return valor;
    }

    public void setValor(int valor)
    {
        this.valor = valor;
    }

    public int getConversion()
    {
        return conversion;
    }

    public void setConversion(int conversion)
    {
        this.conversion = conversion;
    }

    public String[] getMedida()
    {
        return medida;
    }

    public void setMedida(String[] medida)
    {
        this.medida = medida;
    }
}
