package main.java.crudAPI.demo.service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product create(Product p) {
        return repository.save(p);
    }

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }

    public Product update(Long id, Product newData) {
        Product existing = findById(id);
        existing.setName(newData.getName());
        existing.setPrice(newData.getPrice());
        existing.setQuantity(newData.getQuantity());
        existing.setDescription(newData.getDescription());
        return repository.save(existing);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
