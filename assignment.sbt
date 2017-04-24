course := "progfun1"
assignment := "objsets"


def prime(n: Int): Boolean = {
  1 to n forall(n%_ == 0)
}

prime(7)