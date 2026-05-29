package test.java.crudAPI.demo.service;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @Mock
    private ProductRepository repository;

    @InjectMocks
    private ProductService service;

    @Test
    void testCreate() {
        Product p = new Product();
        p.setName("Teste");

        when(repository.save(any(Product.class))).thenReturn(p);

        Product created = service.create(p);

        assertNotNull(created);
        assertEquals("Teste", created.getName());
    }

    @Test
    void testFindById() {
        Product p = new Product();
        p.setId(1L);

        when(repository.findById(1L)).thenReturn(Optional.of(p));

        Product found = service.findById(1L);

        assertEquals(1L, found.getId());
    }

    @Test
    void testUpdate() {
        Product existing = new Product();
        existing.setId(1L);
        existing.setName("Old");

        Product newData = new Product();
        newData.setName("New");

        when(repository.findById(1L)).thenReturn(Optional.of(existing));
        when(repository.save(any(Product.class))).thenReturn(newData);

        Product result = service.update(1L, newData);

        assertEquals("New", result.getName());
    }

    @Test
    void testDelete() {
        doNothing().when(repository).deleteById(1L);

        assertDoesNotThrow(() -> service.delete(1L));
    }
}
