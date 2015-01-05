package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json.Json

object Application extends Controller {

  def index = Action {
    Ok(Json.obj("message" -> "Hello, World!"))
  }

  def redir = Action {
    Redirect("http://www.ping-conf.com/ping-play.html") 
  }

}
