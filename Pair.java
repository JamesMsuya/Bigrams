/**
 *
 * @author Gme Jemsy
 * @param <T>
 * @param <S>
 */
public class Pair<T,S> implements Cloneable{
    private T first; 
    private S second; 

     public Pair() {
       first = null;
       second = null;
    }
     
    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }
    
    public Pair(Pair<T,S> obj) {
        this.first = obj.first;
        this.second = obj.second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
    
    @Override
    public Object clone()throws CloneNotSupportedException{
        Pair<T,S> temp = null;
        try
        {
             temp=(new Pair<T,S>((T)(first.getClass().getMethod("clone").invoke(first)),second));
        }
        catch(Exception e)
        {
            System.out.println("Exception:"+e);
        }
        
        return temp;  
    } 
}
