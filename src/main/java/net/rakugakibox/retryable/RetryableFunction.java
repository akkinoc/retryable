package net.rakugakibox.retryable;

/**
 * This functional interface represents a retryable function.
 * It has a return value.
 *
 * @param <T> result type.
 */
@FunctionalInterface
public interface RetryableFunction<T> {

    /**
     * Run the function.
     *
     * @param context the context.
     * @return the result.
     * @throws Exception if an exception occurs.
     */
    T run(RetryableContext context) throws Exception;

}
