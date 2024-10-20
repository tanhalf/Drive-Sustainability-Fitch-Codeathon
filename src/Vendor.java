import java.lang.reflect.Array;
import java.util.*;
import javax.persistence.*;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

@Entity
@Table(name = "Vendor Inventory")
public class Vendor {
    @Column(name = "Vendor")
    private String name;
    private Map<Item, Integer> inventory;
    private ItemRepository itemRepo;
    public Vendor(String name){
        this.name = name;
        this.inventory = new HashMap<>();
    }

    public void setName(String name){
        this.name = name;
    }

    public void addTo(String name, int count) throws VendorExceptions {
        if(inventory.containsKey(name))
            throw new VendorExceptions.ItemAlreadyExistsException("Item already added to vendor inventory");
        this.inventory.put(name, count);
        itemRepo.save(new Item(name, count));
    }

    public void removeFrom(String name){
        this.inventory.put(name,inventory.get(name)-1);
        //if(inventory.get(name).getCount() < capac)
    }

}

