def flatten(list: List[Any]): List[Any] = {
	def loop(f: List[Any] => List[Any], l: List[Any]): List[Any] = {
		l match {
			case Nil => f(Nil)
			case (h: List[Any]) :: t => loop(acc => f(flatten(h) ::: acc) ,t)
			case h :: t => loop(acc => f(h :: acc), t)
		}
	}
	loop( acc => acc , list)
}
println(flatten(List(List(List(List(1),1),1),List(List(List(1),1),1))))








