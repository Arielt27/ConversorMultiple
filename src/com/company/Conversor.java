package com.company;
import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;


public class Conversor extends JFrame
{
    // ATRIBUTOS
    private JPanel PanelPrincipal;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JTextField textField1;
    private JButton convButton;
    private JTextField textField2;
    private ArrayList<Categorias> Category = new ArrayList<>();

    Peso Pesos = new Peso();
    Distancia Distancias = new Distancia();
    Temperatura Temperaturas = new Temperatura();

    public void Application()
    {
        Category.add(new Categorias(1, "Peso"));
        Category.add(new Categorias(2, "Distancia"));
        Category.add(new Categorias(3, "Temperatura"));

        Category.get(1).Medidas.add(new Medida(1, "Onzas"));
        Category.get(1).Medidas.add(new Medida(2, "Litros"));
        Category.get(1).Medidas.add(new Medida(3, "Mililitros"));


        DefaultComboBoxModel<Categorias> Primerselect = new DefaultComboBoxModel<>();
        Primerselect.addAll(Category);

        comboBox1.setModel(Primerselect);

        comboBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange()== ItemEvent.SELECTED){
                    Categorias Select = (Categorias) comboBox1.getSelectedItem();
                    DefaultComboBoxModel Segundoselect = new DefaultComboBoxModel();
                    Segundoselect.addAll (Select.Medidas);
                    comboBox2.setModel(Segundoselect);
                    DefaultComboBoxModel Tercerselect = new DefaultComboBoxModel();
                    Tercerselect.addAll(Select.Medidas);
                    comboBox3.setModel(Tercerselect);

                }
            }
        });
    }

    public static void main(String[] args)
    {
        JFrame App = new JFrame();

        App.setContentPane(new Conversor().PanelPrincipal);

        App.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        App.pack();

        App.setVisible(true);
    }

    private void createUIComponents()
    {
        //
    }
}