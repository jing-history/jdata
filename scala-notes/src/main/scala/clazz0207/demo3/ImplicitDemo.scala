package clazz0207.demo3

//水果
class Fruit(name:String){
  def getFruitName():String = {name}
}

//猴子：Monkey
class Monkey(f:Fruit){
  def say() = {println("Monkey like " + f.getFruitName() ) }
}

object ImplicitDemo {
  //定义一个隐式转换函数（规则）： Fruit对象 ===> Monkey对象
  implicit def fruit2Monkey(f:Fruit):Monkey = {new Monkey(f)}

  def main(args: Array[String]): Unit = {
    //创建一个水果的对象
    var f:Fruit = new Fruit("香蕉")
    //希望：直接调用 f.say()方法？？？
    //问题：将Fruit的对象 转换成 Monkey对象？
    f.say()
  }
}
