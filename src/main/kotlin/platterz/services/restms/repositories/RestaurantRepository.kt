package platterz.services.restms.repositories

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository
import platterz.services.restms.models.Restaurant

@Repository
interface RestaurantRepository : PagingAndSortingRepository<Restaurant, Int>
