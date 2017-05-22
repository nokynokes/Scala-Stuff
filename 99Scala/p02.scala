

	def penultimate(ls: List[Int]): Int = ls match {
		case h :: _ :: Nil => h
		case _ :: tail => penultimate(tail)
		case Nil => ???
	}

	println(penultimate(List(1, 1, 2, 3, 5, 8)))
