package com.innovaccer

import akka.actor.Actor
import akka.actor.Actor.actorOf
/**
  * Created by shreyansh on 16/1/17.
  */
class ChatServer extends Actor{
  def receive = {
    case "test" => println("received test")
    case _ =>      println("received unknown message")
  }
}

val myActor = Actor.actorOf[MyActor]
myActor.start()
