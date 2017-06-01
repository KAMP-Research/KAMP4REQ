/**
 *
 * $Id$
 */
package relations.validation;

import org.eclipse.emf.common.util.EList;

import relations.DuplicationObject;

/**
 * A sample validator interface for {@link relations.DuplicationObject}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DuplicationObjectValidator {
	boolean validate();

	boolean validateDuplicateOf(EList<DuplicationObject> value);
	boolean validateHasDuplicates(EList<DuplicationObject> value);
}
