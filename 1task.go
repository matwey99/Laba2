package main

import (
	"fmt"
	"strings"
)

func CyclicShift(S, T string) bool {
	if len(S) != len(T) {
		return false
	}
	doubled := S + S
	return strings.Contains(doubled, T)
}

func main() {
	var S, T string

	fmt.Println("S:")
	fmt.Scan(&S)

	fmt.Println("T:")
	fmt.Scan(&T)

	if CyclicShift(S, T) {
		fmt.Println("Yes")
	} else {
		fmt.Println("No")
	}
}