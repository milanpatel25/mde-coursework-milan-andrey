/*
 * generated by Xtext 2.24.0
 */
package mde.coursework.gherkin.serializer;

import com.google.inject.Inject;
import java.util.List;
import mde.coursework.gherkin.services.GherkinGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class GherkinSyntacticSequencer extends AbstractSyntacticSequencer {

	protected GherkinGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Normal_Scenario_Scenario_Outline_ScenarioKeyword_0_or_ScenarioOutlineKeyword_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (GherkinGrammarAccess) access;
		match_Normal_Scenario_Scenario_Outline_ScenarioKeyword_0_or_ScenarioOutlineKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getNormal_ScenarioAccess().getScenarioKeyword_0()), new TokenAlias(false, false, grammarAccess.getScenario_OutlineAccess().getScenarioOutlineKeyword_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getBEGINRule())
			return getBEGINToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getENDRule())
			return getENDToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Synthetic terminal rule. The concrete syntax is to be specified by clients.
	 * Defaults to the empty string.
	 */
	protected String getBEGINToken(EObject semanticObject, RuleCall ruleCall, INode node) { return ""; }
	
	/**
	 * Synthetic terminal rule. The concrete syntax is to be specified by clients.
	 * Defaults to the empty string.
	 */
	protected String getENDToken(EObject semanticObject, RuleCall ruleCall, INode node) { return ""; }
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Normal_Scenario_Scenario_Outline_ScenarioKeyword_0_or_ScenarioOutlineKeyword_0.equals(syntax))
				emit_Normal_Scenario_Scenario_Outline_ScenarioKeyword_0_or_ScenarioOutlineKeyword_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'Scenario:' | 'Scenario Outline:'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) BEGIN example=Examples
	 *     (rule start) (ambiguity) BEGIN steps+=Steps
	 *     (rule start) (ambiguity) desc+=Sentence
	 *     (rule start) (ambiguity) scenario_steps=Chain_Steps
	 */
	protected void emit_Normal_Scenario_Scenario_Outline_ScenarioKeyword_0_or_ScenarioOutlineKeyword_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
