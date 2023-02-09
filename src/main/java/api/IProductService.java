package api;

import java.util.Set;

public interface IProductService {
    Set<Product> findAll();
    Product findById(int id);
}
