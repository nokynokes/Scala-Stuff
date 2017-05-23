def kthElement(k: Int, list: List[Int]): Int = {
	def loop(index: Int, ls: List[Int]): Int = {
		ls match {
			case Nil => 0
			case h :: t => if(index == 0) h else loop(index-1,t)
		}
	}
	k match {
		case 0 => list(0)
		case x if x > 0 => loop(k-1,list)
		//case _ => throw IllegalArgumentException
	}
	
}

println(kthElement(6, List(1, 1, 2, 3, 5, 8)))
