@Service
public class VendorService {
  @Autowired
  private VendorRepository vendorRepos;

  @Autowired
  private ItemRepository itemRepo;

  public void addVendorAndInventory(Vendor vendor) {
  
    vendorRepository.save(vendor); // Persist vendor
    
  }
}
