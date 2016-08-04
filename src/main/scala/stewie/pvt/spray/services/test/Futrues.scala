package stewie.pvt.spray.services.test

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

/**
 * Created by Stewie on 2016. 7. 7..
 */
object Futrues {


  def main(args: Array[String]) {

    def sleep(millis: Long) = {
      Thread.sleep(5)
    }

    def doWork(index: Int) = {
      sleep((math.random * 1000).toLong)
      index
    }
    (1 to 5).foreach {
      index => val future = Future {
        doWork(index)
      }
        future onSuccess {
          case answer: Int => println(s"Success! returned: $answer")
        }
        future onFailure {
          case th: Throwable => println(s"Failure! returned: $th")
        }
    }

    sleep(1000)
    println("Finito!")
  }

}
