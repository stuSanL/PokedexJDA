package botPokedex.pokemon.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Evolution{
    private List<String> prev;
    private List<List<String>> next;

    public Evolution() {}

    public void setPrev(List<String> prev) {
        this.prev = prev;
    }

    public void setNext(List<List<String>> next) {
        this.next = next;
    }

    public List<String> getPrev() {
        return prev;
    }

    public List<List<String>> getNext() {
        return next;
    }
}
