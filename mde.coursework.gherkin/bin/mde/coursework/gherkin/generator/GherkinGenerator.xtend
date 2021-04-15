/*
 * generated by Xtext 2.24.0
 */
package mde.coursework.gherkin.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import mde.coursework.gherkin.gherkin.Gherkin_Language
import mde.coursework.gherkin.gherkin.Steps
import mde.coursework.gherkin.gherkin.Background
import mde.coursework.gherkin.gherkin.Chain_Steps
import mde.coursework.gherkin.gherkin.Given_Statement
import mde.coursework.gherkin.gherkin.When_Statement
import mde.coursework.gherkin.gherkin.Then_Statement
import mde.coursework.gherkin.gherkin.But_Statement
import mde.coursework.gherkin.gherkin.Star_Statement
import mde.coursework.gherkin.gherkin.And_Statement
import mde.coursework.gherkin.gherkin.Normal_Scenario
import mde.coursework.gherkin.gherkin.Feature
import java.util.ArrayList
import org.eclipse.emf.common.util.EList

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class GherkinGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val model = resource.contents.head as Gherkin_Language
		fsa.generateFile("StepDefinitions" + '.java', model.generateStepDefinitions())
	}
	
	def generateStepDefinitions(Gherkin_Language gherkin) '''
		�val givens = gherkin.eAllContents.filter(Given_Statement)�
		�val whens = gherkin.eAllContents.filter(When_Statement)�
		�val thens = gherkin.eAllContents.filter(Then_Statement)�
		�val buts = gherkin.eAllContents.filter(But_Statement)�
		�val stars = gherkin.eAllContents.filter(Star_Statement)�
		�val ands = gherkin.eAllContents.filter(And_Statement)�		
		public class StepDefinitions {
			�givens.map[generateStep].join('\n')�
			�whens.map[generateStep].join('\n')�
			�thens.map[generateStep].join('\n')�
			�buts.map[generateStep].join('\n')�
			�stars.map[generateStep].join('\n')�
			�ands.map[generateStep].join('\n')�			
		}
	'''
	
	
	dispatch def String generateStep(Given_Statement stmt) { '''	
		@Given(�"\"" + returnName(stmt.desc.desc, " ") + "\""�)
public void �returnName(stmt.desc.desc, "_")�() {
        	
}	
	'''
	}
	
	dispatch def String generateStep(When_Statement stmt) { '''	
		@When(�"\"" + returnName(stmt.desc.desc, " ") + "\""�)
public void �returnName(stmt.desc.desc, "_")�() {
        	
}	
	'''
	}
	
	dispatch def String generateStep(Then_Statement stmt) { '''	
		@Then(�"\"" + returnName(stmt.desc.desc, " ") + "\""�)
public void �returnName(stmt.desc.desc, "_")�() {
        	
}	
	'''
	}
	
	dispatch def String generateStep(But_Statement stmt) { '''	
		@But(�"\"" + returnName(stmt.desc.desc, " ") + "\""�)
public void �returnName(stmt.desc.desc, "_")�() {
        	
}	
	'''
	}
	
	dispatch def String generateStep(Star_Statement stmt) { '''	
		@Star(�"\"" + returnName(stmt.desc.desc, " ") + "\""�)
public void �returnName(stmt.desc.desc, "_")�() {
        	
}	
	'''
	}
	
	dispatch def String generateStep(And_Statement stmt) { '''

		@And(�"\"" + returnName(stmt.desc.desc, " ") + "\""�)
public void �returnName(stmt.desc.desc, "_")�() {
        	
}	
	'''
	}
	
	def String returnName(EList<String> desc, String connection){
		var name = ""
		
		for (string : desc){
			if(desc.indexOf(string) == desc.length - 1){
				name += string
			}
			else{
				name += string + connection					
			}
		}
	
		
		return name
				
	}
	

}
	

