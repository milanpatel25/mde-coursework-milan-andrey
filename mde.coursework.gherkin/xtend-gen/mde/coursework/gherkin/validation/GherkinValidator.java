/**
 * generated by Xtext 2.24.0
 */
package mde.coursework.gherkin.validation;

import mde.coursework.gherkin.gherkin.Background;
import mde.coursework.gherkin.gherkin.Description;
import mde.coursework.gherkin.gherkin.GherkinPackage;
import mde.coursework.gherkin.validation.AbstractGherkinValidator;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Conversions;

/**
 * This class contains custom validation rules.
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class GherkinValidator extends AbstractGherkinValidator {
  public static final String INVALID_STEP_DESC = "mde.coursework.gherkin.INVALID_STEP_DESC";
  
  public static final String INVALID_BACK_STATE = "mde.coursework.gherkin.INVALID_BACK_STATE";
  
  public static final String INVALID_BACK_ASP = "mde.coursework.gherkin.INVALID_BACK_ASP";
  
  @Check
  public void checkForDescription(final Description description) {
    int _length = ((Object[])Conversions.unwrapArray(description.getDesc(), Object.class)).length;
    boolean _equals = (_length == 0);
    if (_equals) {
      this.warning("Description of the statement cannot be NULL", description, 
        GherkinPackage.Literals.DESCRIPTION__DESC, GherkinValidator.INVALID_STEP_DESC);
    }
  }
  
  @Check
  public void checkBackgroundSteps(final Background background) {
    for (int i = 0; (i < ((Object[])Conversions.unwrapArray(background.getBackground_Steps(), Object.class)).length); i++) {
      if ((((background.getBackground_Steps().get(i).getGiven_step() == null) && (background.getBackground_Steps().get(i).getAnd_step() == null)) && (background.getBackground_Steps().get(i).getStar_step() == null))) {
        this.warning("Background can only contain Given Statements", background, 
          GherkinPackage.Literals.BACKGROUND__TITLE, GherkinValidator.INVALID_BACK_STATE);
      }
    }
  }
  
  @Check
  public void checkBackgroundFirstIsGiven(final Background background) {
    if (((((Object[])Conversions.unwrapArray(background.getBackground_Steps(), Object.class)).length != 0) && (background.getBackground_Steps().get(0).getGiven_step() == null))) {
      this.warning("Background must start with a Given Statement", background, 
        GherkinPackage.Literals.BACKGROUND__BACKGROUND_STEPS, GherkinValidator.INVALID_BACK_ASP);
    }
  }
}
