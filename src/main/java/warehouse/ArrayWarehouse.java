package warehouse;

import java.util.HashMap;
import java.util.Map;

public class ArrayWarehouse {//singleton +map
    private static ArrayWarehouse instance;
    private Map<Long, ArrayStatistic> warehouse = new HashMap<>();

    public ArrayWarehouse() {
    }

    public ArrayWarehouse(Map<Long, ArrayStatistic> warehouse) {
        this.warehouse = warehouse;
    }

    public static ArrayWarehouse getInstance() {
        if (instance == null) {
            instance = new ArrayWarehouse();
        }
        return instance;
    }

    public ArrayStatistic put(Long key, ArrayStatistic value) {
        return warehouse.put(key, value);
    }
    public ArrayStatistic remove(Long key){
        return warehouse.remove(key);
    }
    public ArrayStatistic get(Long key){
       return warehouse.get(key);
    }

}
