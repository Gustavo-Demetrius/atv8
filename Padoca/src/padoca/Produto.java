/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padoca;

/**
 *
 * @author alunocmc
 */
public class Produto {
    
    //variaveis
    String descricao;
    int codigo;
    double valor_unit, qtd_vendida;
    private double total_vendas;
    
    
    //metodo construtor
    public Produto(String descricao, int codigo, double qtd_vendida, double valor_unit) {
    
    this.descricao = descricao;
    this.codigo = codigo;
    this.qtd_vendida = qtd_vendida;
    this.valor_unit = valor_unit;   
    
    }
   
    //Get's
    public String GetDescricao(){
    return descricao;
    }
    
    public int GetCodido(){
    return codigo;
    }
    
    public double Getqtd_vendida(){
    return qtd_vendida;
    }
    
    public double Getvalor_unit(){
    return valor_unit;
    }
    
    public double Gettotal_Vendas(){
    return total_vendas;
    }
    
    //Set's
    public void SetDescricao(String descricao){
    this.descricao = descricao;
    }
    
    public void SetCodigo(int Codigo){
    this.codigo = codigo;
    }
    
    public void SetQtd_vendida(double qtd_vendida){
    this.qtd_vendida = qtd_vendida;
    }
    
    public void SetValor_unit(double valor_unit){
    this.valor_unit = valor_unit;
    }
    
    public void SetTotal_vendas(double Total_vendas){
    this.total_vendas = total_vendas;
    }
    
    public void calculartotal(){
    total_vendas = valor_unit * qtd_vendida;
    }
    
}
