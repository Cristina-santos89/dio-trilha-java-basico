package operadores;
public class operadoresLogicos {
    public static void main(String[] args) {
        boolean condicao1=true;
        boolean condicao2=false;

//Aqui estamos utilizando o operador lógico E para fazer a união de duas expressões. 
// É como se estivesse escrito:
//Se Condicao1 e Condicao2 forem verdadeiras, executar código"
        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }

            System.out.println("Fim");
	        

        //Se condicao1 OU condicao2 for verdadeira, executar código.
        if(condicao1 || condicao2){
            System.out.println("Umas das condições é verdadeira");
        }

            System.out.println("Fim");


}
}
