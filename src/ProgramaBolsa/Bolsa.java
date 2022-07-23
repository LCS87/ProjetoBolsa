


package ProgramaBolsa;

/**
 *
 * @author Leandro
 */
public interface Bolsa<E> {
    
   /** Adiciona itens ao saco
      * @param item */
    
    public void add(E item);
    
    /** Remove itens da bolsa
      * @Retorna
      */
    
    public E remove();
    
    /**Verifica se a bolsa contém o item
      * @param item
      * @return true se o item estiver presente
      */
    
    public boolean contains(E item);
    
    /**Verifica se o saco está vazio ou não
      * @return true se a bolsa estiver vazia
      */
    
    public boolean empty();
}
