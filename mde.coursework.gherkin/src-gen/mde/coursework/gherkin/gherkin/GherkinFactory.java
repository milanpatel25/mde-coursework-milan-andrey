/**
 * generated by Xtext 2.24.0
 */
package mde.coursework.gherkin.gherkin;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mde.coursework.gherkin.gherkin.GherkinPackage
 * @generated
 */
public interface GherkinFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GherkinFactory eINSTANCE = mde.coursework.gherkin.gherkin.impl.GherkinFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Gherkin Language</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Gherkin Language</em>'.
   * @generated
   */
  Gherkin_Language createGherkin_Language();

  /**
   * Returns a new object of class '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature</em>'.
   * @generated
   */
  Feature createFeature();

  /**
   * Returns a new object of class '<em>Background</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Background</em>'.
   * @generated
   */
  Background createBackground();

  /**
   * Returns a new object of class '<em>Scenario</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scenario</em>'.
   * @generated
   */
  Scenario createScenario();

  /**
   * Returns a new object of class '<em>Normal Scenario</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Normal Scenario</em>'.
   * @generated
   */
  Normal_Scenario createNormal_Scenario();

  /**
   * Returns a new object of class '<em>Scenario Outline</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scenario Outline</em>'.
   * @generated
   */
  Scenario_Outline createScenario_Outline();

  /**
   * Returns a new object of class '<em>Examples</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Examples</em>'.
   * @generated
   */
  Examples createExamples();

  /**
   * Returns a new object of class '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule</em>'.
   * @generated
   */
  Rule createRule();

  /**
   * Returns a new object of class '<em>Example</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Example</em>'.
   * @generated
   */
  Example createExample();

  /**
   * Returns a new object of class '<em>Chain Steps</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chain Steps</em>'.
   * @generated
   */
  Chain_Steps createChain_Steps();

  /**
   * Returns a new object of class '<em>Steps</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Steps</em>'.
   * @generated
   */
  Steps createSteps();

  /**
   * Returns a new object of class '<em>Given Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Given Statement</em>'.
   * @generated
   */
  Given_Statement createGiven_Statement();

  /**
   * Returns a new object of class '<em>When Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>When Statement</em>'.
   * @generated
   */
  When_Statement createWhen_Statement();

  /**
   * Returns a new object of class '<em>Then Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Then Statement</em>'.
   * @generated
   */
  Then_Statement createThen_Statement();

  /**
   * Returns a new object of class '<em>But Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>But Statement</em>'.
   * @generated
   */
  But_Statement createBut_Statement();

  /**
   * Returns a new object of class '<em>And Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Statement</em>'.
   * @generated
   */
  And_Statement createAnd_Statement();

  /**
   * Returns a new object of class '<em>Star Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Star Statement</em>'.
   * @generated
   */
  Star_Statement createStar_Statement();

  /**
   * Returns a new object of class '<em>Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Description</em>'.
   * @generated
   */
  Description createDescription();

  /**
   * Returns a new object of class '<em>Sent</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sent</em>'.
   * @generated
   */
  Sent createSent();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GherkinPackage getGherkinPackage();

} //GherkinFactory
