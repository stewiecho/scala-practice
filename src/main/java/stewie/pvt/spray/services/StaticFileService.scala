package stewie.pvt.spray.services

import spray.routing.HttpService

/**
 * Created by Stewie on 2015. 9. 8..
 */
trait StaticFileService extends HttpService{

  val staticFileRoute = {
    pathPrefix("static") {
      get {
        getFromResourceDirectory("web")
      }
    }
  }
}
