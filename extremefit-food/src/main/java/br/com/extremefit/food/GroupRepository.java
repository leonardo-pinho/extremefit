/**
 * 
 */
package br.com.extremefit.food;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author leonardo.pinho
 *
 */
@RepositoryRestResource
public interface GroupRepository extends PagingAndSortingRepository<Group, Long> {

}
