/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaauto;

/**
 *
 * @author Lucas-Daniel
 */
// aqui sera feita a classe carro com o extends

public class Carro extends Automovel {
    private int tetoSolar;
    private int aberto;
    
    //contrutor padrao
    
    public Carro(){
        super();
        this.aberto =0;
    }
    //getters e setters com validaçao
    
    public int gettetoSolar(){
        return tetoSolar;
    }
    public void setTetoSolar( int tetoSolar) {
        try{
            if(tetoSolar != 0 && tetoSolar != 1) {
                throw new IllegalArgumentException("O valaor de ser 0 ou 1");
                
            }
            this.tetoSolar= tetoSolar;
        }catch(IllegalArgumentException e){
            System.out.println("Erro" + e.getMessage());
        }
    }
    public int getAberto(){
        return aberto;
    }
    public void setAberto( int aberto){
        try{
            if(aberto!= 0 && aberto != 1){
                throw new IllegalArgumentException("O valor de ser 0 ou 1");
            }
            this.aberto = aberto;
        }catch(IllegalArgumentException e){
            System.out.println("Erro" + e.getMessage());
        }
        
    }
    
    //este e o metodo especifico da classe com tratamento de exeçoes
    
    public void abrirFechar() {
        try{
            if(this.aberto == 0){
                this.aberto = 1;
                System.out.println("carro aberto");
                
            }else{
                this.aberto = 0;
                System.out.println("carro fechado");
            }
        } catch (Exception e){
            System.out.println("Erro ao abrir e fechar o carro" + e.getMessage());
        }
    }
     //sobrescrevendo para exibir informaçoes especificas do carro
    @Override
    public void exibirInformacoes(){
        
        super.exibirInformacoes();
        System.out.println("Tipo: Carro");
        System.out.println("Teto Solar: " + (tetoSolar == 1 ? "Sim" : "Nao"));
        System.out.println("Aberto: " + (aberto ==1 ? "Sim" : "Nao"));
        System.out.println("-----------------------");
    }
}

    
    
    

