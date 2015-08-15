import com.typesafe.scalalogging.slf4j.Logger
import org.slf4j.LoggerFactory

object Main {
  def main(args: Array[String]) = {
    var logger = Logger(LoggerFactory getLogger "name")
    logger.error("here is an error log entry")
  }
}
