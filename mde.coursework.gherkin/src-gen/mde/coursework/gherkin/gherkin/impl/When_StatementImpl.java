/**
 * generated by Xtext 2.24.0
 */
package mde.coursework.gherkin.gherkin.impl;

import mde.coursework.gherkin.gherkin.Description;
import mde.coursework.gherkin.gherkin.GherkinPackage;
import mde.coursework.gherkin.gherkin.When_Statement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>When Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mde.coursework.gherkin.gherkin.impl.When_StatementImpl#getDesc <em>Desc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class When_StatementImpl extends MinimalEObjectImpl.Container implements When_Statement
{
  /**
   * The cached value of the '{@link #getDesc() <em>Desc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesc()
   * @generated
   * @ordered
   */
  protected Description desc;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected When_StatementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GherkinPackage.Literals.WHEN_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Description getDesc()
  {
    return desc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDesc(Description newDesc, NotificationChain msgs)
  {
    Description oldDesc = desc;
    desc = newDesc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GherkinPackage.WHEN_STATEMENT__DESC, oldDesc, newDesc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDesc(Description newDesc)
  {
    if (newDesc != desc)
    {
      NotificationChain msgs = null;
      if (desc != null)
        msgs = ((InternalEObject)desc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GherkinPackage.WHEN_STATEMENT__DESC, null, msgs);
      if (newDesc != null)
        msgs = ((InternalEObject)newDesc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GherkinPackage.WHEN_STATEMENT__DESC, null, msgs);
      msgs = basicSetDesc(newDesc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GherkinPackage.WHEN_STATEMENT__DESC, newDesc, newDesc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GherkinPackage.WHEN_STATEMENT__DESC:
        return basicSetDesc(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GherkinPackage.WHEN_STATEMENT__DESC:
        return getDesc();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GherkinPackage.WHEN_STATEMENT__DESC:
        setDesc((Description)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GherkinPackage.WHEN_STATEMENT__DESC:
        setDesc((Description)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GherkinPackage.WHEN_STATEMENT__DESC:
        return desc != null;
    }
    return super.eIsSet(featureID);
  }

} //When_StatementImpl