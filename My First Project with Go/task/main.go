package main

import "fmt"

func main() {
	fmt.Println("Earned amount:")
	bubblegum := 202
	toffee := 118
	iceCream := 2250
	milkChocolate := 1680
	doughnut := 1075
	pancake := 80
	fmt.Printf("Bubblegum: $%d\n", bubblegum)
	fmt.Printf("Toffee: $%d\n", toffee)
	fmt.Printf("Ice cream: $%d\n", iceCream)
	fmt.Printf("Milk chocolate: $%d\n", milkChocolate)
	fmt.Printf("Doughnut: $%d\n", doughnut)
	fmt.Printf("Pancake: $%d\n", pancake)
	fmt.Println()
	total := bubblegum + toffee + iceCream + milkChocolate + doughnut + pancake
	fmt.Printf("Income: $%d\n", total)

	var staffExpenses, otherExpenses int
	fmt.Println("Staff expenses:")
	_, _ = fmt.Scan(&staffExpenses)
	fmt.Println("Other expenses:")
	_, _ = fmt.Scan(&otherExpenses)

	net := total - staffExpenses - otherExpenses
	fmt.Printf("Net income: $%d\n", net)
}
