def encode(list: List[Any]): List[(Int,Any)] = {
	def loop(l: List[Any], f: List[(Int,Any)] => List[(Int,Any)]): List[(Int,Any)] = l match {
		case Nil => f(Nil)
		case h :: t => loop(t, {
				case Nil => f(List((1,h)))
				case hi @ ((count, char) :: ti) =>
					if(h == char) f((count + 1, char) :: ti)
					else f((1,h) :: hi)
			})
	}
	loop(list, acc => acc)
}


println(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))