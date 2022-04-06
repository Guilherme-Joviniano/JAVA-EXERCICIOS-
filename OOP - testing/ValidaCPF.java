class Main {
    public static void main(String[] args) {
    
    }

    public class CPF{
        
        String CPF;
        String cpfLimpo;
        String CpfParcial;
        boolean eValido;

        //Constructor
        CPF(String CPF){
            
            this.cpfLimpo = CPF.replaceAll("[^\\n\\r\\t\\p{Print}]", "");
            this.CpfParcial = this.cpfLimpo.substring(0,9);
            this.eValido = eValido(CpfParcial);
        
        }

        public boolean eValido(String cpfParcial) {
                     

            return eValido;
        }

    }
}