package HomeWork15;

import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MyOptional<T> {

    private T data;

    private MyOptional(T data) {
        this.data = data;
    }

    public boolean isPresent() {

        return data != null;
    }

    public T get() {
        if (data != null) {
            return data;
        } else {
            throw new NoSuchElementException();

        }
    }

    public static <T> MyOptional<T> of(T data) {
        if (data != null) {
            return new MyOptional<T>(data);

        } else {
            throw new NullPointerException();
        }

    }

    public static <T> MyOptional<T> ofNullable(T data) {

        return new MyOptional<T>(data);
    }


    public static <T> MyOptional<T> empty() {

        return new MyOptional<T>(null);
    }

    public T orElse(T other) {
        if (isPresent()) {
            return data;
        } else {
            return other;
        }
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MyOptional)) {
            return false;
        }
        MyOptional<?> theOther = (MyOptional<?>) other;
        return Objects.equals(theOther.data, this.data);
    }

    @Override
    public int hashCode() {
        if (isPresent()) {
            return Objects.hash(data);
        } else {
            return 0;
        }
    }

    public void ifPresent(Consumer<? super T> consumer) {
        if (isPresent()) {
            consumer.accept(data);
        }
    }

    public T orElseGet(Supplier<? extends T> other) {
        if (isPresent()) {
            return data;
        } else {
            return other.get();
        }
    }

    public <X extends Throwable> T orElseThrow(Supplier<? extends X> exceptionSupplier)
            throws X {
        if (isPresent()) {
            return data;
        } else {
            throw exceptionSupplier.get();
        }
    }

    public MyOptional<T> filter(Predicate<? super T> predicate) {
        if (isPresent() && predicate.test(data)) {
            return this;

        } else {
            return empty();
        }
    }
}