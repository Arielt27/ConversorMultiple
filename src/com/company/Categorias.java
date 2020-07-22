package com.company;

import java.util.ArrayList;

public class Categorias
{
    // ATRIBUTOS
    private int index = 0;
    private String medida;
    public ArrayList<Medida> Medidas = new ArrayList<>();


    // CONSTRUCTOR
    public Categorias(int i, String medida)
    {
        index = i;
        this.medida = medida;
    }

    // GET Y SET
    public int getIndex()
    {
        return index;
    }

    public void setIndex(int index)
    {
        this.index = index;
    }

    public String getMedida()
    {
        return medida;
    }

    public void setMedida(String medida)
    {
        this.medida = medida;
    }

    public ArrayList<Medida> getMedidas()
    {
        return Medidas;
    }

    public void setMedidas(ArrayList<Medida> medidas)
    {
        Medidas = medidas;
    }

    // METODO TO STRING
    @Override
    public String toString()
    {
        return medida;
    }
}