//package platterz.services.restms.models
//
//import javax.persistence.*
//
//@Entity
//@Table(name = "invoices")
//data class Invoice(
//        @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        val id: Int? = null,
//
//        @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
//        val lineItems: List<InvoiceItem>,
//
//        @ManyToOne
//        val customer: Customer,
//
//        @ManyToOne
//        val restaurant: Restaurant
//) {
//    val totalPrice: Double = 5.0
//}
//
//@Entity
//data class InvoiceItem(
//        @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        val id: Int? = null,
//        val quantity: Double,
//
//        @OneToOne
//        val product: RestaurantProduct
//) {
//    val totalPrice: Double = product.price * quantity
//}