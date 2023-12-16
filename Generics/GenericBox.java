public class GenericBox<T> {
    private T value;

    /**
     * @return T return the value
     */
    public T getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(T value) {
        this.value = value;
    }

}
