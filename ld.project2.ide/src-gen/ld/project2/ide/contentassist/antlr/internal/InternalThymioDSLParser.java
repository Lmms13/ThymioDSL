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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'off'", "'short'", "'long'", "'up'", "'down'", "'left'", "'right'", "'center'", "'black'", "'white'", "'covered'", "'uncovered'", "'Procedure:'", "'Event:'", "'Action:'", "'button_is_clicked:'", "'robot_is_tapped:'", "'sound_is_detected:'", "'sensor_is_activated:'", "'back_left:'", "'back_right:'", "'front_right:'", "'front_center_right:'", "'front_center:'", "'front_center_left:'", "'front_left:'", "'move:'", "'top_light:'", "'bottom_light:'", "'sound:'", "'motors:'", "'left:'", "'right:'", "'note:'", "'-'", "'on'", "'('", "','", "')'", "'+'", "'*'"
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
    public static final int T__53=53;
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

                if ( (LA1_0==25) ) {
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


    // $ANTLR start "entryRuleMotor"
    // InternalThymioDSL.g:185:1: entryRuleMotor : ruleMotor EOF ;
    public final void entryRuleMotor() throws RecognitionException {
        try {
            // InternalThymioDSL.g:186:1: ( ruleMotor EOF )
            // InternalThymioDSL.g:187:1: ruleMotor EOF
            {
             before(grammarAccess.getMotorRule()); 
            pushFollow(FOLLOW_1);
            ruleMotor();

            state._fsp--;

             after(grammarAccess.getMotorRule()); 
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
    // $ANTLR end "entryRuleMotor"


    // $ANTLR start "ruleMotor"
    // InternalThymioDSL.g:194:1: ruleMotor : ( ( rule__Motor__Group__0 ) ) ;
    public final void ruleMotor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:198:2: ( ( ( rule__Motor__Group__0 ) ) )
            // InternalThymioDSL.g:199:2: ( ( rule__Motor__Group__0 ) )
            {
            // InternalThymioDSL.g:199:2: ( ( rule__Motor__Group__0 ) )
            // InternalThymioDSL.g:200:3: ( rule__Motor__Group__0 )
            {
             before(grammarAccess.getMotorAccess().getGroup()); 
            // InternalThymioDSL.g:201:3: ( rule__Motor__Group__0 )
            // InternalThymioDSL.g:201:4: rule__Motor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Motor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMotorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMotor"


    // $ANTLR start "entryRuleSound"
    // InternalThymioDSL.g:210:1: entryRuleSound : ruleSound EOF ;
    public final void entryRuleSound() throws RecognitionException {
        try {
            // InternalThymioDSL.g:211:1: ( ruleSound EOF )
            // InternalThymioDSL.g:212:1: ruleSound EOF
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
    // InternalThymioDSL.g:219:1: ruleSound : ( ( rule__Sound__Group__0 ) ) ;
    public final void ruleSound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:223:2: ( ( ( rule__Sound__Group__0 ) ) )
            // InternalThymioDSL.g:224:2: ( ( rule__Sound__Group__0 ) )
            {
            // InternalThymioDSL.g:224:2: ( ( rule__Sound__Group__0 ) )
            // InternalThymioDSL.g:225:3: ( rule__Sound__Group__0 )
            {
             before(grammarAccess.getSoundAccess().getGroup()); 
            // InternalThymioDSL.g:226:3: ( rule__Sound__Group__0 )
            // InternalThymioDSL.g:226:4: rule__Sound__Group__0
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
    // InternalThymioDSL.g:235:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalThymioDSL.g:236:1: ( ruleEInt EOF )
            // InternalThymioDSL.g:237:1: ruleEInt EOF
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
    // InternalThymioDSL.g:244:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:248:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalThymioDSL.g:249:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalThymioDSL.g:249:2: ( ( rule__EInt__Group__0 ) )
            // InternalThymioDSL.g:250:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalThymioDSL.g:251:3: ( rule__EInt__Group__0 )
            // InternalThymioDSL.g:251:4: rule__EInt__Group__0
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
    // InternalThymioDSL.g:260:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalThymioDSL.g:261:1: ( ruleEString EOF )
            // InternalThymioDSL.g:262:1: ruleEString EOF
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
    // InternalThymioDSL.g:269:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:273:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalThymioDSL.g:274:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalThymioDSL.g:274:2: ( ( rule__EString__Alternatives ) )
            // InternalThymioDSL.g:275:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalThymioDSL.g:276:3: ( rule__EString__Alternatives )
            // InternalThymioDSL.g:276:4: rule__EString__Alternatives
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
    // InternalThymioDSL.g:285:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalThymioDSL.g:286:1: ( ruleEBoolean EOF )
            // InternalThymioDSL.g:287:1: ruleEBoolean EOF
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
    // InternalThymioDSL.g:294:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:298:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalThymioDSL.g:299:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalThymioDSL.g:299:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalThymioDSL.g:300:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalThymioDSL.g:301:3: ( rule__EBoolean__Alternatives )
            // InternalThymioDSL.g:301:4: rule__EBoolean__Alternatives
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


    // $ANTLR start "entryRuleOnOff"
    // InternalThymioDSL.g:310:1: entryRuleOnOff : ruleOnOff EOF ;
    public final void entryRuleOnOff() throws RecognitionException {
        try {
            // InternalThymioDSL.g:311:1: ( ruleOnOff EOF )
            // InternalThymioDSL.g:312:1: ruleOnOff EOF
            {
             before(grammarAccess.getOnOffRule()); 
            pushFollow(FOLLOW_1);
            ruleOnOff();

            state._fsp--;

             after(grammarAccess.getOnOffRule()); 
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
    // $ANTLR end "entryRuleOnOff"


    // $ANTLR start "ruleOnOff"
    // InternalThymioDSL.g:319:1: ruleOnOff : ( ( rule__OnOff__Alternatives ) ) ;
    public final void ruleOnOff() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:323:2: ( ( ( rule__OnOff__Alternatives ) ) )
            // InternalThymioDSL.g:324:2: ( ( rule__OnOff__Alternatives ) )
            {
            // InternalThymioDSL.g:324:2: ( ( rule__OnOff__Alternatives ) )
            // InternalThymioDSL.g:325:3: ( rule__OnOff__Alternatives )
            {
             before(grammarAccess.getOnOffAccess().getAlternatives()); 
            // InternalThymioDSL.g:326:3: ( rule__OnOff__Alternatives )
            // InternalThymioDSL.g:326:4: rule__OnOff__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OnOff__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOnOffAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOnOff"


    // $ANTLR start "entryRuleRGB"
    // InternalThymioDSL.g:335:1: entryRuleRGB : ruleRGB EOF ;
    public final void entryRuleRGB() throws RecognitionException {
        try {
            // InternalThymioDSL.g:336:1: ( ruleRGB EOF )
            // InternalThymioDSL.g:337:1: ruleRGB EOF
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
    // InternalThymioDSL.g:344:1: ruleRGB : ( ( rule__RGB__Group__0 ) ) ;
    public final void ruleRGB() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:348:2: ( ( ( rule__RGB__Group__0 ) ) )
            // InternalThymioDSL.g:349:2: ( ( rule__RGB__Group__0 ) )
            {
            // InternalThymioDSL.g:349:2: ( ( rule__RGB__Group__0 ) )
            // InternalThymioDSL.g:350:3: ( rule__RGB__Group__0 )
            {
             before(grammarAccess.getRGBAccess().getGroup()); 
            // InternalThymioDSL.g:351:3: ( rule__RGB__Group__0 )
            // InternalThymioDSL.g:351:4: rule__RGB__Group__0
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


    // $ANTLR start "entryRuleAddition"
    // InternalThymioDSL.g:460:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalThymioDSL.g:461:1: ( ruleAddition EOF )
            // InternalThymioDSL.g:462:1: ruleAddition EOF
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
    // InternalThymioDSL.g:469:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:473:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalThymioDSL.g:474:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalThymioDSL.g:474:2: ( ( rule__Addition__Group__0 ) )
            // InternalThymioDSL.g:475:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalThymioDSL.g:476:3: ( rule__Addition__Group__0 )
            // InternalThymioDSL.g:476:4: rule__Addition__Group__0
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
    // InternalThymioDSL.g:485:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalThymioDSL.g:486:1: ( ruleMultiplication EOF )
            // InternalThymioDSL.g:487:1: ruleMultiplication EOF
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
    // InternalThymioDSL.g:494:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:498:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalThymioDSL.g:499:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalThymioDSL.g:499:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalThymioDSL.g:500:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalThymioDSL.g:501:3: ( rule__Multiplication__Group__0 )
            // InternalThymioDSL.g:501:4: rule__Multiplication__Group__0
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
    // InternalThymioDSL.g:510:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalThymioDSL.g:511:1: ( ruleNumber EOF )
            // InternalThymioDSL.g:512:1: ruleNumber EOF
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
    // InternalThymioDSL.g:519:1: ruleNumber : ( ( rule__Number__Alternatives ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:523:2: ( ( ( rule__Number__Alternatives ) ) )
            // InternalThymioDSL.g:524:2: ( ( rule__Number__Alternatives ) )
            {
            // InternalThymioDSL.g:524:2: ( ( rule__Number__Alternatives ) )
            // InternalThymioDSL.g:525:3: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // InternalThymioDSL.g:526:3: ( rule__Number__Alternatives )
            // InternalThymioDSL.g:526:4: rule__Number__Alternatives
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
    // InternalThymioDSL.g:534:1: rule__Event__Alternatives : ( ( ( rule__Event__Group_0__0 ) ) | ( ( rule__Event__Group_1__0 ) ) | ( ( rule__Event__Group_2__0 ) ) | ( ( ( rule__Event__Group_3__0 ) ) ( ( rule__Event__Group_3__0 )* ) ) );
    public final void rule__Event__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:538:1: ( ( ( rule__Event__Group_0__0 ) ) | ( ( rule__Event__Group_1__0 ) ) | ( ( rule__Event__Group_2__0 ) ) | ( ( ( rule__Event__Group_3__0 ) ) ( ( rule__Event__Group_3__0 )* ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt3=1;
                }
                break;
            case 29:
                {
                alt3=2;
                }
                break;
            case 30:
                {
                alt3=3;
                }
                break;
            case 31:
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
                    // InternalThymioDSL.g:539:2: ( ( rule__Event__Group_0__0 ) )
                    {
                    // InternalThymioDSL.g:539:2: ( ( rule__Event__Group_0__0 ) )
                    // InternalThymioDSL.g:540:3: ( rule__Event__Group_0__0 )
                    {
                     before(grammarAccess.getEventAccess().getGroup_0()); 
                    // InternalThymioDSL.g:541:3: ( rule__Event__Group_0__0 )
                    // InternalThymioDSL.g:541:4: rule__Event__Group_0__0
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
                    // InternalThymioDSL.g:545:2: ( ( rule__Event__Group_1__0 ) )
                    {
                    // InternalThymioDSL.g:545:2: ( ( rule__Event__Group_1__0 ) )
                    // InternalThymioDSL.g:546:3: ( rule__Event__Group_1__0 )
                    {
                     before(grammarAccess.getEventAccess().getGroup_1()); 
                    // InternalThymioDSL.g:547:3: ( rule__Event__Group_1__0 )
                    // InternalThymioDSL.g:547:4: rule__Event__Group_1__0
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
                    // InternalThymioDSL.g:551:2: ( ( rule__Event__Group_2__0 ) )
                    {
                    // InternalThymioDSL.g:551:2: ( ( rule__Event__Group_2__0 ) )
                    // InternalThymioDSL.g:552:3: ( rule__Event__Group_2__0 )
                    {
                     before(grammarAccess.getEventAccess().getGroup_2()); 
                    // InternalThymioDSL.g:553:3: ( rule__Event__Group_2__0 )
                    // InternalThymioDSL.g:553:4: rule__Event__Group_2__0
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
                    // InternalThymioDSL.g:557:2: ( ( ( rule__Event__Group_3__0 ) ) ( ( rule__Event__Group_3__0 )* ) )
                    {
                    // InternalThymioDSL.g:557:2: ( ( ( rule__Event__Group_3__0 ) ) ( ( rule__Event__Group_3__0 )* ) )
                    // InternalThymioDSL.g:558:3: ( ( rule__Event__Group_3__0 ) ) ( ( rule__Event__Group_3__0 )* )
                    {
                    // InternalThymioDSL.g:558:3: ( ( rule__Event__Group_3__0 ) )
                    // InternalThymioDSL.g:559:4: ( rule__Event__Group_3__0 )
                    {
                     before(grammarAccess.getEventAccess().getGroup_3()); 
                    // InternalThymioDSL.g:560:4: ( rule__Event__Group_3__0 )
                    // InternalThymioDSL.g:560:5: rule__Event__Group_3__0
                    {
                    pushFollow(FOLLOW_4);
                    rule__Event__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getGroup_3()); 

                    }

                    // InternalThymioDSL.g:563:3: ( ( rule__Event__Group_3__0 )* )
                    // InternalThymioDSL.g:564:4: ( rule__Event__Group_3__0 )*
                    {
                     before(grammarAccess.getEventAccess().getGroup_3()); 
                    // InternalThymioDSL.g:565:4: ( rule__Event__Group_3__0 )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==31) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalThymioDSL.g:565:5: rule__Event__Group_3__0
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
    // InternalThymioDSL.g:574:1: rule__Sensor__Alternatives : ( ( ( rule__Sensor__Group_0__0 ) ) | ( ( rule__Sensor__Group_1__0 ) ) | ( ( rule__Sensor__Group_2__0 ) ) | ( ( rule__Sensor__Group_3__0 ) ) | ( ( rule__Sensor__Group_4__0 ) ) | ( ( rule__Sensor__Group_5__0 ) ) | ( ( rule__Sensor__Group_6__0 ) ) );
    public final void rule__Sensor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:578:1: ( ( ( rule__Sensor__Group_0__0 ) ) | ( ( rule__Sensor__Group_1__0 ) ) | ( ( rule__Sensor__Group_2__0 ) ) | ( ( rule__Sensor__Group_3__0 ) ) | ( ( rule__Sensor__Group_4__0 ) ) | ( ( rule__Sensor__Group_5__0 ) ) | ( ( rule__Sensor__Group_6__0 ) ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt4=1;
                }
                break;
            case 33:
                {
                alt4=2;
                }
                break;
            case 34:
                {
                alt4=3;
                }
                break;
            case 35:
                {
                alt4=4;
                }
                break;
            case 36:
                {
                alt4=5;
                }
                break;
            case 37:
                {
                alt4=6;
                }
                break;
            case 38:
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
                    // InternalThymioDSL.g:579:2: ( ( rule__Sensor__Group_0__0 ) )
                    {
                    // InternalThymioDSL.g:579:2: ( ( rule__Sensor__Group_0__0 ) )
                    // InternalThymioDSL.g:580:3: ( rule__Sensor__Group_0__0 )
                    {
                     before(grammarAccess.getSensorAccess().getGroup_0()); 
                    // InternalThymioDSL.g:581:3: ( rule__Sensor__Group_0__0 )
                    // InternalThymioDSL.g:581:4: rule__Sensor__Group_0__0
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
                    // InternalThymioDSL.g:585:2: ( ( rule__Sensor__Group_1__0 ) )
                    {
                    // InternalThymioDSL.g:585:2: ( ( rule__Sensor__Group_1__0 ) )
                    // InternalThymioDSL.g:586:3: ( rule__Sensor__Group_1__0 )
                    {
                     before(grammarAccess.getSensorAccess().getGroup_1()); 
                    // InternalThymioDSL.g:587:3: ( rule__Sensor__Group_1__0 )
                    // InternalThymioDSL.g:587:4: rule__Sensor__Group_1__0
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
                    // InternalThymioDSL.g:591:2: ( ( rule__Sensor__Group_2__0 ) )
                    {
                    // InternalThymioDSL.g:591:2: ( ( rule__Sensor__Group_2__0 ) )
                    // InternalThymioDSL.g:592:3: ( rule__Sensor__Group_2__0 )
                    {
                     before(grammarAccess.getSensorAccess().getGroup_2()); 
                    // InternalThymioDSL.g:593:3: ( rule__Sensor__Group_2__0 )
                    // InternalThymioDSL.g:593:4: rule__Sensor__Group_2__0
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
                    // InternalThymioDSL.g:597:2: ( ( rule__Sensor__Group_3__0 ) )
                    {
                    // InternalThymioDSL.g:597:2: ( ( rule__Sensor__Group_3__0 ) )
                    // InternalThymioDSL.g:598:3: ( rule__Sensor__Group_3__0 )
                    {
                     before(grammarAccess.getSensorAccess().getGroup_3()); 
                    // InternalThymioDSL.g:599:3: ( rule__Sensor__Group_3__0 )
                    // InternalThymioDSL.g:599:4: rule__Sensor__Group_3__0
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
                    // InternalThymioDSL.g:603:2: ( ( rule__Sensor__Group_4__0 ) )
                    {
                    // InternalThymioDSL.g:603:2: ( ( rule__Sensor__Group_4__0 ) )
                    // InternalThymioDSL.g:604:3: ( rule__Sensor__Group_4__0 )
                    {
                     before(grammarAccess.getSensorAccess().getGroup_4()); 
                    // InternalThymioDSL.g:605:3: ( rule__Sensor__Group_4__0 )
                    // InternalThymioDSL.g:605:4: rule__Sensor__Group_4__0
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
                    // InternalThymioDSL.g:609:2: ( ( rule__Sensor__Group_5__0 ) )
                    {
                    // InternalThymioDSL.g:609:2: ( ( rule__Sensor__Group_5__0 ) )
                    // InternalThymioDSL.g:610:3: ( rule__Sensor__Group_5__0 )
                    {
                     before(grammarAccess.getSensorAccess().getGroup_5()); 
                    // InternalThymioDSL.g:611:3: ( rule__Sensor__Group_5__0 )
                    // InternalThymioDSL.g:611:4: rule__Sensor__Group_5__0
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
                    // InternalThymioDSL.g:615:2: ( ( rule__Sensor__Group_6__0 ) )
                    {
                    // InternalThymioDSL.g:615:2: ( ( rule__Sensor__Group_6__0 ) )
                    // InternalThymioDSL.g:616:3: ( rule__Sensor__Group_6__0 )
                    {
                     before(grammarAccess.getSensorAccess().getGroup_6()); 
                    // InternalThymioDSL.g:617:3: ( rule__Sensor__Group_6__0 )
                    // InternalThymioDSL.g:617:4: rule__Sensor__Group_6__0
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
    // InternalThymioDSL.g:625:1: rule__Action__Alternatives : ( ( ( rule__Action__Group_0__0 ) ) | ( ( rule__Action__Group_1__0 ) ) | ( ( rule__Action__Group_2__0 ) ) | ( ( rule__Action__Group_3__0 ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:629:1: ( ( ( rule__Action__Group_0__0 ) ) | ( ( rule__Action__Group_1__0 ) ) | ( ( rule__Action__Group_2__0 ) ) | ( ( rule__Action__Group_3__0 ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt5=1;
                }
                break;
            case 40:
                {
                alt5=2;
                }
                break;
            case 41:
                {
                alt5=3;
                }
                break;
            case 42:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalThymioDSL.g:630:2: ( ( rule__Action__Group_0__0 ) )
                    {
                    // InternalThymioDSL.g:630:2: ( ( rule__Action__Group_0__0 ) )
                    // InternalThymioDSL.g:631:3: ( rule__Action__Group_0__0 )
                    {
                     before(grammarAccess.getActionAccess().getGroup_0()); 
                    // InternalThymioDSL.g:632:3: ( rule__Action__Group_0__0 )
                    // InternalThymioDSL.g:632:4: rule__Action__Group_0__0
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
                    // InternalThymioDSL.g:636:2: ( ( rule__Action__Group_1__0 ) )
                    {
                    // InternalThymioDSL.g:636:2: ( ( rule__Action__Group_1__0 ) )
                    // InternalThymioDSL.g:637:3: ( rule__Action__Group_1__0 )
                    {
                     before(grammarAccess.getActionAccess().getGroup_1()); 
                    // InternalThymioDSL.g:638:3: ( rule__Action__Group_1__0 )
                    // InternalThymioDSL.g:638:4: rule__Action__Group_1__0
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
                    // InternalThymioDSL.g:642:2: ( ( rule__Action__Group_2__0 ) )
                    {
                    // InternalThymioDSL.g:642:2: ( ( rule__Action__Group_2__0 ) )
                    // InternalThymioDSL.g:643:3: ( rule__Action__Group_2__0 )
                    {
                     before(grammarAccess.getActionAccess().getGroup_2()); 
                    // InternalThymioDSL.g:644:3: ( rule__Action__Group_2__0 )
                    // InternalThymioDSL.g:644:4: rule__Action__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalThymioDSL.g:648:2: ( ( rule__Action__Group_3__0 ) )
                    {
                    // InternalThymioDSL.g:648:2: ( ( rule__Action__Group_3__0 ) )
                    // InternalThymioDSL.g:649:3: ( rule__Action__Group_3__0 )
                    {
                     before(grammarAccess.getActionAccess().getGroup_3()); 
                    // InternalThymioDSL.g:650:3: ( rule__Action__Group_3__0 )
                    // InternalThymioDSL.g:650:4: rule__Action__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionAccess().getGroup_3()); 

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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalThymioDSL.g:658:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:662:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalThymioDSL.g:663:2: ( RULE_STRING )
                    {
                    // InternalThymioDSL.g:663:2: ( RULE_STRING )
                    // InternalThymioDSL.g:664:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:669:2: ( RULE_ID )
                    {
                    // InternalThymioDSL.g:669:2: ( RULE_ID )
                    // InternalThymioDSL.g:670:3: RULE_ID
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
    // InternalThymioDSL.g:679:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:683:1: ( ( 'true' ) | ( 'false' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            else if ( (LA7_0==12) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalThymioDSL.g:684:2: ( 'true' )
                    {
                    // InternalThymioDSL.g:684:2: ( 'true' )
                    // InternalThymioDSL.g:685:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:690:2: ( 'false' )
                    {
                    // InternalThymioDSL.g:690:2: ( 'false' )
                    // InternalThymioDSL.g:691:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,12,FOLLOW_2); 
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


    // $ANTLR start "rule__OnOff__Alternatives"
    // InternalThymioDSL.g:700:1: rule__OnOff__Alternatives : ( ( ( rule__OnOff__Group_0__0 ) ) | ( 'off' ) );
    public final void rule__OnOff__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:704:1: ( ( ( rule__OnOff__Group_0__0 ) ) | ( 'off' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==48) ) {
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
                    // InternalThymioDSL.g:705:2: ( ( rule__OnOff__Group_0__0 ) )
                    {
                    // InternalThymioDSL.g:705:2: ( ( rule__OnOff__Group_0__0 ) )
                    // InternalThymioDSL.g:706:3: ( rule__OnOff__Group_0__0 )
                    {
                     before(grammarAccess.getOnOffAccess().getGroup_0()); 
                    // InternalThymioDSL.g:707:3: ( rule__OnOff__Group_0__0 )
                    // InternalThymioDSL.g:707:4: rule__OnOff__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OnOff__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOnOffAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:711:2: ( 'off' )
                    {
                    // InternalThymioDSL.g:711:2: ( 'off' )
                    // InternalThymioDSL.g:712:3: 'off'
                    {
                     before(grammarAccess.getOnOffAccess().getOffKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getOnOffAccess().getOffKeyword_1()); 

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
    // $ANTLR end "rule__OnOff__Alternatives"


    // $ANTLR start "rule__NoteDuration__Alternatives"
    // InternalThymioDSL.g:721:1: rule__NoteDuration__Alternatives : ( ( 'short' ) | ( 'long' ) );
    public final void rule__NoteDuration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:725:1: ( ( 'short' ) | ( 'long' ) )
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
                    // InternalThymioDSL.g:726:2: ( 'short' )
                    {
                    // InternalThymioDSL.g:726:2: ( 'short' )
                    // InternalThymioDSL.g:727:3: 'short'
                    {
                     before(grammarAccess.getNoteDurationAccess().getShortKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getNoteDurationAccess().getShortKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:732:2: ( 'long' )
                    {
                    // InternalThymioDSL.g:732:2: ( 'long' )
                    // InternalThymioDSL.g:733:3: 'long'
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
    // InternalThymioDSL.g:742:1: rule__Ortogonal__Alternatives : ( ( 'up' ) | ( 'down' ) | ( 'left' ) | ( 'right' ) | ( 'center' ) );
    public final void rule__Ortogonal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:746:1: ( ( 'up' ) | ( 'down' ) | ( 'left' ) | ( 'right' ) | ( 'center' ) )
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
                    // InternalThymioDSL.g:747:2: ( 'up' )
                    {
                    // InternalThymioDSL.g:747:2: ( 'up' )
                    // InternalThymioDSL.g:748:3: 'up'
                    {
                     before(grammarAccess.getOrtogonalAccess().getUpKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getOrtogonalAccess().getUpKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:753:2: ( 'down' )
                    {
                    // InternalThymioDSL.g:753:2: ( 'down' )
                    // InternalThymioDSL.g:754:3: 'down'
                    {
                     before(grammarAccess.getOrtogonalAccess().getDownKeyword_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getOrtogonalAccess().getDownKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalThymioDSL.g:759:2: ( 'left' )
                    {
                    // InternalThymioDSL.g:759:2: ( 'left' )
                    // InternalThymioDSL.g:760:3: 'left'
                    {
                     before(grammarAccess.getOrtogonalAccess().getLeftKeyword_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getOrtogonalAccess().getLeftKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalThymioDSL.g:765:2: ( 'right' )
                    {
                    // InternalThymioDSL.g:765:2: ( 'right' )
                    // InternalThymioDSL.g:766:3: 'right'
                    {
                     before(grammarAccess.getOrtogonalAccess().getRightKeyword_3()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getOrtogonalAccess().getRightKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalThymioDSL.g:771:2: ( 'center' )
                    {
                    // InternalThymioDSL.g:771:2: ( 'center' )
                    // InternalThymioDSL.g:772:3: 'center'
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
    // InternalThymioDSL.g:781:1: rule__BlackWhite__Alternatives : ( ( 'black' ) | ( 'white' ) );
    public final void rule__BlackWhite__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:785:1: ( ( 'black' ) | ( 'white' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            else if ( (LA11_0==22) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalThymioDSL.g:786:2: ( 'black' )
                    {
                    // InternalThymioDSL.g:786:2: ( 'black' )
                    // InternalThymioDSL.g:787:3: 'black'
                    {
                     before(grammarAccess.getBlackWhiteAccess().getBlackKeyword_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getBlackWhiteAccess().getBlackKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:792:2: ( 'white' )
                    {
                    // InternalThymioDSL.g:792:2: ( 'white' )
                    // InternalThymioDSL.g:793:3: 'white'
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


    // $ANTLR start "rule__SensorStatus__Alternatives"
    // InternalThymioDSL.g:802:1: rule__SensorStatus__Alternatives : ( ( 'covered' ) | ( 'uncovered' ) );
    public final void rule__SensorStatus__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:806:1: ( ( 'covered' ) | ( 'uncovered' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            else if ( (LA12_0==24) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalThymioDSL.g:807:2: ( 'covered' )
                    {
                    // InternalThymioDSL.g:807:2: ( 'covered' )
                    // InternalThymioDSL.g:808:3: 'covered'
                    {
                     before(grammarAccess.getSensorStatusAccess().getCoveredKeyword_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getSensorStatusAccess().getCoveredKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:813:2: ( 'uncovered' )
                    {
                    // InternalThymioDSL.g:813:2: ( 'uncovered' )
                    // InternalThymioDSL.g:814:3: 'uncovered'
                    {
                     before(grammarAccess.getSensorStatusAccess().getUncoveredKeyword_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getSensorStatusAccess().getUncoveredKeyword_1()); 

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


    // $ANTLR start "rule__Number__Alternatives"
    // InternalThymioDSL.g:823:1: rule__Number__Alternatives : ( ( ( rule__Number__ValueAssignment_0 ) ) | ( ( rule__Number__Group_1__0 ) ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:827:1: ( ( ( rule__Number__ValueAssignment_0 ) ) | ( ( rule__Number__Group_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT||LA13_0==47) ) {
                alt13=1;
            }
            else if ( (LA13_0==49) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalThymioDSL.g:828:2: ( ( rule__Number__ValueAssignment_0 ) )
                    {
                    // InternalThymioDSL.g:828:2: ( ( rule__Number__ValueAssignment_0 ) )
                    // InternalThymioDSL.g:829:3: ( rule__Number__ValueAssignment_0 )
                    {
                     before(grammarAccess.getNumberAccess().getValueAssignment_0()); 
                    // InternalThymioDSL.g:830:3: ( rule__Number__ValueAssignment_0 )
                    // InternalThymioDSL.g:830:4: rule__Number__ValueAssignment_0
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
                    // InternalThymioDSL.g:834:2: ( ( rule__Number__Group_1__0 ) )
                    {
                    // InternalThymioDSL.g:834:2: ( ( rule__Number__Group_1__0 ) )
                    // InternalThymioDSL.g:835:3: ( rule__Number__Group_1__0 )
                    {
                     before(grammarAccess.getNumberAccess().getGroup_1()); 
                    // InternalThymioDSL.g:836:3: ( rule__Number__Group_1__0 )
                    // InternalThymioDSL.g:836:4: rule__Number__Group_1__0
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
    // InternalThymioDSL.g:844:1: rule__Procedure__Group__0 : rule__Procedure__Group__0__Impl rule__Procedure__Group__1 ;
    public final void rule__Procedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:848:1: ( rule__Procedure__Group__0__Impl rule__Procedure__Group__1 )
            // InternalThymioDSL.g:849:2: rule__Procedure__Group__0__Impl rule__Procedure__Group__1
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
    // InternalThymioDSL.g:856:1: rule__Procedure__Group__0__Impl : ( 'Procedure:' ) ;
    public final void rule__Procedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:860:1: ( ( 'Procedure:' ) )
            // InternalThymioDSL.g:861:1: ( 'Procedure:' )
            {
            // InternalThymioDSL.g:861:1: ( 'Procedure:' )
            // InternalThymioDSL.g:862:2: 'Procedure:'
            {
             before(grammarAccess.getProcedureAccess().getProcedureKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalThymioDSL.g:871:1: rule__Procedure__Group__1 : rule__Procedure__Group__1__Impl rule__Procedure__Group__2 ;
    public final void rule__Procedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:875:1: ( rule__Procedure__Group__1__Impl rule__Procedure__Group__2 )
            // InternalThymioDSL.g:876:2: rule__Procedure__Group__1__Impl rule__Procedure__Group__2
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
    // InternalThymioDSL.g:883:1: rule__Procedure__Group__1__Impl : ( ( rule__Procedure__NameAssignment_1 ) ) ;
    public final void rule__Procedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:887:1: ( ( ( rule__Procedure__NameAssignment_1 ) ) )
            // InternalThymioDSL.g:888:1: ( ( rule__Procedure__NameAssignment_1 ) )
            {
            // InternalThymioDSL.g:888:1: ( ( rule__Procedure__NameAssignment_1 ) )
            // InternalThymioDSL.g:889:2: ( rule__Procedure__NameAssignment_1 )
            {
             before(grammarAccess.getProcedureAccess().getNameAssignment_1()); 
            // InternalThymioDSL.g:890:2: ( rule__Procedure__NameAssignment_1 )
            // InternalThymioDSL.g:890:3: rule__Procedure__NameAssignment_1
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
    // InternalThymioDSL.g:898:1: rule__Procedure__Group__2 : rule__Procedure__Group__2__Impl rule__Procedure__Group__3 ;
    public final void rule__Procedure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:902:1: ( rule__Procedure__Group__2__Impl rule__Procedure__Group__3 )
            // InternalThymioDSL.g:903:2: rule__Procedure__Group__2__Impl rule__Procedure__Group__3
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
    // InternalThymioDSL.g:910:1: rule__Procedure__Group__2__Impl : ( 'Event:' ) ;
    public final void rule__Procedure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:914:1: ( ( 'Event:' ) )
            // InternalThymioDSL.g:915:1: ( 'Event:' )
            {
            // InternalThymioDSL.g:915:1: ( 'Event:' )
            // InternalThymioDSL.g:916:2: 'Event:'
            {
             before(grammarAccess.getProcedureAccess().getEventKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalThymioDSL.g:925:1: rule__Procedure__Group__3 : rule__Procedure__Group__3__Impl rule__Procedure__Group__4 ;
    public final void rule__Procedure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:929:1: ( rule__Procedure__Group__3__Impl rule__Procedure__Group__4 )
            // InternalThymioDSL.g:930:2: rule__Procedure__Group__3__Impl rule__Procedure__Group__4
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
    // InternalThymioDSL.g:937:1: rule__Procedure__Group__3__Impl : ( ( rule__Procedure__EventsAssignment_3 ) ) ;
    public final void rule__Procedure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:941:1: ( ( ( rule__Procedure__EventsAssignment_3 ) ) )
            // InternalThymioDSL.g:942:1: ( ( rule__Procedure__EventsAssignment_3 ) )
            {
            // InternalThymioDSL.g:942:1: ( ( rule__Procedure__EventsAssignment_3 ) )
            // InternalThymioDSL.g:943:2: ( rule__Procedure__EventsAssignment_3 )
            {
             before(grammarAccess.getProcedureAccess().getEventsAssignment_3()); 
            // InternalThymioDSL.g:944:2: ( rule__Procedure__EventsAssignment_3 )
            // InternalThymioDSL.g:944:3: rule__Procedure__EventsAssignment_3
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
    // InternalThymioDSL.g:952:1: rule__Procedure__Group__4 : rule__Procedure__Group__4__Impl rule__Procedure__Group__5 ;
    public final void rule__Procedure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:956:1: ( rule__Procedure__Group__4__Impl rule__Procedure__Group__5 )
            // InternalThymioDSL.g:957:2: rule__Procedure__Group__4__Impl rule__Procedure__Group__5
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
    // InternalThymioDSL.g:964:1: rule__Procedure__Group__4__Impl : ( 'Action:' ) ;
    public final void rule__Procedure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:968:1: ( ( 'Action:' ) )
            // InternalThymioDSL.g:969:1: ( 'Action:' )
            {
            // InternalThymioDSL.g:969:1: ( 'Action:' )
            // InternalThymioDSL.g:970:2: 'Action:'
            {
             before(grammarAccess.getProcedureAccess().getActionKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getActionKeyword_4()); 

            }


            }

        }
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
    // InternalThymioDSL.g:979:1: rule__Procedure__Group__5 : rule__Procedure__Group__5__Impl ;
    public final void rule__Procedure__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:983:1: ( rule__Procedure__Group__5__Impl )
            // InternalThymioDSL.g:984:2: rule__Procedure__Group__5__Impl
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
    // InternalThymioDSL.g:990:1: rule__Procedure__Group__5__Impl : ( ( ( rule__Procedure__ActionsAssignment_5 ) ) ( ( rule__Procedure__ActionsAssignment_5 )* ) ) ;
    public final void rule__Procedure__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:994:1: ( ( ( ( rule__Procedure__ActionsAssignment_5 ) ) ( ( rule__Procedure__ActionsAssignment_5 )* ) ) )
            // InternalThymioDSL.g:995:1: ( ( ( rule__Procedure__ActionsAssignment_5 ) ) ( ( rule__Procedure__ActionsAssignment_5 )* ) )
            {
            // InternalThymioDSL.g:995:1: ( ( ( rule__Procedure__ActionsAssignment_5 ) ) ( ( rule__Procedure__ActionsAssignment_5 )* ) )
            // InternalThymioDSL.g:996:2: ( ( rule__Procedure__ActionsAssignment_5 ) ) ( ( rule__Procedure__ActionsAssignment_5 )* )
            {
            // InternalThymioDSL.g:996:2: ( ( rule__Procedure__ActionsAssignment_5 ) )
            // InternalThymioDSL.g:997:3: ( rule__Procedure__ActionsAssignment_5 )
            {
             before(grammarAccess.getProcedureAccess().getActionsAssignment_5()); 
            // InternalThymioDSL.g:998:3: ( rule__Procedure__ActionsAssignment_5 )
            // InternalThymioDSL.g:998:4: rule__Procedure__ActionsAssignment_5
            {
            pushFollow(FOLLOW_10);
            rule__Procedure__ActionsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getActionsAssignment_5()); 

            }

            // InternalThymioDSL.g:1001:2: ( ( rule__Procedure__ActionsAssignment_5 )* )
            // InternalThymioDSL.g:1002:3: ( rule__Procedure__ActionsAssignment_5 )*
            {
             before(grammarAccess.getProcedureAccess().getActionsAssignment_5()); 
            // InternalThymioDSL.g:1003:3: ( rule__Procedure__ActionsAssignment_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=39 && LA14_0<=42)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalThymioDSL.g:1003:4: rule__Procedure__ActionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Procedure__ActionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalThymioDSL.g:1013:1: rule__Event__Group_0__0 : rule__Event__Group_0__0__Impl rule__Event__Group_0__1 ;
    public final void rule__Event__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1017:1: ( rule__Event__Group_0__0__Impl rule__Event__Group_0__1 )
            // InternalThymioDSL.g:1018:2: rule__Event__Group_0__0__Impl rule__Event__Group_0__1
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
    // InternalThymioDSL.g:1025:1: rule__Event__Group_0__0__Impl : ( () ) ;
    public final void rule__Event__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1029:1: ( ( () ) )
            // InternalThymioDSL.g:1030:1: ( () )
            {
            // InternalThymioDSL.g:1030:1: ( () )
            // InternalThymioDSL.g:1031:2: ()
            {
             before(grammarAccess.getEventAccess().getEventAction_0_0()); 
            // InternalThymioDSL.g:1032:2: ()
            // InternalThymioDSL.g:1032:3: 
            {
            }

             after(grammarAccess.getEventAccess().getEventAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_0__0__Impl"


    // $ANTLR start "rule__Event__Group_0__1"
    // InternalThymioDSL.g:1040:1: rule__Event__Group_0__1 : rule__Event__Group_0__1__Impl ;
    public final void rule__Event__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1044:1: ( rule__Event__Group_0__1__Impl )
            // InternalThymioDSL.g:1045:2: rule__Event__Group_0__1__Impl
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
    // InternalThymioDSL.g:1051:1: rule__Event__Group_0__1__Impl : ( ( rule__Event__Group_0_1__0 ) ) ;
    public final void rule__Event__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1055:1: ( ( ( rule__Event__Group_0_1__0 ) ) )
            // InternalThymioDSL.g:1056:1: ( ( rule__Event__Group_0_1__0 ) )
            {
            // InternalThymioDSL.g:1056:1: ( ( rule__Event__Group_0_1__0 ) )
            // InternalThymioDSL.g:1057:2: ( rule__Event__Group_0_1__0 )
            {
             before(grammarAccess.getEventAccess().getGroup_0_1()); 
            // InternalThymioDSL.g:1058:2: ( rule__Event__Group_0_1__0 )
            // InternalThymioDSL.g:1058:3: rule__Event__Group_0_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup_0_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Event__Group_0_1__0"
    // InternalThymioDSL.g:1067:1: rule__Event__Group_0_1__0 : rule__Event__Group_0_1__0__Impl rule__Event__Group_0_1__1 ;
    public final void rule__Event__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1071:1: ( rule__Event__Group_0_1__0__Impl rule__Event__Group_0_1__1 )
            // InternalThymioDSL.g:1072:2: rule__Event__Group_0_1__0__Impl rule__Event__Group_0_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Event__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_0_1__0"


    // $ANTLR start "rule__Event__Group_0_1__0__Impl"
    // InternalThymioDSL.g:1079:1: rule__Event__Group_0_1__0__Impl : ( 'button_is_clicked:' ) ;
    public final void rule__Event__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1083:1: ( ( 'button_is_clicked:' ) )
            // InternalThymioDSL.g:1084:1: ( 'button_is_clicked:' )
            {
            // InternalThymioDSL.g:1084:1: ( 'button_is_clicked:' )
            // InternalThymioDSL.g:1085:2: 'button_is_clicked:'
            {
             before(grammarAccess.getEventAccess().getButton_is_clickedKeyword_0_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getButton_is_clickedKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_0_1__0__Impl"


    // $ANTLR start "rule__Event__Group_0_1__1"
    // InternalThymioDSL.g:1094:1: rule__Event__Group_0_1__1 : rule__Event__Group_0_1__1__Impl ;
    public final void rule__Event__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1098:1: ( rule__Event__Group_0_1__1__Impl )
            // InternalThymioDSL.g:1099:2: rule__Event__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_0_1__1"


    // $ANTLR start "rule__Event__Group_0_1__1__Impl"
    // InternalThymioDSL.g:1105:1: rule__Event__Group_0_1__1__Impl : ( ( rule__Event__ButtonAssignment_0_1_1 ) ) ;
    public final void rule__Event__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1109:1: ( ( ( rule__Event__ButtonAssignment_0_1_1 ) ) )
            // InternalThymioDSL.g:1110:1: ( ( rule__Event__ButtonAssignment_0_1_1 ) )
            {
            // InternalThymioDSL.g:1110:1: ( ( rule__Event__ButtonAssignment_0_1_1 ) )
            // InternalThymioDSL.g:1111:2: ( rule__Event__ButtonAssignment_0_1_1 )
            {
             before(grammarAccess.getEventAccess().getButtonAssignment_0_1_1()); 
            // InternalThymioDSL.g:1112:2: ( rule__Event__ButtonAssignment_0_1_1 )
            // InternalThymioDSL.g:1112:3: rule__Event__ButtonAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__ButtonAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getButtonAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_0_1__1__Impl"


    // $ANTLR start "rule__Event__Group_1__0"
    // InternalThymioDSL.g:1121:1: rule__Event__Group_1__0 : rule__Event__Group_1__0__Impl rule__Event__Group_1__1 ;
    public final void rule__Event__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1125:1: ( rule__Event__Group_1__0__Impl rule__Event__Group_1__1 )
            // InternalThymioDSL.g:1126:2: rule__Event__Group_1__0__Impl rule__Event__Group_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalThymioDSL.g:1133:1: rule__Event__Group_1__0__Impl : ( 'robot_is_tapped:' ) ;
    public final void rule__Event__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1137:1: ( ( 'robot_is_tapped:' ) )
            // InternalThymioDSL.g:1138:1: ( 'robot_is_tapped:' )
            {
            // InternalThymioDSL.g:1138:1: ( 'robot_is_tapped:' )
            // InternalThymioDSL.g:1139:2: 'robot_is_tapped:'
            {
             before(grammarAccess.getEventAccess().getRobot_is_tappedKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalThymioDSL.g:1148:1: rule__Event__Group_1__1 : rule__Event__Group_1__1__Impl ;
    public final void rule__Event__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1152:1: ( rule__Event__Group_1__1__Impl )
            // InternalThymioDSL.g:1153:2: rule__Event__Group_1__1__Impl
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
    // InternalThymioDSL.g:1159:1: rule__Event__Group_1__1__Impl : ( ( rule__Event__TapAssignment_1_1 ) ) ;
    public final void rule__Event__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1163:1: ( ( ( rule__Event__TapAssignment_1_1 ) ) )
            // InternalThymioDSL.g:1164:1: ( ( rule__Event__TapAssignment_1_1 ) )
            {
            // InternalThymioDSL.g:1164:1: ( ( rule__Event__TapAssignment_1_1 ) )
            // InternalThymioDSL.g:1165:2: ( rule__Event__TapAssignment_1_1 )
            {
             before(grammarAccess.getEventAccess().getTapAssignment_1_1()); 
            // InternalThymioDSL.g:1166:2: ( rule__Event__TapAssignment_1_1 )
            // InternalThymioDSL.g:1166:3: rule__Event__TapAssignment_1_1
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
    // InternalThymioDSL.g:1175:1: rule__Event__Group_2__0 : rule__Event__Group_2__0__Impl rule__Event__Group_2__1 ;
    public final void rule__Event__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1179:1: ( rule__Event__Group_2__0__Impl rule__Event__Group_2__1 )
            // InternalThymioDSL.g:1180:2: rule__Event__Group_2__0__Impl rule__Event__Group_2__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalThymioDSL.g:1187:1: rule__Event__Group_2__0__Impl : ( 'sound_is_detected:' ) ;
    public final void rule__Event__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1191:1: ( ( 'sound_is_detected:' ) )
            // InternalThymioDSL.g:1192:1: ( 'sound_is_detected:' )
            {
            // InternalThymioDSL.g:1192:1: ( 'sound_is_detected:' )
            // InternalThymioDSL.g:1193:2: 'sound_is_detected:'
            {
             before(grammarAccess.getEventAccess().getSound_is_detectedKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalThymioDSL.g:1202:1: rule__Event__Group_2__1 : rule__Event__Group_2__1__Impl ;
    public final void rule__Event__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1206:1: ( rule__Event__Group_2__1__Impl )
            // InternalThymioDSL.g:1207:2: rule__Event__Group_2__1__Impl
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
    // InternalThymioDSL.g:1213:1: rule__Event__Group_2__1__Impl : ( ( rule__Event__MicAssignment_2_1 ) ) ;
    public final void rule__Event__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1217:1: ( ( ( rule__Event__MicAssignment_2_1 ) ) )
            // InternalThymioDSL.g:1218:1: ( ( rule__Event__MicAssignment_2_1 ) )
            {
            // InternalThymioDSL.g:1218:1: ( ( rule__Event__MicAssignment_2_1 ) )
            // InternalThymioDSL.g:1219:2: ( rule__Event__MicAssignment_2_1 )
            {
             before(grammarAccess.getEventAccess().getMicAssignment_2_1()); 
            // InternalThymioDSL.g:1220:2: ( rule__Event__MicAssignment_2_1 )
            // InternalThymioDSL.g:1220:3: rule__Event__MicAssignment_2_1
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
    // InternalThymioDSL.g:1229:1: rule__Event__Group_3__0 : rule__Event__Group_3__0__Impl rule__Event__Group_3__1 ;
    public final void rule__Event__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1233:1: ( rule__Event__Group_3__0__Impl rule__Event__Group_3__1 )
            // InternalThymioDSL.g:1234:2: rule__Event__Group_3__0__Impl rule__Event__Group_3__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalThymioDSL.g:1241:1: rule__Event__Group_3__0__Impl : ( 'sensor_is_activated:' ) ;
    public final void rule__Event__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1245:1: ( ( 'sensor_is_activated:' ) )
            // InternalThymioDSL.g:1246:1: ( 'sensor_is_activated:' )
            {
            // InternalThymioDSL.g:1246:1: ( 'sensor_is_activated:' )
            // InternalThymioDSL.g:1247:2: 'sensor_is_activated:'
            {
             before(grammarAccess.getEventAccess().getSensor_is_activatedKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalThymioDSL.g:1256:1: rule__Event__Group_3__1 : rule__Event__Group_3__1__Impl ;
    public final void rule__Event__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1260:1: ( rule__Event__Group_3__1__Impl )
            // InternalThymioDSL.g:1261:2: rule__Event__Group_3__1__Impl
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
    // InternalThymioDSL.g:1267:1: rule__Event__Group_3__1__Impl : ( ( rule__Event__SensorAssignment_3_1 ) ) ;
    public final void rule__Event__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1271:1: ( ( ( rule__Event__SensorAssignment_3_1 ) ) )
            // InternalThymioDSL.g:1272:1: ( ( rule__Event__SensorAssignment_3_1 ) )
            {
            // InternalThymioDSL.g:1272:1: ( ( rule__Event__SensorAssignment_3_1 ) )
            // InternalThymioDSL.g:1273:2: ( rule__Event__SensorAssignment_3_1 )
            {
             before(grammarAccess.getEventAccess().getSensorAssignment_3_1()); 
            // InternalThymioDSL.g:1274:2: ( rule__Event__SensorAssignment_3_1 )
            // InternalThymioDSL.g:1274:3: rule__Event__SensorAssignment_3_1
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
    // InternalThymioDSL.g:1283:1: rule__Sensor__Group_0__0 : rule__Sensor__Group_0__0__Impl rule__Sensor__Group_0__1 ;
    public final void rule__Sensor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1287:1: ( rule__Sensor__Group_0__0__Impl rule__Sensor__Group_0__1 )
            // InternalThymioDSL.g:1288:2: rule__Sensor__Group_0__0__Impl rule__Sensor__Group_0__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalThymioDSL.g:1295:1: rule__Sensor__Group_0__0__Impl : ( () ) ;
    public final void rule__Sensor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1299:1: ( ( () ) )
            // InternalThymioDSL.g:1300:1: ( () )
            {
            // InternalThymioDSL.g:1300:1: ( () )
            // InternalThymioDSL.g:1301:2: ()
            {
             before(grammarAccess.getSensorAccess().getSensorAction_0_0()); 
            // InternalThymioDSL.g:1302:2: ()
            // InternalThymioDSL.g:1302:3: 
            {
            }

             after(grammarAccess.getSensorAccess().getSensorAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_0__0__Impl"


    // $ANTLR start "rule__Sensor__Group_0__1"
    // InternalThymioDSL.g:1310:1: rule__Sensor__Group_0__1 : rule__Sensor__Group_0__1__Impl ;
    public final void rule__Sensor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1314:1: ( rule__Sensor__Group_0__1__Impl )
            // InternalThymioDSL.g:1315:2: rule__Sensor__Group_0__1__Impl
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
    // InternalThymioDSL.g:1321:1: rule__Sensor__Group_0__1__Impl : ( ( rule__Sensor__Group_0_1__0 ) ) ;
    public final void rule__Sensor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1325:1: ( ( ( rule__Sensor__Group_0_1__0 ) ) )
            // InternalThymioDSL.g:1326:1: ( ( rule__Sensor__Group_0_1__0 ) )
            {
            // InternalThymioDSL.g:1326:1: ( ( rule__Sensor__Group_0_1__0 ) )
            // InternalThymioDSL.g:1327:2: ( rule__Sensor__Group_0_1__0 )
            {
             before(grammarAccess.getSensorAccess().getGroup_0_1()); 
            // InternalThymioDSL.g:1328:2: ( rule__Sensor__Group_0_1__0 )
            // InternalThymioDSL.g:1328:3: rule__Sensor__Group_0_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getGroup_0_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Sensor__Group_0_1__0"
    // InternalThymioDSL.g:1337:1: rule__Sensor__Group_0_1__0 : rule__Sensor__Group_0_1__0__Impl rule__Sensor__Group_0_1__1 ;
    public final void rule__Sensor__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1341:1: ( rule__Sensor__Group_0_1__0__Impl rule__Sensor__Group_0_1__1 )
            // InternalThymioDSL.g:1342:2: rule__Sensor__Group_0_1__0__Impl rule__Sensor__Group_0_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Sensor__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_0_1__0"


    // $ANTLR start "rule__Sensor__Group_0_1__0__Impl"
    // InternalThymioDSL.g:1349:1: rule__Sensor__Group_0_1__0__Impl : ( 'back_left:' ) ;
    public final void rule__Sensor__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1353:1: ( ( 'back_left:' ) )
            // InternalThymioDSL.g:1354:1: ( 'back_left:' )
            {
            // InternalThymioDSL.g:1354:1: ( 'back_left:' )
            // InternalThymioDSL.g:1355:2: 'back_left:'
            {
             before(grammarAccess.getSensorAccess().getBack_leftKeyword_0_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getBack_leftKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_0_1__0__Impl"


    // $ANTLR start "rule__Sensor__Group_0_1__1"
    // InternalThymioDSL.g:1364:1: rule__Sensor__Group_0_1__1 : rule__Sensor__Group_0_1__1__Impl ;
    public final void rule__Sensor__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1368:1: ( rule__Sensor__Group_0_1__1__Impl )
            // InternalThymioDSL.g:1369:2: rule__Sensor__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_0_1__1"


    // $ANTLR start "rule__Sensor__Group_0_1__1__Impl"
    // InternalThymioDSL.g:1375:1: rule__Sensor__Group_0_1__1__Impl : ( ( rule__Sensor__BackLeftSensorAssignment_0_1_1 ) ) ;
    public final void rule__Sensor__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1379:1: ( ( ( rule__Sensor__BackLeftSensorAssignment_0_1_1 ) ) )
            // InternalThymioDSL.g:1380:1: ( ( rule__Sensor__BackLeftSensorAssignment_0_1_1 ) )
            {
            // InternalThymioDSL.g:1380:1: ( ( rule__Sensor__BackLeftSensorAssignment_0_1_1 ) )
            // InternalThymioDSL.g:1381:2: ( rule__Sensor__BackLeftSensorAssignment_0_1_1 )
            {
             before(grammarAccess.getSensorAccess().getBackLeftSensorAssignment_0_1_1()); 
            // InternalThymioDSL.g:1382:2: ( rule__Sensor__BackLeftSensorAssignment_0_1_1 )
            // InternalThymioDSL.g:1382:3: rule__Sensor__BackLeftSensorAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__BackLeftSensorAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getBackLeftSensorAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_0_1__1__Impl"


    // $ANTLR start "rule__Sensor__Group_1__0"
    // InternalThymioDSL.g:1391:1: rule__Sensor__Group_1__0 : rule__Sensor__Group_1__0__Impl rule__Sensor__Group_1__1 ;
    public final void rule__Sensor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1395:1: ( rule__Sensor__Group_1__0__Impl rule__Sensor__Group_1__1 )
            // InternalThymioDSL.g:1396:2: rule__Sensor__Group_1__0__Impl rule__Sensor__Group_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalThymioDSL.g:1403:1: rule__Sensor__Group_1__0__Impl : ( 'back_right:' ) ;
    public final void rule__Sensor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1407:1: ( ( 'back_right:' ) )
            // InternalThymioDSL.g:1408:1: ( 'back_right:' )
            {
            // InternalThymioDSL.g:1408:1: ( 'back_right:' )
            // InternalThymioDSL.g:1409:2: 'back_right:'
            {
             before(grammarAccess.getSensorAccess().getBack_rightKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalThymioDSL.g:1418:1: rule__Sensor__Group_1__1 : rule__Sensor__Group_1__1__Impl ;
    public final void rule__Sensor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1422:1: ( rule__Sensor__Group_1__1__Impl )
            // InternalThymioDSL.g:1423:2: rule__Sensor__Group_1__1__Impl
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
    // InternalThymioDSL.g:1429:1: rule__Sensor__Group_1__1__Impl : ( ( rule__Sensor__BackRightSensorAssignment_1_1 ) ) ;
    public final void rule__Sensor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1433:1: ( ( ( rule__Sensor__BackRightSensorAssignment_1_1 ) ) )
            // InternalThymioDSL.g:1434:1: ( ( rule__Sensor__BackRightSensorAssignment_1_1 ) )
            {
            // InternalThymioDSL.g:1434:1: ( ( rule__Sensor__BackRightSensorAssignment_1_1 ) )
            // InternalThymioDSL.g:1435:2: ( rule__Sensor__BackRightSensorAssignment_1_1 )
            {
             before(grammarAccess.getSensorAccess().getBackRightSensorAssignment_1_1()); 
            // InternalThymioDSL.g:1436:2: ( rule__Sensor__BackRightSensorAssignment_1_1 )
            // InternalThymioDSL.g:1436:3: rule__Sensor__BackRightSensorAssignment_1_1
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
    // InternalThymioDSL.g:1445:1: rule__Sensor__Group_2__0 : rule__Sensor__Group_2__0__Impl rule__Sensor__Group_2__1 ;
    public final void rule__Sensor__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1449:1: ( rule__Sensor__Group_2__0__Impl rule__Sensor__Group_2__1 )
            // InternalThymioDSL.g:1450:2: rule__Sensor__Group_2__0__Impl rule__Sensor__Group_2__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalThymioDSL.g:1457:1: rule__Sensor__Group_2__0__Impl : ( 'front_right:' ) ;
    public final void rule__Sensor__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1461:1: ( ( 'front_right:' ) )
            // InternalThymioDSL.g:1462:1: ( 'front_right:' )
            {
            // InternalThymioDSL.g:1462:1: ( 'front_right:' )
            // InternalThymioDSL.g:1463:2: 'front_right:'
            {
             before(grammarAccess.getSensorAccess().getFront_rightKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalThymioDSL.g:1472:1: rule__Sensor__Group_2__1 : rule__Sensor__Group_2__1__Impl ;
    public final void rule__Sensor__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1476:1: ( rule__Sensor__Group_2__1__Impl )
            // InternalThymioDSL.g:1477:2: rule__Sensor__Group_2__1__Impl
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
    // InternalThymioDSL.g:1483:1: rule__Sensor__Group_2__1__Impl : ( ( rule__Sensor__FrontRightSensorAssignment_2_1 ) ) ;
    public final void rule__Sensor__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1487:1: ( ( ( rule__Sensor__FrontRightSensorAssignment_2_1 ) ) )
            // InternalThymioDSL.g:1488:1: ( ( rule__Sensor__FrontRightSensorAssignment_2_1 ) )
            {
            // InternalThymioDSL.g:1488:1: ( ( rule__Sensor__FrontRightSensorAssignment_2_1 ) )
            // InternalThymioDSL.g:1489:2: ( rule__Sensor__FrontRightSensorAssignment_2_1 )
            {
             before(grammarAccess.getSensorAccess().getFrontRightSensorAssignment_2_1()); 
            // InternalThymioDSL.g:1490:2: ( rule__Sensor__FrontRightSensorAssignment_2_1 )
            // InternalThymioDSL.g:1490:3: rule__Sensor__FrontRightSensorAssignment_2_1
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
    // InternalThymioDSL.g:1499:1: rule__Sensor__Group_3__0 : rule__Sensor__Group_3__0__Impl rule__Sensor__Group_3__1 ;
    public final void rule__Sensor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1503:1: ( rule__Sensor__Group_3__0__Impl rule__Sensor__Group_3__1 )
            // InternalThymioDSL.g:1504:2: rule__Sensor__Group_3__0__Impl rule__Sensor__Group_3__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalThymioDSL.g:1511:1: rule__Sensor__Group_3__0__Impl : ( 'front_center_right:' ) ;
    public final void rule__Sensor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1515:1: ( ( 'front_center_right:' ) )
            // InternalThymioDSL.g:1516:1: ( 'front_center_right:' )
            {
            // InternalThymioDSL.g:1516:1: ( 'front_center_right:' )
            // InternalThymioDSL.g:1517:2: 'front_center_right:'
            {
             before(grammarAccess.getSensorAccess().getFront_center_rightKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalThymioDSL.g:1526:1: rule__Sensor__Group_3__1 : rule__Sensor__Group_3__1__Impl ;
    public final void rule__Sensor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1530:1: ( rule__Sensor__Group_3__1__Impl )
            // InternalThymioDSL.g:1531:2: rule__Sensor__Group_3__1__Impl
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
    // InternalThymioDSL.g:1537:1: rule__Sensor__Group_3__1__Impl : ( ( rule__Sensor__FrontCenterRightSensorAssignment_3_1 ) ) ;
    public final void rule__Sensor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1541:1: ( ( ( rule__Sensor__FrontCenterRightSensorAssignment_3_1 ) ) )
            // InternalThymioDSL.g:1542:1: ( ( rule__Sensor__FrontCenterRightSensorAssignment_3_1 ) )
            {
            // InternalThymioDSL.g:1542:1: ( ( rule__Sensor__FrontCenterRightSensorAssignment_3_1 ) )
            // InternalThymioDSL.g:1543:2: ( rule__Sensor__FrontCenterRightSensorAssignment_3_1 )
            {
             before(grammarAccess.getSensorAccess().getFrontCenterRightSensorAssignment_3_1()); 
            // InternalThymioDSL.g:1544:2: ( rule__Sensor__FrontCenterRightSensorAssignment_3_1 )
            // InternalThymioDSL.g:1544:3: rule__Sensor__FrontCenterRightSensorAssignment_3_1
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
    // InternalThymioDSL.g:1553:1: rule__Sensor__Group_4__0 : rule__Sensor__Group_4__0__Impl rule__Sensor__Group_4__1 ;
    public final void rule__Sensor__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1557:1: ( rule__Sensor__Group_4__0__Impl rule__Sensor__Group_4__1 )
            // InternalThymioDSL.g:1558:2: rule__Sensor__Group_4__0__Impl rule__Sensor__Group_4__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalThymioDSL.g:1565:1: rule__Sensor__Group_4__0__Impl : ( 'front_center:' ) ;
    public final void rule__Sensor__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1569:1: ( ( 'front_center:' ) )
            // InternalThymioDSL.g:1570:1: ( 'front_center:' )
            {
            // InternalThymioDSL.g:1570:1: ( 'front_center:' )
            // InternalThymioDSL.g:1571:2: 'front_center:'
            {
             before(grammarAccess.getSensorAccess().getFront_centerKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalThymioDSL.g:1580:1: rule__Sensor__Group_4__1 : rule__Sensor__Group_4__1__Impl ;
    public final void rule__Sensor__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1584:1: ( rule__Sensor__Group_4__1__Impl )
            // InternalThymioDSL.g:1585:2: rule__Sensor__Group_4__1__Impl
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
    // InternalThymioDSL.g:1591:1: rule__Sensor__Group_4__1__Impl : ( ( rule__Sensor__FrontCenterSensorAssignment_4_1 ) ) ;
    public final void rule__Sensor__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1595:1: ( ( ( rule__Sensor__FrontCenterSensorAssignment_4_1 ) ) )
            // InternalThymioDSL.g:1596:1: ( ( rule__Sensor__FrontCenterSensorAssignment_4_1 ) )
            {
            // InternalThymioDSL.g:1596:1: ( ( rule__Sensor__FrontCenterSensorAssignment_4_1 ) )
            // InternalThymioDSL.g:1597:2: ( rule__Sensor__FrontCenterSensorAssignment_4_1 )
            {
             before(grammarAccess.getSensorAccess().getFrontCenterSensorAssignment_4_1()); 
            // InternalThymioDSL.g:1598:2: ( rule__Sensor__FrontCenterSensorAssignment_4_1 )
            // InternalThymioDSL.g:1598:3: rule__Sensor__FrontCenterSensorAssignment_4_1
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
    // InternalThymioDSL.g:1607:1: rule__Sensor__Group_5__0 : rule__Sensor__Group_5__0__Impl rule__Sensor__Group_5__1 ;
    public final void rule__Sensor__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1611:1: ( rule__Sensor__Group_5__0__Impl rule__Sensor__Group_5__1 )
            // InternalThymioDSL.g:1612:2: rule__Sensor__Group_5__0__Impl rule__Sensor__Group_5__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalThymioDSL.g:1619:1: rule__Sensor__Group_5__0__Impl : ( 'front_center_left:' ) ;
    public final void rule__Sensor__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1623:1: ( ( 'front_center_left:' ) )
            // InternalThymioDSL.g:1624:1: ( 'front_center_left:' )
            {
            // InternalThymioDSL.g:1624:1: ( 'front_center_left:' )
            // InternalThymioDSL.g:1625:2: 'front_center_left:'
            {
             before(grammarAccess.getSensorAccess().getFront_center_leftKeyword_5_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalThymioDSL.g:1634:1: rule__Sensor__Group_5__1 : rule__Sensor__Group_5__1__Impl ;
    public final void rule__Sensor__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1638:1: ( rule__Sensor__Group_5__1__Impl )
            // InternalThymioDSL.g:1639:2: rule__Sensor__Group_5__1__Impl
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
    // InternalThymioDSL.g:1645:1: rule__Sensor__Group_5__1__Impl : ( ( rule__Sensor__FrontCenterLeftSensorAssignment_5_1 ) ) ;
    public final void rule__Sensor__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1649:1: ( ( ( rule__Sensor__FrontCenterLeftSensorAssignment_5_1 ) ) )
            // InternalThymioDSL.g:1650:1: ( ( rule__Sensor__FrontCenterLeftSensorAssignment_5_1 ) )
            {
            // InternalThymioDSL.g:1650:1: ( ( rule__Sensor__FrontCenterLeftSensorAssignment_5_1 ) )
            // InternalThymioDSL.g:1651:2: ( rule__Sensor__FrontCenterLeftSensorAssignment_5_1 )
            {
             before(grammarAccess.getSensorAccess().getFrontCenterLeftSensorAssignment_5_1()); 
            // InternalThymioDSL.g:1652:2: ( rule__Sensor__FrontCenterLeftSensorAssignment_5_1 )
            // InternalThymioDSL.g:1652:3: rule__Sensor__FrontCenterLeftSensorAssignment_5_1
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
    // InternalThymioDSL.g:1661:1: rule__Sensor__Group_6__0 : rule__Sensor__Group_6__0__Impl rule__Sensor__Group_6__1 ;
    public final void rule__Sensor__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1665:1: ( rule__Sensor__Group_6__0__Impl rule__Sensor__Group_6__1 )
            // InternalThymioDSL.g:1666:2: rule__Sensor__Group_6__0__Impl rule__Sensor__Group_6__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalThymioDSL.g:1673:1: rule__Sensor__Group_6__0__Impl : ( 'front_left:' ) ;
    public final void rule__Sensor__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1677:1: ( ( 'front_left:' ) )
            // InternalThymioDSL.g:1678:1: ( 'front_left:' )
            {
            // InternalThymioDSL.g:1678:1: ( 'front_left:' )
            // InternalThymioDSL.g:1679:2: 'front_left:'
            {
             before(grammarAccess.getSensorAccess().getFront_leftKeyword_6_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalThymioDSL.g:1688:1: rule__Sensor__Group_6__1 : rule__Sensor__Group_6__1__Impl ;
    public final void rule__Sensor__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1692:1: ( rule__Sensor__Group_6__1__Impl )
            // InternalThymioDSL.g:1693:2: rule__Sensor__Group_6__1__Impl
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
    // InternalThymioDSL.g:1699:1: rule__Sensor__Group_6__1__Impl : ( ( rule__Sensor__FrontLeftSensorAssignment_6_1 ) ) ;
    public final void rule__Sensor__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1703:1: ( ( ( rule__Sensor__FrontLeftSensorAssignment_6_1 ) ) )
            // InternalThymioDSL.g:1704:1: ( ( rule__Sensor__FrontLeftSensorAssignment_6_1 ) )
            {
            // InternalThymioDSL.g:1704:1: ( ( rule__Sensor__FrontLeftSensorAssignment_6_1 ) )
            // InternalThymioDSL.g:1705:2: ( rule__Sensor__FrontLeftSensorAssignment_6_1 )
            {
             before(grammarAccess.getSensorAccess().getFrontLeftSensorAssignment_6_1()); 
            // InternalThymioDSL.g:1706:2: ( rule__Sensor__FrontLeftSensorAssignment_6_1 )
            // InternalThymioDSL.g:1706:3: rule__Sensor__FrontLeftSensorAssignment_6_1
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
    // InternalThymioDSL.g:1715:1: rule__Action__Group_0__0 : rule__Action__Group_0__0__Impl rule__Action__Group_0__1 ;
    public final void rule__Action__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1719:1: ( rule__Action__Group_0__0__Impl rule__Action__Group_0__1 )
            // InternalThymioDSL.g:1720:2: rule__Action__Group_0__0__Impl rule__Action__Group_0__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalThymioDSL.g:1727:1: rule__Action__Group_0__0__Impl : ( () ) ;
    public final void rule__Action__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1731:1: ( ( () ) )
            // InternalThymioDSL.g:1732:1: ( () )
            {
            // InternalThymioDSL.g:1732:1: ( () )
            // InternalThymioDSL.g:1733:2: ()
            {
             before(grammarAccess.getActionAccess().getActionAction_0_0()); 
            // InternalThymioDSL.g:1734:2: ()
            // InternalThymioDSL.g:1734:3: 
            {
            }

             after(grammarAccess.getActionAccess().getActionAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_0__0__Impl"


    // $ANTLR start "rule__Action__Group_0__1"
    // InternalThymioDSL.g:1742:1: rule__Action__Group_0__1 : rule__Action__Group_0__1__Impl ;
    public final void rule__Action__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1746:1: ( rule__Action__Group_0__1__Impl )
            // InternalThymioDSL.g:1747:2: rule__Action__Group_0__1__Impl
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
    // InternalThymioDSL.g:1753:1: rule__Action__Group_0__1__Impl : ( ( rule__Action__Group_0_1__0 ) ) ;
    public final void rule__Action__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1757:1: ( ( ( rule__Action__Group_0_1__0 ) ) )
            // InternalThymioDSL.g:1758:1: ( ( rule__Action__Group_0_1__0 ) )
            {
            // InternalThymioDSL.g:1758:1: ( ( rule__Action__Group_0_1__0 ) )
            // InternalThymioDSL.g:1759:2: ( rule__Action__Group_0_1__0 )
            {
             before(grammarAccess.getActionAccess().getGroup_0_1()); 
            // InternalThymioDSL.g:1760:2: ( rule__Action__Group_0_1__0 )
            // InternalThymioDSL.g:1760:3: rule__Action__Group_0_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup_0_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Action__Group_0_1__0"
    // InternalThymioDSL.g:1769:1: rule__Action__Group_0_1__0 : rule__Action__Group_0_1__0__Impl rule__Action__Group_0_1__1 ;
    public final void rule__Action__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1773:1: ( rule__Action__Group_0_1__0__Impl rule__Action__Group_0_1__1 )
            // InternalThymioDSL.g:1774:2: rule__Action__Group_0_1__0__Impl rule__Action__Group_0_1__1
            {
            pushFollow(FOLLOW_19);
            rule__Action__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_0_1__0"


    // $ANTLR start "rule__Action__Group_0_1__0__Impl"
    // InternalThymioDSL.g:1781:1: rule__Action__Group_0_1__0__Impl : ( 'move:' ) ;
    public final void rule__Action__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1785:1: ( ( 'move:' ) )
            // InternalThymioDSL.g:1786:1: ( 'move:' )
            {
            // InternalThymioDSL.g:1786:1: ( 'move:' )
            // InternalThymioDSL.g:1787:2: 'move:'
            {
             before(grammarAccess.getActionAccess().getMoveKeyword_0_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getMoveKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_0_1__0__Impl"


    // $ANTLR start "rule__Action__Group_0_1__1"
    // InternalThymioDSL.g:1796:1: rule__Action__Group_0_1__1 : rule__Action__Group_0_1__1__Impl ;
    public final void rule__Action__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1800:1: ( rule__Action__Group_0_1__1__Impl )
            // InternalThymioDSL.g:1801:2: rule__Action__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_0_1__1"


    // $ANTLR start "rule__Action__Group_0_1__1__Impl"
    // InternalThymioDSL.g:1807:1: rule__Action__Group_0_1__1__Impl : ( ( rule__Action__MoveAssignment_0_1_1 ) ) ;
    public final void rule__Action__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1811:1: ( ( ( rule__Action__MoveAssignment_0_1_1 ) ) )
            // InternalThymioDSL.g:1812:1: ( ( rule__Action__MoveAssignment_0_1_1 ) )
            {
            // InternalThymioDSL.g:1812:1: ( ( rule__Action__MoveAssignment_0_1_1 ) )
            // InternalThymioDSL.g:1813:2: ( rule__Action__MoveAssignment_0_1_1 )
            {
             before(grammarAccess.getActionAccess().getMoveAssignment_0_1_1()); 
            // InternalThymioDSL.g:1814:2: ( rule__Action__MoveAssignment_0_1_1 )
            // InternalThymioDSL.g:1814:3: rule__Action__MoveAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__MoveAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getMoveAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_0_1__1__Impl"


    // $ANTLR start "rule__Action__Group_1__0"
    // InternalThymioDSL.g:1823:1: rule__Action__Group_1__0 : rule__Action__Group_1__0__Impl rule__Action__Group_1__1 ;
    public final void rule__Action__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1827:1: ( rule__Action__Group_1__0__Impl rule__Action__Group_1__1 )
            // InternalThymioDSL.g:1828:2: rule__Action__Group_1__0__Impl rule__Action__Group_1__1
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
    // InternalThymioDSL.g:1835:1: rule__Action__Group_1__0__Impl : ( 'top_light:' ) ;
    public final void rule__Action__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1839:1: ( ( 'top_light:' ) )
            // InternalThymioDSL.g:1840:1: ( 'top_light:' )
            {
            // InternalThymioDSL.g:1840:1: ( 'top_light:' )
            // InternalThymioDSL.g:1841:2: 'top_light:'
            {
             before(grammarAccess.getActionAccess().getTop_lightKeyword_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getTop_lightKeyword_1_0()); 

            }


            }

        }
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
    // InternalThymioDSL.g:1850:1: rule__Action__Group_1__1 : rule__Action__Group_1__1__Impl ;
    public final void rule__Action__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1854:1: ( rule__Action__Group_1__1__Impl )
            // InternalThymioDSL.g:1855:2: rule__Action__Group_1__1__Impl
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
    // InternalThymioDSL.g:1861:1: rule__Action__Group_1__1__Impl : ( ( rule__Action__TopLightAssignment_1_1 ) ) ;
    public final void rule__Action__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1865:1: ( ( ( rule__Action__TopLightAssignment_1_1 ) ) )
            // InternalThymioDSL.g:1866:1: ( ( rule__Action__TopLightAssignment_1_1 ) )
            {
            // InternalThymioDSL.g:1866:1: ( ( rule__Action__TopLightAssignment_1_1 ) )
            // InternalThymioDSL.g:1867:2: ( rule__Action__TopLightAssignment_1_1 )
            {
             before(grammarAccess.getActionAccess().getTopLightAssignment_1_1()); 
            // InternalThymioDSL.g:1868:2: ( rule__Action__TopLightAssignment_1_1 )
            // InternalThymioDSL.g:1868:3: rule__Action__TopLightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__TopLightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getTopLightAssignment_1_1()); 

            }


            }

        }
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
    // InternalThymioDSL.g:1877:1: rule__Action__Group_2__0 : rule__Action__Group_2__0__Impl rule__Action__Group_2__1 ;
    public final void rule__Action__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1881:1: ( rule__Action__Group_2__0__Impl rule__Action__Group_2__1 )
            // InternalThymioDSL.g:1882:2: rule__Action__Group_2__0__Impl rule__Action__Group_2__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalThymioDSL.g:1889:1: rule__Action__Group_2__0__Impl : ( 'bottom_light:' ) ;
    public final void rule__Action__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1893:1: ( ( 'bottom_light:' ) )
            // InternalThymioDSL.g:1894:1: ( 'bottom_light:' )
            {
            // InternalThymioDSL.g:1894:1: ( 'bottom_light:' )
            // InternalThymioDSL.g:1895:2: 'bottom_light:'
            {
             before(grammarAccess.getActionAccess().getBottom_lightKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getBottom_lightKeyword_2_0()); 

            }


            }

        }
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
    // InternalThymioDSL.g:1904:1: rule__Action__Group_2__1 : rule__Action__Group_2__1__Impl ;
    public final void rule__Action__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1908:1: ( rule__Action__Group_2__1__Impl )
            // InternalThymioDSL.g:1909:2: rule__Action__Group_2__1__Impl
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
    // InternalThymioDSL.g:1915:1: rule__Action__Group_2__1__Impl : ( ( rule__Action__BottomLightAssignment_2_1 ) ) ;
    public final void rule__Action__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1919:1: ( ( ( rule__Action__BottomLightAssignment_2_1 ) ) )
            // InternalThymioDSL.g:1920:1: ( ( rule__Action__BottomLightAssignment_2_1 ) )
            {
            // InternalThymioDSL.g:1920:1: ( ( rule__Action__BottomLightAssignment_2_1 ) )
            // InternalThymioDSL.g:1921:2: ( rule__Action__BottomLightAssignment_2_1 )
            {
             before(grammarAccess.getActionAccess().getBottomLightAssignment_2_1()); 
            // InternalThymioDSL.g:1922:2: ( rule__Action__BottomLightAssignment_2_1 )
            // InternalThymioDSL.g:1922:3: rule__Action__BottomLightAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__BottomLightAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getBottomLightAssignment_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Action__Group_3__0"
    // InternalThymioDSL.g:1931:1: rule__Action__Group_3__0 : rule__Action__Group_3__0__Impl rule__Action__Group_3__1 ;
    public final void rule__Action__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1935:1: ( rule__Action__Group_3__0__Impl rule__Action__Group_3__1 )
            // InternalThymioDSL.g:1936:2: rule__Action__Group_3__0__Impl rule__Action__Group_3__1
            {
            pushFollow(FOLLOW_21);
            rule__Action__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_3__0"


    // $ANTLR start "rule__Action__Group_3__0__Impl"
    // InternalThymioDSL.g:1943:1: rule__Action__Group_3__0__Impl : ( 'sound:' ) ;
    public final void rule__Action__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1947:1: ( ( 'sound:' ) )
            // InternalThymioDSL.g:1948:1: ( 'sound:' )
            {
            // InternalThymioDSL.g:1948:1: ( 'sound:' )
            // InternalThymioDSL.g:1949:2: 'sound:'
            {
             before(grammarAccess.getActionAccess().getSoundKeyword_3_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getSoundKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_3__0__Impl"


    // $ANTLR start "rule__Action__Group_3__1"
    // InternalThymioDSL.g:1958:1: rule__Action__Group_3__1 : rule__Action__Group_3__1__Impl ;
    public final void rule__Action__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1962:1: ( rule__Action__Group_3__1__Impl )
            // InternalThymioDSL.g:1963:2: rule__Action__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_3__1"


    // $ANTLR start "rule__Action__Group_3__1__Impl"
    // InternalThymioDSL.g:1969:1: rule__Action__Group_3__1__Impl : ( ( rule__Action__SoundAssignment_3_1 ) ) ;
    public final void rule__Action__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1973:1: ( ( ( rule__Action__SoundAssignment_3_1 ) ) )
            // InternalThymioDSL.g:1974:1: ( ( rule__Action__SoundAssignment_3_1 ) )
            {
            // InternalThymioDSL.g:1974:1: ( ( rule__Action__SoundAssignment_3_1 ) )
            // InternalThymioDSL.g:1975:2: ( rule__Action__SoundAssignment_3_1 )
            {
             before(grammarAccess.getActionAccess().getSoundAssignment_3_1()); 
            // InternalThymioDSL.g:1976:2: ( rule__Action__SoundAssignment_3_1 )
            // InternalThymioDSL.g:1976:3: rule__Action__SoundAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__SoundAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getSoundAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_3__1__Impl"


    // $ANTLR start "rule__Motor__Group__0"
    // InternalThymioDSL.g:1985:1: rule__Motor__Group__0 : rule__Motor__Group__0__Impl rule__Motor__Group__1 ;
    public final void rule__Motor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1989:1: ( rule__Motor__Group__0__Impl rule__Motor__Group__1 )
            // InternalThymioDSL.g:1990:2: rule__Motor__Group__0__Impl rule__Motor__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Motor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Motor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Motor__Group__0"


    // $ANTLR start "rule__Motor__Group__0__Impl"
    // InternalThymioDSL.g:1997:1: rule__Motor__Group__0__Impl : ( 'motors:' ) ;
    public final void rule__Motor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2001:1: ( ( 'motors:' ) )
            // InternalThymioDSL.g:2002:1: ( 'motors:' )
            {
            // InternalThymioDSL.g:2002:1: ( 'motors:' )
            // InternalThymioDSL.g:2003:2: 'motors:'
            {
             before(grammarAccess.getMotorAccess().getMotorsKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMotorAccess().getMotorsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Motor__Group__0__Impl"


    // $ANTLR start "rule__Motor__Group__1"
    // InternalThymioDSL.g:2012:1: rule__Motor__Group__1 : rule__Motor__Group__1__Impl rule__Motor__Group__2 ;
    public final void rule__Motor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2016:1: ( rule__Motor__Group__1__Impl rule__Motor__Group__2 )
            // InternalThymioDSL.g:2017:2: rule__Motor__Group__1__Impl rule__Motor__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Motor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Motor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Motor__Group__1"


    // $ANTLR start "rule__Motor__Group__1__Impl"
    // InternalThymioDSL.g:2024:1: rule__Motor__Group__1__Impl : ( 'left:' ) ;
    public final void rule__Motor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2028:1: ( ( 'left:' ) )
            // InternalThymioDSL.g:2029:1: ( 'left:' )
            {
            // InternalThymioDSL.g:2029:1: ( 'left:' )
            // InternalThymioDSL.g:2030:2: 'left:'
            {
             before(grammarAccess.getMotorAccess().getLeftKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMotorAccess().getLeftKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Motor__Group__1__Impl"


    // $ANTLR start "rule__Motor__Group__2"
    // InternalThymioDSL.g:2039:1: rule__Motor__Group__2 : rule__Motor__Group__2__Impl rule__Motor__Group__3 ;
    public final void rule__Motor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2043:1: ( rule__Motor__Group__2__Impl rule__Motor__Group__3 )
            // InternalThymioDSL.g:2044:2: rule__Motor__Group__2__Impl rule__Motor__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Motor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Motor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Motor__Group__2"


    // $ANTLR start "rule__Motor__Group__2__Impl"
    // InternalThymioDSL.g:2051:1: rule__Motor__Group__2__Impl : ( ( rule__Motor__LeftAssignment_2 ) ) ;
    public final void rule__Motor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2055:1: ( ( ( rule__Motor__LeftAssignment_2 ) ) )
            // InternalThymioDSL.g:2056:1: ( ( rule__Motor__LeftAssignment_2 ) )
            {
            // InternalThymioDSL.g:2056:1: ( ( rule__Motor__LeftAssignment_2 ) )
            // InternalThymioDSL.g:2057:2: ( rule__Motor__LeftAssignment_2 )
            {
             before(grammarAccess.getMotorAccess().getLeftAssignment_2()); 
            // InternalThymioDSL.g:2058:2: ( rule__Motor__LeftAssignment_2 )
            // InternalThymioDSL.g:2058:3: rule__Motor__LeftAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Motor__LeftAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMotorAccess().getLeftAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Motor__Group__2__Impl"


    // $ANTLR start "rule__Motor__Group__3"
    // InternalThymioDSL.g:2066:1: rule__Motor__Group__3 : rule__Motor__Group__3__Impl rule__Motor__Group__4 ;
    public final void rule__Motor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2070:1: ( rule__Motor__Group__3__Impl rule__Motor__Group__4 )
            // InternalThymioDSL.g:2071:2: rule__Motor__Group__3__Impl rule__Motor__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Motor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Motor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Motor__Group__3"


    // $ANTLR start "rule__Motor__Group__3__Impl"
    // InternalThymioDSL.g:2078:1: rule__Motor__Group__3__Impl : ( 'right:' ) ;
    public final void rule__Motor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2082:1: ( ( 'right:' ) )
            // InternalThymioDSL.g:2083:1: ( 'right:' )
            {
            // InternalThymioDSL.g:2083:1: ( 'right:' )
            // InternalThymioDSL.g:2084:2: 'right:'
            {
             before(grammarAccess.getMotorAccess().getRightKeyword_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMotorAccess().getRightKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Motor__Group__3__Impl"


    // $ANTLR start "rule__Motor__Group__4"
    // InternalThymioDSL.g:2093:1: rule__Motor__Group__4 : rule__Motor__Group__4__Impl ;
    public final void rule__Motor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2097:1: ( rule__Motor__Group__4__Impl )
            // InternalThymioDSL.g:2098:2: rule__Motor__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Motor__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Motor__Group__4"


    // $ANTLR start "rule__Motor__Group__4__Impl"
    // InternalThymioDSL.g:2104:1: rule__Motor__Group__4__Impl : ( ( rule__Motor__RightAssignment_4 ) ) ;
    public final void rule__Motor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2108:1: ( ( ( rule__Motor__RightAssignment_4 ) ) )
            // InternalThymioDSL.g:2109:1: ( ( rule__Motor__RightAssignment_4 ) )
            {
            // InternalThymioDSL.g:2109:1: ( ( rule__Motor__RightAssignment_4 ) )
            // InternalThymioDSL.g:2110:2: ( rule__Motor__RightAssignment_4 )
            {
             before(grammarAccess.getMotorAccess().getRightAssignment_4()); 
            // InternalThymioDSL.g:2111:2: ( rule__Motor__RightAssignment_4 )
            // InternalThymioDSL.g:2111:3: rule__Motor__RightAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Motor__RightAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMotorAccess().getRightAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Motor__Group__4__Impl"


    // $ANTLR start "rule__Sound__Group__0"
    // InternalThymioDSL.g:2120:1: rule__Sound__Group__0 : rule__Sound__Group__0__Impl rule__Sound__Group__1 ;
    public final void rule__Sound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2124:1: ( rule__Sound__Group__0__Impl rule__Sound__Group__1 )
            // InternalThymioDSL.g:2125:2: rule__Sound__Group__0__Impl rule__Sound__Group__1
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
    // InternalThymioDSL.g:2132:1: rule__Sound__Group__0__Impl : ( 'note:' ) ;
    public final void rule__Sound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2136:1: ( ( 'note:' ) )
            // InternalThymioDSL.g:2137:1: ( 'note:' )
            {
            // InternalThymioDSL.g:2137:1: ( 'note:' )
            // InternalThymioDSL.g:2138:2: 'note:'
            {
             before(grammarAccess.getSoundAccess().getNoteKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalThymioDSL.g:2147:1: rule__Sound__Group__1 : rule__Sound__Group__1__Impl rule__Sound__Group__2 ;
    public final void rule__Sound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2151:1: ( rule__Sound__Group__1__Impl rule__Sound__Group__2 )
            // InternalThymioDSL.g:2152:2: rule__Sound__Group__1__Impl rule__Sound__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalThymioDSL.g:2159:1: rule__Sound__Group__1__Impl : ( ( rule__Sound__PitchAssignment_1 ) ) ;
    public final void rule__Sound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2163:1: ( ( ( rule__Sound__PitchAssignment_1 ) ) )
            // InternalThymioDSL.g:2164:1: ( ( rule__Sound__PitchAssignment_1 ) )
            {
            // InternalThymioDSL.g:2164:1: ( ( rule__Sound__PitchAssignment_1 ) )
            // InternalThymioDSL.g:2165:2: ( rule__Sound__PitchAssignment_1 )
            {
             before(grammarAccess.getSoundAccess().getPitchAssignment_1()); 
            // InternalThymioDSL.g:2166:2: ( rule__Sound__PitchAssignment_1 )
            // InternalThymioDSL.g:2166:3: rule__Sound__PitchAssignment_1
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
    // InternalThymioDSL.g:2174:1: rule__Sound__Group__2 : rule__Sound__Group__2__Impl rule__Sound__Group__3 ;
    public final void rule__Sound__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2178:1: ( rule__Sound__Group__2__Impl rule__Sound__Group__3 )
            // InternalThymioDSL.g:2179:2: rule__Sound__Group__2__Impl rule__Sound__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Sound__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sound__Group__3();

            state._fsp--;


            }

        }
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
    // InternalThymioDSL.g:2186:1: rule__Sound__Group__2__Impl : ( ( rule__Sound__DurationAssignment_2 ) ) ;
    public final void rule__Sound__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2190:1: ( ( ( rule__Sound__DurationAssignment_2 ) ) )
            // InternalThymioDSL.g:2191:1: ( ( rule__Sound__DurationAssignment_2 ) )
            {
            // InternalThymioDSL.g:2191:1: ( ( rule__Sound__DurationAssignment_2 ) )
            // InternalThymioDSL.g:2192:2: ( rule__Sound__DurationAssignment_2 )
            {
             before(grammarAccess.getSoundAccess().getDurationAssignment_2()); 
            // InternalThymioDSL.g:2193:2: ( rule__Sound__DurationAssignment_2 )
            // InternalThymioDSL.g:2193:3: rule__Sound__DurationAssignment_2
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


    // $ANTLR start "rule__Sound__Group__3"
    // InternalThymioDSL.g:2201:1: rule__Sound__Group__3 : rule__Sound__Group__3__Impl ;
    public final void rule__Sound__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2205:1: ( rule__Sound__Group__3__Impl )
            // InternalThymioDSL.g:2206:2: rule__Sound__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sound__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__Group__3"


    // $ANTLR start "rule__Sound__Group__3__Impl"
    // InternalThymioDSL.g:2212:1: rule__Sound__Group__3__Impl : ( ( rule__Sound__Group_3__0 )* ) ;
    public final void rule__Sound__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2216:1: ( ( ( rule__Sound__Group_3__0 )* ) )
            // InternalThymioDSL.g:2217:1: ( ( rule__Sound__Group_3__0 )* )
            {
            // InternalThymioDSL.g:2217:1: ( ( rule__Sound__Group_3__0 )* )
            // InternalThymioDSL.g:2218:2: ( rule__Sound__Group_3__0 )*
            {
             before(grammarAccess.getSoundAccess().getGroup_3()); 
            // InternalThymioDSL.g:2219:2: ( rule__Sound__Group_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==46) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalThymioDSL.g:2219:3: rule__Sound__Group_3__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Sound__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getSoundAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__Group__3__Impl"


    // $ANTLR start "rule__Sound__Group_3__0"
    // InternalThymioDSL.g:2228:1: rule__Sound__Group_3__0 : rule__Sound__Group_3__0__Impl rule__Sound__Group_3__1 ;
    public final void rule__Sound__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2232:1: ( rule__Sound__Group_3__0__Impl rule__Sound__Group_3__1 )
            // InternalThymioDSL.g:2233:2: rule__Sound__Group_3__0__Impl rule__Sound__Group_3__1
            {
            pushFollow(FOLLOW_23);
            rule__Sound__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sound__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__Group_3__0"


    // $ANTLR start "rule__Sound__Group_3__0__Impl"
    // InternalThymioDSL.g:2240:1: rule__Sound__Group_3__0__Impl : ( 'note:' ) ;
    public final void rule__Sound__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2244:1: ( ( 'note:' ) )
            // InternalThymioDSL.g:2245:1: ( 'note:' )
            {
            // InternalThymioDSL.g:2245:1: ( 'note:' )
            // InternalThymioDSL.g:2246:2: 'note:'
            {
             before(grammarAccess.getSoundAccess().getNoteKeyword_3_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSoundAccess().getNoteKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__Group_3__0__Impl"


    // $ANTLR start "rule__Sound__Group_3__1"
    // InternalThymioDSL.g:2255:1: rule__Sound__Group_3__1 : rule__Sound__Group_3__1__Impl rule__Sound__Group_3__2 ;
    public final void rule__Sound__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2259:1: ( rule__Sound__Group_3__1__Impl rule__Sound__Group_3__2 )
            // InternalThymioDSL.g:2260:2: rule__Sound__Group_3__1__Impl rule__Sound__Group_3__2
            {
            pushFollow(FOLLOW_25);
            rule__Sound__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sound__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__Group_3__1"


    // $ANTLR start "rule__Sound__Group_3__1__Impl"
    // InternalThymioDSL.g:2267:1: rule__Sound__Group_3__1__Impl : ( ( rule__Sound__PitchAssignment_3_1 ) ) ;
    public final void rule__Sound__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2271:1: ( ( ( rule__Sound__PitchAssignment_3_1 ) ) )
            // InternalThymioDSL.g:2272:1: ( ( rule__Sound__PitchAssignment_3_1 ) )
            {
            // InternalThymioDSL.g:2272:1: ( ( rule__Sound__PitchAssignment_3_1 ) )
            // InternalThymioDSL.g:2273:2: ( rule__Sound__PitchAssignment_3_1 )
            {
             before(grammarAccess.getSoundAccess().getPitchAssignment_3_1()); 
            // InternalThymioDSL.g:2274:2: ( rule__Sound__PitchAssignment_3_1 )
            // InternalThymioDSL.g:2274:3: rule__Sound__PitchAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Sound__PitchAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSoundAccess().getPitchAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__Group_3__1__Impl"


    // $ANTLR start "rule__Sound__Group_3__2"
    // InternalThymioDSL.g:2282:1: rule__Sound__Group_3__2 : rule__Sound__Group_3__2__Impl ;
    public final void rule__Sound__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2286:1: ( rule__Sound__Group_3__2__Impl )
            // InternalThymioDSL.g:2287:2: rule__Sound__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sound__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__Group_3__2"


    // $ANTLR start "rule__Sound__Group_3__2__Impl"
    // InternalThymioDSL.g:2293:1: rule__Sound__Group_3__2__Impl : ( ( rule__Sound__DurationAssignment_3_2 ) ) ;
    public final void rule__Sound__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2297:1: ( ( ( rule__Sound__DurationAssignment_3_2 ) ) )
            // InternalThymioDSL.g:2298:1: ( ( rule__Sound__DurationAssignment_3_2 ) )
            {
            // InternalThymioDSL.g:2298:1: ( ( rule__Sound__DurationAssignment_3_2 ) )
            // InternalThymioDSL.g:2299:2: ( rule__Sound__DurationAssignment_3_2 )
            {
             before(grammarAccess.getSoundAccess().getDurationAssignment_3_2()); 
            // InternalThymioDSL.g:2300:2: ( rule__Sound__DurationAssignment_3_2 )
            // InternalThymioDSL.g:2300:3: rule__Sound__DurationAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Sound__DurationAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getSoundAccess().getDurationAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__Group_3__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalThymioDSL.g:2309:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2313:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalThymioDSL.g:2314:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalThymioDSL.g:2321:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2325:1: ( ( ( '-' )? ) )
            // InternalThymioDSL.g:2326:1: ( ( '-' )? )
            {
            // InternalThymioDSL.g:2326:1: ( ( '-' )? )
            // InternalThymioDSL.g:2327:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalThymioDSL.g:2328:2: ( '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==47) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalThymioDSL.g:2328:3: '-'
                    {
                    match(input,47,FOLLOW_2); 

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
    // InternalThymioDSL.g:2336:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2340:1: ( rule__EInt__Group__1__Impl )
            // InternalThymioDSL.g:2341:2: rule__EInt__Group__1__Impl
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
    // InternalThymioDSL.g:2347:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2351:1: ( ( RULE_INT ) )
            // InternalThymioDSL.g:2352:1: ( RULE_INT )
            {
            // InternalThymioDSL.g:2352:1: ( RULE_INT )
            // InternalThymioDSL.g:2353:2: RULE_INT
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


    // $ANTLR start "rule__OnOff__Group_0__0"
    // InternalThymioDSL.g:2363:1: rule__OnOff__Group_0__0 : rule__OnOff__Group_0__0__Impl rule__OnOff__Group_0__1 ;
    public final void rule__OnOff__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2367:1: ( rule__OnOff__Group_0__0__Impl rule__OnOff__Group_0__1 )
            // InternalThymioDSL.g:2368:2: rule__OnOff__Group_0__0__Impl rule__OnOff__Group_0__1
            {
            pushFollow(FOLLOW_28);
            rule__OnOff__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnOff__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnOff__Group_0__0"


    // $ANTLR start "rule__OnOff__Group_0__0__Impl"
    // InternalThymioDSL.g:2375:1: rule__OnOff__Group_0__0__Impl : ( 'on' ) ;
    public final void rule__OnOff__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2379:1: ( ( 'on' ) )
            // InternalThymioDSL.g:2380:1: ( 'on' )
            {
            // InternalThymioDSL.g:2380:1: ( 'on' )
            // InternalThymioDSL.g:2381:2: 'on'
            {
             before(grammarAccess.getOnOffAccess().getOnKeyword_0_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getOnOffAccess().getOnKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnOff__Group_0__0__Impl"


    // $ANTLR start "rule__OnOff__Group_0__1"
    // InternalThymioDSL.g:2390:1: rule__OnOff__Group_0__1 : rule__OnOff__Group_0__1__Impl ;
    public final void rule__OnOff__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2394:1: ( rule__OnOff__Group_0__1__Impl )
            // InternalThymioDSL.g:2395:2: rule__OnOff__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OnOff__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnOff__Group_0__1"


    // $ANTLR start "rule__OnOff__Group_0__1__Impl"
    // InternalThymioDSL.g:2401:1: rule__OnOff__Group_0__1__Impl : ( ruleRGB ) ;
    public final void rule__OnOff__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2405:1: ( ( ruleRGB ) )
            // InternalThymioDSL.g:2406:1: ( ruleRGB )
            {
            // InternalThymioDSL.g:2406:1: ( ruleRGB )
            // InternalThymioDSL.g:2407:2: ruleRGB
            {
             before(grammarAccess.getOnOffAccess().getRGBParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleRGB();

            state._fsp--;

             after(grammarAccess.getOnOffAccess().getRGBParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnOff__Group_0__1__Impl"


    // $ANTLR start "rule__RGB__Group__0"
    // InternalThymioDSL.g:2417:1: rule__RGB__Group__0 : rule__RGB__Group__0__Impl rule__RGB__Group__1 ;
    public final void rule__RGB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2421:1: ( rule__RGB__Group__0__Impl rule__RGB__Group__1 )
            // InternalThymioDSL.g:2422:2: rule__RGB__Group__0__Impl rule__RGB__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalThymioDSL.g:2429:1: rule__RGB__Group__0__Impl : ( '(' ) ;
    public final void rule__RGB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2433:1: ( ( '(' ) )
            // InternalThymioDSL.g:2434:1: ( '(' )
            {
            // InternalThymioDSL.g:2434:1: ( '(' )
            // InternalThymioDSL.g:2435:2: '('
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
    // InternalThymioDSL.g:2444:1: rule__RGB__Group__1 : rule__RGB__Group__1__Impl rule__RGB__Group__2 ;
    public final void rule__RGB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2448:1: ( rule__RGB__Group__1__Impl rule__RGB__Group__2 )
            // InternalThymioDSL.g:2449:2: rule__RGB__Group__1__Impl rule__RGB__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalThymioDSL.g:2456:1: rule__RGB__Group__1__Impl : ( ruleEInt ) ;
    public final void rule__RGB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2460:1: ( ( ruleEInt ) )
            // InternalThymioDSL.g:2461:1: ( ruleEInt )
            {
            // InternalThymioDSL.g:2461:1: ( ruleEInt )
            // InternalThymioDSL.g:2462:2: ruleEInt
            {
             before(grammarAccess.getRGBAccess().getEIntParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRGBAccess().getEIntParserRuleCall_1()); 

            }


            }

        }
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
    // InternalThymioDSL.g:2471:1: rule__RGB__Group__2 : rule__RGB__Group__2__Impl rule__RGB__Group__3 ;
    public final void rule__RGB__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2475:1: ( rule__RGB__Group__2__Impl rule__RGB__Group__3 )
            // InternalThymioDSL.g:2476:2: rule__RGB__Group__2__Impl rule__RGB__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalThymioDSL.g:2483:1: rule__RGB__Group__2__Impl : ( ',' ) ;
    public final void rule__RGB__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2487:1: ( ( ',' ) )
            // InternalThymioDSL.g:2488:1: ( ',' )
            {
            // InternalThymioDSL.g:2488:1: ( ',' )
            // InternalThymioDSL.g:2489:2: ','
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
    // InternalThymioDSL.g:2498:1: rule__RGB__Group__3 : rule__RGB__Group__3__Impl rule__RGB__Group__4 ;
    public final void rule__RGB__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2502:1: ( rule__RGB__Group__3__Impl rule__RGB__Group__4 )
            // InternalThymioDSL.g:2503:2: rule__RGB__Group__3__Impl rule__RGB__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalThymioDSL.g:2510:1: rule__RGB__Group__3__Impl : ( ruleEInt ) ;
    public final void rule__RGB__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2514:1: ( ( ruleEInt ) )
            // InternalThymioDSL.g:2515:1: ( ruleEInt )
            {
            // InternalThymioDSL.g:2515:1: ( ruleEInt )
            // InternalThymioDSL.g:2516:2: ruleEInt
            {
             before(grammarAccess.getRGBAccess().getEIntParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRGBAccess().getEIntParserRuleCall_3()); 

            }


            }

        }
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
    // InternalThymioDSL.g:2525:1: rule__RGB__Group__4 : rule__RGB__Group__4__Impl rule__RGB__Group__5 ;
    public final void rule__RGB__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2529:1: ( rule__RGB__Group__4__Impl rule__RGB__Group__5 )
            // InternalThymioDSL.g:2530:2: rule__RGB__Group__4__Impl rule__RGB__Group__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalThymioDSL.g:2537:1: rule__RGB__Group__4__Impl : ( ',' ) ;
    public final void rule__RGB__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2541:1: ( ( ',' ) )
            // InternalThymioDSL.g:2542:1: ( ',' )
            {
            // InternalThymioDSL.g:2542:1: ( ',' )
            // InternalThymioDSL.g:2543:2: ','
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
    // InternalThymioDSL.g:2552:1: rule__RGB__Group__5 : rule__RGB__Group__5__Impl rule__RGB__Group__6 ;
    public final void rule__RGB__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2556:1: ( rule__RGB__Group__5__Impl rule__RGB__Group__6 )
            // InternalThymioDSL.g:2557:2: rule__RGB__Group__5__Impl rule__RGB__Group__6
            {
            pushFollow(FOLLOW_30);
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
    // InternalThymioDSL.g:2564:1: rule__RGB__Group__5__Impl : ( ruleEInt ) ;
    public final void rule__RGB__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2568:1: ( ( ruleEInt ) )
            // InternalThymioDSL.g:2569:1: ( ruleEInt )
            {
            // InternalThymioDSL.g:2569:1: ( ruleEInt )
            // InternalThymioDSL.g:2570:2: ruleEInt
            {
             before(grammarAccess.getRGBAccess().getEIntParserRuleCall_5()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRGBAccess().getEIntParserRuleCall_5()); 

            }


            }

        }
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
    // InternalThymioDSL.g:2579:1: rule__RGB__Group__6 : rule__RGB__Group__6__Impl ;
    public final void rule__RGB__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2583:1: ( rule__RGB__Group__6__Impl )
            // InternalThymioDSL.g:2584:2: rule__RGB__Group__6__Impl
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
    // InternalThymioDSL.g:2590:1: rule__RGB__Group__6__Impl : ( ')' ) ;
    public final void rule__RGB__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2594:1: ( ( ')' ) )
            // InternalThymioDSL.g:2595:1: ( ')' )
            {
            // InternalThymioDSL.g:2595:1: ( ')' )
            // InternalThymioDSL.g:2596:2: ')'
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


    // $ANTLR start "rule__Addition__Group__0"
    // InternalThymioDSL.g:2606:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2610:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalThymioDSL.g:2611:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalThymioDSL.g:2618:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2622:1: ( ( ruleMultiplication ) )
            // InternalThymioDSL.g:2623:1: ( ruleMultiplication )
            {
            // InternalThymioDSL.g:2623:1: ( ruleMultiplication )
            // InternalThymioDSL.g:2624:2: ruleMultiplication
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
    // InternalThymioDSL.g:2633:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2637:1: ( rule__Addition__Group__1__Impl )
            // InternalThymioDSL.g:2638:2: rule__Addition__Group__1__Impl
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
    // InternalThymioDSL.g:2644:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2648:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalThymioDSL.g:2649:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalThymioDSL.g:2649:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalThymioDSL.g:2650:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalThymioDSL.g:2651:2: ( rule__Addition__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==52) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalThymioDSL.g:2651:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalThymioDSL.g:2660:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2664:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalThymioDSL.g:2665:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalThymioDSL.g:2672:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2676:1: ( ( () ) )
            // InternalThymioDSL.g:2677:1: ( () )
            {
            // InternalThymioDSL.g:2677:1: ( () )
            // InternalThymioDSL.g:2678:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // InternalThymioDSL.g:2679:2: ()
            // InternalThymioDSL.g:2679:3: 
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
    // InternalThymioDSL.g:2687:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2691:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalThymioDSL.g:2692:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
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
    // InternalThymioDSL.g:2699:1: rule__Addition__Group_1__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2703:1: ( ( '+' ) )
            // InternalThymioDSL.g:2704:1: ( '+' )
            {
            // InternalThymioDSL.g:2704:1: ( '+' )
            // InternalThymioDSL.g:2705:2: '+'
            {
             before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1()); 

            }


            }

        }
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
    // InternalThymioDSL.g:2714:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2718:1: ( rule__Addition__Group_1__2__Impl )
            // InternalThymioDSL.g:2719:2: rule__Addition__Group_1__2__Impl
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
    // InternalThymioDSL.g:2725:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2729:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalThymioDSL.g:2730:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalThymioDSL.g:2730:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalThymioDSL.g:2731:2: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // InternalThymioDSL.g:2732:2: ( rule__Addition__RightAssignment_1_2 )
            // InternalThymioDSL.g:2732:3: rule__Addition__RightAssignment_1_2
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
    // InternalThymioDSL.g:2741:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2745:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalThymioDSL.g:2746:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalThymioDSL.g:2753:1: rule__Multiplication__Group__0__Impl : ( ruleNumber ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2757:1: ( ( ruleNumber ) )
            // InternalThymioDSL.g:2758:1: ( ruleNumber )
            {
            // InternalThymioDSL.g:2758:1: ( ruleNumber )
            // InternalThymioDSL.g:2759:2: ruleNumber
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
    // InternalThymioDSL.g:2768:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2772:1: ( rule__Multiplication__Group__1__Impl )
            // InternalThymioDSL.g:2773:2: rule__Multiplication__Group__1__Impl
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
    // InternalThymioDSL.g:2779:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2783:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalThymioDSL.g:2784:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalThymioDSL.g:2784:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalThymioDSL.g:2785:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalThymioDSL.g:2786:2: ( rule__Multiplication__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==53) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalThymioDSL.g:2786:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalThymioDSL.g:2795:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2799:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalThymioDSL.g:2800:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalThymioDSL.g:2807:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2811:1: ( ( () ) )
            // InternalThymioDSL.g:2812:1: ( () )
            {
            // InternalThymioDSL.g:2812:1: ( () )
            // InternalThymioDSL.g:2813:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // InternalThymioDSL.g:2814:2: ()
            // InternalThymioDSL.g:2814:3: 
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
    // InternalThymioDSL.g:2822:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2826:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalThymioDSL.g:2827:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
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
    // InternalThymioDSL.g:2834:1: rule__Multiplication__Group_1__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2838:1: ( ( '*' ) )
            // InternalThymioDSL.g:2839:1: ( '*' )
            {
            // InternalThymioDSL.g:2839:1: ( '*' )
            // InternalThymioDSL.g:2840:2: '*'
            {
             before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1()); 

            }


            }

        }
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
    // InternalThymioDSL.g:2849:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2853:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalThymioDSL.g:2854:2: rule__Multiplication__Group_1__2__Impl
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
    // InternalThymioDSL.g:2860:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2864:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalThymioDSL.g:2865:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalThymioDSL.g:2865:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalThymioDSL.g:2866:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalThymioDSL.g:2867:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalThymioDSL.g:2867:3: rule__Multiplication__RightAssignment_1_2
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
    // InternalThymioDSL.g:2876:1: rule__Number__Group_1__0 : rule__Number__Group_1__0__Impl rule__Number__Group_1__1 ;
    public final void rule__Number__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2880:1: ( rule__Number__Group_1__0__Impl rule__Number__Group_1__1 )
            // InternalThymioDSL.g:2881:2: rule__Number__Group_1__0__Impl rule__Number__Group_1__1
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
    // InternalThymioDSL.g:2888:1: rule__Number__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Number__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2892:1: ( ( '(' ) )
            // InternalThymioDSL.g:2893:1: ( '(' )
            {
            // InternalThymioDSL.g:2893:1: ( '(' )
            // InternalThymioDSL.g:2894:2: '('
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
    // InternalThymioDSL.g:2903:1: rule__Number__Group_1__1 : rule__Number__Group_1__1__Impl rule__Number__Group_1__2 ;
    public final void rule__Number__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2907:1: ( rule__Number__Group_1__1__Impl rule__Number__Group_1__2 )
            // InternalThymioDSL.g:2908:2: rule__Number__Group_1__1__Impl rule__Number__Group_1__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalThymioDSL.g:2915:1: rule__Number__Group_1__1__Impl : ( ruleAddition ) ;
    public final void rule__Number__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2919:1: ( ( ruleAddition ) )
            // InternalThymioDSL.g:2920:1: ( ruleAddition )
            {
            // InternalThymioDSL.g:2920:1: ( ruleAddition )
            // InternalThymioDSL.g:2921:2: ruleAddition
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
    // InternalThymioDSL.g:2930:1: rule__Number__Group_1__2 : rule__Number__Group_1__2__Impl ;
    public final void rule__Number__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2934:1: ( rule__Number__Group_1__2__Impl )
            // InternalThymioDSL.g:2935:2: rule__Number__Group_1__2__Impl
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
    // InternalThymioDSL.g:2941:1: rule__Number__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Number__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2945:1: ( ( ')' ) )
            // InternalThymioDSL.g:2946:1: ( ')' )
            {
            // InternalThymioDSL.g:2946:1: ( ')' )
            // InternalThymioDSL.g:2947:2: ')'
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
    // InternalThymioDSL.g:2957:1: rule__Model__ProceduresAssignment : ( ruleProcedure ) ;
    public final void rule__Model__ProceduresAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2961:1: ( ( ruleProcedure ) )
            // InternalThymioDSL.g:2962:2: ( ruleProcedure )
            {
            // InternalThymioDSL.g:2962:2: ( ruleProcedure )
            // InternalThymioDSL.g:2963:3: ruleProcedure
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
    // InternalThymioDSL.g:2972:1: rule__Procedure__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Procedure__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2976:1: ( ( ruleEString ) )
            // InternalThymioDSL.g:2977:2: ( ruleEString )
            {
            // InternalThymioDSL.g:2977:2: ( ruleEString )
            // InternalThymioDSL.g:2978:3: ruleEString
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
    // InternalThymioDSL.g:2987:1: rule__Procedure__EventsAssignment_3 : ( ruleEvent ) ;
    public final void rule__Procedure__EventsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2991:1: ( ( ruleEvent ) )
            // InternalThymioDSL.g:2992:2: ( ruleEvent )
            {
            // InternalThymioDSL.g:2992:2: ( ruleEvent )
            // InternalThymioDSL.g:2993:3: ruleEvent
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
    // InternalThymioDSL.g:3002:1: rule__Procedure__ActionsAssignment_5 : ( ruleAction ) ;
    public final void rule__Procedure__ActionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3006:1: ( ( ruleAction ) )
            // InternalThymioDSL.g:3007:2: ( ruleAction )
            {
            // InternalThymioDSL.g:3007:2: ( ruleAction )
            // InternalThymioDSL.g:3008:3: ruleAction
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


    // $ANTLR start "rule__Event__ButtonAssignment_0_1_1"
    // InternalThymioDSL.g:3017:1: rule__Event__ButtonAssignment_0_1_1 : ( ruleOrtogonal ) ;
    public final void rule__Event__ButtonAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3021:1: ( ( ruleOrtogonal ) )
            // InternalThymioDSL.g:3022:2: ( ruleOrtogonal )
            {
            // InternalThymioDSL.g:3022:2: ( ruleOrtogonal )
            // InternalThymioDSL.g:3023:3: ruleOrtogonal
            {
             before(grammarAccess.getEventAccess().getButtonOrtogonalParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrtogonal();

            state._fsp--;

             after(grammarAccess.getEventAccess().getButtonOrtogonalParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ButtonAssignment_0_1_1"


    // $ANTLR start "rule__Event__TapAssignment_1_1"
    // InternalThymioDSL.g:3032:1: rule__Event__TapAssignment_1_1 : ( ruleEBoolean ) ;
    public final void rule__Event__TapAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3036:1: ( ( ruleEBoolean ) )
            // InternalThymioDSL.g:3037:2: ( ruleEBoolean )
            {
            // InternalThymioDSL.g:3037:2: ( ruleEBoolean )
            // InternalThymioDSL.g:3038:3: ruleEBoolean
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
    // InternalThymioDSL.g:3047:1: rule__Event__MicAssignment_2_1 : ( ruleEBoolean ) ;
    public final void rule__Event__MicAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3051:1: ( ( ruleEBoolean ) )
            // InternalThymioDSL.g:3052:2: ( ruleEBoolean )
            {
            // InternalThymioDSL.g:3052:2: ( ruleEBoolean )
            // InternalThymioDSL.g:3053:3: ruleEBoolean
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
    // InternalThymioDSL.g:3062:1: rule__Event__SensorAssignment_3_1 : ( ruleSensor ) ;
    public final void rule__Event__SensorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3066:1: ( ( ruleSensor ) )
            // InternalThymioDSL.g:3067:2: ( ruleSensor )
            {
            // InternalThymioDSL.g:3067:2: ( ruleSensor )
            // InternalThymioDSL.g:3068:3: ruleSensor
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


    // $ANTLR start "rule__Sensor__BackLeftSensorAssignment_0_1_1"
    // InternalThymioDSL.g:3077:1: rule__Sensor__BackLeftSensorAssignment_0_1_1 : ( ruleBlackWhite ) ;
    public final void rule__Sensor__BackLeftSensorAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3081:1: ( ( ruleBlackWhite ) )
            // InternalThymioDSL.g:3082:2: ( ruleBlackWhite )
            {
            // InternalThymioDSL.g:3082:2: ( ruleBlackWhite )
            // InternalThymioDSL.g:3083:3: ruleBlackWhite
            {
             before(grammarAccess.getSensorAccess().getBackLeftSensorBlackWhiteParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBlackWhite();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getBackLeftSensorBlackWhiteParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__BackLeftSensorAssignment_0_1_1"


    // $ANTLR start "rule__Sensor__BackRightSensorAssignment_1_1"
    // InternalThymioDSL.g:3092:1: rule__Sensor__BackRightSensorAssignment_1_1 : ( ruleBlackWhite ) ;
    public final void rule__Sensor__BackRightSensorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3096:1: ( ( ruleBlackWhite ) )
            // InternalThymioDSL.g:3097:2: ( ruleBlackWhite )
            {
            // InternalThymioDSL.g:3097:2: ( ruleBlackWhite )
            // InternalThymioDSL.g:3098:3: ruleBlackWhite
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
    // InternalThymioDSL.g:3107:1: rule__Sensor__FrontRightSensorAssignment_2_1 : ( ruleSensorStatus ) ;
    public final void rule__Sensor__FrontRightSensorAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3111:1: ( ( ruleSensorStatus ) )
            // InternalThymioDSL.g:3112:2: ( ruleSensorStatus )
            {
            // InternalThymioDSL.g:3112:2: ( ruleSensorStatus )
            // InternalThymioDSL.g:3113:3: ruleSensorStatus
            {
             before(grammarAccess.getSensorAccess().getFrontRightSensorSensorStatusParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorStatus();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getFrontRightSensorSensorStatusParserRuleCall_2_1_0()); 

            }


            }

        }
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
    // InternalThymioDSL.g:3122:1: rule__Sensor__FrontCenterRightSensorAssignment_3_1 : ( ruleSensorStatus ) ;
    public final void rule__Sensor__FrontCenterRightSensorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3126:1: ( ( ruleSensorStatus ) )
            // InternalThymioDSL.g:3127:2: ( ruleSensorStatus )
            {
            // InternalThymioDSL.g:3127:2: ( ruleSensorStatus )
            // InternalThymioDSL.g:3128:3: ruleSensorStatus
            {
             before(grammarAccess.getSensorAccess().getFrontCenterRightSensorSensorStatusParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorStatus();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getFrontCenterRightSensorSensorStatusParserRuleCall_3_1_0()); 

            }


            }

        }
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
    // InternalThymioDSL.g:3137:1: rule__Sensor__FrontCenterSensorAssignment_4_1 : ( ruleSensorStatus ) ;
    public final void rule__Sensor__FrontCenterSensorAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3141:1: ( ( ruleSensorStatus ) )
            // InternalThymioDSL.g:3142:2: ( ruleSensorStatus )
            {
            // InternalThymioDSL.g:3142:2: ( ruleSensorStatus )
            // InternalThymioDSL.g:3143:3: ruleSensorStatus
            {
             before(grammarAccess.getSensorAccess().getFrontCenterSensorSensorStatusParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorStatus();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getFrontCenterSensorSensorStatusParserRuleCall_4_1_0()); 

            }


            }

        }
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
    // InternalThymioDSL.g:3152:1: rule__Sensor__FrontCenterLeftSensorAssignment_5_1 : ( ruleSensorStatus ) ;
    public final void rule__Sensor__FrontCenterLeftSensorAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3156:1: ( ( ruleSensorStatus ) )
            // InternalThymioDSL.g:3157:2: ( ruleSensorStatus )
            {
            // InternalThymioDSL.g:3157:2: ( ruleSensorStatus )
            // InternalThymioDSL.g:3158:3: ruleSensorStatus
            {
             before(grammarAccess.getSensorAccess().getFrontCenterLeftSensorSensorStatusParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorStatus();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getFrontCenterLeftSensorSensorStatusParserRuleCall_5_1_0()); 

            }


            }

        }
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
    // InternalThymioDSL.g:3167:1: rule__Sensor__FrontLeftSensorAssignment_6_1 : ( ruleSensorStatus ) ;
    public final void rule__Sensor__FrontLeftSensorAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3171:1: ( ( ruleSensorStatus ) )
            // InternalThymioDSL.g:3172:2: ( ruleSensorStatus )
            {
            // InternalThymioDSL.g:3172:2: ( ruleSensorStatus )
            // InternalThymioDSL.g:3173:3: ruleSensorStatus
            {
             before(grammarAccess.getSensorAccess().getFrontLeftSensorSensorStatusParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorStatus();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getFrontLeftSensorSensorStatusParserRuleCall_6_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Action__MoveAssignment_0_1_1"
    // InternalThymioDSL.g:3182:1: rule__Action__MoveAssignment_0_1_1 : ( ruleMotor ) ;
    public final void rule__Action__MoveAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3186:1: ( ( ruleMotor ) )
            // InternalThymioDSL.g:3187:2: ( ruleMotor )
            {
            // InternalThymioDSL.g:3187:2: ( ruleMotor )
            // InternalThymioDSL.g:3188:3: ruleMotor
            {
             before(grammarAccess.getActionAccess().getMoveMotorParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMotor();

            state._fsp--;

             after(grammarAccess.getActionAccess().getMoveMotorParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__MoveAssignment_0_1_1"


    // $ANTLR start "rule__Action__TopLightAssignment_1_1"
    // InternalThymioDSL.g:3197:1: rule__Action__TopLightAssignment_1_1 : ( ruleOnOff ) ;
    public final void rule__Action__TopLightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3201:1: ( ( ruleOnOff ) )
            // InternalThymioDSL.g:3202:2: ( ruleOnOff )
            {
            // InternalThymioDSL.g:3202:2: ( ruleOnOff )
            // InternalThymioDSL.g:3203:3: ruleOnOff
            {
             before(grammarAccess.getActionAccess().getTopLightOnOffParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOnOff();

            state._fsp--;

             after(grammarAccess.getActionAccess().getTopLightOnOffParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__TopLightAssignment_1_1"


    // $ANTLR start "rule__Action__BottomLightAssignment_2_1"
    // InternalThymioDSL.g:3212:1: rule__Action__BottomLightAssignment_2_1 : ( ruleOnOff ) ;
    public final void rule__Action__BottomLightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3216:1: ( ( ruleOnOff ) )
            // InternalThymioDSL.g:3217:2: ( ruleOnOff )
            {
            // InternalThymioDSL.g:3217:2: ( ruleOnOff )
            // InternalThymioDSL.g:3218:3: ruleOnOff
            {
             before(grammarAccess.getActionAccess().getBottomLightOnOffParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOnOff();

            state._fsp--;

             after(grammarAccess.getActionAccess().getBottomLightOnOffParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__BottomLightAssignment_2_1"


    // $ANTLR start "rule__Action__SoundAssignment_3_1"
    // InternalThymioDSL.g:3227:1: rule__Action__SoundAssignment_3_1 : ( ruleSound ) ;
    public final void rule__Action__SoundAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3231:1: ( ( ruleSound ) )
            // InternalThymioDSL.g:3232:2: ( ruleSound )
            {
            // InternalThymioDSL.g:3232:2: ( ruleSound )
            // InternalThymioDSL.g:3233:3: ruleSound
            {
             before(grammarAccess.getActionAccess().getSoundSoundParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSound();

            state._fsp--;

             after(grammarAccess.getActionAccess().getSoundSoundParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__SoundAssignment_3_1"


    // $ANTLR start "rule__Motor__LeftAssignment_2"
    // InternalThymioDSL.g:3242:1: rule__Motor__LeftAssignment_2 : ( ruleAddition ) ;
    public final void rule__Motor__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3246:1: ( ( ruleAddition ) )
            // InternalThymioDSL.g:3247:2: ( ruleAddition )
            {
            // InternalThymioDSL.g:3247:2: ( ruleAddition )
            // InternalThymioDSL.g:3248:3: ruleAddition
            {
             before(grammarAccess.getMotorAccess().getLeftAdditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getMotorAccess().getLeftAdditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Motor__LeftAssignment_2"


    // $ANTLR start "rule__Motor__RightAssignment_4"
    // InternalThymioDSL.g:3257:1: rule__Motor__RightAssignment_4 : ( ruleAddition ) ;
    public final void rule__Motor__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3261:1: ( ( ruleAddition ) )
            // InternalThymioDSL.g:3262:2: ( ruleAddition )
            {
            // InternalThymioDSL.g:3262:2: ( ruleAddition )
            // InternalThymioDSL.g:3263:3: ruleAddition
            {
             before(grammarAccess.getMotorAccess().getRightAdditionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getMotorAccess().getRightAdditionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Motor__RightAssignment_4"


    // $ANTLR start "rule__Sound__PitchAssignment_1"
    // InternalThymioDSL.g:3272:1: rule__Sound__PitchAssignment_1 : ( ruleAddition ) ;
    public final void rule__Sound__PitchAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3276:1: ( ( ruleAddition ) )
            // InternalThymioDSL.g:3277:2: ( ruleAddition )
            {
            // InternalThymioDSL.g:3277:2: ( ruleAddition )
            // InternalThymioDSL.g:3278:3: ruleAddition
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
    // InternalThymioDSL.g:3287:1: rule__Sound__DurationAssignment_2 : ( ruleNoteDuration ) ;
    public final void rule__Sound__DurationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3291:1: ( ( ruleNoteDuration ) )
            // InternalThymioDSL.g:3292:2: ( ruleNoteDuration )
            {
            // InternalThymioDSL.g:3292:2: ( ruleNoteDuration )
            // InternalThymioDSL.g:3293:3: ruleNoteDuration
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


    // $ANTLR start "rule__Sound__PitchAssignment_3_1"
    // InternalThymioDSL.g:3302:1: rule__Sound__PitchAssignment_3_1 : ( ruleAddition ) ;
    public final void rule__Sound__PitchAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3306:1: ( ( ruleAddition ) )
            // InternalThymioDSL.g:3307:2: ( ruleAddition )
            {
            // InternalThymioDSL.g:3307:2: ( ruleAddition )
            // InternalThymioDSL.g:3308:3: ruleAddition
            {
             before(grammarAccess.getSoundAccess().getPitchAdditionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getSoundAccess().getPitchAdditionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__PitchAssignment_3_1"


    // $ANTLR start "rule__Sound__DurationAssignment_3_2"
    // InternalThymioDSL.g:3317:1: rule__Sound__DurationAssignment_3_2 : ( ruleNoteDuration ) ;
    public final void rule__Sound__DurationAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3321:1: ( ( ruleNoteDuration ) )
            // InternalThymioDSL.g:3322:2: ( ruleNoteDuration )
            {
            // InternalThymioDSL.g:3322:2: ( ruleNoteDuration )
            // InternalThymioDSL.g:3323:3: ruleNoteDuration
            {
             before(grammarAccess.getSoundAccess().getDurationNoteDurationParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNoteDuration();

            state._fsp--;

             after(grammarAccess.getSoundAccess().getDurationNoteDurationParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__DurationAssignment_3_2"


    // $ANTLR start "rule__Addition__RightAssignment_1_2"
    // InternalThymioDSL.g:3332:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3336:1: ( ( ruleMultiplication ) )
            // InternalThymioDSL.g:3337:2: ( ruleMultiplication )
            {
            // InternalThymioDSL.g:3337:2: ( ruleMultiplication )
            // InternalThymioDSL.g:3338:3: ruleMultiplication
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


    // $ANTLR start "rule__Multiplication__RightAssignment_1_2"
    // InternalThymioDSL.g:3347:1: rule__Multiplication__RightAssignment_1_2 : ( ruleNumber ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3351:1: ( ( ruleNumber ) )
            // InternalThymioDSL.g:3352:2: ( ruleNumber )
            {
            // InternalThymioDSL.g:3352:2: ( ruleNumber )
            // InternalThymioDSL.g:3353:3: ruleNumber
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
    // InternalThymioDSL.g:3362:1: rule__Number__ValueAssignment_0 : ( ruleEInt ) ;
    public final void rule__Number__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3366:1: ( ( ruleEInt ) )
            // InternalThymioDSL.g:3367:2: ( ruleEInt )
            {
            // InternalThymioDSL.g:3367:2: ( ruleEInt )
            // InternalThymioDSL.g:3368:3: ruleEInt
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000078000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000001F0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000007F00000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0001000000002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0002800000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000800000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0020000000000002L});

}