/*
 * generated by Xtext 2.34.0
 */
package ld.project2.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.contentassist.IContentProposalProvider;

import ld.project2.ui.contentassist.ThymioDSLProposalProvider;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
public class ThymioDSLUiModule extends AbstractThymioDSLUiModule {

	public ThymioDSLUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends IContentProposalProvider> bindIEProposalProvider() {
        return ThymioDSLProposalProvider.class;
    }
}
