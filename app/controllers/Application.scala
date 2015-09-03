package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
  	// create merge conflict 1
  	import play.api.libs.json._
  	 Ok(JsObject(
  	 	Seq(
  	 	"message" -> JsString("It Works.")
  	 	)
  	 ))

  	 // another create merge conflict 1
  }
  
}