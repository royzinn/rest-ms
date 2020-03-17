package platterz.services.restms.models

import javax.persistence.*

@Entity
@Table(name = "restaurants")
data class Restaurant(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int? = null,
        val name: String,
        val description: String,
        val priceRange: Int,
        val imageSrc: String,
        val imageDescription: String,

        @OneToMany(cascade = [CascadeType.ALL], targetEntity = RestaurantProduct::class, fetch = FetchType.LAZY, mappedBy = "restaurant")
        val menu: List<RestaurantProduct>

//        @OneToMany(cascade = [ CascadeType.ALL ], mappedBy = "restaurant")
//        val invoices: List<Invoice>
)

@Entity
@Table(name = "restaurant_products")
data class RestaurantProduct(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int? = null,
        val item: String,
        val price: Double,

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "restaurant_id", insertable = false, updatable = false)
        val restaurant: Restaurant

//        @ManyToMany(mappedBy = "products")
//        val orders: List<Order>
)