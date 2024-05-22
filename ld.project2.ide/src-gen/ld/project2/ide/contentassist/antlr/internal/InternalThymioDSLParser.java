package ld.project2.ide.contentassist.antlr.internal;

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
import ld.project2.services.ThymioDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalThymioDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'off'", "'tap'", "'sound'", "'short'", "'long'", "'up'", "'down'", "'left'", "'right'", "'center'", "'very_close'", "'close'", "'far'", "'black'", "'white'", "'any'", "'+'", "'-'", "'*'", "'/'", "'Procedure:'", "'Event:'", "'Actions:'", "'button_is_clicked:'", "'robot_detects_stimulus:'", "'proximity_sensor_is_activated:'", "'bottom_sensor_detects_color:'", "'front_left:'", "'front_center_left:'", "'front_center:'", "'front_center_right:'", "'front_right:'", "'back_left:'", "'back_right:'", "'left:'", "'right:'", "'move:'", "'lights:'", "'sound:'", "'left_motor:'", "'right_motor:'", "'top_light:'", "'on'", "'bottom_light:'", "'('", "','", "')'", "'note:'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalThymioDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalThymioDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalThymioDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalThymioDSL.g"; }


    	private ThymioDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(ThymioDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalThymioDSL.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalThymioDSL.g:54:1: ( ruleModel EOF )
            // InternalThymioDSL.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalThymioDSL.g:62:1: ruleModel : ( ( ( rule__Model__ProceduresAssignment ) ) ( ( rule__Model__ProceduresAssignment )* ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:66:2: ( ( ( ( rule__Model__ProceduresAssignment ) ) ( ( rule__Model__ProceduresAssignment )* ) ) )
            // InternalThymioDSL.g:67:2: ( ( ( rule__Model__ProceduresAssignment ) ) ( ( rule__Model__ProceduresAssignment )* ) )
            {
            // InternalThymioDSL.g:67:2: ( ( ( rule__Model__ProceduresAssignment ) ) ( ( rule__Model__ProceduresAssignment )* ) )
            // InternalThymioDSL.g:68:3: ( ( rule__Model__ProceduresAssignment ) ) ( ( rule__Model__ProceduresAssignment )* )
            {
            // InternalThymioDSL.g:68:3: ( ( rule__Model__ProceduresAssignment ) )
            // InternalThymioDSL.g:69:4: ( rule__Model__ProceduresAssignment )
            {
             before(grammarAccess.getModelAccess().getProceduresAssignment()); 
            // InternalThymioDSL.g:70:4: ( rule__Model__ProceduresAssignment )
            // InternalThymioDSL.g:70:5: rule__Model__ProceduresAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Model__ProceduresAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getProceduresAssignment()); 

            }

            // InternalThymioDSL.g:73:3: ( ( rule__Model__ProceduresAssignment )* )
            // InternalThymioDSL.g:74:4: ( rule__Model__ProceduresAssignment )*
            {
             before(grammarAccess.getModelAccess().getProceduresAssignment()); 
            // InternalThymioDSL.g:75:4: ( rule__Model__ProceduresAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==31) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalThymioDSL.g:75:5: rule__Model__ProceduresAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ProceduresAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getProceduresAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProcedure"
    // InternalThymioDSL.g:85:1: entryRuleProcedure : ruleProcedure EOF ;
    public final void entryRuleProcedure() throws RecognitionException {
        try {
            // InternalThymioDSL.g:86:1: ( ruleProcedure EOF )
            // InternalThymioDSL.g:87:1: ruleProcedure EOF
            {
             before(grammarAccess.getProcedureRule()); 
            pushFollow(FOLLOW_1);
            ruleProcedure();

            state._fsp--;

             after(grammarAccess.getProcedureRule()); 
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
    // $ANTLR end "entryRuleProcedure"


    // $ANTLR start "ruleProcedure"
    // InternalThymioDSL.g:94:1: ruleProcedure : ( ( rule__Procedure__Group__0 ) ) ;
    public final void ruleProcedure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:98:2: ( ( ( rule__Procedure__Group__0 ) ) )
            // InternalThymioDSL.g:99:2: ( ( rule__Procedure__Group__0 ) )
            {
            // InternalThymioDSL.g:99:2: ( ( rule__Procedure__Group__0 ) )
            // InternalThymioDSL.g:100:3: ( rule__Procedure__Group__0 )
            {
             before(grammarAccess.getProcedureAccess().getGroup()); 
            // InternalThymioDSL.g:101:3: ( rule__Procedure__Group__0 )
            // InternalThymioDSL.g:101:4: rule__Procedure__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getGroup()); 

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
    // $ANTLR end "ruleProcedure"


    // $ANTLR start "entryRuleEvent"
    // InternalThymioDSL.g:110:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalThymioDSL.g:111:1: ( ruleEvent EOF )
            // InternalThymioDSL.g:112:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalThymioDSL.g:119:1: ruleEvent : ( ( rule__Event__Alternatives ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:123:2: ( ( ( rule__Event__Alternatives ) ) )
            // InternalThymioDSL.g:124:2: ( ( rule__Event__Alternatives ) )
            {
            // InternalThymioDSL.g:124:2: ( ( rule__Event__Alternatives ) )
            // InternalThymioDSL.g:125:3: ( rule__Event__Alternatives )
            {
             before(grammarAccess.getEventAccess().getAlternatives()); 
            // InternalThymioDSL.g:126:3: ( rule__Event__Alternatives )
            // InternalThymioDSL.g:126:4: rule__Event__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Event__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleProxSensor"
    // InternalThymioDSL.g:135:1: entryRuleProxSensor : ruleProxSensor EOF ;
    public final void entryRuleProxSensor() throws RecognitionException {
        try {
            // InternalThymioDSL.g:136:1: ( ruleProxSensor EOF )
            // InternalThymioDSL.g:137:1: ruleProxSensor EOF
            {
             before(grammarAccess.getProxSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleProxSensor();

            state._fsp--;

             after(grammarAccess.getProxSensorRule()); 
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
    // $ANTLR end "entryRuleProxSensor"


    // $ANTLR start "ruleProxSensor"
    // InternalThymioDSL.g:144:1: ruleProxSensor : ( ( rule__ProxSensor__Group__0 ) ) ;
    public final void ruleProxSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:148:2: ( ( ( rule__ProxSensor__Group__0 ) ) )
            // InternalThymioDSL.g:149:2: ( ( rule__ProxSensor__Group__0 ) )
            {
            // InternalThymioDSL.g:149:2: ( ( rule__ProxSensor__Group__0 ) )
            // InternalThymioDSL.g:150:3: ( rule__ProxSensor__Group__0 )
            {
             before(grammarAccess.getProxSensorAccess().getGroup()); 
            // InternalThymioDSL.g:151:3: ( rule__ProxSensor__Group__0 )
            // InternalThymioDSL.g:151:4: rule__ProxSensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProxSensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProxSensorAccess().getGroup()); 

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
    // $ANTLR end "ruleProxSensor"


    // $ANTLR start "entryRuleBottomSensor"
    // InternalThymioDSL.g:160:1: entryRuleBottomSensor : ruleBottomSensor EOF ;
    public final void entryRuleBottomSensor() throws RecognitionException {
        try {
            // InternalThymioDSL.g:161:1: ( ruleBottomSensor EOF )
            // InternalThymioDSL.g:162:1: ruleBottomSensor EOF
            {
             before(grammarAccess.getBottomSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleBottomSensor();

            state._fsp--;

             after(grammarAccess.getBottomSensorRule()); 
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
    // $ANTLR end "entryRuleBottomSensor"


    // $ANTLR start "ruleBottomSensor"
    // InternalThymioDSL.g:169:1: ruleBottomSensor : ( ( rule__BottomSensor__Group__0 ) ) ;
    public final void ruleBottomSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:173:2: ( ( ( rule__BottomSensor__Group__0 ) ) )
            // InternalThymioDSL.g:174:2: ( ( rule__BottomSensor__Group__0 ) )
            {
            // InternalThymioDSL.g:174:2: ( ( rule__BottomSensor__Group__0 ) )
            // InternalThymioDSL.g:175:3: ( rule__BottomSensor__Group__0 )
            {
             before(grammarAccess.getBottomSensorAccess().getGroup()); 
            // InternalThymioDSL.g:176:3: ( rule__BottomSensor__Group__0 )
            // InternalThymioDSL.g:176:4: rule__BottomSensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BottomSensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBottomSensorAccess().getGroup()); 

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
    // $ANTLR end "ruleBottomSensor"


    // $ANTLR start "entryRuleAction"
    // InternalThymioDSL.g:185:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalThymioDSL.g:186:1: ( ruleAction EOF )
            // InternalThymioDSL.g:187:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalThymioDSL.g:194:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:198:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalThymioDSL.g:199:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalThymioDSL.g:199:2: ( ( rule__Action__Alternatives ) )
            // InternalThymioDSL.g:200:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalThymioDSL.g:201:3: ( rule__Action__Alternatives )
            // InternalThymioDSL.g:201:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleMotors"
    // InternalThymioDSL.g:210:1: entryRuleMotors : ruleMotors EOF ;
    public final void entryRuleMotors() throws RecognitionException {
        try {
            // InternalThymioDSL.g:211:1: ( ruleMotors EOF )
            // InternalThymioDSL.g:212:1: ruleMotors EOF
            {
             before(grammarAccess.getMotorsRule()); 
            pushFollow(FOLLOW_1);
            ruleMotors();

            state._fsp--;

             after(grammarAccess.getMotorsRule()); 
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
    // $ANTLR end "entryRuleMotors"


    // $ANTLR start "ruleMotors"
    // InternalThymioDSL.g:219:1: ruleMotors : ( ( rule__Motors__Group__0 ) ) ;
    public final void ruleMotors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:223:2: ( ( ( rule__Motors__Group__0 ) ) )
            // InternalThymioDSL.g:224:2: ( ( rule__Motors__Group__0 ) )
            {
            // InternalThymioDSL.g:224:2: ( ( rule__Motors__Group__0 ) )
            // InternalThymioDSL.g:225:3: ( rule__Motors__Group__0 )
            {
             before(grammarAccess.getMotorsAccess().getGroup()); 
            // InternalThymioDSL.g:226:3: ( rule__Motors__Group__0 )
            // InternalThymioDSL.g:226:4: rule__Motors__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Motors__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMotorsAccess().getGroup()); 

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
    // $ANTLR end "ruleMotors"


    // $ANTLR start "entryRuleLights"
    // InternalThymioDSL.g:235:1: entryRuleLights : ruleLights EOF ;
    public final void entryRuleLights() throws RecognitionException {
        try {
            // InternalThymioDSL.g:236:1: ( ruleLights EOF )
            // InternalThymioDSL.g:237:1: ruleLights EOF
            {
             before(grammarAccess.getLightsRule()); 
            pushFollow(FOLLOW_1);
            ruleLights();

            state._fsp--;

             after(grammarAccess.getLightsRule()); 
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
    // $ANTLR end "entryRuleLights"


    // $ANTLR start "ruleLights"
    // InternalThymioDSL.g:244:1: ruleLights : ( ( rule__Lights__Group__0 ) ) ;
    public final void ruleLights() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:248:2: ( ( ( rule__Lights__Group__0 ) ) )
            // InternalThymioDSL.g:249:2: ( ( rule__Lights__Group__0 ) )
            {
            // InternalThymioDSL.g:249:2: ( ( rule__Lights__Group__0 ) )
            // InternalThymioDSL.g:250:3: ( rule__Lights__Group__0 )
            {
             before(grammarAccess.getLightsAccess().getGroup()); 
            // InternalThymioDSL.g:251:3: ( rule__Lights__Group__0 )
            // InternalThymioDSL.g:251:4: rule__Lights__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Lights__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLightsAccess().getGroup()); 

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
    // $ANTLR end "ruleLights"


    // $ANTLR start "entryRuleRGB"
    // InternalThymioDSL.g:260:1: entryRuleRGB : ruleRGB EOF ;
    public final void entryRuleRGB() throws RecognitionException {
        try {
            // InternalThymioDSL.g:261:1: ( ruleRGB EOF )
            // InternalThymioDSL.g:262:1: ruleRGB EOF
            {
             before(grammarAccess.getRGBRule()); 
            pushFollow(FOLLOW_1);
            ruleRGB();

            state._fsp--;

             after(grammarAccess.getRGBRule()); 
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
    // $ANTLR end "entryRuleRGB"


    // $ANTLR start "ruleRGB"
    // InternalThymioDSL.g:269:1: ruleRGB : ( ( rule__RGB__Group__0 ) ) ;
    public final void ruleRGB() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:273:2: ( ( ( rule__RGB__Group__0 ) ) )
            // InternalThymioDSL.g:274:2: ( ( rule__RGB__Group__0 ) )
            {
            // InternalThymioDSL.g:274:2: ( ( rule__RGB__Group__0 ) )
            // InternalThymioDSL.g:275:3: ( rule__RGB__Group__0 )
            {
             before(grammarAccess.getRGBAccess().getGroup()); 
            // InternalThymioDSL.g:276:3: ( rule__RGB__Group__0 )
            // InternalThymioDSL.g:276:4: rule__RGB__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RGB__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRGBAccess().getGroup()); 

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
    // $ANTLR end "ruleRGB"


    // $ANTLR start "entryRuleSound"
    // InternalThymioDSL.g:285:1: entryRuleSound : ruleSound EOF ;
    public final void entryRuleSound() throws RecognitionException {
        try {
            // InternalThymioDSL.g:286:1: ( ruleSound EOF )
            // InternalThymioDSL.g:287:1: ruleSound EOF
            {
             before(grammarAccess.getSoundRule()); 
            pushFollow(FOLLOW_1);
            ruleSound();

            state._fsp--;

             after(grammarAccess.getSoundRule()); 
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
    // $ANTLR end "entryRuleSound"


    // $ANTLR start "ruleSound"
    // InternalThymioDSL.g:294:1: ruleSound : ( ( rule__Sound__Group__0 ) ) ;
    public final void ruleSound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:298:2: ( ( ( rule__Sound__Group__0 ) ) )
            // InternalThymioDSL.g:299:2: ( ( rule__Sound__Group__0 ) )
            {
            // InternalThymioDSL.g:299:2: ( ( rule__Sound__Group__0 ) )
            // InternalThymioDSL.g:300:3: ( rule__Sound__Group__0 )
            {
             before(grammarAccess.getSoundAccess().getGroup()); 
            // InternalThymioDSL.g:301:3: ( rule__Sound__Group__0 )
            // InternalThymioDSL.g:301:4: rule__Sound__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sound__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSoundAccess().getGroup()); 

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
    // $ANTLR end "ruleSound"


    // $ANTLR start "entryRuleEInt"
    // InternalThymioDSL.g:310:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalThymioDSL.g:311:1: ( ruleEInt EOF )
            // InternalThymioDSL.g:312:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalThymioDSL.g:319:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:323:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalThymioDSL.g:324:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalThymioDSL.g:324:2: ( ( rule__EInt__Group__0 ) )
            // InternalThymioDSL.g:325:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalThymioDSL.g:326:3: ( rule__EInt__Group__0 )
            // InternalThymioDSL.g:326:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // InternalThymioDSL.g:335:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalThymioDSL.g:336:1: ( ruleEString EOF )
            // InternalThymioDSL.g:337:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalThymioDSL.g:344:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:348:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalThymioDSL.g:349:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalThymioDSL.g:349:2: ( ( rule__EString__Alternatives ) )
            // InternalThymioDSL.g:350:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalThymioDSL.g:351:3: ( rule__EString__Alternatives )
            // InternalThymioDSL.g:351:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleStimulus"
    // InternalThymioDSL.g:360:1: entryRuleStimulus : ruleStimulus EOF ;
    public final void entryRuleStimulus() throws RecognitionException {
        try {
            // InternalThymioDSL.g:361:1: ( ruleStimulus EOF )
            // InternalThymioDSL.g:362:1: ruleStimulus EOF
            {
             before(grammarAccess.getStimulusRule()); 
            pushFollow(FOLLOW_1);
            ruleStimulus();

            state._fsp--;

             after(grammarAccess.getStimulusRule()); 
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
    // $ANTLR end "entryRuleStimulus"


    // $ANTLR start "ruleStimulus"
    // InternalThymioDSL.g:369:1: ruleStimulus : ( ( rule__Stimulus__Alternatives ) ) ;
    public final void ruleStimulus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:373:2: ( ( ( rule__Stimulus__Alternatives ) ) )
            // InternalThymioDSL.g:374:2: ( ( rule__Stimulus__Alternatives ) )
            {
            // InternalThymioDSL.g:374:2: ( ( rule__Stimulus__Alternatives ) )
            // InternalThymioDSL.g:375:3: ( rule__Stimulus__Alternatives )
            {
             before(grammarAccess.getStimulusAccess().getAlternatives()); 
            // InternalThymioDSL.g:376:3: ( rule__Stimulus__Alternatives )
            // InternalThymioDSL.g:376:4: rule__Stimulus__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Stimulus__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStimulusAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStimulus"


    // $ANTLR start "entryRuleNoteDuration"
    // InternalThymioDSL.g:385:1: entryRuleNoteDuration : ruleNoteDuration EOF ;
    public final void entryRuleNoteDuration() throws RecognitionException {
        try {
            // InternalThymioDSL.g:386:1: ( ruleNoteDuration EOF )
            // InternalThymioDSL.g:387:1: ruleNoteDuration EOF
            {
             before(grammarAccess.getNoteDurationRule()); 
            pushFollow(FOLLOW_1);
            ruleNoteDuration();

            state._fsp--;

             after(grammarAccess.getNoteDurationRule()); 
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
    // $ANTLR end "entryRuleNoteDuration"


    // $ANTLR start "ruleNoteDuration"
    // InternalThymioDSL.g:394:1: ruleNoteDuration : ( ( rule__NoteDuration__Alternatives ) ) ;
    public final void ruleNoteDuration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:398:2: ( ( ( rule__NoteDuration__Alternatives ) ) )
            // InternalThymioDSL.g:399:2: ( ( rule__NoteDuration__Alternatives ) )
            {
            // InternalThymioDSL.g:399:2: ( ( rule__NoteDuration__Alternatives ) )
            // InternalThymioDSL.g:400:3: ( rule__NoteDuration__Alternatives )
            {
             before(grammarAccess.getNoteDurationAccess().getAlternatives()); 
            // InternalThymioDSL.g:401:3: ( rule__NoteDuration__Alternatives )
            // InternalThymioDSL.g:401:4: rule__NoteDuration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NoteDuration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNoteDurationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNoteDuration"


    // $ANTLR start "entryRuleOrtogonal"
    // InternalThymioDSL.g:410:1: entryRuleOrtogonal : ruleOrtogonal EOF ;
    public final void entryRuleOrtogonal() throws RecognitionException {
        try {
            // InternalThymioDSL.g:411:1: ( ruleOrtogonal EOF )
            // InternalThymioDSL.g:412:1: ruleOrtogonal EOF
            {
             before(grammarAccess.getOrtogonalRule()); 
            pushFollow(FOLLOW_1);
            ruleOrtogonal();

            state._fsp--;

             after(grammarAccess.getOrtogonalRule()); 
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
    // $ANTLR end "entryRuleOrtogonal"


    // $ANTLR start "ruleOrtogonal"
    // InternalThymioDSL.g:419:1: ruleOrtogonal : ( ( rule__Ortogonal__Alternatives ) ) ;
    public final void ruleOrtogonal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:423:2: ( ( ( rule__Ortogonal__Alternatives ) ) )
            // InternalThymioDSL.g:424:2: ( ( rule__Ortogonal__Alternatives ) )
            {
            // InternalThymioDSL.g:424:2: ( ( rule__Ortogonal__Alternatives ) )
            // InternalThymioDSL.g:425:3: ( rule__Ortogonal__Alternatives )
            {
             before(grammarAccess.getOrtogonalAccess().getAlternatives()); 
            // InternalThymioDSL.g:426:3: ( rule__Ortogonal__Alternatives )
            // InternalThymioDSL.g:426:4: rule__Ortogonal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Ortogonal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOrtogonalAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOrtogonal"


    // $ANTLR start "entryRuleSensorStatus"
    // InternalThymioDSL.g:435:1: entryRuleSensorStatus : ruleSensorStatus EOF ;
    public final void entryRuleSensorStatus() throws RecognitionException {
        try {
            // InternalThymioDSL.g:436:1: ( ruleSensorStatus EOF )
            // InternalThymioDSL.g:437:1: ruleSensorStatus EOF
            {
             before(grammarAccess.getSensorStatusRule()); 
            pushFollow(FOLLOW_1);
            ruleSensorStatus();

            state._fsp--;

             after(grammarAccess.getSensorStatusRule()); 
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
    // $ANTLR end "entryRuleSensorStatus"


    // $ANTLR start "ruleSensorStatus"
    // InternalThymioDSL.g:444:1: ruleSensorStatus : ( ( rule__SensorStatus__Alternatives ) ) ;
    public final void ruleSensorStatus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:448:2: ( ( ( rule__SensorStatus__Alternatives ) ) )
            // InternalThymioDSL.g:449:2: ( ( rule__SensorStatus__Alternatives ) )
            {
            // InternalThymioDSL.g:449:2: ( ( rule__SensorStatus__Alternatives ) )
            // InternalThymioDSL.g:450:3: ( rule__SensorStatus__Alternatives )
            {
             before(grammarAccess.getSensorStatusAccess().getAlternatives()); 
            // InternalThymioDSL.g:451:3: ( rule__SensorStatus__Alternatives )
            // InternalThymioDSL.g:451:4: rule__SensorStatus__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SensorStatus__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSensorStatusAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSensorStatus"


    // $ANTLR start "entryRuleBlackWhite"
    // InternalThymioDSL.g:460:1: entryRuleBlackWhite : ruleBlackWhite EOF ;
    public final void entryRuleBlackWhite() throws RecognitionException {
        try {
            // InternalThymioDSL.g:461:1: ( ruleBlackWhite EOF )
            // InternalThymioDSL.g:462:1: ruleBlackWhite EOF
            {
             before(grammarAccess.getBlackWhiteRule()); 
            pushFollow(FOLLOW_1);
            ruleBlackWhite();

            state._fsp--;

             after(grammarAccess.getBlackWhiteRule()); 
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
    // $ANTLR end "entryRuleBlackWhite"


    // $ANTLR start "ruleBlackWhite"
    // InternalThymioDSL.g:469:1: ruleBlackWhite : ( ( rule__BlackWhite__Alternatives ) ) ;
    public final void ruleBlackWhite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:473:2: ( ( ( rule__BlackWhite__Alternatives ) ) )
            // InternalThymioDSL.g:474:2: ( ( rule__BlackWhite__Alternatives ) )
            {
            // InternalThymioDSL.g:474:2: ( ( rule__BlackWhite__Alternatives ) )
            // InternalThymioDSL.g:475:3: ( rule__BlackWhite__Alternatives )
            {
             before(grammarAccess.getBlackWhiteAccess().getAlternatives()); 
            // InternalThymioDSL.g:476:3: ( rule__BlackWhite__Alternatives )
            // InternalThymioDSL.g:476:4: rule__BlackWhite__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BlackWhite__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBlackWhiteAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBlackWhite"


    // $ANTLR start "entryRuleAddition"
    // InternalThymioDSL.g:485:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalThymioDSL.g:486:1: ( ruleAddition EOF )
            // InternalThymioDSL.g:487:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAdditionRule()); 
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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalThymioDSL.g:494:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:498:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalThymioDSL.g:499:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalThymioDSL.g:499:2: ( ( rule__Addition__Group__0 ) )
            // InternalThymioDSL.g:500:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalThymioDSL.g:501:3: ( rule__Addition__Group__0 )
            // InternalThymioDSL.g:501:4: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalThymioDSL.g:510:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalThymioDSL.g:511:1: ( ruleMultiplication EOF )
            // InternalThymioDSL.g:512:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getMultiplicationRule()); 
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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalThymioDSL.g:519:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:523:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalThymioDSL.g:524:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalThymioDSL.g:524:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalThymioDSL.g:525:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalThymioDSL.g:526:3: ( rule__Multiplication__Group__0 )
            // InternalThymioDSL.g:526:4: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getGroup()); 

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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleNumber"
    // InternalThymioDSL.g:535:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalThymioDSL.g:536:1: ( ruleNumber EOF )
            // InternalThymioDSL.g:537:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalThymioDSL.g:544:1: ruleNumber : ( ( rule__Number__Alternatives ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:548:2: ( ( ( rule__Number__Alternatives ) ) )
            // InternalThymioDSL.g:549:2: ( ( rule__Number__Alternatives ) )
            {
            // InternalThymioDSL.g:549:2: ( ( rule__Number__Alternatives ) )
            // InternalThymioDSL.g:550:3: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // InternalThymioDSL.g:551:3: ( rule__Number__Alternatives )
            // InternalThymioDSL.g:551:4: rule__Number__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Number__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "rule__Event__Alternatives"
    // InternalThymioDSL.g:559:1: rule__Event__Alternatives : ( ( ( rule__Event__Group_0__0 ) ) | ( ( rule__Event__Group_1__0 ) ) | ( ( rule__Event__Group_2__0 ) ) | ( ( rule__Event__Group_3__0 ) ) );
    public final void rule__Event__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:563:1: ( ( ( rule__Event__Group_0__0 ) ) | ( ( rule__Event__Group_1__0 ) ) | ( ( rule__Event__Group_2__0 ) ) | ( ( rule__Event__Group_3__0 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt2=1;
                }
                break;
            case 35:
                {
                alt2=2;
                }
                break;
            case 36:
                {
                alt2=3;
                }
                break;
            case 37:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalThymioDSL.g:564:2: ( ( rule__Event__Group_0__0 ) )
                    {
                    // InternalThymioDSL.g:564:2: ( ( rule__Event__Group_0__0 ) )
                    // InternalThymioDSL.g:565:3: ( rule__Event__Group_0__0 )
                    {
                     before(grammarAccess.getEventAccess().getGroup_0()); 
                    // InternalThymioDSL.g:566:3: ( rule__Event__Group_0__0 )
                    // InternalThymioDSL.g:566:4: rule__Event__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:570:2: ( ( rule__Event__Group_1__0 ) )
                    {
                    // InternalThymioDSL.g:570:2: ( ( rule__Event__Group_1__0 ) )
                    // InternalThymioDSL.g:571:3: ( rule__Event__Group_1__0 )
                    {
                     before(grammarAccess.getEventAccess().getGroup_1()); 
                    // InternalThymioDSL.g:572:3: ( rule__Event__Group_1__0 )
                    // InternalThymioDSL.g:572:4: rule__Event__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalThymioDSL.g:576:2: ( ( rule__Event__Group_2__0 ) )
                    {
                    // InternalThymioDSL.g:576:2: ( ( rule__Event__Group_2__0 ) )
                    // InternalThymioDSL.g:577:3: ( rule__Event__Group_2__0 )
                    {
                     before(grammarAccess.getEventAccess().getGroup_2()); 
                    // InternalThymioDSL.g:578:3: ( rule__Event__Group_2__0 )
                    // InternalThymioDSL.g:578:4: rule__Event__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalThymioDSL.g:582:2: ( ( rule__Event__Group_3__0 ) )
                    {
                    // InternalThymioDSL.g:582:2: ( ( rule__Event__Group_3__0 ) )
                    // InternalThymioDSL.g:583:3: ( rule__Event__Group_3__0 )
                    {
                     before(grammarAccess.getEventAccess().getGroup_3()); 
                    // InternalThymioDSL.g:584:3: ( rule__Event__Group_3__0 )
                    // InternalThymioDSL.g:584:4: rule__Event__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Event__Alternatives"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalThymioDSL.g:592:1: rule__Action__Alternatives : ( ( ( rule__Action__Group_0__0 ) ) | ( ( rule__Action__Group_1__0 ) ) | ( ( rule__Action__Group_2__0 ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:596:1: ( ( ( rule__Action__Group_0__0 ) ) | ( ( rule__Action__Group_1__0 ) ) | ( ( rule__Action__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt3=1;
                }
                break;
            case 48:
                {
                alt3=2;
                }
                break;
            case 49:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalThymioDSL.g:597:2: ( ( rule__Action__Group_0__0 ) )
                    {
                    // InternalThymioDSL.g:597:2: ( ( rule__Action__Group_0__0 ) )
                    // InternalThymioDSL.g:598:3: ( rule__Action__Group_0__0 )
                    {
                     before(grammarAccess.getActionAccess().getGroup_0()); 
                    // InternalThymioDSL.g:599:3: ( rule__Action__Group_0__0 )
                    // InternalThymioDSL.g:599:4: rule__Action__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:603:2: ( ( rule__Action__Group_1__0 ) )
                    {
                    // InternalThymioDSL.g:603:2: ( ( rule__Action__Group_1__0 ) )
                    // InternalThymioDSL.g:604:3: ( rule__Action__Group_1__0 )
                    {
                     before(grammarAccess.getActionAccess().getGroup_1()); 
                    // InternalThymioDSL.g:605:3: ( rule__Action__Group_1__0 )
                    // InternalThymioDSL.g:605:4: rule__Action__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalThymioDSL.g:609:2: ( ( rule__Action__Group_2__0 ) )
                    {
                    // InternalThymioDSL.g:609:2: ( ( rule__Action__Group_2__0 ) )
                    // InternalThymioDSL.g:610:3: ( rule__Action__Group_2__0 )
                    {
                     before(grammarAccess.getActionAccess().getGroup_2()); 
                    // InternalThymioDSL.g:611:3: ( rule__Action__Group_2__0 )
                    // InternalThymioDSL.g:611:4: rule__Action__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__Lights__Alternatives_1_1"
    // InternalThymioDSL.g:619:1: rule__Lights__Alternatives_1_1 : ( ( ( rule__Lights__Group_1_1_0__0 ) ) | ( 'off' ) );
    public final void rule__Lights__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:623:1: ( ( ( rule__Lights__Group_1_1_0__0 ) ) | ( 'off' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==53) ) {
                alt4=1;
            }
            else if ( (LA4_0==11) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalThymioDSL.g:624:2: ( ( rule__Lights__Group_1_1_0__0 ) )
                    {
                    // InternalThymioDSL.g:624:2: ( ( rule__Lights__Group_1_1_0__0 ) )
                    // InternalThymioDSL.g:625:3: ( rule__Lights__Group_1_1_0__0 )
                    {
                     before(grammarAccess.getLightsAccess().getGroup_1_1_0()); 
                    // InternalThymioDSL.g:626:3: ( rule__Lights__Group_1_1_0__0 )
                    // InternalThymioDSL.g:626:4: rule__Lights__Group_1_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lights__Group_1_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLightsAccess().getGroup_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:630:2: ( 'off' )
                    {
                    // InternalThymioDSL.g:630:2: ( 'off' )
                    // InternalThymioDSL.g:631:3: 'off'
                    {
                     before(grammarAccess.getLightsAccess().getOffKeyword_1_1_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getLightsAccess().getOffKeyword_1_1_1()); 

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
    // $ANTLR end "rule__Lights__Alternatives_1_1"


    // $ANTLR start "rule__Lights__Alternatives_2_1"
    // InternalThymioDSL.g:640:1: rule__Lights__Alternatives_2_1 : ( ( ( rule__Lights__Group_2_1_0__0 ) ) | ( 'off' ) );
    public final void rule__Lights__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:644:1: ( ( ( rule__Lights__Group_2_1_0__0 ) ) | ( 'off' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==53) ) {
                alt5=1;
            }
            else if ( (LA5_0==11) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalThymioDSL.g:645:2: ( ( rule__Lights__Group_2_1_0__0 ) )
                    {
                    // InternalThymioDSL.g:645:2: ( ( rule__Lights__Group_2_1_0__0 ) )
                    // InternalThymioDSL.g:646:3: ( rule__Lights__Group_2_1_0__0 )
                    {
                     before(grammarAccess.getLightsAccess().getGroup_2_1_0()); 
                    // InternalThymioDSL.g:647:3: ( rule__Lights__Group_2_1_0__0 )
                    // InternalThymioDSL.g:647:4: rule__Lights__Group_2_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lights__Group_2_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLightsAccess().getGroup_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:651:2: ( 'off' )
                    {
                    // InternalThymioDSL.g:651:2: ( 'off' )
                    // InternalThymioDSL.g:652:3: 'off'
                    {
                     before(grammarAccess.getLightsAccess().getOffKeyword_2_1_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getLightsAccess().getOffKeyword_2_1_1()); 

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
    // $ANTLR end "rule__Lights__Alternatives_2_1"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalThymioDSL.g:661:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:665:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalThymioDSL.g:666:2: ( RULE_STRING )
                    {
                    // InternalThymioDSL.g:666:2: ( RULE_STRING )
                    // InternalThymioDSL.g:667:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:672:2: ( RULE_ID )
                    {
                    // InternalThymioDSL.g:672:2: ( RULE_ID )
                    // InternalThymioDSL.g:673:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Stimulus__Alternatives"
    // InternalThymioDSL.g:682:1: rule__Stimulus__Alternatives : ( ( 'tap' ) | ( 'sound' ) );
    public final void rule__Stimulus__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:686:1: ( ( 'tap' ) | ( 'sound' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            else if ( (LA7_0==13) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalThymioDSL.g:687:2: ( 'tap' )
                    {
                    // InternalThymioDSL.g:687:2: ( 'tap' )
                    // InternalThymioDSL.g:688:3: 'tap'
                    {
                     before(grammarAccess.getStimulusAccess().getTapKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getStimulusAccess().getTapKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:693:2: ( 'sound' )
                    {
                    // InternalThymioDSL.g:693:2: ( 'sound' )
                    // InternalThymioDSL.g:694:3: 'sound'
                    {
                     before(grammarAccess.getStimulusAccess().getSoundKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getStimulusAccess().getSoundKeyword_1()); 

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
    // $ANTLR end "rule__Stimulus__Alternatives"


    // $ANTLR start "rule__NoteDuration__Alternatives"
    // InternalThymioDSL.g:703:1: rule__NoteDuration__Alternatives : ( ( 'short' ) | ( 'long' ) );
    public final void rule__NoteDuration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:707:1: ( ( 'short' ) | ( 'long' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            else if ( (LA8_0==15) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalThymioDSL.g:708:2: ( 'short' )
                    {
                    // InternalThymioDSL.g:708:2: ( 'short' )
                    // InternalThymioDSL.g:709:3: 'short'
                    {
                     before(grammarAccess.getNoteDurationAccess().getShortKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getNoteDurationAccess().getShortKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:714:2: ( 'long' )
                    {
                    // InternalThymioDSL.g:714:2: ( 'long' )
                    // InternalThymioDSL.g:715:3: 'long'
                    {
                     before(grammarAccess.getNoteDurationAccess().getLongKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getNoteDurationAccess().getLongKeyword_1()); 

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
    // $ANTLR end "rule__NoteDuration__Alternatives"


    // $ANTLR start "rule__Ortogonal__Alternatives"
    // InternalThymioDSL.g:724:1: rule__Ortogonal__Alternatives : ( ( 'up' ) | ( 'down' ) | ( 'left' ) | ( 'right' ) | ( 'center' ) );
    public final void rule__Ortogonal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:728:1: ( ( 'up' ) | ( 'down' ) | ( 'left' ) | ( 'right' ) | ( 'center' ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt9=1;
                }
                break;
            case 17:
                {
                alt9=2;
                }
                break;
            case 18:
                {
                alt9=3;
                }
                break;
            case 19:
                {
                alt9=4;
                }
                break;
            case 20:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalThymioDSL.g:729:2: ( 'up' )
                    {
                    // InternalThymioDSL.g:729:2: ( 'up' )
                    // InternalThymioDSL.g:730:3: 'up'
                    {
                     before(grammarAccess.getOrtogonalAccess().getUpKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getOrtogonalAccess().getUpKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:735:2: ( 'down' )
                    {
                    // InternalThymioDSL.g:735:2: ( 'down' )
                    // InternalThymioDSL.g:736:3: 'down'
                    {
                     before(grammarAccess.getOrtogonalAccess().getDownKeyword_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getOrtogonalAccess().getDownKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalThymioDSL.g:741:2: ( 'left' )
                    {
                    // InternalThymioDSL.g:741:2: ( 'left' )
                    // InternalThymioDSL.g:742:3: 'left'
                    {
                     before(grammarAccess.getOrtogonalAccess().getLeftKeyword_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getOrtogonalAccess().getLeftKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalThymioDSL.g:747:2: ( 'right' )
                    {
                    // InternalThymioDSL.g:747:2: ( 'right' )
                    // InternalThymioDSL.g:748:3: 'right'
                    {
                     before(grammarAccess.getOrtogonalAccess().getRightKeyword_3()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getOrtogonalAccess().getRightKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalThymioDSL.g:753:2: ( 'center' )
                    {
                    // InternalThymioDSL.g:753:2: ( 'center' )
                    // InternalThymioDSL.g:754:3: 'center'
                    {
                     before(grammarAccess.getOrtogonalAccess().getCenterKeyword_4()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getOrtogonalAccess().getCenterKeyword_4()); 

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
    // $ANTLR end "rule__Ortogonal__Alternatives"


    // $ANTLR start "rule__SensorStatus__Alternatives"
    // InternalThymioDSL.g:763:1: rule__SensorStatus__Alternatives : ( ( 'very_close' ) | ( 'close' ) | ( 'far' ) );
    public final void rule__SensorStatus__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:767:1: ( ( 'very_close' ) | ( 'close' ) | ( 'far' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt10=1;
                }
                break;
            case 22:
                {
                alt10=2;
                }
                break;
            case 23:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalThymioDSL.g:768:2: ( 'very_close' )
                    {
                    // InternalThymioDSL.g:768:2: ( 'very_close' )
                    // InternalThymioDSL.g:769:3: 'very_close'
                    {
                     before(grammarAccess.getSensorStatusAccess().getVery_closeKeyword_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getSensorStatusAccess().getVery_closeKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:774:2: ( 'close' )
                    {
                    // InternalThymioDSL.g:774:2: ( 'close' )
                    // InternalThymioDSL.g:775:3: 'close'
                    {
                     before(grammarAccess.getSensorStatusAccess().getCloseKeyword_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getSensorStatusAccess().getCloseKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalThymioDSL.g:780:2: ( 'far' )
                    {
                    // InternalThymioDSL.g:780:2: ( 'far' )
                    // InternalThymioDSL.g:781:3: 'far'
                    {
                     before(grammarAccess.getSensorStatusAccess().getFarKeyword_2()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getSensorStatusAccess().getFarKeyword_2()); 

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
    // $ANTLR end "rule__SensorStatus__Alternatives"


    // $ANTLR start "rule__BlackWhite__Alternatives"
    // InternalThymioDSL.g:790:1: rule__BlackWhite__Alternatives : ( ( 'black' ) | ( 'white' ) | ( 'any' ) );
    public final void rule__BlackWhite__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:794:1: ( ( 'black' ) | ( 'white' ) | ( 'any' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt11=1;
                }
                break;
            case 25:
                {
                alt11=2;
                }
                break;
            case 26:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalThymioDSL.g:795:2: ( 'black' )
                    {
                    // InternalThymioDSL.g:795:2: ( 'black' )
                    // InternalThymioDSL.g:796:3: 'black'
                    {
                     before(grammarAccess.getBlackWhiteAccess().getBlackKeyword_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getBlackWhiteAccess().getBlackKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:801:2: ( 'white' )
                    {
                    // InternalThymioDSL.g:801:2: ( 'white' )
                    // InternalThymioDSL.g:802:3: 'white'
                    {
                     before(grammarAccess.getBlackWhiteAccess().getWhiteKeyword_1()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getBlackWhiteAccess().getWhiteKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalThymioDSL.g:807:2: ( 'any' )
                    {
                    // InternalThymioDSL.g:807:2: ( 'any' )
                    // InternalThymioDSL.g:808:3: 'any'
                    {
                     before(grammarAccess.getBlackWhiteAccess().getAnyKeyword_2()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getBlackWhiteAccess().getAnyKeyword_2()); 

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
    // $ANTLR end "rule__BlackWhite__Alternatives"


    // $ANTLR start "rule__Addition__OperatorAlternatives_1_1_0"
    // InternalThymioDSL.g:817:1: rule__Addition__OperatorAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:821:1: ( ( '+' ) | ( '-' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            else if ( (LA12_0==28) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalThymioDSL.g:822:2: ( '+' )
                    {
                    // InternalThymioDSL.g:822:2: ( '+' )
                    // InternalThymioDSL.g:823:3: '+'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:828:2: ( '-' )
                    {
                    // InternalThymioDSL.g:828:2: ( '-' )
                    // InternalThymioDSL.g:829:3: '-'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__Addition__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__Multiplication__OperatorAlternatives_1_1_0"
    // InternalThymioDSL.g:838:1: rule__Multiplication__OperatorAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Multiplication__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:842:1: ( ( '*' ) | ( '/' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            else if ( (LA13_0==30) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalThymioDSL.g:843:2: ( '*' )
                    {
                    // InternalThymioDSL.g:843:2: ( '*' )
                    // InternalThymioDSL.g:844:3: '*'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:849:2: ( '/' )
                    {
                    // InternalThymioDSL.g:849:2: ( '/' )
                    // InternalThymioDSL.g:850:3: '/'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__Multiplication__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__Number__Alternatives"
    // InternalThymioDSL.g:859:1: rule__Number__Alternatives : ( ( ( rule__Number__ValueAssignment_0 ) ) | ( ( rule__Number__Group_1__0 ) ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:863:1: ( ( ( rule__Number__ValueAssignment_0 ) ) | ( ( rule__Number__Group_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT||LA14_0==28) ) {
                alt14=1;
            }
            else if ( (LA14_0==55) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalThymioDSL.g:864:2: ( ( rule__Number__ValueAssignment_0 ) )
                    {
                    // InternalThymioDSL.g:864:2: ( ( rule__Number__ValueAssignment_0 ) )
                    // InternalThymioDSL.g:865:3: ( rule__Number__ValueAssignment_0 )
                    {
                     before(grammarAccess.getNumberAccess().getValueAssignment_0()); 
                    // InternalThymioDSL.g:866:3: ( rule__Number__ValueAssignment_0 )
                    // InternalThymioDSL.g:866:4: rule__Number__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Number__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNumberAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:870:2: ( ( rule__Number__Group_1__0 ) )
                    {
                    // InternalThymioDSL.g:870:2: ( ( rule__Number__Group_1__0 ) )
                    // InternalThymioDSL.g:871:3: ( rule__Number__Group_1__0 )
                    {
                     before(grammarAccess.getNumberAccess().getGroup_1()); 
                    // InternalThymioDSL.g:872:3: ( rule__Number__Group_1__0 )
                    // InternalThymioDSL.g:872:4: rule__Number__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Number__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNumberAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Number__Alternatives"


    // $ANTLR start "rule__Procedure__Group__0"
    // InternalThymioDSL.g:880:1: rule__Procedure__Group__0 : rule__Procedure__Group__0__Impl rule__Procedure__Group__1 ;
    public final void rule__Procedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:884:1: ( rule__Procedure__Group__0__Impl rule__Procedure__Group__1 )
            // InternalThymioDSL.g:885:2: rule__Procedure__Group__0__Impl rule__Procedure__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Procedure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group__1();

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
    // $ANTLR end "rule__Procedure__Group__0"


    // $ANTLR start "rule__Procedure__Group__0__Impl"
    // InternalThymioDSL.g:892:1: rule__Procedure__Group__0__Impl : ( 'Procedure:' ) ;
    public final void rule__Procedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:896:1: ( ( 'Procedure:' ) )
            // InternalThymioDSL.g:897:1: ( 'Procedure:' )
            {
            // InternalThymioDSL.g:897:1: ( 'Procedure:' )
            // InternalThymioDSL.g:898:2: 'Procedure:'
            {
             before(grammarAccess.getProcedureAccess().getProcedureKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getProcedureKeyword_0()); 

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
    // $ANTLR end "rule__Procedure__Group__0__Impl"


    // $ANTLR start "rule__Procedure__Group__1"
    // InternalThymioDSL.g:907:1: rule__Procedure__Group__1 : rule__Procedure__Group__1__Impl rule__Procedure__Group__2 ;
    public final void rule__Procedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:911:1: ( rule__Procedure__Group__1__Impl rule__Procedure__Group__2 )
            // InternalThymioDSL.g:912:2: rule__Procedure__Group__1__Impl rule__Procedure__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Procedure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group__2();

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
    // $ANTLR end "rule__Procedure__Group__1"


    // $ANTLR start "rule__Procedure__Group__1__Impl"
    // InternalThymioDSL.g:919:1: rule__Procedure__Group__1__Impl : ( ( rule__Procedure__NameAssignment_1 ) ) ;
    public final void rule__Procedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:923:1: ( ( ( rule__Procedure__NameAssignment_1 ) ) )
            // InternalThymioDSL.g:924:1: ( ( rule__Procedure__NameAssignment_1 ) )
            {
            // InternalThymioDSL.g:924:1: ( ( rule__Procedure__NameAssignment_1 ) )
            // InternalThymioDSL.g:925:2: ( rule__Procedure__NameAssignment_1 )
            {
             before(grammarAccess.getProcedureAccess().getNameAssignment_1()); 
            // InternalThymioDSL.g:926:2: ( rule__Procedure__NameAssignment_1 )
            // InternalThymioDSL.g:926:3: rule__Procedure__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Procedure__Group__1__Impl"


    // $ANTLR start "rule__Procedure__Group__2"
    // InternalThymioDSL.g:934:1: rule__Procedure__Group__2 : rule__Procedure__Group__2__Impl rule__Procedure__Group__3 ;
    public final void rule__Procedure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:938:1: ( rule__Procedure__Group__2__Impl rule__Procedure__Group__3 )
            // InternalThymioDSL.g:939:2: rule__Procedure__Group__2__Impl rule__Procedure__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Procedure__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group__3();

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
    // $ANTLR end "rule__Procedure__Group__2"


    // $ANTLR start "rule__Procedure__Group__2__Impl"
    // InternalThymioDSL.g:946:1: rule__Procedure__Group__2__Impl : ( 'Event:' ) ;
    public final void rule__Procedure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:950:1: ( ( 'Event:' ) )
            // InternalThymioDSL.g:951:1: ( 'Event:' )
            {
            // InternalThymioDSL.g:951:1: ( 'Event:' )
            // InternalThymioDSL.g:952:2: 'Event:'
            {
             before(grammarAccess.getProcedureAccess().getEventKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getEventKeyword_2()); 

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
    // $ANTLR end "rule__Procedure__Group__2__Impl"


    // $ANTLR start "rule__Procedure__Group__3"
    // InternalThymioDSL.g:961:1: rule__Procedure__Group__3 : rule__Procedure__Group__3__Impl rule__Procedure__Group__4 ;
    public final void rule__Procedure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:965:1: ( rule__Procedure__Group__3__Impl rule__Procedure__Group__4 )
            // InternalThymioDSL.g:966:2: rule__Procedure__Group__3__Impl rule__Procedure__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Procedure__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group__4();

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
    // $ANTLR end "rule__Procedure__Group__3"


    // $ANTLR start "rule__Procedure__Group__3__Impl"
    // InternalThymioDSL.g:973:1: rule__Procedure__Group__3__Impl : ( ( rule__Procedure__EventsAssignment_3 ) ) ;
    public final void rule__Procedure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:977:1: ( ( ( rule__Procedure__EventsAssignment_3 ) ) )
            // InternalThymioDSL.g:978:1: ( ( rule__Procedure__EventsAssignment_3 ) )
            {
            // InternalThymioDSL.g:978:1: ( ( rule__Procedure__EventsAssignment_3 ) )
            // InternalThymioDSL.g:979:2: ( rule__Procedure__EventsAssignment_3 )
            {
             before(grammarAccess.getProcedureAccess().getEventsAssignment_3()); 
            // InternalThymioDSL.g:980:2: ( rule__Procedure__EventsAssignment_3 )
            // InternalThymioDSL.g:980:3: rule__Procedure__EventsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__EventsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getEventsAssignment_3()); 

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
    // $ANTLR end "rule__Procedure__Group__3__Impl"


    // $ANTLR start "rule__Procedure__Group__4"
    // InternalThymioDSL.g:988:1: rule__Procedure__Group__4 : rule__Procedure__Group__4__Impl rule__Procedure__Group__5 ;
    public final void rule__Procedure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:992:1: ( rule__Procedure__Group__4__Impl rule__Procedure__Group__5 )
            // InternalThymioDSL.g:993:2: rule__Procedure__Group__4__Impl rule__Procedure__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Procedure__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group__5();

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
    // $ANTLR end "rule__Procedure__Group__4"


    // $ANTLR start "rule__Procedure__Group__4__Impl"
    // InternalThymioDSL.g:1000:1: rule__Procedure__Group__4__Impl : ( 'Actions:' ) ;
    public final void rule__Procedure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1004:1: ( ( 'Actions:' ) )
            // InternalThymioDSL.g:1005:1: ( 'Actions:' )
            {
            // InternalThymioDSL.g:1005:1: ( 'Actions:' )
            // InternalThymioDSL.g:1006:2: 'Actions:'
            {
             before(grammarAccess.getProcedureAccess().getActionsKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getActionsKeyword_4()); 

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
    // $ANTLR end "rule__Procedure__Group__4__Impl"


    // $ANTLR start "rule__Procedure__Group__5"
    // InternalThymioDSL.g:1015:1: rule__Procedure__Group__5 : rule__Procedure__Group__5__Impl ;
    public final void rule__Procedure__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1019:1: ( rule__Procedure__Group__5__Impl )
            // InternalThymioDSL.g:1020:2: rule__Procedure__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__Group__5__Impl();

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
    // $ANTLR end "rule__Procedure__Group__5"


    // $ANTLR start "rule__Procedure__Group__5__Impl"
    // InternalThymioDSL.g:1026:1: rule__Procedure__Group__5__Impl : ( ( ( rule__Procedure__ActionsAssignment_5 ) ) ( ( rule__Procedure__ActionsAssignment_5 )* ) ) ;
    public final void rule__Procedure__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1030:1: ( ( ( ( rule__Procedure__ActionsAssignment_5 ) ) ( ( rule__Procedure__ActionsAssignment_5 )* ) ) )
            // InternalThymioDSL.g:1031:1: ( ( ( rule__Procedure__ActionsAssignment_5 ) ) ( ( rule__Procedure__ActionsAssignment_5 )* ) )
            {
            // InternalThymioDSL.g:1031:1: ( ( ( rule__Procedure__ActionsAssignment_5 ) ) ( ( rule__Procedure__ActionsAssignment_5 )* ) )
            // InternalThymioDSL.g:1032:2: ( ( rule__Procedure__ActionsAssignment_5 ) ) ( ( rule__Procedure__ActionsAssignment_5 )* )
            {
            // InternalThymioDSL.g:1032:2: ( ( rule__Procedure__ActionsAssignment_5 ) )
            // InternalThymioDSL.g:1033:3: ( rule__Procedure__ActionsAssignment_5 )
            {
             before(grammarAccess.getProcedureAccess().getActionsAssignment_5()); 
            // InternalThymioDSL.g:1034:3: ( rule__Procedure__ActionsAssignment_5 )
            // InternalThymioDSL.g:1034:4: rule__Procedure__ActionsAssignment_5
            {
            pushFollow(FOLLOW_9);
            rule__Procedure__ActionsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getActionsAssignment_5()); 

            }

            // InternalThymioDSL.g:1037:2: ( ( rule__Procedure__ActionsAssignment_5 )* )
            // InternalThymioDSL.g:1038:3: ( rule__Procedure__ActionsAssignment_5 )*
            {
             before(grammarAccess.getProcedureAccess().getActionsAssignment_5()); 
            // InternalThymioDSL.g:1039:3: ( rule__Procedure__ActionsAssignment_5 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=47 && LA15_0<=49)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalThymioDSL.g:1039:4: rule__Procedure__ActionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Procedure__ActionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getProcedureAccess().getActionsAssignment_5()); 

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
    // $ANTLR end "rule__Procedure__Group__5__Impl"


    // $ANTLR start "rule__Event__Group_0__0"
    // InternalThymioDSL.g:1049:1: rule__Event__Group_0__0 : rule__Event__Group_0__0__Impl rule__Event__Group_0__1 ;
    public final void rule__Event__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1053:1: ( rule__Event__Group_0__0__Impl rule__Event__Group_0__1 )
            // InternalThymioDSL.g:1054:2: rule__Event__Group_0__0__Impl rule__Event__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__Event__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_0__1();

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
    // $ANTLR end "rule__Event__Group_0__0"


    // $ANTLR start "rule__Event__Group_0__0__Impl"
    // InternalThymioDSL.g:1061:1: rule__Event__Group_0__0__Impl : ( 'button_is_clicked:' ) ;
    public final void rule__Event__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1065:1: ( ( 'button_is_clicked:' ) )
            // InternalThymioDSL.g:1066:1: ( 'button_is_clicked:' )
            {
            // InternalThymioDSL.g:1066:1: ( 'button_is_clicked:' )
            // InternalThymioDSL.g:1067:2: 'button_is_clicked:'
            {
             before(grammarAccess.getEventAccess().getButton_is_clickedKeyword_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getButton_is_clickedKeyword_0_0()); 

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
    // $ANTLR end "rule__Event__Group_0__0__Impl"


    // $ANTLR start "rule__Event__Group_0__1"
    // InternalThymioDSL.g:1076:1: rule__Event__Group_0__1 : rule__Event__Group_0__1__Impl ;
    public final void rule__Event__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1080:1: ( rule__Event__Group_0__1__Impl )
            // InternalThymioDSL.g:1081:2: rule__Event__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_0__1__Impl();

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
    // $ANTLR end "rule__Event__Group_0__1"


    // $ANTLR start "rule__Event__Group_0__1__Impl"
    // InternalThymioDSL.g:1087:1: rule__Event__Group_0__1__Impl : ( ( rule__Event__ButtonAssignment_0_1 ) ) ;
    public final void rule__Event__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1091:1: ( ( ( rule__Event__ButtonAssignment_0_1 ) ) )
            // InternalThymioDSL.g:1092:1: ( ( rule__Event__ButtonAssignment_0_1 ) )
            {
            // InternalThymioDSL.g:1092:1: ( ( rule__Event__ButtonAssignment_0_1 ) )
            // InternalThymioDSL.g:1093:2: ( rule__Event__ButtonAssignment_0_1 )
            {
             before(grammarAccess.getEventAccess().getButtonAssignment_0_1()); 
            // InternalThymioDSL.g:1094:2: ( rule__Event__ButtonAssignment_0_1 )
            // InternalThymioDSL.g:1094:3: rule__Event__ButtonAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__ButtonAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getButtonAssignment_0_1()); 

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
    // $ANTLR end "rule__Event__Group_0__1__Impl"


    // $ANTLR start "rule__Event__Group_1__0"
    // InternalThymioDSL.g:1103:1: rule__Event__Group_1__0 : rule__Event__Group_1__0__Impl rule__Event__Group_1__1 ;
    public final void rule__Event__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1107:1: ( rule__Event__Group_1__0__Impl rule__Event__Group_1__1 )
            // InternalThymioDSL.g:1108:2: rule__Event__Group_1__0__Impl rule__Event__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Event__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_1__1();

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
    // $ANTLR end "rule__Event__Group_1__0"


    // $ANTLR start "rule__Event__Group_1__0__Impl"
    // InternalThymioDSL.g:1115:1: rule__Event__Group_1__0__Impl : ( 'robot_detects_stimulus:' ) ;
    public final void rule__Event__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1119:1: ( ( 'robot_detects_stimulus:' ) )
            // InternalThymioDSL.g:1120:1: ( 'robot_detects_stimulus:' )
            {
            // InternalThymioDSL.g:1120:1: ( 'robot_detects_stimulus:' )
            // InternalThymioDSL.g:1121:2: 'robot_detects_stimulus:'
            {
             before(grammarAccess.getEventAccess().getRobot_detects_stimulusKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getRobot_detects_stimulusKeyword_1_0()); 

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
    // $ANTLR end "rule__Event__Group_1__0__Impl"


    // $ANTLR start "rule__Event__Group_1__1"
    // InternalThymioDSL.g:1130:1: rule__Event__Group_1__1 : rule__Event__Group_1__1__Impl ;
    public final void rule__Event__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1134:1: ( rule__Event__Group_1__1__Impl )
            // InternalThymioDSL.g:1135:2: rule__Event__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_1__1__Impl();

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
    // $ANTLR end "rule__Event__Group_1__1"


    // $ANTLR start "rule__Event__Group_1__1__Impl"
    // InternalThymioDSL.g:1141:1: rule__Event__Group_1__1__Impl : ( ( rule__Event__StimulusAssignment_1_1 ) ) ;
    public final void rule__Event__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1145:1: ( ( ( rule__Event__StimulusAssignment_1_1 ) ) )
            // InternalThymioDSL.g:1146:1: ( ( rule__Event__StimulusAssignment_1_1 ) )
            {
            // InternalThymioDSL.g:1146:1: ( ( rule__Event__StimulusAssignment_1_1 ) )
            // InternalThymioDSL.g:1147:2: ( rule__Event__StimulusAssignment_1_1 )
            {
             before(grammarAccess.getEventAccess().getStimulusAssignment_1_1()); 
            // InternalThymioDSL.g:1148:2: ( rule__Event__StimulusAssignment_1_1 )
            // InternalThymioDSL.g:1148:3: rule__Event__StimulusAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__StimulusAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getStimulusAssignment_1_1()); 

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
    // $ANTLR end "rule__Event__Group_1__1__Impl"


    // $ANTLR start "rule__Event__Group_2__0"
    // InternalThymioDSL.g:1157:1: rule__Event__Group_2__0 : rule__Event__Group_2__0__Impl rule__Event__Group_2__1 ;
    public final void rule__Event__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1161:1: ( rule__Event__Group_2__0__Impl rule__Event__Group_2__1 )
            // InternalThymioDSL.g:1162:2: rule__Event__Group_2__0__Impl rule__Event__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Event__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_2__1();

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
    // $ANTLR end "rule__Event__Group_2__0"


    // $ANTLR start "rule__Event__Group_2__0__Impl"
    // InternalThymioDSL.g:1169:1: rule__Event__Group_2__0__Impl : ( 'proximity_sensor_is_activated:' ) ;
    public final void rule__Event__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1173:1: ( ( 'proximity_sensor_is_activated:' ) )
            // InternalThymioDSL.g:1174:1: ( 'proximity_sensor_is_activated:' )
            {
            // InternalThymioDSL.g:1174:1: ( 'proximity_sensor_is_activated:' )
            // InternalThymioDSL.g:1175:2: 'proximity_sensor_is_activated:'
            {
             before(grammarAccess.getEventAccess().getProximity_sensor_is_activatedKeyword_2_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getProximity_sensor_is_activatedKeyword_2_0()); 

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
    // $ANTLR end "rule__Event__Group_2__0__Impl"


    // $ANTLR start "rule__Event__Group_2__1"
    // InternalThymioDSL.g:1184:1: rule__Event__Group_2__1 : rule__Event__Group_2__1__Impl ;
    public final void rule__Event__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1188:1: ( rule__Event__Group_2__1__Impl )
            // InternalThymioDSL.g:1189:2: rule__Event__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_2__1__Impl();

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
    // $ANTLR end "rule__Event__Group_2__1"


    // $ANTLR start "rule__Event__Group_2__1__Impl"
    // InternalThymioDSL.g:1195:1: rule__Event__Group_2__1__Impl : ( ( rule__Event__ProxSensorAssignment_2_1 ) ) ;
    public final void rule__Event__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1199:1: ( ( ( rule__Event__ProxSensorAssignment_2_1 ) ) )
            // InternalThymioDSL.g:1200:1: ( ( rule__Event__ProxSensorAssignment_2_1 ) )
            {
            // InternalThymioDSL.g:1200:1: ( ( rule__Event__ProxSensorAssignment_2_1 ) )
            // InternalThymioDSL.g:1201:2: ( rule__Event__ProxSensorAssignment_2_1 )
            {
             before(grammarAccess.getEventAccess().getProxSensorAssignment_2_1()); 
            // InternalThymioDSL.g:1202:2: ( rule__Event__ProxSensorAssignment_2_1 )
            // InternalThymioDSL.g:1202:3: rule__Event__ProxSensorAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__ProxSensorAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getProxSensorAssignment_2_1()); 

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
    // $ANTLR end "rule__Event__Group_2__1__Impl"


    // $ANTLR start "rule__Event__Group_3__0"
    // InternalThymioDSL.g:1211:1: rule__Event__Group_3__0 : rule__Event__Group_3__0__Impl rule__Event__Group_3__1 ;
    public final void rule__Event__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1215:1: ( rule__Event__Group_3__0__Impl rule__Event__Group_3__1 )
            // InternalThymioDSL.g:1216:2: rule__Event__Group_3__0__Impl rule__Event__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Event__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_3__1();

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
    // $ANTLR end "rule__Event__Group_3__0"


    // $ANTLR start "rule__Event__Group_3__0__Impl"
    // InternalThymioDSL.g:1223:1: rule__Event__Group_3__0__Impl : ( 'bottom_sensor_detects_color:' ) ;
    public final void rule__Event__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1227:1: ( ( 'bottom_sensor_detects_color:' ) )
            // InternalThymioDSL.g:1228:1: ( 'bottom_sensor_detects_color:' )
            {
            // InternalThymioDSL.g:1228:1: ( 'bottom_sensor_detects_color:' )
            // InternalThymioDSL.g:1229:2: 'bottom_sensor_detects_color:'
            {
             before(grammarAccess.getEventAccess().getBottom_sensor_detects_colorKeyword_3_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getBottom_sensor_detects_colorKeyword_3_0()); 

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
    // $ANTLR end "rule__Event__Group_3__0__Impl"


    // $ANTLR start "rule__Event__Group_3__1"
    // InternalThymioDSL.g:1238:1: rule__Event__Group_3__1 : rule__Event__Group_3__1__Impl ;
    public final void rule__Event__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1242:1: ( rule__Event__Group_3__1__Impl )
            // InternalThymioDSL.g:1243:2: rule__Event__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_3__1__Impl();

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
    // $ANTLR end "rule__Event__Group_3__1"


    // $ANTLR start "rule__Event__Group_3__1__Impl"
    // InternalThymioDSL.g:1249:1: rule__Event__Group_3__1__Impl : ( ( rule__Event__BottomSensorAssignment_3_1 ) ) ;
    public final void rule__Event__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1253:1: ( ( ( rule__Event__BottomSensorAssignment_3_1 ) ) )
            // InternalThymioDSL.g:1254:1: ( ( rule__Event__BottomSensorAssignment_3_1 ) )
            {
            // InternalThymioDSL.g:1254:1: ( ( rule__Event__BottomSensorAssignment_3_1 ) )
            // InternalThymioDSL.g:1255:2: ( rule__Event__BottomSensorAssignment_3_1 )
            {
             before(grammarAccess.getEventAccess().getBottomSensorAssignment_3_1()); 
            // InternalThymioDSL.g:1256:2: ( rule__Event__BottomSensorAssignment_3_1 )
            // InternalThymioDSL.g:1256:3: rule__Event__BottomSensorAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__BottomSensorAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getBottomSensorAssignment_3_1()); 

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
    // $ANTLR end "rule__Event__Group_3__1__Impl"


    // $ANTLR start "rule__ProxSensor__Group__0"
    // InternalThymioDSL.g:1265:1: rule__ProxSensor__Group__0 : rule__ProxSensor__Group__0__Impl rule__ProxSensor__Group__1 ;
    public final void rule__ProxSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1269:1: ( rule__ProxSensor__Group__0__Impl rule__ProxSensor__Group__1 )
            // InternalThymioDSL.g:1270:2: rule__ProxSensor__Group__0__Impl rule__ProxSensor__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ProxSensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxSensor__Group__1();

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
    // $ANTLR end "rule__ProxSensor__Group__0"


    // $ANTLR start "rule__ProxSensor__Group__0__Impl"
    // InternalThymioDSL.g:1277:1: rule__ProxSensor__Group__0__Impl : ( () ) ;
    public final void rule__ProxSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1281:1: ( ( () ) )
            // InternalThymioDSL.g:1282:1: ( () )
            {
            // InternalThymioDSL.g:1282:1: ( () )
            // InternalThymioDSL.g:1283:2: ()
            {
             before(grammarAccess.getProxSensorAccess().getProxSensorAction_0()); 
            // InternalThymioDSL.g:1284:2: ()
            // InternalThymioDSL.g:1284:3: 
            {
            }

             after(grammarAccess.getProxSensorAccess().getProxSensorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProxSensor__Group__0__Impl"


    // $ANTLR start "rule__ProxSensor__Group__1"
    // InternalThymioDSL.g:1292:1: rule__ProxSensor__Group__1 : rule__ProxSensor__Group__1__Impl rule__ProxSensor__Group__2 ;
    public final void rule__ProxSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1296:1: ( rule__ProxSensor__Group__1__Impl rule__ProxSensor__Group__2 )
            // InternalThymioDSL.g:1297:2: rule__ProxSensor__Group__1__Impl rule__ProxSensor__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ProxSensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxSensor__Group__2();

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
    // $ANTLR end "rule__ProxSensor__Group__1"


    // $ANTLR start "rule__ProxSensor__Group__1__Impl"
    // InternalThymioDSL.g:1304:1: rule__ProxSensor__Group__1__Impl : ( ( rule__ProxSensor__Group_1__0 )? ) ;
    public final void rule__ProxSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1308:1: ( ( ( rule__ProxSensor__Group_1__0 )? ) )
            // InternalThymioDSL.g:1309:1: ( ( rule__ProxSensor__Group_1__0 )? )
            {
            // InternalThymioDSL.g:1309:1: ( ( rule__ProxSensor__Group_1__0 )? )
            // InternalThymioDSL.g:1310:2: ( rule__ProxSensor__Group_1__0 )?
            {
             before(grammarAccess.getProxSensorAccess().getGroup_1()); 
            // InternalThymioDSL.g:1311:2: ( rule__ProxSensor__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==38) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalThymioDSL.g:1311:3: rule__ProxSensor__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProxSensor__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProxSensorAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ProxSensor__Group__1__Impl"


    // $ANTLR start "rule__ProxSensor__Group__2"
    // InternalThymioDSL.g:1319:1: rule__ProxSensor__Group__2 : rule__ProxSensor__Group__2__Impl rule__ProxSensor__Group__3 ;
    public final void rule__ProxSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1323:1: ( rule__ProxSensor__Group__2__Impl rule__ProxSensor__Group__3 )
            // InternalThymioDSL.g:1324:2: rule__ProxSensor__Group__2__Impl rule__ProxSensor__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__ProxSensor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxSensor__Group__3();

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
    // $ANTLR end "rule__ProxSensor__Group__2"


    // $ANTLR start "rule__ProxSensor__Group__2__Impl"
    // InternalThymioDSL.g:1331:1: rule__ProxSensor__Group__2__Impl : ( ( rule__ProxSensor__Group_2__0 )? ) ;
    public final void rule__ProxSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1335:1: ( ( ( rule__ProxSensor__Group_2__0 )? ) )
            // InternalThymioDSL.g:1336:1: ( ( rule__ProxSensor__Group_2__0 )? )
            {
            // InternalThymioDSL.g:1336:1: ( ( rule__ProxSensor__Group_2__0 )? )
            // InternalThymioDSL.g:1337:2: ( rule__ProxSensor__Group_2__0 )?
            {
             before(grammarAccess.getProxSensorAccess().getGroup_2()); 
            // InternalThymioDSL.g:1338:2: ( rule__ProxSensor__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalThymioDSL.g:1338:3: rule__ProxSensor__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProxSensor__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProxSensorAccess().getGroup_2()); 

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
    // $ANTLR end "rule__ProxSensor__Group__2__Impl"


    // $ANTLR start "rule__ProxSensor__Group__3"
    // InternalThymioDSL.g:1346:1: rule__ProxSensor__Group__3 : rule__ProxSensor__Group__3__Impl rule__ProxSensor__Group__4 ;
    public final void rule__ProxSensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1350:1: ( rule__ProxSensor__Group__3__Impl rule__ProxSensor__Group__4 )
            // InternalThymioDSL.g:1351:2: rule__ProxSensor__Group__3__Impl rule__ProxSensor__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__ProxSensor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxSensor__Group__4();

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
    // $ANTLR end "rule__ProxSensor__Group__3"


    // $ANTLR start "rule__ProxSensor__Group__3__Impl"
    // InternalThymioDSL.g:1358:1: rule__ProxSensor__Group__3__Impl : ( ( rule__ProxSensor__Group_3__0 )? ) ;
    public final void rule__ProxSensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1362:1: ( ( ( rule__ProxSensor__Group_3__0 )? ) )
            // InternalThymioDSL.g:1363:1: ( ( rule__ProxSensor__Group_3__0 )? )
            {
            // InternalThymioDSL.g:1363:1: ( ( rule__ProxSensor__Group_3__0 )? )
            // InternalThymioDSL.g:1364:2: ( rule__ProxSensor__Group_3__0 )?
            {
             before(grammarAccess.getProxSensorAccess().getGroup_3()); 
            // InternalThymioDSL.g:1365:2: ( rule__ProxSensor__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==40) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalThymioDSL.g:1365:3: rule__ProxSensor__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProxSensor__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProxSensorAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ProxSensor__Group__3__Impl"


    // $ANTLR start "rule__ProxSensor__Group__4"
    // InternalThymioDSL.g:1373:1: rule__ProxSensor__Group__4 : rule__ProxSensor__Group__4__Impl rule__ProxSensor__Group__5 ;
    public final void rule__ProxSensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1377:1: ( rule__ProxSensor__Group__4__Impl rule__ProxSensor__Group__5 )
            // InternalThymioDSL.g:1378:2: rule__ProxSensor__Group__4__Impl rule__ProxSensor__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__ProxSensor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxSensor__Group__5();

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
    // $ANTLR end "rule__ProxSensor__Group__4"


    // $ANTLR start "rule__ProxSensor__Group__4__Impl"
    // InternalThymioDSL.g:1385:1: rule__ProxSensor__Group__4__Impl : ( ( rule__ProxSensor__Group_4__0 )? ) ;
    public final void rule__ProxSensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1389:1: ( ( ( rule__ProxSensor__Group_4__0 )? ) )
            // InternalThymioDSL.g:1390:1: ( ( rule__ProxSensor__Group_4__0 )? )
            {
            // InternalThymioDSL.g:1390:1: ( ( rule__ProxSensor__Group_4__0 )? )
            // InternalThymioDSL.g:1391:2: ( rule__ProxSensor__Group_4__0 )?
            {
             before(grammarAccess.getProxSensorAccess().getGroup_4()); 
            // InternalThymioDSL.g:1392:2: ( rule__ProxSensor__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==41) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalThymioDSL.g:1392:3: rule__ProxSensor__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProxSensor__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProxSensorAccess().getGroup_4()); 

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
    // $ANTLR end "rule__ProxSensor__Group__4__Impl"


    // $ANTLR start "rule__ProxSensor__Group__5"
    // InternalThymioDSL.g:1400:1: rule__ProxSensor__Group__5 : rule__ProxSensor__Group__5__Impl rule__ProxSensor__Group__6 ;
    public final void rule__ProxSensor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1404:1: ( rule__ProxSensor__Group__5__Impl rule__ProxSensor__Group__6 )
            // InternalThymioDSL.g:1405:2: rule__ProxSensor__Group__5__Impl rule__ProxSensor__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__ProxSensor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxSensor__Group__6();

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
    // $ANTLR end "rule__ProxSensor__Group__5"


    // $ANTLR start "rule__ProxSensor__Group__5__Impl"
    // InternalThymioDSL.g:1412:1: rule__ProxSensor__Group__5__Impl : ( ( rule__ProxSensor__Group_5__0 )? ) ;
    public final void rule__ProxSensor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1416:1: ( ( ( rule__ProxSensor__Group_5__0 )? ) )
            // InternalThymioDSL.g:1417:1: ( ( rule__ProxSensor__Group_5__0 )? )
            {
            // InternalThymioDSL.g:1417:1: ( ( rule__ProxSensor__Group_5__0 )? )
            // InternalThymioDSL.g:1418:2: ( rule__ProxSensor__Group_5__0 )?
            {
             before(grammarAccess.getProxSensorAccess().getGroup_5()); 
            // InternalThymioDSL.g:1419:2: ( rule__ProxSensor__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==42) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalThymioDSL.g:1419:3: rule__ProxSensor__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProxSensor__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProxSensorAccess().getGroup_5()); 

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
    // $ANTLR end "rule__ProxSensor__Group__5__Impl"


    // $ANTLR start "rule__ProxSensor__Group__6"
    // InternalThymioDSL.g:1427:1: rule__ProxSensor__Group__6 : rule__ProxSensor__Group__6__Impl rule__ProxSensor__Group__7 ;
    public final void rule__ProxSensor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1431:1: ( rule__ProxSensor__Group__6__Impl rule__ProxSensor__Group__7 )
            // InternalThymioDSL.g:1432:2: rule__ProxSensor__Group__6__Impl rule__ProxSensor__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__ProxSensor__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxSensor__Group__7();

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
    // $ANTLR end "rule__ProxSensor__Group__6"


    // $ANTLR start "rule__ProxSensor__Group__6__Impl"
    // InternalThymioDSL.g:1439:1: rule__ProxSensor__Group__6__Impl : ( ( rule__ProxSensor__Group_6__0 )? ) ;
    public final void rule__ProxSensor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1443:1: ( ( ( rule__ProxSensor__Group_6__0 )? ) )
            // InternalThymioDSL.g:1444:1: ( ( rule__ProxSensor__Group_6__0 )? )
            {
            // InternalThymioDSL.g:1444:1: ( ( rule__ProxSensor__Group_6__0 )? )
            // InternalThymioDSL.g:1445:2: ( rule__ProxSensor__Group_6__0 )?
            {
             before(grammarAccess.getProxSensorAccess().getGroup_6()); 
            // InternalThymioDSL.g:1446:2: ( rule__ProxSensor__Group_6__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==43) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalThymioDSL.g:1446:3: rule__ProxSensor__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProxSensor__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProxSensorAccess().getGroup_6()); 

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
    // $ANTLR end "rule__ProxSensor__Group__6__Impl"


    // $ANTLR start "rule__ProxSensor__Group__7"
    // InternalThymioDSL.g:1454:1: rule__ProxSensor__Group__7 : rule__ProxSensor__Group__7__Impl ;
    public final void rule__ProxSensor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1458:1: ( rule__ProxSensor__Group__7__Impl )
            // InternalThymioDSL.g:1459:2: rule__ProxSensor__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProxSensor__Group__7__Impl();

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
    // $ANTLR end "rule__ProxSensor__Group__7"


    // $ANTLR start "rule__ProxSensor__Group__7__Impl"
    // InternalThymioDSL.g:1465:1: rule__ProxSensor__Group__7__Impl : ( ( rule__ProxSensor__Group_7__0 )? ) ;
    public final void rule__ProxSensor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1469:1: ( ( ( rule__ProxSensor__Group_7__0 )? ) )
            // InternalThymioDSL.g:1470:1: ( ( rule__ProxSensor__Group_7__0 )? )
            {
            // InternalThymioDSL.g:1470:1: ( ( rule__ProxSensor__Group_7__0 )? )
            // InternalThymioDSL.g:1471:2: ( rule__ProxSensor__Group_7__0 )?
            {
             before(grammarAccess.getProxSensorAccess().getGroup_7()); 
            // InternalThymioDSL.g:1472:2: ( rule__ProxSensor__Group_7__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==44) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalThymioDSL.g:1472:3: rule__ProxSensor__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProxSensor__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProxSensorAccess().getGroup_7()); 

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
    // $ANTLR end "rule__ProxSensor__Group__7__Impl"


    // $ANTLR start "rule__ProxSensor__Group_1__0"
    // InternalThymioDSL.g:1481:1: rule__ProxSensor__Group_1__0 : rule__ProxSensor__Group_1__0__Impl rule__ProxSensor__Group_1__1 ;
    public final void rule__ProxSensor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1485:1: ( rule__ProxSensor__Group_1__0__Impl rule__ProxSensor__Group_1__1 )
            // InternalThymioDSL.g:1486:2: rule__ProxSensor__Group_1__0__Impl rule__ProxSensor__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__ProxSensor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxSensor__Group_1__1();

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
    // $ANTLR end "rule__ProxSensor__Group_1__0"


    // $ANTLR start "rule__ProxSensor__Group_1__0__Impl"
    // InternalThymioDSL.g:1493:1: rule__ProxSensor__Group_1__0__Impl : ( 'front_left:' ) ;
    public final void rule__ProxSensor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1497:1: ( ( 'front_left:' ) )
            // InternalThymioDSL.g:1498:1: ( 'front_left:' )
            {
            // InternalThymioDSL.g:1498:1: ( 'front_left:' )
            // InternalThymioDSL.g:1499:2: 'front_left:'
            {
             before(grammarAccess.getProxSensorAccess().getFront_leftKeyword_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getProxSensorAccess().getFront_leftKeyword_1_0()); 

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
    // $ANTLR end "rule__ProxSensor__Group_1__0__Impl"


    // $ANTLR start "rule__ProxSensor__Group_1__1"
    // InternalThymioDSL.g:1508:1: rule__ProxSensor__Group_1__1 : rule__ProxSensor__Group_1__1__Impl ;
    public final void rule__ProxSensor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1512:1: ( rule__ProxSensor__Group_1__1__Impl )
            // InternalThymioDSL.g:1513:2: rule__ProxSensor__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProxSensor__Group_1__1__Impl();

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
    // $ANTLR end "rule__ProxSensor__Group_1__1"


    // $ANTLR start "rule__ProxSensor__Group_1__1__Impl"
    // InternalThymioDSL.g:1519:1: rule__ProxSensor__Group_1__1__Impl : ( ( rule__ProxSensor__FrontLeftSensorAssignment_1_1 ) ) ;
    public final void rule__ProxSensor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1523:1: ( ( ( rule__ProxSensor__FrontLeftSensorAssignment_1_1 ) ) )
            // InternalThymioDSL.g:1524:1: ( ( rule__ProxSensor__FrontLeftSensorAssignment_1_1 ) )
            {
            // InternalThymioDSL.g:1524:1: ( ( rule__ProxSensor__FrontLeftSensorAssignment_1_1 ) )
            // InternalThymioDSL.g:1525:2: ( rule__ProxSensor__FrontLeftSensorAssignment_1_1 )
            {
             before(grammarAccess.getProxSensorAccess().getFrontLeftSensorAssignment_1_1()); 
            // InternalThymioDSL.g:1526:2: ( rule__ProxSensor__FrontLeftSensorAssignment_1_1 )
            // InternalThymioDSL.g:1526:3: rule__ProxSensor__FrontLeftSensorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ProxSensor__FrontLeftSensorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getProxSensorAccess().getFrontLeftSensorAssignment_1_1()); 

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
    // $ANTLR end "rule__ProxSensor__Group_1__1__Impl"


    // $ANTLR start "rule__ProxSensor__Group_2__0"
    // InternalThymioDSL.g:1535:1: rule__ProxSensor__Group_2__0 : rule__ProxSensor__Group_2__0__Impl rule__ProxSensor__Group_2__1 ;
    public final void rule__ProxSensor__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1539:1: ( rule__ProxSensor__Group_2__0__Impl rule__ProxSensor__Group_2__1 )
            // InternalThymioDSL.g:1540:2: rule__ProxSensor__Group_2__0__Impl rule__ProxSensor__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__ProxSensor__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxSensor__Group_2__1();

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
    // $ANTLR end "rule__ProxSensor__Group_2__0"


    // $ANTLR start "rule__ProxSensor__Group_2__0__Impl"
    // InternalThymioDSL.g:1547:1: rule__ProxSensor__Group_2__0__Impl : ( 'front_center_left:' ) ;
    public final void rule__ProxSensor__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1551:1: ( ( 'front_center_left:' ) )
            // InternalThymioDSL.g:1552:1: ( 'front_center_left:' )
            {
            // InternalThymioDSL.g:1552:1: ( 'front_center_left:' )
            // InternalThymioDSL.g:1553:2: 'front_center_left:'
            {
             before(grammarAccess.getProxSensorAccess().getFront_center_leftKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getProxSensorAccess().getFront_center_leftKeyword_2_0()); 

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
    // $ANTLR end "rule__ProxSensor__Group_2__0__Impl"


    // $ANTLR start "rule__ProxSensor__Group_2__1"
    // InternalThymioDSL.g:1562:1: rule__ProxSensor__Group_2__1 : rule__ProxSensor__Group_2__1__Impl ;
    public final void rule__ProxSensor__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1566:1: ( rule__ProxSensor__Group_2__1__Impl )
            // InternalThymioDSL.g:1567:2: rule__ProxSensor__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProxSensor__Group_2__1__Impl();

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
    // $ANTLR end "rule__ProxSensor__Group_2__1"


    // $ANTLR start "rule__ProxSensor__Group_2__1__Impl"
    // InternalThymioDSL.g:1573:1: rule__ProxSensor__Group_2__1__Impl : ( ( rule__ProxSensor__FrontCenterLeftSensorAssignment_2_1 ) ) ;
    public final void rule__ProxSensor__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1577:1: ( ( ( rule__ProxSensor__FrontCenterLeftSensorAssignment_2_1 ) ) )
            // InternalThymioDSL.g:1578:1: ( ( rule__ProxSensor__FrontCenterLeftSensorAssignment_2_1 ) )
            {
            // InternalThymioDSL.g:1578:1: ( ( rule__ProxSensor__FrontCenterLeftSensorAssignment_2_1 ) )
            // InternalThymioDSL.g:1579:2: ( rule__ProxSensor__FrontCenterLeftSensorAssignment_2_1 )
            {
             before(grammarAccess.getProxSensorAccess().getFrontCenterLeftSensorAssignment_2_1()); 
            // InternalThymioDSL.g:1580:2: ( rule__ProxSensor__FrontCenterLeftSensorAssignment_2_1 )
            // InternalThymioDSL.g:1580:3: rule__ProxSensor__FrontCenterLeftSensorAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ProxSensor__FrontCenterLeftSensorAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getProxSensorAccess().getFrontCenterLeftSensorAssignment_2_1()); 

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
    // $ANTLR end "rule__ProxSensor__Group_2__1__Impl"


    // $ANTLR start "rule__ProxSensor__Group_3__0"
    // InternalThymioDSL.g:1589:1: rule__ProxSensor__Group_3__0 : rule__ProxSensor__Group_3__0__Impl rule__ProxSensor__Group_3__1 ;
    public final void rule__ProxSensor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1593:1: ( rule__ProxSensor__Group_3__0__Impl rule__ProxSensor__Group_3__1 )
            // InternalThymioDSL.g:1594:2: rule__ProxSensor__Group_3__0__Impl rule__ProxSensor__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__ProxSensor__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxSensor__Group_3__1();

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
    // $ANTLR end "rule__ProxSensor__Group_3__0"


    // $ANTLR start "rule__ProxSensor__Group_3__0__Impl"
    // InternalThymioDSL.g:1601:1: rule__ProxSensor__Group_3__0__Impl : ( 'front_center:' ) ;
    public final void rule__ProxSensor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1605:1: ( ( 'front_center:' ) )
            // InternalThymioDSL.g:1606:1: ( 'front_center:' )
            {
            // InternalThymioDSL.g:1606:1: ( 'front_center:' )
            // InternalThymioDSL.g:1607:2: 'front_center:'
            {
             before(grammarAccess.getProxSensorAccess().getFront_centerKeyword_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getProxSensorAccess().getFront_centerKeyword_3_0()); 

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
    // $ANTLR end "rule__ProxSensor__Group_3__0__Impl"


    // $ANTLR start "rule__ProxSensor__Group_3__1"
    // InternalThymioDSL.g:1616:1: rule__ProxSensor__Group_3__1 : rule__ProxSensor__Group_3__1__Impl ;
    public final void rule__ProxSensor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1620:1: ( rule__ProxSensor__Group_3__1__Impl )
            // InternalThymioDSL.g:1621:2: rule__ProxSensor__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProxSensor__Group_3__1__Impl();

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
    // $ANTLR end "rule__ProxSensor__Group_3__1"


    // $ANTLR start "rule__ProxSensor__Group_3__1__Impl"
    // InternalThymioDSL.g:1627:1: rule__ProxSensor__Group_3__1__Impl : ( ( rule__ProxSensor__FrontCenterSensorAssignment_3_1 ) ) ;
    public final void rule__ProxSensor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1631:1: ( ( ( rule__ProxSensor__FrontCenterSensorAssignment_3_1 ) ) )
            // InternalThymioDSL.g:1632:1: ( ( rule__ProxSensor__FrontCenterSensorAssignment_3_1 ) )
            {
            // InternalThymioDSL.g:1632:1: ( ( rule__ProxSensor__FrontCenterSensorAssignment_3_1 ) )
            // InternalThymioDSL.g:1633:2: ( rule__ProxSensor__FrontCenterSensorAssignment_3_1 )
            {
             before(grammarAccess.getProxSensorAccess().getFrontCenterSensorAssignment_3_1()); 
            // InternalThymioDSL.g:1634:2: ( rule__ProxSensor__FrontCenterSensorAssignment_3_1 )
            // InternalThymioDSL.g:1634:3: rule__ProxSensor__FrontCenterSensorAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ProxSensor__FrontCenterSensorAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProxSensorAccess().getFrontCenterSensorAssignment_3_1()); 

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
    // $ANTLR end "rule__ProxSensor__Group_3__1__Impl"


    // $ANTLR start "rule__ProxSensor__Group_4__0"
    // InternalThymioDSL.g:1643:1: rule__ProxSensor__Group_4__0 : rule__ProxSensor__Group_4__0__Impl rule__ProxSensor__Group_4__1 ;
    public final void rule__ProxSensor__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1647:1: ( rule__ProxSensor__Group_4__0__Impl rule__ProxSensor__Group_4__1 )
            // InternalThymioDSL.g:1648:2: rule__ProxSensor__Group_4__0__Impl rule__ProxSensor__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__ProxSensor__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxSensor__Group_4__1();

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
    // $ANTLR end "rule__ProxSensor__Group_4__0"


    // $ANTLR start "rule__ProxSensor__Group_4__0__Impl"
    // InternalThymioDSL.g:1655:1: rule__ProxSensor__Group_4__0__Impl : ( 'front_center_right:' ) ;
    public final void rule__ProxSensor__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1659:1: ( ( 'front_center_right:' ) )
            // InternalThymioDSL.g:1660:1: ( 'front_center_right:' )
            {
            // InternalThymioDSL.g:1660:1: ( 'front_center_right:' )
            // InternalThymioDSL.g:1661:2: 'front_center_right:'
            {
             before(grammarAccess.getProxSensorAccess().getFront_center_rightKeyword_4_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getProxSensorAccess().getFront_center_rightKeyword_4_0()); 

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
    // $ANTLR end "rule__ProxSensor__Group_4__0__Impl"


    // $ANTLR start "rule__ProxSensor__Group_4__1"
    // InternalThymioDSL.g:1670:1: rule__ProxSensor__Group_4__1 : rule__ProxSensor__Group_4__1__Impl ;
    public final void rule__ProxSensor__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1674:1: ( rule__ProxSensor__Group_4__1__Impl )
            // InternalThymioDSL.g:1675:2: rule__ProxSensor__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProxSensor__Group_4__1__Impl();

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
    // $ANTLR end "rule__ProxSensor__Group_4__1"


    // $ANTLR start "rule__ProxSensor__Group_4__1__Impl"
    // InternalThymioDSL.g:1681:1: rule__ProxSensor__Group_4__1__Impl : ( ( rule__ProxSensor__FrontCenterRightSensorAssignment_4_1 ) ) ;
    public final void rule__ProxSensor__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1685:1: ( ( ( rule__ProxSensor__FrontCenterRightSensorAssignment_4_1 ) ) )
            // InternalThymioDSL.g:1686:1: ( ( rule__ProxSensor__FrontCenterRightSensorAssignment_4_1 ) )
            {
            // InternalThymioDSL.g:1686:1: ( ( rule__ProxSensor__FrontCenterRightSensorAssignment_4_1 ) )
            // InternalThymioDSL.g:1687:2: ( rule__ProxSensor__FrontCenterRightSensorAssignment_4_1 )
            {
             before(grammarAccess.getProxSensorAccess().getFrontCenterRightSensorAssignment_4_1()); 
            // InternalThymioDSL.g:1688:2: ( rule__ProxSensor__FrontCenterRightSensorAssignment_4_1 )
            // InternalThymioDSL.g:1688:3: rule__ProxSensor__FrontCenterRightSensorAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ProxSensor__FrontCenterRightSensorAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getProxSensorAccess().getFrontCenterRightSensorAssignment_4_1()); 

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
    // $ANTLR end "rule__ProxSensor__Group_4__1__Impl"


    // $ANTLR start "rule__ProxSensor__Group_5__0"
    // InternalThymioDSL.g:1697:1: rule__ProxSensor__Group_5__0 : rule__ProxSensor__Group_5__0__Impl rule__ProxSensor__Group_5__1 ;
    public final void rule__ProxSensor__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1701:1: ( rule__ProxSensor__Group_5__0__Impl rule__ProxSensor__Group_5__1 )
            // InternalThymioDSL.g:1702:2: rule__ProxSensor__Group_5__0__Impl rule__ProxSensor__Group_5__1
            {
            pushFollow(FOLLOW_14);
            rule__ProxSensor__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxSensor__Group_5__1();

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
    // $ANTLR end "rule__ProxSensor__Group_5__0"


    // $ANTLR start "rule__ProxSensor__Group_5__0__Impl"
    // InternalThymioDSL.g:1709:1: rule__ProxSensor__Group_5__0__Impl : ( 'front_right:' ) ;
    public final void rule__ProxSensor__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1713:1: ( ( 'front_right:' ) )
            // InternalThymioDSL.g:1714:1: ( 'front_right:' )
            {
            // InternalThymioDSL.g:1714:1: ( 'front_right:' )
            // InternalThymioDSL.g:1715:2: 'front_right:'
            {
             before(grammarAccess.getProxSensorAccess().getFront_rightKeyword_5_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getProxSensorAccess().getFront_rightKeyword_5_0()); 

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
    // $ANTLR end "rule__ProxSensor__Group_5__0__Impl"


    // $ANTLR start "rule__ProxSensor__Group_5__1"
    // InternalThymioDSL.g:1724:1: rule__ProxSensor__Group_5__1 : rule__ProxSensor__Group_5__1__Impl ;
    public final void rule__ProxSensor__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1728:1: ( rule__ProxSensor__Group_5__1__Impl )
            // InternalThymioDSL.g:1729:2: rule__ProxSensor__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProxSensor__Group_5__1__Impl();

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
    // $ANTLR end "rule__ProxSensor__Group_5__1"


    // $ANTLR start "rule__ProxSensor__Group_5__1__Impl"
    // InternalThymioDSL.g:1735:1: rule__ProxSensor__Group_5__1__Impl : ( ( rule__ProxSensor__FrontRightSensorAssignment_5_1 ) ) ;
    public final void rule__ProxSensor__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1739:1: ( ( ( rule__ProxSensor__FrontRightSensorAssignment_5_1 ) ) )
            // InternalThymioDSL.g:1740:1: ( ( rule__ProxSensor__FrontRightSensorAssignment_5_1 ) )
            {
            // InternalThymioDSL.g:1740:1: ( ( rule__ProxSensor__FrontRightSensorAssignment_5_1 ) )
            // InternalThymioDSL.g:1741:2: ( rule__ProxSensor__FrontRightSensorAssignment_5_1 )
            {
             before(grammarAccess.getProxSensorAccess().getFrontRightSensorAssignment_5_1()); 
            // InternalThymioDSL.g:1742:2: ( rule__ProxSensor__FrontRightSensorAssignment_5_1 )
            // InternalThymioDSL.g:1742:3: rule__ProxSensor__FrontRightSensorAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ProxSensor__FrontRightSensorAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getProxSensorAccess().getFrontRightSensorAssignment_5_1()); 

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
    // $ANTLR end "rule__ProxSensor__Group_5__1__Impl"


    // $ANTLR start "rule__ProxSensor__Group_6__0"
    // InternalThymioDSL.g:1751:1: rule__ProxSensor__Group_6__0 : rule__ProxSensor__Group_6__0__Impl rule__ProxSensor__Group_6__1 ;
    public final void rule__ProxSensor__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1755:1: ( rule__ProxSensor__Group_6__0__Impl rule__ProxSensor__Group_6__1 )
            // InternalThymioDSL.g:1756:2: rule__ProxSensor__Group_6__0__Impl rule__ProxSensor__Group_6__1
            {
            pushFollow(FOLLOW_14);
            rule__ProxSensor__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxSensor__Group_6__1();

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
    // $ANTLR end "rule__ProxSensor__Group_6__0"


    // $ANTLR start "rule__ProxSensor__Group_6__0__Impl"
    // InternalThymioDSL.g:1763:1: rule__ProxSensor__Group_6__0__Impl : ( 'back_left:' ) ;
    public final void rule__ProxSensor__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1767:1: ( ( 'back_left:' ) )
            // InternalThymioDSL.g:1768:1: ( 'back_left:' )
            {
            // InternalThymioDSL.g:1768:1: ( 'back_left:' )
            // InternalThymioDSL.g:1769:2: 'back_left:'
            {
             before(grammarAccess.getProxSensorAccess().getBack_leftKeyword_6_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getProxSensorAccess().getBack_leftKeyword_6_0()); 

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
    // $ANTLR end "rule__ProxSensor__Group_6__0__Impl"


    // $ANTLR start "rule__ProxSensor__Group_6__1"
    // InternalThymioDSL.g:1778:1: rule__ProxSensor__Group_6__1 : rule__ProxSensor__Group_6__1__Impl ;
    public final void rule__ProxSensor__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1782:1: ( rule__ProxSensor__Group_6__1__Impl )
            // InternalThymioDSL.g:1783:2: rule__ProxSensor__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProxSensor__Group_6__1__Impl();

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
    // $ANTLR end "rule__ProxSensor__Group_6__1"


    // $ANTLR start "rule__ProxSensor__Group_6__1__Impl"
    // InternalThymioDSL.g:1789:1: rule__ProxSensor__Group_6__1__Impl : ( ( rule__ProxSensor__BackLeftSensorAssignment_6_1 ) ) ;
    public final void rule__ProxSensor__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1793:1: ( ( ( rule__ProxSensor__BackLeftSensorAssignment_6_1 ) ) )
            // InternalThymioDSL.g:1794:1: ( ( rule__ProxSensor__BackLeftSensorAssignment_6_1 ) )
            {
            // InternalThymioDSL.g:1794:1: ( ( rule__ProxSensor__BackLeftSensorAssignment_6_1 ) )
            // InternalThymioDSL.g:1795:2: ( rule__ProxSensor__BackLeftSensorAssignment_6_1 )
            {
             before(grammarAccess.getProxSensorAccess().getBackLeftSensorAssignment_6_1()); 
            // InternalThymioDSL.g:1796:2: ( rule__ProxSensor__BackLeftSensorAssignment_6_1 )
            // InternalThymioDSL.g:1796:3: rule__ProxSensor__BackLeftSensorAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ProxSensor__BackLeftSensorAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getProxSensorAccess().getBackLeftSensorAssignment_6_1()); 

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
    // $ANTLR end "rule__ProxSensor__Group_6__1__Impl"


    // $ANTLR start "rule__ProxSensor__Group_7__0"
    // InternalThymioDSL.g:1805:1: rule__ProxSensor__Group_7__0 : rule__ProxSensor__Group_7__0__Impl rule__ProxSensor__Group_7__1 ;
    public final void rule__ProxSensor__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1809:1: ( rule__ProxSensor__Group_7__0__Impl rule__ProxSensor__Group_7__1 )
            // InternalThymioDSL.g:1810:2: rule__ProxSensor__Group_7__0__Impl rule__ProxSensor__Group_7__1
            {
            pushFollow(FOLLOW_14);
            rule__ProxSensor__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxSensor__Group_7__1();

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
    // $ANTLR end "rule__ProxSensor__Group_7__0"


    // $ANTLR start "rule__ProxSensor__Group_7__0__Impl"
    // InternalThymioDSL.g:1817:1: rule__ProxSensor__Group_7__0__Impl : ( 'back_right:' ) ;
    public final void rule__ProxSensor__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1821:1: ( ( 'back_right:' ) )
            // InternalThymioDSL.g:1822:1: ( 'back_right:' )
            {
            // InternalThymioDSL.g:1822:1: ( 'back_right:' )
            // InternalThymioDSL.g:1823:2: 'back_right:'
            {
             before(grammarAccess.getProxSensorAccess().getBack_rightKeyword_7_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getProxSensorAccess().getBack_rightKeyword_7_0()); 

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
    // $ANTLR end "rule__ProxSensor__Group_7__0__Impl"


    // $ANTLR start "rule__ProxSensor__Group_7__1"
    // InternalThymioDSL.g:1832:1: rule__ProxSensor__Group_7__1 : rule__ProxSensor__Group_7__1__Impl ;
    public final void rule__ProxSensor__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1836:1: ( rule__ProxSensor__Group_7__1__Impl )
            // InternalThymioDSL.g:1837:2: rule__ProxSensor__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProxSensor__Group_7__1__Impl();

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
    // $ANTLR end "rule__ProxSensor__Group_7__1"


    // $ANTLR start "rule__ProxSensor__Group_7__1__Impl"
    // InternalThymioDSL.g:1843:1: rule__ProxSensor__Group_7__1__Impl : ( ( rule__ProxSensor__BackRightSensorAssignment_7_1 ) ) ;
    public final void rule__ProxSensor__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1847:1: ( ( ( rule__ProxSensor__BackRightSensorAssignment_7_1 ) ) )
            // InternalThymioDSL.g:1848:1: ( ( rule__ProxSensor__BackRightSensorAssignment_7_1 ) )
            {
            // InternalThymioDSL.g:1848:1: ( ( rule__ProxSensor__BackRightSensorAssignment_7_1 ) )
            // InternalThymioDSL.g:1849:2: ( rule__ProxSensor__BackRightSensorAssignment_7_1 )
            {
             before(grammarAccess.getProxSensorAccess().getBackRightSensorAssignment_7_1()); 
            // InternalThymioDSL.g:1850:2: ( rule__ProxSensor__BackRightSensorAssignment_7_1 )
            // InternalThymioDSL.g:1850:3: rule__ProxSensor__BackRightSensorAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__ProxSensor__BackRightSensorAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getProxSensorAccess().getBackRightSensorAssignment_7_1()); 

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
    // $ANTLR end "rule__ProxSensor__Group_7__1__Impl"


    // $ANTLR start "rule__BottomSensor__Group__0"
    // InternalThymioDSL.g:1859:1: rule__BottomSensor__Group__0 : rule__BottomSensor__Group__0__Impl rule__BottomSensor__Group__1 ;
    public final void rule__BottomSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1863:1: ( rule__BottomSensor__Group__0__Impl rule__BottomSensor__Group__1 )
            // InternalThymioDSL.g:1864:2: rule__BottomSensor__Group__0__Impl rule__BottomSensor__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__BottomSensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BottomSensor__Group__1();

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
    // $ANTLR end "rule__BottomSensor__Group__0"


    // $ANTLR start "rule__BottomSensor__Group__0__Impl"
    // InternalThymioDSL.g:1871:1: rule__BottomSensor__Group__0__Impl : ( ( rule__BottomSensor__Group_0__0 ) ) ;
    public final void rule__BottomSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1875:1: ( ( ( rule__BottomSensor__Group_0__0 ) ) )
            // InternalThymioDSL.g:1876:1: ( ( rule__BottomSensor__Group_0__0 ) )
            {
            // InternalThymioDSL.g:1876:1: ( ( rule__BottomSensor__Group_0__0 ) )
            // InternalThymioDSL.g:1877:2: ( rule__BottomSensor__Group_0__0 )
            {
             before(grammarAccess.getBottomSensorAccess().getGroup_0()); 
            // InternalThymioDSL.g:1878:2: ( rule__BottomSensor__Group_0__0 )
            // InternalThymioDSL.g:1878:3: rule__BottomSensor__Group_0__0
            {
            pushFollow(FOLLOW_2);
            rule__BottomSensor__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getBottomSensorAccess().getGroup_0()); 

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
    // $ANTLR end "rule__BottomSensor__Group__0__Impl"


    // $ANTLR start "rule__BottomSensor__Group__1"
    // InternalThymioDSL.g:1886:1: rule__BottomSensor__Group__1 : rule__BottomSensor__Group__1__Impl ;
    public final void rule__BottomSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1890:1: ( rule__BottomSensor__Group__1__Impl )
            // InternalThymioDSL.g:1891:2: rule__BottomSensor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BottomSensor__Group__1__Impl();

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
    // $ANTLR end "rule__BottomSensor__Group__1"


    // $ANTLR start "rule__BottomSensor__Group__1__Impl"
    // InternalThymioDSL.g:1897:1: rule__BottomSensor__Group__1__Impl : ( ( rule__BottomSensor__Group_1__0 ) ) ;
    public final void rule__BottomSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1901:1: ( ( ( rule__BottomSensor__Group_1__0 ) ) )
            // InternalThymioDSL.g:1902:1: ( ( rule__BottomSensor__Group_1__0 ) )
            {
            // InternalThymioDSL.g:1902:1: ( ( rule__BottomSensor__Group_1__0 ) )
            // InternalThymioDSL.g:1903:2: ( rule__BottomSensor__Group_1__0 )
            {
             before(grammarAccess.getBottomSensorAccess().getGroup_1()); 
            // InternalThymioDSL.g:1904:2: ( rule__BottomSensor__Group_1__0 )
            // InternalThymioDSL.g:1904:3: rule__BottomSensor__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__BottomSensor__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getBottomSensorAccess().getGroup_1()); 

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
    // $ANTLR end "rule__BottomSensor__Group__1__Impl"


    // $ANTLR start "rule__BottomSensor__Group_0__0"
    // InternalThymioDSL.g:1913:1: rule__BottomSensor__Group_0__0 : rule__BottomSensor__Group_0__0__Impl rule__BottomSensor__Group_0__1 ;
    public final void rule__BottomSensor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1917:1: ( rule__BottomSensor__Group_0__0__Impl rule__BottomSensor__Group_0__1 )
            // InternalThymioDSL.g:1918:2: rule__BottomSensor__Group_0__0__Impl rule__BottomSensor__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__BottomSensor__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BottomSensor__Group_0__1();

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
    // $ANTLR end "rule__BottomSensor__Group_0__0"


    // $ANTLR start "rule__BottomSensor__Group_0__0__Impl"
    // InternalThymioDSL.g:1925:1: rule__BottomSensor__Group_0__0__Impl : ( 'left:' ) ;
    public final void rule__BottomSensor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1929:1: ( ( 'left:' ) )
            // InternalThymioDSL.g:1930:1: ( 'left:' )
            {
            // InternalThymioDSL.g:1930:1: ( 'left:' )
            // InternalThymioDSL.g:1931:2: 'left:'
            {
             before(grammarAccess.getBottomSensorAccess().getLeftKeyword_0_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getBottomSensorAccess().getLeftKeyword_0_0()); 

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
    // $ANTLR end "rule__BottomSensor__Group_0__0__Impl"


    // $ANTLR start "rule__BottomSensor__Group_0__1"
    // InternalThymioDSL.g:1940:1: rule__BottomSensor__Group_0__1 : rule__BottomSensor__Group_0__1__Impl ;
    public final void rule__BottomSensor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1944:1: ( rule__BottomSensor__Group_0__1__Impl )
            // InternalThymioDSL.g:1945:2: rule__BottomSensor__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BottomSensor__Group_0__1__Impl();

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
    // $ANTLR end "rule__BottomSensor__Group_0__1"


    // $ANTLR start "rule__BottomSensor__Group_0__1__Impl"
    // InternalThymioDSL.g:1951:1: rule__BottomSensor__Group_0__1__Impl : ( ( rule__BottomSensor__BottomLeftSensorAssignment_0_1 ) ) ;
    public final void rule__BottomSensor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1955:1: ( ( ( rule__BottomSensor__BottomLeftSensorAssignment_0_1 ) ) )
            // InternalThymioDSL.g:1956:1: ( ( rule__BottomSensor__BottomLeftSensorAssignment_0_1 ) )
            {
            // InternalThymioDSL.g:1956:1: ( ( rule__BottomSensor__BottomLeftSensorAssignment_0_1 ) )
            // InternalThymioDSL.g:1957:2: ( rule__BottomSensor__BottomLeftSensorAssignment_0_1 )
            {
             before(grammarAccess.getBottomSensorAccess().getBottomLeftSensorAssignment_0_1()); 
            // InternalThymioDSL.g:1958:2: ( rule__BottomSensor__BottomLeftSensorAssignment_0_1 )
            // InternalThymioDSL.g:1958:3: rule__BottomSensor__BottomLeftSensorAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__BottomSensor__BottomLeftSensorAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getBottomSensorAccess().getBottomLeftSensorAssignment_0_1()); 

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
    // $ANTLR end "rule__BottomSensor__Group_0__1__Impl"


    // $ANTLR start "rule__BottomSensor__Group_1__0"
    // InternalThymioDSL.g:1967:1: rule__BottomSensor__Group_1__0 : rule__BottomSensor__Group_1__0__Impl rule__BottomSensor__Group_1__1 ;
    public final void rule__BottomSensor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1971:1: ( rule__BottomSensor__Group_1__0__Impl rule__BottomSensor__Group_1__1 )
            // InternalThymioDSL.g:1972:2: rule__BottomSensor__Group_1__0__Impl rule__BottomSensor__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__BottomSensor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BottomSensor__Group_1__1();

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
    // $ANTLR end "rule__BottomSensor__Group_1__0"


    // $ANTLR start "rule__BottomSensor__Group_1__0__Impl"
    // InternalThymioDSL.g:1979:1: rule__BottomSensor__Group_1__0__Impl : ( 'right:' ) ;
    public final void rule__BottomSensor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1983:1: ( ( 'right:' ) )
            // InternalThymioDSL.g:1984:1: ( 'right:' )
            {
            // InternalThymioDSL.g:1984:1: ( 'right:' )
            // InternalThymioDSL.g:1985:2: 'right:'
            {
             before(grammarAccess.getBottomSensorAccess().getRightKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getBottomSensorAccess().getRightKeyword_1_0()); 

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
    // $ANTLR end "rule__BottomSensor__Group_1__0__Impl"


    // $ANTLR start "rule__BottomSensor__Group_1__1"
    // InternalThymioDSL.g:1994:1: rule__BottomSensor__Group_1__1 : rule__BottomSensor__Group_1__1__Impl ;
    public final void rule__BottomSensor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1998:1: ( rule__BottomSensor__Group_1__1__Impl )
            // InternalThymioDSL.g:1999:2: rule__BottomSensor__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BottomSensor__Group_1__1__Impl();

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
    // $ANTLR end "rule__BottomSensor__Group_1__1"


    // $ANTLR start "rule__BottomSensor__Group_1__1__Impl"
    // InternalThymioDSL.g:2005:1: rule__BottomSensor__Group_1__1__Impl : ( ( rule__BottomSensor__BottomRightSensorAssignment_1_1 ) ) ;
    public final void rule__BottomSensor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2009:1: ( ( ( rule__BottomSensor__BottomRightSensorAssignment_1_1 ) ) )
            // InternalThymioDSL.g:2010:1: ( ( rule__BottomSensor__BottomRightSensorAssignment_1_1 ) )
            {
            // InternalThymioDSL.g:2010:1: ( ( rule__BottomSensor__BottomRightSensorAssignment_1_1 ) )
            // InternalThymioDSL.g:2011:2: ( rule__BottomSensor__BottomRightSensorAssignment_1_1 )
            {
             before(grammarAccess.getBottomSensorAccess().getBottomRightSensorAssignment_1_1()); 
            // InternalThymioDSL.g:2012:2: ( rule__BottomSensor__BottomRightSensorAssignment_1_1 )
            // InternalThymioDSL.g:2012:3: rule__BottomSensor__BottomRightSensorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BottomSensor__BottomRightSensorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBottomSensorAccess().getBottomRightSensorAssignment_1_1()); 

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
    // $ANTLR end "rule__BottomSensor__Group_1__1__Impl"


    // $ANTLR start "rule__Action__Group_0__0"
    // InternalThymioDSL.g:2021:1: rule__Action__Group_0__0 : rule__Action__Group_0__0__Impl rule__Action__Group_0__1 ;
    public final void rule__Action__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2025:1: ( rule__Action__Group_0__0__Impl rule__Action__Group_0__1 )
            // InternalThymioDSL.g:2026:2: rule__Action__Group_0__0__Impl rule__Action__Group_0__1
            {
            pushFollow(FOLLOW_17);
            rule__Action__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_0__1();

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
    // $ANTLR end "rule__Action__Group_0__0"


    // $ANTLR start "rule__Action__Group_0__0__Impl"
    // InternalThymioDSL.g:2033:1: rule__Action__Group_0__0__Impl : ( 'move:' ) ;
    public final void rule__Action__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2037:1: ( ( 'move:' ) )
            // InternalThymioDSL.g:2038:1: ( 'move:' )
            {
            // InternalThymioDSL.g:2038:1: ( 'move:' )
            // InternalThymioDSL.g:2039:2: 'move:'
            {
             before(grammarAccess.getActionAccess().getMoveKeyword_0_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getMoveKeyword_0_0()); 

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
    // $ANTLR end "rule__Action__Group_0__0__Impl"


    // $ANTLR start "rule__Action__Group_0__1"
    // InternalThymioDSL.g:2048:1: rule__Action__Group_0__1 : rule__Action__Group_0__1__Impl ;
    public final void rule__Action__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2052:1: ( rule__Action__Group_0__1__Impl )
            // InternalThymioDSL.g:2053:2: rule__Action__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_0__1__Impl();

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
    // $ANTLR end "rule__Action__Group_0__1"


    // $ANTLR start "rule__Action__Group_0__1__Impl"
    // InternalThymioDSL.g:2059:1: rule__Action__Group_0__1__Impl : ( ( rule__Action__MoveAssignment_0_1 ) ) ;
    public final void rule__Action__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2063:1: ( ( ( rule__Action__MoveAssignment_0_1 ) ) )
            // InternalThymioDSL.g:2064:1: ( ( rule__Action__MoveAssignment_0_1 ) )
            {
            // InternalThymioDSL.g:2064:1: ( ( rule__Action__MoveAssignment_0_1 ) )
            // InternalThymioDSL.g:2065:2: ( rule__Action__MoveAssignment_0_1 )
            {
             before(grammarAccess.getActionAccess().getMoveAssignment_0_1()); 
            // InternalThymioDSL.g:2066:2: ( rule__Action__MoveAssignment_0_1 )
            // InternalThymioDSL.g:2066:3: rule__Action__MoveAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__MoveAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getMoveAssignment_0_1()); 

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
    // $ANTLR end "rule__Action__Group_0__1__Impl"


    // $ANTLR start "rule__Action__Group_1__0"
    // InternalThymioDSL.g:2075:1: rule__Action__Group_1__0 : rule__Action__Group_1__0__Impl rule__Action__Group_1__1 ;
    public final void rule__Action__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2079:1: ( rule__Action__Group_1__0__Impl rule__Action__Group_1__1 )
            // InternalThymioDSL.g:2080:2: rule__Action__Group_1__0__Impl rule__Action__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__Action__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_1__1();

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
    // $ANTLR end "rule__Action__Group_1__0"


    // $ANTLR start "rule__Action__Group_1__0__Impl"
    // InternalThymioDSL.g:2087:1: rule__Action__Group_1__0__Impl : ( 'lights:' ) ;
    public final void rule__Action__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2091:1: ( ( 'lights:' ) )
            // InternalThymioDSL.g:2092:1: ( 'lights:' )
            {
            // InternalThymioDSL.g:2092:1: ( 'lights:' )
            // InternalThymioDSL.g:2093:2: 'lights:'
            {
             before(grammarAccess.getActionAccess().getLightsKeyword_1_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getLightsKeyword_1_0()); 

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
    // $ANTLR end "rule__Action__Group_1__0__Impl"


    // $ANTLR start "rule__Action__Group_1__1"
    // InternalThymioDSL.g:2102:1: rule__Action__Group_1__1 : rule__Action__Group_1__1__Impl ;
    public final void rule__Action__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2106:1: ( rule__Action__Group_1__1__Impl )
            // InternalThymioDSL.g:2107:2: rule__Action__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_1__1__Impl();

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
    // $ANTLR end "rule__Action__Group_1__1"


    // $ANTLR start "rule__Action__Group_1__1__Impl"
    // InternalThymioDSL.g:2113:1: rule__Action__Group_1__1__Impl : ( ( rule__Action__LightAssignment_1_1 ) ) ;
    public final void rule__Action__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2117:1: ( ( ( rule__Action__LightAssignment_1_1 ) ) )
            // InternalThymioDSL.g:2118:1: ( ( rule__Action__LightAssignment_1_1 ) )
            {
            // InternalThymioDSL.g:2118:1: ( ( rule__Action__LightAssignment_1_1 ) )
            // InternalThymioDSL.g:2119:2: ( rule__Action__LightAssignment_1_1 )
            {
             before(grammarAccess.getActionAccess().getLightAssignment_1_1()); 
            // InternalThymioDSL.g:2120:2: ( rule__Action__LightAssignment_1_1 )
            // InternalThymioDSL.g:2120:3: rule__Action__LightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__LightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getLightAssignment_1_1()); 

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
    // $ANTLR end "rule__Action__Group_1__1__Impl"


    // $ANTLR start "rule__Action__Group_2__0"
    // InternalThymioDSL.g:2129:1: rule__Action__Group_2__0 : rule__Action__Group_2__0__Impl rule__Action__Group_2__1 ;
    public final void rule__Action__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2133:1: ( rule__Action__Group_2__0__Impl rule__Action__Group_2__1 )
            // InternalThymioDSL.g:2134:2: rule__Action__Group_2__0__Impl rule__Action__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__Action__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_2__1();

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
    // $ANTLR end "rule__Action__Group_2__0"


    // $ANTLR start "rule__Action__Group_2__0__Impl"
    // InternalThymioDSL.g:2141:1: rule__Action__Group_2__0__Impl : ( 'sound:' ) ;
    public final void rule__Action__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2145:1: ( ( 'sound:' ) )
            // InternalThymioDSL.g:2146:1: ( 'sound:' )
            {
            // InternalThymioDSL.g:2146:1: ( 'sound:' )
            // InternalThymioDSL.g:2147:2: 'sound:'
            {
             before(grammarAccess.getActionAccess().getSoundKeyword_2_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getSoundKeyword_2_0()); 

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
    // $ANTLR end "rule__Action__Group_2__0__Impl"


    // $ANTLR start "rule__Action__Group_2__1"
    // InternalThymioDSL.g:2156:1: rule__Action__Group_2__1 : rule__Action__Group_2__1__Impl ;
    public final void rule__Action__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2160:1: ( rule__Action__Group_2__1__Impl )
            // InternalThymioDSL.g:2161:2: rule__Action__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_2__1__Impl();

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
    // $ANTLR end "rule__Action__Group_2__1"


    // $ANTLR start "rule__Action__Group_2__1__Impl"
    // InternalThymioDSL.g:2167:1: rule__Action__Group_2__1__Impl : ( ( ( rule__Action__SoundAssignment_2_1 ) ) ( ( rule__Action__SoundAssignment_2_1 )* ) ) ;
    public final void rule__Action__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2171:1: ( ( ( ( rule__Action__SoundAssignment_2_1 ) ) ( ( rule__Action__SoundAssignment_2_1 )* ) ) )
            // InternalThymioDSL.g:2172:1: ( ( ( rule__Action__SoundAssignment_2_1 ) ) ( ( rule__Action__SoundAssignment_2_1 )* ) )
            {
            // InternalThymioDSL.g:2172:1: ( ( ( rule__Action__SoundAssignment_2_1 ) ) ( ( rule__Action__SoundAssignment_2_1 )* ) )
            // InternalThymioDSL.g:2173:2: ( ( rule__Action__SoundAssignment_2_1 ) ) ( ( rule__Action__SoundAssignment_2_1 )* )
            {
            // InternalThymioDSL.g:2173:2: ( ( rule__Action__SoundAssignment_2_1 ) )
            // InternalThymioDSL.g:2174:3: ( rule__Action__SoundAssignment_2_1 )
            {
             before(grammarAccess.getActionAccess().getSoundAssignment_2_1()); 
            // InternalThymioDSL.g:2175:3: ( rule__Action__SoundAssignment_2_1 )
            // InternalThymioDSL.g:2175:4: rule__Action__SoundAssignment_2_1
            {
            pushFollow(FOLLOW_20);
            rule__Action__SoundAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getSoundAssignment_2_1()); 

            }

            // InternalThymioDSL.g:2178:2: ( ( rule__Action__SoundAssignment_2_1 )* )
            // InternalThymioDSL.g:2179:3: ( rule__Action__SoundAssignment_2_1 )*
            {
             before(grammarAccess.getActionAccess().getSoundAssignment_2_1()); 
            // InternalThymioDSL.g:2180:3: ( rule__Action__SoundAssignment_2_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==58) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalThymioDSL.g:2180:4: rule__Action__SoundAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Action__SoundAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getActionAccess().getSoundAssignment_2_1()); 

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
    // $ANTLR end "rule__Action__Group_2__1__Impl"


    // $ANTLR start "rule__Motors__Group__0"
    // InternalThymioDSL.g:2190:1: rule__Motors__Group__0 : rule__Motors__Group__0__Impl rule__Motors__Group__1 ;
    public final void rule__Motors__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2194:1: ( rule__Motors__Group__0__Impl rule__Motors__Group__1 )
            // InternalThymioDSL.g:2195:2: rule__Motors__Group__0__Impl rule__Motors__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Motors__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Motors__Group__1();

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
    // $ANTLR end "rule__Motors__Group__0"


    // $ANTLR start "rule__Motors__Group__0__Impl"
    // InternalThymioDSL.g:2202:1: rule__Motors__Group__0__Impl : ( 'left_motor:' ) ;
    public final void rule__Motors__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2206:1: ( ( 'left_motor:' ) )
            // InternalThymioDSL.g:2207:1: ( 'left_motor:' )
            {
            // InternalThymioDSL.g:2207:1: ( 'left_motor:' )
            // InternalThymioDSL.g:2208:2: 'left_motor:'
            {
             before(grammarAccess.getMotorsAccess().getLeft_motorKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMotorsAccess().getLeft_motorKeyword_0()); 

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
    // $ANTLR end "rule__Motors__Group__0__Impl"


    // $ANTLR start "rule__Motors__Group__1"
    // InternalThymioDSL.g:2217:1: rule__Motors__Group__1 : rule__Motors__Group__1__Impl rule__Motors__Group__2 ;
    public final void rule__Motors__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2221:1: ( rule__Motors__Group__1__Impl rule__Motors__Group__2 )
            // InternalThymioDSL.g:2222:2: rule__Motors__Group__1__Impl rule__Motors__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Motors__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Motors__Group__2();

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
    // $ANTLR end "rule__Motors__Group__1"


    // $ANTLR start "rule__Motors__Group__1__Impl"
    // InternalThymioDSL.g:2229:1: rule__Motors__Group__1__Impl : ( ( rule__Motors__LeftAssignment_1 ) ) ;
    public final void rule__Motors__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2233:1: ( ( ( rule__Motors__LeftAssignment_1 ) ) )
            // InternalThymioDSL.g:2234:1: ( ( rule__Motors__LeftAssignment_1 ) )
            {
            // InternalThymioDSL.g:2234:1: ( ( rule__Motors__LeftAssignment_1 ) )
            // InternalThymioDSL.g:2235:2: ( rule__Motors__LeftAssignment_1 )
            {
             before(grammarAccess.getMotorsAccess().getLeftAssignment_1()); 
            // InternalThymioDSL.g:2236:2: ( rule__Motors__LeftAssignment_1 )
            // InternalThymioDSL.g:2236:3: rule__Motors__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Motors__LeftAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMotorsAccess().getLeftAssignment_1()); 

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
    // $ANTLR end "rule__Motors__Group__1__Impl"


    // $ANTLR start "rule__Motors__Group__2"
    // InternalThymioDSL.g:2244:1: rule__Motors__Group__2 : rule__Motors__Group__2__Impl rule__Motors__Group__3 ;
    public final void rule__Motors__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2248:1: ( rule__Motors__Group__2__Impl rule__Motors__Group__3 )
            // InternalThymioDSL.g:2249:2: rule__Motors__Group__2__Impl rule__Motors__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Motors__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Motors__Group__3();

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
    // $ANTLR end "rule__Motors__Group__2"


    // $ANTLR start "rule__Motors__Group__2__Impl"
    // InternalThymioDSL.g:2256:1: rule__Motors__Group__2__Impl : ( 'right_motor:' ) ;
    public final void rule__Motors__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2260:1: ( ( 'right_motor:' ) )
            // InternalThymioDSL.g:2261:1: ( 'right_motor:' )
            {
            // InternalThymioDSL.g:2261:1: ( 'right_motor:' )
            // InternalThymioDSL.g:2262:2: 'right_motor:'
            {
             before(grammarAccess.getMotorsAccess().getRight_motorKeyword_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMotorsAccess().getRight_motorKeyword_2()); 

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
    // $ANTLR end "rule__Motors__Group__2__Impl"


    // $ANTLR start "rule__Motors__Group__3"
    // InternalThymioDSL.g:2271:1: rule__Motors__Group__3 : rule__Motors__Group__3__Impl ;
    public final void rule__Motors__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2275:1: ( rule__Motors__Group__3__Impl )
            // InternalThymioDSL.g:2276:2: rule__Motors__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Motors__Group__3__Impl();

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
    // $ANTLR end "rule__Motors__Group__3"


    // $ANTLR start "rule__Motors__Group__3__Impl"
    // InternalThymioDSL.g:2282:1: rule__Motors__Group__3__Impl : ( ( rule__Motors__RightAssignment_3 ) ) ;
    public final void rule__Motors__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2286:1: ( ( ( rule__Motors__RightAssignment_3 ) ) )
            // InternalThymioDSL.g:2287:1: ( ( rule__Motors__RightAssignment_3 ) )
            {
            // InternalThymioDSL.g:2287:1: ( ( rule__Motors__RightAssignment_3 ) )
            // InternalThymioDSL.g:2288:2: ( rule__Motors__RightAssignment_3 )
            {
             before(grammarAccess.getMotorsAccess().getRightAssignment_3()); 
            // InternalThymioDSL.g:2289:2: ( rule__Motors__RightAssignment_3 )
            // InternalThymioDSL.g:2289:3: rule__Motors__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Motors__RightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMotorsAccess().getRightAssignment_3()); 

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
    // $ANTLR end "rule__Motors__Group__3__Impl"


    // $ANTLR start "rule__Lights__Group__0"
    // InternalThymioDSL.g:2298:1: rule__Lights__Group__0 : rule__Lights__Group__0__Impl rule__Lights__Group__1 ;
    public final void rule__Lights__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2302:1: ( rule__Lights__Group__0__Impl rule__Lights__Group__1 )
            // InternalThymioDSL.g:2303:2: rule__Lights__Group__0__Impl rule__Lights__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Lights__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lights__Group__1();

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
    // $ANTLR end "rule__Lights__Group__0"


    // $ANTLR start "rule__Lights__Group__0__Impl"
    // InternalThymioDSL.g:2310:1: rule__Lights__Group__0__Impl : ( () ) ;
    public final void rule__Lights__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2314:1: ( ( () ) )
            // InternalThymioDSL.g:2315:1: ( () )
            {
            // InternalThymioDSL.g:2315:1: ( () )
            // InternalThymioDSL.g:2316:2: ()
            {
             before(grammarAccess.getLightsAccess().getLightsAction_0()); 
            // InternalThymioDSL.g:2317:2: ()
            // InternalThymioDSL.g:2317:3: 
            {
            }

             after(grammarAccess.getLightsAccess().getLightsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lights__Group__0__Impl"


    // $ANTLR start "rule__Lights__Group__1"
    // InternalThymioDSL.g:2325:1: rule__Lights__Group__1 : rule__Lights__Group__1__Impl rule__Lights__Group__2 ;
    public final void rule__Lights__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2329:1: ( rule__Lights__Group__1__Impl rule__Lights__Group__2 )
            // InternalThymioDSL.g:2330:2: rule__Lights__Group__1__Impl rule__Lights__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Lights__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lights__Group__2();

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
    // $ANTLR end "rule__Lights__Group__1"


    // $ANTLR start "rule__Lights__Group__1__Impl"
    // InternalThymioDSL.g:2337:1: rule__Lights__Group__1__Impl : ( ( rule__Lights__Group_1__0 ) ) ;
    public final void rule__Lights__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2341:1: ( ( ( rule__Lights__Group_1__0 ) ) )
            // InternalThymioDSL.g:2342:1: ( ( rule__Lights__Group_1__0 ) )
            {
            // InternalThymioDSL.g:2342:1: ( ( rule__Lights__Group_1__0 ) )
            // InternalThymioDSL.g:2343:2: ( rule__Lights__Group_1__0 )
            {
             before(grammarAccess.getLightsAccess().getGroup_1()); 
            // InternalThymioDSL.g:2344:2: ( rule__Lights__Group_1__0 )
            // InternalThymioDSL.g:2344:3: rule__Lights__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Lights__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getLightsAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Lights__Group__1__Impl"


    // $ANTLR start "rule__Lights__Group__2"
    // InternalThymioDSL.g:2352:1: rule__Lights__Group__2 : rule__Lights__Group__2__Impl ;
    public final void rule__Lights__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2356:1: ( rule__Lights__Group__2__Impl )
            // InternalThymioDSL.g:2357:2: rule__Lights__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lights__Group__2__Impl();

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
    // $ANTLR end "rule__Lights__Group__2"


    // $ANTLR start "rule__Lights__Group__2__Impl"
    // InternalThymioDSL.g:2363:1: rule__Lights__Group__2__Impl : ( ( rule__Lights__Group_2__0 ) ) ;
    public final void rule__Lights__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2367:1: ( ( ( rule__Lights__Group_2__0 ) ) )
            // InternalThymioDSL.g:2368:1: ( ( rule__Lights__Group_2__0 ) )
            {
            // InternalThymioDSL.g:2368:1: ( ( rule__Lights__Group_2__0 ) )
            // InternalThymioDSL.g:2369:2: ( rule__Lights__Group_2__0 )
            {
             before(grammarAccess.getLightsAccess().getGroup_2()); 
            // InternalThymioDSL.g:2370:2: ( rule__Lights__Group_2__0 )
            // InternalThymioDSL.g:2370:3: rule__Lights__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Lights__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getLightsAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Lights__Group__2__Impl"


    // $ANTLR start "rule__Lights__Group_1__0"
    // InternalThymioDSL.g:2379:1: rule__Lights__Group_1__0 : rule__Lights__Group_1__0__Impl rule__Lights__Group_1__1 ;
    public final void rule__Lights__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2383:1: ( rule__Lights__Group_1__0__Impl rule__Lights__Group_1__1 )
            // InternalThymioDSL.g:2384:2: rule__Lights__Group_1__0__Impl rule__Lights__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__Lights__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lights__Group_1__1();

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
    // $ANTLR end "rule__Lights__Group_1__0"


    // $ANTLR start "rule__Lights__Group_1__0__Impl"
    // InternalThymioDSL.g:2391:1: rule__Lights__Group_1__0__Impl : ( 'top_light:' ) ;
    public final void rule__Lights__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2395:1: ( ( 'top_light:' ) )
            // InternalThymioDSL.g:2396:1: ( 'top_light:' )
            {
            // InternalThymioDSL.g:2396:1: ( 'top_light:' )
            // InternalThymioDSL.g:2397:2: 'top_light:'
            {
             before(grammarAccess.getLightsAccess().getTop_lightKeyword_1_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getLightsAccess().getTop_lightKeyword_1_0()); 

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
    // $ANTLR end "rule__Lights__Group_1__0__Impl"


    // $ANTLR start "rule__Lights__Group_1__1"
    // InternalThymioDSL.g:2406:1: rule__Lights__Group_1__1 : rule__Lights__Group_1__1__Impl ;
    public final void rule__Lights__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2410:1: ( rule__Lights__Group_1__1__Impl )
            // InternalThymioDSL.g:2411:2: rule__Lights__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lights__Group_1__1__Impl();

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
    // $ANTLR end "rule__Lights__Group_1__1"


    // $ANTLR start "rule__Lights__Group_1__1__Impl"
    // InternalThymioDSL.g:2417:1: rule__Lights__Group_1__1__Impl : ( ( rule__Lights__Alternatives_1_1 ) ) ;
    public final void rule__Lights__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2421:1: ( ( ( rule__Lights__Alternatives_1_1 ) ) )
            // InternalThymioDSL.g:2422:1: ( ( rule__Lights__Alternatives_1_1 ) )
            {
            // InternalThymioDSL.g:2422:1: ( ( rule__Lights__Alternatives_1_1 ) )
            // InternalThymioDSL.g:2423:2: ( rule__Lights__Alternatives_1_1 )
            {
             before(grammarAccess.getLightsAccess().getAlternatives_1_1()); 
            // InternalThymioDSL.g:2424:2: ( rule__Lights__Alternatives_1_1 )
            // InternalThymioDSL.g:2424:3: rule__Lights__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Lights__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLightsAccess().getAlternatives_1_1()); 

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
    // $ANTLR end "rule__Lights__Group_1__1__Impl"


    // $ANTLR start "rule__Lights__Group_1_1_0__0"
    // InternalThymioDSL.g:2433:1: rule__Lights__Group_1_1_0__0 : rule__Lights__Group_1_1_0__0__Impl rule__Lights__Group_1_1_0__1 ;
    public final void rule__Lights__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2437:1: ( rule__Lights__Group_1_1_0__0__Impl rule__Lights__Group_1_1_0__1 )
            // InternalThymioDSL.g:2438:2: rule__Lights__Group_1_1_0__0__Impl rule__Lights__Group_1_1_0__1
            {
            pushFollow(FOLLOW_25);
            rule__Lights__Group_1_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lights__Group_1_1_0__1();

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
    // $ANTLR end "rule__Lights__Group_1_1_0__0"


    // $ANTLR start "rule__Lights__Group_1_1_0__0__Impl"
    // InternalThymioDSL.g:2445:1: rule__Lights__Group_1_1_0__0__Impl : ( 'on' ) ;
    public final void rule__Lights__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2449:1: ( ( 'on' ) )
            // InternalThymioDSL.g:2450:1: ( 'on' )
            {
            // InternalThymioDSL.g:2450:1: ( 'on' )
            // InternalThymioDSL.g:2451:2: 'on'
            {
             before(grammarAccess.getLightsAccess().getOnKeyword_1_1_0_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getLightsAccess().getOnKeyword_1_1_0_0()); 

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
    // $ANTLR end "rule__Lights__Group_1_1_0__0__Impl"


    // $ANTLR start "rule__Lights__Group_1_1_0__1"
    // InternalThymioDSL.g:2460:1: rule__Lights__Group_1_1_0__1 : rule__Lights__Group_1_1_0__1__Impl ;
    public final void rule__Lights__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2464:1: ( rule__Lights__Group_1_1_0__1__Impl )
            // InternalThymioDSL.g:2465:2: rule__Lights__Group_1_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lights__Group_1_1_0__1__Impl();

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
    // $ANTLR end "rule__Lights__Group_1_1_0__1"


    // $ANTLR start "rule__Lights__Group_1_1_0__1__Impl"
    // InternalThymioDSL.g:2471:1: rule__Lights__Group_1_1_0__1__Impl : ( ( rule__Lights__TopLightAssignment_1_1_0_1 ) ) ;
    public final void rule__Lights__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2475:1: ( ( ( rule__Lights__TopLightAssignment_1_1_0_1 ) ) )
            // InternalThymioDSL.g:2476:1: ( ( rule__Lights__TopLightAssignment_1_1_0_1 ) )
            {
            // InternalThymioDSL.g:2476:1: ( ( rule__Lights__TopLightAssignment_1_1_0_1 ) )
            // InternalThymioDSL.g:2477:2: ( rule__Lights__TopLightAssignment_1_1_0_1 )
            {
             before(grammarAccess.getLightsAccess().getTopLightAssignment_1_1_0_1()); 
            // InternalThymioDSL.g:2478:2: ( rule__Lights__TopLightAssignment_1_1_0_1 )
            // InternalThymioDSL.g:2478:3: rule__Lights__TopLightAssignment_1_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Lights__TopLightAssignment_1_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getLightsAccess().getTopLightAssignment_1_1_0_1()); 

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
    // $ANTLR end "rule__Lights__Group_1_1_0__1__Impl"


    // $ANTLR start "rule__Lights__Group_2__0"
    // InternalThymioDSL.g:2487:1: rule__Lights__Group_2__0 : rule__Lights__Group_2__0__Impl rule__Lights__Group_2__1 ;
    public final void rule__Lights__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2491:1: ( rule__Lights__Group_2__0__Impl rule__Lights__Group_2__1 )
            // InternalThymioDSL.g:2492:2: rule__Lights__Group_2__0__Impl rule__Lights__Group_2__1
            {
            pushFollow(FOLLOW_24);
            rule__Lights__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lights__Group_2__1();

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
    // $ANTLR end "rule__Lights__Group_2__0"


    // $ANTLR start "rule__Lights__Group_2__0__Impl"
    // InternalThymioDSL.g:2499:1: rule__Lights__Group_2__0__Impl : ( 'bottom_light:' ) ;
    public final void rule__Lights__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2503:1: ( ( 'bottom_light:' ) )
            // InternalThymioDSL.g:2504:1: ( 'bottom_light:' )
            {
            // InternalThymioDSL.g:2504:1: ( 'bottom_light:' )
            // InternalThymioDSL.g:2505:2: 'bottom_light:'
            {
             before(grammarAccess.getLightsAccess().getBottom_lightKeyword_2_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getLightsAccess().getBottom_lightKeyword_2_0()); 

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
    // $ANTLR end "rule__Lights__Group_2__0__Impl"


    // $ANTLR start "rule__Lights__Group_2__1"
    // InternalThymioDSL.g:2514:1: rule__Lights__Group_2__1 : rule__Lights__Group_2__1__Impl ;
    public final void rule__Lights__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2518:1: ( rule__Lights__Group_2__1__Impl )
            // InternalThymioDSL.g:2519:2: rule__Lights__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lights__Group_2__1__Impl();

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
    // $ANTLR end "rule__Lights__Group_2__1"


    // $ANTLR start "rule__Lights__Group_2__1__Impl"
    // InternalThymioDSL.g:2525:1: rule__Lights__Group_2__1__Impl : ( ( rule__Lights__Alternatives_2_1 ) ) ;
    public final void rule__Lights__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2529:1: ( ( ( rule__Lights__Alternatives_2_1 ) ) )
            // InternalThymioDSL.g:2530:1: ( ( rule__Lights__Alternatives_2_1 ) )
            {
            // InternalThymioDSL.g:2530:1: ( ( rule__Lights__Alternatives_2_1 ) )
            // InternalThymioDSL.g:2531:2: ( rule__Lights__Alternatives_2_1 )
            {
             before(grammarAccess.getLightsAccess().getAlternatives_2_1()); 
            // InternalThymioDSL.g:2532:2: ( rule__Lights__Alternatives_2_1 )
            // InternalThymioDSL.g:2532:3: rule__Lights__Alternatives_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Lights__Alternatives_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLightsAccess().getAlternatives_2_1()); 

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
    // $ANTLR end "rule__Lights__Group_2__1__Impl"


    // $ANTLR start "rule__Lights__Group_2_1_0__0"
    // InternalThymioDSL.g:2541:1: rule__Lights__Group_2_1_0__0 : rule__Lights__Group_2_1_0__0__Impl rule__Lights__Group_2_1_0__1 ;
    public final void rule__Lights__Group_2_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2545:1: ( rule__Lights__Group_2_1_0__0__Impl rule__Lights__Group_2_1_0__1 )
            // InternalThymioDSL.g:2546:2: rule__Lights__Group_2_1_0__0__Impl rule__Lights__Group_2_1_0__1
            {
            pushFollow(FOLLOW_25);
            rule__Lights__Group_2_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lights__Group_2_1_0__1();

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
    // $ANTLR end "rule__Lights__Group_2_1_0__0"


    // $ANTLR start "rule__Lights__Group_2_1_0__0__Impl"
    // InternalThymioDSL.g:2553:1: rule__Lights__Group_2_1_0__0__Impl : ( 'on' ) ;
    public final void rule__Lights__Group_2_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2557:1: ( ( 'on' ) )
            // InternalThymioDSL.g:2558:1: ( 'on' )
            {
            // InternalThymioDSL.g:2558:1: ( 'on' )
            // InternalThymioDSL.g:2559:2: 'on'
            {
             before(grammarAccess.getLightsAccess().getOnKeyword_2_1_0_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getLightsAccess().getOnKeyword_2_1_0_0()); 

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
    // $ANTLR end "rule__Lights__Group_2_1_0__0__Impl"


    // $ANTLR start "rule__Lights__Group_2_1_0__1"
    // InternalThymioDSL.g:2568:1: rule__Lights__Group_2_1_0__1 : rule__Lights__Group_2_1_0__1__Impl ;
    public final void rule__Lights__Group_2_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2572:1: ( rule__Lights__Group_2_1_0__1__Impl )
            // InternalThymioDSL.g:2573:2: rule__Lights__Group_2_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lights__Group_2_1_0__1__Impl();

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
    // $ANTLR end "rule__Lights__Group_2_1_0__1"


    // $ANTLR start "rule__Lights__Group_2_1_0__1__Impl"
    // InternalThymioDSL.g:2579:1: rule__Lights__Group_2_1_0__1__Impl : ( ( rule__Lights__BottomLightAssignment_2_1_0_1 ) ) ;
    public final void rule__Lights__Group_2_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2583:1: ( ( ( rule__Lights__BottomLightAssignment_2_1_0_1 ) ) )
            // InternalThymioDSL.g:2584:1: ( ( rule__Lights__BottomLightAssignment_2_1_0_1 ) )
            {
            // InternalThymioDSL.g:2584:1: ( ( rule__Lights__BottomLightAssignment_2_1_0_1 ) )
            // InternalThymioDSL.g:2585:2: ( rule__Lights__BottomLightAssignment_2_1_0_1 )
            {
             before(grammarAccess.getLightsAccess().getBottomLightAssignment_2_1_0_1()); 
            // InternalThymioDSL.g:2586:2: ( rule__Lights__BottomLightAssignment_2_1_0_1 )
            // InternalThymioDSL.g:2586:3: rule__Lights__BottomLightAssignment_2_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Lights__BottomLightAssignment_2_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getLightsAccess().getBottomLightAssignment_2_1_0_1()); 

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
    // $ANTLR end "rule__Lights__Group_2_1_0__1__Impl"


    // $ANTLR start "rule__RGB__Group__0"
    // InternalThymioDSL.g:2595:1: rule__RGB__Group__0 : rule__RGB__Group__0__Impl rule__RGB__Group__1 ;
    public final void rule__RGB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2599:1: ( rule__RGB__Group__0__Impl rule__RGB__Group__1 )
            // InternalThymioDSL.g:2600:2: rule__RGB__Group__0__Impl rule__RGB__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__RGB__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RGB__Group__1();

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
    // $ANTLR end "rule__RGB__Group__0"


    // $ANTLR start "rule__RGB__Group__0__Impl"
    // InternalThymioDSL.g:2607:1: rule__RGB__Group__0__Impl : ( '(' ) ;
    public final void rule__RGB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2611:1: ( ( '(' ) )
            // InternalThymioDSL.g:2612:1: ( '(' )
            {
            // InternalThymioDSL.g:2612:1: ( '(' )
            // InternalThymioDSL.g:2613:2: '('
            {
             before(grammarAccess.getRGBAccess().getLeftParenthesisKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getRGBAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__RGB__Group__0__Impl"


    // $ANTLR start "rule__RGB__Group__1"
    // InternalThymioDSL.g:2622:1: rule__RGB__Group__1 : rule__RGB__Group__1__Impl rule__RGB__Group__2 ;
    public final void rule__RGB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2626:1: ( rule__RGB__Group__1__Impl rule__RGB__Group__2 )
            // InternalThymioDSL.g:2627:2: rule__RGB__Group__1__Impl rule__RGB__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__RGB__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RGB__Group__2();

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
    // $ANTLR end "rule__RGB__Group__1"


    // $ANTLR start "rule__RGB__Group__1__Impl"
    // InternalThymioDSL.g:2634:1: rule__RGB__Group__1__Impl : ( ( rule__RGB__RedAssignment_1 ) ) ;
    public final void rule__RGB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2638:1: ( ( ( rule__RGB__RedAssignment_1 ) ) )
            // InternalThymioDSL.g:2639:1: ( ( rule__RGB__RedAssignment_1 ) )
            {
            // InternalThymioDSL.g:2639:1: ( ( rule__RGB__RedAssignment_1 ) )
            // InternalThymioDSL.g:2640:2: ( rule__RGB__RedAssignment_1 )
            {
             before(grammarAccess.getRGBAccess().getRedAssignment_1()); 
            // InternalThymioDSL.g:2641:2: ( rule__RGB__RedAssignment_1 )
            // InternalThymioDSL.g:2641:3: rule__RGB__RedAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RGB__RedAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRGBAccess().getRedAssignment_1()); 

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
    // $ANTLR end "rule__RGB__Group__1__Impl"


    // $ANTLR start "rule__RGB__Group__2"
    // InternalThymioDSL.g:2649:1: rule__RGB__Group__2 : rule__RGB__Group__2__Impl rule__RGB__Group__3 ;
    public final void rule__RGB__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2653:1: ( rule__RGB__Group__2__Impl rule__RGB__Group__3 )
            // InternalThymioDSL.g:2654:2: rule__RGB__Group__2__Impl rule__RGB__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__RGB__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RGB__Group__3();

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
    // $ANTLR end "rule__RGB__Group__2"


    // $ANTLR start "rule__RGB__Group__2__Impl"
    // InternalThymioDSL.g:2661:1: rule__RGB__Group__2__Impl : ( ',' ) ;
    public final void rule__RGB__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2665:1: ( ( ',' ) )
            // InternalThymioDSL.g:2666:1: ( ',' )
            {
            // InternalThymioDSL.g:2666:1: ( ',' )
            // InternalThymioDSL.g:2667:2: ','
            {
             before(grammarAccess.getRGBAccess().getCommaKeyword_2()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getRGBAccess().getCommaKeyword_2()); 

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
    // $ANTLR end "rule__RGB__Group__2__Impl"


    // $ANTLR start "rule__RGB__Group__3"
    // InternalThymioDSL.g:2676:1: rule__RGB__Group__3 : rule__RGB__Group__3__Impl rule__RGB__Group__4 ;
    public final void rule__RGB__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2680:1: ( rule__RGB__Group__3__Impl rule__RGB__Group__4 )
            // InternalThymioDSL.g:2681:2: rule__RGB__Group__3__Impl rule__RGB__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__RGB__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RGB__Group__4();

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
    // $ANTLR end "rule__RGB__Group__3"


    // $ANTLR start "rule__RGB__Group__3__Impl"
    // InternalThymioDSL.g:2688:1: rule__RGB__Group__3__Impl : ( ( rule__RGB__GreenAssignment_3 ) ) ;
    public final void rule__RGB__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2692:1: ( ( ( rule__RGB__GreenAssignment_3 ) ) )
            // InternalThymioDSL.g:2693:1: ( ( rule__RGB__GreenAssignment_3 ) )
            {
            // InternalThymioDSL.g:2693:1: ( ( rule__RGB__GreenAssignment_3 ) )
            // InternalThymioDSL.g:2694:2: ( rule__RGB__GreenAssignment_3 )
            {
             before(grammarAccess.getRGBAccess().getGreenAssignment_3()); 
            // InternalThymioDSL.g:2695:2: ( rule__RGB__GreenAssignment_3 )
            // InternalThymioDSL.g:2695:3: rule__RGB__GreenAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RGB__GreenAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRGBAccess().getGreenAssignment_3()); 

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
    // $ANTLR end "rule__RGB__Group__3__Impl"


    // $ANTLR start "rule__RGB__Group__4"
    // InternalThymioDSL.g:2703:1: rule__RGB__Group__4 : rule__RGB__Group__4__Impl rule__RGB__Group__5 ;
    public final void rule__RGB__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2707:1: ( rule__RGB__Group__4__Impl rule__RGB__Group__5 )
            // InternalThymioDSL.g:2708:2: rule__RGB__Group__4__Impl rule__RGB__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__RGB__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RGB__Group__5();

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
    // $ANTLR end "rule__RGB__Group__4"


    // $ANTLR start "rule__RGB__Group__4__Impl"
    // InternalThymioDSL.g:2715:1: rule__RGB__Group__4__Impl : ( ',' ) ;
    public final void rule__RGB__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2719:1: ( ( ',' ) )
            // InternalThymioDSL.g:2720:1: ( ',' )
            {
            // InternalThymioDSL.g:2720:1: ( ',' )
            // InternalThymioDSL.g:2721:2: ','
            {
             before(grammarAccess.getRGBAccess().getCommaKeyword_4()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getRGBAccess().getCommaKeyword_4()); 

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
    // $ANTLR end "rule__RGB__Group__4__Impl"


    // $ANTLR start "rule__RGB__Group__5"
    // InternalThymioDSL.g:2730:1: rule__RGB__Group__5 : rule__RGB__Group__5__Impl rule__RGB__Group__6 ;
    public final void rule__RGB__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2734:1: ( rule__RGB__Group__5__Impl rule__RGB__Group__6 )
            // InternalThymioDSL.g:2735:2: rule__RGB__Group__5__Impl rule__RGB__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__RGB__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RGB__Group__6();

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
    // $ANTLR end "rule__RGB__Group__5"


    // $ANTLR start "rule__RGB__Group__5__Impl"
    // InternalThymioDSL.g:2742:1: rule__RGB__Group__5__Impl : ( ( rule__RGB__BlueAssignment_5 ) ) ;
    public final void rule__RGB__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2746:1: ( ( ( rule__RGB__BlueAssignment_5 ) ) )
            // InternalThymioDSL.g:2747:1: ( ( rule__RGB__BlueAssignment_5 ) )
            {
            // InternalThymioDSL.g:2747:1: ( ( rule__RGB__BlueAssignment_5 ) )
            // InternalThymioDSL.g:2748:2: ( rule__RGB__BlueAssignment_5 )
            {
             before(grammarAccess.getRGBAccess().getBlueAssignment_5()); 
            // InternalThymioDSL.g:2749:2: ( rule__RGB__BlueAssignment_5 )
            // InternalThymioDSL.g:2749:3: rule__RGB__BlueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RGB__BlueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRGBAccess().getBlueAssignment_5()); 

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
    // $ANTLR end "rule__RGB__Group__5__Impl"


    // $ANTLR start "rule__RGB__Group__6"
    // InternalThymioDSL.g:2757:1: rule__RGB__Group__6 : rule__RGB__Group__6__Impl ;
    public final void rule__RGB__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2761:1: ( rule__RGB__Group__6__Impl )
            // InternalThymioDSL.g:2762:2: rule__RGB__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RGB__Group__6__Impl();

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
    // $ANTLR end "rule__RGB__Group__6"


    // $ANTLR start "rule__RGB__Group__6__Impl"
    // InternalThymioDSL.g:2768:1: rule__RGB__Group__6__Impl : ( ')' ) ;
    public final void rule__RGB__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2772:1: ( ( ')' ) )
            // InternalThymioDSL.g:2773:1: ( ')' )
            {
            // InternalThymioDSL.g:2773:1: ( ')' )
            // InternalThymioDSL.g:2774:2: ')'
            {
             before(grammarAccess.getRGBAccess().getRightParenthesisKeyword_6()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getRGBAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__RGB__Group__6__Impl"


    // $ANTLR start "rule__Sound__Group__0"
    // InternalThymioDSL.g:2784:1: rule__Sound__Group__0 : rule__Sound__Group__0__Impl rule__Sound__Group__1 ;
    public final void rule__Sound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2788:1: ( rule__Sound__Group__0__Impl rule__Sound__Group__1 )
            // InternalThymioDSL.g:2789:2: rule__Sound__Group__0__Impl rule__Sound__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Sound__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sound__Group__1();

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
    // $ANTLR end "rule__Sound__Group__0"


    // $ANTLR start "rule__Sound__Group__0__Impl"
    // InternalThymioDSL.g:2796:1: rule__Sound__Group__0__Impl : ( 'note:' ) ;
    public final void rule__Sound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2800:1: ( ( 'note:' ) )
            // InternalThymioDSL.g:2801:1: ( 'note:' )
            {
            // InternalThymioDSL.g:2801:1: ( 'note:' )
            // InternalThymioDSL.g:2802:2: 'note:'
            {
             before(grammarAccess.getSoundAccess().getNoteKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getSoundAccess().getNoteKeyword_0()); 

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
    // $ANTLR end "rule__Sound__Group__0__Impl"


    // $ANTLR start "rule__Sound__Group__1"
    // InternalThymioDSL.g:2811:1: rule__Sound__Group__1 : rule__Sound__Group__1__Impl rule__Sound__Group__2 ;
    public final void rule__Sound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2815:1: ( rule__Sound__Group__1__Impl rule__Sound__Group__2 )
            // InternalThymioDSL.g:2816:2: rule__Sound__Group__1__Impl rule__Sound__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Sound__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sound__Group__2();

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
    // $ANTLR end "rule__Sound__Group__1"


    // $ANTLR start "rule__Sound__Group__1__Impl"
    // InternalThymioDSL.g:2823:1: rule__Sound__Group__1__Impl : ( ( rule__Sound__PitchAssignment_1 ) ) ;
    public final void rule__Sound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2827:1: ( ( ( rule__Sound__PitchAssignment_1 ) ) )
            // InternalThymioDSL.g:2828:1: ( ( rule__Sound__PitchAssignment_1 ) )
            {
            // InternalThymioDSL.g:2828:1: ( ( rule__Sound__PitchAssignment_1 ) )
            // InternalThymioDSL.g:2829:2: ( rule__Sound__PitchAssignment_1 )
            {
             before(grammarAccess.getSoundAccess().getPitchAssignment_1()); 
            // InternalThymioDSL.g:2830:2: ( rule__Sound__PitchAssignment_1 )
            // InternalThymioDSL.g:2830:3: rule__Sound__PitchAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sound__PitchAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSoundAccess().getPitchAssignment_1()); 

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
    // $ANTLR end "rule__Sound__Group__1__Impl"


    // $ANTLR start "rule__Sound__Group__2"
    // InternalThymioDSL.g:2838:1: rule__Sound__Group__2 : rule__Sound__Group__2__Impl ;
    public final void rule__Sound__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2842:1: ( rule__Sound__Group__2__Impl )
            // InternalThymioDSL.g:2843:2: rule__Sound__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sound__Group__2__Impl();

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
    // $ANTLR end "rule__Sound__Group__2"


    // $ANTLR start "rule__Sound__Group__2__Impl"
    // InternalThymioDSL.g:2849:1: rule__Sound__Group__2__Impl : ( ( rule__Sound__DurationAssignment_2 ) ) ;
    public final void rule__Sound__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2853:1: ( ( ( rule__Sound__DurationAssignment_2 ) ) )
            // InternalThymioDSL.g:2854:1: ( ( rule__Sound__DurationAssignment_2 ) )
            {
            // InternalThymioDSL.g:2854:1: ( ( rule__Sound__DurationAssignment_2 ) )
            // InternalThymioDSL.g:2855:2: ( rule__Sound__DurationAssignment_2 )
            {
             before(grammarAccess.getSoundAccess().getDurationAssignment_2()); 
            // InternalThymioDSL.g:2856:2: ( rule__Sound__DurationAssignment_2 )
            // InternalThymioDSL.g:2856:3: rule__Sound__DurationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Sound__DurationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSoundAccess().getDurationAssignment_2()); 

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
    // $ANTLR end "rule__Sound__Group__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalThymioDSL.g:2865:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2869:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalThymioDSL.g:2870:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalThymioDSL.g:2877:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2881:1: ( ( ( '-' )? ) )
            // InternalThymioDSL.g:2882:1: ( ( '-' )? )
            {
            // InternalThymioDSL.g:2882:1: ( ( '-' )? )
            // InternalThymioDSL.g:2883:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalThymioDSL.g:2884:2: ( '-' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalThymioDSL.g:2884:3: '-'
                    {
                    match(input,28,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalThymioDSL.g:2892:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2896:1: ( rule__EInt__Group__1__Impl )
            // InternalThymioDSL.g:2897:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalThymioDSL.g:2903:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2907:1: ( ( RULE_INT ) )
            // InternalThymioDSL.g:2908:1: ( RULE_INT )
            {
            // InternalThymioDSL.g:2908:1: ( RULE_INT )
            // InternalThymioDSL.g:2909:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // InternalThymioDSL.g:2919:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2923:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalThymioDSL.g:2924:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Addition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group__1();

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
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // InternalThymioDSL.g:2931:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2935:1: ( ( ruleMultiplication ) )
            // InternalThymioDSL.g:2936:1: ( ruleMultiplication )
            {
            // InternalThymioDSL.g:2936:1: ( ruleMultiplication )
            // InternalThymioDSL.g:2937:2: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 

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
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // InternalThymioDSL.g:2946:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2950:1: ( rule__Addition__Group__1__Impl )
            // InternalThymioDSL.g:2951:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1__Impl();

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
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // InternalThymioDSL.g:2957:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2961:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalThymioDSL.g:2962:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalThymioDSL.g:2962:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalThymioDSL.g:2963:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalThymioDSL.g:2964:2: ( rule__Addition__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=27 && LA25_0<=28)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalThymioDSL.g:2964:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getAdditionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // InternalThymioDSL.g:2973:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2977:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalThymioDSL.g:2978:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__1();

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
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // InternalThymioDSL.g:2985:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2989:1: ( ( () ) )
            // InternalThymioDSL.g:2990:1: ( () )
            {
            // InternalThymioDSL.g:2990:1: ( () )
            // InternalThymioDSL.g:2991:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // InternalThymioDSL.g:2992:2: ()
            // InternalThymioDSL.g:2992:3: 
            {
            }

             after(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // InternalThymioDSL.g:3000:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3004:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalThymioDSL.g:3005:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_21);
            rule__Addition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__2();

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
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // InternalThymioDSL.g:3012:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__OperatorAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3016:1: ( ( ( rule__Addition__OperatorAssignment_1_1 ) ) )
            // InternalThymioDSL.g:3017:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            {
            // InternalThymioDSL.g:3017:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            // InternalThymioDSL.g:3018:2: ( rule__Addition__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 
            // InternalThymioDSL.g:3019:2: ( rule__Addition__OperatorAssignment_1_1 )
            // InternalThymioDSL.g:3019:3: rule__Addition__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Addition__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__2"
    // InternalThymioDSL.g:3027:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3031:1: ( rule__Addition__Group_1__2__Impl )
            // InternalThymioDSL.g:3032:2: rule__Addition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__2__Impl();

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
    // $ANTLR end "rule__Addition__Group_1__2"


    // $ANTLR start "rule__Addition__Group_1__2__Impl"
    // InternalThymioDSL.g:3038:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3042:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalThymioDSL.g:3043:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalThymioDSL.g:3043:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalThymioDSL.g:3044:2: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // InternalThymioDSL.g:3045:2: ( rule__Addition__RightAssignment_1_2 )
            // InternalThymioDSL.g:3045:3: rule__Addition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Addition__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Addition__Group_1__2__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // InternalThymioDSL.g:3054:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3058:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalThymioDSL.g:3059:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1();

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
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // InternalThymioDSL.g:3066:1: rule__Multiplication__Group__0__Impl : ( ruleNumber ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3070:1: ( ( ruleNumber ) )
            // InternalThymioDSL.g:3071:1: ( ruleNumber )
            {
            // InternalThymioDSL.g:3071:1: ( ruleNumber )
            // InternalThymioDSL.g:3072:2: ruleNumber
            {
             before(grammarAccess.getMultiplicationAccess().getNumberParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getNumberParserRuleCall_0()); 

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
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // InternalThymioDSL.g:3081:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3085:1: ( rule__Multiplication__Group__1__Impl )
            // InternalThymioDSL.g:3086:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1__Impl();

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
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // InternalThymioDSL.g:3092:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3096:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalThymioDSL.g:3097:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalThymioDSL.g:3097:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalThymioDSL.g:3098:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalThymioDSL.g:3099:2: ( rule__Multiplication__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=29 && LA26_0<=30)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalThymioDSL.g:3099:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getMultiplicationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // InternalThymioDSL.g:3108:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3112:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalThymioDSL.g:3113:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_32);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1();

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
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // InternalThymioDSL.g:3120:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3124:1: ( ( () ) )
            // InternalThymioDSL.g:3125:1: ( () )
            {
            // InternalThymioDSL.g:3125:1: ( () )
            // InternalThymioDSL.g:3126:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // InternalThymioDSL.g:3127:2: ()
            // InternalThymioDSL.g:3127:3: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // InternalThymioDSL.g:3135:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3139:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalThymioDSL.g:3140:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_21);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2();

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
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // InternalThymioDSL.g:3147:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3151:1: ( ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) )
            // InternalThymioDSL.g:3152:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            {
            // InternalThymioDSL.g:3152:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            // InternalThymioDSL.g:3153:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 
            // InternalThymioDSL.g:3154:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            // InternalThymioDSL.g:3154:3: rule__Multiplication__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__2"
    // InternalThymioDSL.g:3162:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3166:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalThymioDSL.g:3167:2: rule__Multiplication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2__Impl();

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
    // $ANTLR end "rule__Multiplication__Group_1__2"


    // $ANTLR start "rule__Multiplication__Group_1__2__Impl"
    // InternalThymioDSL.g:3173:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3177:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalThymioDSL.g:3178:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalThymioDSL.g:3178:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalThymioDSL.g:3179:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalThymioDSL.g:3180:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalThymioDSL.g:3180:3: rule__Multiplication__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Multiplication__Group_1__2__Impl"


    // $ANTLR start "rule__Number__Group_1__0"
    // InternalThymioDSL.g:3189:1: rule__Number__Group_1__0 : rule__Number__Group_1__0__Impl rule__Number__Group_1__1 ;
    public final void rule__Number__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3193:1: ( rule__Number__Group_1__0__Impl rule__Number__Group_1__1 )
            // InternalThymioDSL.g:3194:2: rule__Number__Group_1__0__Impl rule__Number__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__Number__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group_1__1();

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
    // $ANTLR end "rule__Number__Group_1__0"


    // $ANTLR start "rule__Number__Group_1__0__Impl"
    // InternalThymioDSL.g:3201:1: rule__Number__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Number__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3205:1: ( ( '(' ) )
            // InternalThymioDSL.g:3206:1: ( '(' )
            {
            // InternalThymioDSL.g:3206:1: ( '(' )
            // InternalThymioDSL.g:3207:2: '('
            {
             before(grammarAccess.getNumberAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__Number__Group_1__0__Impl"


    // $ANTLR start "rule__Number__Group_1__1"
    // InternalThymioDSL.g:3216:1: rule__Number__Group_1__1 : rule__Number__Group_1__1__Impl rule__Number__Group_1__2 ;
    public final void rule__Number__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3220:1: ( rule__Number__Group_1__1__Impl rule__Number__Group_1__2 )
            // InternalThymioDSL.g:3221:2: rule__Number__Group_1__1__Impl rule__Number__Group_1__2
            {
            pushFollow(FOLLOW_27);
            rule__Number__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group_1__2();

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
    // $ANTLR end "rule__Number__Group_1__1"


    // $ANTLR start "rule__Number__Group_1__1__Impl"
    // InternalThymioDSL.g:3228:1: rule__Number__Group_1__1__Impl : ( ruleAddition ) ;
    public final void rule__Number__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3232:1: ( ( ruleAddition ) )
            // InternalThymioDSL.g:3233:1: ( ruleAddition )
            {
            // InternalThymioDSL.g:3233:1: ( ruleAddition )
            // InternalThymioDSL.g:3234:2: ruleAddition
            {
             before(grammarAccess.getNumberAccess().getAdditionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getNumberAccess().getAdditionParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__Number__Group_1__1__Impl"


    // $ANTLR start "rule__Number__Group_1__2"
    // InternalThymioDSL.g:3243:1: rule__Number__Group_1__2 : rule__Number__Group_1__2__Impl ;
    public final void rule__Number__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3247:1: ( rule__Number__Group_1__2__Impl )
            // InternalThymioDSL.g:3248:2: rule__Number__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group_1__2__Impl();

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
    // $ANTLR end "rule__Number__Group_1__2"


    // $ANTLR start "rule__Number__Group_1__2__Impl"
    // InternalThymioDSL.g:3254:1: rule__Number__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Number__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3258:1: ( ( ')' ) )
            // InternalThymioDSL.g:3259:1: ( ')' )
            {
            // InternalThymioDSL.g:3259:1: ( ')' )
            // InternalThymioDSL.g:3260:2: ')'
            {
             before(grammarAccess.getNumberAccess().getRightParenthesisKeyword_1_2()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getRightParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__Number__Group_1__2__Impl"


    // $ANTLR start "rule__Model__ProceduresAssignment"
    // InternalThymioDSL.g:3270:1: rule__Model__ProceduresAssignment : ( ruleProcedure ) ;
    public final void rule__Model__ProceduresAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3274:1: ( ( ruleProcedure ) )
            // InternalThymioDSL.g:3275:2: ( ruleProcedure )
            {
            // InternalThymioDSL.g:3275:2: ( ruleProcedure )
            // InternalThymioDSL.g:3276:3: ruleProcedure
            {
             before(grammarAccess.getModelAccess().getProceduresProcedureParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleProcedure();

            state._fsp--;

             after(grammarAccess.getModelAccess().getProceduresProcedureParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__ProceduresAssignment"


    // $ANTLR start "rule__Procedure__NameAssignment_1"
    // InternalThymioDSL.g:3285:1: rule__Procedure__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Procedure__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3289:1: ( ( ruleEString ) )
            // InternalThymioDSL.g:3290:2: ( ruleEString )
            {
            // InternalThymioDSL.g:3290:2: ( ruleEString )
            // InternalThymioDSL.g:3291:3: ruleEString
            {
             before(grammarAccess.getProcedureAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProcedureAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Procedure__NameAssignment_1"


    // $ANTLR start "rule__Procedure__EventsAssignment_3"
    // InternalThymioDSL.g:3300:1: rule__Procedure__EventsAssignment_3 : ( ruleEvent ) ;
    public final void rule__Procedure__EventsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3304:1: ( ( ruleEvent ) )
            // InternalThymioDSL.g:3305:2: ( ruleEvent )
            {
            // InternalThymioDSL.g:3305:2: ( ruleEvent )
            // InternalThymioDSL.g:3306:3: ruleEvent
            {
             before(grammarAccess.getProcedureAccess().getEventsEventParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getProcedureAccess().getEventsEventParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Procedure__EventsAssignment_3"


    // $ANTLR start "rule__Procedure__ActionsAssignment_5"
    // InternalThymioDSL.g:3315:1: rule__Procedure__ActionsAssignment_5 : ( ruleAction ) ;
    public final void rule__Procedure__ActionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3319:1: ( ( ruleAction ) )
            // InternalThymioDSL.g:3320:2: ( ruleAction )
            {
            // InternalThymioDSL.g:3320:2: ( ruleAction )
            // InternalThymioDSL.g:3321:3: ruleAction
            {
             before(grammarAccess.getProcedureAccess().getActionsActionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getProcedureAccess().getActionsActionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Procedure__ActionsAssignment_5"


    // $ANTLR start "rule__Event__ButtonAssignment_0_1"
    // InternalThymioDSL.g:3330:1: rule__Event__ButtonAssignment_0_1 : ( ruleOrtogonal ) ;
    public final void rule__Event__ButtonAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3334:1: ( ( ruleOrtogonal ) )
            // InternalThymioDSL.g:3335:2: ( ruleOrtogonal )
            {
            // InternalThymioDSL.g:3335:2: ( ruleOrtogonal )
            // InternalThymioDSL.g:3336:3: ruleOrtogonal
            {
             before(grammarAccess.getEventAccess().getButtonOrtogonalParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrtogonal();

            state._fsp--;

             after(grammarAccess.getEventAccess().getButtonOrtogonalParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Event__ButtonAssignment_0_1"


    // $ANTLR start "rule__Event__StimulusAssignment_1_1"
    // InternalThymioDSL.g:3345:1: rule__Event__StimulusAssignment_1_1 : ( ruleStimulus ) ;
    public final void rule__Event__StimulusAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3349:1: ( ( ruleStimulus ) )
            // InternalThymioDSL.g:3350:2: ( ruleStimulus )
            {
            // InternalThymioDSL.g:3350:2: ( ruleStimulus )
            // InternalThymioDSL.g:3351:3: ruleStimulus
            {
             before(grammarAccess.getEventAccess().getStimulusStimulusParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStimulus();

            state._fsp--;

             after(grammarAccess.getEventAccess().getStimulusStimulusParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Event__StimulusAssignment_1_1"


    // $ANTLR start "rule__Event__ProxSensorAssignment_2_1"
    // InternalThymioDSL.g:3360:1: rule__Event__ProxSensorAssignment_2_1 : ( ruleProxSensor ) ;
    public final void rule__Event__ProxSensorAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3364:1: ( ( ruleProxSensor ) )
            // InternalThymioDSL.g:3365:2: ( ruleProxSensor )
            {
            // InternalThymioDSL.g:3365:2: ( ruleProxSensor )
            // InternalThymioDSL.g:3366:3: ruleProxSensor
            {
             before(grammarAccess.getEventAccess().getProxSensorProxSensorParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProxSensor();

            state._fsp--;

             after(grammarAccess.getEventAccess().getProxSensorProxSensorParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Event__ProxSensorAssignment_2_1"


    // $ANTLR start "rule__Event__BottomSensorAssignment_3_1"
    // InternalThymioDSL.g:3375:1: rule__Event__BottomSensorAssignment_3_1 : ( ruleBottomSensor ) ;
    public final void rule__Event__BottomSensorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3379:1: ( ( ruleBottomSensor ) )
            // InternalThymioDSL.g:3380:2: ( ruleBottomSensor )
            {
            // InternalThymioDSL.g:3380:2: ( ruleBottomSensor )
            // InternalThymioDSL.g:3381:3: ruleBottomSensor
            {
             before(grammarAccess.getEventAccess().getBottomSensorBottomSensorParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBottomSensor();

            state._fsp--;

             after(grammarAccess.getEventAccess().getBottomSensorBottomSensorParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Event__BottomSensorAssignment_3_1"


    // $ANTLR start "rule__ProxSensor__FrontLeftSensorAssignment_1_1"
    // InternalThymioDSL.g:3390:1: rule__ProxSensor__FrontLeftSensorAssignment_1_1 : ( ruleSensorStatus ) ;
    public final void rule__ProxSensor__FrontLeftSensorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3394:1: ( ( ruleSensorStatus ) )
            // InternalThymioDSL.g:3395:2: ( ruleSensorStatus )
            {
            // InternalThymioDSL.g:3395:2: ( ruleSensorStatus )
            // InternalThymioDSL.g:3396:3: ruleSensorStatus
            {
             before(grammarAccess.getProxSensorAccess().getFrontLeftSensorSensorStatusParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorStatus();

            state._fsp--;

             after(grammarAccess.getProxSensorAccess().getFrontLeftSensorSensorStatusParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__ProxSensor__FrontLeftSensorAssignment_1_1"


    // $ANTLR start "rule__ProxSensor__FrontCenterLeftSensorAssignment_2_1"
    // InternalThymioDSL.g:3405:1: rule__ProxSensor__FrontCenterLeftSensorAssignment_2_1 : ( ruleSensorStatus ) ;
    public final void rule__ProxSensor__FrontCenterLeftSensorAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3409:1: ( ( ruleSensorStatus ) )
            // InternalThymioDSL.g:3410:2: ( ruleSensorStatus )
            {
            // InternalThymioDSL.g:3410:2: ( ruleSensorStatus )
            // InternalThymioDSL.g:3411:3: ruleSensorStatus
            {
             before(grammarAccess.getProxSensorAccess().getFrontCenterLeftSensorSensorStatusParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorStatus();

            state._fsp--;

             after(grammarAccess.getProxSensorAccess().getFrontCenterLeftSensorSensorStatusParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__ProxSensor__FrontCenterLeftSensorAssignment_2_1"


    // $ANTLR start "rule__ProxSensor__FrontCenterSensorAssignment_3_1"
    // InternalThymioDSL.g:3420:1: rule__ProxSensor__FrontCenterSensorAssignment_3_1 : ( ruleSensorStatus ) ;
    public final void rule__ProxSensor__FrontCenterSensorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3424:1: ( ( ruleSensorStatus ) )
            // InternalThymioDSL.g:3425:2: ( ruleSensorStatus )
            {
            // InternalThymioDSL.g:3425:2: ( ruleSensorStatus )
            // InternalThymioDSL.g:3426:3: ruleSensorStatus
            {
             before(grammarAccess.getProxSensorAccess().getFrontCenterSensorSensorStatusParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorStatus();

            state._fsp--;

             after(grammarAccess.getProxSensorAccess().getFrontCenterSensorSensorStatusParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ProxSensor__FrontCenterSensorAssignment_3_1"


    // $ANTLR start "rule__ProxSensor__FrontCenterRightSensorAssignment_4_1"
    // InternalThymioDSL.g:3435:1: rule__ProxSensor__FrontCenterRightSensorAssignment_4_1 : ( ruleSensorStatus ) ;
    public final void rule__ProxSensor__FrontCenterRightSensorAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3439:1: ( ( ruleSensorStatus ) )
            // InternalThymioDSL.g:3440:2: ( ruleSensorStatus )
            {
            // InternalThymioDSL.g:3440:2: ( ruleSensorStatus )
            // InternalThymioDSL.g:3441:3: ruleSensorStatus
            {
             before(grammarAccess.getProxSensorAccess().getFrontCenterRightSensorSensorStatusParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorStatus();

            state._fsp--;

             after(grammarAccess.getProxSensorAccess().getFrontCenterRightSensorSensorStatusParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__ProxSensor__FrontCenterRightSensorAssignment_4_1"


    // $ANTLR start "rule__ProxSensor__FrontRightSensorAssignment_5_1"
    // InternalThymioDSL.g:3450:1: rule__ProxSensor__FrontRightSensorAssignment_5_1 : ( ruleSensorStatus ) ;
    public final void rule__ProxSensor__FrontRightSensorAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3454:1: ( ( ruleSensorStatus ) )
            // InternalThymioDSL.g:3455:2: ( ruleSensorStatus )
            {
            // InternalThymioDSL.g:3455:2: ( ruleSensorStatus )
            // InternalThymioDSL.g:3456:3: ruleSensorStatus
            {
             before(grammarAccess.getProxSensorAccess().getFrontRightSensorSensorStatusParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorStatus();

            state._fsp--;

             after(grammarAccess.getProxSensorAccess().getFrontRightSensorSensorStatusParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__ProxSensor__FrontRightSensorAssignment_5_1"


    // $ANTLR start "rule__ProxSensor__BackLeftSensorAssignment_6_1"
    // InternalThymioDSL.g:3465:1: rule__ProxSensor__BackLeftSensorAssignment_6_1 : ( ruleSensorStatus ) ;
    public final void rule__ProxSensor__BackLeftSensorAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3469:1: ( ( ruleSensorStatus ) )
            // InternalThymioDSL.g:3470:2: ( ruleSensorStatus )
            {
            // InternalThymioDSL.g:3470:2: ( ruleSensorStatus )
            // InternalThymioDSL.g:3471:3: ruleSensorStatus
            {
             before(grammarAccess.getProxSensorAccess().getBackLeftSensorSensorStatusParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorStatus();

            state._fsp--;

             after(grammarAccess.getProxSensorAccess().getBackLeftSensorSensorStatusParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__ProxSensor__BackLeftSensorAssignment_6_1"


    // $ANTLR start "rule__ProxSensor__BackRightSensorAssignment_7_1"
    // InternalThymioDSL.g:3480:1: rule__ProxSensor__BackRightSensorAssignment_7_1 : ( ruleSensorStatus ) ;
    public final void rule__ProxSensor__BackRightSensorAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3484:1: ( ( ruleSensorStatus ) )
            // InternalThymioDSL.g:3485:2: ( ruleSensorStatus )
            {
            // InternalThymioDSL.g:3485:2: ( ruleSensorStatus )
            // InternalThymioDSL.g:3486:3: ruleSensorStatus
            {
             before(grammarAccess.getProxSensorAccess().getBackRightSensorSensorStatusParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorStatus();

            state._fsp--;

             after(grammarAccess.getProxSensorAccess().getBackRightSensorSensorStatusParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__ProxSensor__BackRightSensorAssignment_7_1"


    // $ANTLR start "rule__BottomSensor__BottomLeftSensorAssignment_0_1"
    // InternalThymioDSL.g:3495:1: rule__BottomSensor__BottomLeftSensorAssignment_0_1 : ( ruleBlackWhite ) ;
    public final void rule__BottomSensor__BottomLeftSensorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3499:1: ( ( ruleBlackWhite ) )
            // InternalThymioDSL.g:3500:2: ( ruleBlackWhite )
            {
            // InternalThymioDSL.g:3500:2: ( ruleBlackWhite )
            // InternalThymioDSL.g:3501:3: ruleBlackWhite
            {
             before(grammarAccess.getBottomSensorAccess().getBottomLeftSensorBlackWhiteParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBlackWhite();

            state._fsp--;

             after(grammarAccess.getBottomSensorAccess().getBottomLeftSensorBlackWhiteParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__BottomSensor__BottomLeftSensorAssignment_0_1"


    // $ANTLR start "rule__BottomSensor__BottomRightSensorAssignment_1_1"
    // InternalThymioDSL.g:3510:1: rule__BottomSensor__BottomRightSensorAssignment_1_1 : ( ruleBlackWhite ) ;
    public final void rule__BottomSensor__BottomRightSensorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3514:1: ( ( ruleBlackWhite ) )
            // InternalThymioDSL.g:3515:2: ( ruleBlackWhite )
            {
            // InternalThymioDSL.g:3515:2: ( ruleBlackWhite )
            // InternalThymioDSL.g:3516:3: ruleBlackWhite
            {
             before(grammarAccess.getBottomSensorAccess().getBottomRightSensorBlackWhiteParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBlackWhite();

            state._fsp--;

             after(grammarAccess.getBottomSensorAccess().getBottomRightSensorBlackWhiteParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__BottomSensor__BottomRightSensorAssignment_1_1"


    // $ANTLR start "rule__Action__MoveAssignment_0_1"
    // InternalThymioDSL.g:3525:1: rule__Action__MoveAssignment_0_1 : ( ruleMotors ) ;
    public final void rule__Action__MoveAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3529:1: ( ( ruleMotors ) )
            // InternalThymioDSL.g:3530:2: ( ruleMotors )
            {
            // InternalThymioDSL.g:3530:2: ( ruleMotors )
            // InternalThymioDSL.g:3531:3: ruleMotors
            {
             before(grammarAccess.getActionAccess().getMoveMotorsParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMotors();

            state._fsp--;

             after(grammarAccess.getActionAccess().getMoveMotorsParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Action__MoveAssignment_0_1"


    // $ANTLR start "rule__Action__LightAssignment_1_1"
    // InternalThymioDSL.g:3540:1: rule__Action__LightAssignment_1_1 : ( ruleLights ) ;
    public final void rule__Action__LightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3544:1: ( ( ruleLights ) )
            // InternalThymioDSL.g:3545:2: ( ruleLights )
            {
            // InternalThymioDSL.g:3545:2: ( ruleLights )
            // InternalThymioDSL.g:3546:3: ruleLights
            {
             before(grammarAccess.getActionAccess().getLightLightsParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLights();

            state._fsp--;

             after(grammarAccess.getActionAccess().getLightLightsParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Action__LightAssignment_1_1"


    // $ANTLR start "rule__Action__SoundAssignment_2_1"
    // InternalThymioDSL.g:3555:1: rule__Action__SoundAssignment_2_1 : ( ruleSound ) ;
    public final void rule__Action__SoundAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3559:1: ( ( ruleSound ) )
            // InternalThymioDSL.g:3560:2: ( ruleSound )
            {
            // InternalThymioDSL.g:3560:2: ( ruleSound )
            // InternalThymioDSL.g:3561:3: ruleSound
            {
             before(grammarAccess.getActionAccess().getSoundSoundParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSound();

            state._fsp--;

             after(grammarAccess.getActionAccess().getSoundSoundParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Action__SoundAssignment_2_1"


    // $ANTLR start "rule__Motors__LeftAssignment_1"
    // InternalThymioDSL.g:3570:1: rule__Motors__LeftAssignment_1 : ( ruleAddition ) ;
    public final void rule__Motors__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3574:1: ( ( ruleAddition ) )
            // InternalThymioDSL.g:3575:2: ( ruleAddition )
            {
            // InternalThymioDSL.g:3575:2: ( ruleAddition )
            // InternalThymioDSL.g:3576:3: ruleAddition
            {
             before(grammarAccess.getMotorsAccess().getLeftAdditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getMotorsAccess().getLeftAdditionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Motors__LeftAssignment_1"


    // $ANTLR start "rule__Motors__RightAssignment_3"
    // InternalThymioDSL.g:3585:1: rule__Motors__RightAssignment_3 : ( ruleAddition ) ;
    public final void rule__Motors__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3589:1: ( ( ruleAddition ) )
            // InternalThymioDSL.g:3590:2: ( ruleAddition )
            {
            // InternalThymioDSL.g:3590:2: ( ruleAddition )
            // InternalThymioDSL.g:3591:3: ruleAddition
            {
             before(grammarAccess.getMotorsAccess().getRightAdditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getMotorsAccess().getRightAdditionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Motors__RightAssignment_3"


    // $ANTLR start "rule__Lights__TopLightAssignment_1_1_0_1"
    // InternalThymioDSL.g:3600:1: rule__Lights__TopLightAssignment_1_1_0_1 : ( ruleRGB ) ;
    public final void rule__Lights__TopLightAssignment_1_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3604:1: ( ( ruleRGB ) )
            // InternalThymioDSL.g:3605:2: ( ruleRGB )
            {
            // InternalThymioDSL.g:3605:2: ( ruleRGB )
            // InternalThymioDSL.g:3606:3: ruleRGB
            {
             before(grammarAccess.getLightsAccess().getTopLightRGBParserRuleCall_1_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRGB();

            state._fsp--;

             after(grammarAccess.getLightsAccess().getTopLightRGBParserRuleCall_1_1_0_1_0()); 

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
    // $ANTLR end "rule__Lights__TopLightAssignment_1_1_0_1"


    // $ANTLR start "rule__Lights__BottomLightAssignment_2_1_0_1"
    // InternalThymioDSL.g:3615:1: rule__Lights__BottomLightAssignment_2_1_0_1 : ( ruleRGB ) ;
    public final void rule__Lights__BottomLightAssignment_2_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3619:1: ( ( ruleRGB ) )
            // InternalThymioDSL.g:3620:2: ( ruleRGB )
            {
            // InternalThymioDSL.g:3620:2: ( ruleRGB )
            // InternalThymioDSL.g:3621:3: ruleRGB
            {
             before(grammarAccess.getLightsAccess().getBottomLightRGBParserRuleCall_2_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRGB();

            state._fsp--;

             after(grammarAccess.getLightsAccess().getBottomLightRGBParserRuleCall_2_1_0_1_0()); 

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
    // $ANTLR end "rule__Lights__BottomLightAssignment_2_1_0_1"


    // $ANTLR start "rule__RGB__RedAssignment_1"
    // InternalThymioDSL.g:3630:1: rule__RGB__RedAssignment_1 : ( ruleAddition ) ;
    public final void rule__RGB__RedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3634:1: ( ( ruleAddition ) )
            // InternalThymioDSL.g:3635:2: ( ruleAddition )
            {
            // InternalThymioDSL.g:3635:2: ( ruleAddition )
            // InternalThymioDSL.g:3636:3: ruleAddition
            {
             before(grammarAccess.getRGBAccess().getRedAdditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getRGBAccess().getRedAdditionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__RGB__RedAssignment_1"


    // $ANTLR start "rule__RGB__GreenAssignment_3"
    // InternalThymioDSL.g:3645:1: rule__RGB__GreenAssignment_3 : ( ruleAddition ) ;
    public final void rule__RGB__GreenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3649:1: ( ( ruleAddition ) )
            // InternalThymioDSL.g:3650:2: ( ruleAddition )
            {
            // InternalThymioDSL.g:3650:2: ( ruleAddition )
            // InternalThymioDSL.g:3651:3: ruleAddition
            {
             before(grammarAccess.getRGBAccess().getGreenAdditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getRGBAccess().getGreenAdditionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__RGB__GreenAssignment_3"


    // $ANTLR start "rule__RGB__BlueAssignment_5"
    // InternalThymioDSL.g:3660:1: rule__RGB__BlueAssignment_5 : ( ruleAddition ) ;
    public final void rule__RGB__BlueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3664:1: ( ( ruleAddition ) )
            // InternalThymioDSL.g:3665:2: ( ruleAddition )
            {
            // InternalThymioDSL.g:3665:2: ( ruleAddition )
            // InternalThymioDSL.g:3666:3: ruleAddition
            {
             before(grammarAccess.getRGBAccess().getBlueAdditionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getRGBAccess().getBlueAdditionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__RGB__BlueAssignment_5"


    // $ANTLR start "rule__Sound__PitchAssignment_1"
    // InternalThymioDSL.g:3675:1: rule__Sound__PitchAssignment_1 : ( ruleAddition ) ;
    public final void rule__Sound__PitchAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3679:1: ( ( ruleAddition ) )
            // InternalThymioDSL.g:3680:2: ( ruleAddition )
            {
            // InternalThymioDSL.g:3680:2: ( ruleAddition )
            // InternalThymioDSL.g:3681:3: ruleAddition
            {
             before(grammarAccess.getSoundAccess().getPitchAdditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getSoundAccess().getPitchAdditionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Sound__PitchAssignment_1"


    // $ANTLR start "rule__Sound__DurationAssignment_2"
    // InternalThymioDSL.g:3690:1: rule__Sound__DurationAssignment_2 : ( ruleNoteDuration ) ;
    public final void rule__Sound__DurationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3694:1: ( ( ruleNoteDuration ) )
            // InternalThymioDSL.g:3695:2: ( ruleNoteDuration )
            {
            // InternalThymioDSL.g:3695:2: ( ruleNoteDuration )
            // InternalThymioDSL.g:3696:3: ruleNoteDuration
            {
             before(grammarAccess.getSoundAccess().getDurationNoteDurationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNoteDuration();

            state._fsp--;

             after(grammarAccess.getSoundAccess().getDurationNoteDurationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Sound__DurationAssignment_2"


    // $ANTLR start "rule__Addition__OperatorAssignment_1_1"
    // InternalThymioDSL.g:3705:1: rule__Addition__OperatorAssignment_1_1 : ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Addition__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3709:1: ( ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) )
            // InternalThymioDSL.g:3710:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            {
            // InternalThymioDSL.g:3710:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            // InternalThymioDSL.g:3711:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 
            // InternalThymioDSL.g:3712:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            // InternalThymioDSL.g:3712:4: rule__Addition__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__OperatorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__Addition__OperatorAssignment_1_1"


    // $ANTLR start "rule__Addition__RightAssignment_1_2"
    // InternalThymioDSL.g:3720:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3724:1: ( ( ruleMultiplication ) )
            // InternalThymioDSL.g:3725:2: ( ruleMultiplication )
            {
            // InternalThymioDSL.g:3725:2: ( ruleMultiplication )
            // InternalThymioDSL.g:3726:3: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Addition__RightAssignment_1_2"


    // $ANTLR start "rule__Multiplication__OperatorAssignment_1_1"
    // InternalThymioDSL.g:3735:1: rule__Multiplication__OperatorAssignment_1_1 : ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Multiplication__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3739:1: ( ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) )
            // InternalThymioDSL.g:3740:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            {
            // InternalThymioDSL.g:3740:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            // InternalThymioDSL.g:3741:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 
            // InternalThymioDSL.g:3742:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            // InternalThymioDSL.g:3742:4: rule__Multiplication__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__OperatorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__Multiplication__OperatorAssignment_1_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_2"
    // InternalThymioDSL.g:3750:1: rule__Multiplication__RightAssignment_1_2 : ( ruleNumber ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3754:1: ( ( ruleNumber ) )
            // InternalThymioDSL.g:3755:2: ( ruleNumber )
            {
            // InternalThymioDSL.g:3755:2: ( ruleNumber )
            // InternalThymioDSL.g:3756:3: ruleNumber
            {
             before(grammarAccess.getMultiplicationAccess().getRightNumberParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getRightNumberParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Multiplication__RightAssignment_1_2"


    // $ANTLR start "rule__Number__ValueAssignment_0"
    // InternalThymioDSL.g:3765:1: rule__Number__ValueAssignment_0 : ( ruleEInt ) ;
    public final void rule__Number__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3769:1: ( ( ruleEInt ) )
            // InternalThymioDSL.g:3770:2: ( ruleEInt )
            {
            // InternalThymioDSL.g:3770:2: ( ruleEInt )
            // InternalThymioDSL.g:3771:3: ruleEInt
            {
             before(grammarAccess.getNumberAccess().getValueEIntParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getNumberAccess().getValueEIntParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Number__ValueAssignment_0"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000003C00000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0003800000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001F0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00001FC000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0080000010000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0020000000000800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000060000002L});

}