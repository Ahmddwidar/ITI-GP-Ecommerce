package iti.jets.ecommerce.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * OrderItemId generated by hbm2java
 */
@Embeddable
@Setter
@Getter
@NoArgsConstructor
public class OrderItemId implements java.io.Serializable {

    @Column(name = "order_id", nullable = false)
    private int orderId;

    @Column(name = "product_id", nullable = false)
    private int productId;

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof OrderItemId))
            return false;
        OrderItemId castOther = (OrderItemId) other;

        return (this.getOrderId() == castOther.getOrderId())
                && (this.getProductId() == castOther.getProductId());
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getOrderId();
        result = 37 * result + this.getProductId();
        return result;
    }

    public OrderItemId(int orderId, int productId) {
        this.orderId = orderId;
        this.productId = productId;
    }
}