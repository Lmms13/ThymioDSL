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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'off'", "'true'", "'false'", "'short'", "'long'", "'up'", "'down'", "'left'", "'right'", "'center'", "'black'", "'white'", "'+'", "'-'", "'*'", "'/'", "'Procedure:'", "'Event:'", "'Actions:'", "'button_is_clicked:'", "'robot_is_tapped:'", "'sound_is_detected:'", "'sensor_is_activated:'", "'back_left:'", "'back_right:'", "'front_right:'", "'front_center_right:'", "'front_center:'", "'front_center_left:'", "'front_left:'", "'move:'", "'lights:'", "'sound:'", "'left_motor:'", "'right_motor:'", "'top_light:'", "'on'", "'bottom_light:'", "'('", "','", "')'", "'note:'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
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

                if ( (LA1_0==27) ) {
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


    // $ANTLR start "entryRuleSensor"
    // InternalThymioDSL.g:135:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalThymioDSL.g:136:1: ( ruleSensor EOF )
            // InternalThymioDSL.g:137:1: ruleSensor EOF
            {
             before(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getSensorRule()); 
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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalThymioDSL.g:144:1: ruleSensor : ( ( rule__Sensor__Alternatives ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:148:2: ( ( ( rule__Sensor__Alternatives ) ) )
            // InternalThymioDSL.g:149:2: ( ( rule__Sensor__Alternatives ) )
            {
            // InternalThymioDSL.g:149:2: ( ( rule__Sensor__Alternatives ) )
            // InternalThymioDSL.g:150:3: ( rule__Sensor__Alternatives )
            {
             before(grammarAccess.getSensorAccess().getAlternatives()); 
            // InternalThymioDSL.g:151:3: ( rule__Sensor__Alternatives )
            // InternalThymioDSL.g:151:4: rule__Sensor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleAction"
    // InternalThymioDSL.g:160:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalThymioDSL.g:161:1: ( ruleAction EOF )
            // InternalThymioDSL.g:162:1: ruleAction EOF
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
    // InternalThymioDSL.g:169:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:173:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalThymioDSL.g:174:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalThymioDSL.g:174:2: ( ( rule__Action__Alternatives ) )
            // InternalThymioDSL.g:175:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalThymioDSL.g:176:3: ( rule__Action__Alternatives )
            // InternalThymioDSL.g:176:4: rule__Action__Alternatives
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
    // InternalThymioDSL.g:185:1: entryRuleMotors : ruleMotors EOF ;
    public final void entryRuleMotors() throws RecognitionException {
        try {
            // InternalThymioDSL.g:186:1: ( ruleMotors EOF )
            // InternalThymioDSL.g:187:1: ruleMotors EOF
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
    // InternalThymioDSL.g:194:1: ruleMotors : ( ( rule__Motors__Group__0 ) ) ;
    public final void ruleMotors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:198:2: ( ( ( rule__Motors__Group__0 ) ) )
            // InternalThymioDSL.g:199:2: ( ( rule__Motors__Group__0 ) )
            {
            // InternalThymioDSL.g:199:2: ( ( rule__Motors__Group__0 ) )
            // InternalThymioDSL.g:200:3: ( rule__Motors__Group__0 )
            {
             before(grammarAccess.getMotorsAccess().getGroup()); 
            // InternalThymioDSL.g:201:3: ( rule__Motors__Group__0 )
            // InternalThymioDSL.g:201:4: rule__Motors__Group__0
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
    // InternalThymioDSL.g:210:1: entryRuleLights : ruleLights EOF ;
    public final void entryRuleLights() throws RecognitionException {
        try {
            // InternalThymioDSL.g:211:1: ( ruleLights EOF )
            // InternalThymioDSL.g:212:1: ruleLights EOF
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
    // InternalThymioDSL.g:219:1: ruleLights : ( ( rule__Lights__Group__0 ) ) ;
    public final void ruleLights() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:223:2: ( ( ( rule__Lights__Group__0 ) ) )
            // InternalThymioDSL.g:224:2: ( ( rule__Lights__Group__0 ) )
            {
            // InternalThymioDSL.g:224:2: ( ( rule__Lights__Group__0 ) )
            // InternalThymioDSL.g:225:3: ( rule__Lights__Group__0 )
            {
             before(grammarAccess.getLightsAccess().getGroup()); 
            // InternalThymioDSL.g:226:3: ( rule__Lights__Group__0 )
            // InternalThymioDSL.g:226:4: rule__Lights__Group__0
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
    // InternalThymioDSL.g:235:1: entryRuleRGB : ruleRGB EOF ;
    public final void entryRuleRGB() throws RecognitionException {
        try {
            // InternalThymioDSL.g:236:1: ( ruleRGB EOF )
            // InternalThymioDSL.g:237:1: ruleRGB EOF
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
    // InternalThymioDSL.g:244:1: ruleRGB : ( ( rule__RGB__Group__0 ) ) ;
    public final void ruleRGB() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:248:2: ( ( ( rule__RGB__Group__0 ) ) )
            // InternalThymioDSL.g:249:2: ( ( rule__RGB__Group__0 ) )
            {
            // InternalThymioDSL.g:249:2: ( ( rule__RGB__Group__0 ) )
            // InternalThymioDSL.g:250:3: ( rule__RGB__Group__0 )
            {
             before(grammarAccess.getRGBAccess().getGroup()); 
            // InternalThymioDSL.g:251:3: ( rule__RGB__Group__0 )
            // InternalThymioDSL.g:251:4: rule__RGB__Group__0
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
    // InternalThymioDSL.g:260:1: entryRuleSound : ruleSound EOF ;
    public final void entryRuleSound() throws RecognitionException {
        try {
            // InternalThymioDSL.g:261:1: ( ruleSound EOF )
            // InternalThymioDSL.g:262:1: ruleSound EOF
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
    // InternalThymioDSL.g:269:1: ruleSound : ( ( rule__Sound__Group__0 ) ) ;
    public final void ruleSound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:273:2: ( ( ( rule__Sound__Group__0 ) ) )
            // InternalThymioDSL.g:274:2: ( ( rule__Sound__Group__0 ) )
            {
            // InternalThymioDSL.g:274:2: ( ( rule__Sound__Group__0 ) )
            // InternalThymioDSL.g:275:3: ( rule__Sound__Group__0 )
            {
             before(grammarAccess.getSoundAccess().getGroup()); 
            // InternalThymioDSL.g:276:3: ( rule__Sound__Group__0 )
            // InternalThymioDSL.g:276:4: rule__Sound__Group__0
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
    // InternalThymioDSL.g:285:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalThymioDSL.g:286:1: ( ruleEInt EOF )
            // InternalThymioDSL.g:287:1: ruleEInt EOF
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
    // InternalThymioDSL.g:294:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:298:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalThymioDSL.g:299:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalThymioDSL.g:299:2: ( ( rule__EInt__Group__0 ) )
            // InternalThymioDSL.g:300:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalThymioDSL.g:301:3: ( rule__EInt__Group__0 )
            // InternalThymioDSL.g:301:4: rule__EInt__Group__0
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
    // InternalThymioDSL.g:310:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalThymioDSL.g:311:1: ( ruleEString EOF )
            // InternalThymioDSL.g:312:1: ruleEString EOF
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
    // InternalThymioDSL.g:319:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:323:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalThymioDSL.g:324:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalThymioDSL.g:324:2: ( ( rule__EString__Alternatives ) )
            // InternalThymioDSL.g:325:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalThymioDSL.g:326:3: ( rule__EString__Alternatives )
            // InternalThymioDSL.g:326:4: rule__EString__Alternatives
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
    // InternalThymioDSL.g:335:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalThymioDSL.g:336:1: ( ruleEBoolean EOF )
            // InternalThymioDSL.g:337:1: ruleEBoolean EOF
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
    // InternalThymioDSL.g:344:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:348:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalThymioDSL.g:349:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalThymioDSL.g:349:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalThymioDSL.g:350:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalThymioDSL.g:351:3: ( rule__EBoolean__Alternatives )
            // InternalThymioDSL.g:351:4: rule__EBoolean__Alternatives
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
    // InternalThymioDSL.g:360:1: entryRuleNoteDuration : ruleNoteDuration EOF ;
    public final void entryRuleNoteDuration() throws RecognitionException {
        try {
            // InternalThymioDSL.g:361:1: ( ruleNoteDuration EOF )
            // InternalThymioDSL.g:362:1: ruleNoteDuration EOF
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
    // InternalThymioDSL.g:369:1: ruleNoteDuration : ( ( rule__NoteDuration__Alternatives ) ) ;
    public final void ruleNoteDuration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:373:2: ( ( ( rule__NoteDuration__Alternatives ) ) )
            // InternalThymioDSL.g:374:2: ( ( rule__NoteDuration__Alternatives ) )
            {
            // InternalThymioDSL.g:374:2: ( ( rule__NoteDuration__Alternatives ) )
            // InternalThymioDSL.g:375:3: ( rule__NoteDuration__Alternatives )
            {
             before(grammarAccess.getNoteDurationAccess().getAlternatives()); 
            // InternalThymioDSL.g:376:3: ( rule__NoteDuration__Alternatives )
            // InternalThymioDSL.g:376:4: rule__NoteDuration__Alternatives
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
    // InternalThymioDSL.g:385:1: entryRuleOrtogonal : ruleOrtogonal EOF ;
    public final void entryRuleOrtogonal() throws RecognitionException {
        try {
            // InternalThymioDSL.g:386:1: ( ruleOrtogonal EOF )
            // InternalThymioDSL.g:387:1: ruleOrtogonal EOF
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
    // InternalThymioDSL.g:394:1: ruleOrtogonal : ( ( rule__Ortogonal__Alternatives ) ) ;
    public final void ruleOrtogonal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:398:2: ( ( ( rule__Ortogonal__Alternatives ) ) )
            // InternalThymioDSL.g:399:2: ( ( rule__Ortogonal__Alternatives ) )
            {
            // InternalThymioDSL.g:399:2: ( ( rule__Ortogonal__Alternatives ) )
            // InternalThymioDSL.g:400:3: ( rule__Ortogonal__Alternatives )
            {
             before(grammarAccess.getOrtogonalAccess().getAlternatives()); 
            // InternalThymioDSL.g:401:3: ( rule__Ortogonal__Alternatives )
            // InternalThymioDSL.g:401:4: rule__Ortogonal__Alternatives
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


    // $ANTLR start "entryRuleBlackWhite"
    // InternalThymioDSL.g:410:1: entryRuleBlackWhite : ruleBlackWhite EOF ;
    public final void entryRuleBlackWhite() throws RecognitionException {
        try {
            // InternalThymioDSL.g:411:1: ( ruleBlackWhite EOF )
            // InternalThymioDSL.g:412:1: ruleBlackWhite EOF
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
    // InternalThymioDSL.g:419:1: ruleBlackWhite : ( ( rule__BlackWhite__Alternatives ) ) ;
    public final void ruleBlackWhite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:423:2: ( ( ( rule__BlackWhite__Alternatives ) ) )
            // InternalThymioDSL.g:424:2: ( ( rule__BlackWhite__Alternatives ) )
            {
            // InternalThymioDSL.g:424:2: ( ( rule__BlackWhite__Alternatives ) )
            // InternalThymioDSL.g:425:3: ( rule__BlackWhite__Alternatives )
            {
             before(grammarAccess.getBlackWhiteAccess().getAlternatives()); 
            // InternalThymioDSL.g:426:3: ( rule__BlackWhite__Alternatives )
            // InternalThymioDSL.g:426:4: rule__BlackWhite__Alternatives
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
    // InternalThymioDSL.g:435:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalThymioDSL.g:436:1: ( ruleAddition EOF )
            // InternalThymioDSL.g:437:1: ruleAddition EOF
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
    // InternalThymioDSL.g:444:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:448:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalThymioDSL.g:449:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalThymioDSL.g:449:2: ( ( rule__Addition__Group__0 ) )
            // InternalThymioDSL.g:450:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalThymioDSL.g:451:3: ( rule__Addition__Group__0 )
            // InternalThymioDSL.g:451:4: rule__Addition__Group__0
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
    // InternalThymioDSL.g:460:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalThymioDSL.g:461:1: ( ruleMultiplication EOF )
            // InternalThymioDSL.g:462:1: ruleMultiplication EOF
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
    // InternalThymioDSL.g:469:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:473:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalThymioDSL.g:474:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalThymioDSL.g:474:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalThymioDSL.g:475:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalThymioDSL.g:476:3: ( rule__Multiplication__Group__0 )
            // InternalThymioDSL.g:476:4: rule__Multiplication__Group__0
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
    // InternalThymioDSL.g:485:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalThymioDSL.g:486:1: ( ruleNumber EOF )
            // InternalThymioDSL.g:487:1: ruleNumber EOF
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
    // InternalThymioDSL.g:494:1: ruleNumber : ( ( rule__Number__Alternatives ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:498:2: ( ( ( rule__Number__Alternatives ) ) )
            // InternalThymioDSL.g:499:2: ( ( rule__Number__Alternatives ) )
            {
            // InternalThymioDSL.g:499:2: ( ( rule__Number__Alternatives ) )
            // InternalThymioDSL.g:500:3: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // InternalThymioDSL.g:501:3: ( rule__Number__Alternatives )
            // InternalThymioDSL.g:501:4: rule__Number__Alternatives
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
    // InternalThymioDSL.g:509:1: rule__Event__Alternatives : ( ( ( rule__Event__Group_0__0 ) ) | ( ( rule__Event__Group_1__0 ) ) | ( ( rule__Event__Group_2__0 ) ) | ( ( ( rule__Event__Group_3__0 ) ) ( ( rule__Event__Group_3__0 )* ) ) );
    public final void rule__Event__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:513:1: ( ( ( rule__Event__Group_0__0 ) ) | ( ( rule__Event__Group_1__0 ) ) | ( ( rule__Event__Group_2__0 ) ) | ( ( ( rule__Event__Group_3__0 ) ) ( ( rule__Event__Group_3__0 )* ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt3=1;
                }
                break;
            case 31:
                {
                alt3=2;
                }
                break;
            case 32:
                {
                alt3=3;
                }
                break;
            case 33:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalThymioDSL.g:514:2: ( ( rule__Event__Group_0__0 ) )
                    {
                    // InternalThymioDSL.g:514:2: ( ( rule__Event__Group_0__0 ) )
                    // InternalThymioDSL.g:515:3: ( rule__Event__Group_0__0 )
                    {
                     before(grammarAccess.getEventAccess().getGroup_0()); 
                    // InternalThymioDSL.g:516:3: ( rule__Event__Group_0__0 )
                    // InternalThymioDSL.g:516:4: rule__Event__Group_0__0
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
                    // InternalThymioDSL.g:520:2: ( ( rule__Event__Group_1__0 ) )
                    {
                    // InternalThymioDSL.g:520:2: ( ( rule__Event__Group_1__0 ) )
                    // InternalThymioDSL.g:521:3: ( rule__Event__Group_1__0 )
                    {
                     before(grammarAccess.getEventAccess().getGroup_1()); 
                    // InternalThymioDSL.g:522:3: ( rule__Event__Group_1__0 )
                    // InternalThymioDSL.g:522:4: rule__Event__Group_1__0
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
                    // InternalThymioDSL.g:526:2: ( ( rule__Event__Group_2__0 ) )
                    {
                    // InternalThymioDSL.g:526:2: ( ( rule__Event__Group_2__0 ) )
                    // InternalThymioDSL.g:527:3: ( rule__Event__Group_2__0 )
                    {
                     before(grammarAccess.getEventAccess().getGroup_2()); 
                    // InternalThymioDSL.g:528:3: ( rule__Event__Group_2__0 )
                    // InternalThymioDSL.g:528:4: rule__Event__Group_2__0
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
                    // InternalThymioDSL.g:532:2: ( ( ( rule__Event__Group_3__0 ) ) ( ( rule__Event__Group_3__0 )* ) )
                    {
                    // InternalThymioDSL.g:532:2: ( ( ( rule__Event__Group_3__0 ) ) ( ( rule__Event__Group_3__0 )* ) )
                    // InternalThymioDSL.g:533:3: ( ( rule__Event__Group_3__0 ) ) ( ( rule__Event__Group_3__0 )* )
                    {
                    // InternalThymioDSL.g:533:3: ( ( rule__Event__Group_3__0 ) )
                    // InternalThymioDSL.g:534:4: ( rule__Event__Group_3__0 )
                    {
                     before(grammarAccess.getEventAccess().getGroup_3()); 
                    // InternalThymioDSL.g:535:4: ( rule__Event__Group_3__0 )
                    // InternalThymioDSL.g:535:5: rule__Event__Group_3__0
                    {
                    pushFollow(FOLLOW_4);
                    rule__Event__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getGroup_3()); 

                    }

                    // InternalThymioDSL.g:538:3: ( ( rule__Event__Group_3__0 )* )
                    // InternalThymioDSL.g:539:4: ( rule__Event__Group_3__0 )*
                    {
                     before(grammarAccess.getEventAccess().getGroup_3()); 
                    // InternalThymioDSL.g:540:4: ( rule__Event__Group_3__0 )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==33) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalThymioDSL.g:540:5: rule__Event__Group_3__0
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__Event__Group_3__0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                     after(grammarAccess.getEventAccess().getGroup_3()); 

                    }


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


    // $ANTLR start "rule__Sensor__Alternatives"
    // InternalThymioDSL.g:549:1: rule__Sensor__Alternatives : ( ( ( rule__Sensor__Group_0__0 ) ) | ( ( rule__Sensor__Group_1__0 ) ) | ( ( rule__Sensor__Group_2__0 ) ) | ( ( rule__Sensor__Group_3__0 ) ) | ( ( rule__Sensor__Group_4__0 ) ) | ( ( rule__Sensor__Group_5__0 ) ) | ( ( rule__Sensor__Group_6__0 ) ) );
    public final void rule__Sensor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:553:1: ( ( ( rule__Sensor__Group_0__0 ) ) | ( ( rule__Sensor__Group_1__0 ) ) | ( ( rule__Sensor__Group_2__0 ) ) | ( ( rule__Sensor__Group_3__0 ) ) | ( ( rule__Sensor__Group_4__0 ) ) | ( ( rule__Sensor__Group_5__0 ) ) | ( ( rule__Sensor__Group_6__0 ) ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt4=1;
                }
                break;
            case 35:
                {
                alt4=2;
                }
                break;
            case 36:
                {
                alt4=3;
                }
                break;
            case 37:
                {
                alt4=4;
                }
                break;
            case 38:
                {
                alt4=5;
                }
                break;
            case 39:
                {
                alt4=6;
                }
                break;
            case 40:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalThymioDSL.g:554:2: ( ( rule__Sensor__Group_0__0 ) )
                    {
                    // InternalThymioDSL.g:554:2: ( ( rule__Sensor__Group_0__0 ) )
                    // InternalThymioDSL.g:555:3: ( rule__Sensor__Group_0__0 )
                    {
                     before(grammarAccess.getSensorAccess().getGroup_0()); 
                    // InternalThymioDSL.g:556:3: ( rule__Sensor__Group_0__0 )
                    // InternalThymioDSL.g:556:4: rule__Sensor__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSensorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:560:2: ( ( rule__Sensor__Group_1__0 ) )
                    {
                    // InternalThymioDSL.g:560:2: ( ( rule__Sensor__Group_1__0 ) )
                    // InternalThymioDSL.g:561:3: ( rule__Sensor__Group_1__0 )
                    {
                     before(grammarAccess.getSensorAccess().getGroup_1()); 
                    // InternalThymioDSL.g:562:3: ( rule__Sensor__Group_1__0 )
                    // InternalThymioDSL.g:562:4: rule__Sensor__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSensorAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalThymioDSL.g:566:2: ( ( rule__Sensor__Group_2__0 ) )
                    {
                    // InternalThymioDSL.g:566:2: ( ( rule__Sensor__Group_2__0 ) )
                    // InternalThymioDSL.g:567:3: ( rule__Sensor__Group_2__0 )
                    {
                     before(grammarAccess.getSensorAccess().getGroup_2()); 
                    // InternalThymioDSL.g:568:3: ( rule__Sensor__Group_2__0 )
                    // InternalThymioDSL.g:568:4: rule__Sensor__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSensorAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalThymioDSL.g:572:2: ( ( rule__Sensor__Group_3__0 ) )
                    {
                    // InternalThymioDSL.g:572:2: ( ( rule__Sensor__Group_3__0 ) )
                    // InternalThymioDSL.g:573:3: ( rule__Sensor__Group_3__0 )
                    {
                     before(grammarAccess.getSensorAccess().getGroup_3()); 
                    // InternalThymioDSL.g:574:3: ( rule__Sensor__Group_3__0 )
                    // InternalThymioDSL.g:574:4: rule__Sensor__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSensorAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalThymioDSL.g:578:2: ( ( rule__Sensor__Group_4__0 ) )
                    {
                    // InternalThymioDSL.g:578:2: ( ( rule__Sensor__Group_4__0 ) )
                    // InternalThymioDSL.g:579:3: ( rule__Sensor__Group_4__0 )
                    {
                     before(grammarAccess.getSensorAccess().getGroup_4()); 
                    // InternalThymioDSL.g:580:3: ( rule__Sensor__Group_4__0 )
                    // InternalThymioDSL.g:580:4: rule__Sensor__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSensorAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalThymioDSL.g:584:2: ( ( rule__Sensor__Group_5__0 ) )
                    {
                    // InternalThymioDSL.g:584:2: ( ( rule__Sensor__Group_5__0 ) )
                    // InternalThymioDSL.g:585:3: ( rule__Sensor__Group_5__0 )
                    {
                     before(grammarAccess.getSensorAccess().getGroup_5()); 
                    // InternalThymioDSL.g:586:3: ( rule__Sensor__Group_5__0 )
                    // InternalThymioDSL.g:586:4: rule__Sensor__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSensorAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalThymioDSL.g:590:2: ( ( rule__Sensor__Group_6__0 ) )
                    {
                    // InternalThymioDSL.g:590:2: ( ( rule__Sensor__Group_6__0 ) )
                    // InternalThymioDSL.g:591:3: ( rule__Sensor__Group_6__0 )
                    {
                     before(grammarAccess.getSensorAccess().getGroup_6()); 
                    // InternalThymioDSL.g:592:3: ( rule__Sensor__Group_6__0 )
                    // InternalThymioDSL.g:592:4: rule__Sensor__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSensorAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Sensor__Alternatives"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalThymioDSL.g:600:1: rule__Action__Alternatives : ( ( ( rule__Action__Group_0__0 ) ) | ( ( rule__Action__Group_1__0 ) ) | ( ( rule__Action__Group_2__0 ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:604:1: ( ( ( rule__Action__Group_0__0 ) ) | ( ( rule__Action__Group_1__0 ) ) | ( ( rule__Action__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt5=1;
                }
                break;
            case 42:
                {
                alt5=2;
                }
                break;
            case 43:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalThymioDSL.g:605:2: ( ( rule__Action__Group_0__0 ) )
                    {
                    // InternalThymioDSL.g:605:2: ( ( rule__Action__Group_0__0 ) )
                    // InternalThymioDSL.g:606:3: ( rule__Action__Group_0__0 )
                    {
                     before(grammarAccess.getActionAccess().getGroup_0()); 
                    // InternalThymioDSL.g:607:3: ( rule__Action__Group_0__0 )
                    // InternalThymioDSL.g:607:4: rule__Action__Group_0__0
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
                    // InternalThymioDSL.g:611:2: ( ( rule__Action__Group_1__0 ) )
                    {
                    // InternalThymioDSL.g:611:2: ( ( rule__Action__Group_1__0 ) )
                    // InternalThymioDSL.g:612:3: ( rule__Action__Group_1__0 )
                    {
                     before(grammarAccess.getActionAccess().getGroup_1()); 
                    // InternalThymioDSL.g:613:3: ( rule__Action__Group_1__0 )
                    // InternalThymioDSL.g:613:4: rule__Action__Group_1__0
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
                    // InternalThymioDSL.g:617:2: ( ( rule__Action__Group_2__0 ) )
                    {
                    // InternalThymioDSL.g:617:2: ( ( rule__Action__Group_2__0 ) )
                    // InternalThymioDSL.g:618:3: ( rule__Action__Group_2__0 )
                    {
                     before(grammarAccess.getActionAccess().getGroup_2()); 
                    // InternalThymioDSL.g:619:3: ( rule__Action__Group_2__0 )
                    // InternalThymioDSL.g:619:4: rule__Action__Group_2__0
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
    // InternalThymioDSL.g:627:1: rule__Lights__Alternatives_1_1 : ( ( ( rule__Lights__Group_1_1_0__0 ) ) | ( 'off' ) );
    public final void rule__Lights__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:631:1: ( ( ( rule__Lights__Group_1_1_0__0 ) ) | ( 'off' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==47) ) {
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
                    // InternalThymioDSL.g:632:2: ( ( rule__Lights__Group_1_1_0__0 ) )
                    {
                    // InternalThymioDSL.g:632:2: ( ( rule__Lights__Group_1_1_0__0 ) )
                    // InternalThymioDSL.g:633:3: ( rule__Lights__Group_1_1_0__0 )
                    {
                     before(grammarAccess.getLightsAccess().getGroup_1_1_0()); 
                    // InternalThymioDSL.g:634:3: ( rule__Lights__Group_1_1_0__0 )
                    // InternalThymioDSL.g:634:4: rule__Lights__Group_1_1_0__0
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
                    // InternalThymioDSL.g:638:2: ( 'off' )
                    {
                    // InternalThymioDSL.g:638:2: ( 'off' )
                    // InternalThymioDSL.g:639:3: 'off'
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
    // InternalThymioDSL.g:648:1: rule__Lights__Alternatives_2_1 : ( ( ( rule__Lights__Group_2_1_0__0 ) ) | ( 'off' ) );
    public final void rule__Lights__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:652:1: ( ( ( rule__Lights__Group_2_1_0__0 ) ) | ( 'off' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==47) ) {
                alt7=1;
            }
            else if ( (LA7_0==11) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalThymioDSL.g:653:2: ( ( rule__Lights__Group_2_1_0__0 ) )
                    {
                    // InternalThymioDSL.g:653:2: ( ( rule__Lights__Group_2_1_0__0 ) )
                    // InternalThymioDSL.g:654:3: ( rule__Lights__Group_2_1_0__0 )
                    {
                     before(grammarAccess.getLightsAccess().getGroup_2_1_0()); 
                    // InternalThymioDSL.g:655:3: ( rule__Lights__Group_2_1_0__0 )
                    // InternalThymioDSL.g:655:4: rule__Lights__Group_2_1_0__0
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
                    // InternalThymioDSL.g:659:2: ( 'off' )
                    {
                    // InternalThymioDSL.g:659:2: ( 'off' )
                    // InternalThymioDSL.g:660:3: 'off'
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
    // InternalThymioDSL.g:669:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:673:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalThymioDSL.g:674:2: ( RULE_STRING )
                    {
                    // InternalThymioDSL.g:674:2: ( RULE_STRING )
                    // InternalThymioDSL.g:675:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:680:2: ( RULE_ID )
                    {
                    // InternalThymioDSL.g:680:2: ( RULE_ID )
                    // InternalThymioDSL.g:681:3: RULE_ID
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
    // InternalThymioDSL.g:690:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:694:1: ( ( 'true' ) | ( 'false' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==12) ) {
                alt9=1;
            }
            else if ( (LA9_0==13) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalThymioDSL.g:695:2: ( 'true' )
                    {
                    // InternalThymioDSL.g:695:2: ( 'true' )
                    // InternalThymioDSL.g:696:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:701:2: ( 'false' )
                    {
                    // InternalThymioDSL.g:701:2: ( 'false' )
                    // InternalThymioDSL.g:702:3: 'false'
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
    // InternalThymioDSL.g:711:1: rule__NoteDuration__Alternatives : ( ( 'short' ) | ( 'long' ) );
    public final void rule__NoteDuration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:715:1: ( ( 'short' ) | ( 'long' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            else if ( (LA10_0==15) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalThymioDSL.g:716:2: ( 'short' )
                    {
                    // InternalThymioDSL.g:716:2: ( 'short' )
                    // InternalThymioDSL.g:717:3: 'short'
                    {
                     before(grammarAccess.getNoteDurationAccess().getShortKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getNoteDurationAccess().getShortKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:722:2: ( 'long' )
                    {
                    // InternalThymioDSL.g:722:2: ( 'long' )
                    // InternalThymioDSL.g:723:3: 'long'
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
    // InternalThymioDSL.g:732:1: rule__Ortogonal__Alternatives : ( ( 'up' ) | ( 'down' ) | ( 'left' ) | ( 'right' ) | ( 'center' ) );
    public final void rule__Ortogonal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:736:1: ( ( 'up' ) | ( 'down' ) | ( 'left' ) | ( 'right' ) | ( 'center' ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt11=1;
                }
                break;
            case 17:
                {
                alt11=2;
                }
                break;
            case 18:
                {
                alt11=3;
                }
                break;
            case 19:
                {
                alt11=4;
                }
                break;
            case 20:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalThymioDSL.g:737:2: ( 'up' )
                    {
                    // InternalThymioDSL.g:737:2: ( 'up' )
                    // InternalThymioDSL.g:738:3: 'up'
                    {
                     before(grammarAccess.getOrtogonalAccess().getUpKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getOrtogonalAccess().getUpKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:743:2: ( 'down' )
                    {
                    // InternalThymioDSL.g:743:2: ( 'down' )
                    // InternalThymioDSL.g:744:3: 'down'
                    {
                     before(grammarAccess.getOrtogonalAccess().getDownKeyword_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getOrtogonalAccess().getDownKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalThymioDSL.g:749:2: ( 'left' )
                    {
                    // InternalThymioDSL.g:749:2: ( 'left' )
                    // InternalThymioDSL.g:750:3: 'left'
                    {
                     before(grammarAccess.getOrtogonalAccess().getLeftKeyword_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getOrtogonalAccess().getLeftKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalThymioDSL.g:755:2: ( 'right' )
                    {
                    // InternalThymioDSL.g:755:2: ( 'right' )
                    // InternalThymioDSL.g:756:3: 'right'
                    {
                     before(grammarAccess.getOrtogonalAccess().getRightKeyword_3()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getOrtogonalAccess().getRightKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalThymioDSL.g:761:2: ( 'center' )
                    {
                    // InternalThymioDSL.g:761:2: ( 'center' )
                    // InternalThymioDSL.g:762:3: 'center'
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


    // $ANTLR start "rule__BlackWhite__Alternatives"
    // InternalThymioDSL.g:771:1: rule__BlackWhite__Alternatives : ( ( 'black' ) | ( 'white' ) );
    public final void rule__BlackWhite__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:775:1: ( ( 'black' ) | ( 'white' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            else if ( (LA12_0==22) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalThymioDSL.g:776:2: ( 'black' )
                    {
                    // InternalThymioDSL.g:776:2: ( 'black' )
                    // InternalThymioDSL.g:777:3: 'black'
                    {
                     before(grammarAccess.getBlackWhiteAccess().getBlackKeyword_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getBlackWhiteAccess().getBlackKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:782:2: ( 'white' )
                    {
                    // InternalThymioDSL.g:782:2: ( 'white' )
                    // InternalThymioDSL.g:783:3: 'white'
                    {
                     before(grammarAccess.getBlackWhiteAccess().getWhiteKeyword_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getBlackWhiteAccess().getWhiteKeyword_1()); 

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
    // InternalThymioDSL.g:792:1: rule__Addition__OperatorAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:796:1: ( ( '+' ) | ( '-' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            else if ( (LA13_0==24) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalThymioDSL.g:797:2: ( '+' )
                    {
                    // InternalThymioDSL.g:797:2: ( '+' )
                    // InternalThymioDSL.g:798:3: '+'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:803:2: ( '-' )
                    {
                    // InternalThymioDSL.g:803:2: ( '-' )
                    // InternalThymioDSL.g:804:3: '-'
                    {
                     before(grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1()); 
                    match(input,24,FOLLOW_2); 
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
    // InternalThymioDSL.g:813:1: rule__Multiplication__OperatorAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Multiplication__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:817:1: ( ( '*' ) | ( '/' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            else if ( (LA14_0==26) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalThymioDSL.g:818:2: ( '*' )
                    {
                    // InternalThymioDSL.g:818:2: ( '*' )
                    // InternalThymioDSL.g:819:3: '*'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:824:2: ( '/' )
                    {
                    // InternalThymioDSL.g:824:2: ( '/' )
                    // InternalThymioDSL.g:825:3: '/'
                    {
                     before(grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1()); 
                    match(input,26,FOLLOW_2); 
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
    // InternalThymioDSL.g:834:1: rule__Number__Alternatives : ( ( ( rule__Number__ValueAssignment_0 ) ) | ( ( rule__Number__Group_1__0 ) ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:838:1: ( ( ( rule__Number__ValueAssignment_0 ) ) | ( ( rule__Number__Group_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT||LA15_0==24) ) {
                alt15=1;
            }
            else if ( (LA15_0==49) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalThymioDSL.g:839:2: ( ( rule__Number__ValueAssignment_0 ) )
                    {
                    // InternalThymioDSL.g:839:2: ( ( rule__Number__ValueAssignment_0 ) )
                    // InternalThymioDSL.g:840:3: ( rule__Number__ValueAssignment_0 )
                    {
                     before(grammarAccess.getNumberAccess().getValueAssignment_0()); 
                    // InternalThymioDSL.g:841:3: ( rule__Number__ValueAssignment_0 )
                    // InternalThymioDSL.g:841:4: rule__Number__ValueAssignment_0
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
                    // InternalThymioDSL.g:845:2: ( ( rule__Number__Group_1__0 ) )
                    {
                    // InternalThymioDSL.g:845:2: ( ( rule__Number__Group_1__0 ) )
                    // InternalThymioDSL.g:846:3: ( rule__Number__Group_1__0 )
                    {
                     before(grammarAccess.getNumberAccess().getGroup_1()); 
                    // InternalThymioDSL.g:847:3: ( rule__Number__Group_1__0 )
                    // InternalThymioDSL.g:847:4: rule__Number__Group_1__0
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
    // InternalThymioDSL.g:855:1: rule__Procedure__Group__0 : rule__Procedure__Group__0__Impl rule__Procedure__Group__1 ;
    public final void rule__Procedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:859:1: ( rule__Procedure__Group__0__Impl rule__Procedure__Group__1 )
            // InternalThymioDSL.g:860:2: rule__Procedure__Group__0__Impl rule__Procedure__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalThymioDSL.g:867:1: rule__Procedure__Group__0__Impl : ( 'Procedure:' ) ;
    public final void rule__Procedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:871:1: ( ( 'Procedure:' ) )
            // InternalThymioDSL.g:872:1: ( 'Procedure:' )
            {
            // InternalThymioDSL.g:872:1: ( 'Procedure:' )
            // InternalThymioDSL.g:873:2: 'Procedure:'
            {
             before(grammarAccess.getProcedureAccess().getProcedureKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalThymioDSL.g:882:1: rule__Procedure__Group__1 : rule__Procedure__Group__1__Impl rule__Procedure__Group__2 ;
    public final void rule__Procedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:886:1: ( rule__Procedure__Group__1__Impl rule__Procedure__Group__2 )
            // InternalThymioDSL.g:887:2: rule__Procedure__Group__1__Impl rule__Procedure__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalThymioDSL.g:894:1: rule__Procedure__Group__1__Impl : ( ( rule__Procedure__NameAssignment_1 ) ) ;
    public final void rule__Procedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:898:1: ( ( ( rule__Procedure__NameAssignment_1 ) ) )
            // InternalThymioDSL.g:899:1: ( ( rule__Procedure__NameAssignment_1 ) )
            {
            // InternalThymioDSL.g:899:1: ( ( rule__Procedure__NameAssignment_1 ) )
            // InternalThymioDSL.g:900:2: ( rule__Procedure__NameAssignment_1 )
            {
             before(grammarAccess.getProcedureAccess().getNameAssignment_1()); 
            // InternalThymioDSL.g:901:2: ( rule__Procedure__NameAssignment_1 )
            // InternalThymioDSL.g:901:3: rule__Procedure__NameAssignment_1
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
    // InternalThymioDSL.g:909:1: rule__Procedure__Group__2 : rule__Procedure__Group__2__Impl rule__Procedure__Group__3 ;
    public final void rule__Procedure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:913:1: ( rule__Procedure__Group__2__Impl rule__Procedure__Group__3 )
            // InternalThymioDSL.g:914:2: rule__Procedure__Group__2__Impl rule__Procedure__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalThymioDSL.g:921:1: rule__Procedure__Group__2__Impl : ( 'Event:' ) ;
    public final void rule__Procedure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:925:1: ( ( 'Event:' ) )
            // InternalThymioDSL.g:926:1: ( 'Event:' )
            {
            // InternalThymioDSL.g:926:1: ( 'Event:' )
            // InternalThymioDSL.g:927:2: 'Event:'
            {
             before(grammarAccess.getProcedureAccess().getEventKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalThymioDSL.g:936:1: rule__Procedure__Group__3 : rule__Procedure__Group__3__Impl rule__Procedure__Group__4 ;
    public final void rule__Procedure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:940:1: ( rule__Procedure__Group__3__Impl rule__Procedure__Group__4 )
            // InternalThymioDSL.g:941:2: rule__Procedure__Group__3__Impl rule__Procedure__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalThymioDSL.g:948:1: rule__Procedure__Group__3__Impl : ( ( rule__Procedure__EventsAssignment_3 ) ) ;
    public final void rule__Procedure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:952:1: ( ( ( rule__Procedure__EventsAssignment_3 ) ) )
            // InternalThymioDSL.g:953:1: ( ( rule__Procedure__EventsAssignment_3 ) )
            {
            // InternalThymioDSL.g:953:1: ( ( rule__Procedure__EventsAssignment_3 ) )
            // InternalThymioDSL.g:954:2: ( rule__Procedure__EventsAssignment_3 )
            {
             before(grammarAccess.getProcedureAccess().getEventsAssignment_3()); 
            // InternalThymioDSL.g:955:2: ( rule__Procedure__EventsAssignment_3 )
            // InternalThymioDSL.g:955:3: rule__Procedure__EventsAssignment_3
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
    // InternalThymioDSL.g:963:1: rule__Procedure__Group__4 : rule__Procedure__Group__4__Impl rule__Procedure__Group__5 ;
    public final void rule__Procedure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:967:1: ( rule__Procedure__Group__4__Impl rule__Procedure__Group__5 )
            // InternalThymioDSL.g:968:2: rule__Procedure__Group__4__Impl rule__Procedure__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalThymioDSL.g:975:1: rule__Procedure__Group__4__Impl : ( 'Actions:' ) ;
    public final void rule__Procedure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:979:1: ( ( 'Actions:' ) )
            // InternalThymioDSL.g:980:1: ( 'Actions:' )
            {
            // InternalThymioDSL.g:980:1: ( 'Actions:' )
            // InternalThymioDSL.g:981:2: 'Actions:'
            {
             before(grammarAccess.getProcedureAccess().getActionsKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalThymioDSL.g:990:1: rule__Procedure__Group__5 : rule__Procedure__Group__5__Impl ;
    public final void rule__Procedure__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:994:1: ( rule__Procedure__Group__5__Impl )
            // InternalThymioDSL.g:995:2: rule__Procedure__Group__5__Impl
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
    // InternalThymioDSL.g:1001:1: rule__Procedure__Group__5__Impl : ( ( ( rule__Procedure__ActionsAssignment_5 ) ) ( ( rule__Procedure__ActionsAssignment_5 )* ) ) ;
    public final void rule__Procedure__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1005:1: ( ( ( ( rule__Procedure__ActionsAssignment_5 ) ) ( ( rule__Procedure__ActionsAssignment_5 )* ) ) )
            // InternalThymioDSL.g:1006:1: ( ( ( rule__Procedure__ActionsAssignment_5 ) ) ( ( rule__Procedure__ActionsAssignment_5 )* ) )
            {
            // InternalThymioDSL.g:1006:1: ( ( ( rule__Procedure__ActionsAssignment_5 ) ) ( ( rule__Procedure__ActionsAssignment_5 )* ) )
            // InternalThymioDSL.g:1007:2: ( ( rule__Procedure__ActionsAssignment_5 ) ) ( ( rule__Procedure__ActionsAssignment_5 )* )
            {
            // InternalThymioDSL.g:1007:2: ( ( rule__Procedure__ActionsAssignment_5 ) )
            // InternalThymioDSL.g:1008:3: ( rule__Procedure__ActionsAssignment_5 )
            {
             before(grammarAccess.getProcedureAccess().getActionsAssignment_5()); 
            // InternalThymioDSL.g:1009:3: ( rule__Procedure__ActionsAssignment_5 )
            // InternalThymioDSL.g:1009:4: rule__Procedure__ActionsAssignment_5
            {
            pushFollow(FOLLOW_10);
            rule__Procedure__ActionsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getActionsAssignment_5()); 

            }

            // InternalThymioDSL.g:1012:2: ( ( rule__Procedure__ActionsAssignment_5 )* )
            // InternalThymioDSL.g:1013:3: ( rule__Procedure__ActionsAssignment_5 )*
            {
             before(grammarAccess.getProcedureAccess().getActionsAssignment_5()); 
            // InternalThymioDSL.g:1014:3: ( rule__Procedure__ActionsAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=41 && LA16_0<=43)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalThymioDSL.g:1014:4: rule__Procedure__ActionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
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
    // InternalThymioDSL.g:1024:1: rule__Event__Group_0__0 : rule__Event__Group_0__0__Impl rule__Event__Group_0__1 ;
    public final void rule__Event__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1028:1: ( rule__Event__Group_0__0__Impl rule__Event__Group_0__1 )
            // InternalThymioDSL.g:1029:2: rule__Event__Group_0__0__Impl rule__Event__Group_0__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalThymioDSL.g:1036:1: rule__Event__Group_0__0__Impl : ( 'button_is_clicked:' ) ;
    public final void rule__Event__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1040:1: ( ( 'button_is_clicked:' ) )
            // InternalThymioDSL.g:1041:1: ( 'button_is_clicked:' )
            {
            // InternalThymioDSL.g:1041:1: ( 'button_is_clicked:' )
            // InternalThymioDSL.g:1042:2: 'button_is_clicked:'
            {
             before(grammarAccess.getEventAccess().getButton_is_clickedKeyword_0_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalThymioDSL.g:1051:1: rule__Event__Group_0__1 : rule__Event__Group_0__1__Impl ;
    public final void rule__Event__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1055:1: ( rule__Event__Group_0__1__Impl )
            // InternalThymioDSL.g:1056:2: rule__Event__Group_0__1__Impl
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
    // InternalThymioDSL.g:1062:1: rule__Event__Group_0__1__Impl : ( ( rule__Event__ButtonAssignment_0_1 ) ) ;
    public final void rule__Event__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1066:1: ( ( ( rule__Event__ButtonAssignment_0_1 ) ) )
            // InternalThymioDSL.g:1067:1: ( ( rule__Event__ButtonAssignment_0_1 ) )
            {
            // InternalThymioDSL.g:1067:1: ( ( rule__Event__ButtonAssignment_0_1 ) )
            // InternalThymioDSL.g:1068:2: ( rule__Event__ButtonAssignment_0_1 )
            {
             before(grammarAccess.getEventAccess().getButtonAssignment_0_1()); 
            // InternalThymioDSL.g:1069:2: ( rule__Event__ButtonAssignment_0_1 )
            // InternalThymioDSL.g:1069:3: rule__Event__ButtonAssignment_0_1
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
    // InternalThymioDSL.g:1078:1: rule__Event__Group_1__0 : rule__Event__Group_1__0__Impl rule__Event__Group_1__1 ;
    public final void rule__Event__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1082:1: ( rule__Event__Group_1__0__Impl rule__Event__Group_1__1 )
            // InternalThymioDSL.g:1083:2: rule__Event__Group_1__0__Impl rule__Event__Group_1__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalThymioDSL.g:1090:1: rule__Event__Group_1__0__Impl : ( 'robot_is_tapped:' ) ;
    public final void rule__Event__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1094:1: ( ( 'robot_is_tapped:' ) )
            // InternalThymioDSL.g:1095:1: ( 'robot_is_tapped:' )
            {
            // InternalThymioDSL.g:1095:1: ( 'robot_is_tapped:' )
            // InternalThymioDSL.g:1096:2: 'robot_is_tapped:'
            {
             before(grammarAccess.getEventAccess().getRobot_is_tappedKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalThymioDSL.g:1105:1: rule__Event__Group_1__1 : rule__Event__Group_1__1__Impl ;
    public final void rule__Event__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1109:1: ( rule__Event__Group_1__1__Impl )
            // InternalThymioDSL.g:1110:2: rule__Event__Group_1__1__Impl
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
    // InternalThymioDSL.g:1116:1: rule__Event__Group_1__1__Impl : ( ( rule__Event__TapAssignment_1_1 ) ) ;
    public final void rule__Event__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1120:1: ( ( ( rule__Event__TapAssignment_1_1 ) ) )
            // InternalThymioDSL.g:1121:1: ( ( rule__Event__TapAssignment_1_1 ) )
            {
            // InternalThymioDSL.g:1121:1: ( ( rule__Event__TapAssignment_1_1 ) )
            // InternalThymioDSL.g:1122:2: ( rule__Event__TapAssignment_1_1 )
            {
             before(grammarAccess.getEventAccess().getTapAssignment_1_1()); 
            // InternalThymioDSL.g:1123:2: ( rule__Event__TapAssignment_1_1 )
            // InternalThymioDSL.g:1123:3: rule__Event__TapAssignment_1_1
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
    // InternalThymioDSL.g:1132:1: rule__Event__Group_2__0 : rule__Event__Group_2__0__Impl rule__Event__Group_2__1 ;
    public final void rule__Event__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1136:1: ( rule__Event__Group_2__0__Impl rule__Event__Group_2__1 )
            // InternalThymioDSL.g:1137:2: rule__Event__Group_2__0__Impl rule__Event__Group_2__1
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
    // InternalThymioDSL.g:1144:1: rule__Event__Group_2__0__Impl : ( 'sound_is_detected:' ) ;
    public final void rule__Event__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1148:1: ( ( 'sound_is_detected:' ) )
            // InternalThymioDSL.g:1149:1: ( 'sound_is_detected:' )
            {
            // InternalThymioDSL.g:1149:1: ( 'sound_is_detected:' )
            // InternalThymioDSL.g:1150:2: 'sound_is_detected:'
            {
             before(grammarAccess.getEventAccess().getSound_is_detectedKeyword_2_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalThymioDSL.g:1159:1: rule__Event__Group_2__1 : rule__Event__Group_2__1__Impl ;
    public final void rule__Event__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1163:1: ( rule__Event__Group_2__1__Impl )
            // InternalThymioDSL.g:1164:2: rule__Event__Group_2__1__Impl
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
    // InternalThymioDSL.g:1170:1: rule__Event__Group_2__1__Impl : ( ( rule__Event__MicAssignment_2_1 ) ) ;
    public final void rule__Event__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1174:1: ( ( ( rule__Event__MicAssignment_2_1 ) ) )
            // InternalThymioDSL.g:1175:1: ( ( rule__Event__MicAssignment_2_1 ) )
            {
            // InternalThymioDSL.g:1175:1: ( ( rule__Event__MicAssignment_2_1 ) )
            // InternalThymioDSL.g:1176:2: ( rule__Event__MicAssignment_2_1 )
            {
             before(grammarAccess.getEventAccess().getMicAssignment_2_1()); 
            // InternalThymioDSL.g:1177:2: ( rule__Event__MicAssignment_2_1 )
            // InternalThymioDSL.g:1177:3: rule__Event__MicAssignment_2_1
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
    // InternalThymioDSL.g:1186:1: rule__Event__Group_3__0 : rule__Event__Group_3__0__Impl rule__Event__Group_3__1 ;
    public final void rule__Event__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1190:1: ( rule__Event__Group_3__0__Impl rule__Event__Group_3__1 )
            // InternalThymioDSL.g:1191:2: rule__Event__Group_3__0__Impl rule__Event__Group_3__1
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
    // InternalThymioDSL.g:1198:1: rule__Event__Group_3__0__Impl : ( 'sensor_is_activated:' ) ;
    public final void rule__Event__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1202:1: ( ( 'sensor_is_activated:' ) )
            // InternalThymioDSL.g:1203:1: ( 'sensor_is_activated:' )
            {
            // InternalThymioDSL.g:1203:1: ( 'sensor_is_activated:' )
            // InternalThymioDSL.g:1204:2: 'sensor_is_activated:'
            {
             before(grammarAccess.getEventAccess().getSensor_is_activatedKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getSensor_is_activatedKeyword_3_0()); 

            }


            }

        }
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
    // InternalThymioDSL.g:1213:1: rule__Event__Group_3__1 : rule__Event__Group_3__1__Impl ;
    public final void rule__Event__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1217:1: ( rule__Event__Group_3__1__Impl )
            // InternalThymioDSL.g:1218:2: rule__Event__Group_3__1__Impl
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
    // InternalThymioDSL.g:1224:1: rule__Event__Group_3__1__Impl : ( ( rule__Event__SensorAssignment_3_1 ) ) ;
    public final void rule__Event__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1228:1: ( ( ( rule__Event__SensorAssignment_3_1 ) ) )
            // InternalThymioDSL.g:1229:1: ( ( rule__Event__SensorAssignment_3_1 ) )
            {
            // InternalThymioDSL.g:1229:1: ( ( rule__Event__SensorAssignment_3_1 ) )
            // InternalThymioDSL.g:1230:2: ( rule__Event__SensorAssignment_3_1 )
            {
             before(grammarAccess.getEventAccess().getSensorAssignment_3_1()); 
            // InternalThymioDSL.g:1231:2: ( rule__Event__SensorAssignment_3_1 )
            // InternalThymioDSL.g:1231:3: rule__Event__SensorAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__SensorAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getSensorAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Sensor__Group_0__0"
    // InternalThymioDSL.g:1240:1: rule__Sensor__Group_0__0 : rule__Sensor__Group_0__0__Impl rule__Sensor__Group_0__1 ;
    public final void rule__Sensor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1244:1: ( rule__Sensor__Group_0__0__Impl rule__Sensor__Group_0__1 )
            // InternalThymioDSL.g:1245:2: rule__Sensor__Group_0__0__Impl rule__Sensor__Group_0__1
            {
            pushFollow(FOLLOW_14);
            rule__Sensor__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_0__1();

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
    // $ANTLR end "rule__Sensor__Group_0__0"


    // $ANTLR start "rule__Sensor__Group_0__0__Impl"
    // InternalThymioDSL.g:1252:1: rule__Sensor__Group_0__0__Impl : ( 'back_left:' ) ;
    public final void rule__Sensor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1256:1: ( ( 'back_left:' ) )
            // InternalThymioDSL.g:1257:1: ( 'back_left:' )
            {
            // InternalThymioDSL.g:1257:1: ( 'back_left:' )
            // InternalThymioDSL.g:1258:2: 'back_left:'
            {
             before(grammarAccess.getSensorAccess().getBack_leftKeyword_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getBack_leftKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_0__0__Impl"


    // $ANTLR start "rule__Sensor__Group_0__1"
    // InternalThymioDSL.g:1267:1: rule__Sensor__Group_0__1 : rule__Sensor__Group_0__1__Impl ;
    public final void rule__Sensor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1271:1: ( rule__Sensor__Group_0__1__Impl )
            // InternalThymioDSL.g:1272:2: rule__Sensor__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_0__1__Impl();

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
    // $ANTLR end "rule__Sensor__Group_0__1"


    // $ANTLR start "rule__Sensor__Group_0__1__Impl"
    // InternalThymioDSL.g:1278:1: rule__Sensor__Group_0__1__Impl : ( ( rule__Sensor__BackLeftSensorAssignment_0_1 ) ) ;
    public final void rule__Sensor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1282:1: ( ( ( rule__Sensor__BackLeftSensorAssignment_0_1 ) ) )
            // InternalThymioDSL.g:1283:1: ( ( rule__Sensor__BackLeftSensorAssignment_0_1 ) )
            {
            // InternalThymioDSL.g:1283:1: ( ( rule__Sensor__BackLeftSensorAssignment_0_1 ) )
            // InternalThymioDSL.g:1284:2: ( rule__Sensor__BackLeftSensorAssignment_0_1 )
            {
             before(grammarAccess.getSensorAccess().getBackLeftSensorAssignment_0_1()); 
            // InternalThymioDSL.g:1285:2: ( rule__Sensor__BackLeftSensorAssignment_0_1 )
            // InternalThymioDSL.g:1285:3: rule__Sensor__BackLeftSensorAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__BackLeftSensorAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getBackLeftSensorAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_0__1__Impl"


    // $ANTLR start "rule__Sensor__Group_1__0"
    // InternalThymioDSL.g:1294:1: rule__Sensor__Group_1__0 : rule__Sensor__Group_1__0__Impl rule__Sensor__Group_1__1 ;
    public final void rule__Sensor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1298:1: ( rule__Sensor__Group_1__0__Impl rule__Sensor__Group_1__1 )
            // InternalThymioDSL.g:1299:2: rule__Sensor__Group_1__0__Impl rule__Sensor__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Sensor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_1__1();

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
    // $ANTLR end "rule__Sensor__Group_1__0"


    // $ANTLR start "rule__Sensor__Group_1__0__Impl"
    // InternalThymioDSL.g:1306:1: rule__Sensor__Group_1__0__Impl : ( 'back_right:' ) ;
    public final void rule__Sensor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1310:1: ( ( 'back_right:' ) )
            // InternalThymioDSL.g:1311:1: ( 'back_right:' )
            {
            // InternalThymioDSL.g:1311:1: ( 'back_right:' )
            // InternalThymioDSL.g:1312:2: 'back_right:'
            {
             before(grammarAccess.getSensorAccess().getBack_rightKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getBack_rightKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_1__0__Impl"


    // $ANTLR start "rule__Sensor__Group_1__1"
    // InternalThymioDSL.g:1321:1: rule__Sensor__Group_1__1 : rule__Sensor__Group_1__1__Impl ;
    public final void rule__Sensor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1325:1: ( rule__Sensor__Group_1__1__Impl )
            // InternalThymioDSL.g:1326:2: rule__Sensor__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_1__1__Impl();

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
    // $ANTLR end "rule__Sensor__Group_1__1"


    // $ANTLR start "rule__Sensor__Group_1__1__Impl"
    // InternalThymioDSL.g:1332:1: rule__Sensor__Group_1__1__Impl : ( ( rule__Sensor__BackRightSensorAssignment_1_1 ) ) ;
    public final void rule__Sensor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1336:1: ( ( ( rule__Sensor__BackRightSensorAssignment_1_1 ) ) )
            // InternalThymioDSL.g:1337:1: ( ( rule__Sensor__BackRightSensorAssignment_1_1 ) )
            {
            // InternalThymioDSL.g:1337:1: ( ( rule__Sensor__BackRightSensorAssignment_1_1 ) )
            // InternalThymioDSL.g:1338:2: ( rule__Sensor__BackRightSensorAssignment_1_1 )
            {
             before(grammarAccess.getSensorAccess().getBackRightSensorAssignment_1_1()); 
            // InternalThymioDSL.g:1339:2: ( rule__Sensor__BackRightSensorAssignment_1_1 )
            // InternalThymioDSL.g:1339:3: rule__Sensor__BackRightSensorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__BackRightSensorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getBackRightSensorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_1__1__Impl"


    // $ANTLR start "rule__Sensor__Group_2__0"
    // InternalThymioDSL.g:1348:1: rule__Sensor__Group_2__0 : rule__Sensor__Group_2__0__Impl rule__Sensor__Group_2__1 ;
    public final void rule__Sensor__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1352:1: ( rule__Sensor__Group_2__0__Impl rule__Sensor__Group_2__1 )
            // InternalThymioDSL.g:1353:2: rule__Sensor__Group_2__0__Impl rule__Sensor__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Sensor__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_2__1();

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
    // $ANTLR end "rule__Sensor__Group_2__0"


    // $ANTLR start "rule__Sensor__Group_2__0__Impl"
    // InternalThymioDSL.g:1360:1: rule__Sensor__Group_2__0__Impl : ( 'front_right:' ) ;
    public final void rule__Sensor__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1364:1: ( ( 'front_right:' ) )
            // InternalThymioDSL.g:1365:1: ( 'front_right:' )
            {
            // InternalThymioDSL.g:1365:1: ( 'front_right:' )
            // InternalThymioDSL.g:1366:2: 'front_right:'
            {
             before(grammarAccess.getSensorAccess().getFront_rightKeyword_2_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getFront_rightKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_2__0__Impl"


    // $ANTLR start "rule__Sensor__Group_2__1"
    // InternalThymioDSL.g:1375:1: rule__Sensor__Group_2__1 : rule__Sensor__Group_2__1__Impl ;
    public final void rule__Sensor__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1379:1: ( rule__Sensor__Group_2__1__Impl )
            // InternalThymioDSL.g:1380:2: rule__Sensor__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_2__1__Impl();

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
    // $ANTLR end "rule__Sensor__Group_2__1"


    // $ANTLR start "rule__Sensor__Group_2__1__Impl"
    // InternalThymioDSL.g:1386:1: rule__Sensor__Group_2__1__Impl : ( ( rule__Sensor__FrontRightSensorAssignment_2_1 ) ) ;
    public final void rule__Sensor__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1390:1: ( ( ( rule__Sensor__FrontRightSensorAssignment_2_1 ) ) )
            // InternalThymioDSL.g:1391:1: ( ( rule__Sensor__FrontRightSensorAssignment_2_1 ) )
            {
            // InternalThymioDSL.g:1391:1: ( ( rule__Sensor__FrontRightSensorAssignment_2_1 ) )
            // InternalThymioDSL.g:1392:2: ( rule__Sensor__FrontRightSensorAssignment_2_1 )
            {
             before(grammarAccess.getSensorAccess().getFrontRightSensorAssignment_2_1()); 
            // InternalThymioDSL.g:1393:2: ( rule__Sensor__FrontRightSensorAssignment_2_1 )
            // InternalThymioDSL.g:1393:3: rule__Sensor__FrontRightSensorAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__FrontRightSensorAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getFrontRightSensorAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_2__1__Impl"


    // $ANTLR start "rule__Sensor__Group_3__0"
    // InternalThymioDSL.g:1402:1: rule__Sensor__Group_3__0 : rule__Sensor__Group_3__0__Impl rule__Sensor__Group_3__1 ;
    public final void rule__Sensor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1406:1: ( rule__Sensor__Group_3__0__Impl rule__Sensor__Group_3__1 )
            // InternalThymioDSL.g:1407:2: rule__Sensor__Group_3__0__Impl rule__Sensor__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Sensor__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_3__1();

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
    // $ANTLR end "rule__Sensor__Group_3__0"


    // $ANTLR start "rule__Sensor__Group_3__0__Impl"
    // InternalThymioDSL.g:1414:1: rule__Sensor__Group_3__0__Impl : ( 'front_center_right:' ) ;
    public final void rule__Sensor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1418:1: ( ( 'front_center_right:' ) )
            // InternalThymioDSL.g:1419:1: ( 'front_center_right:' )
            {
            // InternalThymioDSL.g:1419:1: ( 'front_center_right:' )
            // InternalThymioDSL.g:1420:2: 'front_center_right:'
            {
             before(grammarAccess.getSensorAccess().getFront_center_rightKeyword_3_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getFront_center_rightKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_3__0__Impl"


    // $ANTLR start "rule__Sensor__Group_3__1"
    // InternalThymioDSL.g:1429:1: rule__Sensor__Group_3__1 : rule__Sensor__Group_3__1__Impl ;
    public final void rule__Sensor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1433:1: ( rule__Sensor__Group_3__1__Impl )
            // InternalThymioDSL.g:1434:2: rule__Sensor__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_3__1__Impl();

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
    // $ANTLR end "rule__Sensor__Group_3__1"


    // $ANTLR start "rule__Sensor__Group_3__1__Impl"
    // InternalThymioDSL.g:1440:1: rule__Sensor__Group_3__1__Impl : ( ( rule__Sensor__FrontCenterRightSensorAssignment_3_1 ) ) ;
    public final void rule__Sensor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1444:1: ( ( ( rule__Sensor__FrontCenterRightSensorAssignment_3_1 ) ) )
            // InternalThymioDSL.g:1445:1: ( ( rule__Sensor__FrontCenterRightSensorAssignment_3_1 ) )
            {
            // InternalThymioDSL.g:1445:1: ( ( rule__Sensor__FrontCenterRightSensorAssignment_3_1 ) )
            // InternalThymioDSL.g:1446:2: ( rule__Sensor__FrontCenterRightSensorAssignment_3_1 )
            {
             before(grammarAccess.getSensorAccess().getFrontCenterRightSensorAssignment_3_1()); 
            // InternalThymioDSL.g:1447:2: ( rule__Sensor__FrontCenterRightSensorAssignment_3_1 )
            // InternalThymioDSL.g:1447:3: rule__Sensor__FrontCenterRightSensorAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__FrontCenterRightSensorAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getFrontCenterRightSensorAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_3__1__Impl"


    // $ANTLR start "rule__Sensor__Group_4__0"
    // InternalThymioDSL.g:1456:1: rule__Sensor__Group_4__0 : rule__Sensor__Group_4__0__Impl rule__Sensor__Group_4__1 ;
    public final void rule__Sensor__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1460:1: ( rule__Sensor__Group_4__0__Impl rule__Sensor__Group_4__1 )
            // InternalThymioDSL.g:1461:2: rule__Sensor__Group_4__0__Impl rule__Sensor__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Sensor__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_4__1();

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
    // $ANTLR end "rule__Sensor__Group_4__0"


    // $ANTLR start "rule__Sensor__Group_4__0__Impl"
    // InternalThymioDSL.g:1468:1: rule__Sensor__Group_4__0__Impl : ( 'front_center:' ) ;
    public final void rule__Sensor__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1472:1: ( ( 'front_center:' ) )
            // InternalThymioDSL.g:1473:1: ( 'front_center:' )
            {
            // InternalThymioDSL.g:1473:1: ( 'front_center:' )
            // InternalThymioDSL.g:1474:2: 'front_center:'
            {
             before(grammarAccess.getSensorAccess().getFront_centerKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getFront_centerKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_4__0__Impl"


    // $ANTLR start "rule__Sensor__Group_4__1"
    // InternalThymioDSL.g:1483:1: rule__Sensor__Group_4__1 : rule__Sensor__Group_4__1__Impl ;
    public final void rule__Sensor__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1487:1: ( rule__Sensor__Group_4__1__Impl )
            // InternalThymioDSL.g:1488:2: rule__Sensor__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_4__1__Impl();

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
    // $ANTLR end "rule__Sensor__Group_4__1"


    // $ANTLR start "rule__Sensor__Group_4__1__Impl"
    // InternalThymioDSL.g:1494:1: rule__Sensor__Group_4__1__Impl : ( ( rule__Sensor__FrontCenterSensorAssignment_4_1 ) ) ;
    public final void rule__Sensor__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1498:1: ( ( ( rule__Sensor__FrontCenterSensorAssignment_4_1 ) ) )
            // InternalThymioDSL.g:1499:1: ( ( rule__Sensor__FrontCenterSensorAssignment_4_1 ) )
            {
            // InternalThymioDSL.g:1499:1: ( ( rule__Sensor__FrontCenterSensorAssignment_4_1 ) )
            // InternalThymioDSL.g:1500:2: ( rule__Sensor__FrontCenterSensorAssignment_4_1 )
            {
             before(grammarAccess.getSensorAccess().getFrontCenterSensorAssignment_4_1()); 
            // InternalThymioDSL.g:1501:2: ( rule__Sensor__FrontCenterSensorAssignment_4_1 )
            // InternalThymioDSL.g:1501:3: rule__Sensor__FrontCenterSensorAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__FrontCenterSensorAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getFrontCenterSensorAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_4__1__Impl"


    // $ANTLR start "rule__Sensor__Group_5__0"
    // InternalThymioDSL.g:1510:1: rule__Sensor__Group_5__0 : rule__Sensor__Group_5__0__Impl rule__Sensor__Group_5__1 ;
    public final void rule__Sensor__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1514:1: ( rule__Sensor__Group_5__0__Impl rule__Sensor__Group_5__1 )
            // InternalThymioDSL.g:1515:2: rule__Sensor__Group_5__0__Impl rule__Sensor__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__Sensor__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_5__1();

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
    // $ANTLR end "rule__Sensor__Group_5__0"


    // $ANTLR start "rule__Sensor__Group_5__0__Impl"
    // InternalThymioDSL.g:1522:1: rule__Sensor__Group_5__0__Impl : ( 'front_center_left:' ) ;
    public final void rule__Sensor__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1526:1: ( ( 'front_center_left:' ) )
            // InternalThymioDSL.g:1527:1: ( 'front_center_left:' )
            {
            // InternalThymioDSL.g:1527:1: ( 'front_center_left:' )
            // InternalThymioDSL.g:1528:2: 'front_center_left:'
            {
             before(grammarAccess.getSensorAccess().getFront_center_leftKeyword_5_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getFront_center_leftKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_5__0__Impl"


    // $ANTLR start "rule__Sensor__Group_5__1"
    // InternalThymioDSL.g:1537:1: rule__Sensor__Group_5__1 : rule__Sensor__Group_5__1__Impl ;
    public final void rule__Sensor__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1541:1: ( rule__Sensor__Group_5__1__Impl )
            // InternalThymioDSL.g:1542:2: rule__Sensor__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_5__1__Impl();

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
    // $ANTLR end "rule__Sensor__Group_5__1"


    // $ANTLR start "rule__Sensor__Group_5__1__Impl"
    // InternalThymioDSL.g:1548:1: rule__Sensor__Group_5__1__Impl : ( ( rule__Sensor__FrontCenterLeftSensorAssignment_5_1 ) ) ;
    public final void rule__Sensor__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1552:1: ( ( ( rule__Sensor__FrontCenterLeftSensorAssignment_5_1 ) ) )
            // InternalThymioDSL.g:1553:1: ( ( rule__Sensor__FrontCenterLeftSensorAssignment_5_1 ) )
            {
            // InternalThymioDSL.g:1553:1: ( ( rule__Sensor__FrontCenterLeftSensorAssignment_5_1 ) )
            // InternalThymioDSL.g:1554:2: ( rule__Sensor__FrontCenterLeftSensorAssignment_5_1 )
            {
             before(grammarAccess.getSensorAccess().getFrontCenterLeftSensorAssignment_5_1()); 
            // InternalThymioDSL.g:1555:2: ( rule__Sensor__FrontCenterLeftSensorAssignment_5_1 )
            // InternalThymioDSL.g:1555:3: rule__Sensor__FrontCenterLeftSensorAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__FrontCenterLeftSensorAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getFrontCenterLeftSensorAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_5__1__Impl"


    // $ANTLR start "rule__Sensor__Group_6__0"
    // InternalThymioDSL.g:1564:1: rule__Sensor__Group_6__0 : rule__Sensor__Group_6__0__Impl rule__Sensor__Group_6__1 ;
    public final void rule__Sensor__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1568:1: ( rule__Sensor__Group_6__0__Impl rule__Sensor__Group_6__1 )
            // InternalThymioDSL.g:1569:2: rule__Sensor__Group_6__0__Impl rule__Sensor__Group_6__1
            {
            pushFollow(FOLLOW_12);
            rule__Sensor__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_6__1();

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
    // $ANTLR end "rule__Sensor__Group_6__0"


    // $ANTLR start "rule__Sensor__Group_6__0__Impl"
    // InternalThymioDSL.g:1576:1: rule__Sensor__Group_6__0__Impl : ( 'front_left:' ) ;
    public final void rule__Sensor__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1580:1: ( ( 'front_left:' ) )
            // InternalThymioDSL.g:1581:1: ( 'front_left:' )
            {
            // InternalThymioDSL.g:1581:1: ( 'front_left:' )
            // InternalThymioDSL.g:1582:2: 'front_left:'
            {
             before(grammarAccess.getSensorAccess().getFront_leftKeyword_6_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getFront_leftKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_6__0__Impl"


    // $ANTLR start "rule__Sensor__Group_6__1"
    // InternalThymioDSL.g:1591:1: rule__Sensor__Group_6__1 : rule__Sensor__Group_6__1__Impl ;
    public final void rule__Sensor__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1595:1: ( rule__Sensor__Group_6__1__Impl )
            // InternalThymioDSL.g:1596:2: rule__Sensor__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_6__1__Impl();

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
    // $ANTLR end "rule__Sensor__Group_6__1"


    // $ANTLR start "rule__Sensor__Group_6__1__Impl"
    // InternalThymioDSL.g:1602:1: rule__Sensor__Group_6__1__Impl : ( ( rule__Sensor__FrontLeftSensorAssignment_6_1 ) ) ;
    public final void rule__Sensor__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1606:1: ( ( ( rule__Sensor__FrontLeftSensorAssignment_6_1 ) ) )
            // InternalThymioDSL.g:1607:1: ( ( rule__Sensor__FrontLeftSensorAssignment_6_1 ) )
            {
            // InternalThymioDSL.g:1607:1: ( ( rule__Sensor__FrontLeftSensorAssignment_6_1 ) )
            // InternalThymioDSL.g:1608:2: ( rule__Sensor__FrontLeftSensorAssignment_6_1 )
            {
             before(grammarAccess.getSensorAccess().getFrontLeftSensorAssignment_6_1()); 
            // InternalThymioDSL.g:1609:2: ( rule__Sensor__FrontLeftSensorAssignment_6_1 )
            // InternalThymioDSL.g:1609:3: rule__Sensor__FrontLeftSensorAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__FrontLeftSensorAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getFrontLeftSensorAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_6__1__Impl"


    // $ANTLR start "rule__Action__Group_0__0"
    // InternalThymioDSL.g:1618:1: rule__Action__Group_0__0 : rule__Action__Group_0__0__Impl rule__Action__Group_0__1 ;
    public final void rule__Action__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1622:1: ( rule__Action__Group_0__0__Impl rule__Action__Group_0__1 )
            // InternalThymioDSL.g:1623:2: rule__Action__Group_0__0__Impl rule__Action__Group_0__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalThymioDSL.g:1630:1: rule__Action__Group_0__0__Impl : ( 'move:' ) ;
    public final void rule__Action__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1634:1: ( ( 'move:' ) )
            // InternalThymioDSL.g:1635:1: ( 'move:' )
            {
            // InternalThymioDSL.g:1635:1: ( 'move:' )
            // InternalThymioDSL.g:1636:2: 'move:'
            {
             before(grammarAccess.getActionAccess().getMoveKeyword_0_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalThymioDSL.g:1645:1: rule__Action__Group_0__1 : rule__Action__Group_0__1__Impl ;
    public final void rule__Action__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1649:1: ( rule__Action__Group_0__1__Impl )
            // InternalThymioDSL.g:1650:2: rule__Action__Group_0__1__Impl
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
    // InternalThymioDSL.g:1656:1: rule__Action__Group_0__1__Impl : ( ( rule__Action__MoveAssignment_0_1 ) ) ;
    public final void rule__Action__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1660:1: ( ( ( rule__Action__MoveAssignment_0_1 ) ) )
            // InternalThymioDSL.g:1661:1: ( ( rule__Action__MoveAssignment_0_1 ) )
            {
            // InternalThymioDSL.g:1661:1: ( ( rule__Action__MoveAssignment_0_1 ) )
            // InternalThymioDSL.g:1662:2: ( rule__Action__MoveAssignment_0_1 )
            {
             before(grammarAccess.getActionAccess().getMoveAssignment_0_1()); 
            // InternalThymioDSL.g:1663:2: ( rule__Action__MoveAssignment_0_1 )
            // InternalThymioDSL.g:1663:3: rule__Action__MoveAssignment_0_1
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
    // InternalThymioDSL.g:1672:1: rule__Action__Group_1__0 : rule__Action__Group_1__0__Impl rule__Action__Group_1__1 ;
    public final void rule__Action__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1676:1: ( rule__Action__Group_1__0__Impl rule__Action__Group_1__1 )
            // InternalThymioDSL.g:1677:2: rule__Action__Group_1__0__Impl rule__Action__Group_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalThymioDSL.g:1684:1: rule__Action__Group_1__0__Impl : ( 'lights:' ) ;
    public final void rule__Action__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1688:1: ( ( 'lights:' ) )
            // InternalThymioDSL.g:1689:1: ( 'lights:' )
            {
            // InternalThymioDSL.g:1689:1: ( 'lights:' )
            // InternalThymioDSL.g:1690:2: 'lights:'
            {
             before(grammarAccess.getActionAccess().getLightsKeyword_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalThymioDSL.g:1699:1: rule__Action__Group_1__1 : rule__Action__Group_1__1__Impl ;
    public final void rule__Action__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1703:1: ( rule__Action__Group_1__1__Impl )
            // InternalThymioDSL.g:1704:2: rule__Action__Group_1__1__Impl
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
    // InternalThymioDSL.g:1710:1: rule__Action__Group_1__1__Impl : ( ( rule__Action__LightAssignment_1_1 ) ) ;
    public final void rule__Action__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1714:1: ( ( ( rule__Action__LightAssignment_1_1 ) ) )
            // InternalThymioDSL.g:1715:1: ( ( rule__Action__LightAssignment_1_1 ) )
            {
            // InternalThymioDSL.g:1715:1: ( ( rule__Action__LightAssignment_1_1 ) )
            // InternalThymioDSL.g:1716:2: ( rule__Action__LightAssignment_1_1 )
            {
             before(grammarAccess.getActionAccess().getLightAssignment_1_1()); 
            // InternalThymioDSL.g:1717:2: ( rule__Action__LightAssignment_1_1 )
            // InternalThymioDSL.g:1717:3: rule__Action__LightAssignment_1_1
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
    // InternalThymioDSL.g:1726:1: rule__Action__Group_2__0 : rule__Action__Group_2__0__Impl rule__Action__Group_2__1 ;
    public final void rule__Action__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1730:1: ( rule__Action__Group_2__0__Impl rule__Action__Group_2__1 )
            // InternalThymioDSL.g:1731:2: rule__Action__Group_2__0__Impl rule__Action__Group_2__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalThymioDSL.g:1738:1: rule__Action__Group_2__0__Impl : ( 'sound:' ) ;
    public final void rule__Action__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1742:1: ( ( 'sound:' ) )
            // InternalThymioDSL.g:1743:1: ( 'sound:' )
            {
            // InternalThymioDSL.g:1743:1: ( 'sound:' )
            // InternalThymioDSL.g:1744:2: 'sound:'
            {
             before(grammarAccess.getActionAccess().getSoundKeyword_2_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalThymioDSL.g:1753:1: rule__Action__Group_2__1 : rule__Action__Group_2__1__Impl ;
    public final void rule__Action__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1757:1: ( rule__Action__Group_2__1__Impl )
            // InternalThymioDSL.g:1758:2: rule__Action__Group_2__1__Impl
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
    // InternalThymioDSL.g:1764:1: rule__Action__Group_2__1__Impl : ( ( ( rule__Action__SoundAssignment_2_1 ) ) ( ( rule__Action__SoundAssignment_2_1 )* ) ) ;
    public final void rule__Action__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1768:1: ( ( ( ( rule__Action__SoundAssignment_2_1 ) ) ( ( rule__Action__SoundAssignment_2_1 )* ) ) )
            // InternalThymioDSL.g:1769:1: ( ( ( rule__Action__SoundAssignment_2_1 ) ) ( ( rule__Action__SoundAssignment_2_1 )* ) )
            {
            // InternalThymioDSL.g:1769:1: ( ( ( rule__Action__SoundAssignment_2_1 ) ) ( ( rule__Action__SoundAssignment_2_1 )* ) )
            // InternalThymioDSL.g:1770:2: ( ( rule__Action__SoundAssignment_2_1 ) ) ( ( rule__Action__SoundAssignment_2_1 )* )
            {
            // InternalThymioDSL.g:1770:2: ( ( rule__Action__SoundAssignment_2_1 ) )
            // InternalThymioDSL.g:1771:3: ( rule__Action__SoundAssignment_2_1 )
            {
             before(grammarAccess.getActionAccess().getSoundAssignment_2_1()); 
            // InternalThymioDSL.g:1772:3: ( rule__Action__SoundAssignment_2_1 )
            // InternalThymioDSL.g:1772:4: rule__Action__SoundAssignment_2_1
            {
            pushFollow(FOLLOW_18);
            rule__Action__SoundAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getSoundAssignment_2_1()); 

            }

            // InternalThymioDSL.g:1775:2: ( ( rule__Action__SoundAssignment_2_1 )* )
            // InternalThymioDSL.g:1776:3: ( rule__Action__SoundAssignment_2_1 )*
            {
             before(grammarAccess.getActionAccess().getSoundAssignment_2_1()); 
            // InternalThymioDSL.g:1777:3: ( rule__Action__SoundAssignment_2_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==52) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalThymioDSL.g:1777:4: rule__Action__SoundAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Action__SoundAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalThymioDSL.g:1787:1: rule__Motors__Group__0 : rule__Motors__Group__0__Impl rule__Motors__Group__1 ;
    public final void rule__Motors__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1791:1: ( rule__Motors__Group__0__Impl rule__Motors__Group__1 )
            // InternalThymioDSL.g:1792:2: rule__Motors__Group__0__Impl rule__Motors__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalThymioDSL.g:1799:1: rule__Motors__Group__0__Impl : ( 'left_motor:' ) ;
    public final void rule__Motors__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1803:1: ( ( 'left_motor:' ) )
            // InternalThymioDSL.g:1804:1: ( 'left_motor:' )
            {
            // InternalThymioDSL.g:1804:1: ( 'left_motor:' )
            // InternalThymioDSL.g:1805:2: 'left_motor:'
            {
             before(grammarAccess.getMotorsAccess().getLeft_motorKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalThymioDSL.g:1814:1: rule__Motors__Group__1 : rule__Motors__Group__1__Impl rule__Motors__Group__2 ;
    public final void rule__Motors__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1818:1: ( rule__Motors__Group__1__Impl rule__Motors__Group__2 )
            // InternalThymioDSL.g:1819:2: rule__Motors__Group__1__Impl rule__Motors__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalThymioDSL.g:1826:1: rule__Motors__Group__1__Impl : ( ( rule__Motors__LeftAssignment_1 ) ) ;
    public final void rule__Motors__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1830:1: ( ( ( rule__Motors__LeftAssignment_1 ) ) )
            // InternalThymioDSL.g:1831:1: ( ( rule__Motors__LeftAssignment_1 ) )
            {
            // InternalThymioDSL.g:1831:1: ( ( rule__Motors__LeftAssignment_1 ) )
            // InternalThymioDSL.g:1832:2: ( rule__Motors__LeftAssignment_1 )
            {
             before(grammarAccess.getMotorsAccess().getLeftAssignment_1()); 
            // InternalThymioDSL.g:1833:2: ( rule__Motors__LeftAssignment_1 )
            // InternalThymioDSL.g:1833:3: rule__Motors__LeftAssignment_1
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
    // InternalThymioDSL.g:1841:1: rule__Motors__Group__2 : rule__Motors__Group__2__Impl rule__Motors__Group__3 ;
    public final void rule__Motors__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1845:1: ( rule__Motors__Group__2__Impl rule__Motors__Group__3 )
            // InternalThymioDSL.g:1846:2: rule__Motors__Group__2__Impl rule__Motors__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalThymioDSL.g:1853:1: rule__Motors__Group__2__Impl : ( 'right_motor:' ) ;
    public final void rule__Motors__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1857:1: ( ( 'right_motor:' ) )
            // InternalThymioDSL.g:1858:1: ( 'right_motor:' )
            {
            // InternalThymioDSL.g:1858:1: ( 'right_motor:' )
            // InternalThymioDSL.g:1859:2: 'right_motor:'
            {
             before(grammarAccess.getMotorsAccess().getRight_motorKeyword_2()); 
            match(input,45,FOLLOW_2); 
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
    // InternalThymioDSL.g:1868:1: rule__Motors__Group__3 : rule__Motors__Group__3__Impl ;
    public final void rule__Motors__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1872:1: ( rule__Motors__Group__3__Impl )
            // InternalThymioDSL.g:1873:2: rule__Motors__Group__3__Impl
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
    // InternalThymioDSL.g:1879:1: rule__Motors__Group__3__Impl : ( ( rule__Motors__RightAssignment_3 ) ) ;
    public final void rule__Motors__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1883:1: ( ( ( rule__Motors__RightAssignment_3 ) ) )
            // InternalThymioDSL.g:1884:1: ( ( rule__Motors__RightAssignment_3 ) )
            {
            // InternalThymioDSL.g:1884:1: ( ( rule__Motors__RightAssignment_3 ) )
            // InternalThymioDSL.g:1885:2: ( rule__Motors__RightAssignment_3 )
            {
             before(grammarAccess.getMotorsAccess().getRightAssignment_3()); 
            // InternalThymioDSL.g:1886:2: ( rule__Motors__RightAssignment_3 )
            // InternalThymioDSL.g:1886:3: rule__Motors__RightAssignment_3
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
    // InternalThymioDSL.g:1895:1: rule__Lights__Group__0 : rule__Lights__Group__0__Impl rule__Lights__Group__1 ;
    public final void rule__Lights__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1899:1: ( rule__Lights__Group__0__Impl rule__Lights__Group__1 )
            // InternalThymioDSL.g:1900:2: rule__Lights__Group__0__Impl rule__Lights__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalThymioDSL.g:1907:1: rule__Lights__Group__0__Impl : ( () ) ;
    public final void rule__Lights__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1911:1: ( ( () ) )
            // InternalThymioDSL.g:1912:1: ( () )
            {
            // InternalThymioDSL.g:1912:1: ( () )
            // InternalThymioDSL.g:1913:2: ()
            {
             before(grammarAccess.getLightsAccess().getLightsAction_0()); 
            // InternalThymioDSL.g:1914:2: ()
            // InternalThymioDSL.g:1914:3: 
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
    // InternalThymioDSL.g:1922:1: rule__Lights__Group__1 : rule__Lights__Group__1__Impl rule__Lights__Group__2 ;
    public final void rule__Lights__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1926:1: ( rule__Lights__Group__1__Impl rule__Lights__Group__2 )
            // InternalThymioDSL.g:1927:2: rule__Lights__Group__1__Impl rule__Lights__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalThymioDSL.g:1934:1: rule__Lights__Group__1__Impl : ( ( rule__Lights__Group_1__0 ) ) ;
    public final void rule__Lights__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1938:1: ( ( ( rule__Lights__Group_1__0 ) ) )
            // InternalThymioDSL.g:1939:1: ( ( rule__Lights__Group_1__0 ) )
            {
            // InternalThymioDSL.g:1939:1: ( ( rule__Lights__Group_1__0 ) )
            // InternalThymioDSL.g:1940:2: ( rule__Lights__Group_1__0 )
            {
             before(grammarAccess.getLightsAccess().getGroup_1()); 
            // InternalThymioDSL.g:1941:2: ( rule__Lights__Group_1__0 )
            // InternalThymioDSL.g:1941:3: rule__Lights__Group_1__0
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
    // InternalThymioDSL.g:1949:1: rule__Lights__Group__2 : rule__Lights__Group__2__Impl ;
    public final void rule__Lights__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1953:1: ( rule__Lights__Group__2__Impl )
            // InternalThymioDSL.g:1954:2: rule__Lights__Group__2__Impl
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
    // InternalThymioDSL.g:1960:1: rule__Lights__Group__2__Impl : ( ( rule__Lights__Group_2__0 ) ) ;
    public final void rule__Lights__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1964:1: ( ( ( rule__Lights__Group_2__0 ) ) )
            // InternalThymioDSL.g:1965:1: ( ( rule__Lights__Group_2__0 ) )
            {
            // InternalThymioDSL.g:1965:1: ( ( rule__Lights__Group_2__0 ) )
            // InternalThymioDSL.g:1966:2: ( rule__Lights__Group_2__0 )
            {
             before(grammarAccess.getLightsAccess().getGroup_2()); 
            // InternalThymioDSL.g:1967:2: ( rule__Lights__Group_2__0 )
            // InternalThymioDSL.g:1967:3: rule__Lights__Group_2__0
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
    // InternalThymioDSL.g:1976:1: rule__Lights__Group_1__0 : rule__Lights__Group_1__0__Impl rule__Lights__Group_1__1 ;
    public final void rule__Lights__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1980:1: ( rule__Lights__Group_1__0__Impl rule__Lights__Group_1__1 )
            // InternalThymioDSL.g:1981:2: rule__Lights__Group_1__0__Impl rule__Lights__Group_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalThymioDSL.g:1988:1: rule__Lights__Group_1__0__Impl : ( 'top_light:' ) ;
    public final void rule__Lights__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1992:1: ( ( 'top_light:' ) )
            // InternalThymioDSL.g:1993:1: ( 'top_light:' )
            {
            // InternalThymioDSL.g:1993:1: ( 'top_light:' )
            // InternalThymioDSL.g:1994:2: 'top_light:'
            {
             before(grammarAccess.getLightsAccess().getTop_lightKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalThymioDSL.g:2003:1: rule__Lights__Group_1__1 : rule__Lights__Group_1__1__Impl ;
    public final void rule__Lights__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2007:1: ( rule__Lights__Group_1__1__Impl )
            // InternalThymioDSL.g:2008:2: rule__Lights__Group_1__1__Impl
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
    // InternalThymioDSL.g:2014:1: rule__Lights__Group_1__1__Impl : ( ( rule__Lights__Alternatives_1_1 ) ) ;
    public final void rule__Lights__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2018:1: ( ( ( rule__Lights__Alternatives_1_1 ) ) )
            // InternalThymioDSL.g:2019:1: ( ( rule__Lights__Alternatives_1_1 ) )
            {
            // InternalThymioDSL.g:2019:1: ( ( rule__Lights__Alternatives_1_1 ) )
            // InternalThymioDSL.g:2020:2: ( rule__Lights__Alternatives_1_1 )
            {
             before(grammarAccess.getLightsAccess().getAlternatives_1_1()); 
            // InternalThymioDSL.g:2021:2: ( rule__Lights__Alternatives_1_1 )
            // InternalThymioDSL.g:2021:3: rule__Lights__Alternatives_1_1
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
    // InternalThymioDSL.g:2030:1: rule__Lights__Group_1_1_0__0 : rule__Lights__Group_1_1_0__0__Impl rule__Lights__Group_1_1_0__1 ;
    public final void rule__Lights__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2034:1: ( rule__Lights__Group_1_1_0__0__Impl rule__Lights__Group_1_1_0__1 )
            // InternalThymioDSL.g:2035:2: rule__Lights__Group_1_1_0__0__Impl rule__Lights__Group_1_1_0__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalThymioDSL.g:2042:1: rule__Lights__Group_1_1_0__0__Impl : ( 'on' ) ;
    public final void rule__Lights__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2046:1: ( ( 'on' ) )
            // InternalThymioDSL.g:2047:1: ( 'on' )
            {
            // InternalThymioDSL.g:2047:1: ( 'on' )
            // InternalThymioDSL.g:2048:2: 'on'
            {
             before(grammarAccess.getLightsAccess().getOnKeyword_1_1_0_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalThymioDSL.g:2057:1: rule__Lights__Group_1_1_0__1 : rule__Lights__Group_1_1_0__1__Impl ;
    public final void rule__Lights__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2061:1: ( rule__Lights__Group_1_1_0__1__Impl )
            // InternalThymioDSL.g:2062:2: rule__Lights__Group_1_1_0__1__Impl
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
    // InternalThymioDSL.g:2068:1: rule__Lights__Group_1_1_0__1__Impl : ( ( rule__Lights__TopLightAssignment_1_1_0_1 ) ) ;
    public final void rule__Lights__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2072:1: ( ( ( rule__Lights__TopLightAssignment_1_1_0_1 ) ) )
            // InternalThymioDSL.g:2073:1: ( ( rule__Lights__TopLightAssignment_1_1_0_1 ) )
            {
            // InternalThymioDSL.g:2073:1: ( ( rule__Lights__TopLightAssignment_1_1_0_1 ) )
            // InternalThymioDSL.g:2074:2: ( rule__Lights__TopLightAssignment_1_1_0_1 )
            {
             before(grammarAccess.getLightsAccess().getTopLightAssignment_1_1_0_1()); 
            // InternalThymioDSL.g:2075:2: ( rule__Lights__TopLightAssignment_1_1_0_1 )
            // InternalThymioDSL.g:2075:3: rule__Lights__TopLightAssignment_1_1_0_1
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
    // InternalThymioDSL.g:2084:1: rule__Lights__Group_2__0 : rule__Lights__Group_2__0__Impl rule__Lights__Group_2__1 ;
    public final void rule__Lights__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2088:1: ( rule__Lights__Group_2__0__Impl rule__Lights__Group_2__1 )
            // InternalThymioDSL.g:2089:2: rule__Lights__Group_2__0__Impl rule__Lights__Group_2__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalThymioDSL.g:2096:1: rule__Lights__Group_2__0__Impl : ( 'bottom_light:' ) ;
    public final void rule__Lights__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2100:1: ( ( 'bottom_light:' ) )
            // InternalThymioDSL.g:2101:1: ( 'bottom_light:' )
            {
            // InternalThymioDSL.g:2101:1: ( 'bottom_light:' )
            // InternalThymioDSL.g:2102:2: 'bottom_light:'
            {
             before(grammarAccess.getLightsAccess().getBottom_lightKeyword_2_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalThymioDSL.g:2111:1: rule__Lights__Group_2__1 : rule__Lights__Group_2__1__Impl ;
    public final void rule__Lights__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2115:1: ( rule__Lights__Group_2__1__Impl )
            // InternalThymioDSL.g:2116:2: rule__Lights__Group_2__1__Impl
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
    // InternalThymioDSL.g:2122:1: rule__Lights__Group_2__1__Impl : ( ( rule__Lights__Alternatives_2_1 ) ) ;
    public final void rule__Lights__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2126:1: ( ( ( rule__Lights__Alternatives_2_1 ) ) )
            // InternalThymioDSL.g:2127:1: ( ( rule__Lights__Alternatives_2_1 ) )
            {
            // InternalThymioDSL.g:2127:1: ( ( rule__Lights__Alternatives_2_1 ) )
            // InternalThymioDSL.g:2128:2: ( rule__Lights__Alternatives_2_1 )
            {
             before(grammarAccess.getLightsAccess().getAlternatives_2_1()); 
            // InternalThymioDSL.g:2129:2: ( rule__Lights__Alternatives_2_1 )
            // InternalThymioDSL.g:2129:3: rule__Lights__Alternatives_2_1
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
    // InternalThymioDSL.g:2138:1: rule__Lights__Group_2_1_0__0 : rule__Lights__Group_2_1_0__0__Impl rule__Lights__Group_2_1_0__1 ;
    public final void rule__Lights__Group_2_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2142:1: ( rule__Lights__Group_2_1_0__0__Impl rule__Lights__Group_2_1_0__1 )
            // InternalThymioDSL.g:2143:2: rule__Lights__Group_2_1_0__0__Impl rule__Lights__Group_2_1_0__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalThymioDSL.g:2150:1: rule__Lights__Group_2_1_0__0__Impl : ( 'on' ) ;
    public final void rule__Lights__Group_2_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2154:1: ( ( 'on' ) )
            // InternalThymioDSL.g:2155:1: ( 'on' )
            {
            // InternalThymioDSL.g:2155:1: ( 'on' )
            // InternalThymioDSL.g:2156:2: 'on'
            {
             before(grammarAccess.getLightsAccess().getOnKeyword_2_1_0_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalThymioDSL.g:2165:1: rule__Lights__Group_2_1_0__1 : rule__Lights__Group_2_1_0__1__Impl ;
    public final void rule__Lights__Group_2_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2169:1: ( rule__Lights__Group_2_1_0__1__Impl )
            // InternalThymioDSL.g:2170:2: rule__Lights__Group_2_1_0__1__Impl
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
    // InternalThymioDSL.g:2176:1: rule__Lights__Group_2_1_0__1__Impl : ( ( rule__Lights__BottomLightAssignment_2_1_0_1 ) ) ;
    public final void rule__Lights__Group_2_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2180:1: ( ( ( rule__Lights__BottomLightAssignment_2_1_0_1 ) ) )
            // InternalThymioDSL.g:2181:1: ( ( rule__Lights__BottomLightAssignment_2_1_0_1 ) )
            {
            // InternalThymioDSL.g:2181:1: ( ( rule__Lights__BottomLightAssignment_2_1_0_1 ) )
            // InternalThymioDSL.g:2182:2: ( rule__Lights__BottomLightAssignment_2_1_0_1 )
            {
             before(grammarAccess.getLightsAccess().getBottomLightAssignment_2_1_0_1()); 
            // InternalThymioDSL.g:2183:2: ( rule__Lights__BottomLightAssignment_2_1_0_1 )
            // InternalThymioDSL.g:2183:3: rule__Lights__BottomLightAssignment_2_1_0_1
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
    // InternalThymioDSL.g:2192:1: rule__RGB__Group__0 : rule__RGB__Group__0__Impl rule__RGB__Group__1 ;
    public final void rule__RGB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2196:1: ( rule__RGB__Group__0__Impl rule__RGB__Group__1 )
            // InternalThymioDSL.g:2197:2: rule__RGB__Group__0__Impl rule__RGB__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalThymioDSL.g:2204:1: rule__RGB__Group__0__Impl : ( '(' ) ;
    public final void rule__RGB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2208:1: ( ( '(' ) )
            // InternalThymioDSL.g:2209:1: ( '(' )
            {
            // InternalThymioDSL.g:2209:1: ( '(' )
            // InternalThymioDSL.g:2210:2: '('
            {
             before(grammarAccess.getRGBAccess().getLeftParenthesisKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalThymioDSL.g:2219:1: rule__RGB__Group__1 : rule__RGB__Group__1__Impl rule__RGB__Group__2 ;
    public final void rule__RGB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2223:1: ( rule__RGB__Group__1__Impl rule__RGB__Group__2 )
            // InternalThymioDSL.g:2224:2: rule__RGB__Group__1__Impl rule__RGB__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalThymioDSL.g:2231:1: rule__RGB__Group__1__Impl : ( ( rule__RGB__RedAssignment_1 ) ) ;
    public final void rule__RGB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2235:1: ( ( ( rule__RGB__RedAssignment_1 ) ) )
            // InternalThymioDSL.g:2236:1: ( ( rule__RGB__RedAssignment_1 ) )
            {
            // InternalThymioDSL.g:2236:1: ( ( rule__RGB__RedAssignment_1 ) )
            // InternalThymioDSL.g:2237:2: ( rule__RGB__RedAssignment_1 )
            {
             before(grammarAccess.getRGBAccess().getRedAssignment_1()); 
            // InternalThymioDSL.g:2238:2: ( rule__RGB__RedAssignment_1 )
            // InternalThymioDSL.g:2238:3: rule__RGB__RedAssignment_1
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
    // InternalThymioDSL.g:2246:1: rule__RGB__Group__2 : rule__RGB__Group__2__Impl rule__RGB__Group__3 ;
    public final void rule__RGB__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2250:1: ( rule__RGB__Group__2__Impl rule__RGB__Group__3 )
            // InternalThymioDSL.g:2251:2: rule__RGB__Group__2__Impl rule__RGB__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalThymioDSL.g:2258:1: rule__RGB__Group__2__Impl : ( ',' ) ;
    public final void rule__RGB__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2262:1: ( ( ',' ) )
            // InternalThymioDSL.g:2263:1: ( ',' )
            {
            // InternalThymioDSL.g:2263:1: ( ',' )
            // InternalThymioDSL.g:2264:2: ','
            {
             before(grammarAccess.getRGBAccess().getCommaKeyword_2()); 
            match(input,50,FOLLOW_2); 
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
    // InternalThymioDSL.g:2273:1: rule__RGB__Group__3 : rule__RGB__Group__3__Impl rule__RGB__Group__4 ;
    public final void rule__RGB__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2277:1: ( rule__RGB__Group__3__Impl rule__RGB__Group__4 )
            // InternalThymioDSL.g:2278:2: rule__RGB__Group__3__Impl rule__RGB__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalThymioDSL.g:2285:1: rule__RGB__Group__3__Impl : ( ( rule__RGB__GreenAssignment_3 ) ) ;
    public final void rule__RGB__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2289:1: ( ( ( rule__RGB__GreenAssignment_3 ) ) )
            // InternalThymioDSL.g:2290:1: ( ( rule__RGB__GreenAssignment_3 ) )
            {
            // InternalThymioDSL.g:2290:1: ( ( rule__RGB__GreenAssignment_3 ) )
            // InternalThymioDSL.g:2291:2: ( rule__RGB__GreenAssignment_3 )
            {
             before(grammarAccess.getRGBAccess().getGreenAssignment_3()); 
            // InternalThymioDSL.g:2292:2: ( rule__RGB__GreenAssignment_3 )
            // InternalThymioDSL.g:2292:3: rule__RGB__GreenAssignment_3
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
    // InternalThymioDSL.g:2300:1: rule__RGB__Group__4 : rule__RGB__Group__4__Impl rule__RGB__Group__5 ;
    public final void rule__RGB__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2304:1: ( rule__RGB__Group__4__Impl rule__RGB__Group__5 )
            // InternalThymioDSL.g:2305:2: rule__RGB__Group__4__Impl rule__RGB__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalThymioDSL.g:2312:1: rule__RGB__Group__4__Impl : ( ',' ) ;
    public final void rule__RGB__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2316:1: ( ( ',' ) )
            // InternalThymioDSL.g:2317:1: ( ',' )
            {
            // InternalThymioDSL.g:2317:1: ( ',' )
            // InternalThymioDSL.g:2318:2: ','
            {
             before(grammarAccess.getRGBAccess().getCommaKeyword_4()); 
            match(input,50,FOLLOW_2); 
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
    // InternalThymioDSL.g:2327:1: rule__RGB__Group__5 : rule__RGB__Group__5__Impl rule__RGB__Group__6 ;
    public final void rule__RGB__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2331:1: ( rule__RGB__Group__5__Impl rule__RGB__Group__6 )
            // InternalThymioDSL.g:2332:2: rule__RGB__Group__5__Impl rule__RGB__Group__6
            {
            pushFollow(FOLLOW_25);
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
    // InternalThymioDSL.g:2339:1: rule__RGB__Group__5__Impl : ( ( rule__RGB__BlueAssignment_5 ) ) ;
    public final void rule__RGB__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2343:1: ( ( ( rule__RGB__BlueAssignment_5 ) ) )
            // InternalThymioDSL.g:2344:1: ( ( rule__RGB__BlueAssignment_5 ) )
            {
            // InternalThymioDSL.g:2344:1: ( ( rule__RGB__BlueAssignment_5 ) )
            // InternalThymioDSL.g:2345:2: ( rule__RGB__BlueAssignment_5 )
            {
             before(grammarAccess.getRGBAccess().getBlueAssignment_5()); 
            // InternalThymioDSL.g:2346:2: ( rule__RGB__BlueAssignment_5 )
            // InternalThymioDSL.g:2346:3: rule__RGB__BlueAssignment_5
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
    // InternalThymioDSL.g:2354:1: rule__RGB__Group__6 : rule__RGB__Group__6__Impl ;
    public final void rule__RGB__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2358:1: ( rule__RGB__Group__6__Impl )
            // InternalThymioDSL.g:2359:2: rule__RGB__Group__6__Impl
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
    // InternalThymioDSL.g:2365:1: rule__RGB__Group__6__Impl : ( ')' ) ;
    public final void rule__RGB__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2369:1: ( ( ')' ) )
            // InternalThymioDSL.g:2370:1: ( ')' )
            {
            // InternalThymioDSL.g:2370:1: ( ')' )
            // InternalThymioDSL.g:2371:2: ')'
            {
             before(grammarAccess.getRGBAccess().getRightParenthesisKeyword_6()); 
            match(input,51,FOLLOW_2); 
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
    // InternalThymioDSL.g:2381:1: rule__Sound__Group__0 : rule__Sound__Group__0__Impl rule__Sound__Group__1 ;
    public final void rule__Sound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2385:1: ( rule__Sound__Group__0__Impl rule__Sound__Group__1 )
            // InternalThymioDSL.g:2386:2: rule__Sound__Group__0__Impl rule__Sound__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalThymioDSL.g:2393:1: rule__Sound__Group__0__Impl : ( 'note:' ) ;
    public final void rule__Sound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2397:1: ( ( 'note:' ) )
            // InternalThymioDSL.g:2398:1: ( 'note:' )
            {
            // InternalThymioDSL.g:2398:1: ( 'note:' )
            // InternalThymioDSL.g:2399:2: 'note:'
            {
             before(grammarAccess.getSoundAccess().getNoteKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalThymioDSL.g:2408:1: rule__Sound__Group__1 : rule__Sound__Group__1__Impl rule__Sound__Group__2 ;
    public final void rule__Sound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2412:1: ( rule__Sound__Group__1__Impl rule__Sound__Group__2 )
            // InternalThymioDSL.g:2413:2: rule__Sound__Group__1__Impl rule__Sound__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalThymioDSL.g:2420:1: rule__Sound__Group__1__Impl : ( ( rule__Sound__PitchAssignment_1 ) ) ;
    public final void rule__Sound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2424:1: ( ( ( rule__Sound__PitchAssignment_1 ) ) )
            // InternalThymioDSL.g:2425:1: ( ( rule__Sound__PitchAssignment_1 ) )
            {
            // InternalThymioDSL.g:2425:1: ( ( rule__Sound__PitchAssignment_1 ) )
            // InternalThymioDSL.g:2426:2: ( rule__Sound__PitchAssignment_1 )
            {
             before(grammarAccess.getSoundAccess().getPitchAssignment_1()); 
            // InternalThymioDSL.g:2427:2: ( rule__Sound__PitchAssignment_1 )
            // InternalThymioDSL.g:2427:3: rule__Sound__PitchAssignment_1
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
    // InternalThymioDSL.g:2435:1: rule__Sound__Group__2 : rule__Sound__Group__2__Impl ;
    public final void rule__Sound__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2439:1: ( rule__Sound__Group__2__Impl )
            // InternalThymioDSL.g:2440:2: rule__Sound__Group__2__Impl
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
    // InternalThymioDSL.g:2446:1: rule__Sound__Group__2__Impl : ( ( rule__Sound__DurationAssignment_2 ) ) ;
    public final void rule__Sound__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2450:1: ( ( ( rule__Sound__DurationAssignment_2 ) ) )
            // InternalThymioDSL.g:2451:1: ( ( rule__Sound__DurationAssignment_2 ) )
            {
            // InternalThymioDSL.g:2451:1: ( ( rule__Sound__DurationAssignment_2 ) )
            // InternalThymioDSL.g:2452:2: ( rule__Sound__DurationAssignment_2 )
            {
             before(grammarAccess.getSoundAccess().getDurationAssignment_2()); 
            // InternalThymioDSL.g:2453:2: ( rule__Sound__DurationAssignment_2 )
            // InternalThymioDSL.g:2453:3: rule__Sound__DurationAssignment_2
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
    // InternalThymioDSL.g:2462:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2466:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalThymioDSL.g:2467:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalThymioDSL.g:2474:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2478:1: ( ( ( '-' )? ) )
            // InternalThymioDSL.g:2479:1: ( ( '-' )? )
            {
            // InternalThymioDSL.g:2479:1: ( ( '-' )? )
            // InternalThymioDSL.g:2480:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalThymioDSL.g:2481:2: ( '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalThymioDSL.g:2481:3: '-'
                    {
                    match(input,24,FOLLOW_2); 

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
    // InternalThymioDSL.g:2489:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2493:1: ( rule__EInt__Group__1__Impl )
            // InternalThymioDSL.g:2494:2: rule__EInt__Group__1__Impl
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
    // InternalThymioDSL.g:2500:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2504:1: ( ( RULE_INT ) )
            // InternalThymioDSL.g:2505:1: ( RULE_INT )
            {
            // InternalThymioDSL.g:2505:1: ( RULE_INT )
            // InternalThymioDSL.g:2506:2: RULE_INT
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
    // InternalThymioDSL.g:2516:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2520:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalThymioDSL.g:2521:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalThymioDSL.g:2528:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2532:1: ( ( ruleMultiplication ) )
            // InternalThymioDSL.g:2533:1: ( ruleMultiplication )
            {
            // InternalThymioDSL.g:2533:1: ( ruleMultiplication )
            // InternalThymioDSL.g:2534:2: ruleMultiplication
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
    // InternalThymioDSL.g:2543:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2547:1: ( rule__Addition__Group__1__Impl )
            // InternalThymioDSL.g:2548:2: rule__Addition__Group__1__Impl
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
    // InternalThymioDSL.g:2554:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2558:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalThymioDSL.g:2559:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalThymioDSL.g:2559:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalThymioDSL.g:2560:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalThymioDSL.g:2561:2: ( rule__Addition__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=23 && LA19_0<=24)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalThymioDSL.g:2561:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalThymioDSL.g:2570:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2574:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalThymioDSL.g:2575:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalThymioDSL.g:2582:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2586:1: ( ( () ) )
            // InternalThymioDSL.g:2587:1: ( () )
            {
            // InternalThymioDSL.g:2587:1: ( () )
            // InternalThymioDSL.g:2588:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // InternalThymioDSL.g:2589:2: ()
            // InternalThymioDSL.g:2589:3: 
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
    // InternalThymioDSL.g:2597:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2601:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalThymioDSL.g:2602:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalThymioDSL.g:2609:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__OperatorAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2613:1: ( ( ( rule__Addition__OperatorAssignment_1_1 ) ) )
            // InternalThymioDSL.g:2614:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            {
            // InternalThymioDSL.g:2614:1: ( ( rule__Addition__OperatorAssignment_1_1 ) )
            // InternalThymioDSL.g:2615:2: ( rule__Addition__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1()); 
            // InternalThymioDSL.g:2616:2: ( rule__Addition__OperatorAssignment_1_1 )
            // InternalThymioDSL.g:2616:3: rule__Addition__OperatorAssignment_1_1
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
    // InternalThymioDSL.g:2624:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2628:1: ( rule__Addition__Group_1__2__Impl )
            // InternalThymioDSL.g:2629:2: rule__Addition__Group_1__2__Impl
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
    // InternalThymioDSL.g:2635:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2639:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalThymioDSL.g:2640:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalThymioDSL.g:2640:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalThymioDSL.g:2641:2: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // InternalThymioDSL.g:2642:2: ( rule__Addition__RightAssignment_1_2 )
            // InternalThymioDSL.g:2642:3: rule__Addition__RightAssignment_1_2
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
    // InternalThymioDSL.g:2651:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2655:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalThymioDSL.g:2656:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalThymioDSL.g:2663:1: rule__Multiplication__Group__0__Impl : ( ruleNumber ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2667:1: ( ( ruleNumber ) )
            // InternalThymioDSL.g:2668:1: ( ruleNumber )
            {
            // InternalThymioDSL.g:2668:1: ( ruleNumber )
            // InternalThymioDSL.g:2669:2: ruleNumber
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
    // InternalThymioDSL.g:2678:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2682:1: ( rule__Multiplication__Group__1__Impl )
            // InternalThymioDSL.g:2683:2: rule__Multiplication__Group__1__Impl
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
    // InternalThymioDSL.g:2689:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2693:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalThymioDSL.g:2694:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalThymioDSL.g:2694:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalThymioDSL.g:2695:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalThymioDSL.g:2696:2: ( rule__Multiplication__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=25 && LA20_0<=26)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalThymioDSL.g:2696:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalThymioDSL.g:2705:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2709:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalThymioDSL.g:2710:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalThymioDSL.g:2717:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2721:1: ( ( () ) )
            // InternalThymioDSL.g:2722:1: ( () )
            {
            // InternalThymioDSL.g:2722:1: ( () )
            // InternalThymioDSL.g:2723:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // InternalThymioDSL.g:2724:2: ()
            // InternalThymioDSL.g:2724:3: 
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
    // InternalThymioDSL.g:2732:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2736:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalThymioDSL.g:2737:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalThymioDSL.g:2744:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2748:1: ( ( ( rule__Multiplication__OperatorAssignment_1_1 ) ) )
            // InternalThymioDSL.g:2749:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            {
            // InternalThymioDSL.g:2749:1: ( ( rule__Multiplication__OperatorAssignment_1_1 ) )
            // InternalThymioDSL.g:2750:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1()); 
            // InternalThymioDSL.g:2751:2: ( rule__Multiplication__OperatorAssignment_1_1 )
            // InternalThymioDSL.g:2751:3: rule__Multiplication__OperatorAssignment_1_1
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
    // InternalThymioDSL.g:2759:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2763:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalThymioDSL.g:2764:2: rule__Multiplication__Group_1__2__Impl
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
    // InternalThymioDSL.g:2770:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2774:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalThymioDSL.g:2775:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalThymioDSL.g:2775:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalThymioDSL.g:2776:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalThymioDSL.g:2777:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalThymioDSL.g:2777:3: rule__Multiplication__RightAssignment_1_2
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
    // InternalThymioDSL.g:2786:1: rule__Number__Group_1__0 : rule__Number__Group_1__0__Impl rule__Number__Group_1__1 ;
    public final void rule__Number__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2790:1: ( rule__Number__Group_1__0__Impl rule__Number__Group_1__1 )
            // InternalThymioDSL.g:2791:2: rule__Number__Group_1__0__Impl rule__Number__Group_1__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalThymioDSL.g:2798:1: rule__Number__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Number__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2802:1: ( ( '(' ) )
            // InternalThymioDSL.g:2803:1: ( '(' )
            {
            // InternalThymioDSL.g:2803:1: ( '(' )
            // InternalThymioDSL.g:2804:2: '('
            {
             before(grammarAccess.getNumberAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalThymioDSL.g:2813:1: rule__Number__Group_1__1 : rule__Number__Group_1__1__Impl rule__Number__Group_1__2 ;
    public final void rule__Number__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2817:1: ( rule__Number__Group_1__1__Impl rule__Number__Group_1__2 )
            // InternalThymioDSL.g:2818:2: rule__Number__Group_1__1__Impl rule__Number__Group_1__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalThymioDSL.g:2825:1: rule__Number__Group_1__1__Impl : ( ruleAddition ) ;
    public final void rule__Number__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2829:1: ( ( ruleAddition ) )
            // InternalThymioDSL.g:2830:1: ( ruleAddition )
            {
            // InternalThymioDSL.g:2830:1: ( ruleAddition )
            // InternalThymioDSL.g:2831:2: ruleAddition
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
    // InternalThymioDSL.g:2840:1: rule__Number__Group_1__2 : rule__Number__Group_1__2__Impl ;
    public final void rule__Number__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2844:1: ( rule__Number__Group_1__2__Impl )
            // InternalThymioDSL.g:2845:2: rule__Number__Group_1__2__Impl
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
    // InternalThymioDSL.g:2851:1: rule__Number__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Number__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2855:1: ( ( ')' ) )
            // InternalThymioDSL.g:2856:1: ( ')' )
            {
            // InternalThymioDSL.g:2856:1: ( ')' )
            // InternalThymioDSL.g:2857:2: ')'
            {
             before(grammarAccess.getNumberAccess().getRightParenthesisKeyword_1_2()); 
            match(input,51,FOLLOW_2); 
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
    // InternalThymioDSL.g:2867:1: rule__Model__ProceduresAssignment : ( ruleProcedure ) ;
    public final void rule__Model__ProceduresAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2871:1: ( ( ruleProcedure ) )
            // InternalThymioDSL.g:2872:2: ( ruleProcedure )
            {
            // InternalThymioDSL.g:2872:2: ( ruleProcedure )
            // InternalThymioDSL.g:2873:3: ruleProcedure
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
    // InternalThymioDSL.g:2882:1: rule__Procedure__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Procedure__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2886:1: ( ( ruleEString ) )
            // InternalThymioDSL.g:2887:2: ( ruleEString )
            {
            // InternalThymioDSL.g:2887:2: ( ruleEString )
            // InternalThymioDSL.g:2888:3: ruleEString
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
    // InternalThymioDSL.g:2897:1: rule__Procedure__EventsAssignment_3 : ( ruleEvent ) ;
    public final void rule__Procedure__EventsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2901:1: ( ( ruleEvent ) )
            // InternalThymioDSL.g:2902:2: ( ruleEvent )
            {
            // InternalThymioDSL.g:2902:2: ( ruleEvent )
            // InternalThymioDSL.g:2903:3: ruleEvent
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
    // InternalThymioDSL.g:2912:1: rule__Procedure__ActionsAssignment_5 : ( ruleAction ) ;
    public final void rule__Procedure__ActionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2916:1: ( ( ruleAction ) )
            // InternalThymioDSL.g:2917:2: ( ruleAction )
            {
            // InternalThymioDSL.g:2917:2: ( ruleAction )
            // InternalThymioDSL.g:2918:3: ruleAction
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
    // InternalThymioDSL.g:2927:1: rule__Event__ButtonAssignment_0_1 : ( ruleOrtogonal ) ;
    public final void rule__Event__ButtonAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2931:1: ( ( ruleOrtogonal ) )
            // InternalThymioDSL.g:2932:2: ( ruleOrtogonal )
            {
            // InternalThymioDSL.g:2932:2: ( ruleOrtogonal )
            // InternalThymioDSL.g:2933:3: ruleOrtogonal
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
    // InternalThymioDSL.g:2942:1: rule__Event__TapAssignment_1_1 : ( ruleEBoolean ) ;
    public final void rule__Event__TapAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2946:1: ( ( ruleEBoolean ) )
            // InternalThymioDSL.g:2947:2: ( ruleEBoolean )
            {
            // InternalThymioDSL.g:2947:2: ( ruleEBoolean )
            // InternalThymioDSL.g:2948:3: ruleEBoolean
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
    // InternalThymioDSL.g:2957:1: rule__Event__MicAssignment_2_1 : ( ruleEBoolean ) ;
    public final void rule__Event__MicAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2961:1: ( ( ruleEBoolean ) )
            // InternalThymioDSL.g:2962:2: ( ruleEBoolean )
            {
            // InternalThymioDSL.g:2962:2: ( ruleEBoolean )
            // InternalThymioDSL.g:2963:3: ruleEBoolean
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


    // $ANTLR start "rule__Event__SensorAssignment_3_1"
    // InternalThymioDSL.g:2972:1: rule__Event__SensorAssignment_3_1 : ( ruleSensor ) ;
    public final void rule__Event__SensorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2976:1: ( ( ruleSensor ) )
            // InternalThymioDSL.g:2977:2: ( ruleSensor )
            {
            // InternalThymioDSL.g:2977:2: ( ruleSensor )
            // InternalThymioDSL.g:2978:3: ruleSensor
            {
             before(grammarAccess.getEventAccess().getSensorSensorParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getEventAccess().getSensorSensorParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__SensorAssignment_3_1"


    // $ANTLR start "rule__Sensor__BackLeftSensorAssignment_0_1"
    // InternalThymioDSL.g:2987:1: rule__Sensor__BackLeftSensorAssignment_0_1 : ( ruleBlackWhite ) ;
    public final void rule__Sensor__BackLeftSensorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2991:1: ( ( ruleBlackWhite ) )
            // InternalThymioDSL.g:2992:2: ( ruleBlackWhite )
            {
            // InternalThymioDSL.g:2992:2: ( ruleBlackWhite )
            // InternalThymioDSL.g:2993:3: ruleBlackWhite
            {
             before(grammarAccess.getSensorAccess().getBackLeftSensorBlackWhiteParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBlackWhite();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getBackLeftSensorBlackWhiteParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__BackLeftSensorAssignment_0_1"


    // $ANTLR start "rule__Sensor__BackRightSensorAssignment_1_1"
    // InternalThymioDSL.g:3002:1: rule__Sensor__BackRightSensorAssignment_1_1 : ( ruleBlackWhite ) ;
    public final void rule__Sensor__BackRightSensorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3006:1: ( ( ruleBlackWhite ) )
            // InternalThymioDSL.g:3007:2: ( ruleBlackWhite )
            {
            // InternalThymioDSL.g:3007:2: ( ruleBlackWhite )
            // InternalThymioDSL.g:3008:3: ruleBlackWhite
            {
             before(grammarAccess.getSensorAccess().getBackRightSensorBlackWhiteParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBlackWhite();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getBackRightSensorBlackWhiteParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__BackRightSensorAssignment_1_1"


    // $ANTLR start "rule__Sensor__FrontRightSensorAssignment_2_1"
    // InternalThymioDSL.g:3017:1: rule__Sensor__FrontRightSensorAssignment_2_1 : ( ruleEBoolean ) ;
    public final void rule__Sensor__FrontRightSensorAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3021:1: ( ( ruleEBoolean ) )
            // InternalThymioDSL.g:3022:2: ( ruleEBoolean )
            {
            // InternalThymioDSL.g:3022:2: ( ruleEBoolean )
            // InternalThymioDSL.g:3023:3: ruleEBoolean
            {
             before(grammarAccess.getSensorAccess().getFrontRightSensorEBooleanParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getFrontRightSensorEBooleanParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__FrontRightSensorAssignment_2_1"


    // $ANTLR start "rule__Sensor__FrontCenterRightSensorAssignment_3_1"
    // InternalThymioDSL.g:3032:1: rule__Sensor__FrontCenterRightSensorAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__Sensor__FrontCenterRightSensorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3036:1: ( ( ruleEBoolean ) )
            // InternalThymioDSL.g:3037:2: ( ruleEBoolean )
            {
            // InternalThymioDSL.g:3037:2: ( ruleEBoolean )
            // InternalThymioDSL.g:3038:3: ruleEBoolean
            {
             before(grammarAccess.getSensorAccess().getFrontCenterRightSensorEBooleanParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getFrontCenterRightSensorEBooleanParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__FrontCenterRightSensorAssignment_3_1"


    // $ANTLR start "rule__Sensor__FrontCenterSensorAssignment_4_1"
    // InternalThymioDSL.g:3047:1: rule__Sensor__FrontCenterSensorAssignment_4_1 : ( ruleEBoolean ) ;
    public final void rule__Sensor__FrontCenterSensorAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3051:1: ( ( ruleEBoolean ) )
            // InternalThymioDSL.g:3052:2: ( ruleEBoolean )
            {
            // InternalThymioDSL.g:3052:2: ( ruleEBoolean )
            // InternalThymioDSL.g:3053:3: ruleEBoolean
            {
             before(grammarAccess.getSensorAccess().getFrontCenterSensorEBooleanParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getFrontCenterSensorEBooleanParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__FrontCenterSensorAssignment_4_1"


    // $ANTLR start "rule__Sensor__FrontCenterLeftSensorAssignment_5_1"
    // InternalThymioDSL.g:3062:1: rule__Sensor__FrontCenterLeftSensorAssignment_5_1 : ( ruleEBoolean ) ;
    public final void rule__Sensor__FrontCenterLeftSensorAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3066:1: ( ( ruleEBoolean ) )
            // InternalThymioDSL.g:3067:2: ( ruleEBoolean )
            {
            // InternalThymioDSL.g:3067:2: ( ruleEBoolean )
            // InternalThymioDSL.g:3068:3: ruleEBoolean
            {
             before(grammarAccess.getSensorAccess().getFrontCenterLeftSensorEBooleanParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getFrontCenterLeftSensorEBooleanParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__FrontCenterLeftSensorAssignment_5_1"


    // $ANTLR start "rule__Sensor__FrontLeftSensorAssignment_6_1"
    // InternalThymioDSL.g:3077:1: rule__Sensor__FrontLeftSensorAssignment_6_1 : ( ruleEBoolean ) ;
    public final void rule__Sensor__FrontLeftSensorAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3081:1: ( ( ruleEBoolean ) )
            // InternalThymioDSL.g:3082:2: ( ruleEBoolean )
            {
            // InternalThymioDSL.g:3082:2: ( ruleEBoolean )
            // InternalThymioDSL.g:3083:3: ruleEBoolean
            {
             before(grammarAccess.getSensorAccess().getFrontLeftSensorEBooleanParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getFrontLeftSensorEBooleanParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__FrontLeftSensorAssignment_6_1"


    // $ANTLR start "rule__Action__MoveAssignment_0_1"
    // InternalThymioDSL.g:3092:1: rule__Action__MoveAssignment_0_1 : ( ruleMotors ) ;
    public final void rule__Action__MoveAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3096:1: ( ( ruleMotors ) )
            // InternalThymioDSL.g:3097:2: ( ruleMotors )
            {
            // InternalThymioDSL.g:3097:2: ( ruleMotors )
            // InternalThymioDSL.g:3098:3: ruleMotors
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
    // InternalThymioDSL.g:3107:1: rule__Action__LightAssignment_1_1 : ( ruleLights ) ;
    public final void rule__Action__LightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3111:1: ( ( ruleLights ) )
            // InternalThymioDSL.g:3112:2: ( ruleLights )
            {
            // InternalThymioDSL.g:3112:2: ( ruleLights )
            // InternalThymioDSL.g:3113:3: ruleLights
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
    // InternalThymioDSL.g:3122:1: rule__Action__SoundAssignment_2_1 : ( ruleSound ) ;
    public final void rule__Action__SoundAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3126:1: ( ( ruleSound ) )
            // InternalThymioDSL.g:3127:2: ( ruleSound )
            {
            // InternalThymioDSL.g:3127:2: ( ruleSound )
            // InternalThymioDSL.g:3128:3: ruleSound
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
    // InternalThymioDSL.g:3137:1: rule__Motors__LeftAssignment_1 : ( ruleAddition ) ;
    public final void rule__Motors__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3141:1: ( ( ruleAddition ) )
            // InternalThymioDSL.g:3142:2: ( ruleAddition )
            {
            // InternalThymioDSL.g:3142:2: ( ruleAddition )
            // InternalThymioDSL.g:3143:3: ruleAddition
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
    // InternalThymioDSL.g:3152:1: rule__Motors__RightAssignment_3 : ( ruleAddition ) ;
    public final void rule__Motors__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3156:1: ( ( ruleAddition ) )
            // InternalThymioDSL.g:3157:2: ( ruleAddition )
            {
            // InternalThymioDSL.g:3157:2: ( ruleAddition )
            // InternalThymioDSL.g:3158:3: ruleAddition
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
    // InternalThymioDSL.g:3167:1: rule__Lights__TopLightAssignment_1_1_0_1 : ( ruleRGB ) ;
    public final void rule__Lights__TopLightAssignment_1_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3171:1: ( ( ruleRGB ) )
            // InternalThymioDSL.g:3172:2: ( ruleRGB )
            {
            // InternalThymioDSL.g:3172:2: ( ruleRGB )
            // InternalThymioDSL.g:3173:3: ruleRGB
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
    // InternalThymioDSL.g:3182:1: rule__Lights__BottomLightAssignment_2_1_0_1 : ( ruleRGB ) ;
    public final void rule__Lights__BottomLightAssignment_2_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3186:1: ( ( ruleRGB ) )
            // InternalThymioDSL.g:3187:2: ( ruleRGB )
            {
            // InternalThymioDSL.g:3187:2: ( ruleRGB )
            // InternalThymioDSL.g:3188:3: ruleRGB
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
    // InternalThymioDSL.g:3197:1: rule__RGB__RedAssignment_1 : ( ruleAddition ) ;
    public final void rule__RGB__RedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3201:1: ( ( ruleAddition ) )
            // InternalThymioDSL.g:3202:2: ( ruleAddition )
            {
            // InternalThymioDSL.g:3202:2: ( ruleAddition )
            // InternalThymioDSL.g:3203:3: ruleAddition
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
    // InternalThymioDSL.g:3212:1: rule__RGB__GreenAssignment_3 : ( ruleAddition ) ;
    public final void rule__RGB__GreenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3216:1: ( ( ruleAddition ) )
            // InternalThymioDSL.g:3217:2: ( ruleAddition )
            {
            // InternalThymioDSL.g:3217:2: ( ruleAddition )
            // InternalThymioDSL.g:3218:3: ruleAddition
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
    // InternalThymioDSL.g:3227:1: rule__RGB__BlueAssignment_5 : ( ruleAddition ) ;
    public final void rule__RGB__BlueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3231:1: ( ( ruleAddition ) )
            // InternalThymioDSL.g:3232:2: ( ruleAddition )
            {
            // InternalThymioDSL.g:3232:2: ( ruleAddition )
            // InternalThymioDSL.g:3233:3: ruleAddition
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
    // InternalThymioDSL.g:3242:1: rule__Sound__PitchAssignment_1 : ( ruleAddition ) ;
    public final void rule__Sound__PitchAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3246:1: ( ( ruleAddition ) )
            // InternalThymioDSL.g:3247:2: ( ruleAddition )
            {
            // InternalThymioDSL.g:3247:2: ( ruleAddition )
            // InternalThymioDSL.g:3248:3: ruleAddition
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
    // InternalThymioDSL.g:3257:1: rule__Sound__DurationAssignment_2 : ( ruleNoteDuration ) ;
    public final void rule__Sound__DurationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3261:1: ( ( ruleNoteDuration ) )
            // InternalThymioDSL.g:3262:2: ( ruleNoteDuration )
            {
            // InternalThymioDSL.g:3262:2: ( ruleNoteDuration )
            // InternalThymioDSL.g:3263:3: ruleNoteDuration
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
    // InternalThymioDSL.g:3272:1: rule__Addition__OperatorAssignment_1_1 : ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Addition__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3276:1: ( ( ( rule__Addition__OperatorAlternatives_1_1_0 ) ) )
            // InternalThymioDSL.g:3277:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            {
            // InternalThymioDSL.g:3277:2: ( ( rule__Addition__OperatorAlternatives_1_1_0 ) )
            // InternalThymioDSL.g:3278:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0()); 
            // InternalThymioDSL.g:3279:3: ( rule__Addition__OperatorAlternatives_1_1_0 )
            // InternalThymioDSL.g:3279:4: rule__Addition__OperatorAlternatives_1_1_0
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
    // InternalThymioDSL.g:3287:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3291:1: ( ( ruleMultiplication ) )
            // InternalThymioDSL.g:3292:2: ( ruleMultiplication )
            {
            // InternalThymioDSL.g:3292:2: ( ruleMultiplication )
            // InternalThymioDSL.g:3293:3: ruleMultiplication
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
    // InternalThymioDSL.g:3302:1: rule__Multiplication__OperatorAssignment_1_1 : ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__Multiplication__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3306:1: ( ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) ) )
            // InternalThymioDSL.g:3307:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            {
            // InternalThymioDSL.g:3307:2: ( ( rule__Multiplication__OperatorAlternatives_1_1_0 ) )
            // InternalThymioDSL.g:3308:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0()); 
            // InternalThymioDSL.g:3309:3: ( rule__Multiplication__OperatorAlternatives_1_1_0 )
            // InternalThymioDSL.g:3309:4: rule__Multiplication__OperatorAlternatives_1_1_0
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
    // InternalThymioDSL.g:3317:1: rule__Multiplication__RightAssignment_1_2 : ( ruleNumber ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3321:1: ( ( ruleNumber ) )
            // InternalThymioDSL.g:3322:2: ( ruleNumber )
            {
            // InternalThymioDSL.g:3322:2: ( ruleNumber )
            // InternalThymioDSL.g:3323:3: ruleNumber
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
    // InternalThymioDSL.g:3332:1: rule__Number__ValueAssignment_0 : ( ruleEInt ) ;
    public final void rule__Number__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3336:1: ( ( ruleEInt ) )
            // InternalThymioDSL.g:3337:2: ( ruleEInt )
            {
            // InternalThymioDSL.g:3337:2: ( ruleEInt )
            // InternalThymioDSL.g:3338:3: ruleEInt
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000E0000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000001F0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000001FC00000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0002000001000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000800000000800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000006000002L});

}