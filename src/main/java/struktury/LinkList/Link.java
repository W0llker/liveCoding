package struktury.LinkList;

public class Link {
    private Integer data;
    private Double dDouble;
    private Link next;

    public Link(Integer data, Double dDouble) {
        this.data = data;
        this.dDouble = dDouble;
    }

    @Override
    public String toString() {
        return "data " + data + " bdata=" + dDouble;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Double getdDouble() {
        return dDouble;
    }

    public void setdDouble(Double dDouble) {
        this.dDouble = dDouble;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }
}
