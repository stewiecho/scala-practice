package stewie.pvt.spray.services

import spray.routing.HttpService

/**
 * Created by Stewie on 2015. 9. 9..
 */
trait CommonService extends HttpService{

  var commonRoute = {
    path("") {
      get {
        getFromResource("web/index.html")
      }
    }
  }
}
