package clazz0202

class Student1 {
    //定义属性
  private var stuName:String = "Tom"
  private var stuAge:Int = 20

  //定义方法（函数）
  def getStuName():String = stuName
  def setStuName(newName:String) = this.stuName = newName

  def getStuAge():Int = stuAge
  def setStuAge(newAge:Int) = this.stuAge = newAge
}

//开发一个测试程序，创建学生对象
// Java: public static void main()******
//概念：objec对象可以跟类名不一样，如果一样，这个object对象就是该类的伴生对象
object Student1{
  def main(args: Array[String]): Unit = {
    //创建学生对象
    var s1 = new Student1

    //第一次输出
    println(s1.getStuName()+"\t" + s1.getStuAge())

    //调用set方法
    s1.setStuName("Mary")
    s1.setStuAge(25)

    //第二次输出
    println(s1.getStuName()+"\t" + s1.getStuAge())

    //第三次输出: 直接访问类的私有成员
    //问题：为什么可以直接访问类的私有成员？？？ ----> 讨论：属性的set和get方法
    println(s1.stuName + "\t" + s1.stuAge)
  }
}
