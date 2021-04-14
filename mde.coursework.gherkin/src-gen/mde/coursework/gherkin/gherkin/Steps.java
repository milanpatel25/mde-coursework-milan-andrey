/**
 * generated by Xtext 2.24.0
 */
package mde.coursework.gherkin.gherkin;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Steps</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mde.coursework.gherkin.gherkin.Steps#getGiven_step <em>Given step</em>}</li>
 *   <li>{@link mde.coursework.gherkin.gherkin.Steps#getWhen_step <em>When step</em>}</li>
 *   <li>{@link mde.coursework.gherkin.gherkin.Steps#getBut_step <em>But step</em>}</li>
 *   <li>{@link mde.coursework.gherkin.gherkin.Steps#getThen_step <em>Then step</em>}</li>
 *   <li>{@link mde.coursework.gherkin.gherkin.Steps#getAnd_step <em>And step</em>}</li>
 *   <li>{@link mde.coursework.gherkin.gherkin.Steps#getStar_step <em>Star step</em>}</li>
 * </ul>
 *
 * @see mde.coursework.gherkin.gherkin.GherkinPackage#getSteps()
 * @model
 * @generated
 */
public interface Steps extends EObject
{
  /**
   * Returns the value of the '<em><b>Given step</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Given step</em>' containment reference.
   * @see #setGiven_step(Given_Statement)
   * @see mde.coursework.gherkin.gherkin.GherkinPackage#getSteps_Given_step()
   * @model containment="true"
   * @generated
   */
  Given_Statement getGiven_step();

  /**
   * Sets the value of the '{@link mde.coursework.gherkin.gherkin.Steps#getGiven_step <em>Given step</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Given step</em>' containment reference.
   * @see #getGiven_step()
   * @generated
   */
  void setGiven_step(Given_Statement value);

  /**
   * Returns the value of the '<em><b>When step</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>When step</em>' containment reference.
   * @see #setWhen_step(When_Statement)
   * @see mde.coursework.gherkin.gherkin.GherkinPackage#getSteps_When_step()
   * @model containment="true"
   * @generated
   */
  When_Statement getWhen_step();

  /**
   * Sets the value of the '{@link mde.coursework.gherkin.gherkin.Steps#getWhen_step <em>When step</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>When step</em>' containment reference.
   * @see #getWhen_step()
   * @generated
   */
  void setWhen_step(When_Statement value);

  /**
   * Returns the value of the '<em><b>But step</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>But step</em>' containment reference.
   * @see #setBut_step(But_Statement)
   * @see mde.coursework.gherkin.gherkin.GherkinPackage#getSteps_But_step()
   * @model containment="true"
   * @generated
   */
  But_Statement getBut_step();

  /**
   * Sets the value of the '{@link mde.coursework.gherkin.gherkin.Steps#getBut_step <em>But step</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>But step</em>' containment reference.
   * @see #getBut_step()
   * @generated
   */
  void setBut_step(But_Statement value);

  /**
   * Returns the value of the '<em><b>Then step</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then step</em>' containment reference.
   * @see #setThen_step(Then_Statement)
   * @see mde.coursework.gherkin.gherkin.GherkinPackage#getSteps_Then_step()
   * @model containment="true"
   * @generated
   */
  Then_Statement getThen_step();

  /**
   * Sets the value of the '{@link mde.coursework.gherkin.gherkin.Steps#getThen_step <em>Then step</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then step</em>' containment reference.
   * @see #getThen_step()
   * @generated
   */
  void setThen_step(Then_Statement value);

  /**
   * Returns the value of the '<em><b>And step</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>And step</em>' containment reference.
   * @see #setAnd_step(And_Statement)
   * @see mde.coursework.gherkin.gherkin.GherkinPackage#getSteps_And_step()
   * @model containment="true"
   * @generated
   */
  And_Statement getAnd_step();

  /**
   * Sets the value of the '{@link mde.coursework.gherkin.gherkin.Steps#getAnd_step <em>And step</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>And step</em>' containment reference.
   * @see #getAnd_step()
   * @generated
   */
  void setAnd_step(And_Statement value);

  /**
   * Returns the value of the '<em><b>Star step</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Star step</em>' containment reference.
   * @see #setStar_step(Star_Statement)
   * @see mde.coursework.gherkin.gherkin.GherkinPackage#getSteps_Star_step()
   * @model containment="true"
   * @generated
   */
  Star_Statement getStar_step();

  /**
   * Sets the value of the '{@link mde.coursework.gherkin.gherkin.Steps#getStar_step <em>Star step</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Star step</em>' containment reference.
   * @see #getStar_step()
   * @generated
   */
  void setStar_step(Star_Statement value);

} // Steps
