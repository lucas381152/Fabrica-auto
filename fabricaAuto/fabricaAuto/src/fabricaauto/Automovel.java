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
public class Automovel {
  // aqui começo crindo as variaveis com o modo private
    //para nao ser editado externamente
    private String cor;
    private String placa;
    private String modelo;
    private int ligado;
    private int emMovimento;
    
    // construtor padrao
    
    public Automovel(){
        this.ligado =0;
        this.emMovimento =0;
    }
    
    //aqui fasso a inserçao dos metodos get e set
    
    public String getCor() {
        return cor;
        
    }
    public void setCor(String cor){
        try{
            if (cor == null || cor.trim().isEmpty()){
                throw new IllegalArgumentException("A cor do veiculo nao pode ser vazia");
            }
            this.cor = cor;
        }catch (IllegalArgumentException e){
            System.out.println("Erro" + e.getMessage());
        }
    }
    public String getPlaca(){
        return placa;
    }
    public void setPlaca( String placa){
        try{
            if (placa == null || placa.trim().isEmpty()) {
                throw new IllegalArgumentException("A Placa nao pode estar vazia");
            }
            this.placa = placa;
        }catch(IllegalArgumentException e){
            System.out.println("Erro" + e.getMessage());
        }
    }
    
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo){
        try{
            if(modelo == null || modelo.trim().isEmpty()) {
                throw new IllegalArgumentException("o Modelo nao pode ser vazio");
            }
            this.modelo = modelo;
        }catch(IllegalArgumentException e) {
            System.out.println("Erro" + e.getMessage());
        }
    }
    public int getLigado(){
        return ligado;
    }
    public void setLigado(int ligado){
        try {
            if(ligado != 0 && ligado != 1) {
                throw new IllegalArgumentException("O valor de ligado deve ser 0 ou 1");
                
            }
            this.ligado = ligado;
        }catch(IllegalArgumentException e) {
            System.out.println("Erro" + e.getMessage());
        }
    }
    public int emMovimento(){
        return emMovimento;
    }
    
    public void setEmMovimento(int emMovimento){
        try {
            if(emMovimento != 0 && emMovimento != 1) {
                throw new IllegalArgumentException("Valor em movimento deve ser 0 ou 1");
            }
            this.emMovimento = emMovimento;
        }catch(IllegalArgumentException e){
            System.out.println("Erro" + e.getMessage());
        }
    }
    
    // Metodos da classe com tratamento de exeçoes
    
    public void ligar() {
        try {
            if(this.ligado == 1){
                throw new IllegalArgumentException("O veiculo ja esta ligado");
                
            }
            this.ligado = 1;
            System.out.println("O veiculo esta ligado");
        }catch (IllegalArgumentException e){
            System.out.println("Erro" + e.getMessage());
        }
    }
    public void mover(){
        try {
            if(this.ligado == 0){
                throw  new IllegalArgumentException("Nao e possivel mover. O veiculo esta desligado");
            }
            this.emMovimento =1;
            System.out.println("O veiculo esta se movendo");
        }catch(IllegalArgumentException e){
            System.out.println("Erro" + e.getMessage());
        }
    }
    public void parar(){
        try{
            if(this.emMovimento ==0){
                throw new IllegalArgumentException("O veiculo ja esta parado");
            }
            this.emMovimento = 0;
            System.out.println("O veiculo esta parado");
        }catch(IllegalArgumentException e){
            System.out.println("Erro" + e.getMessage());
        }
    }
    // Metodo para exibir as informaçoes do automovel
    
    public void exibirInformacoes(){
        System.out.println("--------------------------------");
        System.out.println("|=====IFORMAÇÕES DO VEICULO====|");
        System.out.println("|------------------------------|");
        System.out.println("|Modelo: " + modelo +          "|");
        System.out.println("|Cor: " + cor +               "|");
        System.out.println("|Placa: " + placa +           "|");
        System.out.println("|Ligado: " + (ligado == 1 ? "Sim" : "Não")+"|");
        System.out.println("|Em Movimento: " +(emMovimento == 1 ? "Sim" : "Não")+"|");
        System.out.println("|------------------------------|");
        
                
    }
}
