package mde.coursework.gherkin.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import mde.coursework.gherkin.services.GherkinGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGherkinParser extends AbstractInternalAntlrParser {
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

        public InternalGherkinParser(TokenStream input, GherkinGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Gherkin_Language";
       	}

       	@Override
       	protected GherkinGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGherkin_Language"
    // InternalGherkinParser.g:57:1: entryRuleGherkin_Language returns [EObject current=null] : iv_ruleGherkin_Language= ruleGherkin_Language EOF ;
    public final EObject entryRuleGherkin_Language() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGherkin_Language = null;


        try {
            // InternalGherkinParser.g:57:57: (iv_ruleGherkin_Language= ruleGherkin_Language EOF )
            // InternalGherkinParser.g:58:2: iv_ruleGherkin_Language= ruleGherkin_Language EOF
            {
             newCompositeNode(grammarAccess.getGherkin_LanguageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGherkin_Language=ruleGherkin_Language();

            state._fsp--;

             current =iv_ruleGherkin_Language; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGherkin_Language"


    // $ANTLR start "ruleGherkin_Language"
    // InternalGherkinParser.g:64:1: ruleGherkin_Language returns [EObject current=null] : ( ( (lv_features_0_0= ruleFeature ) )* | ( (lv_rules_1_0= ruleRule ) )* ) ;
    public final EObject ruleGherkin_Language() throws RecognitionException {
        EObject current = null;

        EObject lv_features_0_0 = null;

        EObject lv_rules_1_0 = null;



        	enterRule();

        try {
            // InternalGherkinParser.g:70:2: ( ( ( (lv_features_0_0= ruleFeature ) )* | ( (lv_rules_1_0= ruleRule ) )* ) )
            // InternalGherkinParser.g:71:2: ( ( (lv_features_0_0= ruleFeature ) )* | ( (lv_rules_1_0= ruleRule ) )* )
            {
            // InternalGherkinParser.g:71:2: ( ( (lv_features_0_0= ruleFeature ) )* | ( (lv_rules_1_0= ruleRule ) )* )
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
                    // InternalGherkinParser.g:72:3: ( (lv_features_0_0= ruleFeature ) )*
                    {
                    // InternalGherkinParser.g:72:3: ( (lv_features_0_0= ruleFeature ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==Feature) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalGherkinParser.g:73:4: (lv_features_0_0= ruleFeature )
                    	    {
                    	    // InternalGherkinParser.g:73:4: (lv_features_0_0= ruleFeature )
                    	    // InternalGherkinParser.g:74:5: lv_features_0_0= ruleFeature
                    	    {

                    	    					newCompositeNode(grammarAccess.getGherkin_LanguageAccess().getFeaturesFeatureParserRuleCall_0_0());
                    	    				
                    	    pushFollow(FOLLOW_3);
                    	    lv_features_0_0=ruleFeature();

                    	    state._fsp--;


                    	    					if (current==null) {
                    	    						current = createModelElementForParent(grammarAccess.getGherkin_LanguageRule());
                    	    					}
                    	    					add(
                    	    						current,
                    	    						"features",
                    	    						lv_features_0_0,
                    	    						"mde.coursework.gherkin.Gherkin.Feature");
                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalGherkinParser.g:92:3: ( (lv_rules_1_0= ruleRule ) )*
                    {
                    // InternalGherkinParser.g:92:3: ( (lv_rules_1_0= ruleRule ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==Rule) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalGherkinParser.g:93:4: (lv_rules_1_0= ruleRule )
                    	    {
                    	    // InternalGherkinParser.g:93:4: (lv_rules_1_0= ruleRule )
                    	    // InternalGherkinParser.g:94:5: lv_rules_1_0= ruleRule
                    	    {

                    	    					newCompositeNode(grammarAccess.getGherkin_LanguageAccess().getRulesRuleParserRuleCall_1_0());
                    	    				
                    	    pushFollow(FOLLOW_4);
                    	    lv_rules_1_0=ruleRule();

                    	    state._fsp--;


                    	    					if (current==null) {
                    	    						current = createModelElementForParent(grammarAccess.getGherkin_LanguageRule());
                    	    					}
                    	    					add(
                    	    						current,
                    	    						"rules",
                    	    						lv_rules_1_0,
                    	    						"mde.coursework.gherkin.Gherkin.Rule");
                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGherkin_Language"


    // $ANTLR start "entryRuleFeature"
    // InternalGherkinParser.g:115:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalGherkinParser.g:115:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalGherkinParser.g:116:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalGherkinParser.g:122:1: ruleFeature returns [EObject current=null] : (otherlv_0= Feature this_Description_1= ruleDescription (this_BEGIN_2= RULE_BEGIN ( (lv_feature_background_3_0= ruleBackground ) )? ( (lv_scenarios_4_0= ruleScenario ) )+ this_END_5= RULE_END )? ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_2=null;
        Token this_END_5=null;
        EObject this_Description_1 = null;

        EObject lv_feature_background_3_0 = null;

        EObject lv_scenarios_4_0 = null;



        	enterRule();

        try {
            // InternalGherkinParser.g:128:2: ( (otherlv_0= Feature this_Description_1= ruleDescription (this_BEGIN_2= RULE_BEGIN ( (lv_feature_background_3_0= ruleBackground ) )? ( (lv_scenarios_4_0= ruleScenario ) )+ this_END_5= RULE_END )? ) )
            // InternalGherkinParser.g:129:2: (otherlv_0= Feature this_Description_1= ruleDescription (this_BEGIN_2= RULE_BEGIN ( (lv_feature_background_3_0= ruleBackground ) )? ( (lv_scenarios_4_0= ruleScenario ) )+ this_END_5= RULE_END )? )
            {
            // InternalGherkinParser.g:129:2: (otherlv_0= Feature this_Description_1= ruleDescription (this_BEGIN_2= RULE_BEGIN ( (lv_feature_background_3_0= ruleBackground ) )? ( (lv_scenarios_4_0= ruleScenario ) )+ this_END_5= RULE_END )? )
            // InternalGherkinParser.g:130:3: otherlv_0= Feature this_Description_1= ruleDescription (this_BEGIN_2= RULE_BEGIN ( (lv_feature_background_3_0= ruleBackground ) )? ( (lv_scenarios_4_0= ruleScenario ) )+ this_END_5= RULE_END )?
            {
            otherlv_0=(Token)match(input,Feature,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureAccess().getFeatureKeyword_0());
            		

            			newCompositeNode(grammarAccess.getFeatureAccess().getDescriptionParserRuleCall_1());
            		
            pushFollow(FOLLOW_6);
            this_Description_1=ruleDescription();

            state._fsp--;


            			current = this_Description_1;
            			afterParserOrEnumRuleCall();
            		
            // InternalGherkinParser.g:142:3: (this_BEGIN_2= RULE_BEGIN ( (lv_feature_background_3_0= ruleBackground ) )? ( (lv_scenarios_4_0= ruleScenario ) )+ this_END_5= RULE_END )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_BEGIN) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGherkinParser.g:143:4: this_BEGIN_2= RULE_BEGIN ( (lv_feature_background_3_0= ruleBackground ) )? ( (lv_scenarios_4_0= ruleScenario ) )+ this_END_5= RULE_END
                    {
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

                    				newLeafNode(this_BEGIN_2, grammarAccess.getFeatureAccess().getBEGINTerminalRuleCall_2_0());
                    			
                    // InternalGherkinParser.g:147:4: ( (lv_feature_background_3_0= ruleBackground ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==Background) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalGherkinParser.g:148:5: (lv_feature_background_3_0= ruleBackground )
                            {
                            // InternalGherkinParser.g:148:5: (lv_feature_background_3_0= ruleBackground )
                            // InternalGherkinParser.g:149:6: lv_feature_background_3_0= ruleBackground
                            {

                            						newCompositeNode(grammarAccess.getFeatureAccess().getFeature_backgroundBackgroundParserRuleCall_2_1_0());
                            					
                            pushFollow(FOLLOW_7);
                            lv_feature_background_3_0=ruleBackground();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getFeatureRule());
                            						}
                            						set(
                            							current,
                            							"feature_background",
                            							lv_feature_background_3_0,
                            							"mde.coursework.gherkin.Gherkin.Background");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalGherkinParser.g:166:4: ( (lv_scenarios_4_0= ruleScenario ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==ScenarioOutline||LA5_0==Scenario) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalGherkinParser.g:167:5: (lv_scenarios_4_0= ruleScenario )
                    	    {
                    	    // InternalGherkinParser.g:167:5: (lv_scenarios_4_0= ruleScenario )
                    	    // InternalGherkinParser.g:168:6: lv_scenarios_4_0= ruleScenario
                    	    {

                    	    						newCompositeNode(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_2_2_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_scenarios_4_0=ruleScenario();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getFeatureRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"scenarios",
                    	    							lv_scenarios_4_0,
                    	    							"mde.coursework.gherkin.Gherkin.Scenario");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_5, grammarAccess.getFeatureAccess().getENDTerminalRuleCall_2_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleBackground"
    // InternalGherkinParser.g:194:1: entryRuleBackground returns [EObject current=null] : iv_ruleBackground= ruleBackground EOF ;
    public final EObject entryRuleBackground() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackground = null;


        try {
            // InternalGherkinParser.g:194:51: (iv_ruleBackground= ruleBackground EOF )
            // InternalGherkinParser.g:195:2: iv_ruleBackground= ruleBackground EOF
            {
             newCompositeNode(grammarAccess.getBackgroundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBackground=ruleBackground();

            state._fsp--;

             current =iv_ruleBackground; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBackground"


    // $ANTLR start "ruleBackground"
    // InternalGherkinParser.g:201:1: ruleBackground returns [EObject current=null] : ( ( (lv_title_0_0= Background ) ) (this_BEGIN_1= RULE_BEGIN ( (lv_background_Steps_2_0= ruleSteps ) )* this_END_3= RULE_END ) ) ;
    public final EObject ruleBackground() throws RecognitionException {
        EObject current = null;

        Token lv_title_0_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_background_Steps_2_0 = null;



        	enterRule();

        try {
            // InternalGherkinParser.g:207:2: ( ( ( (lv_title_0_0= Background ) ) (this_BEGIN_1= RULE_BEGIN ( (lv_background_Steps_2_0= ruleSteps ) )* this_END_3= RULE_END ) ) )
            // InternalGherkinParser.g:208:2: ( ( (lv_title_0_0= Background ) ) (this_BEGIN_1= RULE_BEGIN ( (lv_background_Steps_2_0= ruleSteps ) )* this_END_3= RULE_END ) )
            {
            // InternalGherkinParser.g:208:2: ( ( (lv_title_0_0= Background ) ) (this_BEGIN_1= RULE_BEGIN ( (lv_background_Steps_2_0= ruleSteps ) )* this_END_3= RULE_END ) )
            // InternalGherkinParser.g:209:3: ( (lv_title_0_0= Background ) ) (this_BEGIN_1= RULE_BEGIN ( (lv_background_Steps_2_0= ruleSteps ) )* this_END_3= RULE_END )
            {
            // InternalGherkinParser.g:209:3: ( (lv_title_0_0= Background ) )
            // InternalGherkinParser.g:210:4: (lv_title_0_0= Background )
            {
            // InternalGherkinParser.g:210:4: (lv_title_0_0= Background )
            // InternalGherkinParser.g:211:5: lv_title_0_0= Background
            {
            lv_title_0_0=(Token)match(input,Background,FOLLOW_9); 

            					newLeafNode(lv_title_0_0, grammarAccess.getBackgroundAccess().getTitleBackgroundKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBackgroundRule());
            					}
            					setWithLastConsumed(current, "title", lv_title_0_0, "Background:");
            				

            }


            }

            // InternalGherkinParser.g:223:3: (this_BEGIN_1= RULE_BEGIN ( (lv_background_Steps_2_0= ruleSteps ) )* this_END_3= RULE_END )
            // InternalGherkinParser.g:224:4: this_BEGIN_1= RULE_BEGIN ( (lv_background_Steps_2_0= ruleSteps ) )* this_END_3= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_10); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getBackgroundAccess().getBEGINTerminalRuleCall_1_0());
            			
            // InternalGherkinParser.g:228:4: ( (lv_background_Steps_2_0= ruleSteps ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Given||(LA7_0>=Then && LA7_0<=But)||LA7_0==Asterisk) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGherkinParser.g:229:5: (lv_background_Steps_2_0= ruleSteps )
            	    {
            	    // InternalGherkinParser.g:229:5: (lv_background_Steps_2_0= ruleSteps )
            	    // InternalGherkinParser.g:230:6: lv_background_Steps_2_0= ruleSteps
            	    {

            	    						newCompositeNode(grammarAccess.getBackgroundAccess().getBackground_StepsStepsParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_background_Steps_2_0=ruleSteps();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBackgroundRule());
            	    						}
            	    						add(
            	    							current,
            	    							"background_Steps",
            	    							lv_background_Steps_2_0,
            	    							"mde.coursework.gherkin.Gherkin.Steps");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            this_END_3=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_3, grammarAccess.getBackgroundAccess().getENDTerminalRuleCall_1_2());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBackground"


    // $ANTLR start "entryRuleScenario"
    // InternalGherkinParser.g:256:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalGherkinParser.g:256:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalGherkinParser.g:257:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // InternalGherkinParser.g:263:1: ruleScenario returns [EObject current=null] : (this_Normal_Scenario_0= ruleNormal_Scenario | this_Scenario_Outline_1= ruleScenario_Outline ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        EObject this_Normal_Scenario_0 = null;

        EObject this_Scenario_Outline_1 = null;



        	enterRule();

        try {
            // InternalGherkinParser.g:269:2: ( (this_Normal_Scenario_0= ruleNormal_Scenario | this_Scenario_Outline_1= ruleScenario_Outline ) )
            // InternalGherkinParser.g:270:2: (this_Normal_Scenario_0= ruleNormal_Scenario | this_Scenario_Outline_1= ruleScenario_Outline )
            {
            // InternalGherkinParser.g:270:2: (this_Normal_Scenario_0= ruleNormal_Scenario | this_Scenario_Outline_1= ruleScenario_Outline )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Scenario) ) {
                alt8=1;
            }
            else if ( (LA8_0==ScenarioOutline) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGherkinParser.g:271:3: this_Normal_Scenario_0= ruleNormal_Scenario
                    {

                    			newCompositeNode(grammarAccess.getScenarioAccess().getNormal_ScenarioParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Normal_Scenario_0=ruleNormal_Scenario();

                    state._fsp--;


                    			current = this_Normal_Scenario_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGherkinParser.g:280:3: this_Scenario_Outline_1= ruleScenario_Outline
                    {

                    			newCompositeNode(grammarAccess.getScenarioAccess().getScenario_OutlineParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Scenario_Outline_1=ruleScenario_Outline();

                    state._fsp--;


                    			current = this_Scenario_Outline_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleNormal_Scenario"
    // InternalGherkinParser.g:292:1: entryRuleNormal_Scenario returns [EObject current=null] : iv_ruleNormal_Scenario= ruleNormal_Scenario EOF ;
    public final EObject entryRuleNormal_Scenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormal_Scenario = null;


        try {
            // InternalGherkinParser.g:292:56: (iv_ruleNormal_Scenario= ruleNormal_Scenario EOF )
            // InternalGherkinParser.g:293:2: iv_ruleNormal_Scenario= ruleNormal_Scenario EOF
            {
             newCompositeNode(grammarAccess.getNormal_ScenarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNormal_Scenario=ruleNormal_Scenario();

            state._fsp--;

             current =iv_ruleNormal_Scenario; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNormal_Scenario"


    // $ANTLR start "ruleNormal_Scenario"
    // InternalGherkinParser.g:299:1: ruleNormal_Scenario returns [EObject current=null] : (otherlv_0= Scenario this_Description_1= ruleDescription ( (lv_scenario_steps_2_0= ruleChain_Steps ) ) ) ;
    public final EObject ruleNormal_Scenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Description_1 = null;

        EObject lv_scenario_steps_2_0 = null;



        	enterRule();

        try {
            // InternalGherkinParser.g:305:2: ( (otherlv_0= Scenario this_Description_1= ruleDescription ( (lv_scenario_steps_2_0= ruleChain_Steps ) ) ) )
            // InternalGherkinParser.g:306:2: (otherlv_0= Scenario this_Description_1= ruleDescription ( (lv_scenario_steps_2_0= ruleChain_Steps ) ) )
            {
            // InternalGherkinParser.g:306:2: (otherlv_0= Scenario this_Description_1= ruleDescription ( (lv_scenario_steps_2_0= ruleChain_Steps ) ) )
            // InternalGherkinParser.g:307:3: otherlv_0= Scenario this_Description_1= ruleDescription ( (lv_scenario_steps_2_0= ruleChain_Steps ) )
            {
            otherlv_0=(Token)match(input,Scenario,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getNormal_ScenarioAccess().getScenarioKeyword_0());
            		

            			newCompositeNode(grammarAccess.getNormal_ScenarioAccess().getDescriptionParserRuleCall_1());
            		
            pushFollow(FOLLOW_5);
            this_Description_1=ruleDescription();

            state._fsp--;


            			current = this_Description_1;
            			afterParserOrEnumRuleCall();
            		
            // InternalGherkinParser.g:319:3: ( (lv_scenario_steps_2_0= ruleChain_Steps ) )
            // InternalGherkinParser.g:320:4: (lv_scenario_steps_2_0= ruleChain_Steps )
            {
            // InternalGherkinParser.g:320:4: (lv_scenario_steps_2_0= ruleChain_Steps )
            // InternalGherkinParser.g:321:5: lv_scenario_steps_2_0= ruleChain_Steps
            {

            					newCompositeNode(grammarAccess.getNormal_ScenarioAccess().getScenario_stepsChain_StepsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_scenario_steps_2_0=ruleChain_Steps();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNormal_ScenarioRule());
            					}
            					set(
            						current,
            						"scenario_steps",
            						lv_scenario_steps_2_0,
            						"mde.coursework.gherkin.Gherkin.Chain_Steps");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNormal_Scenario"


    // $ANTLR start "entryRuleScenario_Outline"
    // InternalGherkinParser.g:342:1: entryRuleScenario_Outline returns [EObject current=null] : iv_ruleScenario_Outline= ruleScenario_Outline EOF ;
    public final EObject entryRuleScenario_Outline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario_Outline = null;


        try {
            // InternalGherkinParser.g:342:57: (iv_ruleScenario_Outline= ruleScenario_Outline EOF )
            // InternalGherkinParser.g:343:2: iv_ruleScenario_Outline= ruleScenario_Outline EOF
            {
             newCompositeNode(grammarAccess.getScenario_OutlineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenario_Outline=ruleScenario_Outline();

            state._fsp--;

             current =iv_ruleScenario_Outline; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScenario_Outline"


    // $ANTLR start "ruleScenario_Outline"
    // InternalGherkinParser.g:349:1: ruleScenario_Outline returns [EObject current=null] : (otherlv_0= ScenarioOutline this_Description_1= ruleDescription (this_BEGIN_2= RULE_BEGIN ( (lv_steps_3_0= ruleSteps ) )* ( (lv_example_4_0= ruleExamples ) ) this_END_5= RULE_END ) ) ;
    public final EObject ruleScenario_Outline() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_2=null;
        Token this_END_5=null;
        EObject this_Description_1 = null;

        EObject lv_steps_3_0 = null;

        EObject lv_example_4_0 = null;



        	enterRule();

        try {
            // InternalGherkinParser.g:355:2: ( (otherlv_0= ScenarioOutline this_Description_1= ruleDescription (this_BEGIN_2= RULE_BEGIN ( (lv_steps_3_0= ruleSteps ) )* ( (lv_example_4_0= ruleExamples ) ) this_END_5= RULE_END ) ) )
            // InternalGherkinParser.g:356:2: (otherlv_0= ScenarioOutline this_Description_1= ruleDescription (this_BEGIN_2= RULE_BEGIN ( (lv_steps_3_0= ruleSteps ) )* ( (lv_example_4_0= ruleExamples ) ) this_END_5= RULE_END ) )
            {
            // InternalGherkinParser.g:356:2: (otherlv_0= ScenarioOutline this_Description_1= ruleDescription (this_BEGIN_2= RULE_BEGIN ( (lv_steps_3_0= ruleSteps ) )* ( (lv_example_4_0= ruleExamples ) ) this_END_5= RULE_END ) )
            // InternalGherkinParser.g:357:3: otherlv_0= ScenarioOutline this_Description_1= ruleDescription (this_BEGIN_2= RULE_BEGIN ( (lv_steps_3_0= ruleSteps ) )* ( (lv_example_4_0= ruleExamples ) ) this_END_5= RULE_END )
            {
            otherlv_0=(Token)match(input,ScenarioOutline,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getScenario_OutlineAccess().getScenarioOutlineKeyword_0());
            		

            			newCompositeNode(grammarAccess.getScenario_OutlineAccess().getDescriptionParserRuleCall_1());
            		
            pushFollow(FOLLOW_9);
            this_Description_1=ruleDescription();

            state._fsp--;


            			current = this_Description_1;
            			afterParserOrEnumRuleCall();
            		
            // InternalGherkinParser.g:369:3: (this_BEGIN_2= RULE_BEGIN ( (lv_steps_3_0= ruleSteps ) )* ( (lv_example_4_0= ruleExamples ) ) this_END_5= RULE_END )
            // InternalGherkinParser.g:370:4: this_BEGIN_2= RULE_BEGIN ( (lv_steps_3_0= ruleSteps ) )* ( (lv_example_4_0= ruleExamples ) ) this_END_5= RULE_END
            {
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_11); 

            				newLeafNode(this_BEGIN_2, grammarAccess.getScenario_OutlineAccess().getBEGINTerminalRuleCall_2_0());
            			
            // InternalGherkinParser.g:374:4: ( (lv_steps_3_0= ruleSteps ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Given||(LA9_0>=Then && LA9_0<=But)||LA9_0==Asterisk) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGherkinParser.g:375:5: (lv_steps_3_0= ruleSteps )
            	    {
            	    // InternalGherkinParser.g:375:5: (lv_steps_3_0= ruleSteps )
            	    // InternalGherkinParser.g:376:6: lv_steps_3_0= ruleSteps
            	    {

            	    						newCompositeNode(grammarAccess.getScenario_OutlineAccess().getStepsStepsParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_steps_3_0=ruleSteps();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario_OutlineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"steps",
            	    							lv_steps_3_0,
            	    							"mde.coursework.gherkin.Gherkin.Steps");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalGherkinParser.g:393:4: ( (lv_example_4_0= ruleExamples ) )
            // InternalGherkinParser.g:394:5: (lv_example_4_0= ruleExamples )
            {
            // InternalGherkinParser.g:394:5: (lv_example_4_0= ruleExamples )
            // InternalGherkinParser.g:395:6: lv_example_4_0= ruleExamples
            {

            						newCompositeNode(grammarAccess.getScenario_OutlineAccess().getExampleExamplesParserRuleCall_2_2_0());
            					
            pushFollow(FOLLOW_12);
            lv_example_4_0=ruleExamples();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getScenario_OutlineRule());
            						}
            						set(
            							current,
            							"example",
            							lv_example_4_0,
            							"mde.coursework.gherkin.Gherkin.Examples");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_5, grammarAccess.getScenario_OutlineAccess().getENDTerminalRuleCall_2_3());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScenario_Outline"


    // $ANTLR start "entryRuleExamples"
    // InternalGherkinParser.g:421:1: entryRuleExamples returns [EObject current=null] : iv_ruleExamples= ruleExamples EOF ;
    public final EObject entryRuleExamples() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExamples = null;


        try {
            // InternalGherkinParser.g:421:49: (iv_ruleExamples= ruleExamples EOF )
            // InternalGherkinParser.g:422:2: iv_ruleExamples= ruleExamples EOF
            {
             newCompositeNode(grammarAccess.getExamplesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExamples=ruleExamples();

            state._fsp--;

             current =iv_ruleExamples; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExamples"


    // $ANTLR start "ruleExamples"
    // InternalGherkinParser.g:428:1: ruleExamples returns [EObject current=null] : ( () otherlv_1= Examples (this_BEGIN_2= RULE_BEGIN ( (lv_rows_3_0= ruleExamples_row ) )+ this_END_4= RULE_END ) ) ;
    public final EObject ruleExamples() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_rows_3_0 = null;



        	enterRule();

        try {
            // InternalGherkinParser.g:434:2: ( ( () otherlv_1= Examples (this_BEGIN_2= RULE_BEGIN ( (lv_rows_3_0= ruleExamples_row ) )+ this_END_4= RULE_END ) ) )
            // InternalGherkinParser.g:435:2: ( () otherlv_1= Examples (this_BEGIN_2= RULE_BEGIN ( (lv_rows_3_0= ruleExamples_row ) )+ this_END_4= RULE_END ) )
            {
            // InternalGherkinParser.g:435:2: ( () otherlv_1= Examples (this_BEGIN_2= RULE_BEGIN ( (lv_rows_3_0= ruleExamples_row ) )+ this_END_4= RULE_END ) )
            // InternalGherkinParser.g:436:3: () otherlv_1= Examples (this_BEGIN_2= RULE_BEGIN ( (lv_rows_3_0= ruleExamples_row ) )+ this_END_4= RULE_END )
            {
            // InternalGherkinParser.g:436:3: ()
            // InternalGherkinParser.g:437:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExamplesAccess().getExamplesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Examples,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getExamplesAccess().getExamplesKeyword_1());
            		
            // InternalGherkinParser.g:447:3: (this_BEGIN_2= RULE_BEGIN ( (lv_rows_3_0= ruleExamples_row ) )+ this_END_4= RULE_END )
            // InternalGherkinParser.g:448:4: this_BEGIN_2= RULE_BEGIN ( (lv_rows_3_0= ruleExamples_row ) )+ this_END_4= RULE_END
            {
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_13); 

            				newLeafNode(this_BEGIN_2, grammarAccess.getExamplesAccess().getBEGINTerminalRuleCall_2_0());
            			
            // InternalGherkinParser.g:452:4: ( (lv_rows_3_0= ruleExamples_row ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==VerticalLine) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGherkinParser.g:453:5: (lv_rows_3_0= ruleExamples_row )
            	    {
            	    // InternalGherkinParser.g:453:5: (lv_rows_3_0= ruleExamples_row )
            	    // InternalGherkinParser.g:454:6: lv_rows_3_0= ruleExamples_row
            	    {

            	    						newCompositeNode(grammarAccess.getExamplesAccess().getRowsExamples_rowParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_rows_3_0=ruleExamples_row();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExamplesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rows",
            	    							lv_rows_3_0,
            	    							"mde.coursework.gherkin.Gherkin.Examples_row");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_4, grammarAccess.getExamplesAccess().getENDTerminalRuleCall_2_2());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExamples"


    // $ANTLR start "entryRuleExamples_row"
    // InternalGherkinParser.g:480:1: entryRuleExamples_row returns [String current=null] : iv_ruleExamples_row= ruleExamples_row EOF ;
    public final String entryRuleExamples_row() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExamples_row = null;


        try {
            // InternalGherkinParser.g:480:52: (iv_ruleExamples_row= ruleExamples_row EOF )
            // InternalGherkinParser.g:481:2: iv_ruleExamples_row= ruleExamples_row EOF
            {
             newCompositeNode(grammarAccess.getExamples_rowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExamples_row=ruleExamples_row();

            state._fsp--;

             current =iv_ruleExamples_row.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExamples_row"


    // $ANTLR start "ruleExamples_row"
    // InternalGherkinParser.g:487:1: ruleExamples_row returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= VerticalLine this_ID_1= RULE_ID )+ kw= VerticalLine ) ;
    public final AntlrDatatypeRuleToken ruleExamples_row() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGherkinParser.g:493:2: ( ( (kw= VerticalLine this_ID_1= RULE_ID )+ kw= VerticalLine ) )
            // InternalGherkinParser.g:494:2: ( (kw= VerticalLine this_ID_1= RULE_ID )+ kw= VerticalLine )
            {
            // InternalGherkinParser.g:494:2: ( (kw= VerticalLine this_ID_1= RULE_ID )+ kw= VerticalLine )
            // InternalGherkinParser.g:495:3: (kw= VerticalLine this_ID_1= RULE_ID )+ kw= VerticalLine
            {
            // InternalGherkinParser.g:495:3: (kw= VerticalLine this_ID_1= RULE_ID )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==VerticalLine) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==RULE_ID) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalGherkinParser.g:496:4: kw= VerticalLine this_ID_1= RULE_ID
            	    {
            	    kw=(Token)match(input,VerticalLine,FOLLOW_15); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getExamples_rowAccess().getVerticalLineKeyword_0_0());
            	    			
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_13); 

            	    				current.merge(this_ID_1);
            	    			

            	    				newLeafNode(this_ID_1, grammarAccess.getExamples_rowAccess().getIDTerminalRuleCall_0_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            kw=(Token)match(input,VerticalLine,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getExamples_rowAccess().getVerticalLineKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExamples_row"


    // $ANTLR start "entryRuleRule"
    // InternalGherkinParser.g:518:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalGherkinParser.g:518:45: (iv_ruleRule= ruleRule EOF )
            // InternalGherkinParser.g:519:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalGherkinParser.g:525:1: ruleRule returns [EObject current=null] : (otherlv_0= Rule this_Description_1= ruleDescription (this_BEGIN_2= RULE_BEGIN ( (lv_background_3_0= ruleBackground ) )? ( (lv_examples_4_0= ruleExample ) )+ this_END_5= RULE_END )? ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_2=null;
        Token this_END_5=null;
        EObject this_Description_1 = null;

        EObject lv_background_3_0 = null;

        EObject lv_examples_4_0 = null;



        	enterRule();

        try {
            // InternalGherkinParser.g:531:2: ( (otherlv_0= Rule this_Description_1= ruleDescription (this_BEGIN_2= RULE_BEGIN ( (lv_background_3_0= ruleBackground ) )? ( (lv_examples_4_0= ruleExample ) )+ this_END_5= RULE_END )? ) )
            // InternalGherkinParser.g:532:2: (otherlv_0= Rule this_Description_1= ruleDescription (this_BEGIN_2= RULE_BEGIN ( (lv_background_3_0= ruleBackground ) )? ( (lv_examples_4_0= ruleExample ) )+ this_END_5= RULE_END )? )
            {
            // InternalGherkinParser.g:532:2: (otherlv_0= Rule this_Description_1= ruleDescription (this_BEGIN_2= RULE_BEGIN ( (lv_background_3_0= ruleBackground ) )? ( (lv_examples_4_0= ruleExample ) )+ this_END_5= RULE_END )? )
            // InternalGherkinParser.g:533:3: otherlv_0= Rule this_Description_1= ruleDescription (this_BEGIN_2= RULE_BEGIN ( (lv_background_3_0= ruleBackground ) )? ( (lv_examples_4_0= ruleExample ) )+ this_END_5= RULE_END )?
            {
            otherlv_0=(Token)match(input,Rule,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		

            			newCompositeNode(grammarAccess.getRuleAccess().getDescriptionParserRuleCall_1());
            		
            pushFollow(FOLLOW_6);
            this_Description_1=ruleDescription();

            state._fsp--;


            			current = this_Description_1;
            			afterParserOrEnumRuleCall();
            		
            // InternalGherkinParser.g:545:3: (this_BEGIN_2= RULE_BEGIN ( (lv_background_3_0= ruleBackground ) )? ( (lv_examples_4_0= ruleExample ) )+ this_END_5= RULE_END )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_BEGIN) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGherkinParser.g:546:4: this_BEGIN_2= RULE_BEGIN ( (lv_background_3_0= ruleBackground ) )? ( (lv_examples_4_0= ruleExample ) )+ this_END_5= RULE_END
                    {
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_16); 

                    				newLeafNode(this_BEGIN_2, grammarAccess.getRuleAccess().getBEGINTerminalRuleCall_2_0());
                    			
                    // InternalGherkinParser.g:550:4: ( (lv_background_3_0= ruleBackground ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==Background) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalGherkinParser.g:551:5: (lv_background_3_0= ruleBackground )
                            {
                            // InternalGherkinParser.g:551:5: (lv_background_3_0= ruleBackground )
                            // InternalGherkinParser.g:552:6: lv_background_3_0= ruleBackground
                            {

                            						newCompositeNode(grammarAccess.getRuleAccess().getBackgroundBackgroundParserRuleCall_2_1_0());
                            					
                            pushFollow(FOLLOW_16);
                            lv_background_3_0=ruleBackground();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getRuleRule());
                            						}
                            						set(
                            							current,
                            							"background",
                            							lv_background_3_0,
                            							"mde.coursework.gherkin.Gherkin.Background");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalGherkinParser.g:569:4: ( (lv_examples_4_0= ruleExample ) )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==Example) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalGherkinParser.g:570:5: (lv_examples_4_0= ruleExample )
                    	    {
                    	    // InternalGherkinParser.g:570:5: (lv_examples_4_0= ruleExample )
                    	    // InternalGherkinParser.g:571:6: lv_examples_4_0= ruleExample
                    	    {

                    	    						newCompositeNode(grammarAccess.getRuleAccess().getExamplesExampleParserRuleCall_2_2_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_examples_4_0=ruleExample();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"examples",
                    	    							lv_examples_4_0,
                    	    							"mde.coursework.gherkin.Gherkin.Example");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_5, grammarAccess.getRuleAccess().getENDTerminalRuleCall_2_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleExample"
    // InternalGherkinParser.g:597:1: entryRuleExample returns [EObject current=null] : iv_ruleExample= ruleExample EOF ;
    public final EObject entryRuleExample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExample = null;


        try {
            // InternalGherkinParser.g:597:48: (iv_ruleExample= ruleExample EOF )
            // InternalGherkinParser.g:598:2: iv_ruleExample= ruleExample EOF
            {
             newCompositeNode(grammarAccess.getExampleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExample=ruleExample();

            state._fsp--;

             current =iv_ruleExample; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExample"


    // $ANTLR start "ruleExample"
    // InternalGherkinParser.g:604:1: ruleExample returns [EObject current=null] : (otherlv_0= Example this_Description_1= ruleDescription ( (lv_example_steps_2_0= ruleChain_Steps ) ) ) ;
    public final EObject ruleExample() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Description_1 = null;

        EObject lv_example_steps_2_0 = null;



        	enterRule();

        try {
            // InternalGherkinParser.g:610:2: ( (otherlv_0= Example this_Description_1= ruleDescription ( (lv_example_steps_2_0= ruleChain_Steps ) ) ) )
            // InternalGherkinParser.g:611:2: (otherlv_0= Example this_Description_1= ruleDescription ( (lv_example_steps_2_0= ruleChain_Steps ) ) )
            {
            // InternalGherkinParser.g:611:2: (otherlv_0= Example this_Description_1= ruleDescription ( (lv_example_steps_2_0= ruleChain_Steps ) ) )
            // InternalGherkinParser.g:612:3: otherlv_0= Example this_Description_1= ruleDescription ( (lv_example_steps_2_0= ruleChain_Steps ) )
            {
            otherlv_0=(Token)match(input,Example,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getExampleAccess().getExampleKeyword_0());
            		

            			newCompositeNode(grammarAccess.getExampleAccess().getDescriptionParserRuleCall_1());
            		
            pushFollow(FOLLOW_5);
            this_Description_1=ruleDescription();

            state._fsp--;


            			current = this_Description_1;
            			afterParserOrEnumRuleCall();
            		
            // InternalGherkinParser.g:624:3: ( (lv_example_steps_2_0= ruleChain_Steps ) )
            // InternalGherkinParser.g:625:4: (lv_example_steps_2_0= ruleChain_Steps )
            {
            // InternalGherkinParser.g:625:4: (lv_example_steps_2_0= ruleChain_Steps )
            // InternalGherkinParser.g:626:5: lv_example_steps_2_0= ruleChain_Steps
            {

            					newCompositeNode(grammarAccess.getExampleAccess().getExample_stepsChain_StepsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_example_steps_2_0=ruleChain_Steps();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExampleRule());
            					}
            					set(
            						current,
            						"example_steps",
            						lv_example_steps_2_0,
            						"mde.coursework.gherkin.Gherkin.Chain_Steps");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExample"


    // $ANTLR start "entryRuleChain_Steps"
    // InternalGherkinParser.g:647:1: entryRuleChain_Steps returns [EObject current=null] : iv_ruleChain_Steps= ruleChain_Steps EOF ;
    public final EObject entryRuleChain_Steps() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChain_Steps = null;


        try {
            // InternalGherkinParser.g:647:52: (iv_ruleChain_Steps= ruleChain_Steps EOF )
            // InternalGherkinParser.g:648:2: iv_ruleChain_Steps= ruleChain_Steps EOF
            {
             newCompositeNode(grammarAccess.getChain_StepsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChain_Steps=ruleChain_Steps();

            state._fsp--;

             current =iv_ruleChain_Steps; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChain_Steps"


    // $ANTLR start "ruleChain_Steps"
    // InternalGherkinParser.g:654:1: ruleChain_Steps returns [EObject current=null] : ( () (this_BEGIN_1= RULE_BEGIN ( (lv_chain_2_0= ruleSteps ) )* this_END_3= RULE_END ) ) ;
    public final EObject ruleChain_Steps() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_chain_2_0 = null;



        	enterRule();

        try {
            // InternalGherkinParser.g:660:2: ( ( () (this_BEGIN_1= RULE_BEGIN ( (lv_chain_2_0= ruleSteps ) )* this_END_3= RULE_END ) ) )
            // InternalGherkinParser.g:661:2: ( () (this_BEGIN_1= RULE_BEGIN ( (lv_chain_2_0= ruleSteps ) )* this_END_3= RULE_END ) )
            {
            // InternalGherkinParser.g:661:2: ( () (this_BEGIN_1= RULE_BEGIN ( (lv_chain_2_0= ruleSteps ) )* this_END_3= RULE_END ) )
            // InternalGherkinParser.g:662:3: () (this_BEGIN_1= RULE_BEGIN ( (lv_chain_2_0= ruleSteps ) )* this_END_3= RULE_END )
            {
            // InternalGherkinParser.g:662:3: ()
            // InternalGherkinParser.g:663:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getChain_StepsAccess().getChain_StepsAction_0(),
            					current);
            			

            }

            // InternalGherkinParser.g:669:3: (this_BEGIN_1= RULE_BEGIN ( (lv_chain_2_0= ruleSteps ) )* this_END_3= RULE_END )
            // InternalGherkinParser.g:670:4: this_BEGIN_1= RULE_BEGIN ( (lv_chain_2_0= ruleSteps ) )* this_END_3= RULE_END
            {
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_10); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getChain_StepsAccess().getBEGINTerminalRuleCall_1_0());
            			
            // InternalGherkinParser.g:674:4: ( (lv_chain_2_0= ruleSteps ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Given||(LA15_0>=Then && LA15_0<=But)||LA15_0==Asterisk) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGherkinParser.g:675:5: (lv_chain_2_0= ruleSteps )
            	    {
            	    // InternalGherkinParser.g:675:5: (lv_chain_2_0= ruleSteps )
            	    // InternalGherkinParser.g:676:6: lv_chain_2_0= ruleSteps
            	    {

            	    						newCompositeNode(grammarAccess.getChain_StepsAccess().getChainStepsParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_chain_2_0=ruleSteps();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getChain_StepsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"chain",
            	    							lv_chain_2_0,
            	    							"mde.coursework.gherkin.Gherkin.Steps");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            this_END_3=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_3, grammarAccess.getChain_StepsAccess().getENDTerminalRuleCall_1_2());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChain_Steps"


    // $ANTLR start "entryRuleSteps"
    // InternalGherkinParser.g:702:1: entryRuleSteps returns [EObject current=null] : iv_ruleSteps= ruleSteps EOF ;
    public final EObject entryRuleSteps() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSteps = null;


        try {
            // InternalGherkinParser.g:702:46: (iv_ruleSteps= ruleSteps EOF )
            // InternalGherkinParser.g:703:2: iv_ruleSteps= ruleSteps EOF
            {
             newCompositeNode(grammarAccess.getStepsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSteps=ruleSteps();

            state._fsp--;

             current =iv_ruleSteps; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSteps"


    // $ANTLR start "ruleSteps"
    // InternalGherkinParser.g:709:1: ruleSteps returns [EObject current=null] : ( ( (lv_given_step_0_0= ruleGiven_Statement ) ) | ( (lv_when_step_1_0= ruleWhen_Statement ) ) | ( (lv_but_step_2_0= ruleBut_Statement ) ) | ( (lv_then_step_3_0= ruleThen_Statement ) ) | ( (lv_and_step_4_0= ruleAnd_Statement ) ) | ( (lv_star_step_5_0= ruleStar_Statement ) ) ) ;
    public final EObject ruleSteps() throws RecognitionException {
        EObject current = null;

        EObject lv_given_step_0_0 = null;

        EObject lv_when_step_1_0 = null;

        EObject lv_but_step_2_0 = null;

        EObject lv_then_step_3_0 = null;

        EObject lv_and_step_4_0 = null;

        EObject lv_star_step_5_0 = null;



        	enterRule();

        try {
            // InternalGherkinParser.g:715:2: ( ( ( (lv_given_step_0_0= ruleGiven_Statement ) ) | ( (lv_when_step_1_0= ruleWhen_Statement ) ) | ( (lv_but_step_2_0= ruleBut_Statement ) ) | ( (lv_then_step_3_0= ruleThen_Statement ) ) | ( (lv_and_step_4_0= ruleAnd_Statement ) ) | ( (lv_star_step_5_0= ruleStar_Statement ) ) ) )
            // InternalGherkinParser.g:716:2: ( ( (lv_given_step_0_0= ruleGiven_Statement ) ) | ( (lv_when_step_1_0= ruleWhen_Statement ) ) | ( (lv_but_step_2_0= ruleBut_Statement ) ) | ( (lv_then_step_3_0= ruleThen_Statement ) ) | ( (lv_and_step_4_0= ruleAnd_Statement ) ) | ( (lv_star_step_5_0= ruleStar_Statement ) ) )
            {
            // InternalGherkinParser.g:716:2: ( ( (lv_given_step_0_0= ruleGiven_Statement ) ) | ( (lv_when_step_1_0= ruleWhen_Statement ) ) | ( (lv_but_step_2_0= ruleBut_Statement ) ) | ( (lv_then_step_3_0= ruleThen_Statement ) ) | ( (lv_and_step_4_0= ruleAnd_Statement ) ) | ( (lv_star_step_5_0= ruleStar_Statement ) ) )
            int alt16=6;
            switch ( input.LA(1) ) {
            case Given:
                {
                alt16=1;
                }
                break;
            case When:
                {
                alt16=2;
                }
                break;
            case But:
                {
                alt16=3;
                }
                break;
            case Then:
                {
                alt16=4;
                }
                break;
            case And:
                {
                alt16=5;
                }
                break;
            case Asterisk:
                {
                alt16=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalGherkinParser.g:717:3: ( (lv_given_step_0_0= ruleGiven_Statement ) )
                    {
                    // InternalGherkinParser.g:717:3: ( (lv_given_step_0_0= ruleGiven_Statement ) )
                    // InternalGherkinParser.g:718:4: (lv_given_step_0_0= ruleGiven_Statement )
                    {
                    // InternalGherkinParser.g:718:4: (lv_given_step_0_0= ruleGiven_Statement )
                    // InternalGherkinParser.g:719:5: lv_given_step_0_0= ruleGiven_Statement
                    {

                    					newCompositeNode(grammarAccess.getStepsAccess().getGiven_stepGiven_StatementParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_given_step_0_0=ruleGiven_Statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStepsRule());
                    					}
                    					set(
                    						current,
                    						"given_step",
                    						lv_given_step_0_0,
                    						"mde.coursework.gherkin.Gherkin.Given_Statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGherkinParser.g:737:3: ( (lv_when_step_1_0= ruleWhen_Statement ) )
                    {
                    // InternalGherkinParser.g:737:3: ( (lv_when_step_1_0= ruleWhen_Statement ) )
                    // InternalGherkinParser.g:738:4: (lv_when_step_1_0= ruleWhen_Statement )
                    {
                    // InternalGherkinParser.g:738:4: (lv_when_step_1_0= ruleWhen_Statement )
                    // InternalGherkinParser.g:739:5: lv_when_step_1_0= ruleWhen_Statement
                    {

                    					newCompositeNode(grammarAccess.getStepsAccess().getWhen_stepWhen_StatementParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_when_step_1_0=ruleWhen_Statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStepsRule());
                    					}
                    					set(
                    						current,
                    						"when_step",
                    						lv_when_step_1_0,
                    						"mde.coursework.gherkin.Gherkin.When_Statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGherkinParser.g:757:3: ( (lv_but_step_2_0= ruleBut_Statement ) )
                    {
                    // InternalGherkinParser.g:757:3: ( (lv_but_step_2_0= ruleBut_Statement ) )
                    // InternalGherkinParser.g:758:4: (lv_but_step_2_0= ruleBut_Statement )
                    {
                    // InternalGherkinParser.g:758:4: (lv_but_step_2_0= ruleBut_Statement )
                    // InternalGherkinParser.g:759:5: lv_but_step_2_0= ruleBut_Statement
                    {

                    					newCompositeNode(grammarAccess.getStepsAccess().getBut_stepBut_StatementParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_but_step_2_0=ruleBut_Statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStepsRule());
                    					}
                    					set(
                    						current,
                    						"but_step",
                    						lv_but_step_2_0,
                    						"mde.coursework.gherkin.Gherkin.But_Statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGherkinParser.g:777:3: ( (lv_then_step_3_0= ruleThen_Statement ) )
                    {
                    // InternalGherkinParser.g:777:3: ( (lv_then_step_3_0= ruleThen_Statement ) )
                    // InternalGherkinParser.g:778:4: (lv_then_step_3_0= ruleThen_Statement )
                    {
                    // InternalGherkinParser.g:778:4: (lv_then_step_3_0= ruleThen_Statement )
                    // InternalGherkinParser.g:779:5: lv_then_step_3_0= ruleThen_Statement
                    {

                    					newCompositeNode(grammarAccess.getStepsAccess().getThen_stepThen_StatementParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_then_step_3_0=ruleThen_Statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStepsRule());
                    					}
                    					set(
                    						current,
                    						"then_step",
                    						lv_then_step_3_0,
                    						"mde.coursework.gherkin.Gherkin.Then_Statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalGherkinParser.g:797:3: ( (lv_and_step_4_0= ruleAnd_Statement ) )
                    {
                    // InternalGherkinParser.g:797:3: ( (lv_and_step_4_0= ruleAnd_Statement ) )
                    // InternalGherkinParser.g:798:4: (lv_and_step_4_0= ruleAnd_Statement )
                    {
                    // InternalGherkinParser.g:798:4: (lv_and_step_4_0= ruleAnd_Statement )
                    // InternalGherkinParser.g:799:5: lv_and_step_4_0= ruleAnd_Statement
                    {

                    					newCompositeNode(grammarAccess.getStepsAccess().getAnd_stepAnd_StatementParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_and_step_4_0=ruleAnd_Statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStepsRule());
                    					}
                    					set(
                    						current,
                    						"and_step",
                    						lv_and_step_4_0,
                    						"mde.coursework.gherkin.Gherkin.And_Statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalGherkinParser.g:817:3: ( (lv_star_step_5_0= ruleStar_Statement ) )
                    {
                    // InternalGherkinParser.g:817:3: ( (lv_star_step_5_0= ruleStar_Statement ) )
                    // InternalGherkinParser.g:818:4: (lv_star_step_5_0= ruleStar_Statement )
                    {
                    // InternalGherkinParser.g:818:4: (lv_star_step_5_0= ruleStar_Statement )
                    // InternalGherkinParser.g:819:5: lv_star_step_5_0= ruleStar_Statement
                    {

                    					newCompositeNode(grammarAccess.getStepsAccess().getStar_stepStar_StatementParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_star_step_5_0=ruleStar_Statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStepsRule());
                    					}
                    					set(
                    						current,
                    						"star_step",
                    						lv_star_step_5_0,
                    						"mde.coursework.gherkin.Gherkin.Star_Statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSteps"


    // $ANTLR start "entryRuleGiven_Statement"
    // InternalGherkinParser.g:840:1: entryRuleGiven_Statement returns [EObject current=null] : iv_ruleGiven_Statement= ruleGiven_Statement EOF ;
    public final EObject entryRuleGiven_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGiven_Statement = null;


        try {
            // InternalGherkinParser.g:840:56: (iv_ruleGiven_Statement= ruleGiven_Statement EOF )
            // InternalGherkinParser.g:841:2: iv_ruleGiven_Statement= ruleGiven_Statement EOF
            {
             newCompositeNode(grammarAccess.getGiven_StatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGiven_Statement=ruleGiven_Statement();

            state._fsp--;

             current =iv_ruleGiven_Statement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGiven_Statement"


    // $ANTLR start "ruleGiven_Statement"
    // InternalGherkinParser.g:847:1: ruleGiven_Statement returns [EObject current=null] : (otherlv_0= Given ( (lv_desc_1_0= ruleDescription ) ) ) ;
    public final EObject ruleGiven_Statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_desc_1_0 = null;



        	enterRule();

        try {
            // InternalGherkinParser.g:853:2: ( (otherlv_0= Given ( (lv_desc_1_0= ruleDescription ) ) ) )
            // InternalGherkinParser.g:854:2: (otherlv_0= Given ( (lv_desc_1_0= ruleDescription ) ) )
            {
            // InternalGherkinParser.g:854:2: (otherlv_0= Given ( (lv_desc_1_0= ruleDescription ) ) )
            // InternalGherkinParser.g:855:3: otherlv_0= Given ( (lv_desc_1_0= ruleDescription ) )
            {
            otherlv_0=(Token)match(input,Given,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getGiven_StatementAccess().getGivenKeyword_0());
            		
            // InternalGherkinParser.g:859:3: ( (lv_desc_1_0= ruleDescription ) )
            // InternalGherkinParser.g:860:4: (lv_desc_1_0= ruleDescription )
            {
            // InternalGherkinParser.g:860:4: (lv_desc_1_0= ruleDescription )
            // InternalGherkinParser.g:861:5: lv_desc_1_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getGiven_StatementAccess().getDescDescriptionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_desc_1_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGiven_StatementRule());
            					}
            					set(
            						current,
            						"desc",
            						lv_desc_1_0,
            						"mde.coursework.gherkin.Gherkin.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGiven_Statement"


    // $ANTLR start "entryRuleWhen_Statement"
    // InternalGherkinParser.g:882:1: entryRuleWhen_Statement returns [EObject current=null] : iv_ruleWhen_Statement= ruleWhen_Statement EOF ;
    public final EObject entryRuleWhen_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhen_Statement = null;


        try {
            // InternalGherkinParser.g:882:55: (iv_ruleWhen_Statement= ruleWhen_Statement EOF )
            // InternalGherkinParser.g:883:2: iv_ruleWhen_Statement= ruleWhen_Statement EOF
            {
             newCompositeNode(grammarAccess.getWhen_StatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhen_Statement=ruleWhen_Statement();

            state._fsp--;

             current =iv_ruleWhen_Statement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhen_Statement"


    // $ANTLR start "ruleWhen_Statement"
    // InternalGherkinParser.g:889:1: ruleWhen_Statement returns [EObject current=null] : (otherlv_0= When ( (lv_desc_1_0= ruleDescription ) ) ) ;
    public final EObject ruleWhen_Statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_desc_1_0 = null;



        	enterRule();

        try {
            // InternalGherkinParser.g:895:2: ( (otherlv_0= When ( (lv_desc_1_0= ruleDescription ) ) ) )
            // InternalGherkinParser.g:896:2: (otherlv_0= When ( (lv_desc_1_0= ruleDescription ) ) )
            {
            // InternalGherkinParser.g:896:2: (otherlv_0= When ( (lv_desc_1_0= ruleDescription ) ) )
            // InternalGherkinParser.g:897:3: otherlv_0= When ( (lv_desc_1_0= ruleDescription ) )
            {
            otherlv_0=(Token)match(input,When,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getWhen_StatementAccess().getWhenKeyword_0());
            		
            // InternalGherkinParser.g:901:3: ( (lv_desc_1_0= ruleDescription ) )
            // InternalGherkinParser.g:902:4: (lv_desc_1_0= ruleDescription )
            {
            // InternalGherkinParser.g:902:4: (lv_desc_1_0= ruleDescription )
            // InternalGherkinParser.g:903:5: lv_desc_1_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getWhen_StatementAccess().getDescDescriptionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_desc_1_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhen_StatementRule());
            					}
            					set(
            						current,
            						"desc",
            						lv_desc_1_0,
            						"mde.coursework.gherkin.Gherkin.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhen_Statement"


    // $ANTLR start "entryRuleThen_Statement"
    // InternalGherkinParser.g:924:1: entryRuleThen_Statement returns [EObject current=null] : iv_ruleThen_Statement= ruleThen_Statement EOF ;
    public final EObject entryRuleThen_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThen_Statement = null;


        try {
            // InternalGherkinParser.g:924:55: (iv_ruleThen_Statement= ruleThen_Statement EOF )
            // InternalGherkinParser.g:925:2: iv_ruleThen_Statement= ruleThen_Statement EOF
            {
             newCompositeNode(grammarAccess.getThen_StatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThen_Statement=ruleThen_Statement();

            state._fsp--;

             current =iv_ruleThen_Statement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleThen_Statement"


    // $ANTLR start "ruleThen_Statement"
    // InternalGherkinParser.g:931:1: ruleThen_Statement returns [EObject current=null] : (otherlv_0= Then ( (lv_desc_1_0= ruleDescription ) ) ) ;
    public final EObject ruleThen_Statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_desc_1_0 = null;



        	enterRule();

        try {
            // InternalGherkinParser.g:937:2: ( (otherlv_0= Then ( (lv_desc_1_0= ruleDescription ) ) ) )
            // InternalGherkinParser.g:938:2: (otherlv_0= Then ( (lv_desc_1_0= ruleDescription ) ) )
            {
            // InternalGherkinParser.g:938:2: (otherlv_0= Then ( (lv_desc_1_0= ruleDescription ) ) )
            // InternalGherkinParser.g:939:3: otherlv_0= Then ( (lv_desc_1_0= ruleDescription ) )
            {
            otherlv_0=(Token)match(input,Then,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getThen_StatementAccess().getThenKeyword_0());
            		
            // InternalGherkinParser.g:943:3: ( (lv_desc_1_0= ruleDescription ) )
            // InternalGherkinParser.g:944:4: (lv_desc_1_0= ruleDescription )
            {
            // InternalGherkinParser.g:944:4: (lv_desc_1_0= ruleDescription )
            // InternalGherkinParser.g:945:5: lv_desc_1_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getThen_StatementAccess().getDescDescriptionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_desc_1_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThen_StatementRule());
            					}
            					set(
            						current,
            						"desc",
            						lv_desc_1_0,
            						"mde.coursework.gherkin.Gherkin.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleThen_Statement"


    // $ANTLR start "entryRuleBut_Statement"
    // InternalGherkinParser.g:966:1: entryRuleBut_Statement returns [EObject current=null] : iv_ruleBut_Statement= ruleBut_Statement EOF ;
    public final EObject entryRuleBut_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBut_Statement = null;


        try {
            // InternalGherkinParser.g:966:54: (iv_ruleBut_Statement= ruleBut_Statement EOF )
            // InternalGherkinParser.g:967:2: iv_ruleBut_Statement= ruleBut_Statement EOF
            {
             newCompositeNode(grammarAccess.getBut_StatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBut_Statement=ruleBut_Statement();

            state._fsp--;

             current =iv_ruleBut_Statement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBut_Statement"


    // $ANTLR start "ruleBut_Statement"
    // InternalGherkinParser.g:973:1: ruleBut_Statement returns [EObject current=null] : (otherlv_0= But ( (lv_desc_1_0= ruleDescription ) ) ) ;
    public final EObject ruleBut_Statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_desc_1_0 = null;



        	enterRule();

        try {
            // InternalGherkinParser.g:979:2: ( (otherlv_0= But ( (lv_desc_1_0= ruleDescription ) ) ) )
            // InternalGherkinParser.g:980:2: (otherlv_0= But ( (lv_desc_1_0= ruleDescription ) ) )
            {
            // InternalGherkinParser.g:980:2: (otherlv_0= But ( (lv_desc_1_0= ruleDescription ) ) )
            // InternalGherkinParser.g:981:3: otherlv_0= But ( (lv_desc_1_0= ruleDescription ) )
            {
            otherlv_0=(Token)match(input,But,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getBut_StatementAccess().getButKeyword_0());
            		
            // InternalGherkinParser.g:985:3: ( (lv_desc_1_0= ruleDescription ) )
            // InternalGherkinParser.g:986:4: (lv_desc_1_0= ruleDescription )
            {
            // InternalGherkinParser.g:986:4: (lv_desc_1_0= ruleDescription )
            // InternalGherkinParser.g:987:5: lv_desc_1_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getBut_StatementAccess().getDescDescriptionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_desc_1_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBut_StatementRule());
            					}
            					set(
            						current,
            						"desc",
            						lv_desc_1_0,
            						"mde.coursework.gherkin.Gherkin.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBut_Statement"


    // $ANTLR start "entryRuleAnd_Statement"
    // InternalGherkinParser.g:1008:1: entryRuleAnd_Statement returns [EObject current=null] : iv_ruleAnd_Statement= ruleAnd_Statement EOF ;
    public final EObject entryRuleAnd_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd_Statement = null;


        try {
            // InternalGherkinParser.g:1008:54: (iv_ruleAnd_Statement= ruleAnd_Statement EOF )
            // InternalGherkinParser.g:1009:2: iv_ruleAnd_Statement= ruleAnd_Statement EOF
            {
             newCompositeNode(grammarAccess.getAnd_StatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd_Statement=ruleAnd_Statement();

            state._fsp--;

             current =iv_ruleAnd_Statement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd_Statement"


    // $ANTLR start "ruleAnd_Statement"
    // InternalGherkinParser.g:1015:1: ruleAnd_Statement returns [EObject current=null] : (otherlv_0= And ( (lv_desc_1_0= ruleDescription ) ) ) ;
    public final EObject ruleAnd_Statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_desc_1_0 = null;



        	enterRule();

        try {
            // InternalGherkinParser.g:1021:2: ( (otherlv_0= And ( (lv_desc_1_0= ruleDescription ) ) ) )
            // InternalGherkinParser.g:1022:2: (otherlv_0= And ( (lv_desc_1_0= ruleDescription ) ) )
            {
            // InternalGherkinParser.g:1022:2: (otherlv_0= And ( (lv_desc_1_0= ruleDescription ) ) )
            // InternalGherkinParser.g:1023:3: otherlv_0= And ( (lv_desc_1_0= ruleDescription ) )
            {
            otherlv_0=(Token)match(input,And,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getAnd_StatementAccess().getAndKeyword_0());
            		
            // InternalGherkinParser.g:1027:3: ( (lv_desc_1_0= ruleDescription ) )
            // InternalGherkinParser.g:1028:4: (lv_desc_1_0= ruleDescription )
            {
            // InternalGherkinParser.g:1028:4: (lv_desc_1_0= ruleDescription )
            // InternalGherkinParser.g:1029:5: lv_desc_1_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getAnd_StatementAccess().getDescDescriptionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_desc_1_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnd_StatementRule());
            					}
            					set(
            						current,
            						"desc",
            						lv_desc_1_0,
            						"mde.coursework.gherkin.Gherkin.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd_Statement"


    // $ANTLR start "entryRuleStar_Statement"
    // InternalGherkinParser.g:1050:1: entryRuleStar_Statement returns [EObject current=null] : iv_ruleStar_Statement= ruleStar_Statement EOF ;
    public final EObject entryRuleStar_Statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStar_Statement = null;


        try {
            // InternalGherkinParser.g:1050:55: (iv_ruleStar_Statement= ruleStar_Statement EOF )
            // InternalGherkinParser.g:1051:2: iv_ruleStar_Statement= ruleStar_Statement EOF
            {
             newCompositeNode(grammarAccess.getStar_StatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStar_Statement=ruleStar_Statement();

            state._fsp--;

             current =iv_ruleStar_Statement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStar_Statement"


    // $ANTLR start "ruleStar_Statement"
    // InternalGherkinParser.g:1057:1: ruleStar_Statement returns [EObject current=null] : (otherlv_0= Asterisk ( (lv_desc_1_0= ruleDescription ) ) ) ;
    public final EObject ruleStar_Statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_desc_1_0 = null;



        	enterRule();

        try {
            // InternalGherkinParser.g:1063:2: ( (otherlv_0= Asterisk ( (lv_desc_1_0= ruleDescription ) ) ) )
            // InternalGherkinParser.g:1064:2: (otherlv_0= Asterisk ( (lv_desc_1_0= ruleDescription ) ) )
            {
            // InternalGherkinParser.g:1064:2: (otherlv_0= Asterisk ( (lv_desc_1_0= ruleDescription ) ) )
            // InternalGherkinParser.g:1065:3: otherlv_0= Asterisk ( (lv_desc_1_0= ruleDescription ) )
            {
            otherlv_0=(Token)match(input,Asterisk,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getStar_StatementAccess().getAsteriskKeyword_0());
            		
            // InternalGherkinParser.g:1069:3: ( (lv_desc_1_0= ruleDescription ) )
            // InternalGherkinParser.g:1070:4: (lv_desc_1_0= ruleDescription )
            {
            // InternalGherkinParser.g:1070:4: (lv_desc_1_0= ruleDescription )
            // InternalGherkinParser.g:1071:5: lv_desc_1_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getStar_StatementAccess().getDescDescriptionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_desc_1_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStar_StatementRule());
            					}
            					set(
            						current,
            						"desc",
            						lv_desc_1_0,
            						"mde.coursework.gherkin.Gherkin.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStar_Statement"


    // $ANTLR start "entryRuleDescription"
    // InternalGherkinParser.g:1092:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalGherkinParser.g:1092:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalGherkinParser.g:1093:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalGherkinParser.g:1099:1: ruleDescription returns [EObject current=null] : ( () ( (lv_desc_1_0= ruleSentence ) )* ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_desc_1_0 = null;



        	enterRule();

        try {
            // InternalGherkinParser.g:1105:2: ( ( () ( (lv_desc_1_0= ruleSentence ) )* ) )
            // InternalGherkinParser.g:1106:2: ( () ( (lv_desc_1_0= ruleSentence ) )* )
            {
            // InternalGherkinParser.g:1106:2: ( () ( (lv_desc_1_0= ruleSentence ) )* )
            // InternalGherkinParser.g:1107:3: () ( (lv_desc_1_0= ruleSentence ) )*
            {
            // InternalGherkinParser.g:1107:3: ()
            // InternalGherkinParser.g:1108:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDescriptionAccess().getDescriptionAction_0(),
            					current);
            			

            }

            // InternalGherkinParser.g:1114:3: ( (lv_desc_1_0= ruleSentence ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Backspace||LA17_0==RULE_ID||LA17_0==RULE_STRING) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGherkinParser.g:1115:4: (lv_desc_1_0= ruleSentence )
            	    {
            	    // InternalGherkinParser.g:1115:4: (lv_desc_1_0= ruleSentence )
            	    // InternalGherkinParser.g:1116:5: lv_desc_1_0= ruleSentence
            	    {

            	    					newCompositeNode(grammarAccess.getDescriptionAccess().getDescSentenceParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_desc_1_0=ruleSentence();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDescriptionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"desc",
            	    						lv_desc_1_0,
            	    						"mde.coursework.gherkin.Gherkin.Sentence");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleSentence"
    // InternalGherkinParser.g:1137:1: entryRuleSentence returns [String current=null] : iv_ruleSentence= ruleSentence EOF ;
    public final String entryRuleSentence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSentence = null;


        try {
            // InternalGherkinParser.g:1137:48: (iv_ruleSentence= ruleSentence EOF )
            // InternalGherkinParser.g:1138:2: iv_ruleSentence= ruleSentence EOF
            {
             newCompositeNode(grammarAccess.getSentenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSentence=ruleSentence();

            state._fsp--;

             current =iv_ruleSentence.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSentence"


    // $ANTLR start "ruleSentence"
    // InternalGherkinParser.g:1144:1: ruleSentence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= Backspace | this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleSentence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            // InternalGherkinParser.g:1150:2: ( (this_ID_0= RULE_ID | kw= Backspace | this_STRING_2= RULE_STRING ) )
            // InternalGherkinParser.g:1151:2: (this_ID_0= RULE_ID | kw= Backspace | this_STRING_2= RULE_STRING )
            {
            // InternalGherkinParser.g:1151:2: (this_ID_0= RULE_ID | kw= Backspace | this_STRING_2= RULE_STRING )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt18=1;
                }
                break;
            case Backspace:
                {
                alt18=2;
                }
                break;
            case RULE_STRING:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalGherkinParser.g:1152:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getSentenceAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGherkinParser.g:1160:3: kw= Backspace
                    {
                    kw=(Token)match(input,Backspace,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSentenceAccess().getBackspaceKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalGherkinParser.g:1166:3: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_2);
                    		

                    			newLeafNode(this_STRING_2, grammarAccess.getSentenceAccess().getSTRINGTerminalRuleCall_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSentence"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000A90000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000000B0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001000B0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000012F400L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000002F440L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100120L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000A10000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000A10002L});

}