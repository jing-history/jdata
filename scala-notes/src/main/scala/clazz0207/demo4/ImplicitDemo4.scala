package clazz0207.demo4

/*
隐式类的功能：对类的功能进行加强
顺序：
第一步：先调用隐式转换类，把  1  ===> Calc对象
第二步：调用Calc对象的add方法
 */
object ImplicitDemo4 {
  //定义一个隐式类
  implicit class Calc(x:Int){
    def add(y:Int) = x + y
  }

  def main(args: Array[String]): Unit = {
    //进行两个数的相加  1.add(2)
    println("两个数字的和是：" + 1.add(2))
  }
}
