package jpabook.jpashop.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Delivery {

    @Id @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @JsonIgnore
    @OneToOne(mappedBy = "delivery" ,fetch = FetchType.LAZY)
    private Order order;

    @Embedded
    Address address;

    @Enumerated(EnumType.STRING) //꼭 String
    private DeliveryStatus status;
}
