//package platterz.services.restms.models
//
//import javax.persistence.*
//
//@Entity
//@Table(name = "orders")
//data class Order (
//        @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        val id: Int? = null,
//        val quantity: Double,
//
//        @ManyToOne
//        val customer: Customer,
//
//        @ManyToMany(cascade = [CascadeType.PERSIST, CascadeType.MERGE])
//        val products: Set<RestaurantProduct>
//)