package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
  	// Adding 11 - create merge conflict
  	import play.api.libs.json._
  	 Ok(JsObject(
  	 	Seq(
  	 	"message" -> JsString("It Works.")
  	 	)
  	 ))

  	 // Adding 11 - create merge conflict
  }
  
}