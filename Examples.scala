object Examples {
  def main(args: Array[String]): Unit = {
    // Lambda Example
    val double = (x: Int) => x * 2
    println("Lambda Example:")
    println(s"double(5) = ${double(5)}") // Output: 10
    println()

    // Map Examples
    val numbers = List(1, 2, 3, 4)
    val squared = numbers.map(x => x * x)
    println("Map Example 1 - Squaring Numbers:")
    println(s"Original numbers: $numbers")
    println(s"Squared numbers: $squared") // Output: List(1, 4, 9, 16)
    println()

    case class User(name: String, age: Int)
    val users = List(User("Alice", 25), User("Bob", 30), User("Charlie", 35))
    val names = users.map(user => user.name)
    println("Map Example 2 - Processing User Data:")
    println(s"Users: $users")
    println(s"Names: $names") // Output: List(Alice, Bob, Charlie)
    println()

    // Filter Examples
    val numbersOneToTen = (1 to 10).toList
    val evens = numbersOneToTen.filter(_ % 2 == 0)
    println("Filter Example 1 - Filtering Even Numbers:")
    println(s"Numbers 1 to 10: $numbersOneToTen")
    println(s"Even numbers: $evens") // Output: List(2, 4, 6, 8, 10)
    println()
    
    val lazyEvens = numbersOneToTen.view.filter(_ % 2 == 0).toList
    println("Filter Example with view - Lazy Filtering:")
    println(s"Lazy even numbers: $lazyEvens") // Output: List(2, 4, 6, 8, 10)
    println()

    case class UserWithStatus(name: String, isActive: Boolean)
    val usersWithStatus = List(
      UserWithStatus("Alice", true), 
      UserWithStatus("Bob", false), 
      UserWithStatus("Charlie", true)
    )
    val activeUsers = usersWithStatus.filter(_.isActive)
    println("Filter Example 2 - Filtering Active Users:")
    println(s"All users: $usersWithStatus")
    println(s"Active users: $activeUsers") // Output: List(User(Alice, true), User(Charlie, true))
    println()

    // Fold Examples
    val product = numbers.foldRight(1)(_ * _)
    println("Fold Example 1 - Multiplying a List of Numbers:")
    println(s"Numbers: $numbers")
    println(s"Product using foldRight: $product") // Output: 24
    println()

    case class Employee(name: String, salary: Double)
    val employees = List(
      Employee("Alice", 50000), 
      Employee("Bob", 60000), 
      Employee("Charlie", 70000)
    )
    val totalSalary = employees.foldLeft(0.0)((acc, emp) => acc + emp.salary)
    println("Fold Example 2 - Calculating Total Salary:")
    println(s"Employees: $employees")
    println(s"Total salary: $totalSalary") // Output: 180000.0
    println()

    // Combined Example
    val numbersOneThroughSix = List(1, 2, 3, 4, 5, 6)
    val result = numbersOneThroughSix
      .filter((x: Int) => x % 2 == 0)    // Filter even numbers
      .map((x: Int) => x * x)            // Square each number
      .foldLeft(0)((acc, x) => acc + x)  // Sum the results
    println("Combined Example - Filter, Map, and FoldLeft:")
    println(s"Numbers: $numbersOneThroughSix")
    println(s"Result of filtering evens, squaring, and summing: $result") // Output: 56
  }
}