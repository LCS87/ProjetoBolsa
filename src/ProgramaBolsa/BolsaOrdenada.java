

package ProgramaBolsa;

import java.util.ArrayList;

/**
 *
 * @author Leandro
 */
public class BolsaOrdenada<E> implements Bolsa<E> {
   private ArrayList<E> data = new ArrayList<>(); 

    @Override
    public void add(E item) {
       if(empty()) {
           data.add(item);
       }
       else if(contains(item)) {
           return;
       }
       else {
           data.add(item);
           for (int i = 0; i < data.size(); i++) {
                   for (int j = 0; j < data.size() - i - 1; j++) {
                       if (((String)data.get(j)).compareTo((String)data.get(j + 1))>0) {
                          E value = data.get(j);
                          data.set(j, data.get(j + 1));
                          data.set(j + 1, value);
                       }
                   }
               }
       } 
          }

    @Override
    public E remove() {
         E product = data.get(0);
        data.remove(product);
        return product;
    }

    @Override
    public boolean contains(E item) {
        if((data.contains(item))){
            return true;
        }else
            return false; 
    }

    @Override
    public boolean empty() {
       return data.isEmpty();
    }
}
