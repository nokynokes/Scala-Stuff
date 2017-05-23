def pack(list: List[Any]): List[List[Any]] = {
	def loop(l: List[Any], f: List[List[Any]] => List[List[Any]]): List[List[Any]] = l match {
		case Nil => f(Nil)
		case h :: t => loop(t, { 
				case Nil => f(List(List(h)))
				case h1 @ (hi :: ti) => 
					if (hi contains h) f((h :: hi) :: ti)
					else f(List(h) :: h1)

			})

	}
	loop(list, acc => acc)
}






println(pack(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))