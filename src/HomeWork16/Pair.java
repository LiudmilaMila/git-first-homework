package HomeWork16;

import java.util.Objects;

public class Pair<F,S> {
    public final F first;
    public final S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object other) {
        if(other == this){
            return true;
        }
        if (!(other instanceof Pair)) {
            return false;
        }
        Pair<F,S> theOther = (Pair<F,S>) other;
        return Objects.equals(theOther.first,this.first) &&
                Objects.equals(theOther.second,this.second);

    }

    public int hashCode(){
        return Objects.hash(first,second);
    }
}
