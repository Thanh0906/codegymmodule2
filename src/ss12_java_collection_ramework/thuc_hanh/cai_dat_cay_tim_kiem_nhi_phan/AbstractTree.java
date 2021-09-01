package ss12_java_collection_ramework.thuc_hanh.cai_dat_cay_tim_kiem_nhi_phan;

public abstract class AbstractTree<E> implements Tree {
    public abstract boolean insert(Object e);

    @Override
    public void inorder() {
    }
}
