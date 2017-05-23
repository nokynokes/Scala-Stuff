
def slice(start: Int, end: Int, list: List[Any]): List[Any] = {
	def loop(l: List[Any], s: Int, e: Int)(f: List[Any] => List[Any]): List[Any] = l match {
		case Nil => f(Nil)
		case h :: t => (s,e) match {
			case (0,0) => f(h :: Nil)
			case (0,y) if y > 0 => loop(t,0,y-1){acc => f(h :: acc)}
			case (x,_) if x > 0  => loop(t, x-1, e-1)(f)
			
		} 
		
	}
	loop(list, start, end)(acc => acc)
}

println(slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))