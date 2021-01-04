package com.github.valrcs.scalagui

import scala.swing._
import java.awt.Dimension

object SwingGUI extends App {
  println("Testing GUI capabilities")
  val hdSize = new Dimension(1920,1080)

  new Frame {
    title = "Hello world"
    minimumSize = hdSize
    val bSize = new Dimension(200,200)
    contents = new FlowPanel {
      contents += new Label("Launch rainbows:") {
        minimumSize = bSize
        maximumSize = bSize
        preferredSize = bSize
      }
      contents += new Button("Click me") {
        minimumSize = bSize
        maximumSize = bSize
        preferredSize = bSize
        reactions += {
          case event.ButtonClicked(_) =>
            println("All the colours!")
        }
      }
    }

    pack()
    centerOnScreen()
    open()
  }

}
