package stewie.pvt.spray

import akka.actor.{Props, ActorSystem}
import akka.io.IO
import akka.util.Timeout
import spray.can.Http
import akka.pattern.ask
import scala.concurrent.duration._

/**
 * Created by Stewie on 2015. 9. 8..
 */
object Boot extends App {

  implicit val system = ActorSystem("stewie-spray")

  val service = system.actorOf(Props[RoutesActor], "route-service")

  implicit val timeout = Timeout(5.seconds)

  IO(Http) ? Http.Bind(service, interface = "localhost", port = 8080)
}
