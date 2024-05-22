/**
 * generated by Xtext 2.34.0
 */
package ld.project2.generator;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;
import java.util.List;
import java.util.function.Consumer;
import ld.project2.ThymioDSLStandaloneSetup;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.GeneratorDelegate;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Main {
  public static void main(final String[] args) {
    boolean _isEmpty = ((List<String>)Conversions.doWrapArray(args)).isEmpty();
    if (_isEmpty) {
      System.err.println("Aborting: no path to EMF resource provided!");
      return;
    }
    final Injector injector = new ThymioDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
    final Main main = injector.<Main>getInstance(Main.class);
    main.runGenerator(args[0]);
  }

  @Inject
  private Provider<ResourceSet> resourceSetProvider;

  @Inject
  private IResourceValidator validator;

  @Inject
  private GeneratorDelegate generator;

  @Inject
  private JavaIoFileSystemAccess fileAccess;

  protected void runGenerator(final String string) {
    final ResourceSet set = this.resourceSetProvider.get();
    final Resource resource = set.getResource(URI.createFileURI(string), true);
    final List<Issue> issues = this.validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
    boolean _isEmpty = issues.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      final Consumer<Issue> _function = (Issue it) -> {
        System.err.println(it);
      };
      issues.forEach(_function);
      return;
    }
    this.fileAccess.setOutputPath("src-gen/");
    GeneratorContext _generatorContext = new GeneratorContext();
    final Procedure1<GeneratorContext> _function_1 = (GeneratorContext it) -> {
      it.setCancelIndicator(CancelIndicator.NullImpl);
    };
    final GeneratorContext context = ObjectExtensions.<GeneratorContext>operator_doubleArrow(_generatorContext, _function_1);
    this.generator.generate(resource, this.fileAccess, context);
    System.out.println("Code generation finished.");
  }
}
