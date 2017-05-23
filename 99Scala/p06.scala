import scala.collection.immutable.List

def isPalindrome(list: List[Int]): Boolean = {
	val listp = list.foldLeft(Nil: List[Int]){
		(acc, h) => h :: acc 
	}
	list == listp
}

println(isPalindrome(List(1,2,3,2,1)))