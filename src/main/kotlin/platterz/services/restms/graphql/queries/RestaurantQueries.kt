package platterz.services.restms.graphql.queries

import com.expediagroup.graphql.spring.operations.Query
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component
import platterz.services.restms.models.Restaurant
import platterz.services.restms.repositories.RestaurantRepository

@Component
class RestaurantQuery : Query {

    @Autowired
    lateinit var restaurantRepository: RestaurantRepository

    val log: Logger = LoggerFactory.getLogger(this::class.java)

    fun restaurantQuery(id: Int): Restaurant? {
        log.info("Fetching restaurant info with id: $id")
        return restaurantRepository.findByIdOrNull(id)
    }
}