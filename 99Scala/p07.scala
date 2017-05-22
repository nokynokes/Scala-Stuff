def flatten(list: List[Any]): List[Any] = {
	def loop(acc: List[Any], l: List[Any]): List[Any] = {
		l match {
			case Nil => acc
			case h :: t => h match {
				case h: List[Any] => 
					val hp = flatten(h)
					loop(hp ::: acc, t)
				case _: Any => loop(h :: acc, t)
			}

		}
	}
	loop(Nil: List[Any], list.reverse)
}

println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))))