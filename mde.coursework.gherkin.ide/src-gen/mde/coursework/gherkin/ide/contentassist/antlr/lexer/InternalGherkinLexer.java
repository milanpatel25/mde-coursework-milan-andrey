package mde.coursework.gherkin.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGherkinLexer extends Lexer {
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

    public InternalGherkinLexer() {;} 
    public InternalGherkinLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGherkinLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalGherkinLexer.g"; }

    // $ANTLR start "ScenarioOutline"
    public final void mScenarioOutline() throws RecognitionException {
        try {
            int _type = ScenarioOutline;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGherkinLexer.g:14:17: ( 'Scenario Outline:' )
            // InternalGherkinLexer.g:14:19: 'Scenario Outline:'
            {
            match("Scenario Outline:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ScenarioOutline"

    // $ANTLR start "Background"
    public final void mBackground() throws RecognitionException {
        try {
            int _type = Background;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGherkinLexer.g:16:12: ( 'Background:' )
            // InternalGherkinLexer.g:16:14: 'Background:'
            {
            match("Background:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Background"

    // $ANTLR start "Examples"
    public final void mExamples() throws RecognitionException {
        try {
            int _type = Examples;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGherkinLexer.g:18:10: ( 'Examples:' )
            // InternalGherkinLexer.g:18:12: 'Examples:'
            {
            match("Examples:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Examples"

    // $ANTLR start "Scenario"
    public final void mScenario() throws RecognitionException {
        try {
            int _type = Scenario;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGherkinLexer.g:20:10: ( 'Scenario:' )
            // InternalGherkinLexer.g:20:12: 'Scenario:'
            {
            match("Scenario:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Scenario"

    // $ANTLR start "Example"
    public final void mExample() throws RecognitionException {
        try {
            int _type = Example;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGherkinLexer.g:22:9: ( 'Example:' )
            // InternalGherkinLexer.g:22:11: 'Example:'
            {
            match("Example:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Example"

    // $ANTLR start "Feature"
    public final void mFeature() throws RecognitionException {
        try {
            int _type = Feature;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGherkinLexer.g:24:9: ( 'Feature:' )
            // InternalGherkinLexer.g:24:11: 'Feature:'
            {
            match("Feature:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Feature"

    // $ANTLR start "Given"
    public final void mGiven() throws RecognitionException {
        try {
            int _type = Given;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGherkinLexer.g:26:7: ( 'Given' )
            // InternalGherkinLexer.g:26:9: 'Given'
            {
            match("Given"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Given"

    // $ANTLR start "Rule"
    public final void mRule() throws RecognitionException {
        try {
            int _type = Rule;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGherkinLexer.g:28:6: ( 'Rule:' )
            // InternalGherkinLexer.g:28:8: 'Rule:'
            {
            match("Rule:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Rule"

    // $ANTLR start "Then"
    public final void mThen() throws RecognitionException {
        try {
            int _type = Then;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGherkinLexer.g:30:6: ( 'Then' )
            // InternalGherkinLexer.g:30:8: 'Then'
            {
            match("Then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Then"

    // $ANTLR start "When"
    public final void mWhen() throws RecognitionException {
        try {
            int _type = When;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGherkinLexer.g:32:6: ( 'When' )
            // InternalGherkinLexer.g:32:8: 'When'
            {
            match("When"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "When"

    // $ANTLR start "And"
    public final void mAnd() throws RecognitionException {
        try {
            int _type = And;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGherkinLexer.g:34:5: ( 'And' )
            // InternalGherkinLexer.g:34:7: 'And'
            {
            match("And"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "And"

    // $ANTLR start "But"
    public final void mBut() throws RecognitionException {
        try {
            int _type = But;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGherkinLexer.g:36:5: ( 'But' )
            // InternalGherkinLexer.g:36:7: 'But'
            {
            match("But"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "But"

    // $ANTLR start "Backspace"
    public final void mBackspace() throws RecognitionException {
        try {
            int _type = Backspace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGherkinLexer.g:38:11: ( '\\b' )
            // InternalGherkinLexer.g:38:13: '\\b'
            {
            match('\b'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Backspace"

    // $ANTLR start "Asterisk"
    public final void mAsterisk() throws RecognitionException {
        try {
            int _type = Asterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGherkinLexer.g:40:10: ( '*' )
            // InternalGherkinLexer.g:40:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Asterisk"

    // $ANTLR start "VerticalLine"
    public final void mVerticalLine() throws RecognitionException {
        try {
            int _type = VerticalLine;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGherkinLexer.g:42:14: ( '|' )
            // InternalGherkinLexer.g:42:16: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VerticalLine"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalGherkinLexer.g:44:21: ()
            // InternalGherkinLexer.g:44:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            // InternalGherkinLexer.g:46:19: ()
            // InternalGherkinLexer.g:46:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGherkinLexer.g:48:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGherkinLexer.g:48:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGherkinLexer.g:48:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGherkinLexer.g:48:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGherkinLexer.g:48:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGherkinLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGherkinLexer.g:50:10: ( ( '0' .. '9' )+ )
            // InternalGherkinLexer.g:50:12: ( '0' .. '9' )+
            {
            // InternalGherkinLexer.g:50:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGherkinLexer.g:50:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGherkinLexer.g:52:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGherkinLexer.g:52:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGherkinLexer.g:52:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGherkinLexer.g:52:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGherkinLexer.g:52:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalGherkinLexer.g:52:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGherkinLexer.g:52:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGherkinLexer.g:52:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGherkinLexer.g:52:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalGherkinLexer.g:52:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGherkinLexer.g:52:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGherkinLexer.g:54:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGherkinLexer.g:54:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGherkinLexer.g:54:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGherkinLexer.g:54:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGherkinLexer.g:56:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGherkinLexer.g:56:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGherkinLexer.g:56:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGherkinLexer.g:56:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalGherkinLexer.g:56:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGherkinLexer.g:56:41: ( '\\r' )? '\\n'
                    {
                    // InternalGherkinLexer.g:56:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalGherkinLexer.g:56:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGherkinLexer.g:58:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGherkinLexer.g:58:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGherkinLexer.g:58:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGherkinLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGherkinLexer.g:60:16: ( . )
            // InternalGherkinLexer.g:60:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalGherkinLexer.g:1:8: ( ScenarioOutline | Background | Examples | Scenario | Example | Feature | Given | Rule | Then | When | And | But | Backspace | Asterisk | VerticalLine | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=22;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalGherkinLexer.g:1:10: ScenarioOutline
                {
                mScenarioOutline(); 

                }
                break;
            case 2 :
                // InternalGherkinLexer.g:1:26: Background
                {
                mBackground(); 

                }
                break;
            case 3 :
                // InternalGherkinLexer.g:1:37: Examples
                {
                mExamples(); 

                }
                break;
            case 4 :
                // InternalGherkinLexer.g:1:46: Scenario
                {
                mScenario(); 

                }
                break;
            case 5 :
                // InternalGherkinLexer.g:1:55: Example
                {
                mExample(); 

                }
                break;
            case 6 :
                // InternalGherkinLexer.g:1:63: Feature
                {
                mFeature(); 

                }
                break;
            case 7 :
                // InternalGherkinLexer.g:1:71: Given
                {
                mGiven(); 

                }
                break;
            case 8 :
                // InternalGherkinLexer.g:1:77: Rule
                {
                mRule(); 

                }
                break;
            case 9 :
                // InternalGherkinLexer.g:1:82: Then
                {
                mThen(); 

                }
                break;
            case 10 :
                // InternalGherkinLexer.g:1:87: When
                {
                mWhen(); 

                }
                break;
            case 11 :
                // InternalGherkinLexer.g:1:92: And
                {
                mAnd(); 

                }
                break;
            case 12 :
                // InternalGherkinLexer.g:1:96: But
                {
                mBut(); 

                }
                break;
            case 13 :
                // InternalGherkinLexer.g:1:100: Backspace
                {
                mBackspace(); 

                }
                break;
            case 14 :
                // InternalGherkinLexer.g:1:110: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 15 :
                // InternalGherkinLexer.g:1:119: VerticalLine
                {
                mVerticalLine(); 

                }
                break;
            case 16 :
                // InternalGherkinLexer.g:1:132: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 17 :
                // InternalGherkinLexer.g:1:140: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 18 :
                // InternalGherkinLexer.g:1:149: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 19 :
                // InternalGherkinLexer.g:1:161: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 20 :
                // InternalGherkinLexer.g:1:177: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 21 :
                // InternalGherkinLexer.g:1:193: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 22 :
                // InternalGherkinLexer.g:1:201: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\11\26\3\uffff\1\24\2\uffff\3\24\2\uffff\1\26\1\uffff\11\26\10\uffff\2\26\1\64\6\26\1\73\2\26\1\uffff\4\26\1\102\1\103\1\uffff\4\26\1\110\3\uffff\4\26\1\uffff\7\26\4\uffff\1\26\1\uffff\1\26\1\uffff";
    static final String DFA12_eofS =
        "\130\uffff";
    static final String DFA12_minS =
        "\1\0\1\143\1\141\1\170\1\145\1\151\1\165\2\150\1\156\3\uffff\1\101\2\uffff\2\0\1\52\2\uffff\1\145\1\uffff\1\143\1\164\2\141\1\166\1\154\2\145\1\144\10\uffff\1\156\1\153\1\60\1\155\1\164\2\145\2\156\1\60\1\141\1\147\1\uffff\1\160\1\165\1\156\1\72\2\60\1\uffff\2\162\1\154\1\162\1\60\3\uffff\1\151\1\157\2\145\1\uffff\1\157\1\165\2\72\1\40\1\156\1\72\4\uffff\1\144\1\uffff\1\72\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\143\1\165\1\170\1\145\1\151\1\165\2\150\1\156\3\uffff\1\172\2\uffff\2\uffff\1\57\2\uffff\1\145\1\uffff\1\143\1\164\2\141\1\166\1\154\2\145\1\144\10\uffff\1\156\1\153\1\172\1\155\1\164\2\145\2\156\1\172\1\141\1\147\1\uffff\1\160\1\165\1\156\1\72\2\172\1\uffff\2\162\1\154\1\162\1\172\3\uffff\1\151\1\157\2\145\1\uffff\1\157\1\165\1\163\2\72\1\156\1\72\4\uffff\1\144\1\uffff\1\72\1\uffff";
    static final String DFA12_acceptS =
        "\12\uffff\1\15\1\16\1\17\1\uffff\1\20\1\21\3\uffff\1\25\1\26\1\uffff\1\20\11\uffff\1\15\1\16\1\17\1\21\1\22\1\23\1\24\1\25\14\uffff\1\14\6\uffff\1\13\5\uffff\1\10\1\11\1\12\4\uffff\1\7\7\uffff\1\5\1\6\1\1\1\4\1\uffff\1\3\1\uffff\1\2";
    static final String DFA12_specialS =
        "\1\0\17\uffff\1\2\1\1\106\uffff}>";
    static final String[] DFA12_transitionS = {
            "\10\24\1\12\2\23\2\24\1\23\22\24\1\23\1\24\1\20\4\24\1\21\2\24\1\13\4\24\1\22\12\17\7\24\1\11\1\2\2\16\1\3\1\4\1\5\12\16\1\6\1\1\1\7\2\16\1\10\3\16\3\24\1\15\1\16\1\24\32\16\1\24\1\14\uff83\24",
            "\1\25",
            "\1\27\23\uffff\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "",
            "",
            "",
            "\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "\0\44",
            "\0\44",
            "\1\45\4\uffff\1\46",
            "",
            "",
            "\1\50",
            "",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\62",
            "\1\63",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\74",
            "\1\75",
            "",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "",
            "\1\115",
            "\1\116",
            "\1\120\70\uffff\1\117",
            "\1\121",
            "\1\122\31\uffff\1\123",
            "\1\124",
            "\1\125",
            "",
            "",
            "",
            "",
            "\1\126",
            "",
            "\1\127",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ScenarioOutline | Background | Examples | Scenario | Example | Feature | Given | Rule | Then | When | And | But | Backspace | Asterisk | VerticalLine | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='S') ) {s = 1;}

                        else if ( (LA12_0=='B') ) {s = 2;}

                        else if ( (LA12_0=='E') ) {s = 3;}

                        else if ( (LA12_0=='F') ) {s = 4;}

                        else if ( (LA12_0=='G') ) {s = 5;}

                        else if ( (LA12_0=='R') ) {s = 6;}

                        else if ( (LA12_0=='T') ) {s = 7;}

                        else if ( (LA12_0=='W') ) {s = 8;}

                        else if ( (LA12_0=='A') ) {s = 9;}

                        else if ( (LA12_0=='\b') ) {s = 10;}

                        else if ( (LA12_0=='*') ) {s = 11;}

                        else if ( (LA12_0=='|') ) {s = 12;}

                        else if ( (LA12_0=='^') ) {s = 13;}

                        else if ( ((LA12_0>='C' && LA12_0<='D')||(LA12_0>='H' && LA12_0<='Q')||(LA12_0>='U' && LA12_0<='V')||(LA12_0>='X' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {s = 14;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 15;}

                        else if ( (LA12_0=='\"') ) {s = 16;}

                        else if ( (LA12_0=='\'') ) {s = 17;}

                        else if ( (LA12_0=='/') ) {s = 18;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 19;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\u0007')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='.')||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='{'||(LA12_0>='}' && LA12_0<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_17 = input.LA(1);

                        s = -1;
                        if ( ((LA12_17>='\u0000' && LA12_17<='\uFFFF')) ) {s = 36;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_16 = input.LA(1);

                        s = -1;
                        if ( ((LA12_16>='\u0000' && LA12_16<='\uFFFF')) ) {s = 36;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}