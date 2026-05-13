public class NodoPaquete {
    private Integer value;
    private NodoPaquete left;
    private NodoPaquete right;

    public NodoPaquete(Integer value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }


    public NodoPaquete getLeft() {
        return left;
    }

    public void setLeft(NodoPaquete left) {
        this.left = left;
    }

    public NodoPaquete getRight() {
        return right;
    }

    public void setRight(NodoPaquete right) {
        this.right = right;
    }

    public main.Paquete getValue() {
        return value;
    }
    public void setValue(Integer value) {
        this.value = value;
    }

}
