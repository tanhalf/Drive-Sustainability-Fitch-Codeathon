public class Item {
    @Column(name = "capacity", nullable = false)
    private int capacity;
    @Column(name = "count", nullable = false)
    private int count;
    @Column(name = "name", nullable = false)
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    public Item(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.count=capacity;
    }

    public  String getName(){
        return name;
    }
    public int getCount(){
        return count;
    }

    public int getCapacity(){
        return capacity;
    }

    public void updateCount(){

    }
}
