//package platterz.services.restms.models
//
//import javax.persistence.*
//
//@Entity
//@Table(name = "customers")
//data class Customer (
//        @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        val id: Int? = null,
//        val name: String,
//        val email: String,
//
//        @OneToMany(cascade = [ CascadeType.ALL ], fetch = FetchType.EAGER, mappedBy = "customer")
//        val orders: Set<Order>,
//
//        @OneToMany(cascade = [ CascadeType.ALL ], fetch = FetchType.EAGER, mappedBy = "customer")
//        val invoices: Set<Invoice>
//)