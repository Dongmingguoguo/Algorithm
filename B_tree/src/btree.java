import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.TreeVisitor;

public class btree {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree() {
            @Override
            public ExpressionTree getLeftOperand() {
                return null;
            }

            @Override
            public ExpressionTree getRightOperand() {
                return null;
            }

            @Override
            public Kind getKind() {
                return null;
            }

            @Override
            public <R, D> R accept(TreeVisitor<R, D> visitor, D data) {
                return null;
            }

        };
    }

}
