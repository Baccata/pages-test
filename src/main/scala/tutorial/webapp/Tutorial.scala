package tutorial.webapp

import org.scalajs.dom
import dom.document

object Tutorial {
  def main(args: Array[String]): Unit = {
    def appendPar(targetNode: dom.Node, text: String): Unit = {
      val parNode = document.createElement("p")
      val textNode = document.createTextNode(text)
      parNode.appendChild(textNode)
      targetNode.appendChild(parNode)
    }

    appendPar(document.body, "Hello World")
  }
}
