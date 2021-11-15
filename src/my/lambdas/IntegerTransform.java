package my.lambdas;
// функциональный интерфейс с одним методом
@FunctionalInterface
public interface IntegerTransform {
    Integer doTransform (Integer x);
}
