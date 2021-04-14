/*
 * generated by Xtext 2.24.0
 */
lexer grammar InternalGherkinLexer;

@header {
package mde.coursework.gherkin.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

ScenarioOutline : 'Scenario Outline:';

Background : 'Background:';

Examples : 'Examples:';

Scenario : 'Scenario:';

Example : 'Example:';

Feature : 'Feature:';

Given : 'Given';

Rule : 'Rule:';

Then : 'Then';

When : 'When';

And : 'And';

But : 'But';

Backspace : '\b';

Asterisk : '*';

VerticalLine : '|';

fragment RULE_BEGIN : ;

fragment RULE_END : ;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;