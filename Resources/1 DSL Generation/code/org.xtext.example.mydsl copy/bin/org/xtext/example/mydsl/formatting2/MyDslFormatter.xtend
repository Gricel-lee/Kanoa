/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.formatting2

import com.google.inject.Inject
import dsl.ProblemSpecification
import dsl.RobotsModel
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.example.mydsl.services.MyDslGrammarAccess

class MyDslFormatter extends AbstractFormatter2 {
	
	@Inject extension MyDslGrammarAccess

	def dispatch void format(ProblemSpecification problemSpecification, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (worldModel : problemSpecification.worldModel) {
			worldModel.format
		}
		for (robotsModel : problemSpecification.robotsModel) {
			robotsModel.format
		}
		for (tasksModel : problemSpecification.tasksModel) {
			tasksModel.format
		}
		for (mission : problemSpecification.mission) {
			mission.format
		}
		for (qoS : problemSpecification.qos) {
			qoS.format
		}
	}

	def dispatch void format(RobotsModel robotsModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (capability : robotsModel.capabilities) {
			capability.format
		}
	}
	
}
