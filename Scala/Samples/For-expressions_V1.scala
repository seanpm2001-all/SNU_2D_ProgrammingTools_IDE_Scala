val s = for (x <- 1 to 25 if x*x > 50) yield 2*x
// Vector(16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50)
