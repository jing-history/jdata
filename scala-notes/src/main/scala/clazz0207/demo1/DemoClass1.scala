package clazz0207.demo1

//Scala的协变: 一个泛型类接收的泛型参数的值可以是本身的类型或者是子类的类型
//             在泛型前  +

//动物
class Animal{}

//子类：鸟
class Bird extends Animal

//子类：麻雀
class Sparrow extends Bird

//类：吃东西（动作）
class EatSomething[+T](t:T){}

class DemoClass1 {
  def main(args: Array[String]): Unit = {
    //创建一个鸟吃东西的对象
    var c1:EatSomething[Bird] = new EatSomething[Bird](new Bird)
    //创建一个动物吃东西的对象
    //var c2:EatSomething[Animal] = new EatSomething[Animal](new Animal)
    var c2:EatSomething[Animal] = c1

    //再举个例子
    var c3:EatSomething[Sparrow] = new EatSomething[Sparrow](new Sparrow)
    var c4:EatSomething[Animal] = c3
  }
}
