/*
 * generated by Xtext 2.24.0
 */
package mde.coursework.gherkin.ui.tests;

import com.google.inject.Injector;
import mde.coursework.gherkin.ui.internal.GherkinActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class GherkinUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return GherkinActivator.getInstance().getInjector("mde.coursework.gherkin.Gherkin");
	}

}
