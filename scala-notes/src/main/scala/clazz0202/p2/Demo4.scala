package clazz0202.p2

//特质 定义第一个trait
trait Human{
  //定义抽象字段
  var id:Int
  var name:String

  def sayHello():String = "Hello " + name
}

//定义第二个trait
trait Action{
  //定义一个抽象方法
  def getActionName():String
}

//定义一个子类：从上面的两个trait继承
//关键字:  extends ... with
class Student6(var id:Int,var name:String) extends Human with Action{

  //实现Action中的getActionName
  def getActionName():String = "Action is Running"
}

class Demo4 {
  def main(args: Array[String]): Unit = {
    var s6 = new Student6(1,"Tom")
    println(s6.sayHello())
    println(s6.getActionName())
  }
}
