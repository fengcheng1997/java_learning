import java.lang.Iterable;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class OwnIterator {
    public static void main(String[] args){
        ReverseList<String> rlist = new ReverseList<>();
        rlist.add("lsc");
        rlist.add("tpm");
        rlist.add("cl");
        rlist.add("hpc");

        for(String s : rlist){
            System.out.println(s);
        }

    }
}

class ReverseList<T> implements Iterable<T> {
    private List<T> list = new ArrayList<>();

    public void add(T t) {
        this.list.add(t);
    }

    @Override
    public Iterator<T> iterator(){
        return new ReverseIterator(list.size());
    }

    class ReverseIterator implements Iterator<T> { //内部类
        int index;

        ReverseIterator(int index) {
            this.index = index;
        }

        @Override
        public boolean hasNext() {
            return index > 0;
        }

        @Override
        public T next() {
            index--;
            return ReverseList.this.list.get(index);
        }
    }


}