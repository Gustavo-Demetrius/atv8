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
public class Faturamento {

    /**
    GUSTAVO DEMETRIUS DOS SANTOS RGM: 11211102302
    LUCAS DOS SANTOS REIS RGM: 11211100722
     */
    public static void main(String[] args) {
        
    //PADARIA DO JUBILEU
    
    double faturamento_total;
    
    Produto p1 = new Produto("Pão",1,5,0.50); //Ordem: descrição, Código, Quantidade, R$Valor
    p1.calculartotal();
    
    Produto p2 = new Produto("Mortadela",2,0.220,25); 
    p2.calculartotal();
    
    Produto p3 = new Produto("Mussarela",3,0.220,25);
    p3.calculartotal();
    
    Produto p4 = new Produto("Apresuntado",4,0.220,25);
    p4.calculartotal();
    
    Produto p5 = new Produto("Carolina",5,0.220,25);
    p5.calculartotal();
    
    Produto p6 = new Produto("Coca-Cola 3L",6,2,7);
    p6.calculartotal();
    
    p1.calculartotal();
    p2.calculartotal();
    p3.calculartotal();
    p4.calculartotal();
    p5.calculartotal();
    p6.calculartotal();
   
    
    System.out.println("Preço:"+p1.Gettotal_Vendas());
    System.out.println("Preço:"+p2.Gettotal_Vendas());
    System.out.println("Preço:"+p3.Gettotal_Vendas());
    System.out.println("Preço:"+p4.Gettotal_Vendas());
    System.out.println("Preço:"+p5.Gettotal_Vendas());
    System.out.println("Preço:"+p6.Gettotal_Vendas());
    
    faturamento_total = p1.Gettotal_Vendas() + p2.Gettotal_Vendas() + p3.Gettotal_Vendas() + p4.Gettotal_Vendas() + p5.Gettotal_Vendas() + p6.Gettotal_Vendas();
    
    System.out.println("O preço total das compras foi de: " + faturamento_total);
    
    }
    
}
