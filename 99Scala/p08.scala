def pack(list: List[Any]): List[Any] = {
	def loop(l: List[Any], f: List[Any] => List[Any]): List[Any] = l match {
		case Nil => f(Nil)
		case h :: t => loop(t, 
			acc => acc match {
				case Nil => f(h :: acc)
				case h1 :: t1 => if (h == h1) f(acc) else f(h :: acc)
			})
	}
	loop(list, acc => acc)
}
println(pack(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')))

