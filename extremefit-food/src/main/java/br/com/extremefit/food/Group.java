/**
 * 
 */
package br.com.extremefit.food;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.extremefit.core.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author leonardo.pinho
 *
 */
@Data
@Entity
@Table(name = "groups")
@NoArgsConstructor(force = true)
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Group extends AbstractEntity {

	private String name;
	
}
