package stewie.pvt.spray

import akka.actor.Actor
import stewie.pvt.spray.services.{CommonService, StaticFileService}

/**
 * Created by Stewie on 2015. 9. 8..
 */
trait Routes extends StaticFileService with CommonService{

  val routes = {
    staticFileRoute ~
    commonRoute
  }
}

class RoutesActor extends Actor with Routes {

  override def actorRefFactory = context

  def receive = runRoute(routes)
}
