package mde.coursework.gherkin.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import mde.coursework.gherkin.services.GherkinGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGherkinParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ScenarioOutline", "Background", "Examples", "Scenario", "Example", "Feature", "Given", "Rule", "Then", "When", "And", "But", "Backspace", "Asterisk", "VerticalLine", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Backspace=16;
    public static final int RULE_END=20;
    public static final int RULE_BEGIN=19;
    public static final int Given=10;
    public static final int RULE_STRING=23;
    public static final int Feature=9;
    public static final int RULE_SL_COMMENT=25;
    public static final int Example=8;
    public static final int Then=12;
    public static final int EOF=-1;
    public static final int Asterisk=17;
    public static final int But=15;
    public static final int Background=5;
    public static final int RULE_ID=21;
    public static final int RULE_WS=26;
    public static final int RULE_ANY_OTHER=27;
    public static final int Scenario=7;
    public static final int When=13;
    public static final int ScenarioOutline=4;
    public static final int VerticalLine=18;
    public static final int And=14;
    public static final int RULE_INT=22;
    public static final int RULE_ML_COMMENT=24;
    public static final int Rule=11;
    public static final int Examples=6;

    // delegates
    // delegators


        public InternalGherkinParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGherkinParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGherkinParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGherkinParser.g"; }


    	private GherkinGrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Backspace", "'\b'");
    		tokenNameToValue.put("Asterisk", "'*'");
    		tokenNameToValue.put("VerticalLine", "'|'");
    		tokenNameToValue.put("And", "'And'");
    		tokenNameToValue.put("But", "'But'");
    		tokenNameToValue.put("Then", "'Then'");
    		tokenNameToValue.put("When", "'When'");
    		tokenNameToValue.put("Given", "'Given'");
    		tokenNameToValue.put("Rule", "'Rule:'");
    		tokenNameToValue.put("Example", "'Example:'");
    		tokenNameToValue.put("Feature", "'Feature:'");
    		tokenNameToValue.put("Examples", "'Examples:'");
    		tokenNameToValue.put("Scenario", "'Scenario:'");
    		tokenNameToValue.put("Background", "'Background:'");
    		tokenNameToValue.put("ScenarioOutline", "'Scenario Outline:'");
    	}

    	public void setGrammarAccess(GherkinGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleGherkin_Language"
    // InternalGherkinParser.g:70:1: entryRuleGherkin_Language : ruleGherkin_Language EOF ;
    public final void entryRuleGherkin_Language() throws RecognitionException {
        try {
            // InternalGherkinParser.g:71:1: ( ruleGherkin_Language EOF )
            // InternalGherkinParser.g:72:1: ruleGherkin_Language EOF
            {
             before(grammarAccess.getGherkin_LanguageRule()); 
            pushFollow(FOLLOW_1);
            ruleGherkin_Language();

            state._fsp--;

             after(grammarAccess.getGherkin_LanguageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGherkin_Language"


    // $ANTLR start "ruleGherkin_Language"
    // InternalGherkinParser.g:79:1: ruleGherkin_Language : ( ( rule__Gherkin_Language__Alternatives ) ) ;
    public final void ruleGherkin_Language() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:83:2: ( ( ( rule__Gherkin_Language__Alternatives ) ) )
            // InternalGherkinParser.g:84:2: ( ( rule__Gherkin_Language__Alternatives ) )
            {
            // InternalGherkinParser.g:84:2: ( ( rule__Gherkin_Language__Alternatives ) )
            // InternalGherkinParser.g:85:3: ( rule__Gherkin_Language__Alternatives )
            {
             before(grammarAccess.getGherkin_LanguageAccess().getAlternatives()); 
            // InternalGherkinParser.g:86:3: ( rule__Gherkin_Language__Alternatives )
            // InternalGherkinParser.g:86:4: rule__Gherkin_Language__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Gherkin_Language__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGherkin_LanguageAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGherkin_Language"


    // $ANTLR start "entryRuleFeature"
    // InternalGherkinParser.g:95:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalGherkinParser.g:96:1: ( ruleFeature EOF )
            // InternalGherkinParser.g:97:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalGherkinParser.g:104:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:108:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalGherkinParser.g:109:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalGherkinParser.g:109:2: ( ( rule__Feature__Group__0 ) )
            // InternalGherkinParser.g:110:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalGherkinParser.g:111:3: ( rule__Feature__Group__0 )
            // InternalGherkinParser.g:111:4: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleBackground"
    // InternalGherkinParser.g:120:1: entryRuleBackground : ruleBackground EOF ;
    public final void entryRuleBackground() throws RecognitionException {
        try {
            // InternalGherkinParser.g:121:1: ( ruleBackground EOF )
            // InternalGherkinParser.g:122:1: ruleBackground EOF
            {
             before(grammarAccess.getBackgroundRule()); 
            pushFollow(FOLLOW_1);
            ruleBackground();

            state._fsp--;

             after(grammarAccess.getBackgroundRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBackground"


    // $ANTLR start "ruleBackground"
    // InternalGherkinParser.g:129:1: ruleBackground : ( ( rule__Background__Group__0 ) ) ;
    public final void ruleBackground() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:133:2: ( ( ( rule__Background__Group__0 ) ) )
            // InternalGherkinParser.g:134:2: ( ( rule__Background__Group__0 ) )
            {
            // InternalGherkinParser.g:134:2: ( ( rule__Background__Group__0 ) )
            // InternalGherkinParser.g:135:3: ( rule__Background__Group__0 )
            {
             before(grammarAccess.getBackgroundAccess().getGroup()); 
            // InternalGherkinParser.g:136:3: ( rule__Background__Group__0 )
            // InternalGherkinParser.g:136:4: rule__Background__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Background__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBackgroundAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBackground"


    // $ANTLR start "entryRuleScenario"
    // InternalGherkinParser.g:145:1: entryRuleScenario : ruleScenario EOF ;
    public final void entryRuleScenario() throws RecognitionException {
        try {
            // InternalGherkinParser.g:146:1: ( ruleScenario EOF )
            // InternalGherkinParser.g:147:1: ruleScenario EOF
            {
             before(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_1);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getScenarioRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // InternalGherkinParser.g:154:1: ruleScenario : ( ( rule__Scenario__Alternatives ) ) ;
    public final void ruleScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:158:2: ( ( ( rule__Scenario__Alternatives ) ) )
            // InternalGherkinParser.g:159:2: ( ( rule__Scenario__Alternatives ) )
            {
            // InternalGherkinParser.g:159:2: ( ( rule__Scenario__Alternatives ) )
            // InternalGherkinParser.g:160:3: ( rule__Scenario__Alternatives )
            {
             before(grammarAccess.getScenarioAccess().getAlternatives()); 
            // InternalGherkinParser.g:161:3: ( rule__Scenario__Alternatives )
            // InternalGherkinParser.g:161:4: rule__Scenario__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleNormal_Scenario"
    // InternalGherkinParser.g:170:1: entryRuleNormal_Scenario : ruleNormal_Scenario EOF ;
    public final void entryRuleNormal_Scenario() throws RecognitionException {
        try {
            // InternalGherkinParser.g:171:1: ( ruleNormal_Scenario EOF )
            // InternalGherkinParser.g:172:1: ruleNormal_Scenario EOF
            {
             before(grammarAccess.getNormal_ScenarioRule()); 
            pushFollow(FOLLOW_1);
            ruleNormal_Scenario();

            state._fsp--;

             after(grammarAccess.getNormal_ScenarioRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNormal_Scenario"


    // $ANTLR start "ruleNormal_Scenario"
    // InternalGherkinParser.g:179:1: ruleNormal_Scenario : ( ( rule__Normal_Scenario__Group__0 ) ) ;
    public final void ruleNormal_Scenario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:183:2: ( ( ( rule__Normal_Scenario__Group__0 ) ) )
            // InternalGherkinParser.g:184:2: ( ( rule__Normal_Scenario__Group__0 ) )
            {
            // InternalGherkinParser.g:184:2: ( ( rule__Normal_Scenario__Group__0 ) )
            // InternalGherkinParser.g:185:3: ( rule__Normal_Scenario__Group__0 )
            {
             before(grammarAccess.getNormal_ScenarioAccess().getGroup()); 
            // InternalGherkinParser.g:186:3: ( rule__Normal_Scenario__Group__0 )
            // InternalGherkinParser.g:186:4: rule__Normal_Scenario__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Normal_Scenario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNormal_ScenarioAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNormal_Scenario"


    // $ANTLR start "entryRuleScenario_Outline"
    // InternalGherkinParser.g:195:1: entryRuleScenario_Outline : ruleScenario_Outline EOF ;
    public final void entryRuleScenario_Outline() throws RecognitionException {
        try {
            // InternalGherkinParser.g:196:1: ( ruleScenario_Outline EOF )
            // InternalGherkinParser.g:197:1: ruleScenario_Outline EOF
            {
             before(grammarAccess.getScenario_OutlineRule()); 
            pushFollow(FOLLOW_1);
            ruleScenario_Outline();

            state._fsp--;

             after(grammarAccess.getScenario_OutlineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScenario_Outline"


    // $ANTLR start "ruleScenario_Outline"
    // InternalGherkinParser.g:204:1: ruleScenario_Outline : ( ( rule__Scenario_Outline__Group__0 ) ) ;
    public final void ruleScenario_Outline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:208:2: ( ( ( rule__Scenario_Outline__Group__0 ) ) )
            // InternalGherkinParser.g:209:2: ( ( rule__Scenario_Outline__Group__0 ) )
            {
            // InternalGherkinParser.g:209:2: ( ( rule__Scenario_Outline__Group__0 ) )
            // InternalGherkinParser.g:210:3: ( rule__Scenario_Outline__Group__0 )
            {
             before(grammarAccess.getScenario_OutlineAccess().getGroup()); 
            // InternalGherkinParser.g:211:3: ( rule__Scenario_Outline__Group__0 )
            // InternalGherkinParser.g:211:4: rule__Scenario_Outline__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Scenario_Outline__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScenario_OutlineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScenario_Outline"


    // $ANTLR start "entryRuleExamples"
    // InternalGherkinParser.g:220:1: entryRuleExamples : ruleExamples EOF ;
    public final void entryRuleExamples() throws RecognitionException {
        try {
            // InternalGherkinParser.g:221:1: ( ruleExamples EOF )
            // InternalGherkinParser.g:222:1: ruleExamples EOF
            {
             before(grammarAccess.getExamplesRule()); 
            pushFollow(FOLLOW_1);
            ruleExamples();

            state._fsp--;

             after(grammarAccess.getExamplesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExamples"


    // $ANTLR start "ruleExamples"
    // InternalGherkinParser.g:229:1: ruleExamples : ( ( rule__Examples__Group__0 ) ) ;
    public final void ruleExamples() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:233:2: ( ( ( rule__Examples__Group__0 ) ) )
            // InternalGherkinParser.g:234:2: ( ( rule__Examples__Group__0 ) )
            {
            // InternalGherkinParser.g:234:2: ( ( rule__Examples__Group__0 ) )
            // InternalGherkinParser.g:235:3: ( rule__Examples__Group__0 )
            {
             before(grammarAccess.getExamplesAccess().getGroup()); 
            // InternalGherkinParser.g:236:3: ( rule__Examples__Group__0 )
            // InternalGherkinParser.g:236:4: rule__Examples__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Examples__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExamplesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExamples"


    // $ANTLR start "entryRuleExamples_row"
    // InternalGherkinParser.g:245:1: entryRuleExamples_row : ruleExamples_row EOF ;
    public final void entryRuleExamples_row() throws RecognitionException {
        try {
            // InternalGherkinParser.g:246:1: ( ruleExamples_row EOF )
            // InternalGherkinParser.g:247:1: ruleExamples_row EOF
            {
             before(grammarAccess.getExamples_rowRule()); 
            pushFollow(FOLLOW_1);
            ruleExamples_row();

            state._fsp--;

             after(grammarAccess.getExamples_rowRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExamples_row"


    // $ANTLR start "ruleExamples_row"
    // InternalGherkinParser.g:254:1: ruleExamples_row : ( ( rule__Examples_row__Group__0 ) ) ;
    public final void ruleExamples_row() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:258:2: ( ( ( rule__Examples_row__Group__0 ) ) )
            // InternalGherkinParser.g:259:2: ( ( rule__Examples_row__Group__0 ) )
            {
            // InternalGherkinParser.g:259:2: ( ( rule__Examples_row__Group__0 ) )
            // InternalGherkinParser.g:260:3: ( rule__Examples_row__Group__0 )
            {
             before(grammarAccess.getExamples_rowAccess().getGroup()); 
            // InternalGherkinParser.g:261:3: ( rule__Examples_row__Group__0 )
            // InternalGherkinParser.g:261:4: rule__Examples_row__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Examples_row__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExamples_rowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExamples_row"


    // $ANTLR start "entryRuleRule"
    // InternalGherkinParser.g:270:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalGherkinParser.g:271:1: ( ruleRule EOF )
            // InternalGherkinParser.g:272:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalGherkinParser.g:279:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:283:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalGherkinParser.g:284:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalGherkinParser.g:284:2: ( ( rule__Rule__Group__0 ) )
            // InternalGherkinParser.g:285:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalGherkinParser.g:286:3: ( rule__Rule__Group__0 )
            // InternalGherkinParser.g:286:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleExample"
    // InternalGherkinParser.g:295:1: entryRuleExample : ruleExample EOF ;
    public final void entryRuleExample() throws RecognitionException {
        try {
            // InternalGherkinParser.g:296:1: ( ruleExample EOF )
            // InternalGherkinParser.g:297:1: ruleExample EOF
            {
             before(grammarAccess.getExampleRule()); 
            pushFollow(FOLLOW_1);
            ruleExample();

            state._fsp--;

             after(grammarAccess.getExampleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExample"


    // $ANTLR start "ruleExample"
    // InternalGherkinParser.g:304:1: ruleExample : ( ( rule__Example__Group__0 ) ) ;
    public final void ruleExample() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:308:2: ( ( ( rule__Example__Group__0 ) ) )
            // InternalGherkinParser.g:309:2: ( ( rule__Example__Group__0 ) )
            {
            // InternalGherkinParser.g:309:2: ( ( rule__Example__Group__0 ) )
            // InternalGherkinParser.g:310:3: ( rule__Example__Group__0 )
            {
             before(grammarAccess.getExampleAccess().getGroup()); 
            // InternalGherkinParser.g:311:3: ( rule__Example__Group__0 )
            // InternalGherkinParser.g:311:4: rule__Example__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Example__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExample"


    // $ANTLR start "entryRuleChain_Steps"
    // InternalGherkinParser.g:320:1: entryRuleChain_Steps : ruleChain_Steps EOF ;
    public final void entryRuleChain_Steps() throws RecognitionException {
        try {
            // InternalGherkinParser.g:321:1: ( ruleChain_Steps EOF )
            // InternalGherkinParser.g:322:1: ruleChain_Steps EOF
            {
             before(grammarAccess.getChain_StepsRule()); 
            pushFollow(FOLLOW_1);
            ruleChain_Steps();

            state._fsp--;

             after(grammarAccess.getChain_StepsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChain_Steps"


    // $ANTLR start "ruleChain_Steps"
    // InternalGherkinParser.g:329:1: ruleChain_Steps : ( ( rule__Chain_Steps__Group__0 ) ) ;
    public final void ruleChain_Steps() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:333:2: ( ( ( rule__Chain_Steps__Group__0 ) ) )
            // InternalGherkinParser.g:334:2: ( ( rule__Chain_Steps__Group__0 ) )
            {
            // InternalGherkinParser.g:334:2: ( ( rule__Chain_Steps__Group__0 ) )
            // InternalGherkinParser.g:335:3: ( rule__Chain_Steps__Group__0 )
            {
             before(grammarAccess.getChain_StepsAccess().getGroup()); 
            // InternalGherkinParser.g:336:3: ( rule__Chain_Steps__Group__0 )
            // InternalGherkinParser.g:336:4: rule__Chain_Steps__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Chain_Steps__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChain_StepsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChain_Steps"


    // $ANTLR start "entryRuleSteps"
    // InternalGherkinParser.g:345:1: entryRuleSteps : ruleSteps EOF ;
    public final void entryRuleSteps() throws RecognitionException {
        try {
            // InternalGherkinParser.g:346:1: ( ruleSteps EOF )
            // InternalGherkinParser.g:347:1: ruleSteps EOF
            {
             before(grammarAccess.getStepsRule()); 
            pushFollow(FOLLOW_1);
            ruleSteps();

            state._fsp--;

             after(grammarAccess.getStepsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSteps"


    // $ANTLR start "ruleSteps"
    // InternalGherkinParser.g:354:1: ruleSteps : ( ( rule__Steps__Alternatives ) ) ;
    public final void ruleSteps() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:358:2: ( ( ( rule__Steps__Alternatives ) ) )
            // InternalGherkinParser.g:359:2: ( ( rule__Steps__Alternatives ) )
            {
            // InternalGherkinParser.g:359:2: ( ( rule__Steps__Alternatives ) )
            // InternalGherkinParser.g:360:3: ( rule__Steps__Alternatives )
            {
             before(grammarAccess.getStepsAccess().getAlternatives()); 
            // InternalGherkinParser.g:361:3: ( rule__Steps__Alternatives )
            // InternalGherkinParser.g:361:4: rule__Steps__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Steps__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStepsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSteps"


    // $ANTLR start "entryRuleGiven_Statement"
    // InternalGherkinParser.g:370:1: entryRuleGiven_Statement : ruleGiven_Statement EOF ;
    public final void entryRuleGiven_Statement() throws RecognitionException {
        try {
            // InternalGherkinParser.g:371:1: ( ruleGiven_Statement EOF )
            // InternalGherkinParser.g:372:1: ruleGiven_Statement EOF
            {
             before(grammarAccess.getGiven_StatementRule()); 
            pushFollow(FOLLOW_1);
            ruleGiven_Statement();

            state._fsp--;

             after(grammarAccess.getGiven_StatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGiven_Statement"


    // $ANTLR start "ruleGiven_Statement"
    // InternalGherkinParser.g:379:1: ruleGiven_Statement : ( ( rule__Given_Statement__Group__0 ) ) ;
    public final void ruleGiven_Statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:383:2: ( ( ( rule__Given_Statement__Group__0 ) ) )
            // InternalGherkinParser.g:384:2: ( ( rule__Given_Statement__Group__0 ) )
            {
            // InternalGherkinParser.g:384:2: ( ( rule__Given_Statement__Group__0 ) )
            // InternalGherkinParser.g:385:3: ( rule__Given_Statement__Group__0 )
            {
             before(grammarAccess.getGiven_StatementAccess().getGroup()); 
            // InternalGherkinParser.g:386:3: ( rule__Given_Statement__Group__0 )
            // InternalGherkinParser.g:386:4: rule__Given_Statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Given_Statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGiven_StatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGiven_Statement"


    // $ANTLR start "entryRuleWhen_Statement"
    // InternalGherkinParser.g:395:1: entryRuleWhen_Statement : ruleWhen_Statement EOF ;
    public final void entryRuleWhen_Statement() throws RecognitionException {
        try {
            // InternalGherkinParser.g:396:1: ( ruleWhen_Statement EOF )
            // InternalGherkinParser.g:397:1: ruleWhen_Statement EOF
            {
             before(grammarAccess.getWhen_StatementRule()); 
            pushFollow(FOLLOW_1);
            ruleWhen_Statement();

            state._fsp--;

             after(grammarAccess.getWhen_StatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhen_Statement"


    // $ANTLR start "ruleWhen_Statement"
    // InternalGherkinParser.g:404:1: ruleWhen_Statement : ( ( rule__When_Statement__Group__0 ) ) ;
    public final void ruleWhen_Statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:408:2: ( ( ( rule__When_Statement__Group__0 ) ) )
            // InternalGherkinParser.g:409:2: ( ( rule__When_Statement__Group__0 ) )
            {
            // InternalGherkinParser.g:409:2: ( ( rule__When_Statement__Group__0 ) )
            // InternalGherkinParser.g:410:3: ( rule__When_Statement__Group__0 )
            {
             before(grammarAccess.getWhen_StatementAccess().getGroup()); 
            // InternalGherkinParser.g:411:3: ( rule__When_Statement__Group__0 )
            // InternalGherkinParser.g:411:4: rule__When_Statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__When_Statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhen_StatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhen_Statement"


    // $ANTLR start "entryRuleThen_Statement"
    // InternalGherkinParser.g:420:1: entryRuleThen_Statement : ruleThen_Statement EOF ;
    public final void entryRuleThen_Statement() throws RecognitionException {
        try {
            // InternalGherkinParser.g:421:1: ( ruleThen_Statement EOF )
            // InternalGherkinParser.g:422:1: ruleThen_Statement EOF
            {
             before(grammarAccess.getThen_StatementRule()); 
            pushFollow(FOLLOW_1);
            ruleThen_Statement();

            state._fsp--;

             after(grammarAccess.getThen_StatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleThen_Statement"


    // $ANTLR start "ruleThen_Statement"
    // InternalGherkinParser.g:429:1: ruleThen_Statement : ( ( rule__Then_Statement__Group__0 ) ) ;
    public final void ruleThen_Statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:433:2: ( ( ( rule__Then_Statement__Group__0 ) ) )
            // InternalGherkinParser.g:434:2: ( ( rule__Then_Statement__Group__0 ) )
            {
            // InternalGherkinParser.g:434:2: ( ( rule__Then_Statement__Group__0 ) )
            // InternalGherkinParser.g:435:3: ( rule__Then_Statement__Group__0 )
            {
             before(grammarAccess.getThen_StatementAccess().getGroup()); 
            // InternalGherkinParser.g:436:3: ( rule__Then_Statement__Group__0 )
            // InternalGherkinParser.g:436:4: rule__Then_Statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Then_Statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getThen_StatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleThen_Statement"


    // $ANTLR start "entryRuleBut_Statement"
    // InternalGherkinParser.g:445:1: entryRuleBut_Statement : ruleBut_Statement EOF ;
    public final void entryRuleBut_Statement() throws RecognitionException {
        try {
            // InternalGherkinParser.g:446:1: ( ruleBut_Statement EOF )
            // InternalGherkinParser.g:447:1: ruleBut_Statement EOF
            {
             before(grammarAccess.getBut_StatementRule()); 
            pushFollow(FOLLOW_1);
            ruleBut_Statement();

            state._fsp--;

             after(grammarAccess.getBut_StatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBut_Statement"


    // $ANTLR start "ruleBut_Statement"
    // InternalGherkinParser.g:454:1: ruleBut_Statement : ( ( rule__But_Statement__Group__0 ) ) ;
    public final void ruleBut_Statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:458:2: ( ( ( rule__But_Statement__Group__0 ) ) )
            // InternalGherkinParser.g:459:2: ( ( rule__But_Statement__Group__0 ) )
            {
            // InternalGherkinParser.g:459:2: ( ( rule__But_Statement__Group__0 ) )
            // InternalGherkinParser.g:460:3: ( rule__But_Statement__Group__0 )
            {
             before(grammarAccess.getBut_StatementAccess().getGroup()); 
            // InternalGherkinParser.g:461:3: ( rule__But_Statement__Group__0 )
            // InternalGherkinParser.g:461:4: rule__But_Statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__But_Statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBut_StatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBut_Statement"


    // $ANTLR start "entryRuleAnd_Statement"
    // InternalGherkinParser.g:470:1: entryRuleAnd_Statement : ruleAnd_Statement EOF ;
    public final void entryRuleAnd_Statement() throws RecognitionException {
        try {
            // InternalGherkinParser.g:471:1: ( ruleAnd_Statement EOF )
            // InternalGherkinParser.g:472:1: ruleAnd_Statement EOF
            {
             before(grammarAccess.getAnd_StatementRule()); 
            pushFollow(FOLLOW_1);
            ruleAnd_Statement();

            state._fsp--;

             after(grammarAccess.getAnd_StatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnd_Statement"


    // $ANTLR start "ruleAnd_Statement"
    // InternalGherkinParser.g:479:1: ruleAnd_Statement : ( ( rule__And_Statement__Group__0 ) ) ;
    public final void ruleAnd_Statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:483:2: ( ( ( rule__And_Statement__Group__0 ) ) )
            // InternalGherkinParser.g:484:2: ( ( rule__And_Statement__Group__0 ) )
            {
            // InternalGherkinParser.g:484:2: ( ( rule__And_Statement__Group__0 ) )
            // InternalGherkinParser.g:485:3: ( rule__And_Statement__Group__0 )
            {
             before(grammarAccess.getAnd_StatementAccess().getGroup()); 
            // InternalGherkinParser.g:486:3: ( rule__And_Statement__Group__0 )
            // InternalGherkinParser.g:486:4: rule__And_Statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And_Statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnd_StatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnd_Statement"


    // $ANTLR start "entryRuleStar_Statement"
    // InternalGherkinParser.g:495:1: entryRuleStar_Statement : ruleStar_Statement EOF ;
    public final void entryRuleStar_Statement() throws RecognitionException {
        try {
            // InternalGherkinParser.g:496:1: ( ruleStar_Statement EOF )
            // InternalGherkinParser.g:497:1: ruleStar_Statement EOF
            {
             before(grammarAccess.getStar_StatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStar_Statement();

            state._fsp--;

             after(grammarAccess.getStar_StatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStar_Statement"


    // $ANTLR start "ruleStar_Statement"
    // InternalGherkinParser.g:504:1: ruleStar_Statement : ( ( rule__Star_Statement__Group__0 ) ) ;
    public final void ruleStar_Statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:508:2: ( ( ( rule__Star_Statement__Group__0 ) ) )
            // InternalGherkinParser.g:509:2: ( ( rule__Star_Statement__Group__0 ) )
            {
            // InternalGherkinParser.g:509:2: ( ( rule__Star_Statement__Group__0 ) )
            // InternalGherkinParser.g:510:3: ( rule__Star_Statement__Group__0 )
            {
             before(grammarAccess.getStar_StatementAccess().getGroup()); 
            // InternalGherkinParser.g:511:3: ( rule__Star_Statement__Group__0 )
            // InternalGherkinParser.g:511:4: rule__Star_Statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Star_Statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStar_StatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStar_Statement"


    // $ANTLR start "entryRuleDescription"
    // InternalGherkinParser.g:520:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalGherkinParser.g:521:1: ( ruleDescription EOF )
            // InternalGherkinParser.g:522:1: ruleDescription EOF
            {
             before(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getDescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalGherkinParser.g:529:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:533:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalGherkinParser.g:534:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalGherkinParser.g:534:2: ( ( rule__Description__Group__0 ) )
            // InternalGherkinParser.g:535:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalGherkinParser.g:536:3: ( rule__Description__Group__0 )
            // InternalGherkinParser.g:536:4: rule__Description__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleSentence"
    // InternalGherkinParser.g:545:1: entryRuleSentence : ruleSentence EOF ;
    public final void entryRuleSentence() throws RecognitionException {
        try {
            // InternalGherkinParser.g:546:1: ( ruleSentence EOF )
            // InternalGherkinParser.g:547:1: ruleSentence EOF
            {
             before(grammarAccess.getSentenceRule()); 
            pushFollow(FOLLOW_1);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getSentenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSentence"


    // $ANTLR start "ruleSentence"
    // InternalGherkinParser.g:554:1: ruleSentence : ( ( rule__Sentence__Alternatives ) ) ;
    public final void ruleSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:558:2: ( ( ( rule__Sentence__Alternatives ) ) )
            // InternalGherkinParser.g:559:2: ( ( rule__Sentence__Alternatives ) )
            {
            // InternalGherkinParser.g:559:2: ( ( rule__Sentence__Alternatives ) )
            // InternalGherkinParser.g:560:3: ( rule__Sentence__Alternatives )
            {
             before(grammarAccess.getSentenceAccess().getAlternatives()); 
            // InternalGherkinParser.g:561:3: ( rule__Sentence__Alternatives )
            // InternalGherkinParser.g:561:4: rule__Sentence__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Sentence__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSentence"


    // $ANTLR start "rule__Gherkin_Language__Alternatives"
    // InternalGherkinParser.g:569:1: rule__Gherkin_Language__Alternatives : ( ( ( rule__Gherkin_Language__FeaturesAssignment_0 )* ) | ( ( rule__Gherkin_Language__RulesAssignment_1 )* ) );
    public final void rule__Gherkin_Language__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:573:1: ( ( ( rule__Gherkin_Language__FeaturesAssignment_0 )* ) | ( ( rule__Gherkin_Language__RulesAssignment_1 )* ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case Feature:
                {
                alt3=1;
                }
                break;
            case EOF:
                {
                alt3=1;
                }
                break;
            case Rule:
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGherkinParser.g:574:2: ( ( rule__Gherkin_Language__FeaturesAssignment_0 )* )
                    {
                    // InternalGherkinParser.g:574:2: ( ( rule__Gherkin_Language__FeaturesAssignment_0 )* )
                    // InternalGherkinParser.g:575:3: ( rule__Gherkin_Language__FeaturesAssignment_0 )*
                    {
                     before(grammarAccess.getGherkin_LanguageAccess().getFeaturesAssignment_0()); 
                    // InternalGherkinParser.g:576:3: ( rule__Gherkin_Language__FeaturesAssignment_0 )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==Feature) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalGherkinParser.g:576:4: rule__Gherkin_Language__FeaturesAssignment_0
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__Gherkin_Language__FeaturesAssignment_0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                     after(grammarAccess.getGherkin_LanguageAccess().getFeaturesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGherkinParser.g:580:2: ( ( rule__Gherkin_Language__RulesAssignment_1 )* )
                    {
                    // InternalGherkinParser.g:580:2: ( ( rule__Gherkin_Language__RulesAssignment_1 )* )
                    // InternalGherkinParser.g:581:3: ( rule__Gherkin_Language__RulesAssignment_1 )*
                    {
                     before(grammarAccess.getGherkin_LanguageAccess().getRulesAssignment_1()); 
                    // InternalGherkinParser.g:582:3: ( rule__Gherkin_Language__RulesAssignment_1 )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==Rule) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalGherkinParser.g:582:4: rule__Gherkin_Language__RulesAssignment_1
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__Gherkin_Language__RulesAssignment_1();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                     after(grammarAccess.getGherkin_LanguageAccess().getRulesAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gherkin_Language__Alternatives"


    // $ANTLR start "rule__Scenario__Alternatives"
    // InternalGherkinParser.g:590:1: rule__Scenario__Alternatives : ( ( ruleNormal_Scenario ) | ( ruleScenario_Outline ) );
    public final void rule__Scenario__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:594:1: ( ( ruleNormal_Scenario ) | ( ruleScenario_Outline ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Scenario) ) {
                alt4=1;
            }
            else if ( (LA4_0==ScenarioOutline) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGherkinParser.g:595:2: ( ruleNormal_Scenario )
                    {
                    // InternalGherkinParser.g:595:2: ( ruleNormal_Scenario )
                    // InternalGherkinParser.g:596:3: ruleNormal_Scenario
                    {
                     before(grammarAccess.getScenarioAccess().getNormal_ScenarioParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNormal_Scenario();

                    state._fsp--;

                     after(grammarAccess.getScenarioAccess().getNormal_ScenarioParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGherkinParser.g:601:2: ( ruleScenario_Outline )
                    {
                    // InternalGherkinParser.g:601:2: ( ruleScenario_Outline )
                    // InternalGherkinParser.g:602:3: ruleScenario_Outline
                    {
                     before(grammarAccess.getScenarioAccess().getScenario_OutlineParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleScenario_Outline();

                    state._fsp--;

                     after(grammarAccess.getScenarioAccess().getScenario_OutlineParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Alternatives"


    // $ANTLR start "rule__Steps__Alternatives"
    // InternalGherkinParser.g:611:1: rule__Steps__Alternatives : ( ( ( rule__Steps__Given_stepAssignment_0 ) ) | ( ( rule__Steps__When_stepAssignment_1 ) ) | ( ( rule__Steps__But_stepAssignment_2 ) ) | ( ( rule__Steps__Then_stepAssignment_3 ) ) | ( ( rule__Steps__And_stepAssignment_4 ) ) | ( ( rule__Steps__Star_stepAssignment_5 ) ) );
    public final void rule__Steps__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:615:1: ( ( ( rule__Steps__Given_stepAssignment_0 ) ) | ( ( rule__Steps__When_stepAssignment_1 ) ) | ( ( rule__Steps__But_stepAssignment_2 ) ) | ( ( rule__Steps__Then_stepAssignment_3 ) ) | ( ( rule__Steps__And_stepAssignment_4 ) ) | ( ( rule__Steps__Star_stepAssignment_5 ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case Given:
                {
                alt5=1;
                }
                break;
            case When:
                {
                alt5=2;
                }
                break;
            case But:
                {
                alt5=3;
                }
                break;
            case Then:
                {
                alt5=4;
                }
                break;
            case And:
                {
                alt5=5;
                }
                break;
            case Asterisk:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalGherkinParser.g:616:2: ( ( rule__Steps__Given_stepAssignment_0 ) )
                    {
                    // InternalGherkinParser.g:616:2: ( ( rule__Steps__Given_stepAssignment_0 ) )
                    // InternalGherkinParser.g:617:3: ( rule__Steps__Given_stepAssignment_0 )
                    {
                     before(grammarAccess.getStepsAccess().getGiven_stepAssignment_0()); 
                    // InternalGherkinParser.g:618:3: ( rule__Steps__Given_stepAssignment_0 )
                    // InternalGherkinParser.g:618:4: rule__Steps__Given_stepAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Steps__Given_stepAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStepsAccess().getGiven_stepAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGherkinParser.g:622:2: ( ( rule__Steps__When_stepAssignment_1 ) )
                    {
                    // InternalGherkinParser.g:622:2: ( ( rule__Steps__When_stepAssignment_1 ) )
                    // InternalGherkinParser.g:623:3: ( rule__Steps__When_stepAssignment_1 )
                    {
                     before(grammarAccess.getStepsAccess().getWhen_stepAssignment_1()); 
                    // InternalGherkinParser.g:624:3: ( rule__Steps__When_stepAssignment_1 )
                    // InternalGherkinParser.g:624:4: rule__Steps__When_stepAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Steps__When_stepAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStepsAccess().getWhen_stepAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGherkinParser.g:628:2: ( ( rule__Steps__But_stepAssignment_2 ) )
                    {
                    // InternalGherkinParser.g:628:2: ( ( rule__Steps__But_stepAssignment_2 ) )
                    // InternalGherkinParser.g:629:3: ( rule__Steps__But_stepAssignment_2 )
                    {
                     before(grammarAccess.getStepsAccess().getBut_stepAssignment_2()); 
                    // InternalGherkinParser.g:630:3: ( rule__Steps__But_stepAssignment_2 )
                    // InternalGherkinParser.g:630:4: rule__Steps__But_stepAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Steps__But_stepAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getStepsAccess().getBut_stepAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGherkinParser.g:634:2: ( ( rule__Steps__Then_stepAssignment_3 ) )
                    {
                    // InternalGherkinParser.g:634:2: ( ( rule__Steps__Then_stepAssignment_3 ) )
                    // InternalGherkinParser.g:635:3: ( rule__Steps__Then_stepAssignment_3 )
                    {
                     before(grammarAccess.getStepsAccess().getThen_stepAssignment_3()); 
                    // InternalGherkinParser.g:636:3: ( rule__Steps__Then_stepAssignment_3 )
                    // InternalGherkinParser.g:636:4: rule__Steps__Then_stepAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Steps__Then_stepAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getStepsAccess().getThen_stepAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGherkinParser.g:640:2: ( ( rule__Steps__And_stepAssignment_4 ) )
                    {
                    // InternalGherkinParser.g:640:2: ( ( rule__Steps__And_stepAssignment_4 ) )
                    // InternalGherkinParser.g:641:3: ( rule__Steps__And_stepAssignment_4 )
                    {
                     before(grammarAccess.getStepsAccess().getAnd_stepAssignment_4()); 
                    // InternalGherkinParser.g:642:3: ( rule__Steps__And_stepAssignment_4 )
                    // InternalGherkinParser.g:642:4: rule__Steps__And_stepAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Steps__And_stepAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getStepsAccess().getAnd_stepAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGherkinParser.g:646:2: ( ( rule__Steps__Star_stepAssignment_5 ) )
                    {
                    // InternalGherkinParser.g:646:2: ( ( rule__Steps__Star_stepAssignment_5 ) )
                    // InternalGherkinParser.g:647:3: ( rule__Steps__Star_stepAssignment_5 )
                    {
                     before(grammarAccess.getStepsAccess().getStar_stepAssignment_5()); 
                    // InternalGherkinParser.g:648:3: ( rule__Steps__Star_stepAssignment_5 )
                    // InternalGherkinParser.g:648:4: rule__Steps__Star_stepAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Steps__Star_stepAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getStepsAccess().getStar_stepAssignment_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Steps__Alternatives"


    // $ANTLR start "rule__Sentence__Alternatives"
    // InternalGherkinParser.g:656:1: rule__Sentence__Alternatives : ( ( RULE_ID ) | ( Backspace ) | ( RULE_STRING ) );
    public final void rule__Sentence__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:660:1: ( ( RULE_ID ) | ( Backspace ) | ( RULE_STRING ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case Backspace:
                {
                alt6=2;
                }
                break;
            case RULE_STRING:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalGherkinParser.g:661:2: ( RULE_ID )
                    {
                    // InternalGherkinParser.g:661:2: ( RULE_ID )
                    // InternalGherkinParser.g:662:3: RULE_ID
                    {
                     before(grammarAccess.getSentenceAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getSentenceAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGherkinParser.g:667:2: ( Backspace )
                    {
                    // InternalGherkinParser.g:667:2: ( Backspace )
                    // InternalGherkinParser.g:668:3: Backspace
                    {
                     before(grammarAccess.getSentenceAccess().getBackspaceKeyword_1()); 
                    match(input,Backspace,FOLLOW_2); 
                     after(grammarAccess.getSentenceAccess().getBackspaceKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGherkinParser.g:673:2: ( RULE_STRING )
                    {
                    // InternalGherkinParser.g:673:2: ( RULE_STRING )
                    // InternalGherkinParser.g:674:3: RULE_STRING
                    {
                     before(grammarAccess.getSentenceAccess().getSTRINGTerminalRuleCall_2()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getSentenceAccess().getSTRINGTerminalRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__Alternatives"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalGherkinParser.g:683:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:687:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalGherkinParser.g:688:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // InternalGherkinParser.g:695:1: rule__Feature__Group__0__Impl : ( Feature ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:699:1: ( ( Feature ) )
            // InternalGherkinParser.g:700:1: ( Feature )
            {
            // InternalGherkinParser.g:700:1: ( Feature )
            // InternalGherkinParser.g:701:2: Feature
            {
             before(grammarAccess.getFeatureAccess().getFeatureKeyword_0()); 
            match(input,Feature,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getFeatureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // InternalGherkinParser.g:710:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:714:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalGherkinParser.g:715:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // InternalGherkinParser.g:722:1: rule__Feature__Group__1__Impl : ( ruleDescription ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:726:1: ( ( ruleDescription ) )
            // InternalGherkinParser.g:727:1: ( ruleDescription )
            {
            // InternalGherkinParser.g:727:1: ( ruleDescription )
            // InternalGherkinParser.g:728:2: ruleDescription
            {
             before(grammarAccess.getFeatureAccess().getDescriptionParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getDescriptionParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // InternalGherkinParser.g:737:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:741:1: ( rule__Feature__Group__2__Impl )
            // InternalGherkinParser.g:742:2: rule__Feature__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // InternalGherkinParser.g:748:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__Group_2__0 )? ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:752:1: ( ( ( rule__Feature__Group_2__0 )? ) )
            // InternalGherkinParser.g:753:1: ( ( rule__Feature__Group_2__0 )? )
            {
            // InternalGherkinParser.g:753:1: ( ( rule__Feature__Group_2__0 )? )
            // InternalGherkinParser.g:754:2: ( rule__Feature__Group_2__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_2()); 
            // InternalGherkinParser.g:755:2: ( rule__Feature__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_BEGIN) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGherkinParser.g:755:3: rule__Feature__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group_2__0"
    // InternalGherkinParser.g:764:1: rule__Feature__Group_2__0 : rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1 ;
    public final void rule__Feature__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:768:1: ( rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1 )
            // InternalGherkinParser.g:769:2: rule__Feature__Group_2__0__Impl rule__Feature__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__Feature__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_2__0"


    // $ANTLR start "rule__Feature__Group_2__0__Impl"
    // InternalGherkinParser.g:776:1: rule__Feature__Group_2__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Feature__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:780:1: ( ( RULE_BEGIN ) )
            // InternalGherkinParser.g:781:1: ( RULE_BEGIN )
            {
            // InternalGherkinParser.g:781:1: ( RULE_BEGIN )
            // InternalGherkinParser.g:782:2: RULE_BEGIN
            {
             before(grammarAccess.getFeatureAccess().getBEGINTerminalRuleCall_2_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getBEGINTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_2__0__Impl"


    // $ANTLR start "rule__Feature__Group_2__1"
    // InternalGherkinParser.g:791:1: rule__Feature__Group_2__1 : rule__Feature__Group_2__1__Impl rule__Feature__Group_2__2 ;
    public final void rule__Feature__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:795:1: ( rule__Feature__Group_2__1__Impl rule__Feature__Group_2__2 )
            // InternalGherkinParser.g:796:2: rule__Feature__Group_2__1__Impl rule__Feature__Group_2__2
            {
            pushFollow(FOLLOW_7);
            rule__Feature__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_2__1"


    // $ANTLR start "rule__Feature__Group_2__1__Impl"
    // InternalGherkinParser.g:803:1: rule__Feature__Group_2__1__Impl : ( ( rule__Feature__Feature_backgroundAssignment_2_1 )? ) ;
    public final void rule__Feature__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:807:1: ( ( ( rule__Feature__Feature_backgroundAssignment_2_1 )? ) )
            // InternalGherkinParser.g:808:1: ( ( rule__Feature__Feature_backgroundAssignment_2_1 )? )
            {
            // InternalGherkinParser.g:808:1: ( ( rule__Feature__Feature_backgroundAssignment_2_1 )? )
            // InternalGherkinParser.g:809:2: ( rule__Feature__Feature_backgroundAssignment_2_1 )?
            {
             before(grammarAccess.getFeatureAccess().getFeature_backgroundAssignment_2_1()); 
            // InternalGherkinParser.g:810:2: ( rule__Feature__Feature_backgroundAssignment_2_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Background) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGherkinParser.g:810:3: rule__Feature__Feature_backgroundAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__Feature_backgroundAssignment_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getFeature_backgroundAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_2__1__Impl"


    // $ANTLR start "rule__Feature__Group_2__2"
    // InternalGherkinParser.g:818:1: rule__Feature__Group_2__2 : rule__Feature__Group_2__2__Impl rule__Feature__Group_2__3 ;
    public final void rule__Feature__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:822:1: ( rule__Feature__Group_2__2__Impl rule__Feature__Group_2__3 )
            // InternalGherkinParser.g:823:2: rule__Feature__Group_2__2__Impl rule__Feature__Group_2__3
            {
            pushFollow(FOLLOW_8);
            rule__Feature__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_2__2"


    // $ANTLR start "rule__Feature__Group_2__2__Impl"
    // InternalGherkinParser.g:830:1: rule__Feature__Group_2__2__Impl : ( ( ( rule__Feature__ScenariosAssignment_2_2 ) ) ( ( rule__Feature__ScenariosAssignment_2_2 )* ) ) ;
    public final void rule__Feature__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:834:1: ( ( ( ( rule__Feature__ScenariosAssignment_2_2 ) ) ( ( rule__Feature__ScenariosAssignment_2_2 )* ) ) )
            // InternalGherkinParser.g:835:1: ( ( ( rule__Feature__ScenariosAssignment_2_2 ) ) ( ( rule__Feature__ScenariosAssignment_2_2 )* ) )
            {
            // InternalGherkinParser.g:835:1: ( ( ( rule__Feature__ScenariosAssignment_2_2 ) ) ( ( rule__Feature__ScenariosAssignment_2_2 )* ) )
            // InternalGherkinParser.g:836:2: ( ( rule__Feature__ScenariosAssignment_2_2 ) ) ( ( rule__Feature__ScenariosAssignment_2_2 )* )
            {
            // InternalGherkinParser.g:836:2: ( ( rule__Feature__ScenariosAssignment_2_2 ) )
            // InternalGherkinParser.g:837:3: ( rule__Feature__ScenariosAssignment_2_2 )
            {
             before(grammarAccess.getFeatureAccess().getScenariosAssignment_2_2()); 
            // InternalGherkinParser.g:838:3: ( rule__Feature__ScenariosAssignment_2_2 )
            // InternalGherkinParser.g:838:4: rule__Feature__ScenariosAssignment_2_2
            {
            pushFollow(FOLLOW_9);
            rule__Feature__ScenariosAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getScenariosAssignment_2_2()); 

            }

            // InternalGherkinParser.g:841:2: ( ( rule__Feature__ScenariosAssignment_2_2 )* )
            // InternalGherkinParser.g:842:3: ( rule__Feature__ScenariosAssignment_2_2 )*
            {
             before(grammarAccess.getFeatureAccess().getScenariosAssignment_2_2()); 
            // InternalGherkinParser.g:843:3: ( rule__Feature__ScenariosAssignment_2_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==ScenarioOutline||LA9_0==Scenario) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGherkinParser.g:843:4: rule__Feature__ScenariosAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Feature__ScenariosAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getScenariosAssignment_2_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_2__2__Impl"


    // $ANTLR start "rule__Feature__Group_2__3"
    // InternalGherkinParser.g:852:1: rule__Feature__Group_2__3 : rule__Feature__Group_2__3__Impl ;
    public final void rule__Feature__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:856:1: ( rule__Feature__Group_2__3__Impl )
            // InternalGherkinParser.g:857:2: rule__Feature__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_2__3"


    // $ANTLR start "rule__Feature__Group_2__3__Impl"
    // InternalGherkinParser.g:863:1: rule__Feature__Group_2__3__Impl : ( RULE_END ) ;
    public final void rule__Feature__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:867:1: ( ( RULE_END ) )
            // InternalGherkinParser.g:868:1: ( RULE_END )
            {
            // InternalGherkinParser.g:868:1: ( RULE_END )
            // InternalGherkinParser.g:869:2: RULE_END
            {
             before(grammarAccess.getFeatureAccess().getENDTerminalRuleCall_2_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getENDTerminalRuleCall_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_2__3__Impl"


    // $ANTLR start "rule__Background__Group__0"
    // InternalGherkinParser.g:879:1: rule__Background__Group__0 : rule__Background__Group__0__Impl rule__Background__Group__1 ;
    public final void rule__Background__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:883:1: ( rule__Background__Group__0__Impl rule__Background__Group__1 )
            // InternalGherkinParser.g:884:2: rule__Background__Group__0__Impl rule__Background__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Background__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Background__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group__0"


    // $ANTLR start "rule__Background__Group__0__Impl"
    // InternalGherkinParser.g:891:1: rule__Background__Group__0__Impl : ( ( rule__Background__TitleAssignment_0 ) ) ;
    public final void rule__Background__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:895:1: ( ( ( rule__Background__TitleAssignment_0 ) ) )
            // InternalGherkinParser.g:896:1: ( ( rule__Background__TitleAssignment_0 ) )
            {
            // InternalGherkinParser.g:896:1: ( ( rule__Background__TitleAssignment_0 ) )
            // InternalGherkinParser.g:897:2: ( rule__Background__TitleAssignment_0 )
            {
             before(grammarAccess.getBackgroundAccess().getTitleAssignment_0()); 
            // InternalGherkinParser.g:898:2: ( rule__Background__TitleAssignment_0 )
            // InternalGherkinParser.g:898:3: rule__Background__TitleAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Background__TitleAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBackgroundAccess().getTitleAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group__0__Impl"


    // $ANTLR start "rule__Background__Group__1"
    // InternalGherkinParser.g:906:1: rule__Background__Group__1 : rule__Background__Group__1__Impl ;
    public final void rule__Background__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:910:1: ( rule__Background__Group__1__Impl )
            // InternalGherkinParser.g:911:2: rule__Background__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Background__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group__1"


    // $ANTLR start "rule__Background__Group__1__Impl"
    // InternalGherkinParser.g:917:1: rule__Background__Group__1__Impl : ( ( rule__Background__Group_1__0 ) ) ;
    public final void rule__Background__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:921:1: ( ( ( rule__Background__Group_1__0 ) ) )
            // InternalGherkinParser.g:922:1: ( ( rule__Background__Group_1__0 ) )
            {
            // InternalGherkinParser.g:922:1: ( ( rule__Background__Group_1__0 ) )
            // InternalGherkinParser.g:923:2: ( rule__Background__Group_1__0 )
            {
             before(grammarAccess.getBackgroundAccess().getGroup_1()); 
            // InternalGherkinParser.g:924:2: ( rule__Background__Group_1__0 )
            // InternalGherkinParser.g:924:3: rule__Background__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Background__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getBackgroundAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group__1__Impl"


    // $ANTLR start "rule__Background__Group_1__0"
    // InternalGherkinParser.g:933:1: rule__Background__Group_1__0 : rule__Background__Group_1__0__Impl rule__Background__Group_1__1 ;
    public final void rule__Background__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:937:1: ( rule__Background__Group_1__0__Impl rule__Background__Group_1__1 )
            // InternalGherkinParser.g:938:2: rule__Background__Group_1__0__Impl rule__Background__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Background__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Background__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group_1__0"


    // $ANTLR start "rule__Background__Group_1__0__Impl"
    // InternalGherkinParser.g:945:1: rule__Background__Group_1__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Background__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:949:1: ( ( RULE_BEGIN ) )
            // InternalGherkinParser.g:950:1: ( RULE_BEGIN )
            {
            // InternalGherkinParser.g:950:1: ( RULE_BEGIN )
            // InternalGherkinParser.g:951:2: RULE_BEGIN
            {
             before(grammarAccess.getBackgroundAccess().getBEGINTerminalRuleCall_1_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getBackgroundAccess().getBEGINTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group_1__0__Impl"


    // $ANTLR start "rule__Background__Group_1__1"
    // InternalGherkinParser.g:960:1: rule__Background__Group_1__1 : rule__Background__Group_1__1__Impl rule__Background__Group_1__2 ;
    public final void rule__Background__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:964:1: ( rule__Background__Group_1__1__Impl rule__Background__Group_1__2 )
            // InternalGherkinParser.g:965:2: rule__Background__Group_1__1__Impl rule__Background__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__Background__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Background__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group_1__1"


    // $ANTLR start "rule__Background__Group_1__1__Impl"
    // InternalGherkinParser.g:972:1: rule__Background__Group_1__1__Impl : ( ( rule__Background__Background_StepsAssignment_1_1 )* ) ;
    public final void rule__Background__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:976:1: ( ( ( rule__Background__Background_StepsAssignment_1_1 )* ) )
            // InternalGherkinParser.g:977:1: ( ( rule__Background__Background_StepsAssignment_1_1 )* )
            {
            // InternalGherkinParser.g:977:1: ( ( rule__Background__Background_StepsAssignment_1_1 )* )
            // InternalGherkinParser.g:978:2: ( rule__Background__Background_StepsAssignment_1_1 )*
            {
             before(grammarAccess.getBackgroundAccess().getBackground_StepsAssignment_1_1()); 
            // InternalGherkinParser.g:979:2: ( rule__Background__Background_StepsAssignment_1_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Given||(LA10_0>=Then && LA10_0<=But)||LA10_0==Asterisk) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGherkinParser.g:979:3: rule__Background__Background_StepsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Background__Background_StepsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getBackgroundAccess().getBackground_StepsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group_1__1__Impl"


    // $ANTLR start "rule__Background__Group_1__2"
    // InternalGherkinParser.g:987:1: rule__Background__Group_1__2 : rule__Background__Group_1__2__Impl ;
    public final void rule__Background__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:991:1: ( rule__Background__Group_1__2__Impl )
            // InternalGherkinParser.g:992:2: rule__Background__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Background__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group_1__2"


    // $ANTLR start "rule__Background__Group_1__2__Impl"
    // InternalGherkinParser.g:998:1: rule__Background__Group_1__2__Impl : ( RULE_END ) ;
    public final void rule__Background__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1002:1: ( ( RULE_END ) )
            // InternalGherkinParser.g:1003:1: ( RULE_END )
            {
            // InternalGherkinParser.g:1003:1: ( RULE_END )
            // InternalGherkinParser.g:1004:2: RULE_END
            {
             before(grammarAccess.getBackgroundAccess().getENDTerminalRuleCall_1_2()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getBackgroundAccess().getENDTerminalRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group_1__2__Impl"


    // $ANTLR start "rule__Normal_Scenario__Group__0"
    // InternalGherkinParser.g:1014:1: rule__Normal_Scenario__Group__0 : rule__Normal_Scenario__Group__0__Impl rule__Normal_Scenario__Group__1 ;
    public final void rule__Normal_Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1018:1: ( rule__Normal_Scenario__Group__0__Impl rule__Normal_Scenario__Group__1 )
            // InternalGherkinParser.g:1019:2: rule__Normal_Scenario__Group__0__Impl rule__Normal_Scenario__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Normal_Scenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Normal_Scenario__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Normal_Scenario__Group__0"


    // $ANTLR start "rule__Normal_Scenario__Group__0__Impl"
    // InternalGherkinParser.g:1026:1: rule__Normal_Scenario__Group__0__Impl : ( Scenario ) ;
    public final void rule__Normal_Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1030:1: ( ( Scenario ) )
            // InternalGherkinParser.g:1031:1: ( Scenario )
            {
            // InternalGherkinParser.g:1031:1: ( Scenario )
            // InternalGherkinParser.g:1032:2: Scenario
            {
             before(grammarAccess.getNormal_ScenarioAccess().getScenarioKeyword_0()); 
            match(input,Scenario,FOLLOW_2); 
             after(grammarAccess.getNormal_ScenarioAccess().getScenarioKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Normal_Scenario__Group__0__Impl"


    // $ANTLR start "rule__Normal_Scenario__Group__1"
    // InternalGherkinParser.g:1041:1: rule__Normal_Scenario__Group__1 : rule__Normal_Scenario__Group__1__Impl rule__Normal_Scenario__Group__2 ;
    public final void rule__Normal_Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1045:1: ( rule__Normal_Scenario__Group__1__Impl rule__Normal_Scenario__Group__2 )
            // InternalGherkinParser.g:1046:2: rule__Normal_Scenario__Group__1__Impl rule__Normal_Scenario__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Normal_Scenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Normal_Scenario__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Normal_Scenario__Group__1"


    // $ANTLR start "rule__Normal_Scenario__Group__1__Impl"
    // InternalGherkinParser.g:1053:1: rule__Normal_Scenario__Group__1__Impl : ( ruleDescription ) ;
    public final void rule__Normal_Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1057:1: ( ( ruleDescription ) )
            // InternalGherkinParser.g:1058:1: ( ruleDescription )
            {
            // InternalGherkinParser.g:1058:1: ( ruleDescription )
            // InternalGherkinParser.g:1059:2: ruleDescription
            {
             before(grammarAccess.getNormal_ScenarioAccess().getDescriptionParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getNormal_ScenarioAccess().getDescriptionParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Normal_Scenario__Group__1__Impl"


    // $ANTLR start "rule__Normal_Scenario__Group__2"
    // InternalGherkinParser.g:1068:1: rule__Normal_Scenario__Group__2 : rule__Normal_Scenario__Group__2__Impl ;
    public final void rule__Normal_Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1072:1: ( rule__Normal_Scenario__Group__2__Impl )
            // InternalGherkinParser.g:1073:2: rule__Normal_Scenario__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Normal_Scenario__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Normal_Scenario__Group__2"


    // $ANTLR start "rule__Normal_Scenario__Group__2__Impl"
    // InternalGherkinParser.g:1079:1: rule__Normal_Scenario__Group__2__Impl : ( ( rule__Normal_Scenario__Scenario_stepsAssignment_2 ) ) ;
    public final void rule__Normal_Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1083:1: ( ( ( rule__Normal_Scenario__Scenario_stepsAssignment_2 ) ) )
            // InternalGherkinParser.g:1084:1: ( ( rule__Normal_Scenario__Scenario_stepsAssignment_2 ) )
            {
            // InternalGherkinParser.g:1084:1: ( ( rule__Normal_Scenario__Scenario_stepsAssignment_2 ) )
            // InternalGherkinParser.g:1085:2: ( rule__Normal_Scenario__Scenario_stepsAssignment_2 )
            {
             before(grammarAccess.getNormal_ScenarioAccess().getScenario_stepsAssignment_2()); 
            // InternalGherkinParser.g:1086:2: ( rule__Normal_Scenario__Scenario_stepsAssignment_2 )
            // InternalGherkinParser.g:1086:3: rule__Normal_Scenario__Scenario_stepsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Normal_Scenario__Scenario_stepsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNormal_ScenarioAccess().getScenario_stepsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Normal_Scenario__Group__2__Impl"


    // $ANTLR start "rule__Scenario_Outline__Group__0"
    // InternalGherkinParser.g:1095:1: rule__Scenario_Outline__Group__0 : rule__Scenario_Outline__Group__0__Impl rule__Scenario_Outline__Group__1 ;
    public final void rule__Scenario_Outline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1099:1: ( rule__Scenario_Outline__Group__0__Impl rule__Scenario_Outline__Group__1 )
            // InternalGherkinParser.g:1100:2: rule__Scenario_Outline__Group__0__Impl rule__Scenario_Outline__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Scenario_Outline__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario_Outline__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario_Outline__Group__0"


    // $ANTLR start "rule__Scenario_Outline__Group__0__Impl"
    // InternalGherkinParser.g:1107:1: rule__Scenario_Outline__Group__0__Impl : ( ScenarioOutline ) ;
    public final void rule__Scenario_Outline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1111:1: ( ( ScenarioOutline ) )
            // InternalGherkinParser.g:1112:1: ( ScenarioOutline )
            {
            // InternalGherkinParser.g:1112:1: ( ScenarioOutline )
            // InternalGherkinParser.g:1113:2: ScenarioOutline
            {
             before(grammarAccess.getScenario_OutlineAccess().getScenarioOutlineKeyword_0()); 
            match(input,ScenarioOutline,FOLLOW_2); 
             after(grammarAccess.getScenario_OutlineAccess().getScenarioOutlineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario_Outline__Group__0__Impl"


    // $ANTLR start "rule__Scenario_Outline__Group__1"
    // InternalGherkinParser.g:1122:1: rule__Scenario_Outline__Group__1 : rule__Scenario_Outline__Group__1__Impl rule__Scenario_Outline__Group__2 ;
    public final void rule__Scenario_Outline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1126:1: ( rule__Scenario_Outline__Group__1__Impl rule__Scenario_Outline__Group__2 )
            // InternalGherkinParser.g:1127:2: rule__Scenario_Outline__Group__1__Impl rule__Scenario_Outline__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Scenario_Outline__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario_Outline__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario_Outline__Group__1"


    // $ANTLR start "rule__Scenario_Outline__Group__1__Impl"
    // InternalGherkinParser.g:1134:1: rule__Scenario_Outline__Group__1__Impl : ( ruleDescription ) ;
    public final void rule__Scenario_Outline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1138:1: ( ( ruleDescription ) )
            // InternalGherkinParser.g:1139:1: ( ruleDescription )
            {
            // InternalGherkinParser.g:1139:1: ( ruleDescription )
            // InternalGherkinParser.g:1140:2: ruleDescription
            {
             before(grammarAccess.getScenario_OutlineAccess().getDescriptionParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getScenario_OutlineAccess().getDescriptionParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario_Outline__Group__1__Impl"


    // $ANTLR start "rule__Scenario_Outline__Group__2"
    // InternalGherkinParser.g:1149:1: rule__Scenario_Outline__Group__2 : rule__Scenario_Outline__Group__2__Impl ;
    public final void rule__Scenario_Outline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1153:1: ( rule__Scenario_Outline__Group__2__Impl )
            // InternalGherkinParser.g:1154:2: rule__Scenario_Outline__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scenario_Outline__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario_Outline__Group__2"


    // $ANTLR start "rule__Scenario_Outline__Group__2__Impl"
    // InternalGherkinParser.g:1160:1: rule__Scenario_Outline__Group__2__Impl : ( ( rule__Scenario_Outline__Group_2__0 ) ) ;
    public final void rule__Scenario_Outline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1164:1: ( ( ( rule__Scenario_Outline__Group_2__0 ) ) )
            // InternalGherkinParser.g:1165:1: ( ( rule__Scenario_Outline__Group_2__0 ) )
            {
            // InternalGherkinParser.g:1165:1: ( ( rule__Scenario_Outline__Group_2__0 ) )
            // InternalGherkinParser.g:1166:2: ( rule__Scenario_Outline__Group_2__0 )
            {
             before(grammarAccess.getScenario_OutlineAccess().getGroup_2()); 
            // InternalGherkinParser.g:1167:2: ( rule__Scenario_Outline__Group_2__0 )
            // InternalGherkinParser.g:1167:3: rule__Scenario_Outline__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Scenario_Outline__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getScenario_OutlineAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario_Outline__Group__2__Impl"


    // $ANTLR start "rule__Scenario_Outline__Group_2__0"
    // InternalGherkinParser.g:1176:1: rule__Scenario_Outline__Group_2__0 : rule__Scenario_Outline__Group_2__0__Impl rule__Scenario_Outline__Group_2__1 ;
    public final void rule__Scenario_Outline__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1180:1: ( rule__Scenario_Outline__Group_2__0__Impl rule__Scenario_Outline__Group_2__1 )
            // InternalGherkinParser.g:1181:2: rule__Scenario_Outline__Group_2__0__Impl rule__Scenario_Outline__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Scenario_Outline__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario_Outline__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario_Outline__Group_2__0"


    // $ANTLR start "rule__Scenario_Outline__Group_2__0__Impl"
    // InternalGherkinParser.g:1188:1: rule__Scenario_Outline__Group_2__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Scenario_Outline__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1192:1: ( ( RULE_BEGIN ) )
            // InternalGherkinParser.g:1193:1: ( RULE_BEGIN )
            {
            // InternalGherkinParser.g:1193:1: ( RULE_BEGIN )
            // InternalGherkinParser.g:1194:2: RULE_BEGIN
            {
             before(grammarAccess.getScenario_OutlineAccess().getBEGINTerminalRuleCall_2_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getScenario_OutlineAccess().getBEGINTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario_Outline__Group_2__0__Impl"


    // $ANTLR start "rule__Scenario_Outline__Group_2__1"
    // InternalGherkinParser.g:1203:1: rule__Scenario_Outline__Group_2__1 : rule__Scenario_Outline__Group_2__1__Impl rule__Scenario_Outline__Group_2__2 ;
    public final void rule__Scenario_Outline__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1207:1: ( rule__Scenario_Outline__Group_2__1__Impl rule__Scenario_Outline__Group_2__2 )
            // InternalGherkinParser.g:1208:2: rule__Scenario_Outline__Group_2__1__Impl rule__Scenario_Outline__Group_2__2
            {
            pushFollow(FOLLOW_12);
            rule__Scenario_Outline__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario_Outline__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario_Outline__Group_2__1"


    // $ANTLR start "rule__Scenario_Outline__Group_2__1__Impl"
    // InternalGherkinParser.g:1215:1: rule__Scenario_Outline__Group_2__1__Impl : ( ( rule__Scenario_Outline__StepsAssignment_2_1 )* ) ;
    public final void rule__Scenario_Outline__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1219:1: ( ( ( rule__Scenario_Outline__StepsAssignment_2_1 )* ) )
            // InternalGherkinParser.g:1220:1: ( ( rule__Scenario_Outline__StepsAssignment_2_1 )* )
            {
            // InternalGherkinParser.g:1220:1: ( ( rule__Scenario_Outline__StepsAssignment_2_1 )* )
            // InternalGherkinParser.g:1221:2: ( rule__Scenario_Outline__StepsAssignment_2_1 )*
            {
             before(grammarAccess.getScenario_OutlineAccess().getStepsAssignment_2_1()); 
            // InternalGherkinParser.g:1222:2: ( rule__Scenario_Outline__StepsAssignment_2_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Given||(LA11_0>=Then && LA11_0<=But)||LA11_0==Asterisk) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGherkinParser.g:1222:3: rule__Scenario_Outline__StepsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Scenario_Outline__StepsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getScenario_OutlineAccess().getStepsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario_Outline__Group_2__1__Impl"


    // $ANTLR start "rule__Scenario_Outline__Group_2__2"
    // InternalGherkinParser.g:1230:1: rule__Scenario_Outline__Group_2__2 : rule__Scenario_Outline__Group_2__2__Impl rule__Scenario_Outline__Group_2__3 ;
    public final void rule__Scenario_Outline__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1234:1: ( rule__Scenario_Outline__Group_2__2__Impl rule__Scenario_Outline__Group_2__3 )
            // InternalGherkinParser.g:1235:2: rule__Scenario_Outline__Group_2__2__Impl rule__Scenario_Outline__Group_2__3
            {
            pushFollow(FOLLOW_8);
            rule__Scenario_Outline__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario_Outline__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario_Outline__Group_2__2"


    // $ANTLR start "rule__Scenario_Outline__Group_2__2__Impl"
    // InternalGherkinParser.g:1242:1: rule__Scenario_Outline__Group_2__2__Impl : ( ( rule__Scenario_Outline__ExampleAssignment_2_2 ) ) ;
    public final void rule__Scenario_Outline__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1246:1: ( ( ( rule__Scenario_Outline__ExampleAssignment_2_2 ) ) )
            // InternalGherkinParser.g:1247:1: ( ( rule__Scenario_Outline__ExampleAssignment_2_2 ) )
            {
            // InternalGherkinParser.g:1247:1: ( ( rule__Scenario_Outline__ExampleAssignment_2_2 ) )
            // InternalGherkinParser.g:1248:2: ( rule__Scenario_Outline__ExampleAssignment_2_2 )
            {
             before(grammarAccess.getScenario_OutlineAccess().getExampleAssignment_2_2()); 
            // InternalGherkinParser.g:1249:2: ( rule__Scenario_Outline__ExampleAssignment_2_2 )
            // InternalGherkinParser.g:1249:3: rule__Scenario_Outline__ExampleAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Scenario_Outline__ExampleAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getScenario_OutlineAccess().getExampleAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario_Outline__Group_2__2__Impl"


    // $ANTLR start "rule__Scenario_Outline__Group_2__3"
    // InternalGherkinParser.g:1257:1: rule__Scenario_Outline__Group_2__3 : rule__Scenario_Outline__Group_2__3__Impl ;
    public final void rule__Scenario_Outline__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1261:1: ( rule__Scenario_Outline__Group_2__3__Impl )
            // InternalGherkinParser.g:1262:2: rule__Scenario_Outline__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scenario_Outline__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario_Outline__Group_2__3"


    // $ANTLR start "rule__Scenario_Outline__Group_2__3__Impl"
    // InternalGherkinParser.g:1268:1: rule__Scenario_Outline__Group_2__3__Impl : ( RULE_END ) ;
    public final void rule__Scenario_Outline__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1272:1: ( ( RULE_END ) )
            // InternalGherkinParser.g:1273:1: ( RULE_END )
            {
            // InternalGherkinParser.g:1273:1: ( RULE_END )
            // InternalGherkinParser.g:1274:2: RULE_END
            {
             before(grammarAccess.getScenario_OutlineAccess().getENDTerminalRuleCall_2_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getScenario_OutlineAccess().getENDTerminalRuleCall_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario_Outline__Group_2__3__Impl"


    // $ANTLR start "rule__Examples__Group__0"
    // InternalGherkinParser.g:1284:1: rule__Examples__Group__0 : rule__Examples__Group__0__Impl rule__Examples__Group__1 ;
    public final void rule__Examples__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1288:1: ( rule__Examples__Group__0__Impl rule__Examples__Group__1 )
            // InternalGherkinParser.g:1289:2: rule__Examples__Group__0__Impl rule__Examples__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Examples__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Examples__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group__0"


    // $ANTLR start "rule__Examples__Group__0__Impl"
    // InternalGherkinParser.g:1296:1: rule__Examples__Group__0__Impl : ( () ) ;
    public final void rule__Examples__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1300:1: ( ( () ) )
            // InternalGherkinParser.g:1301:1: ( () )
            {
            // InternalGherkinParser.g:1301:1: ( () )
            // InternalGherkinParser.g:1302:2: ()
            {
             before(grammarAccess.getExamplesAccess().getExamplesAction_0()); 
            // InternalGherkinParser.g:1303:2: ()
            // InternalGherkinParser.g:1303:3: 
            {
            }

             after(grammarAccess.getExamplesAccess().getExamplesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group__0__Impl"


    // $ANTLR start "rule__Examples__Group__1"
    // InternalGherkinParser.g:1311:1: rule__Examples__Group__1 : rule__Examples__Group__1__Impl rule__Examples__Group__2 ;
    public final void rule__Examples__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1315:1: ( rule__Examples__Group__1__Impl rule__Examples__Group__2 )
            // InternalGherkinParser.g:1316:2: rule__Examples__Group__1__Impl rule__Examples__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Examples__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Examples__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group__1"


    // $ANTLR start "rule__Examples__Group__1__Impl"
    // InternalGherkinParser.g:1323:1: rule__Examples__Group__1__Impl : ( Examples ) ;
    public final void rule__Examples__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1327:1: ( ( Examples ) )
            // InternalGherkinParser.g:1328:1: ( Examples )
            {
            // InternalGherkinParser.g:1328:1: ( Examples )
            // InternalGherkinParser.g:1329:2: Examples
            {
             before(grammarAccess.getExamplesAccess().getExamplesKeyword_1()); 
            match(input,Examples,FOLLOW_2); 
             after(grammarAccess.getExamplesAccess().getExamplesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group__1__Impl"


    // $ANTLR start "rule__Examples__Group__2"
    // InternalGherkinParser.g:1338:1: rule__Examples__Group__2 : rule__Examples__Group__2__Impl ;
    public final void rule__Examples__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1342:1: ( rule__Examples__Group__2__Impl )
            // InternalGherkinParser.g:1343:2: rule__Examples__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Examples__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group__2"


    // $ANTLR start "rule__Examples__Group__2__Impl"
    // InternalGherkinParser.g:1349:1: rule__Examples__Group__2__Impl : ( ( rule__Examples__Group_2__0 ) ) ;
    public final void rule__Examples__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1353:1: ( ( ( rule__Examples__Group_2__0 ) ) )
            // InternalGherkinParser.g:1354:1: ( ( rule__Examples__Group_2__0 ) )
            {
            // InternalGherkinParser.g:1354:1: ( ( rule__Examples__Group_2__0 ) )
            // InternalGherkinParser.g:1355:2: ( rule__Examples__Group_2__0 )
            {
             before(grammarAccess.getExamplesAccess().getGroup_2()); 
            // InternalGherkinParser.g:1356:2: ( rule__Examples__Group_2__0 )
            // InternalGherkinParser.g:1356:3: rule__Examples__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Examples__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getExamplesAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group__2__Impl"


    // $ANTLR start "rule__Examples__Group_2__0"
    // InternalGherkinParser.g:1365:1: rule__Examples__Group_2__0 : rule__Examples__Group_2__0__Impl rule__Examples__Group_2__1 ;
    public final void rule__Examples__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1369:1: ( rule__Examples__Group_2__0__Impl rule__Examples__Group_2__1 )
            // InternalGherkinParser.g:1370:2: rule__Examples__Group_2__0__Impl rule__Examples__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Examples__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Examples__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group_2__0"


    // $ANTLR start "rule__Examples__Group_2__0__Impl"
    // InternalGherkinParser.g:1377:1: rule__Examples__Group_2__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Examples__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1381:1: ( ( RULE_BEGIN ) )
            // InternalGherkinParser.g:1382:1: ( RULE_BEGIN )
            {
            // InternalGherkinParser.g:1382:1: ( RULE_BEGIN )
            // InternalGherkinParser.g:1383:2: RULE_BEGIN
            {
             before(grammarAccess.getExamplesAccess().getBEGINTerminalRuleCall_2_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getExamplesAccess().getBEGINTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group_2__0__Impl"


    // $ANTLR start "rule__Examples__Group_2__1"
    // InternalGherkinParser.g:1392:1: rule__Examples__Group_2__1 : rule__Examples__Group_2__1__Impl rule__Examples__Group_2__2 ;
    public final void rule__Examples__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1396:1: ( rule__Examples__Group_2__1__Impl rule__Examples__Group_2__2 )
            // InternalGherkinParser.g:1397:2: rule__Examples__Group_2__1__Impl rule__Examples__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__Examples__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Examples__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group_2__1"


    // $ANTLR start "rule__Examples__Group_2__1__Impl"
    // InternalGherkinParser.g:1404:1: rule__Examples__Group_2__1__Impl : ( ( ( rule__Examples__RowsAssignment_2_1 ) ) ( ( rule__Examples__RowsAssignment_2_1 )* ) ) ;
    public final void rule__Examples__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1408:1: ( ( ( ( rule__Examples__RowsAssignment_2_1 ) ) ( ( rule__Examples__RowsAssignment_2_1 )* ) ) )
            // InternalGherkinParser.g:1409:1: ( ( ( rule__Examples__RowsAssignment_2_1 ) ) ( ( rule__Examples__RowsAssignment_2_1 )* ) )
            {
            // InternalGherkinParser.g:1409:1: ( ( ( rule__Examples__RowsAssignment_2_1 ) ) ( ( rule__Examples__RowsAssignment_2_1 )* ) )
            // InternalGherkinParser.g:1410:2: ( ( rule__Examples__RowsAssignment_2_1 ) ) ( ( rule__Examples__RowsAssignment_2_1 )* )
            {
            // InternalGherkinParser.g:1410:2: ( ( rule__Examples__RowsAssignment_2_1 ) )
            // InternalGherkinParser.g:1411:3: ( rule__Examples__RowsAssignment_2_1 )
            {
             before(grammarAccess.getExamplesAccess().getRowsAssignment_2_1()); 
            // InternalGherkinParser.g:1412:3: ( rule__Examples__RowsAssignment_2_1 )
            // InternalGherkinParser.g:1412:4: rule__Examples__RowsAssignment_2_1
            {
            pushFollow(FOLLOW_14);
            rule__Examples__RowsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExamplesAccess().getRowsAssignment_2_1()); 

            }

            // InternalGherkinParser.g:1415:2: ( ( rule__Examples__RowsAssignment_2_1 )* )
            // InternalGherkinParser.g:1416:3: ( rule__Examples__RowsAssignment_2_1 )*
            {
             before(grammarAccess.getExamplesAccess().getRowsAssignment_2_1()); 
            // InternalGherkinParser.g:1417:3: ( rule__Examples__RowsAssignment_2_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==VerticalLine) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGherkinParser.g:1417:4: rule__Examples__RowsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Examples__RowsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getExamplesAccess().getRowsAssignment_2_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group_2__1__Impl"


    // $ANTLR start "rule__Examples__Group_2__2"
    // InternalGherkinParser.g:1426:1: rule__Examples__Group_2__2 : rule__Examples__Group_2__2__Impl ;
    public final void rule__Examples__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1430:1: ( rule__Examples__Group_2__2__Impl )
            // InternalGherkinParser.g:1431:2: rule__Examples__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Examples__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group_2__2"


    // $ANTLR start "rule__Examples__Group_2__2__Impl"
    // InternalGherkinParser.g:1437:1: rule__Examples__Group_2__2__Impl : ( RULE_END ) ;
    public final void rule__Examples__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1441:1: ( ( RULE_END ) )
            // InternalGherkinParser.g:1442:1: ( RULE_END )
            {
            // InternalGherkinParser.g:1442:1: ( RULE_END )
            // InternalGherkinParser.g:1443:2: RULE_END
            {
             before(grammarAccess.getExamplesAccess().getENDTerminalRuleCall_2_2()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getExamplesAccess().getENDTerminalRuleCall_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group_2__2__Impl"


    // $ANTLR start "rule__Examples_row__Group__0"
    // InternalGherkinParser.g:1453:1: rule__Examples_row__Group__0 : rule__Examples_row__Group__0__Impl rule__Examples_row__Group__1 ;
    public final void rule__Examples_row__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1457:1: ( rule__Examples_row__Group__0__Impl rule__Examples_row__Group__1 )
            // InternalGherkinParser.g:1458:2: rule__Examples_row__Group__0__Impl rule__Examples_row__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Examples_row__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Examples_row__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples_row__Group__0"


    // $ANTLR start "rule__Examples_row__Group__0__Impl"
    // InternalGherkinParser.g:1465:1: rule__Examples_row__Group__0__Impl : ( ( ( rule__Examples_row__Group_0__0 ) ) ( ( rule__Examples_row__Group_0__0 )* ) ) ;
    public final void rule__Examples_row__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1469:1: ( ( ( ( rule__Examples_row__Group_0__0 ) ) ( ( rule__Examples_row__Group_0__0 )* ) ) )
            // InternalGherkinParser.g:1470:1: ( ( ( rule__Examples_row__Group_0__0 ) ) ( ( rule__Examples_row__Group_0__0 )* ) )
            {
            // InternalGherkinParser.g:1470:1: ( ( ( rule__Examples_row__Group_0__0 ) ) ( ( rule__Examples_row__Group_0__0 )* ) )
            // InternalGherkinParser.g:1471:2: ( ( rule__Examples_row__Group_0__0 ) ) ( ( rule__Examples_row__Group_0__0 )* )
            {
            // InternalGherkinParser.g:1471:2: ( ( rule__Examples_row__Group_0__0 ) )
            // InternalGherkinParser.g:1472:3: ( rule__Examples_row__Group_0__0 )
            {
             before(grammarAccess.getExamples_rowAccess().getGroup_0()); 
            // InternalGherkinParser.g:1473:3: ( rule__Examples_row__Group_0__0 )
            // InternalGherkinParser.g:1473:4: rule__Examples_row__Group_0__0
            {
            pushFollow(FOLLOW_14);
            rule__Examples_row__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getExamples_rowAccess().getGroup_0()); 

            }

            // InternalGherkinParser.g:1476:2: ( ( rule__Examples_row__Group_0__0 )* )
            // InternalGherkinParser.g:1477:3: ( rule__Examples_row__Group_0__0 )*
            {
             before(grammarAccess.getExamples_rowAccess().getGroup_0()); 
            // InternalGherkinParser.g:1478:3: ( rule__Examples_row__Group_0__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==VerticalLine) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==RULE_ID) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalGherkinParser.g:1478:4: rule__Examples_row__Group_0__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Examples_row__Group_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getExamples_rowAccess().getGroup_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples_row__Group__0__Impl"


    // $ANTLR start "rule__Examples_row__Group__1"
    // InternalGherkinParser.g:1487:1: rule__Examples_row__Group__1 : rule__Examples_row__Group__1__Impl ;
    public final void rule__Examples_row__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1491:1: ( rule__Examples_row__Group__1__Impl )
            // InternalGherkinParser.g:1492:2: rule__Examples_row__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Examples_row__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples_row__Group__1"


    // $ANTLR start "rule__Examples_row__Group__1__Impl"
    // InternalGherkinParser.g:1498:1: rule__Examples_row__Group__1__Impl : ( VerticalLine ) ;
    public final void rule__Examples_row__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1502:1: ( ( VerticalLine ) )
            // InternalGherkinParser.g:1503:1: ( VerticalLine )
            {
            // InternalGherkinParser.g:1503:1: ( VerticalLine )
            // InternalGherkinParser.g:1504:2: VerticalLine
            {
             before(grammarAccess.getExamples_rowAccess().getVerticalLineKeyword_1()); 
            match(input,VerticalLine,FOLLOW_2); 
             after(grammarAccess.getExamples_rowAccess().getVerticalLineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples_row__Group__1__Impl"


    // $ANTLR start "rule__Examples_row__Group_0__0"
    // InternalGherkinParser.g:1514:1: rule__Examples_row__Group_0__0 : rule__Examples_row__Group_0__0__Impl rule__Examples_row__Group_0__1 ;
    public final void rule__Examples_row__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1518:1: ( rule__Examples_row__Group_0__0__Impl rule__Examples_row__Group_0__1 )
            // InternalGherkinParser.g:1519:2: rule__Examples_row__Group_0__0__Impl rule__Examples_row__Group_0__1
            {
            pushFollow(FOLLOW_15);
            rule__Examples_row__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Examples_row__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples_row__Group_0__0"


    // $ANTLR start "rule__Examples_row__Group_0__0__Impl"
    // InternalGherkinParser.g:1526:1: rule__Examples_row__Group_0__0__Impl : ( VerticalLine ) ;
    public final void rule__Examples_row__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1530:1: ( ( VerticalLine ) )
            // InternalGherkinParser.g:1531:1: ( VerticalLine )
            {
            // InternalGherkinParser.g:1531:1: ( VerticalLine )
            // InternalGherkinParser.g:1532:2: VerticalLine
            {
             before(grammarAccess.getExamples_rowAccess().getVerticalLineKeyword_0_0()); 
            match(input,VerticalLine,FOLLOW_2); 
             after(grammarAccess.getExamples_rowAccess().getVerticalLineKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples_row__Group_0__0__Impl"


    // $ANTLR start "rule__Examples_row__Group_0__1"
    // InternalGherkinParser.g:1541:1: rule__Examples_row__Group_0__1 : rule__Examples_row__Group_0__1__Impl ;
    public final void rule__Examples_row__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1545:1: ( rule__Examples_row__Group_0__1__Impl )
            // InternalGherkinParser.g:1546:2: rule__Examples_row__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Examples_row__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples_row__Group_0__1"


    // $ANTLR start "rule__Examples_row__Group_0__1__Impl"
    // InternalGherkinParser.g:1552:1: rule__Examples_row__Group_0__1__Impl : ( RULE_ID ) ;
    public final void rule__Examples_row__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1556:1: ( ( RULE_ID ) )
            // InternalGherkinParser.g:1557:1: ( RULE_ID )
            {
            // InternalGherkinParser.g:1557:1: ( RULE_ID )
            // InternalGherkinParser.g:1558:2: RULE_ID
            {
             before(grammarAccess.getExamples_rowAccess().getIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExamples_rowAccess().getIDTerminalRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples_row__Group_0__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalGherkinParser.g:1568:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1572:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalGherkinParser.g:1573:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalGherkinParser.g:1580:1: rule__Rule__Group__0__Impl : ( Rule ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1584:1: ( ( Rule ) )
            // InternalGherkinParser.g:1585:1: ( Rule )
            {
            // InternalGherkinParser.g:1585:1: ( Rule )
            // InternalGherkinParser.g:1586:2: Rule
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,Rule,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalGherkinParser.g:1595:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1599:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalGherkinParser.g:1600:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalGherkinParser.g:1607:1: rule__Rule__Group__1__Impl : ( ruleDescription ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1611:1: ( ( ruleDescription ) )
            // InternalGherkinParser.g:1612:1: ( ruleDescription )
            {
            // InternalGherkinParser.g:1612:1: ( ruleDescription )
            // InternalGherkinParser.g:1613:2: ruleDescription
            {
             before(grammarAccess.getRuleAccess().getDescriptionParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getDescriptionParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalGherkinParser.g:1622:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1626:1: ( rule__Rule__Group__2__Impl )
            // InternalGherkinParser.g:1627:2: rule__Rule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalGherkinParser.g:1633:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__Group_2__0 )? ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1637:1: ( ( ( rule__Rule__Group_2__0 )? ) )
            // InternalGherkinParser.g:1638:1: ( ( rule__Rule__Group_2__0 )? )
            {
            // InternalGherkinParser.g:1638:1: ( ( rule__Rule__Group_2__0 )? )
            // InternalGherkinParser.g:1639:2: ( rule__Rule__Group_2__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_2()); 
            // InternalGherkinParser.g:1640:2: ( rule__Rule__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_BEGIN) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGherkinParser.g:1640:3: rule__Rule__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group_2__0"
    // InternalGherkinParser.g:1649:1: rule__Rule__Group_2__0 : rule__Rule__Group_2__0__Impl rule__Rule__Group_2__1 ;
    public final void rule__Rule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1653:1: ( rule__Rule__Group_2__0__Impl rule__Rule__Group_2__1 )
            // InternalGherkinParser.g:1654:2: rule__Rule__Group_2__0__Impl rule__Rule__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__Rule__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__0"


    // $ANTLR start "rule__Rule__Group_2__0__Impl"
    // InternalGherkinParser.g:1661:1: rule__Rule__Group_2__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Rule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1665:1: ( ( RULE_BEGIN ) )
            // InternalGherkinParser.g:1666:1: ( RULE_BEGIN )
            {
            // InternalGherkinParser.g:1666:1: ( RULE_BEGIN )
            // InternalGherkinParser.g:1667:2: RULE_BEGIN
            {
             before(grammarAccess.getRuleAccess().getBEGINTerminalRuleCall_2_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getBEGINTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__0__Impl"


    // $ANTLR start "rule__Rule__Group_2__1"
    // InternalGherkinParser.g:1676:1: rule__Rule__Group_2__1 : rule__Rule__Group_2__1__Impl rule__Rule__Group_2__2 ;
    public final void rule__Rule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1680:1: ( rule__Rule__Group_2__1__Impl rule__Rule__Group_2__2 )
            // InternalGherkinParser.g:1681:2: rule__Rule__Group_2__1__Impl rule__Rule__Group_2__2
            {
            pushFollow(FOLLOW_16);
            rule__Rule__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__1"


    // $ANTLR start "rule__Rule__Group_2__1__Impl"
    // InternalGherkinParser.g:1688:1: rule__Rule__Group_2__1__Impl : ( ( rule__Rule__BackgroundAssignment_2_1 )? ) ;
    public final void rule__Rule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1692:1: ( ( ( rule__Rule__BackgroundAssignment_2_1 )? ) )
            // InternalGherkinParser.g:1693:1: ( ( rule__Rule__BackgroundAssignment_2_1 )? )
            {
            // InternalGherkinParser.g:1693:1: ( ( rule__Rule__BackgroundAssignment_2_1 )? )
            // InternalGherkinParser.g:1694:2: ( rule__Rule__BackgroundAssignment_2_1 )?
            {
             before(grammarAccess.getRuleAccess().getBackgroundAssignment_2_1()); 
            // InternalGherkinParser.g:1695:2: ( rule__Rule__BackgroundAssignment_2_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Background) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGherkinParser.g:1695:3: rule__Rule__BackgroundAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__BackgroundAssignment_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getBackgroundAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__1__Impl"


    // $ANTLR start "rule__Rule__Group_2__2"
    // InternalGherkinParser.g:1703:1: rule__Rule__Group_2__2 : rule__Rule__Group_2__2__Impl rule__Rule__Group_2__3 ;
    public final void rule__Rule__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1707:1: ( rule__Rule__Group_2__2__Impl rule__Rule__Group_2__3 )
            // InternalGherkinParser.g:1708:2: rule__Rule__Group_2__2__Impl rule__Rule__Group_2__3
            {
            pushFollow(FOLLOW_8);
            rule__Rule__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__2"


    // $ANTLR start "rule__Rule__Group_2__2__Impl"
    // InternalGherkinParser.g:1715:1: rule__Rule__Group_2__2__Impl : ( ( ( rule__Rule__ExamplesAssignment_2_2 ) ) ( ( rule__Rule__ExamplesAssignment_2_2 )* ) ) ;
    public final void rule__Rule__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1719:1: ( ( ( ( rule__Rule__ExamplesAssignment_2_2 ) ) ( ( rule__Rule__ExamplesAssignment_2_2 )* ) ) )
            // InternalGherkinParser.g:1720:1: ( ( ( rule__Rule__ExamplesAssignment_2_2 ) ) ( ( rule__Rule__ExamplesAssignment_2_2 )* ) )
            {
            // InternalGherkinParser.g:1720:1: ( ( ( rule__Rule__ExamplesAssignment_2_2 ) ) ( ( rule__Rule__ExamplesAssignment_2_2 )* ) )
            // InternalGherkinParser.g:1721:2: ( ( rule__Rule__ExamplesAssignment_2_2 ) ) ( ( rule__Rule__ExamplesAssignment_2_2 )* )
            {
            // InternalGherkinParser.g:1721:2: ( ( rule__Rule__ExamplesAssignment_2_2 ) )
            // InternalGherkinParser.g:1722:3: ( rule__Rule__ExamplesAssignment_2_2 )
            {
             before(grammarAccess.getRuleAccess().getExamplesAssignment_2_2()); 
            // InternalGherkinParser.g:1723:3: ( rule__Rule__ExamplesAssignment_2_2 )
            // InternalGherkinParser.g:1723:4: rule__Rule__ExamplesAssignment_2_2
            {
            pushFollow(FOLLOW_17);
            rule__Rule__ExamplesAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getExamplesAssignment_2_2()); 

            }

            // InternalGherkinParser.g:1726:2: ( ( rule__Rule__ExamplesAssignment_2_2 )* )
            // InternalGherkinParser.g:1727:3: ( rule__Rule__ExamplesAssignment_2_2 )*
            {
             before(grammarAccess.getRuleAccess().getExamplesAssignment_2_2()); 
            // InternalGherkinParser.g:1728:3: ( rule__Rule__ExamplesAssignment_2_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==Example) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGherkinParser.g:1728:4: rule__Rule__ExamplesAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Rule__ExamplesAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getExamplesAssignment_2_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__2__Impl"


    // $ANTLR start "rule__Rule__Group_2__3"
    // InternalGherkinParser.g:1737:1: rule__Rule__Group_2__3 : rule__Rule__Group_2__3__Impl ;
    public final void rule__Rule__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1741:1: ( rule__Rule__Group_2__3__Impl )
            // InternalGherkinParser.g:1742:2: rule__Rule__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__3"


    // $ANTLR start "rule__Rule__Group_2__3__Impl"
    // InternalGherkinParser.g:1748:1: rule__Rule__Group_2__3__Impl : ( RULE_END ) ;
    public final void rule__Rule__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1752:1: ( ( RULE_END ) )
            // InternalGherkinParser.g:1753:1: ( RULE_END )
            {
            // InternalGherkinParser.g:1753:1: ( RULE_END )
            // InternalGherkinParser.g:1754:2: RULE_END
            {
             before(grammarAccess.getRuleAccess().getENDTerminalRuleCall_2_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getENDTerminalRuleCall_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2__3__Impl"


    // $ANTLR start "rule__Example__Group__0"
    // InternalGherkinParser.g:1764:1: rule__Example__Group__0 : rule__Example__Group__0__Impl rule__Example__Group__1 ;
    public final void rule__Example__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1768:1: ( rule__Example__Group__0__Impl rule__Example__Group__1 )
            // InternalGherkinParser.g:1769:2: rule__Example__Group__0__Impl rule__Example__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Example__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__0"


    // $ANTLR start "rule__Example__Group__0__Impl"
    // InternalGherkinParser.g:1776:1: rule__Example__Group__0__Impl : ( Example ) ;
    public final void rule__Example__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1780:1: ( ( Example ) )
            // InternalGherkinParser.g:1781:1: ( Example )
            {
            // InternalGherkinParser.g:1781:1: ( Example )
            // InternalGherkinParser.g:1782:2: Example
            {
             before(grammarAccess.getExampleAccess().getExampleKeyword_0()); 
            match(input,Example,FOLLOW_2); 
             after(grammarAccess.getExampleAccess().getExampleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__0__Impl"


    // $ANTLR start "rule__Example__Group__1"
    // InternalGherkinParser.g:1791:1: rule__Example__Group__1 : rule__Example__Group__1__Impl rule__Example__Group__2 ;
    public final void rule__Example__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1795:1: ( rule__Example__Group__1__Impl rule__Example__Group__2 )
            // InternalGherkinParser.g:1796:2: rule__Example__Group__1__Impl rule__Example__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Example__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__1"


    // $ANTLR start "rule__Example__Group__1__Impl"
    // InternalGherkinParser.g:1803:1: rule__Example__Group__1__Impl : ( ruleDescription ) ;
    public final void rule__Example__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1807:1: ( ( ruleDescription ) )
            // InternalGherkinParser.g:1808:1: ( ruleDescription )
            {
            // InternalGherkinParser.g:1808:1: ( ruleDescription )
            // InternalGherkinParser.g:1809:2: ruleDescription
            {
             before(grammarAccess.getExampleAccess().getDescriptionParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getDescriptionParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__1__Impl"


    // $ANTLR start "rule__Example__Group__2"
    // InternalGherkinParser.g:1818:1: rule__Example__Group__2 : rule__Example__Group__2__Impl ;
    public final void rule__Example__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1822:1: ( rule__Example__Group__2__Impl )
            // InternalGherkinParser.g:1823:2: rule__Example__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Example__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__2"


    // $ANTLR start "rule__Example__Group__2__Impl"
    // InternalGherkinParser.g:1829:1: rule__Example__Group__2__Impl : ( ( rule__Example__Example_stepsAssignment_2 ) ) ;
    public final void rule__Example__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1833:1: ( ( ( rule__Example__Example_stepsAssignment_2 ) ) )
            // InternalGherkinParser.g:1834:1: ( ( rule__Example__Example_stepsAssignment_2 ) )
            {
            // InternalGherkinParser.g:1834:1: ( ( rule__Example__Example_stepsAssignment_2 ) )
            // InternalGherkinParser.g:1835:2: ( rule__Example__Example_stepsAssignment_2 )
            {
             before(grammarAccess.getExampleAccess().getExample_stepsAssignment_2()); 
            // InternalGherkinParser.g:1836:2: ( rule__Example__Example_stepsAssignment_2 )
            // InternalGherkinParser.g:1836:3: rule__Example__Example_stepsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Example__Example_stepsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getExample_stepsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__2__Impl"


    // $ANTLR start "rule__Chain_Steps__Group__0"
    // InternalGherkinParser.g:1845:1: rule__Chain_Steps__Group__0 : rule__Chain_Steps__Group__0__Impl rule__Chain_Steps__Group__1 ;
    public final void rule__Chain_Steps__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1849:1: ( rule__Chain_Steps__Group__0__Impl rule__Chain_Steps__Group__1 )
            // InternalGherkinParser.g:1850:2: rule__Chain_Steps__Group__0__Impl rule__Chain_Steps__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Chain_Steps__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chain_Steps__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain_Steps__Group__0"


    // $ANTLR start "rule__Chain_Steps__Group__0__Impl"
    // InternalGherkinParser.g:1857:1: rule__Chain_Steps__Group__0__Impl : ( () ) ;
    public final void rule__Chain_Steps__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1861:1: ( ( () ) )
            // InternalGherkinParser.g:1862:1: ( () )
            {
            // InternalGherkinParser.g:1862:1: ( () )
            // InternalGherkinParser.g:1863:2: ()
            {
             before(grammarAccess.getChain_StepsAccess().getChain_StepsAction_0()); 
            // InternalGherkinParser.g:1864:2: ()
            // InternalGherkinParser.g:1864:3: 
            {
            }

             after(grammarAccess.getChain_StepsAccess().getChain_StepsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain_Steps__Group__0__Impl"


    // $ANTLR start "rule__Chain_Steps__Group__1"
    // InternalGherkinParser.g:1872:1: rule__Chain_Steps__Group__1 : rule__Chain_Steps__Group__1__Impl ;
    public final void rule__Chain_Steps__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1876:1: ( rule__Chain_Steps__Group__1__Impl )
            // InternalGherkinParser.g:1877:2: rule__Chain_Steps__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chain_Steps__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain_Steps__Group__1"


    // $ANTLR start "rule__Chain_Steps__Group__1__Impl"
    // InternalGherkinParser.g:1883:1: rule__Chain_Steps__Group__1__Impl : ( ( rule__Chain_Steps__Group_1__0 ) ) ;
    public final void rule__Chain_Steps__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1887:1: ( ( ( rule__Chain_Steps__Group_1__0 ) ) )
            // InternalGherkinParser.g:1888:1: ( ( rule__Chain_Steps__Group_1__0 ) )
            {
            // InternalGherkinParser.g:1888:1: ( ( rule__Chain_Steps__Group_1__0 ) )
            // InternalGherkinParser.g:1889:2: ( rule__Chain_Steps__Group_1__0 )
            {
             before(grammarAccess.getChain_StepsAccess().getGroup_1()); 
            // InternalGherkinParser.g:1890:2: ( rule__Chain_Steps__Group_1__0 )
            // InternalGherkinParser.g:1890:3: rule__Chain_Steps__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Chain_Steps__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getChain_StepsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain_Steps__Group__1__Impl"


    // $ANTLR start "rule__Chain_Steps__Group_1__0"
    // InternalGherkinParser.g:1899:1: rule__Chain_Steps__Group_1__0 : rule__Chain_Steps__Group_1__0__Impl rule__Chain_Steps__Group_1__1 ;
    public final void rule__Chain_Steps__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1903:1: ( rule__Chain_Steps__Group_1__0__Impl rule__Chain_Steps__Group_1__1 )
            // InternalGherkinParser.g:1904:2: rule__Chain_Steps__Group_1__0__Impl rule__Chain_Steps__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Chain_Steps__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chain_Steps__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain_Steps__Group_1__0"


    // $ANTLR start "rule__Chain_Steps__Group_1__0__Impl"
    // InternalGherkinParser.g:1911:1: rule__Chain_Steps__Group_1__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Chain_Steps__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1915:1: ( ( RULE_BEGIN ) )
            // InternalGherkinParser.g:1916:1: ( RULE_BEGIN )
            {
            // InternalGherkinParser.g:1916:1: ( RULE_BEGIN )
            // InternalGherkinParser.g:1917:2: RULE_BEGIN
            {
             before(grammarAccess.getChain_StepsAccess().getBEGINTerminalRuleCall_1_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getChain_StepsAccess().getBEGINTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain_Steps__Group_1__0__Impl"


    // $ANTLR start "rule__Chain_Steps__Group_1__1"
    // InternalGherkinParser.g:1926:1: rule__Chain_Steps__Group_1__1 : rule__Chain_Steps__Group_1__1__Impl rule__Chain_Steps__Group_1__2 ;
    public final void rule__Chain_Steps__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1930:1: ( rule__Chain_Steps__Group_1__1__Impl rule__Chain_Steps__Group_1__2 )
            // InternalGherkinParser.g:1931:2: rule__Chain_Steps__Group_1__1__Impl rule__Chain_Steps__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__Chain_Steps__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chain_Steps__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain_Steps__Group_1__1"


    // $ANTLR start "rule__Chain_Steps__Group_1__1__Impl"
    // InternalGherkinParser.g:1938:1: rule__Chain_Steps__Group_1__1__Impl : ( ( rule__Chain_Steps__ChainAssignment_1_1 )* ) ;
    public final void rule__Chain_Steps__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1942:1: ( ( ( rule__Chain_Steps__ChainAssignment_1_1 )* ) )
            // InternalGherkinParser.g:1943:1: ( ( rule__Chain_Steps__ChainAssignment_1_1 )* )
            {
            // InternalGherkinParser.g:1943:1: ( ( rule__Chain_Steps__ChainAssignment_1_1 )* )
            // InternalGherkinParser.g:1944:2: ( rule__Chain_Steps__ChainAssignment_1_1 )*
            {
             before(grammarAccess.getChain_StepsAccess().getChainAssignment_1_1()); 
            // InternalGherkinParser.g:1945:2: ( rule__Chain_Steps__ChainAssignment_1_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Given||(LA17_0>=Then && LA17_0<=But)||LA17_0==Asterisk) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGherkinParser.g:1945:3: rule__Chain_Steps__ChainAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Chain_Steps__ChainAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getChain_StepsAccess().getChainAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain_Steps__Group_1__1__Impl"


    // $ANTLR start "rule__Chain_Steps__Group_1__2"
    // InternalGherkinParser.g:1953:1: rule__Chain_Steps__Group_1__2 : rule__Chain_Steps__Group_1__2__Impl ;
    public final void rule__Chain_Steps__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1957:1: ( rule__Chain_Steps__Group_1__2__Impl )
            // InternalGherkinParser.g:1958:2: rule__Chain_Steps__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chain_Steps__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain_Steps__Group_1__2"


    // $ANTLR start "rule__Chain_Steps__Group_1__2__Impl"
    // InternalGherkinParser.g:1964:1: rule__Chain_Steps__Group_1__2__Impl : ( RULE_END ) ;
    public final void rule__Chain_Steps__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1968:1: ( ( RULE_END ) )
            // InternalGherkinParser.g:1969:1: ( RULE_END )
            {
            // InternalGherkinParser.g:1969:1: ( RULE_END )
            // InternalGherkinParser.g:1970:2: RULE_END
            {
             before(grammarAccess.getChain_StepsAccess().getENDTerminalRuleCall_1_2()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getChain_StepsAccess().getENDTerminalRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain_Steps__Group_1__2__Impl"


    // $ANTLR start "rule__Given_Statement__Group__0"
    // InternalGherkinParser.g:1980:1: rule__Given_Statement__Group__0 : rule__Given_Statement__Group__0__Impl rule__Given_Statement__Group__1 ;
    public final void rule__Given_Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1984:1: ( rule__Given_Statement__Group__0__Impl rule__Given_Statement__Group__1 )
            // InternalGherkinParser.g:1985:2: rule__Given_Statement__Group__0__Impl rule__Given_Statement__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Given_Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Given_Statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Given_Statement__Group__0"


    // $ANTLR start "rule__Given_Statement__Group__0__Impl"
    // InternalGherkinParser.g:1992:1: rule__Given_Statement__Group__0__Impl : ( Given ) ;
    public final void rule__Given_Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:1996:1: ( ( Given ) )
            // InternalGherkinParser.g:1997:1: ( Given )
            {
            // InternalGherkinParser.g:1997:1: ( Given )
            // InternalGherkinParser.g:1998:2: Given
            {
             before(grammarAccess.getGiven_StatementAccess().getGivenKeyword_0()); 
            match(input,Given,FOLLOW_2); 
             after(grammarAccess.getGiven_StatementAccess().getGivenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Given_Statement__Group__0__Impl"


    // $ANTLR start "rule__Given_Statement__Group__1"
    // InternalGherkinParser.g:2007:1: rule__Given_Statement__Group__1 : rule__Given_Statement__Group__1__Impl ;
    public final void rule__Given_Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2011:1: ( rule__Given_Statement__Group__1__Impl )
            // InternalGherkinParser.g:2012:2: rule__Given_Statement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Given_Statement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Given_Statement__Group__1"


    // $ANTLR start "rule__Given_Statement__Group__1__Impl"
    // InternalGherkinParser.g:2018:1: rule__Given_Statement__Group__1__Impl : ( ( rule__Given_Statement__DescAssignment_1 ) ) ;
    public final void rule__Given_Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2022:1: ( ( ( rule__Given_Statement__DescAssignment_1 ) ) )
            // InternalGherkinParser.g:2023:1: ( ( rule__Given_Statement__DescAssignment_1 ) )
            {
            // InternalGherkinParser.g:2023:1: ( ( rule__Given_Statement__DescAssignment_1 ) )
            // InternalGherkinParser.g:2024:2: ( rule__Given_Statement__DescAssignment_1 )
            {
             before(grammarAccess.getGiven_StatementAccess().getDescAssignment_1()); 
            // InternalGherkinParser.g:2025:2: ( rule__Given_Statement__DescAssignment_1 )
            // InternalGherkinParser.g:2025:3: rule__Given_Statement__DescAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Given_Statement__DescAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGiven_StatementAccess().getDescAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Given_Statement__Group__1__Impl"


    // $ANTLR start "rule__When_Statement__Group__0"
    // InternalGherkinParser.g:2034:1: rule__When_Statement__Group__0 : rule__When_Statement__Group__0__Impl rule__When_Statement__Group__1 ;
    public final void rule__When_Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2038:1: ( rule__When_Statement__Group__0__Impl rule__When_Statement__Group__1 )
            // InternalGherkinParser.g:2039:2: rule__When_Statement__Group__0__Impl rule__When_Statement__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__When_Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__When_Statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When_Statement__Group__0"


    // $ANTLR start "rule__When_Statement__Group__0__Impl"
    // InternalGherkinParser.g:2046:1: rule__When_Statement__Group__0__Impl : ( When ) ;
    public final void rule__When_Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2050:1: ( ( When ) )
            // InternalGherkinParser.g:2051:1: ( When )
            {
            // InternalGherkinParser.g:2051:1: ( When )
            // InternalGherkinParser.g:2052:2: When
            {
             before(grammarAccess.getWhen_StatementAccess().getWhenKeyword_0()); 
            match(input,When,FOLLOW_2); 
             after(grammarAccess.getWhen_StatementAccess().getWhenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When_Statement__Group__0__Impl"


    // $ANTLR start "rule__When_Statement__Group__1"
    // InternalGherkinParser.g:2061:1: rule__When_Statement__Group__1 : rule__When_Statement__Group__1__Impl ;
    public final void rule__When_Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2065:1: ( rule__When_Statement__Group__1__Impl )
            // InternalGherkinParser.g:2066:2: rule__When_Statement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__When_Statement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When_Statement__Group__1"


    // $ANTLR start "rule__When_Statement__Group__1__Impl"
    // InternalGherkinParser.g:2072:1: rule__When_Statement__Group__1__Impl : ( ( rule__When_Statement__DescAssignment_1 ) ) ;
    public final void rule__When_Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2076:1: ( ( ( rule__When_Statement__DescAssignment_1 ) ) )
            // InternalGherkinParser.g:2077:1: ( ( rule__When_Statement__DescAssignment_1 ) )
            {
            // InternalGherkinParser.g:2077:1: ( ( rule__When_Statement__DescAssignment_1 ) )
            // InternalGherkinParser.g:2078:2: ( rule__When_Statement__DescAssignment_1 )
            {
             before(grammarAccess.getWhen_StatementAccess().getDescAssignment_1()); 
            // InternalGherkinParser.g:2079:2: ( rule__When_Statement__DescAssignment_1 )
            // InternalGherkinParser.g:2079:3: rule__When_Statement__DescAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__When_Statement__DescAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhen_StatementAccess().getDescAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When_Statement__Group__1__Impl"


    // $ANTLR start "rule__Then_Statement__Group__0"
    // InternalGherkinParser.g:2088:1: rule__Then_Statement__Group__0 : rule__Then_Statement__Group__0__Impl rule__Then_Statement__Group__1 ;
    public final void rule__Then_Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2092:1: ( rule__Then_Statement__Group__0__Impl rule__Then_Statement__Group__1 )
            // InternalGherkinParser.g:2093:2: rule__Then_Statement__Group__0__Impl rule__Then_Statement__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Then_Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Then_Statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then_Statement__Group__0"


    // $ANTLR start "rule__Then_Statement__Group__0__Impl"
    // InternalGherkinParser.g:2100:1: rule__Then_Statement__Group__0__Impl : ( Then ) ;
    public final void rule__Then_Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2104:1: ( ( Then ) )
            // InternalGherkinParser.g:2105:1: ( Then )
            {
            // InternalGherkinParser.g:2105:1: ( Then )
            // InternalGherkinParser.g:2106:2: Then
            {
             before(grammarAccess.getThen_StatementAccess().getThenKeyword_0()); 
            match(input,Then,FOLLOW_2); 
             after(grammarAccess.getThen_StatementAccess().getThenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then_Statement__Group__0__Impl"


    // $ANTLR start "rule__Then_Statement__Group__1"
    // InternalGherkinParser.g:2115:1: rule__Then_Statement__Group__1 : rule__Then_Statement__Group__1__Impl ;
    public final void rule__Then_Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2119:1: ( rule__Then_Statement__Group__1__Impl )
            // InternalGherkinParser.g:2120:2: rule__Then_Statement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Then_Statement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then_Statement__Group__1"


    // $ANTLR start "rule__Then_Statement__Group__1__Impl"
    // InternalGherkinParser.g:2126:1: rule__Then_Statement__Group__1__Impl : ( ( rule__Then_Statement__DescAssignment_1 ) ) ;
    public final void rule__Then_Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2130:1: ( ( ( rule__Then_Statement__DescAssignment_1 ) ) )
            // InternalGherkinParser.g:2131:1: ( ( rule__Then_Statement__DescAssignment_1 ) )
            {
            // InternalGherkinParser.g:2131:1: ( ( rule__Then_Statement__DescAssignment_1 ) )
            // InternalGherkinParser.g:2132:2: ( rule__Then_Statement__DescAssignment_1 )
            {
             before(grammarAccess.getThen_StatementAccess().getDescAssignment_1()); 
            // InternalGherkinParser.g:2133:2: ( rule__Then_Statement__DescAssignment_1 )
            // InternalGherkinParser.g:2133:3: rule__Then_Statement__DescAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Then_Statement__DescAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getThen_StatementAccess().getDescAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then_Statement__Group__1__Impl"


    // $ANTLR start "rule__But_Statement__Group__0"
    // InternalGherkinParser.g:2142:1: rule__But_Statement__Group__0 : rule__But_Statement__Group__0__Impl rule__But_Statement__Group__1 ;
    public final void rule__But_Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2146:1: ( rule__But_Statement__Group__0__Impl rule__But_Statement__Group__1 )
            // InternalGherkinParser.g:2147:2: rule__But_Statement__Group__0__Impl rule__But_Statement__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__But_Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__But_Statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__But_Statement__Group__0"


    // $ANTLR start "rule__But_Statement__Group__0__Impl"
    // InternalGherkinParser.g:2154:1: rule__But_Statement__Group__0__Impl : ( But ) ;
    public final void rule__But_Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2158:1: ( ( But ) )
            // InternalGherkinParser.g:2159:1: ( But )
            {
            // InternalGherkinParser.g:2159:1: ( But )
            // InternalGherkinParser.g:2160:2: But
            {
             before(grammarAccess.getBut_StatementAccess().getButKeyword_0()); 
            match(input,But,FOLLOW_2); 
             after(grammarAccess.getBut_StatementAccess().getButKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__But_Statement__Group__0__Impl"


    // $ANTLR start "rule__But_Statement__Group__1"
    // InternalGherkinParser.g:2169:1: rule__But_Statement__Group__1 : rule__But_Statement__Group__1__Impl ;
    public final void rule__But_Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2173:1: ( rule__But_Statement__Group__1__Impl )
            // InternalGherkinParser.g:2174:2: rule__But_Statement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__But_Statement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__But_Statement__Group__1"


    // $ANTLR start "rule__But_Statement__Group__1__Impl"
    // InternalGherkinParser.g:2180:1: rule__But_Statement__Group__1__Impl : ( ( rule__But_Statement__DescAssignment_1 ) ) ;
    public final void rule__But_Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2184:1: ( ( ( rule__But_Statement__DescAssignment_1 ) ) )
            // InternalGherkinParser.g:2185:1: ( ( rule__But_Statement__DescAssignment_1 ) )
            {
            // InternalGherkinParser.g:2185:1: ( ( rule__But_Statement__DescAssignment_1 ) )
            // InternalGherkinParser.g:2186:2: ( rule__But_Statement__DescAssignment_1 )
            {
             before(grammarAccess.getBut_StatementAccess().getDescAssignment_1()); 
            // InternalGherkinParser.g:2187:2: ( rule__But_Statement__DescAssignment_1 )
            // InternalGherkinParser.g:2187:3: rule__But_Statement__DescAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__But_Statement__DescAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBut_StatementAccess().getDescAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__But_Statement__Group__1__Impl"


    // $ANTLR start "rule__And_Statement__Group__0"
    // InternalGherkinParser.g:2196:1: rule__And_Statement__Group__0 : rule__And_Statement__Group__0__Impl rule__And_Statement__Group__1 ;
    public final void rule__And_Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2200:1: ( rule__And_Statement__Group__0__Impl rule__And_Statement__Group__1 )
            // InternalGherkinParser.g:2201:2: rule__And_Statement__Group__0__Impl rule__And_Statement__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__And_Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And_Statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And_Statement__Group__0"


    // $ANTLR start "rule__And_Statement__Group__0__Impl"
    // InternalGherkinParser.g:2208:1: rule__And_Statement__Group__0__Impl : ( And ) ;
    public final void rule__And_Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2212:1: ( ( And ) )
            // InternalGherkinParser.g:2213:1: ( And )
            {
            // InternalGherkinParser.g:2213:1: ( And )
            // InternalGherkinParser.g:2214:2: And
            {
             before(grammarAccess.getAnd_StatementAccess().getAndKeyword_0()); 
            match(input,And,FOLLOW_2); 
             after(grammarAccess.getAnd_StatementAccess().getAndKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And_Statement__Group__0__Impl"


    // $ANTLR start "rule__And_Statement__Group__1"
    // InternalGherkinParser.g:2223:1: rule__And_Statement__Group__1 : rule__And_Statement__Group__1__Impl ;
    public final void rule__And_Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2227:1: ( rule__And_Statement__Group__1__Impl )
            // InternalGherkinParser.g:2228:2: rule__And_Statement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And_Statement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And_Statement__Group__1"


    // $ANTLR start "rule__And_Statement__Group__1__Impl"
    // InternalGherkinParser.g:2234:1: rule__And_Statement__Group__1__Impl : ( ( rule__And_Statement__DescAssignment_1 ) ) ;
    public final void rule__And_Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2238:1: ( ( ( rule__And_Statement__DescAssignment_1 ) ) )
            // InternalGherkinParser.g:2239:1: ( ( rule__And_Statement__DescAssignment_1 ) )
            {
            // InternalGherkinParser.g:2239:1: ( ( rule__And_Statement__DescAssignment_1 ) )
            // InternalGherkinParser.g:2240:2: ( rule__And_Statement__DescAssignment_1 )
            {
             before(grammarAccess.getAnd_StatementAccess().getDescAssignment_1()); 
            // InternalGherkinParser.g:2241:2: ( rule__And_Statement__DescAssignment_1 )
            // InternalGherkinParser.g:2241:3: rule__And_Statement__DescAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__And_Statement__DescAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnd_StatementAccess().getDescAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And_Statement__Group__1__Impl"


    // $ANTLR start "rule__Star_Statement__Group__0"
    // InternalGherkinParser.g:2250:1: rule__Star_Statement__Group__0 : rule__Star_Statement__Group__0__Impl rule__Star_Statement__Group__1 ;
    public final void rule__Star_Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2254:1: ( rule__Star_Statement__Group__0__Impl rule__Star_Statement__Group__1 )
            // InternalGherkinParser.g:2255:2: rule__Star_Statement__Group__0__Impl rule__Star_Statement__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Star_Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Star_Statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Star_Statement__Group__0"


    // $ANTLR start "rule__Star_Statement__Group__0__Impl"
    // InternalGherkinParser.g:2262:1: rule__Star_Statement__Group__0__Impl : ( Asterisk ) ;
    public final void rule__Star_Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2266:1: ( ( Asterisk ) )
            // InternalGherkinParser.g:2267:1: ( Asterisk )
            {
            // InternalGherkinParser.g:2267:1: ( Asterisk )
            // InternalGherkinParser.g:2268:2: Asterisk
            {
             before(grammarAccess.getStar_StatementAccess().getAsteriskKeyword_0()); 
            match(input,Asterisk,FOLLOW_2); 
             after(grammarAccess.getStar_StatementAccess().getAsteriskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Star_Statement__Group__0__Impl"


    // $ANTLR start "rule__Star_Statement__Group__1"
    // InternalGherkinParser.g:2277:1: rule__Star_Statement__Group__1 : rule__Star_Statement__Group__1__Impl ;
    public final void rule__Star_Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2281:1: ( rule__Star_Statement__Group__1__Impl )
            // InternalGherkinParser.g:2282:2: rule__Star_Statement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Star_Statement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Star_Statement__Group__1"


    // $ANTLR start "rule__Star_Statement__Group__1__Impl"
    // InternalGherkinParser.g:2288:1: rule__Star_Statement__Group__1__Impl : ( ( rule__Star_Statement__DescAssignment_1 ) ) ;
    public final void rule__Star_Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2292:1: ( ( ( rule__Star_Statement__DescAssignment_1 ) ) )
            // InternalGherkinParser.g:2293:1: ( ( rule__Star_Statement__DescAssignment_1 ) )
            {
            // InternalGherkinParser.g:2293:1: ( ( rule__Star_Statement__DescAssignment_1 ) )
            // InternalGherkinParser.g:2294:2: ( rule__Star_Statement__DescAssignment_1 )
            {
             before(grammarAccess.getStar_StatementAccess().getDescAssignment_1()); 
            // InternalGherkinParser.g:2295:2: ( rule__Star_Statement__DescAssignment_1 )
            // InternalGherkinParser.g:2295:3: rule__Star_Statement__DescAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Star_Statement__DescAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStar_StatementAccess().getDescAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Star_Statement__Group__1__Impl"


    // $ANTLR start "rule__Description__Group__0"
    // InternalGherkinParser.g:2304:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2308:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalGherkinParser.g:2309:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Description__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__0"


    // $ANTLR start "rule__Description__Group__0__Impl"
    // InternalGherkinParser.g:2316:1: rule__Description__Group__0__Impl : ( () ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2320:1: ( ( () ) )
            // InternalGherkinParser.g:2321:1: ( () )
            {
            // InternalGherkinParser.g:2321:1: ( () )
            // InternalGherkinParser.g:2322:2: ()
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionAction_0()); 
            // InternalGherkinParser.g:2323:2: ()
            // InternalGherkinParser.g:2323:3: 
            {
            }

             after(grammarAccess.getDescriptionAccess().getDescriptionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__0__Impl"


    // $ANTLR start "rule__Description__Group__1"
    // InternalGherkinParser.g:2331:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2335:1: ( rule__Description__Group__1__Impl )
            // InternalGherkinParser.g:2336:2: rule__Description__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__1"


    // $ANTLR start "rule__Description__Group__1__Impl"
    // InternalGherkinParser.g:2342:1: rule__Description__Group__1__Impl : ( ( rule__Description__DescAssignment_1 )* ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2346:1: ( ( ( rule__Description__DescAssignment_1 )* ) )
            // InternalGherkinParser.g:2347:1: ( ( rule__Description__DescAssignment_1 )* )
            {
            // InternalGherkinParser.g:2347:1: ( ( rule__Description__DescAssignment_1 )* )
            // InternalGherkinParser.g:2348:2: ( rule__Description__DescAssignment_1 )*
            {
             before(grammarAccess.getDescriptionAccess().getDescAssignment_1()); 
            // InternalGherkinParser.g:2349:2: ( rule__Description__DescAssignment_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==Backspace||LA18_0==RULE_ID||LA18_0==RULE_STRING) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGherkinParser.g:2349:3: rule__Description__DescAssignment_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Description__DescAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getDescriptionAccess().getDescAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__1__Impl"


    // $ANTLR start "rule__Gherkin_Language__FeaturesAssignment_0"
    // InternalGherkinParser.g:2358:1: rule__Gherkin_Language__FeaturesAssignment_0 : ( ruleFeature ) ;
    public final void rule__Gherkin_Language__FeaturesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2362:1: ( ( ruleFeature ) )
            // InternalGherkinParser.g:2363:2: ( ruleFeature )
            {
            // InternalGherkinParser.g:2363:2: ( ruleFeature )
            // InternalGherkinParser.g:2364:3: ruleFeature
            {
             before(grammarAccess.getGherkin_LanguageAccess().getFeaturesFeatureParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getGherkin_LanguageAccess().getFeaturesFeatureParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gherkin_Language__FeaturesAssignment_0"


    // $ANTLR start "rule__Gherkin_Language__RulesAssignment_1"
    // InternalGherkinParser.g:2373:1: rule__Gherkin_Language__RulesAssignment_1 : ( ruleRule ) ;
    public final void rule__Gherkin_Language__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2377:1: ( ( ruleRule ) )
            // InternalGherkinParser.g:2378:2: ( ruleRule )
            {
            // InternalGherkinParser.g:2378:2: ( ruleRule )
            // InternalGherkinParser.g:2379:3: ruleRule
            {
             before(grammarAccess.getGherkin_LanguageAccess().getRulesRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getGherkin_LanguageAccess().getRulesRuleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gherkin_Language__RulesAssignment_1"


    // $ANTLR start "rule__Feature__Feature_backgroundAssignment_2_1"
    // InternalGherkinParser.g:2388:1: rule__Feature__Feature_backgroundAssignment_2_1 : ( ruleBackground ) ;
    public final void rule__Feature__Feature_backgroundAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2392:1: ( ( ruleBackground ) )
            // InternalGherkinParser.g:2393:2: ( ruleBackground )
            {
            // InternalGherkinParser.g:2393:2: ( ruleBackground )
            // InternalGherkinParser.g:2394:3: ruleBackground
            {
             before(grammarAccess.getFeatureAccess().getFeature_backgroundBackgroundParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBackground();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getFeature_backgroundBackgroundParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Feature_backgroundAssignment_2_1"


    // $ANTLR start "rule__Feature__ScenariosAssignment_2_2"
    // InternalGherkinParser.g:2403:1: rule__Feature__ScenariosAssignment_2_2 : ( ruleScenario ) ;
    public final void rule__Feature__ScenariosAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2407:1: ( ( ruleScenario ) )
            // InternalGherkinParser.g:2408:2: ( ruleScenario )
            {
            // InternalGherkinParser.g:2408:2: ( ruleScenario )
            // InternalGherkinParser.g:2409:3: ruleScenario
            {
             before(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__ScenariosAssignment_2_2"


    // $ANTLR start "rule__Background__TitleAssignment_0"
    // InternalGherkinParser.g:2418:1: rule__Background__TitleAssignment_0 : ( ( Background ) ) ;
    public final void rule__Background__TitleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2422:1: ( ( ( Background ) ) )
            // InternalGherkinParser.g:2423:2: ( ( Background ) )
            {
            // InternalGherkinParser.g:2423:2: ( ( Background ) )
            // InternalGherkinParser.g:2424:3: ( Background )
            {
             before(grammarAccess.getBackgroundAccess().getTitleBackgroundKeyword_0_0()); 
            // InternalGherkinParser.g:2425:3: ( Background )
            // InternalGherkinParser.g:2426:4: Background
            {
             before(grammarAccess.getBackgroundAccess().getTitleBackgroundKeyword_0_0()); 
            match(input,Background,FOLLOW_2); 
             after(grammarAccess.getBackgroundAccess().getTitleBackgroundKeyword_0_0()); 

            }

             after(grammarAccess.getBackgroundAccess().getTitleBackgroundKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__TitleAssignment_0"


    // $ANTLR start "rule__Background__Background_StepsAssignment_1_1"
    // InternalGherkinParser.g:2437:1: rule__Background__Background_StepsAssignment_1_1 : ( ruleSteps ) ;
    public final void rule__Background__Background_StepsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2441:1: ( ( ruleSteps ) )
            // InternalGherkinParser.g:2442:2: ( ruleSteps )
            {
            // InternalGherkinParser.g:2442:2: ( ruleSteps )
            // InternalGherkinParser.g:2443:3: ruleSteps
            {
             before(grammarAccess.getBackgroundAccess().getBackground_StepsStepsParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSteps();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getBackground_StepsStepsParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Background_StepsAssignment_1_1"


    // $ANTLR start "rule__Normal_Scenario__Scenario_stepsAssignment_2"
    // InternalGherkinParser.g:2452:1: rule__Normal_Scenario__Scenario_stepsAssignment_2 : ( ruleChain_Steps ) ;
    public final void rule__Normal_Scenario__Scenario_stepsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2456:1: ( ( ruleChain_Steps ) )
            // InternalGherkinParser.g:2457:2: ( ruleChain_Steps )
            {
            // InternalGherkinParser.g:2457:2: ( ruleChain_Steps )
            // InternalGherkinParser.g:2458:3: ruleChain_Steps
            {
             before(grammarAccess.getNormal_ScenarioAccess().getScenario_stepsChain_StepsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleChain_Steps();

            state._fsp--;

             after(grammarAccess.getNormal_ScenarioAccess().getScenario_stepsChain_StepsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Normal_Scenario__Scenario_stepsAssignment_2"


    // $ANTLR start "rule__Scenario_Outline__StepsAssignment_2_1"
    // InternalGherkinParser.g:2467:1: rule__Scenario_Outline__StepsAssignment_2_1 : ( ruleSteps ) ;
    public final void rule__Scenario_Outline__StepsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2471:1: ( ( ruleSteps ) )
            // InternalGherkinParser.g:2472:2: ( ruleSteps )
            {
            // InternalGherkinParser.g:2472:2: ( ruleSteps )
            // InternalGherkinParser.g:2473:3: ruleSteps
            {
             before(grammarAccess.getScenario_OutlineAccess().getStepsStepsParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSteps();

            state._fsp--;

             after(grammarAccess.getScenario_OutlineAccess().getStepsStepsParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario_Outline__StepsAssignment_2_1"


    // $ANTLR start "rule__Scenario_Outline__ExampleAssignment_2_2"
    // InternalGherkinParser.g:2482:1: rule__Scenario_Outline__ExampleAssignment_2_2 : ( ruleExamples ) ;
    public final void rule__Scenario_Outline__ExampleAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2486:1: ( ( ruleExamples ) )
            // InternalGherkinParser.g:2487:2: ( ruleExamples )
            {
            // InternalGherkinParser.g:2487:2: ( ruleExamples )
            // InternalGherkinParser.g:2488:3: ruleExamples
            {
             before(grammarAccess.getScenario_OutlineAccess().getExampleExamplesParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExamples();

            state._fsp--;

             after(grammarAccess.getScenario_OutlineAccess().getExampleExamplesParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario_Outline__ExampleAssignment_2_2"


    // $ANTLR start "rule__Examples__RowsAssignment_2_1"
    // InternalGherkinParser.g:2497:1: rule__Examples__RowsAssignment_2_1 : ( ruleExamples_row ) ;
    public final void rule__Examples__RowsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2501:1: ( ( ruleExamples_row ) )
            // InternalGherkinParser.g:2502:2: ( ruleExamples_row )
            {
            // InternalGherkinParser.g:2502:2: ( ruleExamples_row )
            // InternalGherkinParser.g:2503:3: ruleExamples_row
            {
             before(grammarAccess.getExamplesAccess().getRowsExamples_rowParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExamples_row();

            state._fsp--;

             after(grammarAccess.getExamplesAccess().getRowsExamples_rowParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__RowsAssignment_2_1"


    // $ANTLR start "rule__Rule__BackgroundAssignment_2_1"
    // InternalGherkinParser.g:2512:1: rule__Rule__BackgroundAssignment_2_1 : ( ruleBackground ) ;
    public final void rule__Rule__BackgroundAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2516:1: ( ( ruleBackground ) )
            // InternalGherkinParser.g:2517:2: ( ruleBackground )
            {
            // InternalGherkinParser.g:2517:2: ( ruleBackground )
            // InternalGherkinParser.g:2518:3: ruleBackground
            {
             before(grammarAccess.getRuleAccess().getBackgroundBackgroundParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBackground();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getBackgroundBackgroundParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__BackgroundAssignment_2_1"


    // $ANTLR start "rule__Rule__ExamplesAssignment_2_2"
    // InternalGherkinParser.g:2527:1: rule__Rule__ExamplesAssignment_2_2 : ( ruleExample ) ;
    public final void rule__Rule__ExamplesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2531:1: ( ( ruleExample ) )
            // InternalGherkinParser.g:2532:2: ( ruleExample )
            {
            // InternalGherkinParser.g:2532:2: ( ruleExample )
            // InternalGherkinParser.g:2533:3: ruleExample
            {
             before(grammarAccess.getRuleAccess().getExamplesExampleParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExample();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getExamplesExampleParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ExamplesAssignment_2_2"


    // $ANTLR start "rule__Example__Example_stepsAssignment_2"
    // InternalGherkinParser.g:2542:1: rule__Example__Example_stepsAssignment_2 : ( ruleChain_Steps ) ;
    public final void rule__Example__Example_stepsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2546:1: ( ( ruleChain_Steps ) )
            // InternalGherkinParser.g:2547:2: ( ruleChain_Steps )
            {
            // InternalGherkinParser.g:2547:2: ( ruleChain_Steps )
            // InternalGherkinParser.g:2548:3: ruleChain_Steps
            {
             before(grammarAccess.getExampleAccess().getExample_stepsChain_StepsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleChain_Steps();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getExample_stepsChain_StepsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Example_stepsAssignment_2"


    // $ANTLR start "rule__Chain_Steps__ChainAssignment_1_1"
    // InternalGherkinParser.g:2557:1: rule__Chain_Steps__ChainAssignment_1_1 : ( ruleSteps ) ;
    public final void rule__Chain_Steps__ChainAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2561:1: ( ( ruleSteps ) )
            // InternalGherkinParser.g:2562:2: ( ruleSteps )
            {
            // InternalGherkinParser.g:2562:2: ( ruleSteps )
            // InternalGherkinParser.g:2563:3: ruleSteps
            {
             before(grammarAccess.getChain_StepsAccess().getChainStepsParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSteps();

            state._fsp--;

             after(grammarAccess.getChain_StepsAccess().getChainStepsParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain_Steps__ChainAssignment_1_1"


    // $ANTLR start "rule__Steps__Given_stepAssignment_0"
    // InternalGherkinParser.g:2572:1: rule__Steps__Given_stepAssignment_0 : ( ruleGiven_Statement ) ;
    public final void rule__Steps__Given_stepAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2576:1: ( ( ruleGiven_Statement ) )
            // InternalGherkinParser.g:2577:2: ( ruleGiven_Statement )
            {
            // InternalGherkinParser.g:2577:2: ( ruleGiven_Statement )
            // InternalGherkinParser.g:2578:3: ruleGiven_Statement
            {
             before(grammarAccess.getStepsAccess().getGiven_stepGiven_StatementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGiven_Statement();

            state._fsp--;

             after(grammarAccess.getStepsAccess().getGiven_stepGiven_StatementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Steps__Given_stepAssignment_0"


    // $ANTLR start "rule__Steps__When_stepAssignment_1"
    // InternalGherkinParser.g:2587:1: rule__Steps__When_stepAssignment_1 : ( ruleWhen_Statement ) ;
    public final void rule__Steps__When_stepAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2591:1: ( ( ruleWhen_Statement ) )
            // InternalGherkinParser.g:2592:2: ( ruleWhen_Statement )
            {
            // InternalGherkinParser.g:2592:2: ( ruleWhen_Statement )
            // InternalGherkinParser.g:2593:3: ruleWhen_Statement
            {
             before(grammarAccess.getStepsAccess().getWhen_stepWhen_StatementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWhen_Statement();

            state._fsp--;

             after(grammarAccess.getStepsAccess().getWhen_stepWhen_StatementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Steps__When_stepAssignment_1"


    // $ANTLR start "rule__Steps__But_stepAssignment_2"
    // InternalGherkinParser.g:2602:1: rule__Steps__But_stepAssignment_2 : ( ruleBut_Statement ) ;
    public final void rule__Steps__But_stepAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2606:1: ( ( ruleBut_Statement ) )
            // InternalGherkinParser.g:2607:2: ( ruleBut_Statement )
            {
            // InternalGherkinParser.g:2607:2: ( ruleBut_Statement )
            // InternalGherkinParser.g:2608:3: ruleBut_Statement
            {
             before(grammarAccess.getStepsAccess().getBut_stepBut_StatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBut_Statement();

            state._fsp--;

             after(grammarAccess.getStepsAccess().getBut_stepBut_StatementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Steps__But_stepAssignment_2"


    // $ANTLR start "rule__Steps__Then_stepAssignment_3"
    // InternalGherkinParser.g:2617:1: rule__Steps__Then_stepAssignment_3 : ( ruleThen_Statement ) ;
    public final void rule__Steps__Then_stepAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2621:1: ( ( ruleThen_Statement ) )
            // InternalGherkinParser.g:2622:2: ( ruleThen_Statement )
            {
            // InternalGherkinParser.g:2622:2: ( ruleThen_Statement )
            // InternalGherkinParser.g:2623:3: ruleThen_Statement
            {
             before(grammarAccess.getStepsAccess().getThen_stepThen_StatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleThen_Statement();

            state._fsp--;

             after(grammarAccess.getStepsAccess().getThen_stepThen_StatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Steps__Then_stepAssignment_3"


    // $ANTLR start "rule__Steps__And_stepAssignment_4"
    // InternalGherkinParser.g:2632:1: rule__Steps__And_stepAssignment_4 : ( ruleAnd_Statement ) ;
    public final void rule__Steps__And_stepAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2636:1: ( ( ruleAnd_Statement ) )
            // InternalGherkinParser.g:2637:2: ( ruleAnd_Statement )
            {
            // InternalGherkinParser.g:2637:2: ( ruleAnd_Statement )
            // InternalGherkinParser.g:2638:3: ruleAnd_Statement
            {
             before(grammarAccess.getStepsAccess().getAnd_stepAnd_StatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd_Statement();

            state._fsp--;

             after(grammarAccess.getStepsAccess().getAnd_stepAnd_StatementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Steps__And_stepAssignment_4"


    // $ANTLR start "rule__Steps__Star_stepAssignment_5"
    // InternalGherkinParser.g:2647:1: rule__Steps__Star_stepAssignment_5 : ( ruleStar_Statement ) ;
    public final void rule__Steps__Star_stepAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2651:1: ( ( ruleStar_Statement ) )
            // InternalGherkinParser.g:2652:2: ( ruleStar_Statement )
            {
            // InternalGherkinParser.g:2652:2: ( ruleStar_Statement )
            // InternalGherkinParser.g:2653:3: ruleStar_Statement
            {
             before(grammarAccess.getStepsAccess().getStar_stepStar_StatementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleStar_Statement();

            state._fsp--;

             after(grammarAccess.getStepsAccess().getStar_stepStar_StatementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Steps__Star_stepAssignment_5"


    // $ANTLR start "rule__Given_Statement__DescAssignment_1"
    // InternalGherkinParser.g:2662:1: rule__Given_Statement__DescAssignment_1 : ( ruleDescription ) ;
    public final void rule__Given_Statement__DescAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2666:1: ( ( ruleDescription ) )
            // InternalGherkinParser.g:2667:2: ( ruleDescription )
            {
            // InternalGherkinParser.g:2667:2: ( ruleDescription )
            // InternalGherkinParser.g:2668:3: ruleDescription
            {
             before(grammarAccess.getGiven_StatementAccess().getDescDescriptionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getGiven_StatementAccess().getDescDescriptionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Given_Statement__DescAssignment_1"


    // $ANTLR start "rule__When_Statement__DescAssignment_1"
    // InternalGherkinParser.g:2677:1: rule__When_Statement__DescAssignment_1 : ( ruleDescription ) ;
    public final void rule__When_Statement__DescAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2681:1: ( ( ruleDescription ) )
            // InternalGherkinParser.g:2682:2: ( ruleDescription )
            {
            // InternalGherkinParser.g:2682:2: ( ruleDescription )
            // InternalGherkinParser.g:2683:3: ruleDescription
            {
             before(grammarAccess.getWhen_StatementAccess().getDescDescriptionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getWhen_StatementAccess().getDescDescriptionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When_Statement__DescAssignment_1"


    // $ANTLR start "rule__Then_Statement__DescAssignment_1"
    // InternalGherkinParser.g:2692:1: rule__Then_Statement__DescAssignment_1 : ( ruleDescription ) ;
    public final void rule__Then_Statement__DescAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2696:1: ( ( ruleDescription ) )
            // InternalGherkinParser.g:2697:2: ( ruleDescription )
            {
            // InternalGherkinParser.g:2697:2: ( ruleDescription )
            // InternalGherkinParser.g:2698:3: ruleDescription
            {
             before(grammarAccess.getThen_StatementAccess().getDescDescriptionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getThen_StatementAccess().getDescDescriptionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then_Statement__DescAssignment_1"


    // $ANTLR start "rule__But_Statement__DescAssignment_1"
    // InternalGherkinParser.g:2707:1: rule__But_Statement__DescAssignment_1 : ( ruleDescription ) ;
    public final void rule__But_Statement__DescAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2711:1: ( ( ruleDescription ) )
            // InternalGherkinParser.g:2712:2: ( ruleDescription )
            {
            // InternalGherkinParser.g:2712:2: ( ruleDescription )
            // InternalGherkinParser.g:2713:3: ruleDescription
            {
             before(grammarAccess.getBut_StatementAccess().getDescDescriptionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getBut_StatementAccess().getDescDescriptionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__But_Statement__DescAssignment_1"


    // $ANTLR start "rule__And_Statement__DescAssignment_1"
    // InternalGherkinParser.g:2722:1: rule__And_Statement__DescAssignment_1 : ( ruleDescription ) ;
    public final void rule__And_Statement__DescAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2726:1: ( ( ruleDescription ) )
            // InternalGherkinParser.g:2727:2: ( ruleDescription )
            {
            // InternalGherkinParser.g:2727:2: ( ruleDescription )
            // InternalGherkinParser.g:2728:3: ruleDescription
            {
             before(grammarAccess.getAnd_StatementAccess().getDescDescriptionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getAnd_StatementAccess().getDescDescriptionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And_Statement__DescAssignment_1"


    // $ANTLR start "rule__Star_Statement__DescAssignment_1"
    // InternalGherkinParser.g:2737:1: rule__Star_Statement__DescAssignment_1 : ( ruleDescription ) ;
    public final void rule__Star_Statement__DescAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2741:1: ( ( ruleDescription ) )
            // InternalGherkinParser.g:2742:2: ( ruleDescription )
            {
            // InternalGherkinParser.g:2742:2: ( ruleDescription )
            // InternalGherkinParser.g:2743:3: ruleDescription
            {
             before(grammarAccess.getStar_StatementAccess().getDescDescriptionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getStar_StatementAccess().getDescDescriptionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Star_Statement__DescAssignment_1"


    // $ANTLR start "rule__Description__DescAssignment_1"
    // InternalGherkinParser.g:2752:1: rule__Description__DescAssignment_1 : ( ruleSentence ) ;
    public final void rule__Description__DescAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGherkinParser.g:2756:1: ( ( ruleSentence ) )
            // InternalGherkinParser.g:2757:2: ( ruleSentence )
            {
            // InternalGherkinParser.g:2757:2: ( ruleSentence )
            // InternalGherkinParser.g:2758:3: ruleSentence
            {
             before(grammarAccess.getDescriptionAccess().getDescSentenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getDescriptionAccess().getDescSentenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__DescAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000A10000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000000B0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000000B2L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000012F400L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000002F402L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000002F440L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000122L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000A10002L});

}