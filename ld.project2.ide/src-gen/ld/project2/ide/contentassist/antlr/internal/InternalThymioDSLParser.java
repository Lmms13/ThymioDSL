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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'off'", "'short'", "'long'", "'up'", "'down'", "'left'", "'right'", "'center'", "'black'", "'white'", "'covered'", "'uncovered'", "'Procedure:'", "'Event:'", "'Actions:'", "'when:'", "'button_is_clicked:'", "'robot_is_tapped:'", "'sound_is_detected:'", "'sensor_is_activated:'", "'bottom_left:'", "'bottom_right:'", "'northwest:'", "'northnorthwest:'", "'north:'", "'northnortheast:'", "'northeast:'", "'move:'", "'toplight:'", "'bottomlight:'", "'sound:'", "'motors:'", "'left:'", "'right:'", "'Note'", "'Pitch:'", "'-'", "'on'", "'('", "','", "')'", "'+'", "'*'"
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
    public static final int T__13=13;
    public static final int T__14=14;
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
    // InternalThymioDSL.g:119:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:123:2: ( ( ( rule__Event__Group__0 ) ) )
            // InternalThymioDSL.g:124:2: ( ( rule__Event__Group__0 ) )
            {
            // InternalThymioDSL.g:124:2: ( ( rule__Event__Group__0 ) )
            // InternalThymioDSL.g:125:3: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // InternalThymioDSL.g:126:3: ( rule__Event__Group__0 )
            // InternalThymioDSL.g:126:4: rule__Event__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup()); 

            }


            }

        }
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
    // InternalThymioDSL.g:144:1: ruleSensor : ( ( rule__Sensor__Group__0 ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:148:2: ( ( ( rule__Sensor__Group__0 ) ) )
            // InternalThymioDSL.g:149:2: ( ( rule__Sensor__Group__0 ) )
            {
            // InternalThymioDSL.g:149:2: ( ( rule__Sensor__Group__0 ) )
            // InternalThymioDSL.g:150:3: ( rule__Sensor__Group__0 )
            {
             before(grammarAccess.getSensorAccess().getGroup()); 
            // InternalThymioDSL.g:151:3: ( rule__Sensor__Group__0 )
            // InternalThymioDSL.g:151:4: rule__Sensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getGroup()); 

            }


            }

        }
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
    // InternalThymioDSL.g:169:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:173:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalThymioDSL.g:174:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalThymioDSL.g:174:2: ( ( rule__Action__Group__0 ) )
            // InternalThymioDSL.g:175:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalThymioDSL.g:176:3: ( rule__Action__Group__0 )
            // InternalThymioDSL.g:176:4: rule__Action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleRBG"
    // InternalThymioDSL.g:335:1: entryRuleRBG : ruleRBG EOF ;
    public final void entryRuleRBG() throws RecognitionException {
        try {
            // InternalThymioDSL.g:336:1: ( ruleRBG EOF )
            // InternalThymioDSL.g:337:1: ruleRBG EOF
            {
             before(grammarAccess.getRBGRule()); 
            pushFollow(FOLLOW_1);
            ruleRBG();

            state._fsp--;

             after(grammarAccess.getRBGRule()); 
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
    // $ANTLR end "entryRuleRBG"


    // $ANTLR start "ruleRBG"
    // InternalThymioDSL.g:344:1: ruleRBG : ( ( rule__RBG__Group__0 ) ) ;
    public final void ruleRBG() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:348:2: ( ( ( rule__RBG__Group__0 ) ) )
            // InternalThymioDSL.g:349:2: ( ( rule__RBG__Group__0 ) )
            {
            // InternalThymioDSL.g:349:2: ( ( rule__RBG__Group__0 ) )
            // InternalThymioDSL.g:350:3: ( rule__RBG__Group__0 )
            {
             before(grammarAccess.getRBGAccess().getGroup()); 
            // InternalThymioDSL.g:351:3: ( rule__RBG__Group__0 )
            // InternalThymioDSL.g:351:4: rule__RBG__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RBG__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRBGAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRBG"


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


    // $ANTLR start "entryRulePrimary"
    // InternalThymioDSL.g:510:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalThymioDSL.g:511:1: ( rulePrimary EOF )
            // InternalThymioDSL.g:512:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalThymioDSL.g:519:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:523:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalThymioDSL.g:524:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalThymioDSL.g:524:2: ( ( rule__Primary__Alternatives ) )
            // InternalThymioDSL.g:525:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalThymioDSL.g:526:3: ( rule__Primary__Alternatives )
            // InternalThymioDSL.g:526:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalThymioDSL.g:534:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:538:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalThymioDSL.g:539:2: ( RULE_STRING )
                    {
                    // InternalThymioDSL.g:539:2: ( RULE_STRING )
                    // InternalThymioDSL.g:540:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:545:2: ( RULE_ID )
                    {
                    // InternalThymioDSL.g:545:2: ( RULE_ID )
                    // InternalThymioDSL.g:546:3: RULE_ID
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
    // InternalThymioDSL.g:555:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:559:1: ( ( 'true' ) | ( 'false' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalThymioDSL.g:560:2: ( 'true' )
                    {
                    // InternalThymioDSL.g:560:2: ( 'true' )
                    // InternalThymioDSL.g:561:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:566:2: ( 'false' )
                    {
                    // InternalThymioDSL.g:566:2: ( 'false' )
                    // InternalThymioDSL.g:567:3: 'false'
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
    // InternalThymioDSL.g:576:1: rule__OnOff__Alternatives : ( ( ( rule__OnOff__Group_0__0 ) ) | ( 'off' ) );
    public final void rule__OnOff__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:580:1: ( ( ( rule__OnOff__Group_0__0 ) ) | ( 'off' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==50) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalThymioDSL.g:581:2: ( ( rule__OnOff__Group_0__0 ) )
                    {
                    // InternalThymioDSL.g:581:2: ( ( rule__OnOff__Group_0__0 ) )
                    // InternalThymioDSL.g:582:3: ( rule__OnOff__Group_0__0 )
                    {
                     before(grammarAccess.getOnOffAccess().getGroup_0()); 
                    // InternalThymioDSL.g:583:3: ( rule__OnOff__Group_0__0 )
                    // InternalThymioDSL.g:583:4: rule__OnOff__Group_0__0
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
                    // InternalThymioDSL.g:587:2: ( 'off' )
                    {
                    // InternalThymioDSL.g:587:2: ( 'off' )
                    // InternalThymioDSL.g:588:3: 'off'
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
    // InternalThymioDSL.g:597:1: rule__NoteDuration__Alternatives : ( ( 'short' ) | ( 'long' ) );
    public final void rule__NoteDuration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:601:1: ( ( 'short' ) | ( 'long' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalThymioDSL.g:602:2: ( 'short' )
                    {
                    // InternalThymioDSL.g:602:2: ( 'short' )
                    // InternalThymioDSL.g:603:3: 'short'
                    {
                     before(grammarAccess.getNoteDurationAccess().getShortKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getNoteDurationAccess().getShortKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:608:2: ( 'long' )
                    {
                    // InternalThymioDSL.g:608:2: ( 'long' )
                    // InternalThymioDSL.g:609:3: 'long'
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
    // InternalThymioDSL.g:618:1: rule__Ortogonal__Alternatives : ( ( 'up' ) | ( 'down' ) | ( 'left' ) | ( 'right' ) | ( 'center' ) );
    public final void rule__Ortogonal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:622:1: ( ( 'up' ) | ( 'down' ) | ( 'left' ) | ( 'right' ) | ( 'center' ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            case 19:
                {
                alt6=4;
                }
                break;
            case 20:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalThymioDSL.g:623:2: ( 'up' )
                    {
                    // InternalThymioDSL.g:623:2: ( 'up' )
                    // InternalThymioDSL.g:624:3: 'up'
                    {
                     before(grammarAccess.getOrtogonalAccess().getUpKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getOrtogonalAccess().getUpKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:629:2: ( 'down' )
                    {
                    // InternalThymioDSL.g:629:2: ( 'down' )
                    // InternalThymioDSL.g:630:3: 'down'
                    {
                     before(grammarAccess.getOrtogonalAccess().getDownKeyword_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getOrtogonalAccess().getDownKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalThymioDSL.g:635:2: ( 'left' )
                    {
                    // InternalThymioDSL.g:635:2: ( 'left' )
                    // InternalThymioDSL.g:636:3: 'left'
                    {
                     before(grammarAccess.getOrtogonalAccess().getLeftKeyword_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getOrtogonalAccess().getLeftKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalThymioDSL.g:641:2: ( 'right' )
                    {
                    // InternalThymioDSL.g:641:2: ( 'right' )
                    // InternalThymioDSL.g:642:3: 'right'
                    {
                     before(grammarAccess.getOrtogonalAccess().getRightKeyword_3()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getOrtogonalAccess().getRightKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalThymioDSL.g:647:2: ( 'center' )
                    {
                    // InternalThymioDSL.g:647:2: ( 'center' )
                    // InternalThymioDSL.g:648:3: 'center'
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
    // InternalThymioDSL.g:657:1: rule__BlackWhite__Alternatives : ( ( 'black' ) | ( 'white' ) );
    public final void rule__BlackWhite__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:661:1: ( ( 'black' ) | ( 'white' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalThymioDSL.g:662:2: ( 'black' )
                    {
                    // InternalThymioDSL.g:662:2: ( 'black' )
                    // InternalThymioDSL.g:663:3: 'black'
                    {
                     before(grammarAccess.getBlackWhiteAccess().getBlackKeyword_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getBlackWhiteAccess().getBlackKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:668:2: ( 'white' )
                    {
                    // InternalThymioDSL.g:668:2: ( 'white' )
                    // InternalThymioDSL.g:669:3: 'white'
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
    // InternalThymioDSL.g:678:1: rule__SensorStatus__Alternatives : ( ( 'covered' ) | ( 'uncovered' ) );
    public final void rule__SensorStatus__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:682:1: ( ( 'covered' ) | ( 'uncovered' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==24) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalThymioDSL.g:683:2: ( 'covered' )
                    {
                    // InternalThymioDSL.g:683:2: ( 'covered' )
                    // InternalThymioDSL.g:684:3: 'covered'
                    {
                     before(grammarAccess.getSensorStatusAccess().getCoveredKeyword_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getSensorStatusAccess().getCoveredKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:689:2: ( 'uncovered' )
                    {
                    // InternalThymioDSL.g:689:2: ( 'uncovered' )
                    // InternalThymioDSL.g:690:3: 'uncovered'
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


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalThymioDSL.g:699:1: rule__Primary__Alternatives : ( ( ( rule__Primary__ValueAssignment_0 ) ) | ( ( rule__Primary__Group_1__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:703:1: ( ( ( rule__Primary__ValueAssignment_0 ) ) | ( ( rule__Primary__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT||LA9_0==49) ) {
                alt9=1;
            }
            else if ( (LA9_0==51) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalThymioDSL.g:704:2: ( ( rule__Primary__ValueAssignment_0 ) )
                    {
                    // InternalThymioDSL.g:704:2: ( ( rule__Primary__ValueAssignment_0 ) )
                    // InternalThymioDSL.g:705:3: ( rule__Primary__ValueAssignment_0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getValueAssignment_0()); 
                    // InternalThymioDSL.g:706:3: ( rule__Primary__ValueAssignment_0 )
                    // InternalThymioDSL.g:706:4: rule__Primary__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalThymioDSL.g:710:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalThymioDSL.g:710:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalThymioDSL.g:711:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalThymioDSL.g:712:3: ( rule__Primary__Group_1__0 )
                    // InternalThymioDSL.g:712:4: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Procedure__Group__0"
    // InternalThymioDSL.g:720:1: rule__Procedure__Group__0 : rule__Procedure__Group__0__Impl rule__Procedure__Group__1 ;
    public final void rule__Procedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:724:1: ( rule__Procedure__Group__0__Impl rule__Procedure__Group__1 )
            // InternalThymioDSL.g:725:2: rule__Procedure__Group__0__Impl rule__Procedure__Group__1
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
    // InternalThymioDSL.g:732:1: rule__Procedure__Group__0__Impl : ( 'Procedure:' ) ;
    public final void rule__Procedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:736:1: ( ( 'Procedure:' ) )
            // InternalThymioDSL.g:737:1: ( 'Procedure:' )
            {
            // InternalThymioDSL.g:737:1: ( 'Procedure:' )
            // InternalThymioDSL.g:738:2: 'Procedure:'
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
    // InternalThymioDSL.g:747:1: rule__Procedure__Group__1 : rule__Procedure__Group__1__Impl rule__Procedure__Group__2 ;
    public final void rule__Procedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:751:1: ( rule__Procedure__Group__1__Impl rule__Procedure__Group__2 )
            // InternalThymioDSL.g:752:2: rule__Procedure__Group__1__Impl rule__Procedure__Group__2
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
    // InternalThymioDSL.g:759:1: rule__Procedure__Group__1__Impl : ( ( rule__Procedure__NameAssignment_1 ) ) ;
    public final void rule__Procedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:763:1: ( ( ( rule__Procedure__NameAssignment_1 ) ) )
            // InternalThymioDSL.g:764:1: ( ( rule__Procedure__NameAssignment_1 ) )
            {
            // InternalThymioDSL.g:764:1: ( ( rule__Procedure__NameAssignment_1 ) )
            // InternalThymioDSL.g:765:2: ( rule__Procedure__NameAssignment_1 )
            {
             before(grammarAccess.getProcedureAccess().getNameAssignment_1()); 
            // InternalThymioDSL.g:766:2: ( rule__Procedure__NameAssignment_1 )
            // InternalThymioDSL.g:766:3: rule__Procedure__NameAssignment_1
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
    // InternalThymioDSL.g:774:1: rule__Procedure__Group__2 : rule__Procedure__Group__2__Impl rule__Procedure__Group__3 ;
    public final void rule__Procedure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:778:1: ( rule__Procedure__Group__2__Impl rule__Procedure__Group__3 )
            // InternalThymioDSL.g:779:2: rule__Procedure__Group__2__Impl rule__Procedure__Group__3
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
    // InternalThymioDSL.g:786:1: rule__Procedure__Group__2__Impl : ( 'Event:' ) ;
    public final void rule__Procedure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:790:1: ( ( 'Event:' ) )
            // InternalThymioDSL.g:791:1: ( 'Event:' )
            {
            // InternalThymioDSL.g:791:1: ( 'Event:' )
            // InternalThymioDSL.g:792:2: 'Event:'
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
    // InternalThymioDSL.g:801:1: rule__Procedure__Group__3 : rule__Procedure__Group__3__Impl rule__Procedure__Group__4 ;
    public final void rule__Procedure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:805:1: ( rule__Procedure__Group__3__Impl rule__Procedure__Group__4 )
            // InternalThymioDSL.g:806:2: rule__Procedure__Group__3__Impl rule__Procedure__Group__4
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
    // InternalThymioDSL.g:813:1: rule__Procedure__Group__3__Impl : ( ( rule__Procedure__EventsAssignment_3 ) ) ;
    public final void rule__Procedure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:817:1: ( ( ( rule__Procedure__EventsAssignment_3 ) ) )
            // InternalThymioDSL.g:818:1: ( ( rule__Procedure__EventsAssignment_3 ) )
            {
            // InternalThymioDSL.g:818:1: ( ( rule__Procedure__EventsAssignment_3 ) )
            // InternalThymioDSL.g:819:2: ( rule__Procedure__EventsAssignment_3 )
            {
             before(grammarAccess.getProcedureAccess().getEventsAssignment_3()); 
            // InternalThymioDSL.g:820:2: ( rule__Procedure__EventsAssignment_3 )
            // InternalThymioDSL.g:820:3: rule__Procedure__EventsAssignment_3
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
    // InternalThymioDSL.g:828:1: rule__Procedure__Group__4 : rule__Procedure__Group__4__Impl rule__Procedure__Group__5 ;
    public final void rule__Procedure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:832:1: ( rule__Procedure__Group__4__Impl rule__Procedure__Group__5 )
            // InternalThymioDSL.g:833:2: rule__Procedure__Group__4__Impl rule__Procedure__Group__5
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
    // InternalThymioDSL.g:840:1: rule__Procedure__Group__4__Impl : ( 'Actions:' ) ;
    public final void rule__Procedure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:844:1: ( ( 'Actions:' ) )
            // InternalThymioDSL.g:845:1: ( 'Actions:' )
            {
            // InternalThymioDSL.g:845:1: ( 'Actions:' )
            // InternalThymioDSL.g:846:2: 'Actions:'
            {
             before(grammarAccess.getProcedureAccess().getActionsKeyword_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalThymioDSL.g:855:1: rule__Procedure__Group__5 : rule__Procedure__Group__5__Impl ;
    public final void rule__Procedure__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:859:1: ( rule__Procedure__Group__5__Impl )
            // InternalThymioDSL.g:860:2: rule__Procedure__Group__5__Impl
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
    // InternalThymioDSL.g:866:1: rule__Procedure__Group__5__Impl : ( ( ( rule__Procedure__ActionsAssignment_5 ) ) ( ( rule__Procedure__ActionsAssignment_5 )* ) ) ;
    public final void rule__Procedure__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:870:1: ( ( ( ( rule__Procedure__ActionsAssignment_5 ) ) ( ( rule__Procedure__ActionsAssignment_5 )* ) ) )
            // InternalThymioDSL.g:871:1: ( ( ( rule__Procedure__ActionsAssignment_5 ) ) ( ( rule__Procedure__ActionsAssignment_5 )* ) )
            {
            // InternalThymioDSL.g:871:1: ( ( ( rule__Procedure__ActionsAssignment_5 ) ) ( ( rule__Procedure__ActionsAssignment_5 )* ) )
            // InternalThymioDSL.g:872:2: ( ( rule__Procedure__ActionsAssignment_5 ) ) ( ( rule__Procedure__ActionsAssignment_5 )* )
            {
            // InternalThymioDSL.g:872:2: ( ( rule__Procedure__ActionsAssignment_5 ) )
            // InternalThymioDSL.g:873:3: ( rule__Procedure__ActionsAssignment_5 )
            {
             before(grammarAccess.getProcedureAccess().getActionsAssignment_5()); 
            // InternalThymioDSL.g:874:3: ( rule__Procedure__ActionsAssignment_5 )
            // InternalThymioDSL.g:874:4: rule__Procedure__ActionsAssignment_5
            {
            pushFollow(FOLLOW_9);
            rule__Procedure__ActionsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getActionsAssignment_5()); 

            }

            // InternalThymioDSL.g:877:2: ( ( rule__Procedure__ActionsAssignment_5 )* )
            // InternalThymioDSL.g:878:3: ( rule__Procedure__ActionsAssignment_5 )*
            {
             before(grammarAccess.getProcedureAccess().getActionsAssignment_5()); 
            // InternalThymioDSL.g:879:3: ( rule__Procedure__ActionsAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==40) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalThymioDSL.g:879:4: rule__Procedure__ActionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Procedure__ActionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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


    // $ANTLR start "rule__Event__Group__0"
    // InternalThymioDSL.g:889:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:893:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // InternalThymioDSL.g:894:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // InternalThymioDSL.g:901:1: rule__Event__Group__0__Impl : ( () ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:905:1: ( ( () ) )
            // InternalThymioDSL.g:906:1: ( () )
            {
            // InternalThymioDSL.g:906:1: ( () )
            // InternalThymioDSL.g:907:2: ()
            {
             before(grammarAccess.getEventAccess().getEventAction_0()); 
            // InternalThymioDSL.g:908:2: ()
            // InternalThymioDSL.g:908:3: 
            {
            }

             after(grammarAccess.getEventAccess().getEventAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // InternalThymioDSL.g:916:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:920:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // InternalThymioDSL.g:921:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Event__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // InternalThymioDSL.g:928:1: rule__Event__Group__1__Impl : ( 'when:' ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:932:1: ( ( 'when:' ) )
            // InternalThymioDSL.g:933:1: ( 'when:' )
            {
            // InternalThymioDSL.g:933:1: ( 'when:' )
            // InternalThymioDSL.g:934:2: 'when:'
            {
             before(grammarAccess.getEventAccess().getWhenKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getWhenKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__Event__Group__2"
    // InternalThymioDSL.g:943:1: rule__Event__Group__2 : rule__Event__Group__2__Impl rule__Event__Group__3 ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:947:1: ( rule__Event__Group__2__Impl rule__Event__Group__3 )
            // InternalThymioDSL.g:948:2: rule__Event__Group__2__Impl rule__Event__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Event__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2"


    // $ANTLR start "rule__Event__Group__2__Impl"
    // InternalThymioDSL.g:955:1: rule__Event__Group__2__Impl : ( ( rule__Event__Group_2__0 )? ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:959:1: ( ( ( rule__Event__Group_2__0 )? ) )
            // InternalThymioDSL.g:960:1: ( ( rule__Event__Group_2__0 )? )
            {
            // InternalThymioDSL.g:960:1: ( ( rule__Event__Group_2__0 )? )
            // InternalThymioDSL.g:961:2: ( rule__Event__Group_2__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_2()); 
            // InternalThymioDSL.g:962:2: ( rule__Event__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalThymioDSL.g:962:3: rule__Event__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2__Impl"


    // $ANTLR start "rule__Event__Group__3"
    // InternalThymioDSL.g:970:1: rule__Event__Group__3 : rule__Event__Group__3__Impl rule__Event__Group__4 ;
    public final void rule__Event__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:974:1: ( rule__Event__Group__3__Impl rule__Event__Group__4 )
            // InternalThymioDSL.g:975:2: rule__Event__Group__3__Impl rule__Event__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Event__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__3"


    // $ANTLR start "rule__Event__Group__3__Impl"
    // InternalThymioDSL.g:982:1: rule__Event__Group__3__Impl : ( ( rule__Event__Group_3__0 )? ) ;
    public final void rule__Event__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:986:1: ( ( ( rule__Event__Group_3__0 )? ) )
            // InternalThymioDSL.g:987:1: ( ( rule__Event__Group_3__0 )? )
            {
            // InternalThymioDSL.g:987:1: ( ( rule__Event__Group_3__0 )? )
            // InternalThymioDSL.g:988:2: ( rule__Event__Group_3__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_3()); 
            // InternalThymioDSL.g:989:2: ( rule__Event__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalThymioDSL.g:989:3: rule__Event__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__3__Impl"


    // $ANTLR start "rule__Event__Group__4"
    // InternalThymioDSL.g:997:1: rule__Event__Group__4 : rule__Event__Group__4__Impl rule__Event__Group__5 ;
    public final void rule__Event__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1001:1: ( rule__Event__Group__4__Impl rule__Event__Group__5 )
            // InternalThymioDSL.g:1002:2: rule__Event__Group__4__Impl rule__Event__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Event__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__4"


    // $ANTLR start "rule__Event__Group__4__Impl"
    // InternalThymioDSL.g:1009:1: rule__Event__Group__4__Impl : ( ( rule__Event__Group_4__0 )? ) ;
    public final void rule__Event__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1013:1: ( ( ( rule__Event__Group_4__0 )? ) )
            // InternalThymioDSL.g:1014:1: ( ( rule__Event__Group_4__0 )? )
            {
            // InternalThymioDSL.g:1014:1: ( ( rule__Event__Group_4__0 )? )
            // InternalThymioDSL.g:1015:2: ( rule__Event__Group_4__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_4()); 
            // InternalThymioDSL.g:1016:2: ( rule__Event__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalThymioDSL.g:1016:3: rule__Event__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__4__Impl"


    // $ANTLR start "rule__Event__Group__5"
    // InternalThymioDSL.g:1024:1: rule__Event__Group__5 : rule__Event__Group__5__Impl ;
    public final void rule__Event__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1028:1: ( rule__Event__Group__5__Impl )
            // InternalThymioDSL.g:1029:2: rule__Event__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__5"


    // $ANTLR start "rule__Event__Group__5__Impl"
    // InternalThymioDSL.g:1035:1: rule__Event__Group__5__Impl : ( ( rule__Event__Group_5__0 )? ) ;
    public final void rule__Event__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1039:1: ( ( ( rule__Event__Group_5__0 )? ) )
            // InternalThymioDSL.g:1040:1: ( ( rule__Event__Group_5__0 )? )
            {
            // InternalThymioDSL.g:1040:1: ( ( rule__Event__Group_5__0 )? )
            // InternalThymioDSL.g:1041:2: ( rule__Event__Group_5__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_5()); 
            // InternalThymioDSL.g:1042:2: ( rule__Event__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalThymioDSL.g:1042:3: rule__Event__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__5__Impl"


    // $ANTLR start "rule__Event__Group_2__0"
    // InternalThymioDSL.g:1051:1: rule__Event__Group_2__0 : rule__Event__Group_2__0__Impl rule__Event__Group_2__1 ;
    public final void rule__Event__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1055:1: ( rule__Event__Group_2__0__Impl rule__Event__Group_2__1 )
            // InternalThymioDSL.g:1056:2: rule__Event__Group_2__0__Impl rule__Event__Group_2__1
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
    // InternalThymioDSL.g:1063:1: rule__Event__Group_2__0__Impl : ( 'button_is_clicked:' ) ;
    public final void rule__Event__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1067:1: ( ( 'button_is_clicked:' ) )
            // InternalThymioDSL.g:1068:1: ( 'button_is_clicked:' )
            {
            // InternalThymioDSL.g:1068:1: ( 'button_is_clicked:' )
            // InternalThymioDSL.g:1069:2: 'button_is_clicked:'
            {
             before(grammarAccess.getEventAccess().getButton_is_clickedKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getButton_is_clickedKeyword_2_0()); 

            }


            }

        }
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
    // InternalThymioDSL.g:1078:1: rule__Event__Group_2__1 : rule__Event__Group_2__1__Impl ;
    public final void rule__Event__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1082:1: ( rule__Event__Group_2__1__Impl )
            // InternalThymioDSL.g:1083:2: rule__Event__Group_2__1__Impl
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
    // InternalThymioDSL.g:1089:1: rule__Event__Group_2__1__Impl : ( ( rule__Event__ButtonAssignment_2_1 ) ) ;
    public final void rule__Event__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1093:1: ( ( ( rule__Event__ButtonAssignment_2_1 ) ) )
            // InternalThymioDSL.g:1094:1: ( ( rule__Event__ButtonAssignment_2_1 ) )
            {
            // InternalThymioDSL.g:1094:1: ( ( rule__Event__ButtonAssignment_2_1 ) )
            // InternalThymioDSL.g:1095:2: ( rule__Event__ButtonAssignment_2_1 )
            {
             before(grammarAccess.getEventAccess().getButtonAssignment_2_1()); 
            // InternalThymioDSL.g:1096:2: ( rule__Event__ButtonAssignment_2_1 )
            // InternalThymioDSL.g:1096:3: rule__Event__ButtonAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__ButtonAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getButtonAssignment_2_1()); 

            }


            }

        }
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
    // InternalThymioDSL.g:1105:1: rule__Event__Group_3__0 : rule__Event__Group_3__0__Impl rule__Event__Group_3__1 ;
    public final void rule__Event__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1109:1: ( rule__Event__Group_3__0__Impl rule__Event__Group_3__1 )
            // InternalThymioDSL.g:1110:2: rule__Event__Group_3__0__Impl rule__Event__Group_3__1
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
    // InternalThymioDSL.g:1117:1: rule__Event__Group_3__0__Impl : ( 'robot_is_tapped:' ) ;
    public final void rule__Event__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1121:1: ( ( 'robot_is_tapped:' ) )
            // InternalThymioDSL.g:1122:1: ( 'robot_is_tapped:' )
            {
            // InternalThymioDSL.g:1122:1: ( 'robot_is_tapped:' )
            // InternalThymioDSL.g:1123:2: 'robot_is_tapped:'
            {
             before(grammarAccess.getEventAccess().getRobot_is_tappedKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getRobot_is_tappedKeyword_3_0()); 

            }


            }

        }
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
    // InternalThymioDSL.g:1132:1: rule__Event__Group_3__1 : rule__Event__Group_3__1__Impl ;
    public final void rule__Event__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1136:1: ( rule__Event__Group_3__1__Impl )
            // InternalThymioDSL.g:1137:2: rule__Event__Group_3__1__Impl
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
    // InternalThymioDSL.g:1143:1: rule__Event__Group_3__1__Impl : ( ( rule__Event__TapAssignment_3_1 ) ) ;
    public final void rule__Event__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1147:1: ( ( ( rule__Event__TapAssignment_3_1 ) ) )
            // InternalThymioDSL.g:1148:1: ( ( rule__Event__TapAssignment_3_1 ) )
            {
            // InternalThymioDSL.g:1148:1: ( ( rule__Event__TapAssignment_3_1 ) )
            // InternalThymioDSL.g:1149:2: ( rule__Event__TapAssignment_3_1 )
            {
             before(grammarAccess.getEventAccess().getTapAssignment_3_1()); 
            // InternalThymioDSL.g:1150:2: ( rule__Event__TapAssignment_3_1 )
            // InternalThymioDSL.g:1150:3: rule__Event__TapAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__TapAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getTapAssignment_3_1()); 

            }


            }

        }
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
    // InternalThymioDSL.g:1159:1: rule__Event__Group_4__0 : rule__Event__Group_4__0__Impl rule__Event__Group_4__1 ;
    public final void rule__Event__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1163:1: ( rule__Event__Group_4__0__Impl rule__Event__Group_4__1 )
            // InternalThymioDSL.g:1164:2: rule__Event__Group_4__0__Impl rule__Event__Group_4__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalThymioDSL.g:1171:1: rule__Event__Group_4__0__Impl : ( 'sound_is_detected:' ) ;
    public final void rule__Event__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1175:1: ( ( 'sound_is_detected:' ) )
            // InternalThymioDSL.g:1176:1: ( 'sound_is_detected:' )
            {
            // InternalThymioDSL.g:1176:1: ( 'sound_is_detected:' )
            // InternalThymioDSL.g:1177:2: 'sound_is_detected:'
            {
             before(grammarAccess.getEventAccess().getSound_is_detectedKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getSound_is_detectedKeyword_4_0()); 

            }


            }

        }
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
    // InternalThymioDSL.g:1186:1: rule__Event__Group_4__1 : rule__Event__Group_4__1__Impl ;
    public final void rule__Event__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1190:1: ( rule__Event__Group_4__1__Impl )
            // InternalThymioDSL.g:1191:2: rule__Event__Group_4__1__Impl
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
    // InternalThymioDSL.g:1197:1: rule__Event__Group_4__1__Impl : ( ( rule__Event__MicAssignment_4_1 ) ) ;
    public final void rule__Event__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1201:1: ( ( ( rule__Event__MicAssignment_4_1 ) ) )
            // InternalThymioDSL.g:1202:1: ( ( rule__Event__MicAssignment_4_1 ) )
            {
            // InternalThymioDSL.g:1202:1: ( ( rule__Event__MicAssignment_4_1 ) )
            // InternalThymioDSL.g:1203:2: ( rule__Event__MicAssignment_4_1 )
            {
             before(grammarAccess.getEventAccess().getMicAssignment_4_1()); 
            // InternalThymioDSL.g:1204:2: ( rule__Event__MicAssignment_4_1 )
            // InternalThymioDSL.g:1204:3: rule__Event__MicAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__MicAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getMicAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Event__Group_5__0"
    // InternalThymioDSL.g:1213:1: rule__Event__Group_5__0 : rule__Event__Group_5__0__Impl rule__Event__Group_5__1 ;
    public final void rule__Event__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1217:1: ( rule__Event__Group_5__0__Impl rule__Event__Group_5__1 )
            // InternalThymioDSL.g:1218:2: rule__Event__Group_5__0__Impl rule__Event__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__Event__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_5__0"


    // $ANTLR start "rule__Event__Group_5__0__Impl"
    // InternalThymioDSL.g:1225:1: rule__Event__Group_5__0__Impl : ( 'sensor_is_activated:' ) ;
    public final void rule__Event__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1229:1: ( ( 'sensor_is_activated:' ) )
            // InternalThymioDSL.g:1230:1: ( 'sensor_is_activated:' )
            {
            // InternalThymioDSL.g:1230:1: ( 'sensor_is_activated:' )
            // InternalThymioDSL.g:1231:2: 'sensor_is_activated:'
            {
             before(grammarAccess.getEventAccess().getSensor_is_activatedKeyword_5_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getSensor_is_activatedKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_5__0__Impl"


    // $ANTLR start "rule__Event__Group_5__1"
    // InternalThymioDSL.g:1240:1: rule__Event__Group_5__1 : rule__Event__Group_5__1__Impl ;
    public final void rule__Event__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1244:1: ( rule__Event__Group_5__1__Impl )
            // InternalThymioDSL.g:1245:2: rule__Event__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_5__1"


    // $ANTLR start "rule__Event__Group_5__1__Impl"
    // InternalThymioDSL.g:1251:1: rule__Event__Group_5__1__Impl : ( ( rule__Event__SensorAssignment_5_1 ) ) ;
    public final void rule__Event__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1255:1: ( ( ( rule__Event__SensorAssignment_5_1 ) ) )
            // InternalThymioDSL.g:1256:1: ( ( rule__Event__SensorAssignment_5_1 ) )
            {
            // InternalThymioDSL.g:1256:1: ( ( rule__Event__SensorAssignment_5_1 ) )
            // InternalThymioDSL.g:1257:2: ( rule__Event__SensorAssignment_5_1 )
            {
             before(grammarAccess.getEventAccess().getSensorAssignment_5_1()); 
            // InternalThymioDSL.g:1258:2: ( rule__Event__SensorAssignment_5_1 )
            // InternalThymioDSL.g:1258:3: rule__Event__SensorAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__SensorAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getSensorAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_5__1__Impl"


    // $ANTLR start "rule__Sensor__Group__0"
    // InternalThymioDSL.g:1267:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1271:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalThymioDSL.g:1272:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Sensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0"


    // $ANTLR start "rule__Sensor__Group__0__Impl"
    // InternalThymioDSL.g:1279:1: rule__Sensor__Group__0__Impl : ( () ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1283:1: ( ( () ) )
            // InternalThymioDSL.g:1284:1: ( () )
            {
            // InternalThymioDSL.g:1284:1: ( () )
            // InternalThymioDSL.g:1285:2: ()
            {
             before(grammarAccess.getSensorAccess().getSensorAction_0()); 
            // InternalThymioDSL.g:1286:2: ()
            // InternalThymioDSL.g:1286:3: 
            {
            }

             after(grammarAccess.getSensorAccess().getSensorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0__Impl"


    // $ANTLR start "rule__Sensor__Group__1"
    // InternalThymioDSL.g:1294:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl rule__Sensor__Group__2 ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1298:1: ( rule__Sensor__Group__1__Impl rule__Sensor__Group__2 )
            // InternalThymioDSL.g:1299:2: rule__Sensor__Group__1__Impl rule__Sensor__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Sensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1"


    // $ANTLR start "rule__Sensor__Group__1__Impl"
    // InternalThymioDSL.g:1306:1: rule__Sensor__Group__1__Impl : ( ( rule__Sensor__Group_1__0 )? ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1310:1: ( ( ( rule__Sensor__Group_1__0 )? ) )
            // InternalThymioDSL.g:1311:1: ( ( rule__Sensor__Group_1__0 )? )
            {
            // InternalThymioDSL.g:1311:1: ( ( rule__Sensor__Group_1__0 )? )
            // InternalThymioDSL.g:1312:2: ( rule__Sensor__Group_1__0 )?
            {
             before(grammarAccess.getSensorAccess().getGroup_1()); 
            // InternalThymioDSL.g:1313:2: ( rule__Sensor__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalThymioDSL.g:1313:3: rule__Sensor__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSensorAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1__Impl"


    // $ANTLR start "rule__Sensor__Group__2"
    // InternalThymioDSL.g:1321:1: rule__Sensor__Group__2 : rule__Sensor__Group__2__Impl rule__Sensor__Group__3 ;
    public final void rule__Sensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1325:1: ( rule__Sensor__Group__2__Impl rule__Sensor__Group__3 )
            // InternalThymioDSL.g:1326:2: rule__Sensor__Group__2__Impl rule__Sensor__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Sensor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__2"


    // $ANTLR start "rule__Sensor__Group__2__Impl"
    // InternalThymioDSL.g:1333:1: rule__Sensor__Group__2__Impl : ( ( rule__Sensor__Group_2__0 )? ) ;
    public final void rule__Sensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1337:1: ( ( ( rule__Sensor__Group_2__0 )? ) )
            // InternalThymioDSL.g:1338:1: ( ( rule__Sensor__Group_2__0 )? )
            {
            // InternalThymioDSL.g:1338:1: ( ( rule__Sensor__Group_2__0 )? )
            // InternalThymioDSL.g:1339:2: ( rule__Sensor__Group_2__0 )?
            {
             before(grammarAccess.getSensorAccess().getGroup_2()); 
            // InternalThymioDSL.g:1340:2: ( rule__Sensor__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalThymioDSL.g:1340:3: rule__Sensor__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSensorAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__2__Impl"


    // $ANTLR start "rule__Sensor__Group__3"
    // InternalThymioDSL.g:1348:1: rule__Sensor__Group__3 : rule__Sensor__Group__3__Impl rule__Sensor__Group__4 ;
    public final void rule__Sensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1352:1: ( rule__Sensor__Group__3__Impl rule__Sensor__Group__4 )
            // InternalThymioDSL.g:1353:2: rule__Sensor__Group__3__Impl rule__Sensor__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Sensor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__3"


    // $ANTLR start "rule__Sensor__Group__3__Impl"
    // InternalThymioDSL.g:1360:1: rule__Sensor__Group__3__Impl : ( ( rule__Sensor__Group_3__0 )? ) ;
    public final void rule__Sensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1364:1: ( ( ( rule__Sensor__Group_3__0 )? ) )
            // InternalThymioDSL.g:1365:1: ( ( rule__Sensor__Group_3__0 )? )
            {
            // InternalThymioDSL.g:1365:1: ( ( rule__Sensor__Group_3__0 )? )
            // InternalThymioDSL.g:1366:2: ( rule__Sensor__Group_3__0 )?
            {
             before(grammarAccess.getSensorAccess().getGroup_3()); 
            // InternalThymioDSL.g:1367:2: ( rule__Sensor__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalThymioDSL.g:1367:3: rule__Sensor__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSensorAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__3__Impl"


    // $ANTLR start "rule__Sensor__Group__4"
    // InternalThymioDSL.g:1375:1: rule__Sensor__Group__4 : rule__Sensor__Group__4__Impl rule__Sensor__Group__5 ;
    public final void rule__Sensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1379:1: ( rule__Sensor__Group__4__Impl rule__Sensor__Group__5 )
            // InternalThymioDSL.g:1380:2: rule__Sensor__Group__4__Impl rule__Sensor__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Sensor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__4"


    // $ANTLR start "rule__Sensor__Group__4__Impl"
    // InternalThymioDSL.g:1387:1: rule__Sensor__Group__4__Impl : ( ( rule__Sensor__Group_4__0 )? ) ;
    public final void rule__Sensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1391:1: ( ( ( rule__Sensor__Group_4__0 )? ) )
            // InternalThymioDSL.g:1392:1: ( ( rule__Sensor__Group_4__0 )? )
            {
            // InternalThymioDSL.g:1392:1: ( ( rule__Sensor__Group_4__0 )? )
            // InternalThymioDSL.g:1393:2: ( rule__Sensor__Group_4__0 )?
            {
             before(grammarAccess.getSensorAccess().getGroup_4()); 
            // InternalThymioDSL.g:1394:2: ( rule__Sensor__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalThymioDSL.g:1394:3: rule__Sensor__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSensorAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__4__Impl"


    // $ANTLR start "rule__Sensor__Group__5"
    // InternalThymioDSL.g:1402:1: rule__Sensor__Group__5 : rule__Sensor__Group__5__Impl rule__Sensor__Group__6 ;
    public final void rule__Sensor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1406:1: ( rule__Sensor__Group__5__Impl rule__Sensor__Group__6 )
            // InternalThymioDSL.g:1407:2: rule__Sensor__Group__5__Impl rule__Sensor__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Sensor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__5"


    // $ANTLR start "rule__Sensor__Group__5__Impl"
    // InternalThymioDSL.g:1414:1: rule__Sensor__Group__5__Impl : ( ( rule__Sensor__Group_5__0 )? ) ;
    public final void rule__Sensor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1418:1: ( ( ( rule__Sensor__Group_5__0 )? ) )
            // InternalThymioDSL.g:1419:1: ( ( rule__Sensor__Group_5__0 )? )
            {
            // InternalThymioDSL.g:1419:1: ( ( rule__Sensor__Group_5__0 )? )
            // InternalThymioDSL.g:1420:2: ( rule__Sensor__Group_5__0 )?
            {
             before(grammarAccess.getSensorAccess().getGroup_5()); 
            // InternalThymioDSL.g:1421:2: ( rule__Sensor__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalThymioDSL.g:1421:3: rule__Sensor__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSensorAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__5__Impl"


    // $ANTLR start "rule__Sensor__Group__6"
    // InternalThymioDSL.g:1429:1: rule__Sensor__Group__6 : rule__Sensor__Group__6__Impl rule__Sensor__Group__7 ;
    public final void rule__Sensor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1433:1: ( rule__Sensor__Group__6__Impl rule__Sensor__Group__7 )
            // InternalThymioDSL.g:1434:2: rule__Sensor__Group__6__Impl rule__Sensor__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Sensor__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__6"


    // $ANTLR start "rule__Sensor__Group__6__Impl"
    // InternalThymioDSL.g:1441:1: rule__Sensor__Group__6__Impl : ( ( rule__Sensor__Group_6__0 )? ) ;
    public final void rule__Sensor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1445:1: ( ( ( rule__Sensor__Group_6__0 )? ) )
            // InternalThymioDSL.g:1446:1: ( ( rule__Sensor__Group_6__0 )? )
            {
            // InternalThymioDSL.g:1446:1: ( ( rule__Sensor__Group_6__0 )? )
            // InternalThymioDSL.g:1447:2: ( rule__Sensor__Group_6__0 )?
            {
             before(grammarAccess.getSensorAccess().getGroup_6()); 
            // InternalThymioDSL.g:1448:2: ( rule__Sensor__Group_6__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalThymioDSL.g:1448:3: rule__Sensor__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSensorAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__6__Impl"


    // $ANTLR start "rule__Sensor__Group__7"
    // InternalThymioDSL.g:1456:1: rule__Sensor__Group__7 : rule__Sensor__Group__7__Impl ;
    public final void rule__Sensor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1460:1: ( rule__Sensor__Group__7__Impl )
            // InternalThymioDSL.g:1461:2: rule__Sensor__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__7"


    // $ANTLR start "rule__Sensor__Group__7__Impl"
    // InternalThymioDSL.g:1467:1: rule__Sensor__Group__7__Impl : ( ( rule__Sensor__Group_7__0 )? ) ;
    public final void rule__Sensor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1471:1: ( ( ( rule__Sensor__Group_7__0 )? ) )
            // InternalThymioDSL.g:1472:1: ( ( rule__Sensor__Group_7__0 )? )
            {
            // InternalThymioDSL.g:1472:1: ( ( rule__Sensor__Group_7__0 )? )
            // InternalThymioDSL.g:1473:2: ( rule__Sensor__Group_7__0 )?
            {
             before(grammarAccess.getSensorAccess().getGroup_7()); 
            // InternalThymioDSL.g:1474:2: ( rule__Sensor__Group_7__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalThymioDSL.g:1474:3: rule__Sensor__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSensorAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__7__Impl"


    // $ANTLR start "rule__Sensor__Group_1__0"
    // InternalThymioDSL.g:1483:1: rule__Sensor__Group_1__0 : rule__Sensor__Group_1__0__Impl rule__Sensor__Group_1__1 ;
    public final void rule__Sensor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1487:1: ( rule__Sensor__Group_1__0__Impl rule__Sensor__Group_1__1 )
            // InternalThymioDSL.g:1488:2: rule__Sensor__Group_1__0__Impl rule__Sensor__Group_1__1
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
    // InternalThymioDSL.g:1495:1: rule__Sensor__Group_1__0__Impl : ( 'bottom_left:' ) ;
    public final void rule__Sensor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1499:1: ( ( 'bottom_left:' ) )
            // InternalThymioDSL.g:1500:1: ( 'bottom_left:' )
            {
            // InternalThymioDSL.g:1500:1: ( 'bottom_left:' )
            // InternalThymioDSL.g:1501:2: 'bottom_left:'
            {
             before(grammarAccess.getSensorAccess().getBottom_leftKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getBottom_leftKeyword_1_0()); 

            }


            }

        }
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
    // InternalThymioDSL.g:1510:1: rule__Sensor__Group_1__1 : rule__Sensor__Group_1__1__Impl ;
    public final void rule__Sensor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1514:1: ( rule__Sensor__Group_1__1__Impl )
            // InternalThymioDSL.g:1515:2: rule__Sensor__Group_1__1__Impl
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
    // InternalThymioDSL.g:1521:1: rule__Sensor__Group_1__1__Impl : ( ( rule__Sensor__BottomLeftSensorAssignment_1_1 ) ) ;
    public final void rule__Sensor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1525:1: ( ( ( rule__Sensor__BottomLeftSensorAssignment_1_1 ) ) )
            // InternalThymioDSL.g:1526:1: ( ( rule__Sensor__BottomLeftSensorAssignment_1_1 ) )
            {
            // InternalThymioDSL.g:1526:1: ( ( rule__Sensor__BottomLeftSensorAssignment_1_1 ) )
            // InternalThymioDSL.g:1527:2: ( rule__Sensor__BottomLeftSensorAssignment_1_1 )
            {
             before(grammarAccess.getSensorAccess().getBottomLeftSensorAssignment_1_1()); 
            // InternalThymioDSL.g:1528:2: ( rule__Sensor__BottomLeftSensorAssignment_1_1 )
            // InternalThymioDSL.g:1528:3: rule__Sensor__BottomLeftSensorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__BottomLeftSensorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getBottomLeftSensorAssignment_1_1()); 

            }


            }

        }
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
    // InternalThymioDSL.g:1537:1: rule__Sensor__Group_2__0 : rule__Sensor__Group_2__0__Impl rule__Sensor__Group_2__1 ;
    public final void rule__Sensor__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1541:1: ( rule__Sensor__Group_2__0__Impl rule__Sensor__Group_2__1 )
            // InternalThymioDSL.g:1542:2: rule__Sensor__Group_2__0__Impl rule__Sensor__Group_2__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalThymioDSL.g:1549:1: rule__Sensor__Group_2__0__Impl : ( 'bottom_right:' ) ;
    public final void rule__Sensor__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1553:1: ( ( 'bottom_right:' ) )
            // InternalThymioDSL.g:1554:1: ( 'bottom_right:' )
            {
            // InternalThymioDSL.g:1554:1: ( 'bottom_right:' )
            // InternalThymioDSL.g:1555:2: 'bottom_right:'
            {
             before(grammarAccess.getSensorAccess().getBottom_rightKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getBottom_rightKeyword_2_0()); 

            }


            }

        }
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
    // InternalThymioDSL.g:1564:1: rule__Sensor__Group_2__1 : rule__Sensor__Group_2__1__Impl ;
    public final void rule__Sensor__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1568:1: ( rule__Sensor__Group_2__1__Impl )
            // InternalThymioDSL.g:1569:2: rule__Sensor__Group_2__1__Impl
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
    // InternalThymioDSL.g:1575:1: rule__Sensor__Group_2__1__Impl : ( ( rule__Sensor__BottomRightSensorAssignment_2_1 ) ) ;
    public final void rule__Sensor__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1579:1: ( ( ( rule__Sensor__BottomRightSensorAssignment_2_1 ) ) )
            // InternalThymioDSL.g:1580:1: ( ( rule__Sensor__BottomRightSensorAssignment_2_1 ) )
            {
            // InternalThymioDSL.g:1580:1: ( ( rule__Sensor__BottomRightSensorAssignment_2_1 ) )
            // InternalThymioDSL.g:1581:2: ( rule__Sensor__BottomRightSensorAssignment_2_1 )
            {
             before(grammarAccess.getSensorAccess().getBottomRightSensorAssignment_2_1()); 
            // InternalThymioDSL.g:1582:2: ( rule__Sensor__BottomRightSensorAssignment_2_1 )
            // InternalThymioDSL.g:1582:3: rule__Sensor__BottomRightSensorAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__BottomRightSensorAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getBottomRightSensorAssignment_2_1()); 

            }


            }

        }
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
    // InternalThymioDSL.g:1591:1: rule__Sensor__Group_3__0 : rule__Sensor__Group_3__0__Impl rule__Sensor__Group_3__1 ;
    public final void rule__Sensor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1595:1: ( rule__Sensor__Group_3__0__Impl rule__Sensor__Group_3__1 )
            // InternalThymioDSL.g:1596:2: rule__Sensor__Group_3__0__Impl rule__Sensor__Group_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalThymioDSL.g:1603:1: rule__Sensor__Group_3__0__Impl : ( 'northwest:' ) ;
    public final void rule__Sensor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1607:1: ( ( 'northwest:' ) )
            // InternalThymioDSL.g:1608:1: ( 'northwest:' )
            {
            // InternalThymioDSL.g:1608:1: ( 'northwest:' )
            // InternalThymioDSL.g:1609:2: 'northwest:'
            {
             before(grammarAccess.getSensorAccess().getNorthwestKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getNorthwestKeyword_3_0()); 

            }


            }

        }
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
    // InternalThymioDSL.g:1618:1: rule__Sensor__Group_3__1 : rule__Sensor__Group_3__1__Impl ;
    public final void rule__Sensor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1622:1: ( rule__Sensor__Group_3__1__Impl )
            // InternalThymioDSL.g:1623:2: rule__Sensor__Group_3__1__Impl
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
    // InternalThymioDSL.g:1629:1: rule__Sensor__Group_3__1__Impl : ( ( rule__Sensor__NorthWestAssignment_3_1 ) ) ;
    public final void rule__Sensor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1633:1: ( ( ( rule__Sensor__NorthWestAssignment_3_1 ) ) )
            // InternalThymioDSL.g:1634:1: ( ( rule__Sensor__NorthWestAssignment_3_1 ) )
            {
            // InternalThymioDSL.g:1634:1: ( ( rule__Sensor__NorthWestAssignment_3_1 ) )
            // InternalThymioDSL.g:1635:2: ( rule__Sensor__NorthWestAssignment_3_1 )
            {
             before(grammarAccess.getSensorAccess().getNorthWestAssignment_3_1()); 
            // InternalThymioDSL.g:1636:2: ( rule__Sensor__NorthWestAssignment_3_1 )
            // InternalThymioDSL.g:1636:3: rule__Sensor__NorthWestAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__NorthWestAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getNorthWestAssignment_3_1()); 

            }


            }

        }
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
    // InternalThymioDSL.g:1645:1: rule__Sensor__Group_4__0 : rule__Sensor__Group_4__0__Impl rule__Sensor__Group_4__1 ;
    public final void rule__Sensor__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1649:1: ( rule__Sensor__Group_4__0__Impl rule__Sensor__Group_4__1 )
            // InternalThymioDSL.g:1650:2: rule__Sensor__Group_4__0__Impl rule__Sensor__Group_4__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalThymioDSL.g:1657:1: rule__Sensor__Group_4__0__Impl : ( 'northnorthwest:' ) ;
    public final void rule__Sensor__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1661:1: ( ( 'northnorthwest:' ) )
            // InternalThymioDSL.g:1662:1: ( 'northnorthwest:' )
            {
            // InternalThymioDSL.g:1662:1: ( 'northnorthwest:' )
            // InternalThymioDSL.g:1663:2: 'northnorthwest:'
            {
             before(grammarAccess.getSensorAccess().getNorthnorthwestKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getNorthnorthwestKeyword_4_0()); 

            }


            }

        }
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
    // InternalThymioDSL.g:1672:1: rule__Sensor__Group_4__1 : rule__Sensor__Group_4__1__Impl ;
    public final void rule__Sensor__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1676:1: ( rule__Sensor__Group_4__1__Impl )
            // InternalThymioDSL.g:1677:2: rule__Sensor__Group_4__1__Impl
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
    // InternalThymioDSL.g:1683:1: rule__Sensor__Group_4__1__Impl : ( ( rule__Sensor__NorthNorthWestAssignment_4_1 ) ) ;
    public final void rule__Sensor__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1687:1: ( ( ( rule__Sensor__NorthNorthWestAssignment_4_1 ) ) )
            // InternalThymioDSL.g:1688:1: ( ( rule__Sensor__NorthNorthWestAssignment_4_1 ) )
            {
            // InternalThymioDSL.g:1688:1: ( ( rule__Sensor__NorthNorthWestAssignment_4_1 ) )
            // InternalThymioDSL.g:1689:2: ( rule__Sensor__NorthNorthWestAssignment_4_1 )
            {
             before(grammarAccess.getSensorAccess().getNorthNorthWestAssignment_4_1()); 
            // InternalThymioDSL.g:1690:2: ( rule__Sensor__NorthNorthWestAssignment_4_1 )
            // InternalThymioDSL.g:1690:3: rule__Sensor__NorthNorthWestAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__NorthNorthWestAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getNorthNorthWestAssignment_4_1()); 

            }


            }

        }
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
    // InternalThymioDSL.g:1699:1: rule__Sensor__Group_5__0 : rule__Sensor__Group_5__0__Impl rule__Sensor__Group_5__1 ;
    public final void rule__Sensor__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1703:1: ( rule__Sensor__Group_5__0__Impl rule__Sensor__Group_5__1 )
            // InternalThymioDSL.g:1704:2: rule__Sensor__Group_5__0__Impl rule__Sensor__Group_5__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalThymioDSL.g:1711:1: rule__Sensor__Group_5__0__Impl : ( 'north:' ) ;
    public final void rule__Sensor__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1715:1: ( ( 'north:' ) )
            // InternalThymioDSL.g:1716:1: ( 'north:' )
            {
            // InternalThymioDSL.g:1716:1: ( 'north:' )
            // InternalThymioDSL.g:1717:2: 'north:'
            {
             before(grammarAccess.getSensorAccess().getNorthKeyword_5_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getNorthKeyword_5_0()); 

            }


            }

        }
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
    // InternalThymioDSL.g:1726:1: rule__Sensor__Group_5__1 : rule__Sensor__Group_5__1__Impl ;
    public final void rule__Sensor__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1730:1: ( rule__Sensor__Group_5__1__Impl )
            // InternalThymioDSL.g:1731:2: rule__Sensor__Group_5__1__Impl
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
    // InternalThymioDSL.g:1737:1: rule__Sensor__Group_5__1__Impl : ( ( rule__Sensor__NorthAssignment_5_1 ) ) ;
    public final void rule__Sensor__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1741:1: ( ( ( rule__Sensor__NorthAssignment_5_1 ) ) )
            // InternalThymioDSL.g:1742:1: ( ( rule__Sensor__NorthAssignment_5_1 ) )
            {
            // InternalThymioDSL.g:1742:1: ( ( rule__Sensor__NorthAssignment_5_1 ) )
            // InternalThymioDSL.g:1743:2: ( rule__Sensor__NorthAssignment_5_1 )
            {
             before(grammarAccess.getSensorAccess().getNorthAssignment_5_1()); 
            // InternalThymioDSL.g:1744:2: ( rule__Sensor__NorthAssignment_5_1 )
            // InternalThymioDSL.g:1744:3: rule__Sensor__NorthAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__NorthAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getNorthAssignment_5_1()); 

            }


            }

        }
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
    // InternalThymioDSL.g:1753:1: rule__Sensor__Group_6__0 : rule__Sensor__Group_6__0__Impl rule__Sensor__Group_6__1 ;
    public final void rule__Sensor__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1757:1: ( rule__Sensor__Group_6__0__Impl rule__Sensor__Group_6__1 )
            // InternalThymioDSL.g:1758:2: rule__Sensor__Group_6__0__Impl rule__Sensor__Group_6__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalThymioDSL.g:1765:1: rule__Sensor__Group_6__0__Impl : ( 'northnortheast:' ) ;
    public final void rule__Sensor__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1769:1: ( ( 'northnortheast:' ) )
            // InternalThymioDSL.g:1770:1: ( 'northnortheast:' )
            {
            // InternalThymioDSL.g:1770:1: ( 'northnortheast:' )
            // InternalThymioDSL.g:1771:2: 'northnortheast:'
            {
             before(grammarAccess.getSensorAccess().getNorthnortheastKeyword_6_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getNorthnortheastKeyword_6_0()); 

            }


            }

        }
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
    // InternalThymioDSL.g:1780:1: rule__Sensor__Group_6__1 : rule__Sensor__Group_6__1__Impl ;
    public final void rule__Sensor__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1784:1: ( rule__Sensor__Group_6__1__Impl )
            // InternalThymioDSL.g:1785:2: rule__Sensor__Group_6__1__Impl
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
    // InternalThymioDSL.g:1791:1: rule__Sensor__Group_6__1__Impl : ( ( rule__Sensor__NorthNorthEastAssignment_6_1 ) ) ;
    public final void rule__Sensor__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1795:1: ( ( ( rule__Sensor__NorthNorthEastAssignment_6_1 ) ) )
            // InternalThymioDSL.g:1796:1: ( ( rule__Sensor__NorthNorthEastAssignment_6_1 ) )
            {
            // InternalThymioDSL.g:1796:1: ( ( rule__Sensor__NorthNorthEastAssignment_6_1 ) )
            // InternalThymioDSL.g:1797:2: ( rule__Sensor__NorthNorthEastAssignment_6_1 )
            {
             before(grammarAccess.getSensorAccess().getNorthNorthEastAssignment_6_1()); 
            // InternalThymioDSL.g:1798:2: ( rule__Sensor__NorthNorthEastAssignment_6_1 )
            // InternalThymioDSL.g:1798:3: rule__Sensor__NorthNorthEastAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__NorthNorthEastAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getNorthNorthEastAssignment_6_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Sensor__Group_7__0"
    // InternalThymioDSL.g:1807:1: rule__Sensor__Group_7__0 : rule__Sensor__Group_7__0__Impl rule__Sensor__Group_7__1 ;
    public final void rule__Sensor__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1811:1: ( rule__Sensor__Group_7__0__Impl rule__Sensor__Group_7__1 )
            // InternalThymioDSL.g:1812:2: rule__Sensor__Group_7__0__Impl rule__Sensor__Group_7__1
            {
            pushFollow(FOLLOW_15);
            rule__Sensor__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_7__0"


    // $ANTLR start "rule__Sensor__Group_7__0__Impl"
    // InternalThymioDSL.g:1819:1: rule__Sensor__Group_7__0__Impl : ( 'northeast:' ) ;
    public final void rule__Sensor__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1823:1: ( ( 'northeast:' ) )
            // InternalThymioDSL.g:1824:1: ( 'northeast:' )
            {
            // InternalThymioDSL.g:1824:1: ( 'northeast:' )
            // InternalThymioDSL.g:1825:2: 'northeast:'
            {
             before(grammarAccess.getSensorAccess().getNortheastKeyword_7_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getNortheastKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_7__0__Impl"


    // $ANTLR start "rule__Sensor__Group_7__1"
    // InternalThymioDSL.g:1834:1: rule__Sensor__Group_7__1 : rule__Sensor__Group_7__1__Impl ;
    public final void rule__Sensor__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1838:1: ( rule__Sensor__Group_7__1__Impl )
            // InternalThymioDSL.g:1839:2: rule__Sensor__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_7__1"


    // $ANTLR start "rule__Sensor__Group_7__1__Impl"
    // InternalThymioDSL.g:1845:1: rule__Sensor__Group_7__1__Impl : ( ( rule__Sensor__NorthEastAssignment_7_1 ) ) ;
    public final void rule__Sensor__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1849:1: ( ( ( rule__Sensor__NorthEastAssignment_7_1 ) ) )
            // InternalThymioDSL.g:1850:1: ( ( rule__Sensor__NorthEastAssignment_7_1 ) )
            {
            // InternalThymioDSL.g:1850:1: ( ( rule__Sensor__NorthEastAssignment_7_1 ) )
            // InternalThymioDSL.g:1851:2: ( rule__Sensor__NorthEastAssignment_7_1 )
            {
             before(grammarAccess.getSensorAccess().getNorthEastAssignment_7_1()); 
            // InternalThymioDSL.g:1852:2: ( rule__Sensor__NorthEastAssignment_7_1 )
            // InternalThymioDSL.g:1852:3: rule__Sensor__NorthEastAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__NorthEastAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getNorthEastAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_7__1__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalThymioDSL.g:1861:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1865:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalThymioDSL.g:1866:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalThymioDSL.g:1873:1: rule__Action__Group__0__Impl : ( 'move:' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1877:1: ( ( 'move:' ) )
            // InternalThymioDSL.g:1878:1: ( 'move:' )
            {
            // InternalThymioDSL.g:1878:1: ( 'move:' )
            // InternalThymioDSL.g:1879:2: 'move:'
            {
             before(grammarAccess.getActionAccess().getMoveKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getMoveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalThymioDSL.g:1888:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1892:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalThymioDSL.g:1893:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalThymioDSL.g:1900:1: rule__Action__Group__1__Impl : ( ( rule__Action__MoveAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1904:1: ( ( ( rule__Action__MoveAssignment_1 ) ) )
            // InternalThymioDSL.g:1905:1: ( ( rule__Action__MoveAssignment_1 ) )
            {
            // InternalThymioDSL.g:1905:1: ( ( rule__Action__MoveAssignment_1 ) )
            // InternalThymioDSL.g:1906:2: ( rule__Action__MoveAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getMoveAssignment_1()); 
            // InternalThymioDSL.g:1907:2: ( rule__Action__MoveAssignment_1 )
            // InternalThymioDSL.g:1907:3: rule__Action__MoveAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__MoveAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getMoveAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // InternalThymioDSL.g:1915:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1919:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // InternalThymioDSL.g:1920:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Action__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // InternalThymioDSL.g:1927:1: rule__Action__Group__2__Impl : ( 'toplight:' ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1931:1: ( ( 'toplight:' ) )
            // InternalThymioDSL.g:1932:1: ( 'toplight:' )
            {
            // InternalThymioDSL.g:1932:1: ( 'toplight:' )
            // InternalThymioDSL.g:1933:2: 'toplight:'
            {
             before(grammarAccess.getActionAccess().getToplightKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getToplightKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__Action__Group__3"
    // InternalThymioDSL.g:1942:1: rule__Action__Group__3 : rule__Action__Group__3__Impl rule__Action__Group__4 ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1946:1: ( rule__Action__Group__3__Impl rule__Action__Group__4 )
            // InternalThymioDSL.g:1947:2: rule__Action__Group__3__Impl rule__Action__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Action__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3"


    // $ANTLR start "rule__Action__Group__3__Impl"
    // InternalThymioDSL.g:1954:1: rule__Action__Group__3__Impl : ( ( rule__Action__TopLightAssignment_3 ) ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1958:1: ( ( ( rule__Action__TopLightAssignment_3 ) ) )
            // InternalThymioDSL.g:1959:1: ( ( rule__Action__TopLightAssignment_3 ) )
            {
            // InternalThymioDSL.g:1959:1: ( ( rule__Action__TopLightAssignment_3 ) )
            // InternalThymioDSL.g:1960:2: ( rule__Action__TopLightAssignment_3 )
            {
             before(grammarAccess.getActionAccess().getTopLightAssignment_3()); 
            // InternalThymioDSL.g:1961:2: ( rule__Action__TopLightAssignment_3 )
            // InternalThymioDSL.g:1961:3: rule__Action__TopLightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Action__TopLightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getTopLightAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3__Impl"


    // $ANTLR start "rule__Action__Group__4"
    // InternalThymioDSL.g:1969:1: rule__Action__Group__4 : rule__Action__Group__4__Impl rule__Action__Group__5 ;
    public final void rule__Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1973:1: ( rule__Action__Group__4__Impl rule__Action__Group__5 )
            // InternalThymioDSL.g:1974:2: rule__Action__Group__4__Impl rule__Action__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Action__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4"


    // $ANTLR start "rule__Action__Group__4__Impl"
    // InternalThymioDSL.g:1981:1: rule__Action__Group__4__Impl : ( 'bottomlight:' ) ;
    public final void rule__Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:1985:1: ( ( 'bottomlight:' ) )
            // InternalThymioDSL.g:1986:1: ( 'bottomlight:' )
            {
            // InternalThymioDSL.g:1986:1: ( 'bottomlight:' )
            // InternalThymioDSL.g:1987:2: 'bottomlight:'
            {
             before(grammarAccess.getActionAccess().getBottomlightKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getBottomlightKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__4__Impl"


    // $ANTLR start "rule__Action__Group__5"
    // InternalThymioDSL.g:1996:1: rule__Action__Group__5 : rule__Action__Group__5__Impl rule__Action__Group__6 ;
    public final void rule__Action__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2000:1: ( rule__Action__Group__5__Impl rule__Action__Group__6 )
            // InternalThymioDSL.g:2001:2: rule__Action__Group__5__Impl rule__Action__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Action__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__5"


    // $ANTLR start "rule__Action__Group__5__Impl"
    // InternalThymioDSL.g:2008:1: rule__Action__Group__5__Impl : ( ( rule__Action__BottomLightAssignment_5 ) ) ;
    public final void rule__Action__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2012:1: ( ( ( rule__Action__BottomLightAssignment_5 ) ) )
            // InternalThymioDSL.g:2013:1: ( ( rule__Action__BottomLightAssignment_5 ) )
            {
            // InternalThymioDSL.g:2013:1: ( ( rule__Action__BottomLightAssignment_5 ) )
            // InternalThymioDSL.g:2014:2: ( rule__Action__BottomLightAssignment_5 )
            {
             before(grammarAccess.getActionAccess().getBottomLightAssignment_5()); 
            // InternalThymioDSL.g:2015:2: ( rule__Action__BottomLightAssignment_5 )
            // InternalThymioDSL.g:2015:3: rule__Action__BottomLightAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Action__BottomLightAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getBottomLightAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__5__Impl"


    // $ANTLR start "rule__Action__Group__6"
    // InternalThymioDSL.g:2023:1: rule__Action__Group__6 : rule__Action__Group__6__Impl rule__Action__Group__7 ;
    public final void rule__Action__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2027:1: ( rule__Action__Group__6__Impl rule__Action__Group__7 )
            // InternalThymioDSL.g:2028:2: rule__Action__Group__6__Impl rule__Action__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__Action__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__6"


    // $ANTLR start "rule__Action__Group__6__Impl"
    // InternalThymioDSL.g:2035:1: rule__Action__Group__6__Impl : ( 'sound:' ) ;
    public final void rule__Action__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2039:1: ( ( 'sound:' ) )
            // InternalThymioDSL.g:2040:1: ( 'sound:' )
            {
            // InternalThymioDSL.g:2040:1: ( 'sound:' )
            // InternalThymioDSL.g:2041:2: 'sound:'
            {
             before(grammarAccess.getActionAccess().getSoundKeyword_6()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getSoundKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__6__Impl"


    // $ANTLR start "rule__Action__Group__7"
    // InternalThymioDSL.g:2050:1: rule__Action__Group__7 : rule__Action__Group__7__Impl ;
    public final void rule__Action__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2054:1: ( rule__Action__Group__7__Impl )
            // InternalThymioDSL.g:2055:2: rule__Action__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__7"


    // $ANTLR start "rule__Action__Group__7__Impl"
    // InternalThymioDSL.g:2061:1: rule__Action__Group__7__Impl : ( ( rule__Action__SoundAssignment_7 ) ) ;
    public final void rule__Action__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2065:1: ( ( ( rule__Action__SoundAssignment_7 ) ) )
            // InternalThymioDSL.g:2066:1: ( ( rule__Action__SoundAssignment_7 ) )
            {
            // InternalThymioDSL.g:2066:1: ( ( rule__Action__SoundAssignment_7 ) )
            // InternalThymioDSL.g:2067:2: ( rule__Action__SoundAssignment_7 )
            {
             before(grammarAccess.getActionAccess().getSoundAssignment_7()); 
            // InternalThymioDSL.g:2068:2: ( rule__Action__SoundAssignment_7 )
            // InternalThymioDSL.g:2068:3: rule__Action__SoundAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Action__SoundAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getSoundAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__7__Impl"


    // $ANTLR start "rule__Motor__Group__0"
    // InternalThymioDSL.g:2077:1: rule__Motor__Group__0 : rule__Motor__Group__0__Impl rule__Motor__Group__1 ;
    public final void rule__Motor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2081:1: ( rule__Motor__Group__0__Impl rule__Motor__Group__1 )
            // InternalThymioDSL.g:2082:2: rule__Motor__Group__0__Impl rule__Motor__Group__1
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
    // InternalThymioDSL.g:2089:1: rule__Motor__Group__0__Impl : ( 'motors:' ) ;
    public final void rule__Motor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2093:1: ( ( 'motors:' ) )
            // InternalThymioDSL.g:2094:1: ( 'motors:' )
            {
            // InternalThymioDSL.g:2094:1: ( 'motors:' )
            // InternalThymioDSL.g:2095:2: 'motors:'
            {
             before(grammarAccess.getMotorAccess().getMotorsKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalThymioDSL.g:2104:1: rule__Motor__Group__1 : rule__Motor__Group__1__Impl rule__Motor__Group__2 ;
    public final void rule__Motor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2108:1: ( rule__Motor__Group__1__Impl rule__Motor__Group__2 )
            // InternalThymioDSL.g:2109:2: rule__Motor__Group__1__Impl rule__Motor__Group__2
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
    // InternalThymioDSL.g:2116:1: rule__Motor__Group__1__Impl : ( 'left:' ) ;
    public final void rule__Motor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2120:1: ( ( 'left:' ) )
            // InternalThymioDSL.g:2121:1: ( 'left:' )
            {
            // InternalThymioDSL.g:2121:1: ( 'left:' )
            // InternalThymioDSL.g:2122:2: 'left:'
            {
             before(grammarAccess.getMotorAccess().getLeftKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalThymioDSL.g:2131:1: rule__Motor__Group__2 : rule__Motor__Group__2__Impl rule__Motor__Group__3 ;
    public final void rule__Motor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2135:1: ( rule__Motor__Group__2__Impl rule__Motor__Group__3 )
            // InternalThymioDSL.g:2136:2: rule__Motor__Group__2__Impl rule__Motor__Group__3
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
    // InternalThymioDSL.g:2143:1: rule__Motor__Group__2__Impl : ( ( rule__Motor__LeftAssignment_2 ) ) ;
    public final void rule__Motor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2147:1: ( ( ( rule__Motor__LeftAssignment_2 ) ) )
            // InternalThymioDSL.g:2148:1: ( ( rule__Motor__LeftAssignment_2 ) )
            {
            // InternalThymioDSL.g:2148:1: ( ( rule__Motor__LeftAssignment_2 ) )
            // InternalThymioDSL.g:2149:2: ( rule__Motor__LeftAssignment_2 )
            {
             before(grammarAccess.getMotorAccess().getLeftAssignment_2()); 
            // InternalThymioDSL.g:2150:2: ( rule__Motor__LeftAssignment_2 )
            // InternalThymioDSL.g:2150:3: rule__Motor__LeftAssignment_2
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
    // InternalThymioDSL.g:2158:1: rule__Motor__Group__3 : rule__Motor__Group__3__Impl rule__Motor__Group__4 ;
    public final void rule__Motor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2162:1: ( rule__Motor__Group__3__Impl rule__Motor__Group__4 )
            // InternalThymioDSL.g:2163:2: rule__Motor__Group__3__Impl rule__Motor__Group__4
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
    // InternalThymioDSL.g:2170:1: rule__Motor__Group__3__Impl : ( 'right:' ) ;
    public final void rule__Motor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2174:1: ( ( 'right:' ) )
            // InternalThymioDSL.g:2175:1: ( 'right:' )
            {
            // InternalThymioDSL.g:2175:1: ( 'right:' )
            // InternalThymioDSL.g:2176:2: 'right:'
            {
             before(grammarAccess.getMotorAccess().getRightKeyword_3()); 
            match(input,46,FOLLOW_2); 
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
    // InternalThymioDSL.g:2185:1: rule__Motor__Group__4 : rule__Motor__Group__4__Impl ;
    public final void rule__Motor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2189:1: ( rule__Motor__Group__4__Impl )
            // InternalThymioDSL.g:2190:2: rule__Motor__Group__4__Impl
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
    // InternalThymioDSL.g:2196:1: rule__Motor__Group__4__Impl : ( ( rule__Motor__RightAssignment_4 ) ) ;
    public final void rule__Motor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2200:1: ( ( ( rule__Motor__RightAssignment_4 ) ) )
            // InternalThymioDSL.g:2201:1: ( ( rule__Motor__RightAssignment_4 ) )
            {
            // InternalThymioDSL.g:2201:1: ( ( rule__Motor__RightAssignment_4 ) )
            // InternalThymioDSL.g:2202:2: ( rule__Motor__RightAssignment_4 )
            {
             before(grammarAccess.getMotorAccess().getRightAssignment_4()); 
            // InternalThymioDSL.g:2203:2: ( rule__Motor__RightAssignment_4 )
            // InternalThymioDSL.g:2203:3: rule__Motor__RightAssignment_4
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
    // InternalThymioDSL.g:2212:1: rule__Sound__Group__0 : rule__Sound__Group__0__Impl rule__Sound__Group__1 ;
    public final void rule__Sound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2216:1: ( rule__Sound__Group__0__Impl rule__Sound__Group__1 )
            // InternalThymioDSL.g:2217:2: rule__Sound__Group__0__Impl rule__Sound__Group__1
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
    // InternalThymioDSL.g:2224:1: rule__Sound__Group__0__Impl : ( 'Note' ) ;
    public final void rule__Sound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2228:1: ( ( 'Note' ) )
            // InternalThymioDSL.g:2229:1: ( 'Note' )
            {
            // InternalThymioDSL.g:2229:1: ( 'Note' )
            // InternalThymioDSL.g:2230:2: 'Note'
            {
             before(grammarAccess.getSoundAccess().getNoteKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalThymioDSL.g:2239:1: rule__Sound__Group__1 : rule__Sound__Group__1__Impl rule__Sound__Group__2 ;
    public final void rule__Sound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2243:1: ( rule__Sound__Group__1__Impl rule__Sound__Group__2 )
            // InternalThymioDSL.g:2244:2: rule__Sound__Group__1__Impl rule__Sound__Group__2
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
    // InternalThymioDSL.g:2251:1: rule__Sound__Group__1__Impl : ( ( rule__Sound__PitchAssignment_1 ) ) ;
    public final void rule__Sound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2255:1: ( ( ( rule__Sound__PitchAssignment_1 ) ) )
            // InternalThymioDSL.g:2256:1: ( ( rule__Sound__PitchAssignment_1 ) )
            {
            // InternalThymioDSL.g:2256:1: ( ( rule__Sound__PitchAssignment_1 ) )
            // InternalThymioDSL.g:2257:2: ( rule__Sound__PitchAssignment_1 )
            {
             before(grammarAccess.getSoundAccess().getPitchAssignment_1()); 
            // InternalThymioDSL.g:2258:2: ( rule__Sound__PitchAssignment_1 )
            // InternalThymioDSL.g:2258:3: rule__Sound__PitchAssignment_1
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
    // InternalThymioDSL.g:2266:1: rule__Sound__Group__2 : rule__Sound__Group__2__Impl rule__Sound__Group__3 ;
    public final void rule__Sound__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2270:1: ( rule__Sound__Group__2__Impl rule__Sound__Group__3 )
            // InternalThymioDSL.g:2271:2: rule__Sound__Group__2__Impl rule__Sound__Group__3
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
    // InternalThymioDSL.g:2278:1: rule__Sound__Group__2__Impl : ( ( rule__Sound__DurationAssignment_2 ) ) ;
    public final void rule__Sound__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2282:1: ( ( ( rule__Sound__DurationAssignment_2 ) ) )
            // InternalThymioDSL.g:2283:1: ( ( rule__Sound__DurationAssignment_2 ) )
            {
            // InternalThymioDSL.g:2283:1: ( ( rule__Sound__DurationAssignment_2 ) )
            // InternalThymioDSL.g:2284:2: ( rule__Sound__DurationAssignment_2 )
            {
             before(grammarAccess.getSoundAccess().getDurationAssignment_2()); 
            // InternalThymioDSL.g:2285:2: ( rule__Sound__DurationAssignment_2 )
            // InternalThymioDSL.g:2285:3: rule__Sound__DurationAssignment_2
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
    // InternalThymioDSL.g:2293:1: rule__Sound__Group__3 : rule__Sound__Group__3__Impl ;
    public final void rule__Sound__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2297:1: ( rule__Sound__Group__3__Impl )
            // InternalThymioDSL.g:2298:2: rule__Sound__Group__3__Impl
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
    // InternalThymioDSL.g:2304:1: rule__Sound__Group__3__Impl : ( ( rule__Sound__Group_3__0 )* ) ;
    public final void rule__Sound__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2308:1: ( ( ( rule__Sound__Group_3__0 )* ) )
            // InternalThymioDSL.g:2309:1: ( ( rule__Sound__Group_3__0 )* )
            {
            // InternalThymioDSL.g:2309:1: ( ( rule__Sound__Group_3__0 )* )
            // InternalThymioDSL.g:2310:2: ( rule__Sound__Group_3__0 )*
            {
             before(grammarAccess.getSoundAccess().getGroup_3()); 
            // InternalThymioDSL.g:2311:2: ( rule__Sound__Group_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==47) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalThymioDSL.g:2311:3: rule__Sound__Group_3__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Sound__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalThymioDSL.g:2320:1: rule__Sound__Group_3__0 : rule__Sound__Group_3__0__Impl rule__Sound__Group_3__1 ;
    public final void rule__Sound__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2324:1: ( rule__Sound__Group_3__0__Impl rule__Sound__Group_3__1 )
            // InternalThymioDSL.g:2325:2: rule__Sound__Group_3__0__Impl rule__Sound__Group_3__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalThymioDSL.g:2332:1: rule__Sound__Group_3__0__Impl : ( 'Note' ) ;
    public final void rule__Sound__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2336:1: ( ( 'Note' ) )
            // InternalThymioDSL.g:2337:1: ( 'Note' )
            {
            // InternalThymioDSL.g:2337:1: ( 'Note' )
            // InternalThymioDSL.g:2338:2: 'Note'
            {
             before(grammarAccess.getSoundAccess().getNoteKeyword_3_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalThymioDSL.g:2347:1: rule__Sound__Group_3__1 : rule__Sound__Group_3__1__Impl rule__Sound__Group_3__2 ;
    public final void rule__Sound__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2351:1: ( rule__Sound__Group_3__1__Impl rule__Sound__Group_3__2 )
            // InternalThymioDSL.g:2352:2: rule__Sound__Group_3__1__Impl rule__Sound__Group_3__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalThymioDSL.g:2359:1: rule__Sound__Group_3__1__Impl : ( 'Pitch:' ) ;
    public final void rule__Sound__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2363:1: ( ( 'Pitch:' ) )
            // InternalThymioDSL.g:2364:1: ( 'Pitch:' )
            {
            // InternalThymioDSL.g:2364:1: ( 'Pitch:' )
            // InternalThymioDSL.g:2365:2: 'Pitch:'
            {
             before(grammarAccess.getSoundAccess().getPitchKeyword_3_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getSoundAccess().getPitchKeyword_3_1()); 

            }


            }

        }
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
    // InternalThymioDSL.g:2374:1: rule__Sound__Group_3__2 : rule__Sound__Group_3__2__Impl rule__Sound__Group_3__3 ;
    public final void rule__Sound__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2378:1: ( rule__Sound__Group_3__2__Impl rule__Sound__Group_3__3 )
            // InternalThymioDSL.g:2379:2: rule__Sound__Group_3__2__Impl rule__Sound__Group_3__3
            {
            pushFollow(FOLLOW_25);
            rule__Sound__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sound__Group_3__3();

            state._fsp--;


            }

        }
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
    // InternalThymioDSL.g:2386:1: rule__Sound__Group_3__2__Impl : ( ( rule__Sound__PitchAssignment_3_2 ) ) ;
    public final void rule__Sound__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2390:1: ( ( ( rule__Sound__PitchAssignment_3_2 ) ) )
            // InternalThymioDSL.g:2391:1: ( ( rule__Sound__PitchAssignment_3_2 ) )
            {
            // InternalThymioDSL.g:2391:1: ( ( rule__Sound__PitchAssignment_3_2 ) )
            // InternalThymioDSL.g:2392:2: ( rule__Sound__PitchAssignment_3_2 )
            {
             before(grammarAccess.getSoundAccess().getPitchAssignment_3_2()); 
            // InternalThymioDSL.g:2393:2: ( rule__Sound__PitchAssignment_3_2 )
            // InternalThymioDSL.g:2393:3: rule__Sound__PitchAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Sound__PitchAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getSoundAccess().getPitchAssignment_3_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Sound__Group_3__3"
    // InternalThymioDSL.g:2401:1: rule__Sound__Group_3__3 : rule__Sound__Group_3__3__Impl ;
    public final void rule__Sound__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2405:1: ( rule__Sound__Group_3__3__Impl )
            // InternalThymioDSL.g:2406:2: rule__Sound__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sound__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__Group_3__3"


    // $ANTLR start "rule__Sound__Group_3__3__Impl"
    // InternalThymioDSL.g:2412:1: rule__Sound__Group_3__3__Impl : ( ( rule__Sound__DurationAssignment_3_3 ) ) ;
    public final void rule__Sound__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2416:1: ( ( ( rule__Sound__DurationAssignment_3_3 ) ) )
            // InternalThymioDSL.g:2417:1: ( ( rule__Sound__DurationAssignment_3_3 ) )
            {
            // InternalThymioDSL.g:2417:1: ( ( rule__Sound__DurationAssignment_3_3 ) )
            // InternalThymioDSL.g:2418:2: ( rule__Sound__DurationAssignment_3_3 )
            {
             before(grammarAccess.getSoundAccess().getDurationAssignment_3_3()); 
            // InternalThymioDSL.g:2419:2: ( rule__Sound__DurationAssignment_3_3 )
            // InternalThymioDSL.g:2419:3: rule__Sound__DurationAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__Sound__DurationAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getSoundAccess().getDurationAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__Group_3__3__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalThymioDSL.g:2428:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2432:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalThymioDSL.g:2433:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalThymioDSL.g:2440:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2444:1: ( ( ( '-' )? ) )
            // InternalThymioDSL.g:2445:1: ( ( '-' )? )
            {
            // InternalThymioDSL.g:2445:1: ( ( '-' )? )
            // InternalThymioDSL.g:2446:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalThymioDSL.g:2447:2: ( '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==49) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalThymioDSL.g:2447:3: '-'
                    {
                    match(input,49,FOLLOW_2); 

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
    // InternalThymioDSL.g:2455:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2459:1: ( rule__EInt__Group__1__Impl )
            // InternalThymioDSL.g:2460:2: rule__EInt__Group__1__Impl
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
    // InternalThymioDSL.g:2466:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2470:1: ( ( RULE_INT ) )
            // InternalThymioDSL.g:2471:1: ( RULE_INT )
            {
            // InternalThymioDSL.g:2471:1: ( RULE_INT )
            // InternalThymioDSL.g:2472:2: RULE_INT
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
    // InternalThymioDSL.g:2482:1: rule__OnOff__Group_0__0 : rule__OnOff__Group_0__0__Impl rule__OnOff__Group_0__1 ;
    public final void rule__OnOff__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2486:1: ( rule__OnOff__Group_0__0__Impl rule__OnOff__Group_0__1 )
            // InternalThymioDSL.g:2487:2: rule__OnOff__Group_0__0__Impl rule__OnOff__Group_0__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalThymioDSL.g:2494:1: rule__OnOff__Group_0__0__Impl : ( 'on' ) ;
    public final void rule__OnOff__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2498:1: ( ( 'on' ) )
            // InternalThymioDSL.g:2499:1: ( 'on' )
            {
            // InternalThymioDSL.g:2499:1: ( 'on' )
            // InternalThymioDSL.g:2500:2: 'on'
            {
             before(grammarAccess.getOnOffAccess().getOnKeyword_0_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalThymioDSL.g:2509:1: rule__OnOff__Group_0__1 : rule__OnOff__Group_0__1__Impl ;
    public final void rule__OnOff__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2513:1: ( rule__OnOff__Group_0__1__Impl )
            // InternalThymioDSL.g:2514:2: rule__OnOff__Group_0__1__Impl
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
    // InternalThymioDSL.g:2520:1: rule__OnOff__Group_0__1__Impl : ( ruleRBG ) ;
    public final void rule__OnOff__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2524:1: ( ( ruleRBG ) )
            // InternalThymioDSL.g:2525:1: ( ruleRBG )
            {
            // InternalThymioDSL.g:2525:1: ( ruleRBG )
            // InternalThymioDSL.g:2526:2: ruleRBG
            {
             before(grammarAccess.getOnOffAccess().getRBGParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleRBG();

            state._fsp--;

             after(grammarAccess.getOnOffAccess().getRBGParserRuleCall_0_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__RBG__Group__0"
    // InternalThymioDSL.g:2536:1: rule__RBG__Group__0 : rule__RBG__Group__0__Impl rule__RBG__Group__1 ;
    public final void rule__RBG__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2540:1: ( rule__RBG__Group__0__Impl rule__RBG__Group__1 )
            // InternalThymioDSL.g:2541:2: rule__RBG__Group__0__Impl rule__RBG__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__RBG__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RBG__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RBG__Group__0"


    // $ANTLR start "rule__RBG__Group__0__Impl"
    // InternalThymioDSL.g:2548:1: rule__RBG__Group__0__Impl : ( '(' ) ;
    public final void rule__RBG__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2552:1: ( ( '(' ) )
            // InternalThymioDSL.g:2553:1: ( '(' )
            {
            // InternalThymioDSL.g:2553:1: ( '(' )
            // InternalThymioDSL.g:2554:2: '('
            {
             before(grammarAccess.getRBGAccess().getLeftParenthesisKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getRBGAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RBG__Group__0__Impl"


    // $ANTLR start "rule__RBG__Group__1"
    // InternalThymioDSL.g:2563:1: rule__RBG__Group__1 : rule__RBG__Group__1__Impl rule__RBG__Group__2 ;
    public final void rule__RBG__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2567:1: ( rule__RBG__Group__1__Impl rule__RBG__Group__2 )
            // InternalThymioDSL.g:2568:2: rule__RBG__Group__1__Impl rule__RBG__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__RBG__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RBG__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RBG__Group__1"


    // $ANTLR start "rule__RBG__Group__1__Impl"
    // InternalThymioDSL.g:2575:1: rule__RBG__Group__1__Impl : ( ruleEInt ) ;
    public final void rule__RBG__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2579:1: ( ( ruleEInt ) )
            // InternalThymioDSL.g:2580:1: ( ruleEInt )
            {
            // InternalThymioDSL.g:2580:1: ( ruleEInt )
            // InternalThymioDSL.g:2581:2: ruleEInt
            {
             before(grammarAccess.getRBGAccess().getEIntParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRBGAccess().getEIntParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RBG__Group__1__Impl"


    // $ANTLR start "rule__RBG__Group__2"
    // InternalThymioDSL.g:2590:1: rule__RBG__Group__2 : rule__RBG__Group__2__Impl rule__RBG__Group__3 ;
    public final void rule__RBG__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2594:1: ( rule__RBG__Group__2__Impl rule__RBG__Group__3 )
            // InternalThymioDSL.g:2595:2: rule__RBG__Group__2__Impl rule__RBG__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__RBG__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RBG__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RBG__Group__2"


    // $ANTLR start "rule__RBG__Group__2__Impl"
    // InternalThymioDSL.g:2602:1: rule__RBG__Group__2__Impl : ( ',' ) ;
    public final void rule__RBG__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2606:1: ( ( ',' ) )
            // InternalThymioDSL.g:2607:1: ( ',' )
            {
            // InternalThymioDSL.g:2607:1: ( ',' )
            // InternalThymioDSL.g:2608:2: ','
            {
             before(grammarAccess.getRBGAccess().getCommaKeyword_2()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getRBGAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RBG__Group__2__Impl"


    // $ANTLR start "rule__RBG__Group__3"
    // InternalThymioDSL.g:2617:1: rule__RBG__Group__3 : rule__RBG__Group__3__Impl rule__RBG__Group__4 ;
    public final void rule__RBG__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2621:1: ( rule__RBG__Group__3__Impl rule__RBG__Group__4 )
            // InternalThymioDSL.g:2622:2: rule__RBG__Group__3__Impl rule__RBG__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__RBG__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RBG__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RBG__Group__3"


    // $ANTLR start "rule__RBG__Group__3__Impl"
    // InternalThymioDSL.g:2629:1: rule__RBG__Group__3__Impl : ( ruleEInt ) ;
    public final void rule__RBG__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2633:1: ( ( ruleEInt ) )
            // InternalThymioDSL.g:2634:1: ( ruleEInt )
            {
            // InternalThymioDSL.g:2634:1: ( ruleEInt )
            // InternalThymioDSL.g:2635:2: ruleEInt
            {
             before(grammarAccess.getRBGAccess().getEIntParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRBGAccess().getEIntParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RBG__Group__3__Impl"


    // $ANTLR start "rule__RBG__Group__4"
    // InternalThymioDSL.g:2644:1: rule__RBG__Group__4 : rule__RBG__Group__4__Impl rule__RBG__Group__5 ;
    public final void rule__RBG__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2648:1: ( rule__RBG__Group__4__Impl rule__RBG__Group__5 )
            // InternalThymioDSL.g:2649:2: rule__RBG__Group__4__Impl rule__RBG__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__RBG__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RBG__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RBG__Group__4"


    // $ANTLR start "rule__RBG__Group__4__Impl"
    // InternalThymioDSL.g:2656:1: rule__RBG__Group__4__Impl : ( ',' ) ;
    public final void rule__RBG__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2660:1: ( ( ',' ) )
            // InternalThymioDSL.g:2661:1: ( ',' )
            {
            // InternalThymioDSL.g:2661:1: ( ',' )
            // InternalThymioDSL.g:2662:2: ','
            {
             before(grammarAccess.getRBGAccess().getCommaKeyword_4()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getRBGAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RBG__Group__4__Impl"


    // $ANTLR start "rule__RBG__Group__5"
    // InternalThymioDSL.g:2671:1: rule__RBG__Group__5 : rule__RBG__Group__5__Impl rule__RBG__Group__6 ;
    public final void rule__RBG__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2675:1: ( rule__RBG__Group__5__Impl rule__RBG__Group__6 )
            // InternalThymioDSL.g:2676:2: rule__RBG__Group__5__Impl rule__RBG__Group__6
            {
            pushFollow(FOLLOW_31);
            rule__RBG__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RBG__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RBG__Group__5"


    // $ANTLR start "rule__RBG__Group__5__Impl"
    // InternalThymioDSL.g:2683:1: rule__RBG__Group__5__Impl : ( ruleEInt ) ;
    public final void rule__RBG__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2687:1: ( ( ruleEInt ) )
            // InternalThymioDSL.g:2688:1: ( ruleEInt )
            {
            // InternalThymioDSL.g:2688:1: ( ruleEInt )
            // InternalThymioDSL.g:2689:2: ruleEInt
            {
             before(grammarAccess.getRBGAccess().getEIntParserRuleCall_5()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRBGAccess().getEIntParserRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RBG__Group__5__Impl"


    // $ANTLR start "rule__RBG__Group__6"
    // InternalThymioDSL.g:2698:1: rule__RBG__Group__6 : rule__RBG__Group__6__Impl ;
    public final void rule__RBG__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2702:1: ( rule__RBG__Group__6__Impl )
            // InternalThymioDSL.g:2703:2: rule__RBG__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RBG__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RBG__Group__6"


    // $ANTLR start "rule__RBG__Group__6__Impl"
    // InternalThymioDSL.g:2709:1: rule__RBG__Group__6__Impl : ( ')' ) ;
    public final void rule__RBG__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2713:1: ( ( ')' ) )
            // InternalThymioDSL.g:2714:1: ( ')' )
            {
            // InternalThymioDSL.g:2714:1: ( ')' )
            // InternalThymioDSL.g:2715:2: ')'
            {
             before(grammarAccess.getRBGAccess().getRightParenthesisKeyword_6()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getRBGAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RBG__Group__6__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // InternalThymioDSL.g:2725:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2729:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalThymioDSL.g:2730:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
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
    // InternalThymioDSL.g:2737:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2741:1: ( ( ruleMultiplication ) )
            // InternalThymioDSL.g:2742:1: ( ruleMultiplication )
            {
            // InternalThymioDSL.g:2742:1: ( ruleMultiplication )
            // InternalThymioDSL.g:2743:2: ruleMultiplication
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
    // InternalThymioDSL.g:2752:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2756:1: ( rule__Addition__Group__1__Impl )
            // InternalThymioDSL.g:2757:2: rule__Addition__Group__1__Impl
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
    // InternalThymioDSL.g:2763:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2767:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalThymioDSL.g:2768:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalThymioDSL.g:2768:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalThymioDSL.g:2769:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalThymioDSL.g:2770:2: ( rule__Addition__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==54) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalThymioDSL.g:2770:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalThymioDSL.g:2779:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2783:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalThymioDSL.g:2784:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
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
    // InternalThymioDSL.g:2791:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2795:1: ( ( () ) )
            // InternalThymioDSL.g:2796:1: ( () )
            {
            // InternalThymioDSL.g:2796:1: ( () )
            // InternalThymioDSL.g:2797:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // InternalThymioDSL.g:2798:2: ()
            // InternalThymioDSL.g:2798:3: 
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
    // InternalThymioDSL.g:2806:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2810:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalThymioDSL.g:2811:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
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
    // InternalThymioDSL.g:2818:1: rule__Addition__Group_1__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2822:1: ( ( '+' ) )
            // InternalThymioDSL.g:2823:1: ( '+' )
            {
            // InternalThymioDSL.g:2823:1: ( '+' )
            // InternalThymioDSL.g:2824:2: '+'
            {
             before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1()); 
            match(input,54,FOLLOW_2); 
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
    // InternalThymioDSL.g:2833:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2837:1: ( rule__Addition__Group_1__2__Impl )
            // InternalThymioDSL.g:2838:2: rule__Addition__Group_1__2__Impl
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
    // InternalThymioDSL.g:2844:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2848:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalThymioDSL.g:2849:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalThymioDSL.g:2849:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalThymioDSL.g:2850:2: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // InternalThymioDSL.g:2851:2: ( rule__Addition__RightAssignment_1_2 )
            // InternalThymioDSL.g:2851:3: rule__Addition__RightAssignment_1_2
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
    // InternalThymioDSL.g:2860:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2864:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalThymioDSL.g:2865:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
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
    // InternalThymioDSL.g:2872:1: rule__Multiplication__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2876:1: ( ( rulePrimary ) )
            // InternalThymioDSL.g:2877:1: ( rulePrimary )
            {
            // InternalThymioDSL.g:2877:1: ( rulePrimary )
            // InternalThymioDSL.g:2878:2: rulePrimary
            {
             before(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
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
    // InternalThymioDSL.g:2887:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2891:1: ( rule__Multiplication__Group__1__Impl )
            // InternalThymioDSL.g:2892:2: rule__Multiplication__Group__1__Impl
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
    // InternalThymioDSL.g:2898:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2902:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalThymioDSL.g:2903:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalThymioDSL.g:2903:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalThymioDSL.g:2904:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalThymioDSL.g:2905:2: ( rule__Multiplication__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==55) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalThymioDSL.g:2905:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalThymioDSL.g:2914:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2918:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalThymioDSL.g:2919:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
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
    // InternalThymioDSL.g:2926:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2930:1: ( ( () ) )
            // InternalThymioDSL.g:2931:1: ( () )
            {
            // InternalThymioDSL.g:2931:1: ( () )
            // InternalThymioDSL.g:2932:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            // InternalThymioDSL.g:2933:2: ()
            // InternalThymioDSL.g:2933:3: 
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
    // InternalThymioDSL.g:2941:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2945:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalThymioDSL.g:2946:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
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
    // InternalThymioDSL.g:2953:1: rule__Multiplication__Group_1__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2957:1: ( ( '*' ) )
            // InternalThymioDSL.g:2958:1: ( '*' )
            {
            // InternalThymioDSL.g:2958:1: ( '*' )
            // InternalThymioDSL.g:2959:2: '*'
            {
             before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1()); 
            match(input,55,FOLLOW_2); 
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
    // InternalThymioDSL.g:2968:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2972:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalThymioDSL.g:2973:2: rule__Multiplication__Group_1__2__Impl
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
    // InternalThymioDSL.g:2979:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2983:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalThymioDSL.g:2984:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalThymioDSL.g:2984:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalThymioDSL.g:2985:2: ( rule__Multiplication__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            // InternalThymioDSL.g:2986:2: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalThymioDSL.g:2986:3: rule__Multiplication__RightAssignment_1_2
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


    // $ANTLR start "rule__Primary__Group_1__0"
    // InternalThymioDSL.g:2995:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:2999:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalThymioDSL.g:3000:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // InternalThymioDSL.g:3007:1: rule__Primary__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3011:1: ( ( '(' ) )
            // InternalThymioDSL.g:3012:1: ( '(' )
            {
            // InternalThymioDSL.g:3012:1: ( '(' )
            // InternalThymioDSL.g:3013:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // InternalThymioDSL.g:3022:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3026:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalThymioDSL.g:3027:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_31);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // InternalThymioDSL.g:3034:1: rule__Primary__Group_1__1__Impl : ( ruleAddition ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3038:1: ( ( ruleAddition ) )
            // InternalThymioDSL.g:3039:1: ( ruleAddition )
            {
            // InternalThymioDSL.g:3039:1: ( ruleAddition )
            // InternalThymioDSL.g:3040:2: ruleAddition
            {
             before(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getAdditionParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // InternalThymioDSL.g:3049:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3053:1: ( rule__Primary__Group_1__2__Impl )
            // InternalThymioDSL.g:3054:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // InternalThymioDSL.g:3060:1: rule__Primary__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3064:1: ( ( ')' ) )
            // InternalThymioDSL.g:3065:1: ( ')' )
            {
            // InternalThymioDSL.g:3065:1: ( ')' )
            // InternalThymioDSL.g:3066:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__Model__ProceduresAssignment"
    // InternalThymioDSL.g:3076:1: rule__Model__ProceduresAssignment : ( ruleProcedure ) ;
    public final void rule__Model__ProceduresAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3080:1: ( ( ruleProcedure ) )
            // InternalThymioDSL.g:3081:2: ( ruleProcedure )
            {
            // InternalThymioDSL.g:3081:2: ( ruleProcedure )
            // InternalThymioDSL.g:3082:3: ruleProcedure
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
    // InternalThymioDSL.g:3091:1: rule__Procedure__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Procedure__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3095:1: ( ( ruleEString ) )
            // InternalThymioDSL.g:3096:2: ( ruleEString )
            {
            // InternalThymioDSL.g:3096:2: ( ruleEString )
            // InternalThymioDSL.g:3097:3: ruleEString
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
    // InternalThymioDSL.g:3106:1: rule__Procedure__EventsAssignment_3 : ( ruleEvent ) ;
    public final void rule__Procedure__EventsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3110:1: ( ( ruleEvent ) )
            // InternalThymioDSL.g:3111:2: ( ruleEvent )
            {
            // InternalThymioDSL.g:3111:2: ( ruleEvent )
            // InternalThymioDSL.g:3112:3: ruleEvent
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
    // InternalThymioDSL.g:3121:1: rule__Procedure__ActionsAssignment_5 : ( ruleAction ) ;
    public final void rule__Procedure__ActionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3125:1: ( ( ruleAction ) )
            // InternalThymioDSL.g:3126:2: ( ruleAction )
            {
            // InternalThymioDSL.g:3126:2: ( ruleAction )
            // InternalThymioDSL.g:3127:3: ruleAction
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


    // $ANTLR start "rule__Event__ButtonAssignment_2_1"
    // InternalThymioDSL.g:3136:1: rule__Event__ButtonAssignment_2_1 : ( ruleOrtogonal ) ;
    public final void rule__Event__ButtonAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3140:1: ( ( ruleOrtogonal ) )
            // InternalThymioDSL.g:3141:2: ( ruleOrtogonal )
            {
            // InternalThymioDSL.g:3141:2: ( ruleOrtogonal )
            // InternalThymioDSL.g:3142:3: ruleOrtogonal
            {
             before(grammarAccess.getEventAccess().getButtonOrtogonalParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrtogonal();

            state._fsp--;

             after(grammarAccess.getEventAccess().getButtonOrtogonalParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ButtonAssignment_2_1"


    // $ANTLR start "rule__Event__TapAssignment_3_1"
    // InternalThymioDSL.g:3151:1: rule__Event__TapAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__Event__TapAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3155:1: ( ( ruleEBoolean ) )
            // InternalThymioDSL.g:3156:2: ( ruleEBoolean )
            {
            // InternalThymioDSL.g:3156:2: ( ruleEBoolean )
            // InternalThymioDSL.g:3157:3: ruleEBoolean
            {
             before(grammarAccess.getEventAccess().getTapEBooleanParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEventAccess().getTapEBooleanParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__TapAssignment_3_1"


    // $ANTLR start "rule__Event__MicAssignment_4_1"
    // InternalThymioDSL.g:3166:1: rule__Event__MicAssignment_4_1 : ( ruleEBoolean ) ;
    public final void rule__Event__MicAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3170:1: ( ( ruleEBoolean ) )
            // InternalThymioDSL.g:3171:2: ( ruleEBoolean )
            {
            // InternalThymioDSL.g:3171:2: ( ruleEBoolean )
            // InternalThymioDSL.g:3172:3: ruleEBoolean
            {
             before(grammarAccess.getEventAccess().getMicEBooleanParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEventAccess().getMicEBooleanParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__MicAssignment_4_1"


    // $ANTLR start "rule__Event__SensorAssignment_5_1"
    // InternalThymioDSL.g:3181:1: rule__Event__SensorAssignment_5_1 : ( ruleSensor ) ;
    public final void rule__Event__SensorAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3185:1: ( ( ruleSensor ) )
            // InternalThymioDSL.g:3186:2: ( ruleSensor )
            {
            // InternalThymioDSL.g:3186:2: ( ruleSensor )
            // InternalThymioDSL.g:3187:3: ruleSensor
            {
             before(grammarAccess.getEventAccess().getSensorSensorParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getEventAccess().getSensorSensorParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__SensorAssignment_5_1"


    // $ANTLR start "rule__Sensor__BottomLeftSensorAssignment_1_1"
    // InternalThymioDSL.g:3196:1: rule__Sensor__BottomLeftSensorAssignment_1_1 : ( ruleBlackWhite ) ;
    public final void rule__Sensor__BottomLeftSensorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3200:1: ( ( ruleBlackWhite ) )
            // InternalThymioDSL.g:3201:2: ( ruleBlackWhite )
            {
            // InternalThymioDSL.g:3201:2: ( ruleBlackWhite )
            // InternalThymioDSL.g:3202:3: ruleBlackWhite
            {
             before(grammarAccess.getSensorAccess().getBottomLeftSensorBlackWhiteParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBlackWhite();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getBottomLeftSensorBlackWhiteParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__BottomLeftSensorAssignment_1_1"


    // $ANTLR start "rule__Sensor__BottomRightSensorAssignment_2_1"
    // InternalThymioDSL.g:3211:1: rule__Sensor__BottomRightSensorAssignment_2_1 : ( ruleBlackWhite ) ;
    public final void rule__Sensor__BottomRightSensorAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3215:1: ( ( ruleBlackWhite ) )
            // InternalThymioDSL.g:3216:2: ( ruleBlackWhite )
            {
            // InternalThymioDSL.g:3216:2: ( ruleBlackWhite )
            // InternalThymioDSL.g:3217:3: ruleBlackWhite
            {
             before(grammarAccess.getSensorAccess().getBottomRightSensorBlackWhiteParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBlackWhite();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getBottomRightSensorBlackWhiteParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__BottomRightSensorAssignment_2_1"


    // $ANTLR start "rule__Sensor__NorthWestAssignment_3_1"
    // InternalThymioDSL.g:3226:1: rule__Sensor__NorthWestAssignment_3_1 : ( ruleSensorStatus ) ;
    public final void rule__Sensor__NorthWestAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3230:1: ( ( ruleSensorStatus ) )
            // InternalThymioDSL.g:3231:2: ( ruleSensorStatus )
            {
            // InternalThymioDSL.g:3231:2: ( ruleSensorStatus )
            // InternalThymioDSL.g:3232:3: ruleSensorStatus
            {
             before(grammarAccess.getSensorAccess().getNorthWestSensorStatusParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorStatus();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getNorthWestSensorStatusParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__NorthWestAssignment_3_1"


    // $ANTLR start "rule__Sensor__NorthNorthWestAssignment_4_1"
    // InternalThymioDSL.g:3241:1: rule__Sensor__NorthNorthWestAssignment_4_1 : ( ruleSensorStatus ) ;
    public final void rule__Sensor__NorthNorthWestAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3245:1: ( ( ruleSensorStatus ) )
            // InternalThymioDSL.g:3246:2: ( ruleSensorStatus )
            {
            // InternalThymioDSL.g:3246:2: ( ruleSensorStatus )
            // InternalThymioDSL.g:3247:3: ruleSensorStatus
            {
             before(grammarAccess.getSensorAccess().getNorthNorthWestSensorStatusParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorStatus();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getNorthNorthWestSensorStatusParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__NorthNorthWestAssignment_4_1"


    // $ANTLR start "rule__Sensor__NorthAssignment_5_1"
    // InternalThymioDSL.g:3256:1: rule__Sensor__NorthAssignment_5_1 : ( ruleSensorStatus ) ;
    public final void rule__Sensor__NorthAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3260:1: ( ( ruleSensorStatus ) )
            // InternalThymioDSL.g:3261:2: ( ruleSensorStatus )
            {
            // InternalThymioDSL.g:3261:2: ( ruleSensorStatus )
            // InternalThymioDSL.g:3262:3: ruleSensorStatus
            {
             before(grammarAccess.getSensorAccess().getNorthSensorStatusParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorStatus();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getNorthSensorStatusParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__NorthAssignment_5_1"


    // $ANTLR start "rule__Sensor__NorthNorthEastAssignment_6_1"
    // InternalThymioDSL.g:3271:1: rule__Sensor__NorthNorthEastAssignment_6_1 : ( ruleSensorStatus ) ;
    public final void rule__Sensor__NorthNorthEastAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3275:1: ( ( ruleSensorStatus ) )
            // InternalThymioDSL.g:3276:2: ( ruleSensorStatus )
            {
            // InternalThymioDSL.g:3276:2: ( ruleSensorStatus )
            // InternalThymioDSL.g:3277:3: ruleSensorStatus
            {
             before(grammarAccess.getSensorAccess().getNorthNorthEastSensorStatusParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorStatus();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getNorthNorthEastSensorStatusParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__NorthNorthEastAssignment_6_1"


    // $ANTLR start "rule__Sensor__NorthEastAssignment_7_1"
    // InternalThymioDSL.g:3286:1: rule__Sensor__NorthEastAssignment_7_1 : ( ruleSensorStatus ) ;
    public final void rule__Sensor__NorthEastAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3290:1: ( ( ruleSensorStatus ) )
            // InternalThymioDSL.g:3291:2: ( ruleSensorStatus )
            {
            // InternalThymioDSL.g:3291:2: ( ruleSensorStatus )
            // InternalThymioDSL.g:3292:3: ruleSensorStatus
            {
             before(grammarAccess.getSensorAccess().getNorthEastSensorStatusParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorStatus();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getNorthEastSensorStatusParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__NorthEastAssignment_7_1"


    // $ANTLR start "rule__Action__MoveAssignment_1"
    // InternalThymioDSL.g:3301:1: rule__Action__MoveAssignment_1 : ( ruleMotor ) ;
    public final void rule__Action__MoveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3305:1: ( ( ruleMotor ) )
            // InternalThymioDSL.g:3306:2: ( ruleMotor )
            {
            // InternalThymioDSL.g:3306:2: ( ruleMotor )
            // InternalThymioDSL.g:3307:3: ruleMotor
            {
             before(grammarAccess.getActionAccess().getMoveMotorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMotor();

            state._fsp--;

             after(grammarAccess.getActionAccess().getMoveMotorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__MoveAssignment_1"


    // $ANTLR start "rule__Action__TopLightAssignment_3"
    // InternalThymioDSL.g:3316:1: rule__Action__TopLightAssignment_3 : ( ruleOnOff ) ;
    public final void rule__Action__TopLightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3320:1: ( ( ruleOnOff ) )
            // InternalThymioDSL.g:3321:2: ( ruleOnOff )
            {
            // InternalThymioDSL.g:3321:2: ( ruleOnOff )
            // InternalThymioDSL.g:3322:3: ruleOnOff
            {
             before(grammarAccess.getActionAccess().getTopLightOnOffParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOnOff();

            state._fsp--;

             after(grammarAccess.getActionAccess().getTopLightOnOffParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__TopLightAssignment_3"


    // $ANTLR start "rule__Action__BottomLightAssignment_5"
    // InternalThymioDSL.g:3331:1: rule__Action__BottomLightAssignment_5 : ( ruleOnOff ) ;
    public final void rule__Action__BottomLightAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3335:1: ( ( ruleOnOff ) )
            // InternalThymioDSL.g:3336:2: ( ruleOnOff )
            {
            // InternalThymioDSL.g:3336:2: ( ruleOnOff )
            // InternalThymioDSL.g:3337:3: ruleOnOff
            {
             before(grammarAccess.getActionAccess().getBottomLightOnOffParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleOnOff();

            state._fsp--;

             after(grammarAccess.getActionAccess().getBottomLightOnOffParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__BottomLightAssignment_5"


    // $ANTLR start "rule__Action__SoundAssignment_7"
    // InternalThymioDSL.g:3346:1: rule__Action__SoundAssignment_7 : ( ruleSound ) ;
    public final void rule__Action__SoundAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3350:1: ( ( ruleSound ) )
            // InternalThymioDSL.g:3351:2: ( ruleSound )
            {
            // InternalThymioDSL.g:3351:2: ( ruleSound )
            // InternalThymioDSL.g:3352:3: ruleSound
            {
             before(grammarAccess.getActionAccess().getSoundSoundParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleSound();

            state._fsp--;

             after(grammarAccess.getActionAccess().getSoundSoundParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__SoundAssignment_7"


    // $ANTLR start "rule__Motor__LeftAssignment_2"
    // InternalThymioDSL.g:3361:1: rule__Motor__LeftAssignment_2 : ( ruleAddition ) ;
    public final void rule__Motor__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3365:1: ( ( ruleAddition ) )
            // InternalThymioDSL.g:3366:2: ( ruleAddition )
            {
            // InternalThymioDSL.g:3366:2: ( ruleAddition )
            // InternalThymioDSL.g:3367:3: ruleAddition
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
    // InternalThymioDSL.g:3376:1: rule__Motor__RightAssignment_4 : ( ruleAddition ) ;
    public final void rule__Motor__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3380:1: ( ( ruleAddition ) )
            // InternalThymioDSL.g:3381:2: ( ruleAddition )
            {
            // InternalThymioDSL.g:3381:2: ( ruleAddition )
            // InternalThymioDSL.g:3382:3: ruleAddition
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
    // InternalThymioDSL.g:3391:1: rule__Sound__PitchAssignment_1 : ( ruleAddition ) ;
    public final void rule__Sound__PitchAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3395:1: ( ( ruleAddition ) )
            // InternalThymioDSL.g:3396:2: ( ruleAddition )
            {
            // InternalThymioDSL.g:3396:2: ( ruleAddition )
            // InternalThymioDSL.g:3397:3: ruleAddition
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
    // InternalThymioDSL.g:3406:1: rule__Sound__DurationAssignment_2 : ( ruleNoteDuration ) ;
    public final void rule__Sound__DurationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3410:1: ( ( ruleNoteDuration ) )
            // InternalThymioDSL.g:3411:2: ( ruleNoteDuration )
            {
            // InternalThymioDSL.g:3411:2: ( ruleNoteDuration )
            // InternalThymioDSL.g:3412:3: ruleNoteDuration
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


    // $ANTLR start "rule__Sound__PitchAssignment_3_2"
    // InternalThymioDSL.g:3421:1: rule__Sound__PitchAssignment_3_2 : ( ruleAddition ) ;
    public final void rule__Sound__PitchAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3425:1: ( ( ruleAddition ) )
            // InternalThymioDSL.g:3426:2: ( ruleAddition )
            {
            // InternalThymioDSL.g:3426:2: ( ruleAddition )
            // InternalThymioDSL.g:3427:3: ruleAddition
            {
             before(grammarAccess.getSoundAccess().getPitchAdditionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getSoundAccess().getPitchAdditionParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__PitchAssignment_3_2"


    // $ANTLR start "rule__Sound__DurationAssignment_3_3"
    // InternalThymioDSL.g:3436:1: rule__Sound__DurationAssignment_3_3 : ( ruleNoteDuration ) ;
    public final void rule__Sound__DurationAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3440:1: ( ( ruleNoteDuration ) )
            // InternalThymioDSL.g:3441:2: ( ruleNoteDuration )
            {
            // InternalThymioDSL.g:3441:2: ( ruleNoteDuration )
            // InternalThymioDSL.g:3442:3: ruleNoteDuration
            {
             before(grammarAccess.getSoundAccess().getDurationNoteDurationParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNoteDuration();

            state._fsp--;

             after(grammarAccess.getSoundAccess().getDurationNoteDurationParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__DurationAssignment_3_3"


    // $ANTLR start "rule__Addition__RightAssignment_1_2"
    // InternalThymioDSL.g:3451:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3455:1: ( ( ruleMultiplication ) )
            // InternalThymioDSL.g:3456:2: ( ruleMultiplication )
            {
            // InternalThymioDSL.g:3456:2: ( ruleMultiplication )
            // InternalThymioDSL.g:3457:3: ruleMultiplication
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
    // InternalThymioDSL.g:3466:1: rule__Multiplication__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3470:1: ( ( rulePrimary ) )
            // InternalThymioDSL.g:3471:2: ( rulePrimary )
            {
            // InternalThymioDSL.g:3471:2: ( rulePrimary )
            // InternalThymioDSL.g:3472:3: rulePrimary
            {
             before(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Primary__ValueAssignment_0"
    // InternalThymioDSL.g:3481:1: rule__Primary__ValueAssignment_0 : ( ruleEInt ) ;
    public final void rule__Primary__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalThymioDSL.g:3485:1: ( ( ruleEInt ) )
            // InternalThymioDSL.g:3486:2: ( ruleEInt )
            {
            // InternalThymioDSL.g:3486:2: ( ruleEInt )
            // InternalThymioDSL.g:3487:3: ruleEInt
            {
             before(grammarAccess.getPrimaryAccess().getValueEIntParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getValueEIntParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ValueAssignment_0"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000001F0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000FE00000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0004000000002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000A000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0002000000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0080000000000002L});

}