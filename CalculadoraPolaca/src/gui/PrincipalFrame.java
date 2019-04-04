/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import exceptiones.FaltaParentesisEx;
import exceptiones.IniciaConOperadorEx;
import exceptiones.OperadorPegadoEx;
import exceptiones.ParentesisCierreEx;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import objetos.Funcion;

/**
 *
 * @author Victor
 */
public class PrincipalFrame extends JFrame{
    private Funcion funcion;
    private JPanel pnlCuadro;
    private JButton btnX;
    private JButton btnA;
    private JButton btnW;
    private JButton btnB;
    private JButton btnY;
    private JButton btnZ;
    private JButton btnMult;
    private JButton btnSuma;
    private JButton btnResta;
    private JButton btnDiv;
    private JButton btnPoten;
    private JButton btnParIz;
    private JButton btnParDer;
    private JButton btnIgual;
    private JButton btnDel;
    private JButton btnAC;
    private JPanel pnlEntrada;
    private JPanel pnlSalida;
    private JPanel pnlresultados;
    private JTextArea lblEntrada;
    private JLabel lblSalida;
    private Funcion lista;
    public PrincipalFrame(){
        super("Calculadora");
        super.setSize(500,500);
        super.setLayout(new BorderLayout());
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pnlCuadro=new JPanel(new GridLayout(4,4));
        pnlCuadro.setPreferredSize(new Dimension(480,365));
        pnlEntrada=new JPanel(new BorderLayout());
        pnlEntrada.setBackground(Color.decode("#A9F5F2"));
        pnlEntrada.setBorder(BorderFactory.createTitledBorder("Funcion: "));
        pnlSalida=new JPanel(new BorderLayout());
        pnlSalida.setBackground(Color.decode("#FBFBEF"));
        pnlSalida.setBorder(BorderFactory.createTitledBorder("Resultado: "));
        pnlresultados=new JPanel(new GridLayout(2,0));
        pnlresultados.setPreferredSize(new Dimension(0,80));
        pnlresultados.add(pnlEntrada,BorderLayout.NORTH);
        pnlresultados.add(pnlSalida,BorderLayout.SOUTH);
        lblEntrada=new JTextArea();
        lblEntrada.setEditable(false);
        lblEntrada.setFont(new Font("Times New Roman",8,16));
        lblSalida=new JLabel();
        lblSalida.setFont(new Font("Times New Roman",8,16));
        pnlSalida.add(lblSalida);
        pnlEntrada.add(lblEntrada);
        lista = new Funcion();
        btnA=new JButton("A");
        btnA.setFont(new Font("Goudy Old Style",5,22));
        btnA.setForeground(Color.decode("#FBFBEF"));
        btnA.setBackground(Color.decode("#A4A4A4"));
        btnA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    lista.insertarValores('A');
                } catch (IniciaConOperadorEx ex) {
                    IniciaOper(ex);
                } catch (OperadorPegadoEx ex) {
                    OperadorPeg(ex);
                }
                lblEntrada.setText(lista.dato());
            }
        });
        
        btnB=new JButton("B");
        btnB.setFont(new Font("Goudy Old Style",5,22));
        btnB.setForeground(Color.decode("#FBFBEF"));
        btnB.setBackground(Color.decode("#A4A4A4"));
        btnB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    lista.insertarValores('B');
                } catch (IniciaConOperadorEx ex) {
                    IniciaOper(ex);
                } catch (OperadorPegadoEx ex) {
                    OperadorPeg(ex);
                }
                lblEntrada.setText(lista.dato());
            }
        });
        btnW=new JButton("W");
        btnW.setFont(new Font("Goudy Old Style",5,22));
        btnW.setForeground(Color.decode("#FBFBEF"));
        btnW.setBackground(Color.decode("#A4A4A4"));
        btnW.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    lista.insertarValores('W');
                }catch (IniciaConOperadorEx ex) {
                    IniciaOper(ex);
                } catch (OperadorPegadoEx ex) {
                    OperadorPeg(ex);
                }
                lblEntrada.setText(lista.dato());
            }
        });
        btnX=new JButton("X");
        btnX.setFont(new Font("Goudy Old Style",5,22));
        btnX.setForeground(Color.decode("#FBFBEF"));
        btnX.setBackground(Color.decode("#A4A4A4"));
        btnX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    lista.insertarValores('X');
                } catch (IniciaConOperadorEx ex) {
                    IniciaOper(ex);
                } catch (OperadorPegadoEx ex) {
                    OperadorPeg(ex);
                }
                lblEntrada.setText(lista.dato());
            }
        });
        btnY=new JButton("Y");
        btnY.setFont(new Font("Goudy Old Style",5,22));
        btnY.setForeground(Color.decode("#FBFBEF"));
        btnY.setBackground(Color.decode("#A4A4A4"));
        btnY.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    lista.insertarValores('Y');
                } catch (IniciaConOperadorEx ex) {
                    IniciaOper(ex);
                } catch (OperadorPegadoEx ex) {
                    OperadorPeg(ex);
                }
                lblEntrada.setText(lista.dato());
            }
        });
        btnZ=new JButton("Z");
        btnZ.setFont(new Font("Goudy Old Style",5,22));
        btnZ.setForeground(Color.decode("#FBFBEF"));
        btnZ.setBackground(Color.decode("#A4A4A4"));
        btnZ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    lista.insertarValores('Z');
                } catch (IniciaConOperadorEx ex) {
                    IniciaOper(ex);
                } catch (OperadorPegadoEx ex) {
                    OperadorPeg(ex);
                }
                lblEntrada.setText(lista.dato());
            }
        });
        btnAC=new JButton("AC");
        btnAC.setFont(new Font("Goudy Old Style",5,22));
        btnAC.setForeground(Color.decode("#FBFBEF"));
        btnAC.setBackground(Color.decode("#A4A4A4"));
        btnAC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lista.borrar();
                lblEntrada.setText(lista.dato());
                lblSalida.setText("");
            }
        });
        btnDel= new JButton("DEL");
        btnDel.setFont(new Font("Goudy Old Style",5,22));
        btnDel.setForeground(Color.decode("#FBFBEF"));
        btnDel.setBackground(Color.decode("#A4A4A4"));
        btnDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lista.eliminar();
                lblEntrada.setText(lista.dato());
            }
        });
        btnDiv=new JButton("/");
        btnDiv.setFont(new Font("Goudy Old Style",5,22));
        btnDiv.setForeground(Color.decode("#FBFBEF"));
        btnDiv.setBackground(Color.decode("#A4A4A4"));
        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    lista.insertarValores('/');
                } catch (IniciaConOperadorEx ex) {
                    IniciaOper(ex);
                } catch (OperadorPegadoEx ex) {
                    OperadorPeg(ex);
                }
                lblEntrada.setText(lista.dato());
            }
        });
        btnMult=new JButton("*");
        btnMult.setFont(new Font("Goudy Old Style",5,22));
        btnMult.setForeground(Color.decode("#FBFBEF"));
        btnMult.setBackground(Color.decode("#A4A4A4"));
        btnMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    lista.insertarValores('*');
                } catch (IniciaConOperadorEx ex) {
                    IniciaOper(ex);
                } catch (OperadorPegadoEx ex) {
                    OperadorPeg(ex);
                }
                lblEntrada.setText(lista.dato());
            }
        });
        btnSuma=new JButton("+");
        btnSuma.setFont(new Font("Goudy Old Style",5,22));
        btnSuma.setForeground(Color.decode("#FBFBEF"));
        btnSuma.setBackground(Color.decode("#A4A4A4"));
        btnSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    lista.insertarValores('+');
                } catch (IniciaConOperadorEx ex) {
                    IniciaOper(ex);
                } catch (OperadorPegadoEx ex) {
                    OperadorPeg(ex);
                }
                lblEntrada.setText(lista.dato());
            }
        });
        btnResta=new JButton("-");
        btnResta.setFont(new Font("Arial",5,28));
        btnResta.setForeground(Color.decode("#FBFBEF"));
        btnResta.setBackground(Color.decode("#A4A4A4"));
        btnResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    lista.insertarValores('-');
                } catch (IniciaConOperadorEx ex) {
                    IniciaOper(ex);
                } catch (OperadorPegadoEx ex) {
                    OperadorPeg(ex);
                }
                lblEntrada.setText(lista.dato());
            }
        });
        btnParDer=new JButton("(");
        btnParDer.setFont(new Font("Goudy Old Style",5,22));
        btnParDer.setForeground(Color.decode("#FBFBEF"));
        btnParDer.setBackground(Color.decode("#A4A4A4"));
        btnParDer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    lista.insertarValores('(');
                } catch (IniciaConOperadorEx ex) {
                    IniciaOper(ex);
                } catch (OperadorPegadoEx ex) {
                    OperadorPeg(ex);
                }
                lblEntrada.setText(lista.dato());
            }
        });
        btnParIz=new JButton(")");
        btnParIz.setFont(new Font("Goudy Old Style",5,22));
        btnParIz.setForeground(Color.decode("#FBFBEF"));
        btnParIz.setBackground(Color.decode("#A4A4A4"));
        btnParIz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    lista.insertarValores(')');
                } catch (IniciaConOperadorEx ex) {
                    IniciaOper(ex);
                } catch (OperadorPegadoEx ex) {
                    OperadorPeg(ex);
                }
                lblEntrada.setText(lista.dato());
            }
        });
        btnPoten=new JButton("^");
        btnPoten.setFont(new Font("Goudy Old Style",5,22));
        btnPoten.setForeground(Color.decode("#FBFBEF"));
        btnPoten.setBackground(Color.decode("#A4A4A4"));
        btnPoten.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    lista.insertarValores('^');
                } catch (IniciaConOperadorEx ex) {
                    IniciaOper(ex);
                } catch (OperadorPegadoEx ex) {
                    OperadorPeg(ex);
                }
                lblEntrada.setText(lista.dato());
            }
        });
        btnIgual=new JButton("=");
        btnIgual.setFont(new Font("Goudy Old Style",5,22));
        btnIgual.setForeground(Color.decode("#FBFBEF"));
        btnIgual.setBackground(Color.decode("#A4A4A4"));
        btnIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(lista.buscarParentesisCierre()%2!=0){
                        throw new ParentesisCierreEx();
                    }
                    lblSalida.setText(lista.convertirApostfija());
                }catch(ParentesisCierreEx ex){
                    FaltaParenCierr(ex);
                }
                
            }
        });
        //-----------------------------------
        pnlCuadro.add(btnA);
        pnlCuadro.add(btnB);
        
        pnlCuadro.add(btnDel);
        pnlCuadro.add(btnAC);
        pnlCuadro.add(btnX);
        pnlCuadro.add(btnY);
        pnlCuadro.add(btnDiv);
        pnlCuadro.add(btnMult);
        pnlCuadro.add(btnZ);
        pnlCuadro.add(btnW);
        pnlCuadro.add(btnSuma);
        pnlCuadro.add(btnResta);
        pnlCuadro.add(btnParDer);
        pnlCuadro.add(btnParIz);
        pnlCuadro.add(btnPoten);
        pnlCuadro.add(btnIgual);
        
        
        super.add(new JScrollPane(pnlresultados),BorderLayout.NORTH);
        super.add(new JScrollPane(pnlCuadro),BorderLayout.CENTER);
        super.setVisible(true);
    }
    public void IniciaOper(IniciaConOperadorEx ex){
        JOptionPane.showMessageDialog(this,"Inicia Operador","Error",JOptionPane.ERROR_MESSAGE);
    }
    public void OperadorPeg(OperadorPegadoEx ex){
        JOptionPane.showMessageDialog(this,"Operador consecutivo","Error",JOptionPane.ERROR_MESSAGE);
    }
    public void FaltaParenIn(FaltaParentesisEx ex){
        JOptionPane.showMessageDialog(this,"Falta Parentesis de Inicio","Error",JOptionPane.ERROR_MESSAGE);
    }
    public void FaltaParenCierr(ParentesisCierreEx ex){
        JOptionPane.showMessageDialog(this,"Falta Parentesis de cierre","Error",JOptionPane.ERROR_MESSAGE);
    }
}
