package platterz.services.restms.graphql.mutations

import com.expediagroup.graphql.spring.operations.Mutation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import platterz.services.restms.models.Restaurant
import platterz.services.restms.repositories.RestaurantRepository

@Component
class CreateRestaurantMutation : Mutation {

    @Autowired lateinit var restaurantRepository: RestaurantRepository

    fun createRestaurant(restaurant: Restaurant): Restaurant =
        restaurantRepository.save(restaurant)
}