package operadores;
public class incremento {
    public static void main(String[] args) {
        int numero = 5;
        // numero ++; 
        //usar o operador de atribuição para somar numero ++ é a mesma coisa de colocar numero = numero + 1
        System.out.println(++ numero);
        System.out.println(numero);
  
//Pode inserir numero ++ no print mais precisa declarar:
//System.out.println(numero ++); 
//System.out.println(numero); 
//Para imprimir de primera usar:
//System.out.println(++ numero); Nessa linha ela já realiza o incremento
//System.out.println(numero);
// Para descremento usar:
//System.out.println(numero --); Nessa linha ela já realiza o incremento
//System.out.println(numero);

}
}
