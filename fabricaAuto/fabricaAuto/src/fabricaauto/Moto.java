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
// aqui faremos o mesmo procedimento da classe carro
public class Moto extends Automovel {
    
    private int freioAbs;
    private int bau;
    
    //construtor padrao
    
    public Moto(){
        super();
    }
    
    //getters e setters com validaçao
    
    public int getFreioAbs(){
        return freioAbs;
    }
    public void setFreioAbs(int freioAbs){
        
        try{
            if(freioAbs != 0 && freioAbs != 1){
                throw new IllegalArgumentException("Valor dos freioAbs deve ser 0 ou 1");
            }
            this.freioAbs = freioAbs;
        }catch(IllegalArgumentException e){
            System.out.println("Erro" + e.getMessage());
        }
    }
    public int getBau(){
        return bau;
    }
    public void setBau(int bau){
        try{
            if(bau!= 0 && bau !=1){
                throw new IllegalArgumentException("Valor do bau deve der 0 ou 1");
            }
            this.bau=bau;
        }catch(IllegalArgumentException e){
            System.out.println("Erro" + e.getMessage());
        }
    }
    // metod para tratamento de exeçoes
    public void alarme(){
        try{
            System.out.println("Alarme ligado");
        }catch(Exception e){
            System.out.println("Erro ao ativar alarme" + e.getMessage());
        }
    }
    //sobrescrevendo para exibir informaçoes especificas
    
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Tipo Moto");
        System.out.println("Freios Abs: " + (freioAbs ==1 ? "Sim" : " Nao"));
        System.out.println("Bau; " + (bau == 1 ? "Sim" : "Nao"));
        System.out.println("-------------------------");
    }
}
