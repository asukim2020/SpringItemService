package hello.itemservice.domain.item;

import lombok.Data;

// 주의해서 쓸 것
@Data
public class Item {

    private Long id;
    private String ItemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        ItemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
