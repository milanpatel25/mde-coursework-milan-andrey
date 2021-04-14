/*
 * generated by Xtext 2.24.0
 */
package mde.coursework.gherkin.validation

import org.eclipse.xtext.validation.Check
import mde.coursework.gherkin.gherkin.Background
import mde.coursework.gherkin.gherkin.Given_Statement
import mde.coursework.gherkin.gherkin.GherkinPackage
import mde.coursework.gherkin.gherkin.Description
import mde.coursework.gherkin.gherkin.Star_Statement
import mde.coursework.gherkin.gherkin.And_Statement

/** 
 * This class contains custom validation rules. 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
 
 
class GherkinValidator extends AbstractGherkinValidator {
	public static val INVALID_STEP_DESC = 'mde.coursework.gherkin.INVALID_STEP_DESC'
	public static val INVALID_BACK_STATE = 'mde.coursework.gherkin.INVALID_BACK_STATE'
	public static val INVALID_BACK_ASP = 'mde.coursework.gherkin.INVALID_BACK_ASP'
	
	@Check 
	def checkForDescription (Description description) {
		if (description.desc.length == 0){
			warning('Description of the statement cannot be NULL', description,
				GherkinPackage.Literals.DESCRIPTION__DESC, INVALID_STEP_DESC)
		}
	}
	
	@Check
	def checkBackgroundSteps (Background background) {
		for (var i = 0; i<background.background_Steps.length; i++){
			if ((background.background_Steps.get(i).given_step === null && background.background_Steps.get(i).and_step === null && background.background_Steps.get(i).star_step === null)){
				warning('Background can only contain Given Statements', background,
				GherkinPackage.Literals.BACKGROUND__TITLE, INVALID_BACK_STATE)
			}
		}

	}
	
	@Check
	def checkBackgroundFirstIsGiven (Background background) {
		if(background.background_Steps.length != 0 && (background.background_Steps.get(0).given_step === null )){
				warning('Background must start with a Given Statement', background,
				GherkinPackage.Literals.BACKGROUND__BACKGROUND_STEPS, INVALID_BACK_ASP)
			}
		}

}