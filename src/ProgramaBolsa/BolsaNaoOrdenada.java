


package ProgramaBolsa;

import java.util.ArrayList;

/**
 *
 * @author Leandro
 */
public class BolsaNaoOrdenada<E> implements Bolsa<E>{
    
    private ArrayList<E> data = new ArrayList<>();

     //Adiciona item ao bolsa
    @Override
    public void add(E item) {
      data.add(item);
    }
    
    //Remove o item do bolsa
    @Override
    public E remove() {
        E product = data.get(0);
        data.remove(product);
        return product;
    }
    
    //Verifica se os itens estão presentes na bolsa
    @Override
    public boolean contains(E item) {
        if((data.contains(item))){
            return true;
        }else
            return false; 
    }
    
    //Verifica se bolsa está vazio
    @Override
    public boolean empty() {
        return data.isEmpty();
    }
    
}
