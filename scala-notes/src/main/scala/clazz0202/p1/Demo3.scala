package clazz0202.p1

//父类：抽象
abstract class Person{
  //就是一个抽象字段
  var id:Int
  var name:String
}

abstract class Employee1 extends Person{
  //var id:Int = 1
  var name:String = "No Name"
}

//另一种做法: 定义一个主构造器，在主构造器中，提供抽象字段
class Employee2(var id:Int) extends Person{
  //只提供name
  var name:String = "No Name"
}

class Demo3 {

}
