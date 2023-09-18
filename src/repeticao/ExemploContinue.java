package repeticao;
public class ExemploContinue {
        public static void main(String[] args) {
        
            for(int numero = 1; numero <=5; numero ++){
                //Não imprimiu a condição do if
                if(numero==3)
                    continue;          
                System.out.println(numero);
                
            }
        
            }
        }
