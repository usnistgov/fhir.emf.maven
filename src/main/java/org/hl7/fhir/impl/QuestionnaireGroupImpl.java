/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Coding;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.QuestionnaireGroup;
import org.hl7.fhir.QuestionnaireQuestion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireGroupImpl#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireGroupImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireGroupImpl#getConcept <em>Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireGroupImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireGroupImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireGroupImpl#getRepeats <em>Repeats</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireGroupImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.QuestionnaireGroupImpl#getQuestion <em>Question</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnaireGroupImpl extends BackboneElementImpl implements QuestionnaireGroup {
	/**
	 * The cached value of the '{@link #getLinkId() <em>Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkId()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String linkId;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String title;

	/**
	 * The cached value of the '{@link #getConcept() <em>Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcept()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> concept;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String text;

	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean required;

	/**
	 * The cached value of the '{@link #getRepeats() <em>Repeats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeats()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean repeats;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionnaireGroup> group;

	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionnaireQuestion> question;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getQuestionnaireGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getLinkId() {
		return linkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkId(org.hl7.fhir.String newLinkId, NotificationChain msgs) {
		org.hl7.fhir.String oldLinkId = linkId;
		linkId = newLinkId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_GROUP__LINK_ID, oldLinkId, newLinkId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkId(org.hl7.fhir.String newLinkId) {
		if (newLinkId != linkId) {
			NotificationChain msgs = null;
			if (linkId != null)
				msgs = ((InternalEObject)linkId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_GROUP__LINK_ID, null, msgs);
			if (newLinkId != null)
				msgs = ((InternalEObject)newLinkId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_GROUP__LINK_ID, null, msgs);
			msgs = basicSetLinkId(newLinkId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_GROUP__LINK_ID, newLinkId, newLinkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(org.hl7.fhir.String newTitle, NotificationChain msgs) {
		org.hl7.fhir.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_GROUP__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(org.hl7.fhir.String newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_GROUP__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_GROUP__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_GROUP__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getConcept() {
		if (concept == null) {
			concept = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.QUESTIONNAIRE_GROUP__CONCEPT);
		}
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(org.hl7.fhir.String newText, NotificationChain msgs) {
		org.hl7.fhir.String oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_GROUP__TEXT, oldText, newText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(org.hl7.fhir.String newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_GROUP__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_GROUP__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_GROUP__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequired(org.hl7.fhir.Boolean newRequired, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_GROUP__REQUIRED, oldRequired, newRequired);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(org.hl7.fhir.Boolean newRequired) {
		if (newRequired != required) {
			NotificationChain msgs = null;
			if (required != null)
				msgs = ((InternalEObject)required).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_GROUP__REQUIRED, null, msgs);
			if (newRequired != null)
				msgs = ((InternalEObject)newRequired).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_GROUP__REQUIRED, null, msgs);
			msgs = basicSetRequired(newRequired, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_GROUP__REQUIRED, newRequired, newRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getRepeats() {
		return repeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepeats(org.hl7.fhir.Boolean newRepeats, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldRepeats = repeats;
		repeats = newRepeats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_GROUP__REPEATS, oldRepeats, newRepeats);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeats(org.hl7.fhir.Boolean newRepeats) {
		if (newRepeats != repeats) {
			NotificationChain msgs = null;
			if (repeats != null)
				msgs = ((InternalEObject)repeats).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_GROUP__REPEATS, null, msgs);
			if (newRepeats != null)
				msgs = ((InternalEObject)newRepeats).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.QUESTIONNAIRE_GROUP__REPEATS, null, msgs);
			msgs = basicSetRepeats(newRepeats, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.QUESTIONNAIRE_GROUP__REPEATS, newRepeats, newRepeats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionnaireGroup> getGroup() {
		if (group == null) {
			group = new EObjectContainmentEList<QuestionnaireGroup>(QuestionnaireGroup.class, this, FhirPackage.QUESTIONNAIRE_GROUP__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionnaireQuestion> getQuestion() {
		if (question == null) {
			question = new EObjectContainmentEList<QuestionnaireQuestion>(QuestionnaireQuestion.class, this, FhirPackage.QUESTIONNAIRE_GROUP__QUESTION);
		}
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.QUESTIONNAIRE_GROUP__LINK_ID:
				return basicSetLinkId(null, msgs);
			case FhirPackage.QUESTIONNAIRE_GROUP__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.QUESTIONNAIRE_GROUP__CONCEPT:
				return ((InternalEList<?>)getConcept()).basicRemove(otherEnd, msgs);
			case FhirPackage.QUESTIONNAIRE_GROUP__TEXT:
				return basicSetText(null, msgs);
			case FhirPackage.QUESTIONNAIRE_GROUP__REQUIRED:
				return basicSetRequired(null, msgs);
			case FhirPackage.QUESTIONNAIRE_GROUP__REPEATS:
				return basicSetRepeats(null, msgs);
			case FhirPackage.QUESTIONNAIRE_GROUP__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case FhirPackage.QUESTIONNAIRE_GROUP__QUESTION:
				return ((InternalEList<?>)getQuestion()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirPackage.QUESTIONNAIRE_GROUP__LINK_ID:
				return getLinkId();
			case FhirPackage.QUESTIONNAIRE_GROUP__TITLE:
				return getTitle();
			case FhirPackage.QUESTIONNAIRE_GROUP__CONCEPT:
				return getConcept();
			case FhirPackage.QUESTIONNAIRE_GROUP__TEXT:
				return getText();
			case FhirPackage.QUESTIONNAIRE_GROUP__REQUIRED:
				return getRequired();
			case FhirPackage.QUESTIONNAIRE_GROUP__REPEATS:
				return getRepeats();
			case FhirPackage.QUESTIONNAIRE_GROUP__GROUP:
				return getGroup();
			case FhirPackage.QUESTIONNAIRE_GROUP__QUESTION:
				return getQuestion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.QUESTIONNAIRE_GROUP__LINK_ID:
				setLinkId((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_GROUP__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_GROUP__CONCEPT:
				getConcept().clear();
				getConcept().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_GROUP__TEXT:
				setText((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_GROUP__REQUIRED:
				setRequired((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_GROUP__REPEATS:
				setRepeats((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_GROUP__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends QuestionnaireGroup>)newValue);
				return;
			case FhirPackage.QUESTIONNAIRE_GROUP__QUESTION:
				getQuestion().clear();
				getQuestion().addAll((Collection<? extends QuestionnaireQuestion>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirPackage.QUESTIONNAIRE_GROUP__LINK_ID:
				setLinkId((org.hl7.fhir.String)null);
				return;
			case FhirPackage.QUESTIONNAIRE_GROUP__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FhirPackage.QUESTIONNAIRE_GROUP__CONCEPT:
				getConcept().clear();
				return;
			case FhirPackage.QUESTIONNAIRE_GROUP__TEXT:
				setText((org.hl7.fhir.String)null);
				return;
			case FhirPackage.QUESTIONNAIRE_GROUP__REQUIRED:
				setRequired((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.QUESTIONNAIRE_GROUP__REPEATS:
				setRepeats((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.QUESTIONNAIRE_GROUP__GROUP:
				getGroup().clear();
				return;
			case FhirPackage.QUESTIONNAIRE_GROUP__QUESTION:
				getQuestion().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirPackage.QUESTIONNAIRE_GROUP__LINK_ID:
				return linkId != null;
			case FhirPackage.QUESTIONNAIRE_GROUP__TITLE:
				return title != null;
			case FhirPackage.QUESTIONNAIRE_GROUP__CONCEPT:
				return concept != null && !concept.isEmpty();
			case FhirPackage.QUESTIONNAIRE_GROUP__TEXT:
				return text != null;
			case FhirPackage.QUESTIONNAIRE_GROUP__REQUIRED:
				return required != null;
			case FhirPackage.QUESTIONNAIRE_GROUP__REPEATS:
				return repeats != null;
			case FhirPackage.QUESTIONNAIRE_GROUP__GROUP:
				return group != null && !group.isEmpty();
			case FhirPackage.QUESTIONNAIRE_GROUP__QUESTION:
				return question != null && !question.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuestionnaireGroupImpl
