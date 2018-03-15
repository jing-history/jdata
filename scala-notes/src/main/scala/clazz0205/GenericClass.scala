package clazz0205

class GenericClass[T] {
  //定义一个变量
  private var content:T = _

  //定义get和set方法
  def set(value:T) = {content = value}
  def get():T = {content}
}

object GenericClass{
  def main(args: Array[String]): Unit = {
    //操作Int
    var intGeneric = new GenericClass[Int]
    intGeneric.set(123)
    println("得到的值:" + intGeneric.get())

    //操作String
    var stringGeneric = new GenericClass[String]
    stringGeneric.set("Hello Scala")
    println("得到的值:" + stringGeneric.get())
  }
}
