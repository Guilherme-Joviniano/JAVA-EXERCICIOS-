import javax.swing.JOptionPane;

// Try to understand better polymorphism and OOP in java clean code... 
// Code in progress...


abstract class Cartao{
    
    JOptionPane pane = new JOptionPane();

    int id;
    String nome;
    String sobrenome;
    float saldo;
    float cartaoLimite;

    String nomeCompleto(){
        return String.format("%s %s",nome,sobrenome); 
    }
    void Sacar(float valor){
        if(valor > saldo){
            pane.showMessageDialog(null, "Não têm saldo para tal operação");
        }
        saldo -= valor;
        pane.showMessageDialog(null, String.format("Novo Saldo de %f valor sacado de %f", saldo, valor));
    }
    void Depositar(float valor){
        saldo += valor;
        pane.showMessageDialog(null, String.format("Novo Saldo de %f valor depositado de %f", saldo, valor));
    }
    
    void diminuirLimite(float valor){
        cartaoLimite -= valor;
        pane.showMessageDialog(null, String.format("Novo Limite de %f",cartaoLimite));
    }
    void aumentarLimite(float valor){
        cartaoLimite += valor;
        pane.showMessageDialog(null, String.format("Novo Limite de %f", cartaoLimite));
    }


}



class CartaoDeTransporte extends Cartao{

    final float precoPassagem = (float) 4.80;

    
    private boolean chegarCredito() {
        if(saldo < precoPassagem){
            pane.showMessageDialog(null, "Não têm Saldo");
            int isTrue = pane.showConfirmDialog(null, "Deseja Recarregar");
            if(isTrue == 0){
                Depositar(Float.parseFloat(pane.showInputDialog(null, "Digite o valor para Deposito")));
                chegarCredito();
            }
            return false;
        };
        pane.showMessageDialog(null,String.format("Tem saldo de %f \n", saldo));
        return true;
    }

    void debitarCredito(){
    
        if(chegarCredito() == true){
            pane.showMessageDialog(null, "Valor Debitado!");    
            saldo = saldo - precoPassagem;
        }
        return; 

}
}

class CartaoDeCredito extends Cartao{
    
    float cartaoFatura;


    void debitarCredito(float valor){

        if(cartaoLimite < valor){
            pane.showMessageDialog(null, "Não têm Limite");
            return;
        };
        
        pane.showMessageDialog(null,String.format("Tem limite de %f \n",cartaoLimite));

        cartaoLimite -= valor;
        cartaoFatura += valor;

        pane.showMessageDialog(null,String.format("Novo limite de %f \n",cartaoLimite));
        
    }

    Float chegarFatura(){
        pane.showMessageDialog(null, String.format("Caro(a) %s o seu cartão têm limite de %f e o valor da fatura está em %f" , nomeCompleto() , cartaoLimite, cartaoFatura));
        return cartaoFatura; 
    }




    public static void main(final String[] args) {
        
        // final CartaoDeTransporte CT = new CartaoDeTransporte();
       
        final CartaoDeCredito CC = new CartaoDeCredito();

        // CT.id = 0;       
        // CT.nome = "Guilherme";
        // CT.sobrenome = "Joviniano";
        // CT.saldo = (float) 3.80;
        
        // CT.debitarCredito();
        // CT.Depositar(10);

        //

        CC.id = 1;
        CC.nome = "Pedro";
        CC.sobrenome = "Vieira";
        CC.cartaoLimite = (float) 40.0;
        
        CC.debitarCredito((float)50.0);
        float fatura = CC.chegarFatura();

       

    }
}

