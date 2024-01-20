package jpabook.jpashop.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Delivery {

    @Id @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery" ,fetch = FetchType.LAZY)
    private Order order;

    @Embedded
    Address address;

    @Enumerated(EnumType.STRING) //꼭 String
    private DeliveryStatus status;
}
