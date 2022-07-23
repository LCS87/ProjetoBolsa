
package ProgramaBolsa;

import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class ProgramaBols {
    private Bolsa<String> bag;
    
    public static void run(){
        
     Scanner s = new Scanner(System.in);
     
     //Peça ao usuário para selecionar a bolsa de sua escolha e
     //pega a entrada do usuário
     
     System.out.print("Qual tipo de bolsa você deseja? ordenado / nao ordenado: ");
      String choice = s.next();
    
     if(choice.equals("ordenado")){
        BolsaOrdenada<String> bag = new BolsaOrdenada<>();
        
        //Número de itens que o usuário quer na bolsa
        System.out.print("\nQuantos itens colocar na bolsa? ");
        int n = s.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("Digite o item "+ (i+1) +": ");
            //Pega o próximo item a ser inserido
            bag.add(s.next());
        }
        
      //Permitir que o usuário veja se o item está presente na bolsa
       System.out.print("\nVocê pode verificar se algo está na bolsa.");
       System.out.print("\nVerifique (digite 'feito' para parar): ");
       String input = s.next();
       while(!input.equals("feito")){
           //Verifica se o item está presente na bolsa e
           //imprime sim se estiver presente ou então diz não
           if(bag.contains(input)){
               System.out.print("Sim, está na bolsa.");
           }else{
               System.out.print("Não, não está na bolsa.");
           }
        //continua até que o usuário digite feito.
        System.out.print("\nVerifique (digite 'feito' para parar): ");
        input = s.next();
       }
       
       //Remove os itens da bolsa
       System.out.println("\nVamos remover coisas da bolsa:");
       for(int i = 0; i<n; i++){
           System.out.println("Removendo item: "+ bag.remove());
       }
     }else //Executa as mesmas funções para bolsa não ordenada
     {
        BolsaNaoOrdenada<String> bag = new BolsaNaoOrdenada<>();
        
        //Número de itens que o usuário quer na bolsa
        System.out.print("\nQuantos itens colocar na bolsa? ");
        int n = s.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("Digite o item "+ (i+1) +": ");
            //Pega o próximo item a ser inserido
            bag.add(s.next());
        }
        
       //Permitir que o usuário veja se o item está presente na bolsa
       System.out.print("\nVocê pode verificar se algo está na bolsa.");
       System.out.print("\nVerifique (digite 'feito' para parar): ");
       String input = s.next();
       while(!input.equals("feito")){
           //Verifica se o item está presente na bolsa e
            //imprime sim se estiver presente ou então diz não
           if(bag.contains(input)){
               System.out.print("Sim, está na bolsa.");
           }else{
               System.out.print("Não, não está na bolsa.");
           }
        //continua até que o usuário digite feito.
        System.out.print("\nVerifique (digite 'feito' para parar): ");
        input = s.next();
       }
       
       //Remove items da bolsa
       System.out.println("\nVamos remover coisas da bolsa:");
       for(int i = 0; i<n; i++){
           System.out.println("Removendo item: "+ bag.remove());
       }
     }
    
    }
   
    public static void main (String[] args){
        run(); 
    }
    
}
