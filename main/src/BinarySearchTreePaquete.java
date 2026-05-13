import main.Paquete;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTreePaquete{
    private NodoPaquete root;

    public BinarySearchTreePaquete() {
        this.root = null;
    }

    public main.Paquete getRoot() {
        if (this.root == null) {
            return null;
        }

        return this.root.getValue();
    }


}
