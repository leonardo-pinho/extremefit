/**
 * 
 */
package br.com.extremefit.food;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import br.com.extremefit.core.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author leonardo.pinho
 *
 */
@Entity
@Data
@ToString(exclude = "groups")
@NoArgsConstructor(force = true)
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Food extends AbstractEntity {

	private String name;
	private String flavor;

	@OneToMany
	private final List<Group> groups = new ArrayList<>();

}
