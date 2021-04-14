/**
 * generated by Xtext 2.24.0
 */
package mde.coursework.gherkin.gherkin;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gherkin Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mde.coursework.gherkin.gherkin.Gherkin_Language#getFeatures <em>Features</em>}</li>
 *   <li>{@link mde.coursework.gherkin.gherkin.Gherkin_Language#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see mde.coursework.gherkin.gherkin.GherkinPackage#getGherkin_Language()
 * @model
 * @generated
 */
public interface Gherkin_Language extends EObject
{
  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link mde.coursework.gherkin.gherkin.Feature}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see mde.coursework.gherkin.gherkin.GherkinPackage#getGherkin_Language_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link mde.coursework.gherkin.gherkin.Rule}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see mde.coursework.gherkin.gherkin.GherkinPackage#getGherkin_Language_Rules()
   * @model containment="true"
   * @generated
   */
  EList<Rule> getRules();

} // Gherkin_Language