//使用样本类支持模式匹配: 类似: instanceof

class Vehicle

case class Car(name:String) extends Vehicle
case class Bike(name:String) extends Vehicle
//定义一个Car对象
var aCar:Vehicle = new Car("这是汽车")
aCar match {
  case Car(name) => println("这是一辆汽车")
  case Bike(name)=> println("这是一辆自行车")
  case _ => println("其他类型")
}


//创建一个函数，功能：创建一个Int类型的数组
def mkIntArray(elems:Int*) = Array[Int](elems:_*)
mkIntArray(1,2,3,4,5)

//创建一个函数，功能：创建一个String类型的数组
def mkStringArray(elems:String*) = Array[String](elems:_*)
mkStringArray("Tom","Mary","Mike")

//问题：能否创建一个通用的函数，既能创建Int类型数组，也能创建String类型的数组
//在泛型函数中：T有要求：必须是ClassTag类型
import scala.reflect.ClassTag
def mkArray[T:ClassTag](elems:T*) = Array[T](elems:_*)
mkArray(1,2,3,4,5)
mkArray("Tom","Mary","Mike")