/*
 * generated by Xtext 2.24.0
 */
package mde.coursework.gherkin.serializer;

import com.google.inject.Inject;
import java.util.Set;
import mde.coursework.gherkin.gherkin.And_Statement;
import mde.coursework.gherkin.gherkin.Background;
import mde.coursework.gherkin.gherkin.But_Statement;
import mde.coursework.gherkin.gherkin.Chain_Steps;
import mde.coursework.gherkin.gherkin.Description;
import mde.coursework.gherkin.gherkin.Examples;
import mde.coursework.gherkin.gherkin.GherkinPackage;
import mde.coursework.gherkin.gherkin.Gherkin_Language;
import mde.coursework.gherkin.gherkin.Given_Statement;
import mde.coursework.gherkin.gherkin.Sent;
import mde.coursework.gherkin.gherkin.Star_Statement;
import mde.coursework.gherkin.gherkin.Steps;
import mde.coursework.gherkin.gherkin.Then_Statement;
import mde.coursework.gherkin.gherkin.When_Statement;
import mde.coursework.gherkin.services.GherkinGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class GherkinSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GherkinGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GherkinPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GherkinPackage.AND_STATEMENT:
				sequence_And_Statement(context, (And_Statement) semanticObject); 
				return; 
			case GherkinPackage.BACKGROUND:
				sequence_Background(context, (Background) semanticObject); 
				return; 
			case GherkinPackage.BUT_STATEMENT:
				sequence_But_Statement(context, (But_Statement) semanticObject); 
				return; 
			case GherkinPackage.CHAIN_STEPS:
				sequence_Chain_Steps(context, (Chain_Steps) semanticObject); 
				return; 
			case GherkinPackage.DESCRIPTION:
				if (rule == grammarAccess.getDescriptionRule()) {
					sequence_Description(context, (Description) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getExampleRule()) {
					sequence_Description_Example(context, (Description) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getFeatureRule()) {
					sequence_Description_Feature(context, (Description) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getNormal_ScenarioRule()) {
					sequence_Description_Normal_Scenario(context, (Description) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getScenarioRule()) {
					sequence_Description_Normal_Scenario_Scenario_Outline(context, (Description) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getRuleRule()) {
					sequence_Description_Rule(context, (Description) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getScenario_OutlineRule()) {
					sequence_Description_Scenario_Outline(context, (Description) semanticObject); 
					return; 
				}
				else break;
			case GherkinPackage.EXAMPLES:
				sequence_Examples(context, (Examples) semanticObject); 
				return; 
			case GherkinPackage.GHERKIN_LANGUAGE:
				sequence_Gherkin_Language(context, (Gherkin_Language) semanticObject); 
				return; 
			case GherkinPackage.GIVEN_STATEMENT:
				sequence_Given_Statement(context, (Given_Statement) semanticObject); 
				return; 
			case GherkinPackage.SENT:
				sequence_Sent(context, (Sent) semanticObject); 
				return; 
			case GherkinPackage.STAR_STATEMENT:
				sequence_Star_Statement(context, (Star_Statement) semanticObject); 
				return; 
			case GherkinPackage.STEPS:
				sequence_Steps(context, (Steps) semanticObject); 
				return; 
			case GherkinPackage.THEN_STATEMENT:
				sequence_Then_Statement(context, (Then_Statement) semanticObject); 
				return; 
			case GherkinPackage.WHEN_STATEMENT:
				sequence_When_Statement(context, (When_Statement) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     And_Statement returns And_Statement
	 *
	 * Constraint:
	 *     desc=Description
	 */
	protected void sequence_And_Statement(ISerializationContext context, And_Statement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GherkinPackage.Literals.AND_STATEMENT__DESC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GherkinPackage.Literals.AND_STATEMENT__DESC));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAnd_StatementAccess().getDescDescriptionParserRuleCall_1_0(), semanticObject.getDesc());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Background returns Background
	 *
	 * Constraint:
	 *     (title='Background:' background_Steps+=Steps*)
	 */
	protected void sequence_Background(ISerializationContext context, Background semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     But_Statement returns But_Statement
	 *
	 * Constraint:
	 *     desc=Description
	 */
	protected void sequence_But_Statement(ISerializationContext context, But_Statement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GherkinPackage.Literals.BUT_STATEMENT__DESC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GherkinPackage.Literals.BUT_STATEMENT__DESC));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBut_StatementAccess().getDescDescriptionParserRuleCall_1_0(), semanticObject.getDesc());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Chain_Steps returns Chain_Steps
	 *
	 * Constraint:
	 *     chain+=Steps*
	 */
	protected void sequence_Chain_Steps(ISerializationContext context, Chain_Steps semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Description returns Description
	 *
	 * Constraint:
	 *     desc+=Sentence*
	 */
	protected void sequence_Description(ISerializationContext context, Description semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Example returns Description
	 *
	 * Constraint:
	 *     (desc+=Sentence* example_steps=Chain_Steps)
	 */
	protected void sequence_Description_Example(ISerializationContext context, Description semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns Description
	 *
	 * Constraint:
	 *     (desc+=Sentence* (feature_background=Background? scenarios+=Scenario+)?)
	 */
	protected void sequence_Description_Feature(ISerializationContext context, Description semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Normal_Scenario returns Description
	 *
	 * Constraint:
	 *     (desc+=Sentence* scenario_steps=Chain_Steps)
	 */
	protected void sequence_Description_Normal_Scenario(ISerializationContext context, Description semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Scenario returns Description
	 *
	 * Constraint:
	 *     (desc+=Sentence* (scenario_steps=Chain_Steps | (steps+=Steps* example=Examples)))
	 */
	protected void sequence_Description_Normal_Scenario_Scenario_Outline(ISerializationContext context, Description semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Rule returns Description
	 *
	 * Constraint:
	 *     (desc+=Sentence* (background=Background? examples+=Example+)?)
	 */
	protected void sequence_Description_Rule(ISerializationContext context, Description semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Scenario_Outline returns Description
	 *
	 * Constraint:
	 *     (desc+=Sentence* steps+=Steps* example=Examples)
	 */
	protected void sequence_Description_Scenario_Outline(ISerializationContext context, Description semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Examples returns Examples
	 *
	 * Constraint:
	 *     rows+=Examples_row+
	 */
	protected void sequence_Examples(ISerializationContext context, Examples semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Gherkin_Language returns Gherkin_Language
	 *
	 * Constraint:
	 *     (features+=Feature+ | rules+=Rule+)
	 */
	protected void sequence_Gherkin_Language(ISerializationContext context, Gherkin_Language semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Given_Statement returns Given_Statement
	 *
	 * Constraint:
	 *     desc=Description
	 */
	protected void sequence_Given_Statement(ISerializationContext context, Given_Statement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GherkinPackage.Literals.GIVEN_STATEMENT__DESC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GherkinPackage.Literals.GIVEN_STATEMENT__DESC));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGiven_StatementAccess().getDescDescriptionParserRuleCall_1_0(), semanticObject.getDesc());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Sent returns Sent
	 *
	 * Constraint:
	 *     desc+=Sentence*
	 */
	protected void sequence_Sent(ISerializationContext context, Sent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Star_Statement returns Star_Statement
	 *
	 * Constraint:
	 *     desc=Description
	 */
	protected void sequence_Star_Statement(ISerializationContext context, Star_Statement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GherkinPackage.Literals.STAR_STATEMENT__DESC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GherkinPackage.Literals.STAR_STATEMENT__DESC));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStar_StatementAccess().getDescDescriptionParserRuleCall_1_0(), semanticObject.getDesc());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Steps returns Steps
	 *
	 * Constraint:
	 *     (
	 *         given_step=Given_Statement | 
	 *         when_step=When_Statement | 
	 *         but_step=But_Statement | 
	 *         then_step=Then_Statement | 
	 *         and_step=And_Statement | 
	 *         star_step=Star_Statement
	 *     )
	 */
	protected void sequence_Steps(ISerializationContext context, Steps semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Then_Statement returns Then_Statement
	 *
	 * Constraint:
	 *     desc=Description
	 */
	protected void sequence_Then_Statement(ISerializationContext context, Then_Statement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GherkinPackage.Literals.THEN_STATEMENT__DESC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GherkinPackage.Literals.THEN_STATEMENT__DESC));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getThen_StatementAccess().getDescDescriptionParserRuleCall_1_0(), semanticObject.getDesc());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     When_Statement returns When_Statement
	 *
	 * Constraint:
	 *     desc=Description
	 */
	protected void sequence_When_Statement(ISerializationContext context, When_Statement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GherkinPackage.Literals.WHEN_STATEMENT__DESC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GherkinPackage.Literals.WHEN_STATEMENT__DESC));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWhen_StatementAccess().getDescDescriptionParserRuleCall_1_0(), semanticObject.getDesc());
		feeder.finish();
	}
	
	
}
