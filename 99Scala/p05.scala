import scala.collection.immutable.List

def reverseList(list: List[Int]): List[Int] = {
	list.foldLeft(Nil: List[Int]){
		(acc, h) => h :: acc 
	}
}

println(reverseList(List(1,2,3,4)))
