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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'off'", "'true'", "'false'", "'short'", "'long'", "'up'", "'down'", "'left'", "'right'", "'center'", "'very_close'", "'close'", "'far'", "'black'", "'white'", "'any'", "'+'", "'-'", "'*'", "'/'", "'Procedure:'", "'Event:'", "'Actions:'", "'button_is_clicked:'", "'robot_is_tapped:'", "'sound_is_detected:'", "'proximity_sensor_is_activated:'", "'bottom_sensor_detects_color:'", "'back_left:'", "'back_right:'", "'front_right:'", "'front_center_right:'", "'front_center:'", "'front_center_left:'", "'front_left:'", "'left:'", "'right:'", "'move:'", "'lights:'", "'sound:'", "'left_motor:'", "'right_motor:'", "'top_light:'", "'on'", "'bottom_light:'", "'('", "','", "')'", "'note:'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
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
    // InternalThymioDSL.g:144:1: ruleProxSensor : ( ( rule__ProxSensor__Alternatives ) ) ;
    public final void ruleProxSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:148:2: ( ( ( rule__ProxSensor__Alternatives ) ) )
            // InternalThymioDSL.g:149:2: ( ( rule__ProxSensor__Alternatives ) )
            {
            // InternalThymioDSL.g:149:2: ( ( rule__ProxSensor__Alternatives ) )
            // InternalThymioDSL.g:150:3: ( rule__ProxSensor__Alternatives )
            {
             before(grammarAccess.getProxSensorAccess().getAlternatives()); 
            // InternalThymioDSL.g:151:3: ( rule__ProxSensor__Alternatives )
            // InternalThymioDSL.g:151:4: rule__ProxSensor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ProxSensor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProxSensorAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleEBoolean"
    // InternalThymioDSL.g:360:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalThymioDSL.g:361:1: ( ruleEBoolean EOF )
            // InternalThymioDSL.g:362:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalThymioDSL.g:369:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:373:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalThymioDSL.g:374:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalThymioDSL.g:374:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalThymioDSL.g:375:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalThymioDSL.g:376:3: ( rule__EBoolean__Alternatives )
            // InternalThymioDSL.g:376:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEBoolean"


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
    // InternalThymioDSL.g:559:1: rule__Event__Alternatives : ( ( ( rule__Event__Group_0__0 ) ) | ( ( rule__Event__Group_1__0 ) ) | ( ( rule__Event__Group_2__0 ) ) | ( ( rule__Event__Group_3__0 ) ) | ( ( rule__Event__Group_4__0 ) ) );
    public final void rule__Event__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:563:1: ( ( ( rule__Event__Group_0__0 ) ) | ( ( rule__Event__Group_1__0 ) ) | ( ( rule__Event__Group_2__0 ) ) | ( ( rule__Event__Group_3__0 ) ) | ( ( rule__Event__Group_4__0 ) ) )
            int alt2=5;
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
            case 38:
                {
                alt2=5;
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
                case 5 :
                    // InternalThymioDSL.g:588:2: ( ( rule__Event__Group_4__0 ) )
                    {
                    // InternalThymioDSL.g:588:2: ( ( rule__Event__Group_4__0 ) )
                    // InternalThymioDSL.g:589:3: ( rule__Event__Group_4__0 )
                    {
                     before(grammarAccess.getEventAccess().getGroup_4()); 
                    // InternalThymioDSL.g:590:3: ( rule__Event__Group_4__0 )
                    // InternalThymioDSL.g:590:4: rule__Event__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getGroup_4()); 

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


    // $ANTLR start "rule__ProxSensor__Alternatives"
    // InternalThymioDSL.g:598:1: rule__ProxSensor__Alternatives : ( ( ( rule__ProxSensor__Group_0__0 ) ) | ( ( rule__ProxSensor__Group_1__0 ) ) | ( ( rule__ProxSensor__Group_2__0 ) ) | ( ( rule__ProxSensor__Group_3__0 ) ) | ( ( rule__ProxSensor__Group_4__0 ) ) | ( ( rule__ProxSensor__Group_5__0 ) ) | ( ( rule__ProxSensor__Group_6__0 ) ) );
    public final void rule__ProxSensor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:602:1: ( ( ( rule__ProxSensor__Group_0__0 ) ) | ( ( rule__ProxSensor__Group_1__0 ) ) | ( ( rule__ProxSensor__Group_2__0 ) ) | ( ( rule__ProxSensor__Group_3__0 ) ) | ( ( rule__ProxSensor__Group_4__0 ) ) | ( ( rule__ProxSensor__Group_5__0 ) ) | ( ( rule__ProxSensor__Group_6__0 ) ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt3=1;
                }
                break;
            case 40:
                {
                alt3=2;
                }
                break;
            case 41:
                {
                alt3=3;
                }
                break;
            case 42:
                {
                alt3=4;
                }
                break;
            case 43:
                {
                alt3=5;
                }
                break;
            case 44:
                {
                alt3=6;
                }
                break;
            case 45:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalThymioDSL.g:603:2: ( ( rule__ProxSensor__Group_0__0 ) )
                    {
                    // InternalThymioDSL.g:603:2: ( ( rule__ProxSensor__Group_0__0 ) )
                    // InternalThymioDSL.g:604:3: ( rule__ProxSensor__Group_0__0 )
                    {
                     before(grammarAccess.getProxSensorAccess().getGroup_0()); 
                    // InternalThymioDSL.g:605:3: ( rule__ProxSensor__Group_0__0 )
                    // InternalThymioDSL.g:605:4: rule__ProxSensor__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProxSensor__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProxSensorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:609:2: ( ( rule__ProxSensor__Group_1__0 ) )
                    {
                    // InternalThymioDSL.g:609:2: ( ( rule__ProxSensor__Group_1__0 ) )
                    // InternalThymioDSL.g:610:3: ( rule__ProxSensor__Group_1__0 )
                    {
                     before(grammarAccess.getProxSensorAccess().getGroup_1()); 
                    // InternalThymioDSL.g:611:3: ( rule__ProxSensor__Group_1__0 )
                    // InternalThymioDSL.g:611:4: rule__ProxSensor__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProxSensor__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProxSensorAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalThymioDSL.g:615:2: ( ( rule__ProxSensor__Group_2__0 ) )
                    {
                    // InternalThymioDSL.g:615:2: ( ( rule__ProxSensor__Group_2__0 ) )
                    // InternalThymioDSL.g:616:3: ( rule__ProxSensor__Group_2__0 )
                    {
                     before(grammarAccess.getProxSensorAccess().getGroup_2()); 
                    // InternalThymioDSL.g:617:3: ( rule__ProxSensor__Group_2__0 )
                    // InternalThymioDSL.g:617:4: rule__ProxSensor__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProxSensor__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProxSensorAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalThymioDSL.g:621:2: ( ( rule__ProxSensor__Group_3__0 ) )
                    {
                    // InternalThymioDSL.g:621:2: ( ( rule__ProxSensor__Group_3__0 ) )
                    // InternalThymioDSL.g:622:3: ( rule__ProxSensor__Group_3__0 )
                    {
                     before(grammarAccess.getProxSensorAccess().getGroup_3()); 
                    // InternalThymioDSL.g:623:3: ( rule__ProxSensor__Group_3__0 )
                    // InternalThymioDSL.g:623:4: rule__ProxSensor__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProxSensor__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProxSensorAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalThymioDSL.g:627:2: ( ( rule__ProxSensor__Group_4__0 ) )
                    {
                    // InternalThymioDSL.g:627:2: ( ( rule__ProxSensor__Group_4__0 ) )
                    // InternalThymioDSL.g:628:3: ( rule__ProxSensor__Group_4__0 )
                    {
                     before(grammarAccess.getProxSensorAccess().getGroup_4()); 
                    // InternalThymioDSL.g:629:3: ( rule__ProxSensor__Group_4__0 )
                    // InternalThymioDSL.g:629:4: rule__ProxSensor__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProxSensor__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProxSensorAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalThymioDSL.g:633:2: ( ( rule__ProxSensor__Group_5__0 ) )
                    {
                    // InternalThymioDSL.g:633:2: ( ( rule__ProxSensor__Group_5__0 ) )
                    // InternalThymioDSL.g:634:3: ( rule__ProxSensor__Group_5__0 )
                    {
                     before(grammarAccess.getProxSensorAccess().getGroup_5()); 
                    // InternalThymioDSL.g:635:3: ( rule__ProxSensor__Group_5__0 )
                    // InternalThymioDSL.g:635:4: rule__ProxSensor__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProxSensor__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProxSensorAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalThymioDSL.g:639:2: ( ( rule__ProxSensor__Group_6__0 ) )
                    {
                    // InternalThymioDSL.g:639:2: ( ( rule__ProxSensor__Group_6__0 ) )
                    // InternalThymioDSL.g:640:3: ( rule__ProxSensor__Group_6__0 )
                    {
                     before(grammarAccess.getProxSensorAccess().getGroup_6()); 
                    // InternalThymioDSL.g:641:3: ( rule__ProxSensor__Group_6__0 )
                    // InternalThymioDSL.g:641:4: rule__ProxSensor__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProxSensor__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProxSensorAccess().getGroup_6()); 

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
    // $ANTLR end "rule__ProxSensor__Alternatives"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalThymioDSL.g:649:1: rule__Action__Alternatives : ( ( ( rule__Action__Group_0__0 ) ) | ( ( rule__Action__Group_1__0 ) ) | ( ( rule__Action__Group_2__0 ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:653:1: ( ( ( rule__Action__Group_0__0 ) ) | ( ( rule__Action__Group_1__0 ) ) | ( ( rule__Action__Group_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt4=1;
                }
                break;
            case 49:
                {
                alt4=2;
                }
                break;
            case 50:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalThymioDSL.g:654:2: ( ( rule__Action__Group_0__0 ) )
                    {
                    // InternalThymioDSL.g:654:2: ( ( rule__Action__Group_0__0 ) )
                    // InternalThymioDSL.g:655:3: ( rule__Action__Group_0__0 )
                    {
                     before(grammarAccess.getActionAccess().getGroup_0()); 
                    // InternalThymioDSL.g:656:3: ( rule__Action__Group_0__0 )
                    // InternalThymioDSL.g:656:4: rule__Action__Group_0__0
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
                    // InternalThymioDSL.g:660:2: ( ( rule__Action__Group_1__0 ) )
                    {
                    // InternalThymioDSL.g:660:2: ( ( rule__Action__Group_1__0 ) )
                    // InternalThymioDSL.g:661:3: ( rule__Action__Group_1__0 )
                    {
                     before(grammarAccess.getActionAccess().getGroup_1()); 
                    // InternalThymioDSL.g:662:3: ( rule__Action__Group_1__0 )
                    // InternalThymioDSL.g:662:4: rule__Action__Group_1__0
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
                    // InternalThymioDSL.g:666:2: ( ( rule__Action__Group_2__0 ) )
                    {
                    // InternalThymioDSL.g:666:2: ( ( rule__Action__Group_2__0 ) )
                    // InternalThymioDSL.g:667:3: ( rule__Action__Group_2__0 )
                    {
                     before(grammarAccess.getActionAccess().getGroup_2()); 
                    // InternalThymioDSL.g:668:3: ( rule__Action__Group_2__0 )
                    // InternalThymioDSL.g:668:4: rule__Action__Group_2__0
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
    // InternalThymioDSL.g:676:1: rule__Lights__Alternatives_1_1 : ( ( ( rule__Lights__Group_1_1_0__0 ) ) | ( 'off' ) );
    public final void rule__Lights__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:680:1: ( ( ( rule__Lights__Group_1_1_0__0 ) ) | ( 'off' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==54) ) {
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
                    // InternalThymioDSL.g:681:2: ( ( rule__Lights__Group_1_1_0__0 ) )
                    {
                    // InternalThymioDSL.g:681:2: ( ( rule__Lights__Group_1_1_0__0 ) )
                    // InternalThymioDSL.g:682:3: ( rule__Lights__Group_1_1_0__0 )
                    {
                     before(grammarAccess.getLightsAccess().getGroup_1_1_0()); 
                    // InternalThymioDSL.g:683:3: ( rule__Lights__Group_1_1_0__0 )
                    // InternalThymioDSL.g:683:4: rule__Lights__Group_1_1_0__0
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
                    // InternalThymioDSL.g:687:2: ( 'off' )
                    {
                    // InternalThymioDSL.g:687:2: ( 'off' )
                    // InternalThymioDSL.g:688:3: 'off'
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
    // InternalThymioDSL.g:697:1: rule__Lights__Alternatives_2_1 : ( ( ( rule__Lights__Group_2_1_0__0 ) ) | ( 'off' ) );
    public final void rule__Lights__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:701:1: ( ( ( rule__Lights__Group_2_1_0__0 ) ) | ( 'off' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==54) ) {
                alt6=1;
            }
            else if ( (LA6_0==11) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalThymioDSL.g:702:2: ( ( rule__Lights__Group_2_1_0__0 ) )
                    {
                    // InternalThymioDSL.g:702:2: ( ( rule__Lights__Group_2_1_0__0 ) )
                    // InternalThymioDSL.g:703:3: ( rule__Lights__Group_2_1_0__0 )
                    {
                     before(grammarAccess.getLightsAccess().getGroup_2_1_0()); 
                    // InternalThymioDSL.g:704:3: ( rule__Lights__Group_2_1_0__0 )
                    // InternalThymioDSL.g:704:4: rule__Lights__Group_2_1_0__0
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
                    // InternalThymioDSL.g:708:2: ( 'off' )
                    {
                    // InternalThymioDSL.g:708:2: ( 'off' )
                    // InternalThymioDSL.g:709:3: 'off'
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
    // InternalThymioDSL.g:718:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:722:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalThymioDSL.g:723:2: ( RULE_STRING )
                    {
                    // InternalThymioDSL.g:723:2: ( RULE_STRING )
                    // InternalThymioDSL.g:724:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:729:2: ( RULE_ID )
                    {
                    // InternalThymioDSL.g:729:2: ( RULE_ID )
                    // InternalThymioDSL.g:730:3: RULE_ID
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


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalThymioDSL.g:739:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:743:1: ( ( 'true' ) | ( 'false' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                alt8=1;
            }
            else if ( (LA8_0==13) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalThymioDSL.g:744:2: ( 'true' )
                    {
                    // InternalThymioDSL.g:744:2: ( 'true' )
                    // InternalThymioDSL.g:745:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:750:2: ( 'false' )
                    {
                    // InternalThymioDSL.g:750:2: ( 'false' )
                    // InternalThymioDSL.g:751:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__NoteDuration__Alternatives"
    // InternalThymioDSL.g:760:1: rule__NoteDuration__Alternatives : ( ( 'short' ) | ( 'long' ) );
    public final void rule__NoteDuration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:764:1: ( ( 'short' ) | ( 'long' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            else if ( (LA9_0==15) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalThymioDSL.g:765:2: ( 'short' )
                    {
                    // InternalThymioDSL.g:765:2: ( 'short' )
                    // InternalThymioDSL.g:766:3: 'short'
                    {
                     before(grammarAccess.getNoteDurationAccess().getShortKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getNoteDurationAccess().getShortKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:771:2: ( 'long' )
                    {
                    // InternalThymioDSL.g:771:2: ( 'long' )
                    // InternalThymioDSL.g:772:3: 'long'
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
    // InternalThymioDSL.g:781:1: rule__Ortogonal__Alternatives : ( ( 'up' ) | ( 'down' ) | ( 'left' ) | ( 'right' ) | ( 'center' ) );
    public final void rule__Ortogonal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:785:1: ( ( 'up' ) | ( 'down' ) | ( 'left' ) | ( 'right' ) | ( 'center' ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt10=1;
                }
                break;
            case 17:
                {
                alt10=2;
                }
                break;
            case 18:
                {
                alt10=3;
                }
                break;
            case 19:
                {
                alt10=4;
                }
                break;
            case 20:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalThymioDSL.g:786:2: ( 'up' )
                    {
                    // InternalThymioDSL.g:786:2: ( 'up' )
                    // InternalThymioDSL.g:787:3: 'up'
                    {
                     before(grammarAccess.getOrtogonalAccess().getUpKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getOrtogonalAccess().getUpKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:792:2: ( 'down' )
                    {
                    // InternalThymioDSL.g:792:2: ( 'down' )
                    // InternalThymioDSL.g:793:3: 'down'
                    {
                     before(grammarAccess.getOrtogonalAccess().getDownKeyword_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getOrtogonalAccess().getDownKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalThymioDSL.g:798:2: ( 'left' )
                    {
                    // InternalThymioDSL.g:798:2: ( 'left' )
                    // InternalThymioDSL.g:799:3: 'left'
                    {
                     before(grammarAccess.getOrtogonalAccess().getLeftKeyword_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getOrtogonalAccess().getLeftKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalThymioDSL.g:804:2: ( 'right' )
                    {
                    // InternalThymioDSL.g:804:2: ( 'right' )
                    // InternalThymioDSL.g:805:3: 'right'
                    {
                     before(grammarAccess.getOrtogonalAccess().getRightKeyword_3()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getOrtogonalAccess().getRightKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalThymioDSL.g:810:2: ( 'center' )
                    {
                    // InternalThymioDSL.g:810:2: ( 'center' )
                    // InternalThymioDSL.g:811:3: 'center'
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
    // InternalThymioDSL.g:820:1: rule__SensorStatus__Alternatives : ( ( 'very_close' ) | ( 'close' ) | ( 'far' ) );
    public final void rule__SensorStatus__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:824:1: ( ( 'very_close' ) | ( 'close' ) | ( 'far' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt11=1;
                }
                break;
            case 22:
                {
                alt11=2;
                }
                break;
            case 23:
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
                    // InternalThymioDSL.g:825:2: ( 'very_close' )
                    {
                    // InternalThymioDSL.g:825:2: ( 'very_close' )
                    // InternalThymioDSL.g:826:3: 'very_close'
                    {
                     before(grammarAccess.getSensorStatusAccess().getVery_closeKeyword_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getSensorStatusAccess().getVery_closeKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:831:2: ( 'close' )
                    {
                    // InternalThymioDSL.g:831:2: ( 'close' )
                    // InternalThymioDSL.g:832:3: 'close'
                    {
                     before(grammarAccess.getSensorStatusAccess().getCloseKeyword_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getSensorStatusAccess().getCloseKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalThymioDSL.g:837:2: ( 'far' )
                    {
                    // InternalThymioDSL.g:837:2: ( 'far' )
                    // InternalThymioDSL.g:838:3: 'far'
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
    // InternalThymioDSL.g:847:1: rule__BlackWhite__Alternatives : ( ( 'black' ) | ( 'white' ) | ( 'any' ) );
    public final void rule__BlackWhite__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:851:1: ( ( 'black' ) | ( 'white' ) | ( 'any' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt12=1;
                }
                break;
            case 25:
                {
                alt12=2;
                }
                break;
            case 26:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalThymioDSL.g:852:2: ( 'black' )
                    {
                    // InternalThymioDSL.g:852:2: ( 'black' )
                    // InternalThymioDSL.g:853:3: 'black'
                    {
                     before(grammarAccess.getBlackWhiteAccess().getBlackKeyword_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getBlackWhiteAccess().getBlackKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:858:2: ( 'white' )
                    {
                    // InternalThymioDSL.g:858:2: ( 'white' )
                    // InternalThymioDSL.g:859:3: 'white'
                    {
                     before(grammarAccess.getBlackWhiteAccess().getWhiteKeyword_1()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getBlackWhiteAccess().getWhiteKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalThymioDSL.g:864:2: ( 'any' )
                    {
                    // InternalThymioDSL.g:864:2: ( 'any' )
                    // InternalThymioDSL.g:865:3: 'any'
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
    // InternalThymioDSL.g:874:1: rule__Addition__OperatorAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:878:1: ( ( '+' ) | ( '-' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            else if ( (LA13_0==28) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalThymioDSL.g:879:2: ( '+' )
                    {
                    // InternalThymioDSL.g:879:2: ( '+' )
                    // InternalThymioDSL.g:880:3: '+'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:885:2: ( '-' )
                    {
                    // InternalThymioDSL.g:885:2: ( '-' )
                    // InternalThymioDSL.g:886:3: '-'
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
    // InternalThymioDSL.g:895:1: rule__Multiplication__OperatorAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Multiplication__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:899:1: ( ( '*' ) | ( '/' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            else if ( (LA14_0==30) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalThymioDSL.g:900:2: ( '*' )
                    {
                    // InternalThymioDSL.g:900:2: ( '*' )
                    // InternalThymioDSL.g:901:3: '*'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:906:2: ( '/' )
                    {
                    // InternalThymioDSL.g:906:2: ( '/' )
                    // InternalThymioDSL.g:907:3: '/'
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
    // InternalThymioDSL.g:916:1: rule__Number__Alternatives : ( ( ( rule__Number__ValueAssignment_0 ) ) | ( ( rule__Number__Group_1__0 ) ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:920:1: ( ( ( rule__Number__ValueAssignment_0 ) ) | ( ( rule__Number__Group_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT||LA15_0==28) ) {
                alt15=1;
            }
            else if ( (LA15_0==56) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalThymioDSL.g:921:2: ( ( rule__Number__ValueAssignment_0 ) )
                    {
                    // InternalThymioDSL.g:921:2: ( ( rule__Number__ValueAssignment_0 ) )
                    // InternalThymioDSL.g:922:3: ( rule__Number__ValueAssignment_0 )
                    {
                     before(grammarAccess.getNumberAccess().getValueAssignment_0()); 
                    // InternalThymioDSL.g:923:3: ( rule__Number__ValueAssignment_0 )
                    // InternalThymioDSL.g:923:4: rule__Number__ValueAssignment_0
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
                    // InternalThymioDSL.g:927:2: ( ( rule__Number__Group_1__0 ) )
                    {
                    // InternalThymioDSL.g:927:2: ( ( rule__Number__Group_1__0 ) )
                    // InternalThymioDSL.g:928:3: ( rule__Number__Group_1__0 )
                    {
                     before(grammarAccess.getNumberAccess().getGroup_1()); 
                    // InternalThymioDSL.g:929:3: ( rule__Number__Group_1__0 )
                    // InternalThymioDSL.g:929:4: rule__Number__Group_1__0
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
    // InternalThymioDSL.g:937:1: rule__Procedure__Group__0 : rule__Procedure__Group__0__Impl rule__Procedure__Group__1 ;
    public final void rule__Procedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:941:1: ( rule__Procedure__Group__0__Impl rule__Procedure__Group__1 )
            // InternalThymioDSL.g:942:2: rule__Procedure__Group__0__Impl rule__Procedure__Group__1
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
    // InternalThymioDSL.g:949:1: rule__Procedure__Group__0__Impl : ( 'Procedure:' ) ;
    public final void rule__Procedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:953:1: ( ( 'Procedure:' ) )
            // InternalThymioDSL.g:954:1: ( 'Procedure:' )
            {
            // InternalThymioDSL.g:954:1: ( 'Procedure:' )
            // InternalThymioDSL.g:955:2: 'Procedure:'
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
    // InternalThymioDSL.g:964:1: rule__Procedure__Group__1 : rule__Procedure__Group__1__Impl rule__Procedure__Group__2 ;
    public final void rule__Procedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:968:1: ( rule__Procedure__Group__1__Impl rule__Procedure__Group__2 )
            // InternalThymioDSL.g:969:2: rule__Procedure__Group__1__Impl rule__Procedure__Group__2
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
    // InternalThymioDSL.g:976:1: rule__Procedure__Group__1__Impl : ( ( rule__Procedure__NameAssignment_1 ) ) ;
    public final void rule__Procedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:980:1: ( ( ( rule__Procedure__NameAssignment_1 ) ) )
            // InternalThymioDSL.g:981:1: ( ( rule__Procedure__NameAssignment_1 ) )
            {
            // InternalThymioDSL.g:981:1: ( ( rule__Procedure__NameAssignment_1 ) )
            // InternalThymioDSL.g:982:2: ( rule__Procedure__NameAssignment_1 )
            {
             before(grammarAccess.getProcedureAccess().getNameAssignment_1()); 
            // InternalThymioDSL.g:983:2: ( rule__Procedure__NameAssignment_1 )
            // InternalThymioDSL.g:983:3: rule__Procedure__NameAssignment_1
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
    // InternalThymioDSL.g:991:1: rule__Procedure__Group__2 : rule__Procedure__Group__2__Impl rule__Procedure__Group__3 ;
    public final void rule__Procedure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:995:1: ( rule__Procedure__Group__2__Impl rule__Procedure__Group__3 )
            // InternalThymioDSL.g:996:2: rule__Procedure__Group__2__Impl rule__Procedure__Group__3
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
    // InternalThymioDSL.g:1003:1: rule__Procedure__Group__2__Impl : ( 'Event:' ) ;
    public final void rule__Procedure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1007:1: ( ( 'Event:' ) )
            // InternalThymioDSL.g:1008:1: ( 'Event:' )
            {
            // InternalThymioDSL.g:1008:1: ( 'Event:' )
            // InternalThymioDSL.g:1009:2: 'Event:'
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
    // InternalThymioDSL.g:1018:1: rule__Procedure__Group__3 : rule__Procedure__Group__3__Impl rule__Procedure__Group__4 ;
    public final void rule__Procedure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1022:1: ( rule__Procedure__Group__3__Impl rule__Procedure__Group__4 )
            // InternalThymioDSL.g:1023:2: rule__Procedure__Group__3__Impl rule__Procedure__Group__4
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
    // InternalThymioDSL.g:1030:1: rule__Procedure__Group__3__Impl : ( ( rule__Procedure__EventsAssignment_3 ) ) ;
    public final void rule__Procedure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1034:1: ( ( ( rule__Procedure__EventsAssignment_3 ) ) )
            // InternalThymioDSL.g:1035:1: ( ( rule__Procedure__EventsAssignment_3 ) )
            {
            // InternalThymioDSL.g:1035:1: ( ( rule__Procedure__EventsAssignment_3 ) )
            // InternalThymioDSL.g:1036:2: ( rule__Procedure__EventsAssignment_3 )
            {
             before(grammarAccess.getProcedureAccess().getEventsAssignment_3()); 
            // InternalThymioDSL.g:1037:2: ( rule__Procedure__EventsAssignment_3 )
            // InternalThymioDSL.g:1037:3: rule__Procedure__EventsAssignment_3
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
    // InternalThymioDSL.g:1045:1: rule__Procedure__Group__4 : rule__Procedure__Group__4__Impl rule__Procedure__Group__5 ;
    public final void rule__Procedure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1049:1: ( rule__Procedure__Group__4__Impl rule__Procedure__Group__5 )
            // InternalThymioDSL.g:1050:2: rule__Procedure__Group__4__Impl rule__Procedure__Group__5
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
    // InternalThymioDSL.g:1057:1: rule__Procedure__Group__4__Impl : ( 'Actions:' ) ;
    public final void rule__Procedure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1061:1: ( ( 'Actions:' ) )
            // InternalThymioDSL.g:1062:1: ( 'Actions:' )
            {
            // InternalThymioDSL.g:1062:1: ( 'Actions:' )
            // InternalThymioDSL.g:1063:2: 'Actions:'
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
    // InternalThymioDSL.g:1072:1: rule__Procedure__Group__5 : rule__Procedure__Group__5__Impl ;
    public final void rule__Procedure__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1076:1: ( rule__Procedure__Group__5__Impl )
            // InternalThymioDSL.g:1077:2: rule__Procedure__Group__5__Impl
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
    // InternalThymioDSL.g:1083:1: rule__Procedure__Group__5__Impl : ( ( ( rule__Procedure__ActionsAssignment_5 ) ) ( ( rule__Procedure__ActionsAssignment_5 )* ) ) ;
    public final void rule__Procedure__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1087:1: ( ( ( ( rule__Procedure__ActionsAssignment_5 ) ) ( ( rule__Procedure__ActionsAssignment_5 )* ) ) )
            // InternalThymioDSL.g:1088:1: ( ( ( rule__Procedure__ActionsAssignment_5 ) ) ( ( rule__Procedure__ActionsAssignment_5 )* ) )
            {
            // InternalThymioDSL.g:1088:1: ( ( ( rule__Procedure__ActionsAssignment_5 ) ) ( ( rule__Procedure__ActionsAssignment_5 )* ) )
            // InternalThymioDSL.g:1089:2: ( ( rule__Procedure__ActionsAssignment_5 ) ) ( ( rule__Procedure__ActionsAssignment_5 )* )
            {
            // InternalThymioDSL.g:1089:2: ( ( rule__Procedure__ActionsAssignment_5 ) )
            // InternalThymioDSL.g:1090:3: ( rule__Procedure__ActionsAssignment_5 )
            {
             before(grammarAccess.getProcedureAccess().getActionsAssignment_5()); 
            // InternalThymioDSL.g:1091:3: ( rule__Procedure__ActionsAssignment_5 )
            // InternalThymioDSL.g:1091:4: rule__Procedure__ActionsAssignment_5
            {
            pushFollow(FOLLOW_9);
            rule__Procedure__ActionsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getActionsAssignment_5()); 

            }

            // InternalThymioDSL.g:1094:2: ( ( rule__Procedure__ActionsAssignment_5 )* )
            // InternalThymioDSL.g:1095:3: ( rule__Procedure__ActionsAssignment_5 )*
            {
             before(grammarAccess.getProcedureAccess().getActionsAssignment_5()); 
            // InternalThymioDSL.g:1096:3: ( rule__Procedure__ActionsAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=48 && LA16_0<=50)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalThymioDSL.g:1096:4: rule__Procedure__ActionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Procedure__ActionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalThymioDSL.g:1106:1: rule__Event__Group_0__0 : rule__Event__Group_0__0__Impl rule__Event__Group_0__1 ;
    public final void rule__Event__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1110:1: ( rule__Event__Group_0__0__Impl rule__Event__Group_0__1 )
            // InternalThymioDSL.g:1111:2: rule__Event__Group_0__0__Impl rule__Event__Group_0__1
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
    // InternalThymioDSL.g:1118:1: rule__Event__Group_0__0__Impl : ( 'button_is_clicked:' ) ;
    public final void rule__Event__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1122:1: ( ( 'button_is_clicked:' ) )
            // InternalThymioDSL.g:1123:1: ( 'button_is_clicked:' )
            {
            // InternalThymioDSL.g:1123:1: ( 'button_is_clicked:' )
            // InternalThymioDSL.g:1124:2: 'button_is_clicked:'
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
    // InternalThymioDSL.g:1133:1: rule__Event__Group_0__1 : rule__Event__Group_0__1__Impl ;
    public final void rule__Event__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1137:1: ( rule__Event__Group_0__1__Impl )
            // InternalThymioDSL.g:1138:2: rule__Event__Group_0__1__Impl
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
    // InternalThymioDSL.g:1144:1: rule__Event__Group_0__1__Impl : ( ( rule__Event__ButtonAssignment_0_1 ) ) ;
    public final void rule__Event__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1148:1: ( ( ( rule__Event__ButtonAssignment_0_1 ) ) )
            // InternalThymioDSL.g:1149:1: ( ( rule__Event__ButtonAssignment_0_1 ) )
            {
            // InternalThymioDSL.g:1149:1: ( ( rule__Event__ButtonAssignment_0_1 ) )
            // InternalThymioDSL.g:1150:2: ( rule__Event__ButtonAssignment_0_1 )
            {
             before(grammarAccess.getEventAccess().getButtonAssignment_0_1()); 
            // InternalThymioDSL.g:1151:2: ( rule__Event__ButtonAssignment_0_1 )
            // InternalThymioDSL.g:1151:3: rule__Event__ButtonAssignment_0_1
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
    // InternalThymioDSL.g:1160:1: rule__Event__Group_1__0 : rule__Event__Group_1__0__Impl rule__Event__Group_1__1 ;
    public final void rule__Event__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1164:1: ( rule__Event__Group_1__0__Impl rule__Event__Group_1__1 )
            // InternalThymioDSL.g:1165:2: rule__Event__Group_1__0__Impl rule__Event__Group_1__1
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
    // InternalThymioDSL.g:1172:1: rule__Event__Group_1__0__Impl : ( 'robot_is_tapped:' ) ;
    public final void rule__Event__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1176:1: ( ( 'robot_is_tapped:' ) )
            // InternalThymioDSL.g:1177:1: ( 'robot_is_tapped:' )
            {
            // InternalThymioDSL.g:1177:1: ( 'robot_is_tapped:' )
            // InternalThymioDSL.g:1178:2: 'robot_is_tapped:'
            {
             before(grammarAccess.getEventAccess().getRobot_is_tappedKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getRobot_is_tappedKeyword_1_0()); 

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
    // InternalThymioDSL.g:1187:1: rule__Event__Group_1__1 : rule__Event__Group_1__1__Impl ;
    public final void rule__Event__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1191:1: ( rule__Event__Group_1__1__Impl )
            // InternalThymioDSL.g:1192:2: rule__Event__Group_1__1__Impl
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
    // InternalThymioDSL.g:1198:1: rule__Event__Group_1__1__Impl : ( ( rule__Event__TapAssignment_1_1 ) ) ;
    public final void rule__Event__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1202:1: ( ( ( rule__Event__TapAssignment_1_1 ) ) )
            // InternalThymioDSL.g:1203:1: ( ( rule__Event__TapAssignment_1_1 ) )
            {
            // InternalThymioDSL.g:1203:1: ( ( rule__Event__TapAssignment_1_1 ) )
            // InternalThymioDSL.g:1204:2: ( rule__Event__TapAssignment_1_1 )
            {
             before(grammarAccess.getEventAccess().getTapAssignment_1_1()); 
            // InternalThymioDSL.g:1205:2: ( rule__Event__TapAssignment_1_1 )
            // InternalThymioDSL.g:1205:3: rule__Event__TapAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__TapAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getTapAssignment_1_1()); 

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
    // InternalThymioDSL.g:1214:1: rule__Event__Group_2__0 : rule__Event__Group_2__0__Impl rule__Event__Group_2__1 ;
    public final void rule__Event__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1218:1: ( rule__Event__Group_2__0__Impl rule__Event__Group_2__1 )
            // InternalThymioDSL.g:1219:2: rule__Event__Group_2__0__Impl rule__Event__Group_2__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalThymioDSL.g:1226:1: rule__Event__Group_2__0__Impl : ( 'sound_is_detected:' ) ;
    public final void rule__Event__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1230:1: ( ( 'sound_is_detected:' ) )
            // InternalThymioDSL.g:1231:1: ( 'sound_is_detected:' )
            {
            // InternalThymioDSL.g:1231:1: ( 'sound_is_detected:' )
            // InternalThymioDSL.g:1232:2: 'sound_is_detected:'
            {
             before(grammarAccess.getEventAccess().getSound_is_detectedKeyword_2_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getSound_is_detectedKeyword_2_0()); 

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
    // InternalThymioDSL.g:1241:1: rule__Event__Group_2__1 : rule__Event__Group_2__1__Impl ;
    public final void rule__Event__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1245:1: ( rule__Event__Group_2__1__Impl )
            // InternalThymioDSL.g:1246:2: rule__Event__Group_2__1__Impl
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
    // InternalThymioDSL.g:1252:1: rule__Event__Group_2__1__Impl : ( ( rule__Event__MicAssignment_2_1 ) ) ;
    public final void rule__Event__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1256:1: ( ( ( rule__Event__MicAssignment_2_1 ) ) )
            // InternalThymioDSL.g:1257:1: ( ( rule__Event__MicAssignment_2_1 ) )
            {
            // InternalThymioDSL.g:1257:1: ( ( rule__Event__MicAssignment_2_1 ) )
            // InternalThymioDSL.g:1258:2: ( rule__Event__MicAssignment_2_1 )
            {
             before(grammarAccess.getEventAccess().getMicAssignment_2_1()); 
            // InternalThymioDSL.g:1259:2: ( rule__Event__MicAssignment_2_1 )
            // InternalThymioDSL.g:1259:3: rule__Event__MicAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__MicAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getMicAssignment_2_1()); 

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
    // InternalThymioDSL.g:1268:1: rule__Event__Group_3__0 : rule__Event__Group_3__0__Impl rule__Event__Group_3__1 ;
    public final void rule__Event__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1272:1: ( rule__Event__Group_3__0__Impl rule__Event__Group_3__1 )
            // InternalThymioDSL.g:1273:2: rule__Event__Group_3__0__Impl rule__Event__Group_3__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalThymioDSL.g:1280:1: rule__Event__Group_3__0__Impl : ( 'proximity_sensor_is_activated:' ) ;
    public final void rule__Event__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1284:1: ( ( 'proximity_sensor_is_activated:' ) )
            // InternalThymioDSL.g:1285:1: ( 'proximity_sensor_is_activated:' )
            {
            // InternalThymioDSL.g:1285:1: ( 'proximity_sensor_is_activated:' )
            // InternalThymioDSL.g:1286:2: 'proximity_sensor_is_activated:'
            {
             before(grammarAccess.getEventAccess().getProximity_sensor_is_activatedKeyword_3_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getProximity_sensor_is_activatedKeyword_3_0()); 

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
    // InternalThymioDSL.g:1295:1: rule__Event__Group_3__1 : rule__Event__Group_3__1__Impl ;
    public final void rule__Event__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1299:1: ( rule__Event__Group_3__1__Impl )
            // InternalThymioDSL.g:1300:2: rule__Event__Group_3__1__Impl
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
    // InternalThymioDSL.g:1306:1: rule__Event__Group_3__1__Impl : ( ( ( rule__Event__ProxSensorAssignment_3_1 ) ) ( ( rule__Event__ProxSensorAssignment_3_1 )* ) ) ;
    public final void rule__Event__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1310:1: ( ( ( ( rule__Event__ProxSensorAssignment_3_1 ) ) ( ( rule__Event__ProxSensorAssignment_3_1 )* ) ) )
            // InternalThymioDSL.g:1311:1: ( ( ( rule__Event__ProxSensorAssignment_3_1 ) ) ( ( rule__Event__ProxSensorAssignment_3_1 )* ) )
            {
            // InternalThymioDSL.g:1311:1: ( ( ( rule__Event__ProxSensorAssignment_3_1 ) ) ( ( rule__Event__ProxSensorAssignment_3_1 )* ) )
            // InternalThymioDSL.g:1312:2: ( ( rule__Event__ProxSensorAssignment_3_1 ) ) ( ( rule__Event__ProxSensorAssignment_3_1 )* )
            {
            // InternalThymioDSL.g:1312:2: ( ( rule__Event__ProxSensorAssignment_3_1 ) )
            // InternalThymioDSL.g:1313:3: ( rule__Event__ProxSensorAssignment_3_1 )
            {
             before(grammarAccess.getEventAccess().getProxSensorAssignment_3_1()); 
            // InternalThymioDSL.g:1314:3: ( rule__Event__ProxSensorAssignment_3_1 )
            // InternalThymioDSL.g:1314:4: rule__Event__ProxSensorAssignment_3_1
            {
            pushFollow(FOLLOW_13);
            rule__Event__ProxSensorAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getProxSensorAssignment_3_1()); 

            }

            // InternalThymioDSL.g:1317:2: ( ( rule__Event__ProxSensorAssignment_3_1 )* )
            // InternalThymioDSL.g:1318:3: ( rule__Event__ProxSensorAssignment_3_1 )*
            {
             before(grammarAccess.getEventAccess().getProxSensorAssignment_3_1()); 
            // InternalThymioDSL.g:1319:3: ( rule__Event__ProxSensorAssignment_3_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=39 && LA17_0<=45)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalThymioDSL.g:1319:4: rule__Event__ProxSensorAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Event__ProxSensorAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getEventAccess().getProxSensorAssignment_3_1()); 

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
    // $ANTLR end "rule__Event__Group_3__1__Impl"


    // $ANTLR start "rule__Event__Group_4__0"
    // InternalThymioDSL.g:1329:1: rule__Event__Group_4__0 : rule__Event__Group_4__0__Impl rule__Event__Group_4__1 ;
    public final void rule__Event__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1333:1: ( rule__Event__Group_4__0__Impl rule__Event__Group_4__1 )
            // InternalThymioDSL.g:1334:2: rule__Event__Group_4__0__Impl rule__Event__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__Event__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_4__1();

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
    // $ANTLR end "rule__Event__Group_4__0"


    // $ANTLR start "rule__Event__Group_4__0__Impl"
    // InternalThymioDSL.g:1341:1: rule__Event__Group_4__0__Impl : ( 'bottom_sensor_detects_color:' ) ;
    public final void rule__Event__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1345:1: ( ( 'bottom_sensor_detects_color:' ) )
            // InternalThymioDSL.g:1346:1: ( 'bottom_sensor_detects_color:' )
            {
            // InternalThymioDSL.g:1346:1: ( 'bottom_sensor_detects_color:' )
            // InternalThymioDSL.g:1347:2: 'bottom_sensor_detects_color:'
            {
             before(grammarAccess.getEventAccess().getBottom_sensor_detects_colorKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getBottom_sensor_detects_colorKeyword_4_0()); 

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
    // $ANTLR end "rule__Event__Group_4__0__Impl"


    // $ANTLR start "rule__Event__Group_4__1"
    // InternalThymioDSL.g:1356:1: rule__Event__Group_4__1 : rule__Event__Group_4__1__Impl ;
    public final void rule__Event__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1360:1: ( rule__Event__Group_4__1__Impl )
            // InternalThymioDSL.g:1361:2: rule__Event__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_4__1__Impl();

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
    // $ANTLR end "rule__Event__Group_4__1"


    // $ANTLR start "rule__Event__Group_4__1__Impl"
    // InternalThymioDSL.g:1367:1: rule__Event__Group_4__1__Impl : ( ( ( rule__Event__BottomSensorAssignment_4_1 ) ) ( ( rule__Event__BottomSensorAssignment_4_1 )* ) ) ;
    public final void rule__Event__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1371:1: ( ( ( ( rule__Event__BottomSensorAssignment_4_1 ) ) ( ( rule__Event__BottomSensorAssignment_4_1 )* ) ) )
            // InternalThymioDSL.g:1372:1: ( ( ( rule__Event__BottomSensorAssignment_4_1 ) ) ( ( rule__Event__BottomSensorAssignment_4_1 )* ) )
            {
            // InternalThymioDSL.g:1372:1: ( ( ( rule__Event__BottomSensorAssignment_4_1 ) ) ( ( rule__Event__BottomSensorAssignment_4_1 )* ) )
            // InternalThymioDSL.g:1373:2: ( ( rule__Event__BottomSensorAssignment_4_1 ) ) ( ( rule__Event__BottomSensorAssignment_4_1 )* )
            {
            // InternalThymioDSL.g:1373:2: ( ( rule__Event__BottomSensorAssignment_4_1 ) )
            // InternalThymioDSL.g:1374:3: ( rule__Event__BottomSensorAssignment_4_1 )
            {
             before(grammarAccess.getEventAccess().getBottomSensorAssignment_4_1()); 
            // InternalThymioDSL.g:1375:3: ( rule__Event__BottomSensorAssignment_4_1 )
            // InternalThymioDSL.g:1375:4: rule__Event__BottomSensorAssignment_4_1
            {
            pushFollow(FOLLOW_15);
            rule__Event__BottomSensorAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getBottomSensorAssignment_4_1()); 

            }

            // InternalThymioDSL.g:1378:2: ( ( rule__Event__BottomSensorAssignment_4_1 )* )
            // InternalThymioDSL.g:1379:3: ( rule__Event__BottomSensorAssignment_4_1 )*
            {
             before(grammarAccess.getEventAccess().getBottomSensorAssignment_4_1()); 
            // InternalThymioDSL.g:1380:3: ( rule__Event__BottomSensorAssignment_4_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==46) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalThymioDSL.g:1380:4: rule__Event__BottomSensorAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Event__BottomSensorAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getEventAccess().getBottomSensorAssignment_4_1()); 

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
    // $ANTLR end "rule__Event__Group_4__1__Impl"


    // $ANTLR start "rule__ProxSensor__Group_0__0"
    // InternalThymioDSL.g:1390:1: rule__ProxSensor__Group_0__0 : rule__ProxSensor__Group_0__0__Impl rule__ProxSensor__Group_0__1 ;
    public final void rule__ProxSensor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1394:1: ( rule__ProxSensor__Group_0__0__Impl rule__ProxSensor__Group_0__1 )
            // InternalThymioDSL.g:1395:2: rule__ProxSensor__Group_0__0__Impl rule__ProxSensor__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__ProxSensor__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProxSensor__Group_0__1();

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
    // $ANTLR end "rule__ProxSensor__Group_0__0"


    // $ANTLR start "rule__ProxSensor__Group_0__0__Impl"
    // InternalThymioDSL.g:1402:1: rule__ProxSensor__Group_0__0__Impl : ( 'back_left:' ) ;
    public final void rule__ProxSensor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1406:1: ( ( 'back_left:' ) )
            // InternalThymioDSL.g:1407:1: ( 'back_left:' )
            {
            // InternalThymioDSL.g:1407:1: ( 'back_left:' )
            // InternalThymioDSL.g:1408:2: 'back_left:'
            {
             before(grammarAccess.getProxSensorAccess().getBack_leftKeyword_0_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getProxSensorAccess().getBack_leftKeyword_0_0()); 

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
    // $ANTLR end "rule__ProxSensor__Group_0__0__Impl"


    // $ANTLR start "rule__ProxSensor__Group_0__1"
    // InternalThymioDSL.g:1417:1: rule__ProxSensor__Group_0__1 : rule__ProxSensor__Group_0__1__Impl ;
    public final void rule__ProxSensor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1421:1: ( rule__ProxSensor__Group_0__1__Impl )
            // InternalThymioDSL.g:1422:2: rule__ProxSensor__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProxSensor__Group_0__1__Impl();

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
    // $ANTLR end "rule__ProxSensor__Group_0__1"


    // $ANTLR start "rule__ProxSensor__Group_0__1__Impl"
    // InternalThymioDSL.g:1428:1: rule__ProxSensor__Group_0__1__Impl : ( ( rule__ProxSensor__BackLeftSensorAssignment_0_1 ) ) ;
    public final void rule__ProxSensor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1432:1: ( ( ( rule__ProxSensor__BackLeftSensorAssignment_0_1 ) ) )
            // InternalThymioDSL.g:1433:1: ( ( rule__ProxSensor__BackLeftSensorAssignment_0_1 ) )
            {
            // InternalThymioDSL.g:1433:1: ( ( rule__ProxSensor__BackLeftSensorAssignment_0_1 ) )
            // InternalThymioDSL.g:1434:2: ( rule__ProxSensor__BackLeftSensorAssignment_0_1 )
            {
             before(grammarAccess.getProxSensorAccess().getBackLeftSensorAssignment_0_1()); 
            // InternalThymioDSL.g:1435:2: ( rule__ProxSensor__BackLeftSensorAssignment_0_1 )
            // InternalThymioDSL.g:1435:3: rule__ProxSensor__BackLeftSensorAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ProxSensor__BackLeftSensorAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getProxSensorAccess().getBackLeftSensorAssignment_0_1()); 

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
    // $ANTLR end "rule__ProxSensor__Group_0__1__Impl"


    // $ANTLR start "rule__ProxSensor__Group_1__0"
    // InternalThymioDSL.g:1444:1: rule__ProxSensor__Group_1__0 : rule__ProxSensor__Group_1__0__Impl rule__ProxSensor__Group_1__1 ;
    public final void rule__ProxSensor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1448:1: ( rule__ProxSensor__Group_1__0__Impl rule__ProxSensor__Group_1__1 )
            // InternalThymioDSL.g:1449:2: rule__ProxSensor__Group_1__0__Impl rule__ProxSensor__Group_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalThymioDSL.g:1456:1: rule__ProxSensor__Group_1__0__Impl : ( 'back_right:' ) ;
    public final void rule__ProxSensor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1460:1: ( ( 'back_right:' ) )
            // InternalThymioDSL.g:1461:1: ( 'back_right:' )
            {
            // InternalThymioDSL.g:1461:1: ( 'back_right:' )
            // InternalThymioDSL.g:1462:2: 'back_right:'
            {
             before(grammarAccess.getProxSensorAccess().getBack_rightKeyword_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getProxSensorAccess().getBack_rightKeyword_1_0()); 

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
    // InternalThymioDSL.g:1471:1: rule__ProxSensor__Group_1__1 : rule__ProxSensor__Group_1__1__Impl ;
    public final void rule__ProxSensor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1475:1: ( rule__ProxSensor__Group_1__1__Impl )
            // InternalThymioDSL.g:1476:2: rule__ProxSensor__Group_1__1__Impl
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
    // InternalThymioDSL.g:1482:1: rule__ProxSensor__Group_1__1__Impl : ( ( rule__ProxSensor__BackRightSensorAssignment_1_1 ) ) ;
    public final void rule__ProxSensor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1486:1: ( ( ( rule__ProxSensor__BackRightSensorAssignment_1_1 ) ) )
            // InternalThymioDSL.g:1487:1: ( ( rule__ProxSensor__BackRightSensorAssignment_1_1 ) )
            {
            // InternalThymioDSL.g:1487:1: ( ( rule__ProxSensor__BackRightSensorAssignment_1_1 ) )
            // InternalThymioDSL.g:1488:2: ( rule__ProxSensor__BackRightSensorAssignment_1_1 )
            {
             before(grammarAccess.getProxSensorAccess().getBackRightSensorAssignment_1_1()); 
            // InternalThymioDSL.g:1489:2: ( rule__ProxSensor__BackRightSensorAssignment_1_1 )
            // InternalThymioDSL.g:1489:3: rule__ProxSensor__BackRightSensorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ProxSensor__BackRightSensorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getProxSensorAccess().getBackRightSensorAssignment_1_1()); 

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
    // InternalThymioDSL.g:1498:1: rule__ProxSensor__Group_2__0 : rule__ProxSensor__Group_2__0__Impl rule__ProxSensor__Group_2__1 ;
    public final void rule__ProxSensor__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1502:1: ( rule__ProxSensor__Group_2__0__Impl rule__ProxSensor__Group_2__1 )
            // InternalThymioDSL.g:1503:2: rule__ProxSensor__Group_2__0__Impl rule__ProxSensor__Group_2__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalThymioDSL.g:1510:1: rule__ProxSensor__Group_2__0__Impl : ( 'front_right:' ) ;
    public final void rule__ProxSensor__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1514:1: ( ( 'front_right:' ) )
            // InternalThymioDSL.g:1515:1: ( 'front_right:' )
            {
            // InternalThymioDSL.g:1515:1: ( 'front_right:' )
            // InternalThymioDSL.g:1516:2: 'front_right:'
            {
             before(grammarAccess.getProxSensorAccess().getFront_rightKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getProxSensorAccess().getFront_rightKeyword_2_0()); 

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
    // InternalThymioDSL.g:1525:1: rule__ProxSensor__Group_2__1 : rule__ProxSensor__Group_2__1__Impl ;
    public final void rule__ProxSensor__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1529:1: ( rule__ProxSensor__Group_2__1__Impl )
            // InternalThymioDSL.g:1530:2: rule__ProxSensor__Group_2__1__Impl
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
    // InternalThymioDSL.g:1536:1: rule__ProxSensor__Group_2__1__Impl : ( ( rule__ProxSensor__FrontRightSensorAssignment_2_1 ) ) ;
    public final void rule__ProxSensor__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1540:1: ( ( ( rule__ProxSensor__FrontRightSensorAssignment_2_1 ) ) )
            // InternalThymioDSL.g:1541:1: ( ( rule__ProxSensor__FrontRightSensorAssignment_2_1 ) )
            {
            // InternalThymioDSL.g:1541:1: ( ( rule__ProxSensor__FrontRightSensorAssignment_2_1 ) )
            // InternalThymioDSL.g:1542:2: ( rule__ProxSensor__FrontRightSensorAssignment_2_1 )
            {
             before(grammarAccess.getProxSensorAccess().getFrontRightSensorAssignment_2_1()); 
            // InternalThymioDSL.g:1543:2: ( rule__ProxSensor__FrontRightSensorAssignment_2_1 )
            // InternalThymioDSL.g:1543:3: rule__ProxSensor__FrontRightSensorAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ProxSensor__FrontRightSensorAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getProxSensorAccess().getFrontRightSensorAssignment_2_1()); 

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
    // InternalThymioDSL.g:1552:1: rule__ProxSensor__Group_3__0 : rule__ProxSensor__Group_3__0__Impl rule__ProxSensor__Group_3__1 ;
    public final void rule__ProxSensor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1556:1: ( rule__ProxSensor__Group_3__0__Impl rule__ProxSensor__Group_3__1 )
            // InternalThymioDSL.g:1557:2: rule__ProxSensor__Group_3__0__Impl rule__ProxSensor__Group_3__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalThymioDSL.g:1564:1: rule__ProxSensor__Group_3__0__Impl : ( 'front_center_right:' ) ;
    public final void rule__ProxSensor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1568:1: ( ( 'front_center_right:' ) )
            // InternalThymioDSL.g:1569:1: ( 'front_center_right:' )
            {
            // InternalThymioDSL.g:1569:1: ( 'front_center_right:' )
            // InternalThymioDSL.g:1570:2: 'front_center_right:'
            {
             before(grammarAccess.getProxSensorAccess().getFront_center_rightKeyword_3_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getProxSensorAccess().getFront_center_rightKeyword_3_0()); 

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
    // InternalThymioDSL.g:1579:1: rule__ProxSensor__Group_3__1 : rule__ProxSensor__Group_3__1__Impl ;
    public final void rule__ProxSensor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1583:1: ( rule__ProxSensor__Group_3__1__Impl )
            // InternalThymioDSL.g:1584:2: rule__ProxSensor__Group_3__1__Impl
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
    // InternalThymioDSL.g:1590:1: rule__ProxSensor__Group_3__1__Impl : ( ( rule__ProxSensor__FrontCenterRightSensorAssignment_3_1 ) ) ;
    public final void rule__ProxSensor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1594:1: ( ( ( rule__ProxSensor__FrontCenterRightSensorAssignment_3_1 ) ) )
            // InternalThymioDSL.g:1595:1: ( ( rule__ProxSensor__FrontCenterRightSensorAssignment_3_1 ) )
            {
            // InternalThymioDSL.g:1595:1: ( ( rule__ProxSensor__FrontCenterRightSensorAssignment_3_1 ) )
            // InternalThymioDSL.g:1596:2: ( rule__ProxSensor__FrontCenterRightSensorAssignment_3_1 )
            {
             before(grammarAccess.getProxSensorAccess().getFrontCenterRightSensorAssignment_3_1()); 
            // InternalThymioDSL.g:1597:2: ( rule__ProxSensor__FrontCenterRightSensorAssignment_3_1 )
            // InternalThymioDSL.g:1597:3: rule__ProxSensor__FrontCenterRightSensorAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ProxSensor__FrontCenterRightSensorAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProxSensorAccess().getFrontCenterRightSensorAssignment_3_1()); 

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
    // InternalThymioDSL.g:1606:1: rule__ProxSensor__Group_4__0 : rule__ProxSensor__Group_4__0__Impl rule__ProxSensor__Group_4__1 ;
    public final void rule__ProxSensor__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1610:1: ( rule__ProxSensor__Group_4__0__Impl rule__ProxSensor__Group_4__1 )
            // InternalThymioDSL.g:1611:2: rule__ProxSensor__Group_4__0__Impl rule__ProxSensor__Group_4__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalThymioDSL.g:1618:1: rule__ProxSensor__Group_4__0__Impl : ( 'front_center:' ) ;
    public final void rule__ProxSensor__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1622:1: ( ( 'front_center:' ) )
            // InternalThymioDSL.g:1623:1: ( 'front_center:' )
            {
            // InternalThymioDSL.g:1623:1: ( 'front_center:' )
            // InternalThymioDSL.g:1624:2: 'front_center:'
            {
             before(grammarAccess.getProxSensorAccess().getFront_centerKeyword_4_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getProxSensorAccess().getFront_centerKeyword_4_0()); 

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
    // InternalThymioDSL.g:1633:1: rule__ProxSensor__Group_4__1 : rule__ProxSensor__Group_4__1__Impl ;
    public final void rule__ProxSensor__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1637:1: ( rule__ProxSensor__Group_4__1__Impl )
            // InternalThymioDSL.g:1638:2: rule__ProxSensor__Group_4__1__Impl
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
    // InternalThymioDSL.g:1644:1: rule__ProxSensor__Group_4__1__Impl : ( ( rule__ProxSensor__FrontCenterSensorAssignment_4_1 ) ) ;
    public final void rule__ProxSensor__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1648:1: ( ( ( rule__ProxSensor__FrontCenterSensorAssignment_4_1 ) ) )
            // InternalThymioDSL.g:1649:1: ( ( rule__ProxSensor__FrontCenterSensorAssignment_4_1 ) )
            {
            // InternalThymioDSL.g:1649:1: ( ( rule__ProxSensor__FrontCenterSensorAssignment_4_1 ) )
            // InternalThymioDSL.g:1650:2: ( rule__ProxSensor__FrontCenterSensorAssignment_4_1 )
            {
             before(grammarAccess.getProxSensorAccess().getFrontCenterSensorAssignment_4_1()); 
            // InternalThymioDSL.g:1651:2: ( rule__ProxSensor__FrontCenterSensorAssignment_4_1 )
            // InternalThymioDSL.g:1651:3: rule__ProxSensor__FrontCenterSensorAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ProxSensor__FrontCenterSensorAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getProxSensorAccess().getFrontCenterSensorAssignment_4_1()); 

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
    // InternalThymioDSL.g:1660:1: rule__ProxSensor__Group_5__0 : rule__ProxSensor__Group_5__0__Impl rule__ProxSensor__Group_5__1 ;
    public final void rule__ProxSensor__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1664:1: ( rule__ProxSensor__Group_5__0__Impl rule__ProxSensor__Group_5__1 )
            // InternalThymioDSL.g:1665:2: rule__ProxSensor__Group_5__0__Impl rule__ProxSensor__Group_5__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalThymioDSL.g:1672:1: rule__ProxSensor__Group_5__0__Impl : ( 'front_center_left:' ) ;
    public final void rule__ProxSensor__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1676:1: ( ( 'front_center_left:' ) )
            // InternalThymioDSL.g:1677:1: ( 'front_center_left:' )
            {
            // InternalThymioDSL.g:1677:1: ( 'front_center_left:' )
            // InternalThymioDSL.g:1678:2: 'front_center_left:'
            {
             before(grammarAccess.getProxSensorAccess().getFront_center_leftKeyword_5_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getProxSensorAccess().getFront_center_leftKeyword_5_0()); 

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
    // InternalThymioDSL.g:1687:1: rule__ProxSensor__Group_5__1 : rule__ProxSensor__Group_5__1__Impl ;
    public final void rule__ProxSensor__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1691:1: ( rule__ProxSensor__Group_5__1__Impl )
            // InternalThymioDSL.g:1692:2: rule__ProxSensor__Group_5__1__Impl
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
    // InternalThymioDSL.g:1698:1: rule__ProxSensor__Group_5__1__Impl : ( ( rule__ProxSensor__FrontCenterLeftSensorAssignment_5_1 ) ) ;
    public final void rule__ProxSensor__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1702:1: ( ( ( rule__ProxSensor__FrontCenterLeftSensorAssignment_5_1 ) ) )
            // InternalThymioDSL.g:1703:1: ( ( rule__ProxSensor__FrontCenterLeftSensorAssignment_5_1 ) )
            {
            // InternalThymioDSL.g:1703:1: ( ( rule__ProxSensor__FrontCenterLeftSensorAssignment_5_1 ) )
            // InternalThymioDSL.g:1704:2: ( rule__ProxSensor__FrontCenterLeftSensorAssignment_5_1 )
            {
             before(grammarAccess.getProxSensorAccess().getFrontCenterLeftSensorAssignment_5_1()); 
            // InternalThymioDSL.g:1705:2: ( rule__ProxSensor__FrontCenterLeftSensorAssignment_5_1 )
            // InternalThymioDSL.g:1705:3: rule__ProxSensor__FrontCenterLeftSensorAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ProxSensor__FrontCenterLeftSensorAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getProxSensorAccess().getFrontCenterLeftSensorAssignment_5_1()); 

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
    // InternalThymioDSL.g:1714:1: rule__ProxSensor__Group_6__0 : rule__ProxSensor__Group_6__0__Impl rule__ProxSensor__Group_6__1 ;
    public final void rule__ProxSensor__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1718:1: ( rule__ProxSensor__Group_6__0__Impl rule__ProxSensor__Group_6__1 )
            // InternalThymioDSL.g:1719:2: rule__ProxSensor__Group_6__0__Impl rule__ProxSensor__Group_6__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalThymioDSL.g:1726:1: rule__ProxSensor__Group_6__0__Impl : ( 'front_left:' ) ;
    public final void rule__ProxSensor__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1730:1: ( ( 'front_left:' ) )
            // InternalThymioDSL.g:1731:1: ( 'front_left:' )
            {
            // InternalThymioDSL.g:1731:1: ( 'front_left:' )
            // InternalThymioDSL.g:1732:2: 'front_left:'
            {
             before(grammarAccess.getProxSensorAccess().getFront_leftKeyword_6_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getProxSensorAccess().getFront_leftKeyword_6_0()); 

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
    // InternalThymioDSL.g:1741:1: rule__ProxSensor__Group_6__1 : rule__ProxSensor__Group_6__1__Impl ;
    public final void rule__ProxSensor__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1745:1: ( rule__ProxSensor__Group_6__1__Impl )
            // InternalThymioDSL.g:1746:2: rule__ProxSensor__Group_6__1__Impl
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
    // InternalThymioDSL.g:1752:1: rule__ProxSensor__Group_6__1__Impl : ( ( rule__ProxSensor__FrontLeftSensorAssignment_6_1 ) ) ;
    public final void rule__ProxSensor__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1756:1: ( ( ( rule__ProxSensor__FrontLeftSensorAssignment_6_1 ) ) )
            // InternalThymioDSL.g:1757:1: ( ( rule__ProxSensor__FrontLeftSensorAssignment_6_1 ) )
            {
            // InternalThymioDSL.g:1757:1: ( ( rule__ProxSensor__FrontLeftSensorAssignment_6_1 ) )
            // InternalThymioDSL.g:1758:2: ( rule__ProxSensor__FrontLeftSensorAssignment_6_1 )
            {
             before(grammarAccess.getProxSensorAccess().getFrontLeftSensorAssignment_6_1()); 
            // InternalThymioDSL.g:1759:2: ( rule__ProxSensor__FrontLeftSensorAssignment_6_1 )
            // InternalThymioDSL.g:1759:3: rule__ProxSensor__FrontLeftSensorAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ProxSensor__FrontLeftSensorAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getProxSensorAccess().getFrontLeftSensorAssignment_6_1()); 

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


    // $ANTLR start "rule__BottomSensor__Group__0"
    // InternalThymioDSL.g:1768:1: rule__BottomSensor__Group__0 : rule__BottomSensor__Group__0__Impl rule__BottomSensor__Group__1 ;
    public final void rule__BottomSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1772:1: ( rule__BottomSensor__Group__0__Impl rule__BottomSensor__Group__1 )
            // InternalThymioDSL.g:1773:2: rule__BottomSensor__Group__0__Impl rule__BottomSensor__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalThymioDSL.g:1780:1: rule__BottomSensor__Group__0__Impl : ( ( rule__BottomSensor__Group_0__0 ) ) ;
    public final void rule__BottomSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1784:1: ( ( ( rule__BottomSensor__Group_0__0 ) ) )
            // InternalThymioDSL.g:1785:1: ( ( rule__BottomSensor__Group_0__0 ) )
            {
            // InternalThymioDSL.g:1785:1: ( ( rule__BottomSensor__Group_0__0 ) )
            // InternalThymioDSL.g:1786:2: ( rule__BottomSensor__Group_0__0 )
            {
             before(grammarAccess.getBottomSensorAccess().getGroup_0()); 
            // InternalThymioDSL.g:1787:2: ( rule__BottomSensor__Group_0__0 )
            // InternalThymioDSL.g:1787:3: rule__BottomSensor__Group_0__0
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
    // InternalThymioDSL.g:1795:1: rule__BottomSensor__Group__1 : rule__BottomSensor__Group__1__Impl ;
    public final void rule__BottomSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1799:1: ( rule__BottomSensor__Group__1__Impl )
            // InternalThymioDSL.g:1800:2: rule__BottomSensor__Group__1__Impl
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
    // InternalThymioDSL.g:1806:1: rule__BottomSensor__Group__1__Impl : ( ( rule__BottomSensor__Group_1__0 ) ) ;
    public final void rule__BottomSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1810:1: ( ( ( rule__BottomSensor__Group_1__0 ) ) )
            // InternalThymioDSL.g:1811:1: ( ( rule__BottomSensor__Group_1__0 ) )
            {
            // InternalThymioDSL.g:1811:1: ( ( rule__BottomSensor__Group_1__0 ) )
            // InternalThymioDSL.g:1812:2: ( rule__BottomSensor__Group_1__0 )
            {
             before(grammarAccess.getBottomSensorAccess().getGroup_1()); 
            // InternalThymioDSL.g:1813:2: ( rule__BottomSensor__Group_1__0 )
            // InternalThymioDSL.g:1813:3: rule__BottomSensor__Group_1__0
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
    // InternalThymioDSL.g:1822:1: rule__BottomSensor__Group_0__0 : rule__BottomSensor__Group_0__0__Impl rule__BottomSensor__Group_0__1 ;
    public final void rule__BottomSensor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1826:1: ( rule__BottomSensor__Group_0__0__Impl rule__BottomSensor__Group_0__1 )
            // InternalThymioDSL.g:1827:2: rule__BottomSensor__Group_0__0__Impl rule__BottomSensor__Group_0__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalThymioDSL.g:1834:1: rule__BottomSensor__Group_0__0__Impl : ( 'left:' ) ;
    public final void rule__BottomSensor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1838:1: ( ( 'left:' ) )
            // InternalThymioDSL.g:1839:1: ( 'left:' )
            {
            // InternalThymioDSL.g:1839:1: ( 'left:' )
            // InternalThymioDSL.g:1840:2: 'left:'
            {
             before(grammarAccess.getBottomSensorAccess().getLeftKeyword_0_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalThymioDSL.g:1849:1: rule__BottomSensor__Group_0__1 : rule__BottomSensor__Group_0__1__Impl ;
    public final void rule__BottomSensor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1853:1: ( rule__BottomSensor__Group_0__1__Impl )
            // InternalThymioDSL.g:1854:2: rule__BottomSensor__Group_0__1__Impl
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
    // InternalThymioDSL.g:1860:1: rule__BottomSensor__Group_0__1__Impl : ( ( rule__BottomSensor__BottomLeftSensorAssignment_0_1 ) ) ;
    public final void rule__BottomSensor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1864:1: ( ( ( rule__BottomSensor__BottomLeftSensorAssignment_0_1 ) ) )
            // InternalThymioDSL.g:1865:1: ( ( rule__BottomSensor__BottomLeftSensorAssignment_0_1 ) )
            {
            // InternalThymioDSL.g:1865:1: ( ( rule__BottomSensor__BottomLeftSensorAssignment_0_1 ) )
            // InternalThymioDSL.g:1866:2: ( rule__BottomSensor__BottomLeftSensorAssignment_0_1 )
            {
             before(grammarAccess.getBottomSensorAccess().getBottomLeftSensorAssignment_0_1()); 
            // InternalThymioDSL.g:1867:2: ( rule__BottomSensor__BottomLeftSensorAssignment_0_1 )
            // InternalThymioDSL.g:1867:3: rule__BottomSensor__BottomLeftSensorAssignment_0_1
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
    // InternalThymioDSL.g:1876:1: rule__BottomSensor__Group_1__0 : rule__BottomSensor__Group_1__0__Impl rule__BottomSensor__Group_1__1 ;
    public final void rule__BottomSensor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1880:1: ( rule__BottomSensor__Group_1__0__Impl rule__BottomSensor__Group_1__1 )
            // InternalThymioDSL.g:1881:2: rule__BottomSensor__Group_1__0__Impl rule__BottomSensor__Group_1__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalThymioDSL.g:1888:1: rule__BottomSensor__Group_1__0__Impl : ( 'right:' ) ;
    public final void rule__BottomSensor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1892:1: ( ( 'right:' ) )
            // InternalThymioDSL.g:1893:1: ( 'right:' )
            {
            // InternalThymioDSL.g:1893:1: ( 'right:' )
            // InternalThymioDSL.g:1894:2: 'right:'
            {
             before(grammarAccess.getBottomSensorAccess().getRightKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalThymioDSL.g:1903:1: rule__BottomSensor__Group_1__1 : rule__BottomSensor__Group_1__1__Impl ;
    public final void rule__BottomSensor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1907:1: ( rule__BottomSensor__Group_1__1__Impl )
            // InternalThymioDSL.g:1908:2: rule__BottomSensor__Group_1__1__Impl
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
    // InternalThymioDSL.g:1914:1: rule__BottomSensor__Group_1__1__Impl : ( ( rule__BottomSensor__BottomRightSensorAssignment_1_1 ) ) ;
    public final void rule__BottomSensor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1918:1: ( ( ( rule__BottomSensor__BottomRightSensorAssignment_1_1 ) ) )
            // InternalThymioDSL.g:1919:1: ( ( rule__BottomSensor__BottomRightSensorAssignment_1_1 ) )
            {
            // InternalThymioDSL.g:1919:1: ( ( rule__BottomSensor__BottomRightSensorAssignment_1_1 ) )
            // InternalThymioDSL.g:1920:2: ( rule__BottomSensor__BottomRightSensorAssignment_1_1 )
            {
             before(grammarAccess.getBottomSensorAccess().getBottomRightSensorAssignment_1_1()); 
            // InternalThymioDSL.g:1921:2: ( rule__BottomSensor__BottomRightSensorAssignment_1_1 )
            // InternalThymioDSL.g:1921:3: rule__BottomSensor__BottomRightSensorAssignment_1_1
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
    // InternalThymioDSL.g:1930:1: rule__Action__Group_0__0 : rule__Action__Group_0__0__Impl rule__Action__Group_0__1 ;
    public final void rule__Action__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1934:1: ( rule__Action__Group_0__0__Impl rule__Action__Group_0__1 )
            // InternalThymioDSL.g:1935:2: rule__Action__Group_0__0__Impl rule__Action__Group_0__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalThymioDSL.g:1942:1: rule__Action__Group_0__0__Impl : ( 'move:' ) ;
    public final void rule__Action__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1946:1: ( ( 'move:' ) )
            // InternalThymioDSL.g:1947:1: ( 'move:' )
            {
            // InternalThymioDSL.g:1947:1: ( 'move:' )
            // InternalThymioDSL.g:1948:2: 'move:'
            {
             before(grammarAccess.getActionAccess().getMoveKeyword_0_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalThymioDSL.g:1957:1: rule__Action__Group_0__1 : rule__Action__Group_0__1__Impl ;
    public final void rule__Action__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1961:1: ( rule__Action__Group_0__1__Impl )
            // InternalThymioDSL.g:1962:2: rule__Action__Group_0__1__Impl
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
    // InternalThymioDSL.g:1968:1: rule__Action__Group_0__1__Impl : ( ( rule__Action__MoveAssignment_0_1 ) ) ;
    public final void rule__Action__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1972:1: ( ( ( rule__Action__MoveAssignment_0_1 ) ) )
            // InternalThymioDSL.g:1973:1: ( ( rule__Action__MoveAssignment_0_1 ) )
            {
            // InternalThymioDSL.g:1973:1: ( ( rule__Action__MoveAssignment_0_1 ) )
            // InternalThymioDSL.g:1974:2: ( rule__Action__MoveAssignment_0_1 )
            {
             before(grammarAccess.getActionAccess().getMoveAssignment_0_1()); 
            // InternalThymioDSL.g:1975:2: ( rule__Action__MoveAssignment_0_1 )
            // InternalThymioDSL.g:1975:3: rule__Action__MoveAssignment_0_1
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
    // InternalThymioDSL.g:1984:1: rule__Action__Group_1__0 : rule__Action__Group_1__0__Impl rule__Action__Group_1__1 ;
    public final void rule__Action__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1988:1: ( rule__Action__Group_1__0__Impl rule__Action__Group_1__1 )
            // InternalThymioDSL.g:1989:2: rule__Action__Group_1__0__Impl rule__Action__Group_1__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalThymioDSL.g:1996:1: rule__Action__Group_1__0__Impl : ( 'lights:' ) ;
    public final void rule__Action__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2000:1: ( ( 'lights:' ) )
            // InternalThymioDSL.g:2001:1: ( 'lights:' )
            {
            // InternalThymioDSL.g:2001:1: ( 'lights:' )
            // InternalThymioDSL.g:2002:2: 'lights:'
            {
             before(grammarAccess.getActionAccess().getLightsKeyword_1_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalThymioDSL.g:2011:1: rule__Action__Group_1__1 : rule__Action__Group_1__1__Impl ;
    public final void rule__Action__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2015:1: ( rule__Action__Group_1__1__Impl )
            // InternalThymioDSL.g:2016:2: rule__Action__Group_1__1__Impl
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
    // InternalThymioDSL.g:2022:1: rule__Action__Group_1__1__Impl : ( ( rule__Action__LightAssignment_1_1 ) ) ;
    public final void rule__Action__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2026:1: ( ( ( rule__Action__LightAssignment_1_1 ) ) )
            // InternalThymioDSL.g:2027:1: ( ( rule__Action__LightAssignment_1_1 ) )
            {
            // InternalThymioDSL.g:2027:1: ( ( rule__Action__LightAssignment_1_1 ) )
            // InternalThymioDSL.g:2028:2: ( rule__Action__LightAssignment_1_1 )
            {
             before(grammarAccess.getActionAccess().getLightAssignment_1_1()); 
            // InternalThymioDSL.g:2029:2: ( rule__Action__LightAssignment_1_1 )
            // InternalThymioDSL.g:2029:3: rule__Action__LightAssignment_1_1
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
    // InternalThymioDSL.g:2038:1: rule__Action__Group_2__0 : rule__Action__Group_2__0__Impl rule__Action__Group_2__1 ;
    public final void rule__Action__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2042:1: ( rule__Action__Group_2__0__Impl rule__Action__Group_2__1 )
            // InternalThymioDSL.g:2043:2: rule__Action__Group_2__0__Impl rule__Action__Group_2__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalThymioDSL.g:2050:1: rule__Action__Group_2__0__Impl : ( 'sound:' ) ;
    public final void rule__Action__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2054:1: ( ( 'sound:' ) )
            // InternalThymioDSL.g:2055:1: ( 'sound:' )
            {
            // InternalThymioDSL.g:2055:1: ( 'sound:' )
            // InternalThymioDSL.g:2056:2: 'sound:'
            {
             before(grammarAccess.getActionAccess().getSoundKeyword_2_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalThymioDSL.g:2065:1: rule__Action__Group_2__1 : rule__Action__Group_2__1__Impl ;
    public final void rule__Action__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2069:1: ( rule__Action__Group_2__1__Impl )
            // InternalThymioDSL.g:2070:2: rule__Action__Group_2__1__Impl
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
    // InternalThymioDSL.g:2076:1: rule__Action__Group_2__1__Impl : ( ( ( rule__Action__SoundAssignment_2_1 ) ) ( ( rule__Action__SoundAssignment_2_1 )* ) ) ;
    public final void rule__Action__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2080:1: ( ( ( ( rule__Action__SoundAssignment_2_1 ) ) ( ( rule__Action__SoundAssignment_2_1 )* ) ) )
            // InternalThymioDSL.g:2081:1: ( ( ( rule__Action__SoundAssignment_2_1 ) ) ( ( rule__Action__SoundAssignment_2_1 )* ) )
            {
            // InternalThymioDSL.g:2081:1: ( ( ( rule__Action__SoundAssignment_2_1 ) ) ( ( rule__Action__SoundAssignment_2_1 )* ) )
            // InternalThymioDSL.g:2082:2: ( ( rule__Action__SoundAssignment_2_1 ) ) ( ( rule__Action__SoundAssignment_2_1 )* )
            {
            // InternalThymioDSL.g:2082:2: ( ( rule__Action__SoundAssignment_2_1 ) )
            // InternalThymioDSL.g:2083:3: ( rule__Action__SoundAssignment_2_1 )
            {
             before(grammarAccess.getActionAccess().getSoundAssignment_2_1()); 
            // InternalThymioDSL.g:2084:3: ( rule__Action__SoundAssignment_2_1 )
            // InternalThymioDSL.g:2084:4: rule__Action__SoundAssignment_2_1
            {
            pushFollow(FOLLOW_22);
            rule__Action__SoundAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getSoundAssignment_2_1()); 

            }

            // InternalThymioDSL.g:2087:2: ( ( rule__Action__SoundAssignment_2_1 )* )
            // InternalThymioDSL.g:2088:3: ( rule__Action__SoundAssignment_2_1 )*
            {
             before(grammarAccess.getActionAccess().getSoundAssignment_2_1()); 
            // InternalThymioDSL.g:2089:3: ( rule__Action__SoundAssignment_2_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==59) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalThymioDSL.g:2089:4: rule__Action__SoundAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Action__SoundAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalThymioDSL.g:2099:1: rule__Motors__Group__0 : rule__Motors__Group__0__Impl rule__Motors__Group__1 ;
    public final void rule__Motors__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2103:1: ( rule__Motors__Group__0__Impl rule__Motors__Group__1 )
            // InternalThymioDSL.g:2104:2: rule__Motors__Group__0__Impl rule__Motors__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalThymioDSL.g:2111:1: rule__Motors__Group__0__Impl : ( 'left_motor:' ) ;
    public final void rule__Motors__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2115:1: ( ( 'left_motor:' ) )
            // InternalThymioDSL.g:2116:1: ( 'left_motor:' )
            {
            // InternalThymioDSL.g:2116:1: ( 'left_motor:' )
            // InternalThymioDSL.g:2117:2: 'left_motor:'
            {
             before(grammarAccess.getMotorsAccess().getLeft_motorKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalThymioDSL.g:2126:1: rule__Motors__Group__1 : rule__Motors__Group__1__Impl rule__Motors__Group__2 ;
    public final void rule__Motors__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2130:1: ( rule__Motors__Group__1__Impl rule__Motors__Group__2 )
            // InternalThymioDSL.g:2131:2: rule__Motors__Group__1__Impl rule__Motors__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalThymioDSL.g:2138:1: rule__Motors__Group__1__Impl : ( ( rule__Motors__LeftAssignment_1 ) ) ;
    public final void rule__Motors__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2142:1: ( ( ( rule__Motors__LeftAssignment_1 ) ) )
            // InternalThymioDSL.g:2143:1: ( ( rule__Motors__LeftAssignment_1 ) )
            {
            // InternalThymioDSL.g:2143:1: ( ( rule__Motors__LeftAssignment_1 ) )
            // InternalThymioDSL.g:2144:2: ( rule__Motors__LeftAssignment_1 )
            {
             before(grammarAccess.getMotorsAccess().getLeftAssignment_1()); 
            // InternalThymioDSL.g:2145:2: ( rule__Motors__LeftAssignment_1 )
            // InternalThymioDSL.g:2145:3: rule__Motors__LeftAssignment_1
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
    // InternalThymioDSL.g:2153:1: rule__Motors__Group__2 : rule__Motors__Group__2__Impl rule__Motors__Group__3 ;
    public final void rule__Motors__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2157:1: ( rule__Motors__Group__2__Impl rule__Motors__Group__3 )
            // InternalThymioDSL.g:2158:2: rule__Motors__Group__2__Impl rule__Motors__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalThymioDSL.g:2165:1: rule__Motors__Group__2__Impl : ( 'right_motor:' ) ;
    public final void rule__Motors__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2169:1: ( ( 'right_motor:' ) )
            // InternalThymioDSL.g:2170:1: ( 'right_motor:' )
            {
            // InternalThymioDSL.g:2170:1: ( 'right_motor:' )
            // InternalThymioDSL.g:2171:2: 'right_motor:'
            {
             before(grammarAccess.getMotorsAccess().getRight_motorKeyword_2()); 
            match(input,52,FOLLOW_2); 
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
    // InternalThymioDSL.g:2180:1: rule__Motors__Group__3 : rule__Motors__Group__3__Impl ;
    public final void rule__Motors__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2184:1: ( rule__Motors__Group__3__Impl )
            // InternalThymioDSL.g:2185:2: rule__Motors__Group__3__Impl
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
    // InternalThymioDSL.g:2191:1: rule__Motors__Group__3__Impl : ( ( rule__Motors__RightAssignment_3 ) ) ;
    public final void rule__Motors__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2195:1: ( ( ( rule__Motors__RightAssignment_3 ) ) )
            // InternalThymioDSL.g:2196:1: ( ( rule__Motors__RightAssignment_3 ) )
            {
            // InternalThymioDSL.g:2196:1: ( ( rule__Motors__RightAssignment_3 ) )
            // InternalThymioDSL.g:2197:2: ( rule__Motors__RightAssignment_3 )
            {
             before(grammarAccess.getMotorsAccess().getRightAssignment_3()); 
            // InternalThymioDSL.g:2198:2: ( rule__Motors__RightAssignment_3 )
            // InternalThymioDSL.g:2198:3: rule__Motors__RightAssignment_3
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
    // InternalThymioDSL.g:2207:1: rule__Lights__Group__0 : rule__Lights__Group__0__Impl rule__Lights__Group__1 ;
    public final void rule__Lights__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2211:1: ( rule__Lights__Group__0__Impl rule__Lights__Group__1 )
            // InternalThymioDSL.g:2212:2: rule__Lights__Group__0__Impl rule__Lights__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalThymioDSL.g:2219:1: rule__Lights__Group__0__Impl : ( () ) ;
    public final void rule__Lights__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2223:1: ( ( () ) )
            // InternalThymioDSL.g:2224:1: ( () )
            {
            // InternalThymioDSL.g:2224:1: ( () )
            // InternalThymioDSL.g:2225:2: ()
            {
             before(grammarAccess.getLightsAccess().getLightsAction_0()); 
            // InternalThymioDSL.g:2226:2: ()
            // InternalThymioDSL.g:2226:3: 
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
    // InternalThymioDSL.g:2234:1: rule__Lights__Group__1 : rule__Lights__Group__1__Impl rule__Lights__Group__2 ;
    public final void rule__Lights__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2238:1: ( rule__Lights__Group__1__Impl rule__Lights__Group__2 )
            // InternalThymioDSL.g:2239:2: rule__Lights__Group__1__Impl rule__Lights__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalThymioDSL.g:2246:1: rule__Lights__Group__1__Impl : ( ( rule__Lights__Group_1__0 ) ) ;
    public final void rule__Lights__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2250:1: ( ( ( rule__Lights__Group_1__0 ) ) )
            // InternalThymioDSL.g:2251:1: ( ( rule__Lights__Group_1__0 ) )
            {
            // InternalThymioDSL.g:2251:1: ( ( rule__Lights__Group_1__0 ) )
            // InternalThymioDSL.g:2252:2: ( rule__Lights__Group_1__0 )
            {
             before(grammarAccess.getLightsAccess().getGroup_1()); 
            // InternalThymioDSL.g:2253:2: ( rule__Lights__Group_1__0 )
            // InternalThymioDSL.g:2253:3: rule__Lights__Group_1__0
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
    // InternalThymioDSL.g:2261:1: rule__Lights__Group__2 : rule__Lights__Group__2__Impl ;
    public final void rule__Lights__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2265:1: ( rule__Lights__Group__2__Impl )
            // InternalThymioDSL.g:2266:2: rule__Lights__Group__2__Impl
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
    // InternalThymioDSL.g:2272:1: rule__Lights__Group__2__Impl : ( ( rule__Lights__Group_2__0 ) ) ;
    public final void rule__Lights__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2276:1: ( ( ( rule__Lights__Group_2__0 ) ) )
            // InternalThymioDSL.g:2277:1: ( ( rule__Lights__Group_2__0 ) )
            {
            // InternalThymioDSL.g:2277:1: ( ( rule__Lights__Group_2__0 ) )
            // InternalThymioDSL.g:2278:2: ( rule__Lights__Group_2__0 )
            {
             before(grammarAccess.getLightsAccess().getGroup_2()); 
            // InternalThymioDSL.g:2279:2: ( rule__Lights__Group_2__0 )
            // InternalThymioDSL.g:2279:3: rule__Lights__Group_2__0
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
    // InternalThymioDSL.g:2288:1: rule__Lights__Group_1__0 : rule__Lights__Group_1__0__Impl rule__Lights__Group_1__1 ;
    public final void rule__Lights__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2292:1: ( rule__Lights__Group_1__0__Impl rule__Lights__Group_1__1 )
            // InternalThymioDSL.g:2293:2: rule__Lights__Group_1__0__Impl rule__Lights__Group_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalThymioDSL.g:2300:1: rule__Lights__Group_1__0__Impl : ( 'top_light:' ) ;
    public final void rule__Lights__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2304:1: ( ( 'top_light:' ) )
            // InternalThymioDSL.g:2305:1: ( 'top_light:' )
            {
            // InternalThymioDSL.g:2305:1: ( 'top_light:' )
            // InternalThymioDSL.g:2306:2: 'top_light:'
            {
             before(grammarAccess.getLightsAccess().getTop_lightKeyword_1_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalThymioDSL.g:2315:1: rule__Lights__Group_1__1 : rule__Lights__Group_1__1__Impl ;
    public final void rule__Lights__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2319:1: ( rule__Lights__Group_1__1__Impl )
            // InternalThymioDSL.g:2320:2: rule__Lights__Group_1__1__Impl
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
    // InternalThymioDSL.g:2326:1: rule__Lights__Group_1__1__Impl : ( ( rule__Lights__Alternatives_1_1 ) ) ;
    public final void rule__Lights__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2330:1: ( ( ( rule__Lights__Alternatives_1_1 ) ) )
            // InternalThymioDSL.g:2331:1: ( ( rule__Lights__Alternatives_1_1 ) )
            {
            // InternalThymioDSL.g:2331:1: ( ( rule__Lights__Alternatives_1_1 ) )
            // InternalThymioDSL.g:2332:2: ( rule__Lights__Alternatives_1_1 )
            {
             before(grammarAccess.getLightsAccess().getAlternatives_1_1()); 
            // InternalThymioDSL.g:2333:2: ( rule__Lights__Alternatives_1_1 )
            // InternalThymioDSL.g:2333:3: rule__Lights__Alternatives_1_1
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
    // InternalThymioDSL.g:2342:1: rule__Lights__Group_1_1_0__0 : rule__Lights__Group_1_1_0__0__Impl rule__Lights__Group_1_1_0__1 ;
    public final void rule__Lights__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2346:1: ( rule__Lights__Group_1_1_0__0__Impl rule__Lights__Group_1_1_0__1 )
            // InternalThymioDSL.g:2347:2: rule__Lights__Group_1_1_0__0__Impl rule__Lights__Group_1_1_0__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalThymioDSL.g:2354:1: rule__Lights__Group_1_1_0__0__Impl : ( 'on' ) ;
    public final void rule__Lights__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2358:1: ( ( 'on' ) )
            // InternalThymioDSL.g:2359:1: ( 'on' )
            {
            // InternalThymioDSL.g:2359:1: ( 'on' )
            // InternalThymioDSL.g:2360:2: 'on'
            {
             before(grammarAccess.getLightsAccess().getOnKeyword_1_1_0_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalThymioDSL.g:2369:1: rule__Lights__Group_1_1_0__1 : rule__Lights__Group_1_1_0__1__Impl ;
    public final void rule__Lights__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2373:1: ( rule__Lights__Group_1_1_0__1__Impl )
            // InternalThymioDSL.g:2374:2: rule__Lights__Group_1_1_0__1__Impl
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
    // InternalThymioDSL.g:2380:1: rule__Lights__Group_1_1_0__1__Impl : ( ( rule__Lights__TopLightAssignment_1_1_0_1 ) ) ;
    public final void rule__Lights__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2384:1: ( ( ( rule__Lights__TopLightAssignment_1_1_0_1 ) ) )
            // InternalThymioDSL.g:2385:1: ( ( rule__Lights__TopLightAssignment_1_1_0_1 ) )
            {
            // InternalThymioDSL.g:2385:1: ( ( rule__Lights__TopLightAssignment_1_1_0_1 ) )
            // InternalThymioDSL.g:2386:2: ( rule__Lights__TopLightAssignment_1_1_0_1 )
            {
             before(grammarAccess.getLightsAccess().getTopLightAssignment_1_1_0_1()); 
            // InternalThymioDSL.g:2387:2: ( rule__Lights__TopLightAssignment_1_1_0_1 )
            // InternalThymioDSL.g:2387:3: rule__Lights__TopLightAssignment_1_1_0_1
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
    // InternalThymioDSL.g:2396:1: rule__Lights__Group_2__0 : rule__Lights__Group_2__0__Impl rule__Lights__Group_2__1 ;
    public final void rule__Lights__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2400:1: ( rule__Lights__Group_2__0__Impl rule__Lights__Group_2__1 )
            // InternalThymioDSL.g:2401:2: rule__Lights__Group_2__0__Impl rule__Lights__Group_2__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalThymioDSL.g:2408:1: rule__Lights__Group_2__0__Impl : ( 'bottom_light:' ) ;
    public final void rule__Lights__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2412:1: ( ( 'bottom_light:' ) )
            // InternalThymioDSL.g:2413:1: ( 'bottom_light:' )
            {
            // InternalThymioDSL.g:2413:1: ( 'bottom_light:' )
            // InternalThymioDSL.g:2414:2: 'bottom_light:'
            {
             before(grammarAccess.getLightsAccess().getBottom_lightKeyword_2_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalThymioDSL.g:2423:1: rule__Lights__Group_2__1 : rule__Lights__Group_2__1__Impl ;
    public final void rule__Lights__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2427:1: ( rule__Lights__Group_2__1__Impl )
            // InternalThymioDSL.g:2428:2: rule__Lights__Group_2__1__Impl
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
    // InternalThymioDSL.g:2434:1: rule__Lights__Group_2__1__Impl : ( ( rule__Lights__Alternatives_2_1 ) ) ;
    public final void rule__Lights__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2438:1: ( ( ( rule__Lights__Alternatives_2_1 ) ) )
            // InternalThymioDSL.g:2439:1: ( ( rule__Lights__Alternatives_2_1 ) )
            {
            // InternalThymioDSL.g:2439:1: ( ( rule__Lights__Alternatives_2_1 ) )
            // InternalThymioDSL.g:2440:2: ( rule__Lights__Alternatives_2_1 )
            {
             before(grammarAccess.getLightsAccess().getAlternatives_2_1()); 
            // InternalThymioDSL.g:2441:2: ( rule__Lights__Alternatives_2_1 )
            // InternalThymioDSL.g:2441:3: rule__Lights__Alternatives_2_1
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
    // InternalThymioDSL.g:2450:1: rule__Lights__Group_2_1_0__0 : rule__Lights__Group_2_1_0__0__Impl rule__Lights__Group_2_1_0__1 ;
    public final void rule__Lights__Group_2_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2454:1: ( rule__Lights__Group_2_1_0__0__Impl rule__Lights__Group_2_1_0__1 )
            // InternalThymioDSL.g:2455:2: rule__Lights__Group_2_1_0__0__Impl rule__Lights__Group_2_1_0__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalThymioDSL.g:2462:1: rule__Lights__Group_2_1_0__0__Impl : ( 'on' ) ;
    public final void rule__Lights__Group_2_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2466:1: ( ( 'on' ) )
            // InternalThymioDSL.g:2467:1: ( 'on' )
            {
            // InternalThymioDSL.g:2467:1: ( 'on' )
            // InternalThymioDSL.g:2468:2: 'on'
            {
             before(grammarAccess.getLightsAccess().getOnKeyword_2_1_0_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalThymioDSL.g:2477:1: rule__Lights__Group_2_1_0__1 : rule__Lights__Group_2_1_0__1__Impl ;
    public final void rule__Lights__Group_2_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2481:1: ( rule__Lights__Group_2_1_0__1__Impl )
            // InternalThymioDSL.g:2482:2: rule__Lights__Group_2_1_0__1__Impl
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
    // InternalThymioDSL.g:2488:1: rule__Lights__Group_2_1_0__1__Impl : ( ( rule__Lights__BottomLightAssignment_2_1_0_1 ) ) ;
    public final void rule__Lights__Group_2_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2492:1: ( ( ( rule__Lights__BottomLightAssignment_2_1_0_1 ) ) )
            // InternalThymioDSL.g:2493:1: ( ( rule__Lights__BottomLightAssignment_2_1_0_1 ) )
            {
            // InternalThymioDSL.g:2493:1: ( ( rule__Lights__BottomLightAssignment_2_1_0_1 ) )
            // InternalThymioDSL.g:2494:2: ( rule__Lights__BottomLightAssignment_2_1_0_1 )
            {
             before(grammarAccess.getLightsAccess().getBottomLightAssignment_2_1_0_1()); 
            // InternalThymioDSL.g:2495:2: ( rule__Lights__BottomLightAssignment_2_1_0_1 )
            // InternalThymioDSL.g:2495:3: rule__Lights__BottomLightAssignment_2_1_0_1
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
    // InternalThymioDSL.g:2504:1: rule__RGB__Group__0 : rule__RGB__Group__0__Impl rule__RGB__Group__1 ;
    public final void rule__RGB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2508:1: ( rule__RGB__Group__0__Impl rule__RGB__Group__1 )
            // InternalThymioDSL.g:2509:2: rule__RGB__Group__0__Impl rule__RGB__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalThymioDSL.g:2516:1: rule__RGB__Group__0__Impl : ( '(' ) ;
    public final void rule__RGB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2520:1: ( ( '(' ) )
            // InternalThymioDSL.g:2521:1: ( '(' )
            {
            // InternalThymioDSL.g:2521:1: ( '(' )
            // InternalThymioDSL.g:2522:2: '('
            {
             before(grammarAccess.getRGBAccess().getLeftParenthesisKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalThymioDSL.g:2531:1: rule__RGB__Group__1 : rule__RGB__Group__1__Impl rule__RGB__Group__2 ;
    public final void rule__RGB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2535:1: ( rule__RGB__Group__1__Impl rule__RGB__Group__2 )
            // InternalThymioDSL.g:2536:2: rule__RGB__Group__1__Impl rule__RGB__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalThymioDSL.g:2543:1: rule__RGB__Group__1__Impl : ( ( rule__RGB__RedAssignment_1 ) ) ;
    public final void rule__RGB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2547:1: ( ( ( rule__RGB__RedAssignment_1 ) ) )
            // InternalThymioDSL.g:2548:1: ( ( rule__RGB__RedAssignment_1 ) )
            {
            // InternalThymioDSL.g:2548:1: ( ( rule__RGB__RedAssignment_1 ) )
            // InternalThymioDSL.g:2549:2: ( rule__RGB__RedAssignment_1 )
            {
             before(grammarAccess.getRGBAccess().getRedAssignment_1()); 
            // InternalThymioDSL.g:2550:2: ( rule__RGB__RedAssignment_1 )
            // InternalThymioDSL.g:2550:3: rule__RGB__RedAssignment_1
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
    // InternalThymioDSL.g:2558:1: rule__RGB__Group__2 : rule__RGB__Group__2__Impl rule__RGB__Group__3 ;
    public final void rule__RGB__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2562:1: ( rule__RGB__Group__2__Impl rule__RGB__Group__3 )
            // InternalThymioDSL.g:2563:2: rule__RGB__Group__2__Impl rule__RGB__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalThymioDSL.g:2570:1: rule__RGB__Group__2__Impl : ( ',' ) ;
    public final void rule__RGB__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2574:1: ( ( ',' ) )
            // InternalThymioDSL.g:2575:1: ( ',' )
            {
            // InternalThymioDSL.g:2575:1: ( ',' )
            // InternalThymioDSL.g:2576:2: ','
            {
             before(grammarAccess.getRGBAccess().getCommaKeyword_2()); 
            match(input,57,FOLLOW_2); 
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
    // InternalThymioDSL.g:2585:1: rule__RGB__Group__3 : rule__RGB__Group__3__Impl rule__RGB__Group__4 ;
    public final void rule__RGB__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2589:1: ( rule__RGB__Group__3__Impl rule__RGB__Group__4 )
            // InternalThymioDSL.g:2590:2: rule__RGB__Group__3__Impl rule__RGB__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalThymioDSL.g:2597:1: rule__RGB__Group__3__Impl : ( ( rule__RGB__GreenAssignment_3 ) ) ;
    public final void rule__RGB__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2601:1: ( ( ( rule__RGB__GreenAssignment_3 ) ) )
            // InternalThymioDSL.g:2602:1: ( ( rule__RGB__GreenAssignment_3 ) )
            {
            // InternalThymioDSL.g:2602:1: ( ( rule__RGB__GreenAssignment_3 ) )
            // InternalThymioDSL.g:2603:2: ( rule__RGB__GreenAssignment_3 )
            {
             before(grammarAccess.getRGBAccess().getGreenAssignment_3()); 
            // InternalThymioDSL.g:2604:2: ( rule__RGB__GreenAssignment_3 )
            // InternalThymioDSL.g:2604:3: rule__RGB__GreenAssignment_3
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
    // InternalThymioDSL.g:2612:1: rule__RGB__Group__4 : rule__RGB__Group__4__Impl rule__RGB__Group__5 ;
    public final void rule__RGB__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2616:1: ( rule__RGB__Group__4__Impl rule__RGB__Group__5 )
            // InternalThymioDSL.g:2617:2: rule__RGB__Group__4__Impl rule__RGB__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalThymioDSL.g:2624:1: rule__RGB__Group__4__Impl : ( ',' ) ;
    public final void rule__RGB__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2628:1: ( ( ',' ) )
            // InternalThymioDSL.g:2629:1: ( ',' )
            {
            // InternalThymioDSL.g:2629:1: ( ',' )
            // InternalThymioDSL.g:2630:2: ','
            {
             before(grammarAccess.getRGBAccess().getCommaKeyword_4()); 
            match(input,57,FOLLOW_2); 
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
    // InternalThymioDSL.g:2639:1: rule__RGB__Group__5 : rule__RGB__Group__5__Impl rule__RGB__Group__6 ;
    public final void rule__RGB__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2643:1: ( rule__RGB__Group__5__Impl rule__RGB__Group__6 )
            // InternalThymioDSL.g:2644:2: rule__RGB__Group__5__Impl rule__RGB__Group__6
            {
            pushFollow(FOLLOW_29);
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
    // InternalThymioDSL.g:2651:1: rule__RGB__Group__5__Impl : ( ( rule__RGB__BlueAssignment_5 ) ) ;
    public final void rule__RGB__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2655:1: ( ( ( rule__RGB__BlueAssignment_5 ) ) )
            // InternalThymioDSL.g:2656:1: ( ( rule__RGB__BlueAssignment_5 ) )
            {
            // InternalThymioDSL.g:2656:1: ( ( rule__RGB__BlueAssignment_5 ) )
            // InternalThymioDSL.g:2657:2: ( rule__RGB__BlueAssignment_5 )
            {
             before(grammarAccess.getRGBAccess().getBlueAssignment_5()); 
            // InternalThymioDSL.g:2658:2: ( rule__RGB__BlueAssignment_5 )
            // InternalThymioDSL.g:2658:3: rule__RGB__BlueAssignment_5
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
    // InternalThymioDSL.g:2666:1: rule__RGB__Group__6 : rule__RGB__Group__6__Impl ;
    public final void rule__RGB__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2670:1: ( rule__RGB__Group__6__Impl )
            // InternalThymioDSL.g:2671:2: rule__RGB__Group__6__Impl
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
    // InternalThymioDSL.g:2677:1: rule__RGB__Group__6__Impl : ( ')' ) ;
    public final void rule__RGB__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2681:1: ( ( ')' ) )
            // InternalThymioDSL.g:2682:1: ( ')' )
            {
            // InternalThymioDSL.g:2682:1: ( ')' )
            // InternalThymioDSL.g:2683:2: ')'
            {
             before(grammarAccess.getRGBAccess().getRightParenthesisKeyword_6()); 
            match(input,58,FOLLOW_2); 
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
    // InternalThymioDSL.g:2693:1: rule__Sound__Group__0 : rule__Sound__Group__0__Impl rule__Sound__Group__1 ;
    public final void rule__Sound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2697:1: ( rule__Sound__Group__0__Impl rule__Sound__Group__1 )
            // InternalThymioDSL.g:2698:2: rule__Sound__Group__0__Impl rule__Sound__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalThymioDSL.g:2705:1: rule__Sound__Group__0__Impl : ( 'note:' ) ;
    public final void rule__Sound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2709:1: ( ( 'note:' ) )
            // InternalThymioDSL.g:2710:1: ( 'note:' )
            {
            // InternalThymioDSL.g:2710:1: ( 'note:' )
            // InternalThymioDSL.g:2711:2: 'note:'
            {
             before(grammarAccess.getSoundAccess().getNoteKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalThymioDSL.g:2720:1: rule__Sound__Group__1 : rule__Sound__Group__1__Impl rule__Sound__Group__2 ;
    public final void rule__Sound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2724:1: ( rule__Sound__Group__1__Impl rule__Sound__Group__2 )
            // InternalThymioDSL.g:2725:2: rule__Sound__Group__1__Impl rule__Sound__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalThymioDSL.g:2732:1: rule__Sound__Group__1__Impl : ( ( rule__Sound__PitchAssignment_1 ) ) ;
    public final void rule__Sound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2736:1: ( ( ( rule__Sound__PitchAssignment_1 ) ) )
            // InternalThymioDSL.g:2737:1: ( ( rule__Sound__PitchAssignment_1 ) )
            {
            // InternalThymioDSL.g:2737:1: ( ( rule__Sound__PitchAssignment_1 ) )
            // InternalThymioDSL.g:2738:2: ( rule__Sound__PitchAssignment_1 )
            {
             before(grammarAccess.getSoundAccess().getPitchAssignment_1()); 
            // InternalThymioDSL.g:2739:2: ( rule__Sound__PitchAssignment_1 )
            // InternalThymioDSL.g:2739:3: rule__Sound__PitchAssignment_1
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
    // InternalThymioDSL.g:2747:1: rule__Sound__Group__2 : rule__Sound__Group__2__Impl ;
    public final void rule__Sound__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2751:1: ( rule__Sound__Group__2__Impl )
            // InternalThymioDSL.g:2752:2: rule__Sound__Group__2__Impl
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
    // InternalThymioDSL.g:2758:1: rule__Sound__Group__2__Impl : ( ( rule__Sound__DurationAssignment_2 ) ) ;
    public final void rule__Sound__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2762:1: ( ( ( rule__Sound__DurationAssignment_2 ) ) )
            // InternalThymioDSL.g:2763:1: ( ( rule__Sound__DurationAssignment_2 ) )
            {
            // InternalThymioDSL.g:2763:1: ( ( rule__Sound__DurationAssignment_2 ) )
            // InternalThymioDSL.g:2764:2: ( rule__Sound__DurationAssignment_2 )
            {
             before(grammarAccess.getSoundAccess().getDurationAssignment_2()); 
            // InternalThymioDSL.g:2765:2: ( rule__Sound__DurationAssignment_2 )
            // InternalThymioDSL.g:2765:3: rule__Sound__DurationAssignment_2
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
    // InternalThymioDSL.g:2774:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2778:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalThymioDSL.g:2779:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalThymioDSL.g:2786:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2790:1: ( ( ( '-' )? ) )
            // InternalThymioDSL.g:2791:1: ( ( '-' )? )
            {
            // InternalThymioDSL.g:2791:1: ( ( '-' )? )
            // InternalThymioDSL.g:2792:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalThymioDSL.g:2793:2: ( '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalThymioDSL.g:2793:3: '-'
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
    // InternalThymioDSL.g:2801:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2805:1: ( rule__EInt__Group__1__Impl )
            // InternalThymioDSL.g:2806:2: rule__EInt__Group__1__Impl
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
    // InternalThymioDSL.g:2812:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2816:1: ( ( RULE_INT ) )
            // InternalThymioDSL.g:2817:1: ( RULE_INT )
            {
            // InternalThymioDSL.g:2817:1: ( RULE_INT )
            // InternalThymioDSL.g:2818:2: RULE_INT
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
    // InternalThymioDSL.g:2828:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2832:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalThymioDSL.g:2833:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalThymioDSL.g:2840:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2844:1: ( ( ruleMultiplication ) )
            // InternalThymioDSL.g:2845:1: ( ruleMultiplication )
            {
            // InternalThymioDSL.g:2845:1: ( ruleMultiplication )
            // InternalThymioDSL.g:2846:2: ruleMultiplication
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
    // InternalThymioDSL.g:2855:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2859:1: ( rule__Addition__Group__1__Impl )
            // InternalThymioDSL.g:2860:2: rule__Addition__Group__1__Impl
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
    // InternalThymioDSL.g:2866:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2870:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalThymioDSL.g:2871:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalThymioDSL.g:2871:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalThymioDSL.g:2872:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalThymioDSL.g:2873:2: ( rule__Addition__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=27 && LA21_0<=28)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalThymioDSL.g:2873:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalThymioDSL.g:2882:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2886:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalThymioDSL.g:2887:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalThymioDSL.g:2894:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2898:1: ( ( () ) )
            // InternalThymioDSL.g:2899:1: ( () )
            {
            // InternalThymioDSL.g:2899:1: ( () )
            // InternalThymioDSL.g:2900:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // InternalThymioDSL.g:2901:2: ()
            // InternalThymioDSL.g:2901:3: 
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
    // InternalThymioDSL.g:2909:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2913:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalThymioDSL.g:2914:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalThymioDSL.g:2921:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__OperatorAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2925:1: ( ( ( rule__Addition__OperatorAssignment_1_1 ) ) )
            // InternalThymioDSL.g:2926:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            {
            // InternalThymioDSL.g:2926:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            // InternalThymioDSL.g:2927:2: ( rule__Addition__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 
            // InternalThymioDSL.g:2928:2: ( rule__Addition__OperatorAssignment_1_1 )
            // InternalThymioDSL.g:2928:3: rule__Addition__OperatorAssignment_1_1
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
    // InternalThymioDSL.g:2936:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2940:1: ( rule__Addition__Group_1__2__Impl )
            // InternalThymioDSL.g:2941:2: rule__Addition__Group_1__2__Impl
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
    // InternalThymioDSL.g:2947:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2951:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalThymioDSL.g:2952:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalThymioDSL.g:2952:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalThymioDSL.g:2953:2: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // InternalThymioDSL.g:2954:2: ( rule__Addition__RightAssignment_1_2 )
            // InternalThymioDSL.g:2954:3: rule__Addition__RightAssignment_1_2
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
    // InternalThymioDSL.g:2963:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2967:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalThymioDSL.g:2968:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalThymioDSL.g:2975:1: rule__Multiplication__Group__0__Impl : ( ruleNumber ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2979:1: ( ( ruleNumber ) )
            // InternalThymioDSL.g:2980:1: ( ruleNumber )
            {
            // InternalThymioDSL.g:2980:1: ( ruleNumber )
            // InternalThymioDSL.g:2981:2: ruleNumber
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
    // InternalThymioDSL.g:2990:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2994:1: ( rule__Multiplication__Group__1__Impl )
            // InternalThymioDSL.g:2995:2: rule__Multiplication__Group__1__Impl
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
    // InternalThymioDSL.g:3001:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3005:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalThymioDSL.g:3006:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalThymioDSL.g:3006:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalThymioDSL.g:3007:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalThymioDSL.g:3008:2: ( rule__Multiplication__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=29 && LA22_0<=30)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalThymioDSL.g:3008:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalThymioDSL.g:3017:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3021:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalThymioDSL.g:3022:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalThymioDSL.g:3029:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3033:1: ( ( () ) )
            // InternalThymioDSL.g:3034:1: ( () )
            {
            // InternalThymioDSL.g:3034:1: ( () )
            // InternalThymioDSL.g:3035:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // InternalThymioDSL.g:3036:2: ()
            // InternalThymioDSL.g:3036:3: 
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
    // InternalThymioDSL.g:3044:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3048:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalThymioDSL.g:3049:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalThymioDSL.g:3056:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3060:1: ( ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) )
            // InternalThymioDSL.g:3061:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            {
            // InternalThymioDSL.g:3061:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            // InternalThymioDSL.g:3062:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 
            // InternalThymioDSL.g:3063:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            // InternalThymioDSL.g:3063:3: rule__Multiplication__OperatorAssignment_1_1
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
    // InternalThymioDSL.g:3071:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3075:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalThymioDSL.g:3076:2: rule__Multiplication__Group_1__2__Impl
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
    // InternalThymioDSL.g:3082:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3086:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalThymioDSL.g:3087:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalThymioDSL.g:3087:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalThymioDSL.g:3088:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalThymioDSL.g:3089:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalThymioDSL.g:3089:3: rule__Multiplication__RightAssignment_1_2
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
    // InternalThymioDSL.g:3098:1: rule__Number__Group_1__0 : rule__Number__Group_1__0__Impl rule__Number__Group_1__1 ;
    public final void rule__Number__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3102:1: ( rule__Number__Group_1__0__Impl rule__Number__Group_1__1 )
            // InternalThymioDSL.g:3103:2: rule__Number__Group_1__0__Impl rule__Number__Group_1__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalThymioDSL.g:3110:1: rule__Number__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Number__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3114:1: ( ( '(' ) )
            // InternalThymioDSL.g:3115:1: ( '(' )
            {
            // InternalThymioDSL.g:3115:1: ( '(' )
            // InternalThymioDSL.g:3116:2: '('
            {
             before(grammarAccess.getNumberAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalThymioDSL.g:3125:1: rule__Number__Group_1__1 : rule__Number__Group_1__1__Impl rule__Number__Group_1__2 ;
    public final void rule__Number__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3129:1: ( rule__Number__Group_1__1__Impl rule__Number__Group_1__2 )
            // InternalThymioDSL.g:3130:2: rule__Number__Group_1__1__Impl rule__Number__Group_1__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalThymioDSL.g:3137:1: rule__Number__Group_1__1__Impl : ( ruleAddition ) ;
    public final void rule__Number__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3141:1: ( ( ruleAddition ) )
            // InternalThymioDSL.g:3142:1: ( ruleAddition )
            {
            // InternalThymioDSL.g:3142:1: ( ruleAddition )
            // InternalThymioDSL.g:3143:2: ruleAddition
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
    // InternalThymioDSL.g:3152:1: rule__Number__Group_1__2 : rule__Number__Group_1__2__Impl ;
    public final void rule__Number__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3156:1: ( rule__Number__Group_1__2__Impl )
            // InternalThymioDSL.g:3157:2: rule__Number__Group_1__2__Impl
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
    // InternalThymioDSL.g:3163:1: rule__Number__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Number__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3167:1: ( ( ')' ) )
            // InternalThymioDSL.g:3168:1: ( ')' )
            {
            // InternalThymioDSL.g:3168:1: ( ')' )
            // InternalThymioDSL.g:3169:2: ')'
            {
             before(grammarAccess.getNumberAccess().getRightParenthesisKeyword_1_2()); 
            match(input,58,FOLLOW_2); 
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
    // InternalThymioDSL.g:3179:1: rule__Model__ProceduresAssignment : ( ruleProcedure ) ;
    public final void rule__Model__ProceduresAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3183:1: ( ( ruleProcedure ) )
            // InternalThymioDSL.g:3184:2: ( ruleProcedure )
            {
            // InternalThymioDSL.g:3184:2: ( ruleProcedure )
            // InternalThymioDSL.g:3185:3: ruleProcedure
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
    // InternalThymioDSL.g:3194:1: rule__Procedure__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Procedure__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3198:1: ( ( ruleEString ) )
            // InternalThymioDSL.g:3199:2: ( ruleEString )
            {
            // InternalThymioDSL.g:3199:2: ( ruleEString )
            // InternalThymioDSL.g:3200:3: ruleEString
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
    // InternalThymioDSL.g:3209:1: rule__Procedure__EventsAssignment_3 : ( ruleEvent ) ;
    public final void rule__Procedure__EventsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3213:1: ( ( ruleEvent ) )
            // InternalThymioDSL.g:3214:2: ( ruleEvent )
            {
            // InternalThymioDSL.g:3214:2: ( ruleEvent )
            // InternalThymioDSL.g:3215:3: ruleEvent
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
    // InternalThymioDSL.g:3224:1: rule__Procedure__ActionsAssignment_5 : ( ruleAction ) ;
    public final void rule__Procedure__ActionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3228:1: ( ( ruleAction ) )
            // InternalThymioDSL.g:3229:2: ( ruleAction )
            {
            // InternalThymioDSL.g:3229:2: ( ruleAction )
            // InternalThymioDSL.g:3230:3: ruleAction
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
    // InternalThymioDSL.g:3239:1: rule__Event__ButtonAssignment_0_1 : ( ruleOrtogonal ) ;
    public final void rule__Event__ButtonAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3243:1: ( ( ruleOrtogonal ) )
            // InternalThymioDSL.g:3244:2: ( ruleOrtogonal )
            {
            // InternalThymioDSL.g:3244:2: ( ruleOrtogonal )
            // InternalThymioDSL.g:3245:3: ruleOrtogonal
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


    // $ANTLR start "rule__Event__TapAssignment_1_1"
    // InternalThymioDSL.g:3254:1: rule__Event__TapAssignment_1_1 : ( ruleEBoolean ) ;
    public final void rule__Event__TapAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3258:1: ( ( ruleEBoolean ) )
            // InternalThymioDSL.g:3259:2: ( ruleEBoolean )
            {
            // InternalThymioDSL.g:3259:2: ( ruleEBoolean )
            // InternalThymioDSL.g:3260:3: ruleEBoolean
            {
             before(grammarAccess.getEventAccess().getTapEBooleanParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEventAccess().getTapEBooleanParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Event__TapAssignment_1_1"


    // $ANTLR start "rule__Event__MicAssignment_2_1"
    // InternalThymioDSL.g:3269:1: rule__Event__MicAssignment_2_1 : ( ruleEBoolean ) ;
    public final void rule__Event__MicAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3273:1: ( ( ruleEBoolean ) )
            // InternalThymioDSL.g:3274:2: ( ruleEBoolean )
            {
            // InternalThymioDSL.g:3274:2: ( ruleEBoolean )
            // InternalThymioDSL.g:3275:3: ruleEBoolean
            {
             before(grammarAccess.getEventAccess().getMicEBooleanParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEventAccess().getMicEBooleanParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Event__MicAssignment_2_1"


    // $ANTLR start "rule__Event__ProxSensorAssignment_3_1"
    // InternalThymioDSL.g:3284:1: rule__Event__ProxSensorAssignment_3_1 : ( ruleProxSensor ) ;
    public final void rule__Event__ProxSensorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3288:1: ( ( ruleProxSensor ) )
            // InternalThymioDSL.g:3289:2: ( ruleProxSensor )
            {
            // InternalThymioDSL.g:3289:2: ( ruleProxSensor )
            // InternalThymioDSL.g:3290:3: ruleProxSensor
            {
             before(grammarAccess.getEventAccess().getProxSensorProxSensorParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProxSensor();

            state._fsp--;

             after(grammarAccess.getEventAccess().getProxSensorProxSensorParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Event__ProxSensorAssignment_3_1"


    // $ANTLR start "rule__Event__BottomSensorAssignment_4_1"
    // InternalThymioDSL.g:3299:1: rule__Event__BottomSensorAssignment_4_1 : ( ruleBottomSensor ) ;
    public final void rule__Event__BottomSensorAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3303:1: ( ( ruleBottomSensor ) )
            // InternalThymioDSL.g:3304:2: ( ruleBottomSensor )
            {
            // InternalThymioDSL.g:3304:2: ( ruleBottomSensor )
            // InternalThymioDSL.g:3305:3: ruleBottomSensor
            {
             before(grammarAccess.getEventAccess().getBottomSensorBottomSensorParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBottomSensor();

            state._fsp--;

             after(grammarAccess.getEventAccess().getBottomSensorBottomSensorParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Event__BottomSensorAssignment_4_1"


    // $ANTLR start "rule__ProxSensor__BackLeftSensorAssignment_0_1"
    // InternalThymioDSL.g:3314:1: rule__ProxSensor__BackLeftSensorAssignment_0_1 : ( ruleSensorStatus ) ;
    public final void rule__ProxSensor__BackLeftSensorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3318:1: ( ( ruleSensorStatus ) )
            // InternalThymioDSL.g:3319:2: ( ruleSensorStatus )
            {
            // InternalThymioDSL.g:3319:2: ( ruleSensorStatus )
            // InternalThymioDSL.g:3320:3: ruleSensorStatus
            {
             before(grammarAccess.getProxSensorAccess().getBackLeftSensorSensorStatusParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorStatus();

            state._fsp--;

             after(grammarAccess.getProxSensorAccess().getBackLeftSensorSensorStatusParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__ProxSensor__BackLeftSensorAssignment_0_1"


    // $ANTLR start "rule__ProxSensor__BackRightSensorAssignment_1_1"
    // InternalThymioDSL.g:3329:1: rule__ProxSensor__BackRightSensorAssignment_1_1 : ( ruleSensorStatus ) ;
    public final void rule__ProxSensor__BackRightSensorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3333:1: ( ( ruleSensorStatus ) )
            // InternalThymioDSL.g:3334:2: ( ruleSensorStatus )
            {
            // InternalThymioDSL.g:3334:2: ( ruleSensorStatus )
            // InternalThymioDSL.g:3335:3: ruleSensorStatus
            {
             before(grammarAccess.getProxSensorAccess().getBackRightSensorSensorStatusParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorStatus();

            state._fsp--;

             after(grammarAccess.getProxSensorAccess().getBackRightSensorSensorStatusParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__ProxSensor__BackRightSensorAssignment_1_1"


    // $ANTLR start "rule__ProxSensor__FrontRightSensorAssignment_2_1"
    // InternalThymioDSL.g:3344:1: rule__ProxSensor__FrontRightSensorAssignment_2_1 : ( ruleSensorStatus ) ;
    public final void rule__ProxSensor__FrontRightSensorAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3348:1: ( ( ruleSensorStatus ) )
            // InternalThymioDSL.g:3349:2: ( ruleSensorStatus )
            {
            // InternalThymioDSL.g:3349:2: ( ruleSensorStatus )
            // InternalThymioDSL.g:3350:3: ruleSensorStatus
            {
             before(grammarAccess.getProxSensorAccess().getFrontRightSensorSensorStatusParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorStatus();

            state._fsp--;

             after(grammarAccess.getProxSensorAccess().getFrontRightSensorSensorStatusParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__ProxSensor__FrontRightSensorAssignment_2_1"


    // $ANTLR start "rule__ProxSensor__FrontCenterRightSensorAssignment_3_1"
    // InternalThymioDSL.g:3359:1: rule__ProxSensor__FrontCenterRightSensorAssignment_3_1 : ( ruleSensorStatus ) ;
    public final void rule__ProxSensor__FrontCenterRightSensorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3363:1: ( ( ruleSensorStatus ) )
            // InternalThymioDSL.g:3364:2: ( ruleSensorStatus )
            {
            // InternalThymioDSL.g:3364:2: ( ruleSensorStatus )
            // InternalThymioDSL.g:3365:3: ruleSensorStatus
            {
             before(grammarAccess.getProxSensorAccess().getFrontCenterRightSensorSensorStatusParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorStatus();

            state._fsp--;

             after(grammarAccess.getProxSensorAccess().getFrontCenterRightSensorSensorStatusParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ProxSensor__FrontCenterRightSensorAssignment_3_1"


    // $ANTLR start "rule__ProxSensor__FrontCenterSensorAssignment_4_1"
    // InternalThymioDSL.g:3374:1: rule__ProxSensor__FrontCenterSensorAssignment_4_1 : ( ruleSensorStatus ) ;
    public final void rule__ProxSensor__FrontCenterSensorAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3378:1: ( ( ruleSensorStatus ) )
            // InternalThymioDSL.g:3379:2: ( ruleSensorStatus )
            {
            // InternalThymioDSL.g:3379:2: ( ruleSensorStatus )
            // InternalThymioDSL.g:3380:3: ruleSensorStatus
            {
             before(grammarAccess.getProxSensorAccess().getFrontCenterSensorSensorStatusParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorStatus();

            state._fsp--;

             after(grammarAccess.getProxSensorAccess().getFrontCenterSensorSensorStatusParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__ProxSensor__FrontCenterSensorAssignment_4_1"


    // $ANTLR start "rule__ProxSensor__FrontCenterLeftSensorAssignment_5_1"
    // InternalThymioDSL.g:3389:1: rule__ProxSensor__FrontCenterLeftSensorAssignment_5_1 : ( ruleSensorStatus ) ;
    public final void rule__ProxSensor__FrontCenterLeftSensorAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3393:1: ( ( ruleSensorStatus ) )
            // InternalThymioDSL.g:3394:2: ( ruleSensorStatus )
            {
            // InternalThymioDSL.g:3394:2: ( ruleSensorStatus )
            // InternalThymioDSL.g:3395:3: ruleSensorStatus
            {
             before(grammarAccess.getProxSensorAccess().getFrontCenterLeftSensorSensorStatusParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorStatus();

            state._fsp--;

             after(grammarAccess.getProxSensorAccess().getFrontCenterLeftSensorSensorStatusParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__ProxSensor__FrontCenterLeftSensorAssignment_5_1"


    // $ANTLR start "rule__ProxSensor__FrontLeftSensorAssignment_6_1"
    // InternalThymioDSL.g:3404:1: rule__ProxSensor__FrontLeftSensorAssignment_6_1 : ( ruleSensorStatus ) ;
    public final void rule__ProxSensor__FrontLeftSensorAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3408:1: ( ( ruleSensorStatus ) )
            // InternalThymioDSL.g:3409:2: ( ruleSensorStatus )
            {
            // InternalThymioDSL.g:3409:2: ( ruleSensorStatus )
            // InternalThymioDSL.g:3410:3: ruleSensorStatus
            {
             before(grammarAccess.getProxSensorAccess().getFrontLeftSensorSensorStatusParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorStatus();

            state._fsp--;

             after(grammarAccess.getProxSensorAccess().getFrontLeftSensorSensorStatusParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__ProxSensor__FrontLeftSensorAssignment_6_1"


    // $ANTLR start "rule__BottomSensor__BottomLeftSensorAssignment_0_1"
    // InternalThymioDSL.g:3419:1: rule__BottomSensor__BottomLeftSensorAssignment_0_1 : ( ruleBlackWhite ) ;
    public final void rule__BottomSensor__BottomLeftSensorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3423:1: ( ( ruleBlackWhite ) )
            // InternalThymioDSL.g:3424:2: ( ruleBlackWhite )
            {
            // InternalThymioDSL.g:3424:2: ( ruleBlackWhite )
            // InternalThymioDSL.g:3425:3: ruleBlackWhite
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
    // InternalThymioDSL.g:3434:1: rule__BottomSensor__BottomRightSensorAssignment_1_1 : ( ruleBlackWhite ) ;
    public final void rule__BottomSensor__BottomRightSensorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3438:1: ( ( ruleBlackWhite ) )
            // InternalThymioDSL.g:3439:2: ( ruleBlackWhite )
            {
            // InternalThymioDSL.g:3439:2: ( ruleBlackWhite )
            // InternalThymioDSL.g:3440:3: ruleBlackWhite
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
    // InternalThymioDSL.g:3449:1: rule__Action__MoveAssignment_0_1 : ( ruleMotors ) ;
    public final void rule__Action__MoveAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3453:1: ( ( ruleMotors ) )
            // InternalThymioDSL.g:3454:2: ( ruleMotors )
            {
            // InternalThymioDSL.g:3454:2: ( ruleMotors )
            // InternalThymioDSL.g:3455:3: ruleMotors
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
    // InternalThymioDSL.g:3464:1: rule__Action__LightAssignment_1_1 : ( ruleLights ) ;
    public final void rule__Action__LightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3468:1: ( ( ruleLights ) )
            // InternalThymioDSL.g:3469:2: ( ruleLights )
            {
            // InternalThymioDSL.g:3469:2: ( ruleLights )
            // InternalThymioDSL.g:3470:3: ruleLights
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
    // InternalThymioDSL.g:3479:1: rule__Action__SoundAssignment_2_1 : ( ruleSound ) ;
    public final void rule__Action__SoundAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3483:1: ( ( ruleSound ) )
            // InternalThymioDSL.g:3484:2: ( ruleSound )
            {
            // InternalThymioDSL.g:3484:2: ( ruleSound )
            // InternalThymioDSL.g:3485:3: ruleSound
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
    // InternalThymioDSL.g:3494:1: rule__Motors__LeftAssignment_1 : ( ruleAddition ) ;
    public final void rule__Motors__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3498:1: ( ( ruleAddition ) )
            // InternalThymioDSL.g:3499:2: ( ruleAddition )
            {
            // InternalThymioDSL.g:3499:2: ( ruleAddition )
            // InternalThymioDSL.g:3500:3: ruleAddition
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
    // InternalThymioDSL.g:3509:1: rule__Motors__RightAssignment_3 : ( ruleAddition ) ;
    public final void rule__Motors__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3513:1: ( ( ruleAddition ) )
            // InternalThymioDSL.g:3514:2: ( ruleAddition )
            {
            // InternalThymioDSL.g:3514:2: ( ruleAddition )
            // InternalThymioDSL.g:3515:3: ruleAddition
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
    // InternalThymioDSL.g:3524:1: rule__Lights__TopLightAssignment_1_1_0_1 : ( ruleRGB ) ;
    public final void rule__Lights__TopLightAssignment_1_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3528:1: ( ( ruleRGB ) )
            // InternalThymioDSL.g:3529:2: ( ruleRGB )
            {
            // InternalThymioDSL.g:3529:2: ( ruleRGB )
            // InternalThymioDSL.g:3530:3: ruleRGB
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
    // InternalThymioDSL.g:3539:1: rule__Lights__BottomLightAssignment_2_1_0_1 : ( ruleRGB ) ;
    public final void rule__Lights__BottomLightAssignment_2_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3543:1: ( ( ruleRGB ) )
            // InternalThymioDSL.g:3544:2: ( ruleRGB )
            {
            // InternalThymioDSL.g:3544:2: ( ruleRGB )
            // InternalThymioDSL.g:3545:3: ruleRGB
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
    // InternalThymioDSL.g:3554:1: rule__RGB__RedAssignment_1 : ( ruleAddition ) ;
    public final void rule__RGB__RedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3558:1: ( ( ruleAddition ) )
            // InternalThymioDSL.g:3559:2: ( ruleAddition )
            {
            // InternalThymioDSL.g:3559:2: ( ruleAddition )
            // InternalThymioDSL.g:3560:3: ruleAddition
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
    // InternalThymioDSL.g:3569:1: rule__RGB__GreenAssignment_3 : ( ruleAddition ) ;
    public final void rule__RGB__GreenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3573:1: ( ( ruleAddition ) )
            // InternalThymioDSL.g:3574:2: ( ruleAddition )
            {
            // InternalThymioDSL.g:3574:2: ( ruleAddition )
            // InternalThymioDSL.g:3575:3: ruleAddition
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
    // InternalThymioDSL.g:3584:1: rule__RGB__BlueAssignment_5 : ( ruleAddition ) ;
    public final void rule__RGB__BlueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3588:1: ( ( ruleAddition ) )
            // InternalThymioDSL.g:3589:2: ( ruleAddition )
            {
            // InternalThymioDSL.g:3589:2: ( ruleAddition )
            // InternalThymioDSL.g:3590:3: ruleAddition
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
    // InternalThymioDSL.g:3599:1: rule__Sound__PitchAssignment_1 : ( ruleAddition ) ;
    public final void rule__Sound__PitchAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3603:1: ( ( ruleAddition ) )
            // InternalThymioDSL.g:3604:2: ( ruleAddition )
            {
            // InternalThymioDSL.g:3604:2: ( ruleAddition )
            // InternalThymioDSL.g:3605:3: ruleAddition
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
    // InternalThymioDSL.g:3614:1: rule__Sound__DurationAssignment_2 : ( ruleNoteDuration ) ;
    public final void rule__Sound__DurationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3618:1: ( ( ruleNoteDuration ) )
            // InternalThymioDSL.g:3619:2: ( ruleNoteDuration )
            {
            // InternalThymioDSL.g:3619:2: ( ruleNoteDuration )
            // InternalThymioDSL.g:3620:3: ruleNoteDuration
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
    // InternalThymioDSL.g:3629:1: rule__Addition__OperatorAssignment_1_1 : ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Addition__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3633:1: ( ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) )
            // InternalThymioDSL.g:3634:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            {
            // InternalThymioDSL.g:3634:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            // InternalThymioDSL.g:3635:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 
            // InternalThymioDSL.g:3636:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            // InternalThymioDSL.g:3636:4: rule__Addition__OperatorAlternatives_1_1_0
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
    // InternalThymioDSL.g:3644:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3648:1: ( ( ruleMultiplication ) )
            // InternalThymioDSL.g:3649:2: ( ruleMultiplication )
            {
            // InternalThymioDSL.g:3649:2: ( ruleMultiplication )
            // InternalThymioDSL.g:3650:3: ruleMultiplication
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
    // InternalThymioDSL.g:3659:1: rule__Multiplication__OperatorAssignment_1_1 : ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Multiplication__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3663:1: ( ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) )
            // InternalThymioDSL.g:3664:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            {
            // InternalThymioDSL.g:3664:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            // InternalThymioDSL.g:3665:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 
            // InternalThymioDSL.g:3666:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            // InternalThymioDSL.g:3666:4: rule__Multiplication__OperatorAlternatives_1_1_0
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
    // InternalThymioDSL.g:3674:1: rule__Multiplication__RightAssignment_1_2 : ( ruleNumber ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3678:1: ( ( ruleNumber ) )
            // InternalThymioDSL.g:3679:2: ( ruleNumber )
            {
            // InternalThymioDSL.g:3679:2: ( ruleNumber )
            // InternalThymioDSL.g:3680:3: ruleNumber
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
    // InternalThymioDSL.g:3689:1: rule__Number__ValueAssignment_0 : ( ruleEInt ) ;
    public final void rule__Number__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3693:1: ( ( ruleEInt ) )
            // InternalThymioDSL.g:3694:2: ( ruleEInt )
            {
            // InternalThymioDSL.g:3694:2: ( ruleEInt )
            // InternalThymioDSL.g:3695:3: ruleEInt
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000007C00000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0007000000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001F0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00003F8000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00003F8000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0100000010000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0040000000000800L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000060000002L});

}