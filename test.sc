def prime(n: Int): Boolean = {
   !(2 until  n exists  (n%_ == 0))
}

prime(8)