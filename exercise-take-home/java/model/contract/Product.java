import java.util.List;

public class Product<P, C> implements ProductService {
    @Override
    public List getAllProducts() {
        return null;
    }

    @Override
    public List<P> getAllProducts(int limit, int skip, String... fields) {
        return null;
    }

    @Override
    public Object getProduct(Integer productId) {
        return null;
    }

    @Override
    public List<P> searchProducts(String query) {
        return null;
    }

    @Override
    public List<C> getCategories() {
        return null;
    }

    @Override
    public List<P> getProductsByCategory(String categoryName) {
        return null;
    }
}
