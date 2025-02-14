package interfaces;

@FunctionalInterface
public interface Builder<T> {

    void register(String label, Factory<T> factory);
}